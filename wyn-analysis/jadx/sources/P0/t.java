package p0;

import B.F;
import Ef.C0502n;
import Va.M6;
import d0.C2384c;
import ef.C2515C;
import java.util.ArrayList;
import java.util.List;
import jf.C3110j;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3464c;
import u0.InterfaceC4193p0;

/* loaded from: classes.dex */
public final class t extends n implements o, L0.b {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4193p0 f43178c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ L0.b f43179d;

    /* renamed from: e, reason: collision with root package name */
    public f f43180e;

    /* renamed from: f, reason: collision with root package name */
    public final P.d f43181f;

    /* renamed from: g, reason: collision with root package name */
    public final P.d f43182g;

    /* renamed from: h, reason: collision with root package name */
    public f f43183h;

    /* renamed from: i, reason: collision with root package name */
    public long f43184i;

    public t(InterfaceC4193p0 viewConfiguration, L0.b density) {
        AbstractC3340k.e(viewConfiguration, "viewConfiguration");
        AbstractC3340k.e(density, "density");
        this.f43178c = viewConfiguration;
        this.f43179d = density;
        this.f43180e = w.f43193a;
        this.f43181f = new P.d(new s[16]);
        this.f43182g = new P.d(new s[16]);
        this.f43184i = 0L;
    }

