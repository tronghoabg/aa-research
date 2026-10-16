package Yf;

import A.C0230x;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import za.C4658a;

/* loaded from: classes5.dex */
public final class E extends com.moloco.sdk.internal.publisher.H implements Xf.m {

    /* renamed from: b, reason: collision with root package name */
    public final E4.F f16821b;

    /* renamed from: c, reason: collision with root package name */
    public final Xf.c f16822c;

    /* renamed from: d, reason: collision with root package name */
    public final I f16823d;

    /* renamed from: e, reason: collision with root package name */
    public final Xf.m[] f16824e;

    /* renamed from: f, reason: collision with root package name */
    public final C4658a f16825f;

    /* renamed from: g, reason: collision with root package name */
    public final Xf.h f16826g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16827h;

    /* renamed from: i, reason: collision with root package name */
    public String f16828i;

    /* renamed from: j, reason: collision with root package name */
    public String f16829j;

    public E(E4.F composer, Xf.c json, I i5, Xf.m[] mVarArr) {
        AbstractC3340k.e(composer, "composer");
        AbstractC3340k.e(json, "json");
        this.f16821b = composer;
        this.f16822c = json;
        this.f16823d = i5;
        this.f16824e = mVarArr;
        this.f16825f = json.f16253b;
        this.f16826g = json.f16252a;
        int iOrdinal = i5.ordinal();
        if (mVarArr != null) {
            Xf.m mVar = mVarArr[iOrdinal];
            if (mVar == null && mVar == this) {
                return;
            }
            mVarArr[iOrdinal] = this;
        }
    }

    @Override // com.moloco.sdk.internal.publisher.H, Vf.b
    public final boolean A(SerialDescriptor descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return this.f16826g.f16270a;
    }

    @Override // Xf.m
    public final void B(kotlinx.serialization.json.b element) {
        AbstractC3340k.e(element, "element");
        if (this.f16828i == null || (element instanceof kotlinx.serialization.json.c)) {
            n(Xf.k.f16281a, element);
        } else {
            r.q(this.f16829j, element);
            throw null;
        }
    }

