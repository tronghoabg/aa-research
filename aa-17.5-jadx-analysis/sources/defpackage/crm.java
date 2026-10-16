package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class crm extends cfx implements cqz, dlg, cys {
    public Object a;
    public Object b;
    public PointerInputEventHandler c;
    public cql d = crh.a;
    public final byw e;
    public final Object f;
    public long g;
    private aivh h;
    private final byw i;
    private cql j;

    public crm(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.a = obj;
        this.b = obj2;
        this.c = pointerInputEventHandler;
        byw bywVar = new byw(new crl[16]);
        this.e = bywVar;
        this.f = bywVar;
        this.i = new byw(new crl[16]);
        this.g = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:6:0x000d, B:13:0x001a, B:14:0x001f, B:15:0x0020, B:18:0x002d, B:19:0x0037, B:21:0x0040), top: B:31:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void v(defpackage.cql r5, defpackage.cqm r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f
            monitor-enter(r0)
            byw r1 = r4.i     // Catch: java.lang.Throwable -> L57
            byw r2 = r4.e     // Catch: java.lang.Throwable -> L57
            int r3 = r1.b     // Catch: java.lang.Throwable -> L57
            r1.o(r3, r2)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r0)
            int r0 = r6.ordinal()     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L37
            r1 = 1
            if (r0 == r1) goto L20
            r1 = 2
            if (r0 != r1) goto L1a
            goto L37
        L1a:
            aezs r5 = new aezs     // Catch: java.lang.Throwable -> L50
            r5.<init>()     // Catch: java.lang.Throwable -> L50
            throw r5     // Catch: java.lang.Throwable -> L50
        L20:
            byw r0 = r4.i     // Catch: java.lang.Throwable -> L50
            int r1 = r0.b     // Catch: java.lang.Throwable -> L50
            int r1 = r1 + (-1)
            java.lang.Object[] r0 = r0.a     // Catch: java.lang.Throwable -> L50
            int r2 = r0.length     // Catch: java.lang.Throwable -> L50
            if (r1 >= r2) goto L4a
        L2b:
            if (r1 < 0) goto L4a
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L50
            crl r2 = (defpackage.crl) r2     // Catch: java.lang.Throwable -> L50
            r2.v(r5, r6)     // Catch: java.lang.Throwable -> L50
            int r1 = r1 + (-1)
            goto L2b
        L37:
            byw r0 = r4.i     // Catch: java.lang.Throwable -> L50
            java.lang.Object[] r1 = r0.a     // Catch: java.lang.Throwable -> L50
            int r0 = r0.b     // Catch: java.lang.Throwable -> L50
            r2 = 0
        L3e:
            if (r2 >= r0) goto L4a
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L50
            crl r3 = (defpackage.crl) r3     // Catch: java.lang.Throwable -> L50
            r3.v(r5, r6)     // Catch: java.lang.Throwable -> L50
            int r2 = r2 + 1
            goto L3e
        L4a:
            byw r4 = r4.i
            r4.g()
            return
        L50:
            r5 = move-exception
            byw r4 = r4.i
            r4.g()
            throw r5
        L57:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crm.v(cql, cqm):void");
    }

    @Override // defpackage.cys
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // defpackage.dlg
    public final float a() {
        return bzi.q(this).r.a();
    }

    @Override // defpackage.dlm
    public final float b() {
        return bzi.q(this).r.b();
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float eA(float f) {
        return f * a();
    }

    @Override // defpackage.dlg
    public final /* synthetic */ int eE(long j) {
        throw null;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ int eF(float f) {
        return dlf.l(this, f);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eG(long j) {
        return dlf.m(this, j);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eH(long j) {
        return dlf.n(this, j);
    }

    @Override // defpackage.dlm
    public final /* synthetic */ long eI(float f) {
        return dln.d(this, f);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eJ(float f) {
        return dln.d(this, (f / a()) + BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.cys
    public final /* synthetic */ long eq() {
        return ty.c(0, 0, 0, 0);
    }

    @Override // defpackage.dlm
    public final /* synthetic */ float ew(long j) {
        return dln.c(this, j);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ex(float f) {
        return (f / a()) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ey(int i) {
        return (i / a()) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ez(long j) {
        return dlf.k(this, j);
    }

    @Override // defpackage.cqz
    public final dcc n() {
        return bzi.q(this).t;
    }

    @Override // defpackage.cys
    public final void o() {
        cql cqlVar = this.j;
        if (cqlVar == null) {
            return;
        }
        List list = cqlVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((cqu) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    cqu cquVar = (cqu) list.get(i2);
                    long j = cquVar.a;
                    long j2 = cquVar.c;
                    long j3 = cquVar.b;
                    float f = cquVar.e;
                    boolean z = cquVar.d;
                    arrayList.add(new cqu(j, j3, j2, false, f, j3, j2, z, z, cquVar.i, 0L, 1.0f, 0L));
                }
                cql cqlVar2 = new cql(arrayList, null);
                this.d = cqlVar2;
                v(cqlVar2, cqm.a);
                v(cqlVar2, cqm.b);
                v(cqlVar2, cqm.c);
                this.j = null;
                return;
            }
        }
    }

    @Override // defpackage.cfx
    /* renamed from: p */
    public final void t() {
        u();
    }

    @Override // defpackage.cfx
    public final void q() {
        u();
    }

    @Override // defpackage.cqz
    public final Object r(afeg afegVar, afck afckVar) {
        aitg aitgVar = new aitg(affa.s(afckVar), 1);
        aitgVar.z();
        crl crlVar = new crl(this, aitgVar);
        synchronized (this.f) {
            this.e.n(crlVar);
            new afcq(affa.s(affa.r(afegVar, crlVar, crlVar)), afcr.a).w(afak.a);
        }
        aitgVar.d(new dmz(crlVar, 1));
        return aitgVar.k();
    }

    @Override // defpackage.cys
    public final void s(cql cqlVar, cqm cqmVar, long j) {
        this.g = j;
        if (cqmVar == cqm.a) {
            this.d = cqlVar;
        }
        if (this.h == null) {
            this.h = ahnc.d(N(), null, 4, new btm(this, (afck) null, 2), 1);
        }
        v(cqlVar, cqmVar);
        List list = cqlVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                cqlVar = null;
                break;
            } else if (!tl.m((cqu) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.j = cqlVar;
    }

    @Override // defpackage.cys
    public final void t() {
        u();
    }

    public final void u() {
        aivh aivhVar = this.h;
        if (aivhVar != null) {
            aivhVar.s(new cqy());
            this.h = null;
        }
    }

    @Override // defpackage.cys
    public final /* synthetic */ void E() {
    }
}
