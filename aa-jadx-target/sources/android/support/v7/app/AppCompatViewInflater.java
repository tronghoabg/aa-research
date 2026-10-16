package android.support.v7.app;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class AppCompatViewInflater {
    public final java.lang.Object[] f = new java.lang.Object[2];
    private static final java.lang.Class[] g = {android.content.Context.class, android.util.AttributeSet.class};
    public static final int[] a = {android.R.attr.onClick};
    public static final int[] b = {android.R.attr.accessibilityHeading};
    public static final int[] c = {android.R.attr.accessibilityPaneTitle};
    public static final int[] d = {android.R.attr.screenReaderFocusable};
    public static final java.lang.String[] e = {"android.widget.", "android.view.", "android.webkit."};
    private static final defpackage.aba h = new defpackage.aba(0);

    public iw a(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new iw(context, attributeSet);
    }

    public defpackage.iy b(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new defpackage.iy(context, attributeSet);
    }

    public iz c(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new iz(context, attributeSet);
    }

    public jk d(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new jk(context, attributeSet);
    }

    public defpackage.kb e(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new defpackage.kb(context, attributeSet);
    }

    public final android.view.View f(android.content.Context context, java.lang.String str, java.lang.String str2) throws android.view.InflateException, java.lang.ClassNotFoundException {
        java.lang.String str3;
        defpackage.aba abaVar = h;
        java.lang.reflect.Constructor constructor = (java.lang.reflect.Constructor) abaVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (java.lang.Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = java.lang.Class.forName(str3, false, context.getClassLoader()).asSubclass(android.view.View.class).getConstructor(g);
            abaVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (android.view.View) constructor.newInstance(this.f);
    }
}
