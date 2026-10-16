package defpackage;

import androidx.car.app.hardware.common.CarValue;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class sf {
    public Object a;

    public sf(String str) {
        this.a = new HashMap();
        for (String str2 : str.split(";")) {
            String[] strArrSplit = str2.split(":");
            if (strArrSplit.length == 2) {
                ((HashMap) this.a).put(strArrSplit[0], strArrSplit[1]);
            }
        }
    }

    public final void a(int i) {
        this.a = Integer.valueOf(i | (-16777216));
    }

    public final sm b() {
        return new sm(this.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final synchronized void c() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ubf) it.next()).x(128);
        }
        this.a = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, ubf] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void d(udt udtVar) {
        c();
        Iterator it = yeb.a(udtVar.b, yeb.d(udtVar.c).e(new txa(8))).iterator();
        while (it.hasNext()) {
            ?? B = ((udo) it.next()).c.b();
            B.w(128);
            this.a.add(B);
        }
    }

    public final String e(String str) {
        return (String) ((HashMap) this.a).get(str);
    }

    public sf() {
        this.a = CarValue.UNKNOWN_INTEGER;
    }

    public sf(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new ArrayList();
    }

    public sf(SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.d = SwipeDismissBehavior.K(0.1f);
        swipeDismissBehavior.e = SwipeDismissBehavior.K(0.6f);
        swipeDismissBehavior.c = 0;
    }

    public sf(byte[] bArr) {
    }
}