    public final Object A(tf.p pVar, AbstractC3464c abstractC3464c) {
        C0502n c0502n = new C0502n(1, A6.h.A(abstractC3464c));
        c0502n.t();
        s sVar = new s(this, c0502n);
        synchronized (this.f43181f) {
            this.f43181f.b(sVar);
            new C3110j(A6.h.A(A6.h.q(sVar, sVar, pVar)), kf.a.f39711a).resumeWith(C2515C.f34653a);
        }
        c0502n.v(new F(sVar, 17));
        return c0502n.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:6:0x000d, B:13:0x001b, B:15:0x0021, B:16:0x0024, B:18:0x0034, B:20:0x0038, B:21:0x003d, B:26:0x0044, B:28:0x004a, B:29:0x004d, B:31:0x005d, B:33:0x0061), top: B:43:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(p0.f r7, p0.g r8) {
        /*
            r6 = this;
            P.d r0 = r6.f43181f
            monitor-enter(r0)
            P.d r1 = r6.f43182g     // Catch: java.lang.Throwable -> L76
            P.d r2 = r6.f43181f     // Catch: java.lang.Throwable -> L76
            int r3 = r1.f8972c     // Catch: java.lang.Throwable -> L76
            r1.c(r3, r2)     // Catch: java.lang.Throwable -> L76
            monitor-exit(r0)
            int r0 = r8.ordinal()     // Catch: java.lang.Throwable -> L42
            r1 = 0
            if (r0 == 0) goto L44
            r2 = 1
            if (r0 == r2) goto L1b
            r2 = 2
            if (r0 == r2) goto L44
            goto L6a
        L1b:
            P.d r0 = r6.f43182g     // Catch: java.lang.Throwable -> L42
            int r3 = r0.f8972c     // Catch: java.lang.Throwable -> L42
            if (r3 <= 0) goto L6a
            int r3 = r3 - r2
            java.lang.Object[] r0 = r0.f8970a     // Catch: java.lang.Throwable -> L42
        L24:
            r2 = r0[r3]     // Catch: java.lang.Throwable -> L42
            p0.s r2 = (p0.s) r2     // Catch: java.lang.Throwable -> L42
            r2.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "event"
            kotlin.jvm.internal.AbstractC3340k.e(r7, r4)     // Catch: java.lang.Throwable -> L42
            p0.g r4 = r2.f43176d     // Catch: java.lang.Throwable -> L42
            if (r8 != r4) goto L3d
            Ef.n r4 = r2.f43175c     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L3d
            r2.f43175c = r1     // Catch: java.lang.Throwable -> L42
            r4.resumeWith(r7)     // Catch: java.lang.Throwable -> L42
        L3d:
            int r3 = r3 + (-1)
            if (r3 >= 0) goto L24
            goto L6a
        L42:
            r7 = move-exception
            goto L70
        L44:
            P.d r0 = r6.f43182g     // Catch: java.lang.Throwable -> L42
            int r2 = r0.f8972c     // Catch: java.lang.Throwable -> L42
            if (r2 <= 0) goto L6a
            java.lang.Object[] r0 = r0.f8970a     // Catch: java.lang.Throwable -> L42
            r3 = 0
        L4d:
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L42
            p0.s r4 = (p0.s) r4     // Catch: java.lang.Throwable -> L42
            r4.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = "event"
            kotlin.jvm.internal.AbstractC3340k.e(r7, r5)     // Catch: java.lang.Throwable -> L42
            p0.g r5 = r4.f43176d     // Catch: java.lang.Throwable -> L42
            if (r8 != r5) goto L66
            Ef.n r5 = r4.f43175c     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L66
            r4.f43175c = r1     // Catch: java.lang.Throwable -> L42
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L42
        L66:
            int r3 = r3 + 1
            if (r3 < r2) goto L4d
        L6a:
            P.d r7 = r6.f43182g
            r7.e()
            return
        L70:
            P.d r8 = r6.f43182g
            r8.e()
            throw r7
        L76:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.t.B(p0.f, p0.g):void");
    }

    @Override // p0.n
    public final void a() {
        f fVar = this.f43183h;
        if (fVar == null) {
            return;
        }
        List list = fVar.f43133a;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (((k) list.get(i5)).f43144d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    k kVar = (k) list.get(i10);
                    long j8 = kVar.f43141a;
                    long j10 = C2384c.f33931b;
                    boolean z2 = kVar.f43144d;
                    long j11 = kVar.f43142b;
                    long j12 = kVar.f43143c;
                    arrayList.add(new k(j8, j11, j12, false, j11, j12, z2, z2, 1, j10));
                }
                f fVar2 = new f(arrayList, null);
                this.f43180e = fVar2;
                B(fVar2, g.f43136a);
                B(fVar2, g.f43137b);
                B(fVar2, g.f43138c);
                this.f43183h = null;
                return;
            }
        }
    }

    @Override // L0.b
    public final float b() {
        return this.f43179d.b();
    }

    @Override // Z.k
    public final /* synthetic */ Z.k g(Z.k kVar) {
        return M6.f(this, kVar);
    }

    @Override // L0.b
    public final float getFontScale() {
        return this.f43179d.getFontScale();
    }

    @Override // Z.k
    public final Object h(Object obj, tf.p pVar) {
        return pVar.invoke(this, obj);
    }

    @Override // L0.b
    public final int j(float f10) {
        return this.f43179d.j(f10);
    }

    @Override // L0.b
    public final float l(long j8) {
        return this.f43179d.l(j8);
    }

    @Override // p0.n
    public final void n(f pointerEvent, g gVar, long j8) {
        AbstractC3340k.e(pointerEvent, "pointerEvent");
        this.f43184i = j8;
        if (gVar == g.f43136a) {
            this.f43180e = pointerEvent;
        }
        B(pointerEvent, gVar);
        List list = pointerEvent.f43133a;
        int size = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                pointerEvent = null;
                break;
            } else if (!android.support.v4.media.session.b.P((k) list.get(i5))) {
                break;
            } else {
                i5++;
            }
        }
        this.f43183h = pointerEvent;
    }

    @Override // Z.k
    public final Object p(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // L0.b
    public final float t(float f10) {
        return this.f43179d.t(f10);
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, Z.h.f16921i);
    }

    @Override // L0.b
    public final long y(long j8) {
        return this.f43179d.y(j8);
    }

    @Override // p0.o
    public final n s() {
        return this;
    }
}
