package pd;

import A7.W0;
import Va.M6;
import c7.C1576l;
import cg.C1618g;
import cg.C1621j;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import k8.AbstractC3198g;
import md.AbstractC3541i;
import md.G;
import md.H;
import md.W;
import md.Z;
import md.b0;
import md.k0;
import od.AbstractC3669a0;
import od.AbstractC3671b;
import od.AbstractC3678d0;
import od.AbstractC3720r1;
import od.C3718q1;
import od.C3728u0;
import od.EnumC3721s;
import od.W1;
import od.Z1;
import rd.C3967b;
import rd.EnumC3966a;

/* loaded from: classes5.dex */
public final class j extends AbstractC3678d0 implements u {

    /* renamed from: A, reason: collision with root package name */
    public boolean f43516A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f43517B;

    /* renamed from: C, reason: collision with root package name */
    public int f43518C;

    /* renamed from: D, reason: collision with root package name */
    public int f43519D;

    /* renamed from: E, reason: collision with root package name */
    public final d f43520E;

    /* renamed from: F, reason: collision with root package name */
    public final C1576l f43521F;

    /* renamed from: G, reason: collision with root package name */
    public final m f43522G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f43523H;

    /* renamed from: I, reason: collision with root package name */
    public final Xd.c f43524I;

    /* renamed from: J, reason: collision with root package name */
    public v f43525J;

    /* renamed from: K, reason: collision with root package name */
    public int f43526K;
    public final /* synthetic */ k L;

    /* renamed from: v, reason: collision with root package name */
    public final int f43527v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f43528w;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f43529x;

