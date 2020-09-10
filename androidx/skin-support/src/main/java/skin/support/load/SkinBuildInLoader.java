package skin.support.load;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

import skin.support.SkinCompatManager;
import skin.support.SkinCompatManager.SkinLoaderStrategy;
import skin.support.content.res.SkinCompatResources;

/**
 * app内不同文件夹资源文件加载策略
 */
public class SkinBuildInLoader implements SkinLoaderStrategy {
    @Override
    public String loadSkinInBackground(Context context, String skinName) {
        SkinCompatResources.getInstance().setupSkin(
                context.getResources(),
                context.getPackageName(),
                skinName,
                this);
        return skinName;
    }

    /**
     * 根据resId获取资源名称；res文件中的资源命名
     * @param context  {@link Context}
     * @param skinName 皮肤包名称.
     * @param resId    应用中需要换肤的资源ID.
     * @return
     */
    @Override
    public String getTargetResourceEntryName(Context context, String skinName, int resId) {
        return context.getResources().getResourceEntryName(resId) + "_" + skinName;
    }

    @Override
    public ColorStateList getColor(Context context, String skinName, int resId) {
        return null;
    }

    @Override
    public ColorStateList getColorStateList(Context context, String skinName, int resId) {
        return null;
    }

    @Override
    public Drawable getDrawable(Context context, String skinName, int resId) {
        return null;
    }

    @Override
    public int getType() {
        return SkinCompatManager.SKIN_LOADER_STRATEGY_BUILD_IN;
    }
}
