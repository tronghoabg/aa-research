package com.waze.c.c;

import android.graphics.PorterDuff;
import com.waze.alerters.AlerterNativeManager;
import com.waze.alerters.a.u;
import com.waze.app_nav.hub.ag;
import com.waze.c.d.am;
import com.waze.c.d.an;
import com.waze.c.d.as;
import com.waze.car_lib.n.s;
import com.waze.car_lib.n.t;
import com.waze.car_lib.n.v;
import com.waze.car_lib.o.ae;
import com.waze.jni.protos.alerters.NativeAlertRepositoryUpdate;
import com.waze.search.stats.SearchStatsSender$SearchCategoryGroup;
import com.waze.search.stats.o;
import com.waze.search.stats.p;
import com.waze.search.v2.gb;
import com.waze.stats.ax;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.i;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Queue;
import kotlinx.coroutines.b.k;
import sun.misc.Unsafe;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class e {
    public /* synthetic */ e(byte[] bArr) {
    }

    static /* synthetic */ am a(org.a.d.k.b bVar, org.a.d.h.a aVar) {
        x.f(bVar, "$this$factory");
        x.f(aVar, "it");
        int i2 = ar.f48106a;
        return new an((ax) bVar.a(new m(ax.class), null, null), (as) bVar.a(new m(as.class), null, null), (com.waze.shared_infra.q.e) bVar.a(new m(com.waze.shared_infra.q.e.class), null, null));
    }

    public static /* synthetic */ boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static /* synthetic */ String c(int i2) {
        switch (i2) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            default:
                return "END_DOCUMENT";
        }
    }

    public static /* synthetic */ String d(com.google.firebase.e eVar) {
        String strD = eVar.d().d();
        if (strD != null) {
            return strD;
        }
        String strC = eVar.d().c();
        if (!strC.startsWith("1:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static /* synthetic */ byte[] e(Queue queue, int i2) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i2) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
        int i3 = i2 - length;
        while (i3 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(i3, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i2 - i3, iMin);
            i3 -= iMin;
        }
        return bArrCopyOf;
    }

    public static /* synthetic */ void f(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static /* synthetic */ Unsafe g() throws IllegalAccessException, IllegalArgumentException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    public static /* synthetic */ PorterDuff.Mode h(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static k i() {
        k<NativeAlertRepositoryUpdate> nativeAlertsFlow = AlerterNativeManager.getInstance().getNativeAlertsFlow();
        x.e(nativeAlertsFlow, "getNativeAlertsFlow(...)");
        return new u(nativeAlertsFlow, 0);
    }

    public static ag j() {
        return new ag(ag.f15248b.incrementAndGet());
    }

    public static SearchStatsSender$SearchCategoryGroup l(v vVar) {
        x.f(vVar, "<this>");
        String strI = ae.i(vVar);
        if (strI != null) {
            return gb.l(strI);
        }
        return null;
    }

    public static o m(v vVar) {
        o oVar;
        x.f(vVar, "<this>");
        t tVar = vVar instanceof t ? (t) vVar : null;
        if (tVar != null) {
            s sVarA = tVar.a();
            s sVar = s.f20432a;
            int iOrdinal = sVarA.ordinal();
            if (iOrdinal == 0) {
                oVar = o.f36079b;
            } else if (iOrdinal == 1) {
                oVar = o.f36080c;
            } else {
                if (iOrdinal != 2) {
                    throw new i();
                }
                oVar = o.f36078a;
            }
            if (oVar != null) {
                return oVar;
            }
        }
        return o.f36078a;
    }

    public static p n(v vVar) {
        x.f(vVar, "<this>");
        if (vVar instanceof t) {
            return p.f36082a;
        }
        if (vVar instanceof com.waze.car_lib.n.u) {
            return p.f36083b;
        }
        throw new i();
    }

    private e() {
        throw null;
    }
}
