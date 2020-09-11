package skin.support.observe;

import java.util.ArrayList;

/**
 * 观察者模式  被观察者
 */
public class SkinObservable {
    private final ArrayList<SkinObserver> observers;

    public SkinObservable() {
        observers = new ArrayList<>();
    }

    //排重；
    public synchronized void addObserver(SkinObserver o) {
        if (o == null) {
            throw new NullPointerException();
        }
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    public synchronized void deleteObserver(SkinObserver o) {
        observers.remove(o);
    }

    public void notifyUpdateSkin() {
        notifyUpdateSkin(null);
    }

    //通知观察者
    public void notifyUpdateSkin(Object arg) {
        SkinObserver[] arrLocal;

        synchronized (this) {
            arrLocal = observers.toArray(new SkinObserver[observers.size()]);
        }

        for (int i = arrLocal.length-1; i>=0; i--) {
            arrLocal[i].updateSkin(this, arg);
        }
    }

    public synchronized void deleteObservers() {
        observers.clear();
    }

    public synchronized int countObservers() {
        return observers.size();
    }
}
