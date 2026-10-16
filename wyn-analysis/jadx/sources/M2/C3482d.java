package m2;

import A.d0;
import E5.C;
import J9.C0664x;
import N1.C0765n;
import P2.e;
import P2.f;
import P2.i;
import Q1.k;
import R8.v;
import U1.AbstractC0834d;
import U1.C0850u;
import U1.r;
import ac.C1346a;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import c8.C1581e;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import k2.H;
import l8.AbstractC3409K;
import l8.C3406H;
import l8.e0;
import wa.C4398a;

/* renamed from: m2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3482d extends AbstractC0834d implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    public P2.c f40309A;

    /* renamed from: B, reason: collision with root package name */
    public int f40310B;

    /* renamed from: C, reason: collision with root package name */
    public final Handler f40311C;

    /* renamed from: D, reason: collision with root package name */
    public final r f40312D;

    /* renamed from: E, reason: collision with root package name */
    public final S3.c f40313E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f40314F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f40315G;

    /* renamed from: H, reason: collision with root package name */
    public C0765n f40316H;

    /* renamed from: I, reason: collision with root package name */
    public long f40317I;

    /* renamed from: J, reason: collision with root package name */
    public long f40318J;

    /* renamed from: K, reason: collision with root package name */
    public IOException f40319K;

    /* renamed from: r, reason: collision with root package name */
    public final C1581e f40320r;

    /* renamed from: s, reason: collision with root package name */
    public final T1.d f40321s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC3479a f40322t;

    /* renamed from: u, reason: collision with root package name */
    public final C1346a f40323u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f40324v;

    /* renamed from: w, reason: collision with root package name */
    public int f40325w;

    /* renamed from: x, reason: collision with root package name */
    public e f40326x;

    /* renamed from: y, reason: collision with root package name */
    public i f40327y;

    /* renamed from: z, reason: collision with root package name */
    public P2.c f40328z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3482d(r rVar, Looper looper) {
        super(3);
        C1346a c1346a = InterfaceC3481c.f40308c9;
        this.f40312D = rVar;
        this.f40311C = looper == null ? null : new Handler(looper, this);
        this.f40323u = c1346a;
        this.f40320r = new C1581e(24);
        this.f40321s = new T1.d(1);
        this.f40313E = new S3.c(25, false);
        this.f40318J = -9223372036854775807L;
        this.f40317I = -9223372036854775807L;
    }

    @Override // U1.AbstractC0834d
    public final void D() {
        this.f40316H = null;
        this.f40318J = -9223372036854775807L;
        e0 e0Var = e0.f40101e;
        O(this.f40317I);
        P1.c cVar = new P1.c(e0Var);
        Handler handler = this.f40311C;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            Q(cVar);
        }
        this.f40317I = -9223372036854775807L;
        if (this.f40326x != null) {
            R();
            e eVar = this.f40326x;
            eVar.getClass();
            eVar.release();
            this.f40326x = null;
            this.f40325w = 0;
        }
    }

    @Override // U1.AbstractC0834d
    public final void F(long j8, boolean z2) {
        this.f40317I = j8;
        InterfaceC3479a interfaceC3479a = this.f40322t;
        if (interfaceC3479a != null) {
            interfaceC3479a.clear();
        }
        e0 e0Var = e0.f40101e;
        O(this.f40317I);
        P1.c cVar = new P1.c(e0Var);
        Handler handler = this.f40311C;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            Q(cVar);
        }
        this.f40314F = false;
        this.f40315G = false;
        this.f40318J = -9223372036854775807L;
        C0765n c0765n = this.f40316H;
        if (c0765n == null || Objects.equals(c0765n.f8232n, "application/x-media3-cues")) {
            return;
        }
        if (this.f40325w == 0) {
            R();
            e eVar = this.f40326x;
            eVar.getClass();
            eVar.flush();
            eVar.e(this.f12040l);
            return;
        }
        R();
        e eVar2 = this.f40326x;
        eVar2.getClass();
        eVar2.release();
        this.f40326x = null;
        this.f40325w = 0;
        P();
    }

    @Override // U1.AbstractC0834d
    public final void K(C0765n[] c0765nArr, long j8, long j10, H h10) {
        C0765n c0765n = c0765nArr[0];
        this.f40316H = c0765n;
        if (Objects.equals(c0765n.f8232n, "application/x-media3-cues")) {
            this.f40322t = this.f40316H.f8216I == 1 ? new C3480b() : new d0(2);
            return;
        }
        M();
        if (this.f40326x != null) {
            this.f40325w = 1;
        } else {
            P();
        }
    }

    public final void M() {
        k.f("Legacy decoding is disabled, can't handle " + this.f40316H.f8232n + " samples (expected application/x-media3-cues).", Objects.equals(this.f40316H.f8232n, "application/cea-608") || Objects.equals(this.f40316H.f8232n, "application/x-mp4-cea-608") || Objects.equals(this.f40316H.f8232n, "application/cea-708"));
    }

    public final long N() {
        if (this.f40310B == -1) {
            return Long.MAX_VALUE;
        }
        this.f40328z.getClass();
        if (this.f40310B >= this.f40328z.p()) {
            return Long.MAX_VALUE;
        }
        return this.f40328z.k(this.f40310B);
    }

    public final long O(long j8) {
        k.g(j8 != -9223372036854775807L);
        return j8 - this.k;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P() {
        /*
            r7 = this;
            r0 = 1
            r7.f40324v = r0
            N1.n r1 = r7.f40316H
            r1.getClass()
            ac.a r2 = r7.f40323u
            r2.getClass()
            java.lang.String r3 = r1.f8232n
            if (r3 == 0) goto L4d
            int r4 = r1.f8215H
            r5 = -1
            int r6 = r3.hashCode()
            switch(r6) {
                case 930165504: goto L31;
                case 1566015601: goto L28;
                case 1566016562: goto L1d;
                default: goto L1b;
            }
        L1b:
            r0 = r5
            goto L3b
        L1d:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L26
            goto L1b
        L26:
            r0 = 2
            goto L3b
        L28:
            java.lang.String r6 = "application/cea-608"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L3b
            goto L1b
        L31:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3a
            goto L1b
        L3a:
            r0 = 0
        L3b:
            switch(r0) {
                case 0: goto L47;
                case 1: goto L47;
                case 2: goto L3f;
                default: goto L3e;
            }
        L3e:
            goto L4d
        L3f:
            Q2.f r0 = new Q2.f
            java.util.List r1 = r1.f8235q
            r0.<init>(r4, r1)
            goto L6e
        L47:
            Q2.c r0 = new Q2.c
            r0.<init>(r3, r4)
            goto L6e
        L4d:
            java.lang.Object r0 = r2.f17489b
            wa.a r0 = (wa.C4398a) r0
            boolean r2 = r0.d(r1)
            if (r2 == 0) goto L76
            P2.l r0 = r0.i(r1)
            c2.b r1 = new c2.b
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            r2.concat(r3)
            r1.<init>(r0)
            r0 = r1
        L6e:
            r7.f40326x = r0
            long r1 = r7.f12040l
            r0.e(r1)
            return
        L76:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r1 = R8.v.f(r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C3482d.P():void");
    }

    public final void Q(P1.c cVar) {
        AbstractC3409K abstractC3409K = cVar.f9037a;
        r rVar = this.f40312D;
        rVar.f12116a.f12161l.e(27, new C(2, abstractC3409K));
        C0850u c0850u = rVar.f12116a;
        c0850u.getClass();
        c0850u.f12161l.e(27, new S8.b(cVar, 3));
    }

    public final void R() {
        this.f40327y = null;
        this.f40310B = -1;
        P2.c cVar = this.f40328z;
        if (cVar != null) {
            cVar.q();
            this.f40328z = null;
        }
        P2.c cVar2 = this.f40309A;
        if (cVar2 != null) {
            cVar2.q();
            this.f40309A = null;
        }
    }

    @Override // U1.AbstractC0834d, U1.W
    public final boolean b() {
        return this.f40315G;
    }

    @Override // U1.X
    public final int d(C0765n c0765n) {
        if (!Objects.equals(c0765n.f8232n, "application/x-media3-cues")) {
            C1346a c1346a = this.f40323u;
            c1346a.getClass();
            if (!((C4398a) c1346a.f17489b).d(c0765n)) {
                String str = c0765n.f8232n;
                if (!Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                    return N1.C.k(str) ? v.a(1, 0, 0, 0) : v.a(0, 0, 0, 0);
                }
            }
        }
        return v.a(c0765n.L == 0 ? 4 : 2, 0, 0, 0);
    }

    @Override // U1.W, U1.X
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        Q((P1.c) message.obj);
        return true;
    }

    @Override // U1.W
    public final boolean isReady() {
        if (this.f40316H != null) {
            if (this.f40319K == null) {
                try {
                    p();
                } catch (IOException e7) {
                    this.f40319K = e7;
                }
            }
            if (this.f40319K != null) {
                C0765n c0765n = this.f40316H;
                c0765n.getClass();
                if (Objects.equals(c0765n.f8232n, "application/x-media3-cues")) {
                    InterfaceC3479a interfaceC3479a = this.f40322t;
                    interfaceC3479a.getClass();
                    return interfaceC3479a.d(this.f40317I) != Long.MIN_VALUE;
                }
                if (!this.f40315G) {
                    if (this.f40314F) {
                        P2.c cVar = this.f40328z;
                        long j8 = this.f40317I;
                        if (cVar == null || cVar.k(cVar.p() - 1) <= j8) {
                            P2.c cVar2 = this.f40309A;
                            long j10 = this.f40317I;
                            if ((cVar2 == null || cVar2.k(cVar2.p() - 1) <= j10) && this.f40327y != null) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // U1.W
    public final void v(long j8, long j10) {
        boolean z2;
        S3.c cVar;
        boolean z10;
        long jK;
        if (this.f12042n) {
            long j11 = this.f40318J;
            if (j11 != -9223372036854775807L && j8 >= j11) {
                R();
                this.f40315G = true;
            }
        }
        if (this.f40315G) {
            return;
        }
        C0765n c0765n = this.f40316H;
        c0765n.getClass();
        boolean zEquals = Objects.equals(c0765n.f8232n, "application/x-media3-cues");
        Handler handler = this.f40311C;
        boolean zA = false;
        zA = false;
        zA = false;
        S3.c cVar2 = this.f40313E;
        if (zEquals) {
            this.f40322t.getClass();
            if (!this.f40314F) {
                T1.d dVar = this.f40321s;
                if (L(cVar2, dVar, 0) == -4) {
                    if (dVar.h(4)) {
                        this.f40314F = true;
                    } else {
                        dVar.s();
                        ByteBuffer byteBuffer = dVar.f11358e;
                        byteBuffer.getClass();
                        long j12 = dVar.f11360g;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.f40320r.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        C0664x c0664x = new C0664x(17);
                        C3406H c3406hI = AbstractC3409K.i();
                        for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i5);
                            bundle2.getClass();
                            c3406hI.a(c0664x.apply(bundle2));
                        }
                        P2.a aVar = new P2.a(c3406hI.g(), j12, bundle.getLong("d"));
                        dVar.o();
                        zA = this.f40322t.a(aVar, j8);
                    }
                }
            }
            long jD = this.f40322t.d(this.f40317I);
            if (jD == Long.MIN_VALUE && this.f40314F && !zA) {
                this.f40315G = true;
            }
            if (jD != Long.MIN_VALUE && jD <= j8) {
                zA = true;
            }
            if (zA) {
                AbstractC3409K abstractC3409KB = this.f40322t.b(j8);
                long jC = this.f40322t.c(j8);
                O(jC);
                P1.c cVar3 = new P1.c(abstractC3409KB);
                if (handler != null) {
                    handler.obtainMessage(1, cVar3).sendToTarget();
                } else {
                    Q(cVar3);
                }
                this.f40322t.e(jC);
            }
            this.f40317I = j8;
            return;
        }
        M();
        this.f40317I = j8;
        if (this.f40309A == null) {
            e eVar = this.f40326x;
            eVar.getClass();
            eVar.a(j8);
            try {
                e eVar2 = this.f40326x;
                eVar2.getClass();
                this.f40309A = (P2.c) eVar2.b();
            } catch (f e7) {
                k.l("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f40316H, e7);
                e0 e0Var = e0.f40101e;
                O(this.f40317I);
                P1.c cVar4 = new P1.c(e0Var);
                if (handler != null) {
                    handler.obtainMessage(1, cVar4).sendToTarget();
                } else {
                    Q(cVar4);
                }
                R();
                e eVar3 = this.f40326x;
                eVar3.getClass();
                eVar3.release();
                this.f40326x = null;
                this.f40325w = 0;
                P();
                return;
            }
        }
        if (this.f12037h != 2) {
            return;
        }
        if (this.f40328z != null) {
            long jN = N();
            z2 = false;
            while (jN <= j8) {
                this.f40310B++;
                jN = N();
                z2 = true;
            }
        } else {
            z2 = false;
        }
        P2.c cVar5 = this.f40309A;
        if (cVar5 == null) {
            cVar = cVar2;
            z10 = z2;
        } else if (cVar5.h(4)) {
            if (!z2 && N() == Long.MAX_VALUE) {
                if (this.f40325w == 2) {
                    R();
                    e eVar4 = this.f40326x;
                    eVar4.getClass();
                    eVar4.release();
                    this.f40326x = null;
                    this.f40325w = 0;
                    P();
                } else {
                    R();
                    this.f40315G = true;
                }
            }
            cVar = cVar2;
            z10 = z2;
        } else {
            cVar = cVar2;
            z10 = z2;
            if (cVar5.f11363c <= j8) {
                P2.c cVar6 = this.f40328z;
                if (cVar6 != null) {
                    cVar6.q();
                }
                this.f40310B = cVar5.a(j8);
                this.f40328z = cVar5;
                this.f40309A = null;
                z10 = true;
            }
        }
        if (z10) {
            this.f40328z.getClass();
            int iA = this.f40328z.a(j8);
            if (iA == 0 || this.f40328z.p() == 0) {
                jK = this.f40328z.f11363c;
            } else if (iA == -1) {
                P2.c cVar7 = this.f40328z;
                jK = cVar7.k(cVar7.p() - 1);
            } else {
                jK = this.f40328z.k(iA - 1);
            }
            O(jK);
            P1.c cVar8 = new P1.c(this.f40328z.g(j8));
            if (handler != null) {
                handler.obtainMessage(1, cVar8).sendToTarget();
            } else {
                Q(cVar8);
            }
        }
        if (this.f40325w == 2) {
            return;
        }
        while (!this.f40314F) {
            try {
                i iVar = this.f40327y;
                if (iVar == null) {
                    e eVar5 = this.f40326x;
                    eVar5.getClass();
                    iVar = (i) eVar5.c();
                    if (iVar == null) {
                        return;
                    } else {
                        this.f40327y = iVar;
                    }
                }
                if (this.f40325w == 1) {
                    iVar.f4893b = 4;
                    e eVar6 = this.f40326x;
                    eVar6.getClass();
                    eVar6.d(iVar);
                    this.f40327y = null;
                    this.f40325w = 2;
                    return;
                }
                int iL = L(cVar, iVar, 0);
                if (iL == -4) {
                    if (iVar.h(4)) {
                        this.f40314F = true;
                        this.f40324v = false;
                    } else {
                        C0765n c0765n2 = (C0765n) cVar.f10937c;
                        if (c0765n2 == null) {
                            return;
                        }
                        iVar.f9078j = c0765n2.f8237s;
                        iVar.s();
                        this.f40324v &= !iVar.h(1);
                    }
                    if (!this.f40324v) {
                        e eVar7 = this.f40326x;
                        eVar7.getClass();
                        eVar7.d(iVar);
                        this.f40327y = null;
                    }
                } else if (iL == -3) {
                    return;
                }
            } catch (f e10) {
                k.l("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f40316H, e10);
                e0 e0Var2 = e0.f40101e;
                O(this.f40317I);
                P1.c cVar9 = new P1.c(e0Var2);
                if (handler != null) {
                    handler.obtainMessage(1, cVar9).sendToTarget();
                } else {
                    Q(cVar9);
                }
                R();
                e eVar8 = this.f40326x;
                eVar8.getClass();
                eVar8.release();
                this.f40326x = null;
                this.f40325w = 0;
                P();
                return;
            }
        }
    }
}
