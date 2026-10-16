package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wud {
    public static final int[] a = {android.R.attr.state_pressed};
    public static final int[] b = {android.R.attr.state_focused};
    public static final int[] c = {android.R.attr.state_selected, android.R.attr.state_pressed};
    public static final int[] d = {android.R.attr.state_selected};

    private wud() {
    }

    public static int a(android.content.res.ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        int iAlpha = android.graphics.Color.alpha(colorForState);
        return defpackage.dvk.e(colorForState, java.lang.Math.min(iAlpha + iAlpha, 255));
    }

    public static android.content.res.ColorStateList b(android.content.res.ColorStateList colorStateList) {
        return colorStateList != null ? colorStateList : android.content.res.ColorStateList.valueOf(0);
    }
}