    @Override // com.moloco.sdk.internal.publisher.H, kotlinx.serialization.encoding.Encoder
    public final void C(int i5) {
        if (this.f16827h) {
            F(String.valueOf(i5));
        } else {
            this.f16821b.n(i5);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.H, kotlinx.serialization.encoding.Encoder
    public final void F(String value) {
        AbstractC3340k.e(value, "value");
        this.f16821b.r(value);
    }

    @Override // com.moloco.sdk.internal.publisher.H
    public final void S(SerialDescriptor descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        int iOrdinal = this.f16823d.ordinal();
        boolean z2 = true;
        E4.F f10 = this.f16821b;
        if (iOrdinal == 1) {
            if (!f10.f2853b) {
                f10.m(',');
            }
            f10.i();
            return;
        }
        if (iOrdinal == 2) {
            if (f10.f2853b) {
                this.f16827h = true;
                f10.i();
                return;
            }
            if (i5 % 2 == 0) {
                f10.m(',');
                f10.i();
            } else {
                f10.m(':');
                f10.t();
                z2 = false;
            }
            this.f16827h = z2;
            return;
        }
        if (iOrdinal == 3) {
            if (i5 == 0) {
                this.f16827h = true;
            }
            if (i5 == 1) {
                f10.m(',');
                f10.t();
                this.f16827h = false;
                return;
            }
            return;
        }
        if (!f10.f2853b) {
            f10.m(',');
        }
        f10.i();
        Xf.c json = this.f16822c;
        AbstractC3340k.e(json, "json");
        r.n(json, descriptor);
        F(descriptor.e(i5));
        f10.m(':');
        f10.t();
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final C4658a a() {
        return this.f16825f;
    }

    @Override // com.moloco.sdk.internal.publisher.H, kotlinx.serialization.encoding.Encoder
    public final Vf.b b(SerialDescriptor descriptor) {
        Xf.m mVar;
        AbstractC3340k.e(descriptor, "descriptor");
        Xf.c cVar = this.f16822c;
        I iO = r.o(cVar, descriptor);
        char c10 = iO.f16840a;
        E4.F f10 = this.f16821b;
        f10.m(c10);
        f10.e();
        String str = this.f16828i;
        if (str != null) {
            String strH = this.f16829j;
            if (strH == null) {
                strH = descriptor.h();
            }
            f10.i();
            F(str);
            f10.m(':');
            f10.t();
            F(strH);
            this.f16828i = null;
            this.f16829j = null;
        }
        if (this.f16823d == iO) {
            return this;
        }
        Xf.m[] mVarArr = this.f16824e;
        return (mVarArr == null || (mVar = mVarArr[iO.ordinal()]) == null) ? new E(f10, cVar, iO, mVarArr) : mVar;
    }

    @Override // com.moloco.sdk.internal.publisher.H, Vf.b
    public final void c(SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
        I i5 = this.f16823d;
        E4.F f10 = this.f16821b;
        f10.u();
        f10.j();
        f10.m(i5.f16841b);
    }

    @Override // Xf.m
    public final Xf.c d() {
        return this.f16822c;
    }

    @Override // com.moloco.sdk.internal.publisher.H, kotlinx.serialization.encoding.Encoder
    public final void e(double d3) {
        boolean z2 = this.f16827h;
        E4.F f10 = this.f16821b;
        if (z2) {
            F(String.valueOf(d3));
        } else {
            f10.getClass();
            ((C0230x) f10.f2854c).y(String.valueOf(d3));
        }
        if (Math.abs(d3) > Double.MAX_VALUE) {
            throw r.a(Double.valueOf(d3), ((C0230x) f10.f2854c).toString());
        }
    }

    @Override // com.moloco.sdk.internal.publisher.H, kotlinx.serialization.encoding.Encoder
    public final void g(byte b5) {
        if (this.f16827h) {
            F(String.valueOf((int) b5));
        } else {
            this.f16821b.l(b5);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.H, Vf.b
    public final void i(SerialDescriptor descriptor, int i5, KSerializer serializer, Object obj) {
        AbstractC3340k.e(descriptor, "descriptor");
        AbstractC3340k.e(serializer, "serializer");
        if (obj != null || this.f16826g.f16275f) {
            super.i(descriptor, i5, serializer, obj);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.H, kotlinx.serialization.encoding.Encoder
    public final void l(SerialDescriptor enumDescriptor, int i5) {
        AbstractC3340k.e(enumDescriptor, "enumDescriptor");
        F(enumDescriptor.e(i5));
    }

    @Override // com.moloco.sdk.internal.publisher.H, kotlinx.serialization.encoding.Encoder
    public final Encoder m(SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
        boolean zA = F.a(descriptor);
        I i5 = this.f16823d;
        Xf.c cVar = this.f16822c;
        E4.F kVar = this.f16821b;
        if (zA) {
            if (!(kVar instanceof l)) {
                kVar = new l((C0230x) kVar.f2854c, this.f16827h);
            }
            return new E(kVar, cVar, i5, null);
        }
        if (descriptor.isInline() && descriptor.equals(Xf.j.f16280a)) {
            if (!(kVar instanceof k)) {
                kVar = new k((C0230x) kVar.f2854c, this.f16827h);
            }
            return new E(kVar, cVar, i5, null);
        }
        if (this.f16828i != null) {
            this.f16829j = descriptor.h();
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    @Override // com.moloco.sdk.internal.publisher.H, kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(kotlinx.serialization.KSerializer r6, java.lang.Object r7) {
        /*
            r5 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.AbstractC3340k.e(r6, r0)
            Xf.c r0 = r5.f16822c
            Xf.h r1 = r0.f16252a
            boolean r2 = r6 instanceof Sf.d
            r3 = 0
            if (r2 == 0) goto L15
            Xf.a r1 = r1.f16279j
            Xf.a r4 = Xf.a.f16248a
            if (r1 == r4) goto L4e
            goto L45
        L15:
            Xf.a r1 = r1.f16279j
            int r1 = r1.ordinal()
            if (r1 == 0) goto L4e
            r4 = 1
            if (r1 == r4) goto L2d
            r0 = 2
            if (r1 != r0) goto L24
            goto L4e
        L24:
            E5.Q r6 = new E5.Q
            r7 = 9
            r0 = 0
            r6.<init>(r0, r7)
            throw r6
        L2d:
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r6.getDescriptor()
            S3.f r1 = r1.getKind()
            Uf.j r4 = Uf.j.f12831p
            boolean r4 = kotlin.jvm.internal.AbstractC3340k.a(r1, r4)
            if (r4 != 0) goto L45
            Uf.j r4 = Uf.j.f12834s
            boolean r1 = kotlin.jvm.internal.AbstractC3340k.a(r1, r4)
            if (r1 == 0) goto L4e
        L45:
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r6.getDescriptor()
            java.lang.String r0 = Yf.r.g(r0, r1)
            goto L4f
        L4e:
            r0 = r3
        L4f:
            if (r2 == 0) goto L7a
            Sf.d r6 = (Sf.d) r6
            if (r7 != 0) goto L76
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Value for serializer "
            r7.<init>(r0)
            kotlinx.serialization.descriptors.SerialDescriptor r6 = r6.getDescriptor()
            r7.append(r6)
            java.lang.String r6 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L76:
            android.support.v4.media.session.b.f0(r6, r5, r7)
            throw r3
        L7a:
            if (r0 == 0) goto L88
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r6.getDescriptor()
            java.lang.String r1 = r1.h()
            r5.f16828i = r0
            r5.f16829j = r1
        L88:
            r6.serialize(r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Yf.E.n(kotlinx.serialization.KSerializer, java.lang.Object):void");
    }

    @Override // com.moloco.sdk.internal.publisher.H, kotlinx.serialization.encoding.Encoder
    public final void o(long j8) {
        if (this.f16827h) {
            F(String.valueOf(j8));
        } else {
            this.f16821b.o(j8);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.H, kotlinx.serialization.encoding.Encoder
    public final void p() {
        this.f16821b.p("null");
    }

    @Override // com.moloco.sdk.internal.publisher.H, kotlinx.serialization.encoding.Encoder
    public final void q(short s10) {
        if (this.f16827h) {
            F(String.valueOf((int) s10));
        } else {
            this.f16821b.q(s10);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.H, kotlinx.serialization.encoding.Encoder
    public final void r(boolean z2) {
        if (this.f16827h) {
            F(String.valueOf(z2));
            return;
        }
        E4.F f10 = this.f16821b;
        f10.getClass();
        ((C0230x) f10.f2854c).y(String.valueOf(z2));
    }

    @Override // com.moloco.sdk.internal.publisher.H, kotlinx.serialization.encoding.Encoder
    public final void u(float f10) {
        boolean z2 = this.f16827h;
        E4.F f11 = this.f16821b;
        if (z2) {
            F(String.valueOf(f10));
        } else {
            f11.getClass();
            ((C0230x) f11.f2854c).y(String.valueOf(f10));
        }
        if (Math.abs(f10) > Float.MAX_VALUE) {
            throw r.a(Float.valueOf(f10), ((C0230x) f11.f2854c).toString());
        }
    }

    @Override // com.moloco.sdk.internal.publisher.H, kotlinx.serialization.encoding.Encoder
    public final void w(char c10) {
        F(String.valueOf(c10));
    }
}