    /* renamed from: y, reason: collision with root package name */
    public final C1618g f43530y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f43531z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, int i5, W1 w12, Object obj, d dVar, C1576l c1576l, m mVar, int i10) {
        super(i5, w12, kVar.f41917c);
        this.L = kVar;
        this.f41938s = AbstractC3198g.f39301c;
        this.f43530y = new C1618g();
        this.f43531z = false;
        this.f43516A = false;
        this.f43517B = false;
        this.f43523H = true;
        this.f43526K = -1;
        Fe.e.t(obj, "lock");
        this.f43528w = obj;
        this.f43520E = dVar;
        this.f43521F = c1576l;
        this.f43522G = mVar;
        this.f43518C = i10;
        this.f43519D = i10;
        this.f43527v = i10;
        Xd.b.f16226a.getClass();
        this.f43524I = Xd.a.f16224a;
    }

    public static void k(j jVar, b0 b0Var, String str) throws Throwable {
        k kVar = jVar.L;
        String str2 = kVar.f43535m;
        boolean z2 = kVar.f43539q;
        m mVar = jVar.f43522G;
        boolean z10 = mVar.f43543B == null;
        C3967b c3967b = e.f43483a;
        Fe.e.t(b0Var, "headers");
        Fe.e.t(str, "defaultPath");
        Fe.e.t(str2, "authority");
        b0Var.a(AbstractC3669a0.f41893i);
        b0Var.a(AbstractC3669a0.f41894j);
        W w2 = AbstractC3669a0.k;
        b0Var.a(w2);
        ArrayList arrayList = new ArrayList(b0Var.f40618b + 7);
        if (z10) {
            arrayList.add(e.f43484b);
        } else {
            arrayList.add(e.f43483a);
        }
        if (z2) {
            arrayList.add(e.f43486d);
        } else {
            arrayList.add(e.f43485c);
        }
        arrayList.add(new C3967b(C3967b.f44758h, str2));
        arrayList.add(new C3967b(C3967b.f44756f, str));
        arrayList.add(new C3967b(w2.f40607a, kVar.k));
        arrayList.add(e.f43487e);
        arrayList.add(e.f43488f);
        Logger logger = Z1.f41868a;
        Charset charset = G.f40576a;
        int i5 = b0Var.f40618b * 2;
        byte[][] bArr = new byte[i5][];
        Object[] objArr = b0Var.f40617a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, i5);
        } else {
            for (int i10 = 0; i10 < b0Var.f40618b; i10++) {
                int i11 = i10 * 2;
                bArr[i11] = b0Var.e(i10);
                int i12 = i11 + 1;
                Object obj = b0Var.f40617a[i12];
                if (!(obj instanceof byte[])) {
                    M6.z(obj);
                    throw null;
                }
                bArr[i12] = (byte[]) obj;
            }
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i5; i14 += 2) {
            byte[] bArr2 = bArr[i14];
            byte[] bArr3 = bArr[i14 + 1];
            if (Z1.a(bArr2, Z1.f41869b)) {
                bArr[i13] = bArr2;
                bArr[i13 + 1] = G.f40577b.c(bArr3).getBytes(AbstractC3198g.f39299a);
            } else {
                for (byte b5 : bArr3) {
                    if (b5 < 32 || b5 > 126) {
                        StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Metadata key=", new String(bArr2, AbstractC3198g.f39299a), ", value=");
                        sbW.append(Arrays.toString(bArr3));
                        sbW.append(" contains invalid ASCII characters");
                        Z1.f41868a.warning(sbW.toString());
                        break;
                    }
                }
                bArr[i13] = bArr2;
                bArr[i13 + 1] = bArr3;
            }
            i13 += 2;
        }
        if (i13 != i5) {
            bArr = (byte[][]) Arrays.copyOfRange(bArr, 0, i13);
        }
        for (int i15 = 0; i15 < bArr.length; i15 += 2) {
            C1621j c1621jL = C1621j.l(bArr[i15]);
            byte[] bArr4 = c1621jL.f19904a;
            if (bArr4.length != 0 && bArr4[0] != 58) {
                arrayList.add(new C3967b(c1621jL, C1621j.l(bArr[i15 + 1])));
            }
        }
        jVar.f43529x = arrayList;
        k0 k0Var = mVar.f43576v;
        if (k0Var != null) {
            kVar.f43536n.g(k0Var, EnumC3721s.f42085d, true, new b0());
            return;
        }
        if (mVar.f43568n.size() < mVar.f43544C) {
            mVar.w(kVar);
            return;
        }
        mVar.f43545D.add(kVar);
        if (!mVar.f43580z) {
            mVar.f43580z = true;
            C3728u0 c3728u0 = mVar.f43547F;
            if (c3728u0 != null) {
                c3728u0.b();
            }
        }
        if (kVar.f41919e) {
            mVar.f43553M.W(kVar, true);
        }
    }

    public static void l(j jVar, C1618g c1618g, boolean z2, boolean z10) {
        if (jVar.f43517B) {
            return;
        }
        if (!jVar.f43523H) {
            Fe.e.w("streamId should be set", jVar.f43526K != -1);
            jVar.f43521F.a(z2, jVar.f43525J, c1618g, z10);
        } else {
            jVar.f43530y.E(c1618g, (int) c1618g.f19902b);
            jVar.f43531z |= z2;
            jVar.f43516A |= z10;
        }
    }

    @Override // od.AbstractC3668a
    public final void a(int i5) {
        int i10 = this.f43519D - i5;
        this.f43519D = i10;
        float f10 = i10;
        int i11 = this.f43527v;
        if (f10 <= i11 * 0.5f) {
            int i12 = i11 - i10;
            this.f43518C += i12;
            this.f43519D = i10 + i12;
            this.f43520E.o(this.f43526K, i12);
        }
    }

    @Override // od.AbstractC3668a
    public final void c(boolean z2) throws Throwable {
        boolean z10 = this.f41882n;
        EnumC3721s enumC3721s = EnumC3721s.f42082a;
        if (z10) {
            this.f43522G.j(this.f43526K, null, enumC3721s, false, null, null);
        } else {
            this.f43522G.j(this.f43526K, null, enumC3721s, false, EnumC3966a.CANCEL, null);
        }
        Fe.e.w("status should have been reported on deframer closed", this.f41883o);
        this.f41880l = true;
        if (this.f41884p && z2) {
            h(k0.f40681m.h("Encountered end-of-stream mid-frame"), true, new b0());
        }
        W0 w02 = this.f41881m;
        if (w02 != null) {
            w02.run();
            this.f41881m = null;
        }
    }

    public final void m(k0 k0Var, boolean z2, b0 b0Var) throws Throwable {
        if (this.f43517B) {
            return;
        }
        this.f43517B = true;
        if (!this.f43523H) {
            this.f43522G.j(this.f43526K, k0Var, EnumC3721s.f42082a, z2, EnumC3966a.CANCEL, b0Var);
            return;
        }
        m mVar = this.f43522G;
        LinkedList linkedList = mVar.f43545D;
        k kVar = this.L;
        linkedList.remove(kVar);
        mVar.p(kVar);
        this.f43529x = null;
        this.f43530y.a();
        this.f43523H = false;
        if (b0Var == null) {
            b0Var = new b0();
        }
        h(k0Var, true, b0Var);
    }

    public final void n(Throwable th) {
        m(k0.e(th), true, new b0());
    }

    public final v o() {
        v vVar;
        synchronized (this.f43528w) {
            vVar = this.f43525J;
        }
        return vVar;
    }

    public final void p(int i5, C1618g c1618g, boolean z2) throws Throwable {
        Throwable th;
        boolean z10 = true;
        long j8 = c1618g.f19902b;
        int i10 = this.f43518C - (((int) j8) + i5);
        this.f43518C = i10;
        this.f43519D -= i5;
        if (i10 < 0) {
            this.f43520E.h(this.f43526K, EnumC3966a.FLOW_CONTROL_ERROR);
            this.f43522G.j(this.f43526K, k0.f40681m.h("Received data size exceeded our receiving window size"), EnumC3721s.f42082a, false, null, null);
            return;
        }
        q qVar = new q(c1618g);
        k0 k0Var = this.f41936q;
        if (k0Var != null) {
            Charset charset = this.f41938s;
            C3718q1 c3718q1 = AbstractC3720r1.f42081a;
            Fe.e.t(charset, "charset");
            int i11 = (int) c1618g.f19902b;
            byte[] bArr = new byte[i11];
            qVar.i(0, i11, bArr);
            this.f41936q = k0Var.b("DATA-----------------------------\n".concat(new String(bArr, charset)));
            qVar.close();
            if (this.f41936q.f40686b.length() > 1000 || z2) {
                m(this.f41936q, false, this.f41937r);
                return;
            }
            return;
        }
        if (!this.f41939t) {
            m(k0.f40681m.h("headers not received before payload"), false, new b0());
            return;
        }
        int i12 = (int) j8;
        try {
            if (this.f41883o) {
                AbstractC3671b.f41916i.log(Level.INFO, "Received data on closed stream");
                qVar.close();
            } else {
                try {
                    od.W0 w02 = this.f41870a;
                    w02.getClass();
                    try {
                        if (w02.isClosed() || w02.f41840q) {
                            qVar.close();
                        } else {
                            w02.f41835l.J(qVar);
                            try {
                                w02.a();
                            } catch (Throwable th2) {
                                th = th2;
                                z10 = false;
                                if (z10) {
                                    qVar.close();
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        n(th4);
                    } catch (Throwable th5) {
                        th = th5;
                        z10 = false;
                        if (!z10) {
                            throw th;
                        }
                        qVar.close();
                        throw th;
                    }
                }
            }
            if (z2) {
                if (i12 > 0) {
                    this.f41936q = k0.f40681m.h("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.f41936q = k0.f40681m.h("Received unexpected EOS on empty DATA frame from server");
                }
                b0 b0Var = new b0();
                this.f41937r = b0Var;
                h(this.f41936q, false, b0Var);
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void q(ArrayList arrayList, boolean z2) throws Throwable {
        k0 k0VarB;
        Z z10 = AbstractC3678d0.f41935u;
        if (z2) {
            byte[][] bArrA = w.a(arrayList);
            int length = bArrA.length / 2;
            b0 b0Var = new b0();
            b0Var.f40618b = length;
            b0Var.f40617a = bArrA;
            if (this.f41936q == null && !this.f41939t) {
                k0 k0VarJ = AbstractC3678d0.j(b0Var);
                this.f41936q = k0VarJ;
                if (k0VarJ != null) {
                    this.f41937r = b0Var;
                }
            }
            k0 k0Var = this.f41936q;
            if (k0Var != null) {
                k0 k0VarB2 = k0Var.b("trailers: " + b0Var);
                this.f41936q = k0VarB2;
                m(k0VarB2, false, this.f41937r);
                return;
            }
            Z z11 = H.f40579b;
            k0 k0Var2 = (k0) b0Var.c(z11);
            if (k0Var2 != null) {
                k0VarB = k0Var2.h((String) b0Var.c(H.f40578a));
            } else if (this.f41939t) {
                k0VarB = k0.f40676g.h("missing GRPC status in response");
            } else {
                Integer num = (Integer) b0Var.c(z10);
                k0VarB = (num != null ? AbstractC3669a0.g(num.intValue()) : k0.f40681m.h("missing HTTP status code")).b("missing GRPC status, inferred error from HTTP status code");
            }
            b0Var.a(z10);
            b0Var.a(z11);
            b0Var.a(H.f40578a);
            if (this.f41883o) {
                AbstractC3671b.f41916i.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{k0VarB, b0Var});
                return;
            }
            for (AbstractC3541i abstractC3541i : this.f41877h.f41842a) {
                abstractC3541i.e(b0Var);
            }
            g(k0VarB, EnumC3721s.f42082a, false, b0Var);
            return;
        }
        byte[][] bArrA2 = w.a(arrayList);
        int length2 = bArrA2.length / 2;
        b0 b0Var2 = new b0();
        b0Var2.f40618b = length2;
        b0Var2.f40617a = bArrA2;
        k0 k0Var3 = this.f41936q;
        if (k0Var3 != null) {
            this.f41936q = k0Var3.b("headers: " + b0Var2);
            return;
        }
        try {
            if (this.f41939t) {
                k0 k0VarH = k0.f40681m.h("Received headers twice");
                this.f41936q = k0VarH;
                this.f41936q = k0VarH.b("headers: " + b0Var2);
                this.f41937r = b0Var2;
                this.f41938s = AbstractC3678d0.i(b0Var2);
                return;
            }
            Integer num2 = (Integer) b0Var2.c(z10);
            if (num2 != null && num2.intValue() >= 100 && num2.intValue() < 200) {
                k0 k0Var4 = this.f41936q;
                if (k0Var4 != null) {
                    this.f41936q = k0Var4.b("headers: " + b0Var2);
                    this.f41937r = b0Var2;
                    this.f41938s = AbstractC3678d0.i(b0Var2);
                    return;
                }
                return;
            }
            this.f41939t = true;
            k0 k0VarJ2 = AbstractC3678d0.j(b0Var2);
            this.f41936q = k0VarJ2;
            if (k0VarJ2 != null) {
                this.f41936q = k0VarJ2.b("headers: " + b0Var2);
                this.f41937r = b0Var2;
                this.f41938s = AbstractC3678d0.i(b0Var2);
                return;
            }
            b0Var2.a(z10);
            b0Var2.a(H.f40579b);
            b0Var2.a(H.f40578a);
            d(b0Var2);
            k0 k0Var5 = this.f41936q;
            if (k0Var5 != null) {
                this.f41936q = k0Var5.b("headers: " + b0Var2);
                this.f41937r = b0Var2;
                this.f41938s = AbstractC3678d0.i(b0Var2);
            }
        } catch (Throwable th) {
            k0 k0Var6 = this.f41936q;
            if (k0Var6 != null) {
                this.f41936q = k0Var6.b("headers: " + b0Var2);
                this.f41937r = b0Var2;
                this.f41938s = AbstractC3678d0.i(b0Var2);
            }
            throw th;
        }
    }
}
