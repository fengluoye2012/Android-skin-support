package skin.support.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

//根据情况选择适用context
public interface SkinWrapper {
    Context wrapContext(Context context, View parent, AttributeSet attrs);
}
