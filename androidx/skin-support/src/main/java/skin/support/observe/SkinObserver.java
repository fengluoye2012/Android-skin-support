package skin.support.observe;

/**
 * 通知观察者刷新
 */
public interface SkinObserver {
    void updateSkin(SkinObservable observable, Object o);
}
