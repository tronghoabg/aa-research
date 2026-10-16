package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.database.SQLException;
import android.os.Bundle;
import android.view.PointerIcon;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class dan {
    public static final PointerIcon a(Context context, cqr cqrVar) {
        return cqrVar instanceof cqb ? PointerIcon.getSystemIcon(context, ((cqb) cqrVar).a) : PointerIcon.getSystemIcon(context, 1000);
    }

    public static final void b(View view, cqr cqrVar) {
        PointerIcon pointerIconA = a(view.getContext(), cqrVar);
        if (affa.f(view.getPointerIcon(), pointerIconA)) {
            return;
        }
        view.setPointerIcon(pointerIconA);
    }

    public static final deu c(ddu dduVar) {
        ddr ddrVar = dduVar.b;
        deu deuVar = (deu) ddrVar.g(ddx.H);
        List list = (List) ddrVar.g(ddx.D);
        return deuVar == null ? list != null ? (deu) woy.bH(list) : null : deuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String d(defpackage.ddu r7, android.content.res.Resources r8) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dan.d(ddu, android.content.res.Resources):java.lang.String");
    }

    public static final boolean e(ddu dduVar) {
        return !dduVar.g().f(ddx.j);
    }

    public static final boolean f(ddu dduVar) {
        ddr ddrVar = dduVar.b;
        dem demVar = (dem) ddrVar.g(ddx.M);
        ddo ddoVar = (ddo) ddrVar.g(ddx.A);
        Boolean bool = (Boolean) ddrVar.g(ddx.L);
        boolean z = demVar != null;
        if (bool != null) {
            bool.booleanValue();
            if (ddoVar == null || ddoVar.a != 4) {
                return true;
            }
        }
        return z;
    }

    public static final boolean g(ddu dduVar) {
        return dduVar.a.s == dlr.b;
    }

    public static final boolean h(ddu dduVar, Resources resources, boolean z) {
        if (ddv.a(dduVar) || z) {
            return false;
        }
        ddr ddrVar = dduVar.b;
        if (ddrVar.a) {
            return true;
        }
        List list = (List) ddrVar.g(ddx.a);
        return !((list != null ? (String) woy.bH(list) : null) == null && c(dduVar) == null && d(dduVar, resources) == null && !f(dduVar)) && i(dduVar);
    }

    public static final boolean i(ddu dduVar) {
        if (dduVar.j()) {
            return false;
        }
        List listK = dduVar.k((4 & 1) != 0 ? !dduVar.e : false, true & ((4 & 2) == 0));
        int size = listK.size();
        for (int i = 0; i < size; i++) {
            if (!vs.k((ddu) listK.get(i))) {
                return false;
            }
        }
        cxb cxbVarL = dduVar.a.l();
        while (true) {
            if (cxbVarL == null) {
                cxbVarL = null;
                break;
            }
            ddr ddrVarR = cxbVarL.r();
            if (ddrVarR != null && ddrVarR.a) {
                break;
            }
            cxbVarL = cxbVarL.l();
        }
        return cxbVarL == null;
    }

    public static final void j(fca fcaVar, String str) {
        fbk fbkVarA = fcaVar.a(str);
        try {
            fbkVarA.k();
            affa.m(fbkVarA, null);
        } finally {
        }
    }

    public static final void k(int i, String str) {
        throw new SQLException(a.bp(i, "Error code: ").concat(", message: ".concat(str)));
    }

    public static final ArrayList l(Collection collection) {
        return collection instanceof ArrayList ? (ArrayList) collection : new ArrayList(collection);
    }

    public static final int m(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        int iM = 1;
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            iM = (iM * 31) + (obj instanceof Bundle ? m((Bundle) obj) : obj instanceof Object[] ? Arrays.deepHashCode((Object[]) obj) : obj instanceof byte[] ? Arrays.hashCode((byte[]) obj) : obj instanceof short[] ? Arrays.hashCode((short[]) obj) : obj instanceof int[] ? Arrays.hashCode((int[]) obj) : obj instanceof long[] ? Arrays.hashCode((long[]) obj) : obj instanceof float[] ? Arrays.hashCode((float[]) obj) : obj instanceof double[] ? Arrays.hashCode((double[]) obj) : obj instanceof char[] ? Arrays.hashCode((char[]) obj) : obj instanceof boolean[] ? Arrays.hashCode((boolean[]) obj) : obj != null ? obj.hashCode() : 0);
        }
        return iM;
    }

    public static final boolean n(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj != obj2 && !affa.f(obj, obj2)) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                        if (!n((Bundle) obj, (Bundle) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                        if (!woy.cC((Object[]) obj, (Object[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                        if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                        if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                        if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                        if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                        if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                        if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                        if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (!affa.f(obj, obj2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }
}
