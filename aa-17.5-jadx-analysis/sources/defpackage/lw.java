package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class lw {
    public izj a = null;
    private final ArrayList b = new ArrayList();

    public static void i(mo moVar) {
        int i = moVar.j;
        if (!moVar.t() && (i & 4) == 0) {
            int i2 = moVar.d;
            moVar.a();
        }
    }

    public static final etz n(mo moVar) {
        etz etzVar = new etz(null, null);
        etzVar.c(moVar);
        return etzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.mo r10) {
        /*
            r9 = this;
            izj r9 = r9.a
            if (r9 == 0) goto L97
            r0 = 1
            r10.n(r0)
            mo r1 = r10.h
            r2 = 0
            if (r1 == 0) goto L13
            mo r1 = r10.i
            if (r1 != 0) goto L13
            r10.h = r2
        L13:
            r10.i = r2
            int r1 = r10.j
            r1 = r1 & 16
            if (r1 == 0) goto L1d
            goto L97
        L1d:
            android.view.View r1 = r10.a
            java.lang.Object r2 = r9.a
            android.support.v7.widget.RecyclerView r2 = (android.support.v7.widget.RecyclerView) r2
            r2.ae()
            ke r3 = r2.h
            int r4 = r3.c
            r5 = 0
            if (r4 != r0) goto L3b
            android.view.View r0 = r3.d
            if (r0 != r1) goto L33
        L31:
            r0 = r5
            goto L66
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r9.<init>(r10)
            throw r9
        L3b:
            r6 = 2
            if (r4 == r6) goto L8f
            r3.c = r6     // Catch: java.lang.Throwable -> L8b
            izj r4 = r3.e     // Catch: java.lang.Throwable -> L8b
            int r6 = r4.x(r1)     // Catch: java.lang.Throwable -> L8b
            r7 = -1
            if (r6 != r7) goto L4f
            r3.l(r1)     // Catch: java.lang.Throwable -> L8b
            r3.c = r5
            goto L66
        L4f:
            kd r7 = r3.a     // Catch: java.lang.Throwable -> L8b
            boolean r8 = r7.f(r6)     // Catch: java.lang.Throwable -> L8b
            if (r8 == 0) goto L63
            r7.g(r6)     // Catch: java.lang.Throwable -> L8b
            r3.l(r1)     // Catch: java.lang.Throwable -> L8b
            r4.A(r6)     // Catch: java.lang.Throwable -> L8b
            r3.c = r5
            goto L66
        L63:
            r3.c = r5
            goto L31
        L66:
            if (r0 == 0) goto L74
            mo r1 = android.support.v7.widget.RecyclerView.k(r1)
            me r3 = r2.e
            r3.l(r1)
            r3.j(r1)
        L74:
            r1 = r0 ^ 1
            r2.af(r1)
            if (r0 != 0) goto L97
            boolean r0 = r10.x()
            if (r0 == 0) goto L97
            java.lang.Object r9 = r9.a
            android.view.View r10 = r10.a
            android.support.v7.widget.RecyclerView r9 = (android.support.v7.widget.RecyclerView) r9
            r9.removeDetachedView(r10, r5)
            return
        L8b:
            r9 = move-exception
            r3.c = r5
            throw r9
        L8f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r9.<init>(r10)
            throw r9
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw.a(mo):void");
    }

    public final void b() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ajmd) arrayList.get(i)).i();
        }
        arrayList.clear();
    }

    public abstract void c(mo moVar);

    public abstract void d();

    public abstract void e();

    public boolean f(mo moVar) {
        throw null;
    }

    public boolean g(mo moVar, List list) {
        throw null;
    }

    public abstract boolean h();

    public abstract boolean j(mo moVar, etz etzVar, etz etzVar2);

    public abstract boolean k(mo moVar, mo moVar2, etz etzVar, etz etzVar2);

    public abstract boolean l(mo moVar, etz etzVar, etz etzVar2);

    public abstract boolean m(mo moVar, etz etzVar, etz etzVar2);

    public final boolean o(ajmd ajmdVar) {
        boolean zH = h();
        if (ajmdVar != null) {
            if (!zH) {
                ajmdVar.i();
                return zH;
            }
            this.b.add(ajmdVar);
        }
        return zH;
    }
}
