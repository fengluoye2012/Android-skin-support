package skin.support.widget;


/**
 * Created by ximsfei on 2017/1/13.
 */

public abstract class SkinCompatHelper {
    protected static final String SYSTEM_ID_PREFIX = "1";
    public static final int INVALID_ID = 0;

    final static public int checkResourceId(int resId) {
        String hexResId = Integer.toHexString(resId);
        return hexResId.startsWith(SYSTEM_ID_PREFIX) ? INVALID_ID : resId;
    }

    //执行换肤行为，根据上次加载resId 找到目标换肤包中对应的资源，加载
    abstract public void applySkin();
}
