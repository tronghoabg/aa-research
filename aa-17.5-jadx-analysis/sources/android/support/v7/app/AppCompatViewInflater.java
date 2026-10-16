package android.support.v7.app;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import defpackage.aat;
import defpackage.iv;
import defpackage.ix;
import defpackage.iy;
import defpackage.jj;
import defpackage.ka;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public class AppCompatViewInflater {
    public final Object[] f = new Object[2];
    private static final Class[] g = {Context.class, AttributeSet.class};
    public static final int[] a = {R.attr.onClick};
    public static final int[] b = {R.attr.accessibilityHeading};
    public static final int[] c = {R.attr.accessibilityPaneTitle};
    public static final int[] d = {R.attr.screenReaderFocusable};
    public static final String[] e = {"android.widget.", "android.view.", "android.webkit."};
    private static final aat h = new aat(0);

    public iv a(Context context, AttributeSet attributeSet) {
        return new iv(context, attributeSet);
    }

    public ix b(Context context, AttributeSet attributeSet) {
        return new ix(context, attributeSet);
    }

    public iy c(Context context, AttributeSet attributeSet) {
        return new iy(context, attributeSet);
    }

    public jj d(Context context, AttributeSet attributeSet) {
        return new jj(context, attributeSet);
    }

    public ka e(Context context, AttributeSet attributeSet) {
        return new ka(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) throws InflateException, NoSuchMethodException, SecurityException, ClassNotFoundException {
        String str3;
        aat aatVar = h;
        Constructor constructor = (Constructor) aatVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(g);
            aatVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f);
    }
}
