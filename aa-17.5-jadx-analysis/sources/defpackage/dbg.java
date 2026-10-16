package defpackage;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class dbg {
    public static final /* synthetic */ int a = 0;
    private static final Class[] b = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(Object obj) {
        if (obj instanceof cel) {
            cel celVar = (cel) obj;
            if (celVar.f() != bxp.b && celVar.f() != bxp.c && celVar.f() != bxp.a) {
                return false;
            }
            Object objA = celVar.a();
            if (objA == null) {
                return true;
            }
            return a(objA);
        }
        if ((obj instanceof aezn) && (obj instanceof Serializable)) {
            return false;
        }
        Class[] clsArr = b;
        for (int i = 0; i < 7; i++) {
            if (clsArr[i].isInstance(obj)) {
                return true;
            }
        }
        return false;
    }
}
