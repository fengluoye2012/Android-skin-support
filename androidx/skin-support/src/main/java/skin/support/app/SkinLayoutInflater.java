package skin.support.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import skin.support.annotation.NonNull;

/**
 * 创建View，如SkinAppCompatViewInflater、SkinMaterialViewInflater、自定义View的LayoutInflater等；
 */
public interface SkinLayoutInflater {
    View createView(@NonNull Context context, final String name, @NonNull AttributeSet attrs);
}
