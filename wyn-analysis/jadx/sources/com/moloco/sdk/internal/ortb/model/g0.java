package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import Wf.C1247f;
import com.applovin.shadow.okio.Segment;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f28810a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28811b;

    static {
        g0 g0Var = new g0();
        f28810a = g0Var;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.Player", g0Var, 13);
        c1244d0.j("skip", true);
        c1244d0.j("close", false);
        c1244d0.j("progress_bar", true);
        c1244d0.j("mute", false);
        c1244d0.j("cta", true);
        c1244d0.j("is_all_area_clickable", false);
        c1244d0.j("auto_store", true);
        c1244d0.j("vast_privacy_icon", true);
        c1244d0.j("dec", true);
        c1244d0.j("countdown_timer", true);
        c1244d0.j("android_inline", true);
        c1244d0.j("auto_inline", true);
        c1244d0.j("inline_button", true);
        f28811b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        C1893g c1893g = C1893g.f28808a;
        return new KSerializer[]{AbstractC2641B.u(c1893g), c1893g, AbstractC2641B.u(C1887a.f28768a), e0.f28796a, AbstractC2641B.u(C1911z.f28881a), C1247f.f15596a, AbstractC2641B.u(C1902p.f28853a), AbstractC2641B.u(C1895i.f28832a), AbstractC2641B.u(E.f28702a), AbstractC2641B.u(C.f28691a), AbstractC2641B.u(C1898l.f28843a), AbstractC2641B.u(C1900n.f28847a), AbstractC2641B.u(Y.f28759a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1894h c1894h;
        C1244d0 c1244d0 = f28811b;
        Vf.a aVarB = decoder.b(c1244d0);
        D d3 = null;
        C1899m c1899m = null;
        C1901o c1901o = null;
        C1894h c1894h2 = null;
        C1894h c1894h3 = null;
        C1888b c1888b = null;
        f0 f0Var = null;
        A a5 = null;
        Z z2 = null;
        C1903q c1903q = null;
        C1896j c1896j = null;
        F f10 = null;
        int i5 = 0;
        boolean z10 = true;
        boolean zY = false;
        while (z10) {
            int iM = aVarB.m(c1244d0);
            switch (iM) {
                case -1:
                    z10 = false;
                    c1894h2 = c1894h2;
                    i5 = i5;
                    continue;
                case 0:
                    i5 |= 1;
                    c1894h2 = (C1894h) aVarB.B(c1244d0, 0, C1893g.f28808a, c1894h2);
                    continue;
                case 1:
                    c1894h = c1894h2;
                    c1894h3 = (C1894h) aVarB.D(c1244d0, 1, C1893g.f28808a, c1894h3);
                    i5 |= 2;
                    break;
                case 2:
                    c1894h = c1894h2;
                    c1888b = (C1888b) aVarB.B(c1244d0, 2, C1887a.f28768a, c1888b);
                    i5 |= 4;
                    break;
                case 3:
                    c1894h = c1894h2;
                    f0Var = (f0) aVarB.D(c1244d0, 3, e0.f28796a, f0Var);
                    i5 |= 8;
                    break;
                case 4:
                    c1894h = c1894h2;
                    a5 = (A) aVarB.B(c1244d0, 4, C1911z.f28881a, a5);
                    i5 |= 16;
                    break;
                case 5:
                    zY = aVarB.y(c1244d0, 5);
                    i5 |= 32;
                    continue;
                case 6:
                    c1894h = c1894h2;
                    c1903q = (C1903q) aVarB.B(c1244d0, 6, C1902p.f28853a, c1903q);
                    i5 |= 64;
                    break;
                case 7:
                    c1894h = c1894h2;
                    c1896j = (C1896j) aVarB.B(c1244d0, 7, C1895i.f28832a, c1896j);
                    i5 |= 128;
                    break;
                case 8:
                    c1894h = c1894h2;
                    f10 = (F) aVarB.B(c1244d0, 8, E.f28702a, f10);
                    i5 |= 256;
                    break;
                case 9:
                    c1894h = c1894h2;
                    d3 = (D) aVarB.B(c1244d0, 9, C.f28691a, d3);
                    i5 |= 512;
                    break;
                case 10:
                    c1894h = c1894h2;
                    c1899m = (C1899m) aVarB.B(c1244d0, 10, C1898l.f28843a, c1899m);
                    i5 |= Segment.SHARE_MINIMUM;
                    break;
                case 11:
                    c1894h = c1894h2;
                    c1901o = (C1901o) aVarB.B(c1244d0, 11, C1900n.f28847a, c1901o);
                    i5 |= 2048;
                    break;
                case 12:
                    c1894h = c1894h2;
                    z2 = (Z) aVarB.B(c1244d0, 12, Y.f28759a, z2);
                    i5 |= 4096;
                    break;
                default:
                    throw new Sf.i(iM);
            }
            c1894h2 = c1894h;
        }
        aVarB.c(c1244d0);
        return new h0(i5, c1894h2, c1894h3, c1888b, f0Var, a5, zY, c1903q, c1896j, f10, d3, c1899m, c1901o, z2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28811b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        h0 value = (h0) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28811b;
        Vf.b bVarB = encoder.b(c1244d0);
        boolean zA = bVarB.A(c1244d0, 0);
        C1894h c1894h = value.f28820a;
        if (zA || c1894h != null) {
            bVarB.i(c1244d0, 0, C1893g.f28808a, c1894h);
        }
        bVarB.f(c1244d0, 1, C1893g.f28808a, value.f28821b);
        boolean zA2 = bVarB.A(c1244d0, 2);
        C1888b c1888b = value.f28822c;
        if (zA2 || c1888b != null) {
            bVarB.i(c1244d0, 2, C1887a.f28768a, c1888b);
        }
        bVarB.f(c1244d0, 3, e0.f28796a, value.f28823d);
        boolean zA3 = bVarB.A(c1244d0, 4);
        A a5 = value.f28824e;
        if (zA3 || a5 != null) {
            bVarB.i(c1244d0, 4, C1911z.f28881a, a5);
        }
        bVarB.x(c1244d0, 5, value.f28825f);
        boolean zA4 = bVarB.A(c1244d0, 6);
        C1903q c1903q = value.f28826g;
        if (zA4 || c1903q != null) {
            bVarB.i(c1244d0, 6, C1902p.f28853a, c1903q);
        }
        boolean zA5 = bVarB.A(c1244d0, 7);
        C1896j c1896j = value.f28827h;
        if (zA5 || c1896j != null) {
            bVarB.i(c1244d0, 7, C1895i.f28832a, c1896j);
        }
        boolean zA6 = bVarB.A(c1244d0, 8);
        F f10 = value.f28828i;
        if (zA6 || f10 != null) {
            bVarB.i(c1244d0, 8, E.f28702a, f10);
        }
        boolean zA7 = bVarB.A(c1244d0, 9);
        D d3 = value.f28829j;
        if (zA7 || d3 != null) {
            bVarB.i(c1244d0, 9, C.f28691a, d3);
        }
        boolean zA8 = bVarB.A(c1244d0, 10);
        C1899m c1899m = value.k;
        if (zA8 || c1899m != null) {
            bVarB.i(c1244d0, 10, C1898l.f28843a, c1899m);
        }
        boolean zA9 = bVarB.A(c1244d0, 11);
        C1901o c1901o = value.f28830l;
        if (zA9 || c1901o != null) {
            bVarB.i(c1244d0, 11, C1900n.f28847a, c1901o);
        }
        boolean zA10 = bVarB.A(c1244d0, 12);
        Z z2 = value.f28831m;
        if (zA10 || z2 != null) {
            bVarB.i(c1244d0, 12, Y.f28759a, z2);
        }
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
