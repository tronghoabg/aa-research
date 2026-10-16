package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class ln extends lk implements ll {
    public static Method a;
    public ll b;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                a = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public ln(Context context, int i) {
        super(context, null, i);
    }

    @Override // defpackage.lk
    public final ks p(Context context, boolean z) {
        lm lmVar = new lm(context, z);
        lmVar.e = this;
        return lmVar;
    }
}
