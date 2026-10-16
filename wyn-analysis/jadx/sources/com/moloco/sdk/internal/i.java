package com.moloco.sdk.internal;

import Cd.C0352u;
import N.C0740o;
import com.moloco.sdk.internal.ortb.model.C1894h;
import com.moloco.sdk.internal.ortb.model.C1903q;
import com.moloco.sdk.internal.ortb.model.D;
import com.moloco.sdk.internal.ortb.model.EnumC1897k;
import com.moloco.sdk.internal.ortb.model.F;
import com.moloco.sdk.internal.ortb.model.S;
import com.moloco.sdk.internal.ortb.model.X;
import com.moloco.sdk.internal.ortb.model.Z;
import com.moloco.sdk.internal.ortb.model.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.C2121s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.G;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.Q;
import com.wynauto.wyn.R;
import e0.C2465q;
import ef.C2532p;
import ef.C2537u;
import ff.AbstractC2641B;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final C2532p f28530a = Fe.c.z(new C0352u(14));

    /* renamed from: b, reason: collision with root package name */
    public static final long f28531b = C2465q.f34375d;

    /* renamed from: c, reason: collision with root package name */
    public static final long f28532c = x.f29792a;

    /* renamed from: d, reason: collision with root package name */
    public static final long f28533d;

    static {
        float f10 = 30;
        f28533d = A6.c.b(f10, f10);
    }

    public static final F4.f a(h0 h0Var, boolean z2) {
        S s10;
        C2537u c2537u;
        int i5 = 0;
        C1894h c1894h = h0Var.f28821b;
        int i10 = c1894h.f28813a;
        F f10 = h0Var.f28828i;
        D d3 = h0Var.f28829j;
        tf.p gVar = f10 == null ? new g(z2, c1894h, d3) : new f(c1894h, h0Var.f28831m, d3, i5);
        float f11 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.k.f32342a;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.f fVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.f(C2465q.f34373b, gVar);
        if (f10 != null && (s10 = f10.f28708e) != null && (c2537u = s10.f28745a) != null) {
            i5 = c2537u.f34686a;
        }
        return new F4.f(i10, fVar, i5, new g(z2, c1894h, (D) null), h0Var.k, h0Var.f28830l);
    }

    public static final Z.d b(X horizontalAlignment, EnumC1897k verticalAlignment) {
        AbstractC3340k.e(horizontalAlignment, "horizontalAlignment");
        AbstractC3340k.e(verticalAlignment, "verticalAlignment");
        EnumC1897k enumC1897k = EnumC1897k.f28839b;
        Z.d dVar = Z.a.f16900a;
        if (verticalAlignment == enumC1897k && (horizontalAlignment == X.f28753b || horizontalAlignment == X.f28756e)) {
            return dVar;
        }
        if (verticalAlignment == enumC1897k && horizontalAlignment == X.f28754c) {
            return Z.a.f16901b;
        }
        if (verticalAlignment == enumC1897k && (horizontalAlignment == X.f28755d || horizontalAlignment == X.f28757f)) {
            return Z.a.f16902c;
        }
        EnumC1897k enumC1897k2 = EnumC1897k.f28840c;
        if (verticalAlignment == enumC1897k2 && (horizontalAlignment == X.f28753b || horizontalAlignment == X.f28756e)) {
            return Z.a.f16903d;
        }
        if (verticalAlignment == enumC1897k2 && horizontalAlignment == X.f28754c) {
            return Z.a.f16904e;
        }
        if (verticalAlignment == enumC1897k2 && (horizontalAlignment == X.f28755d || horizontalAlignment == X.f28757f)) {
            return Z.a.f16905f;
        }
        EnumC1897k enumC1897k3 = EnumC1897k.f28841d;
        return (verticalAlignment == enumC1897k3 && (horizontalAlignment == X.f28753b || horizontalAlignment == X.f28756e)) ? Z.a.f16906g : (verticalAlignment == enumC1897k3 && horizontalAlignment == X.f28754c) ? Z.a.f16907h : (verticalAlignment == enumC1897k3 && (horizontalAlignment == X.f28755d || horizontalAlignment == X.f28757f)) ? Z.a.f16908i : dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.y] */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z c(long j8, long j10, long j11, Z z2, C0740o c0740o) {
        long jB;
        c0740o.M(129538364);
        c0740o.M(-1579299883);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x xVarF = null;
        String lowerCase = null;
        if (z2 != null) {
            String str = z2.f28763c;
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
                AbstractC3340k.d(lowerCase, "toLowerCase(...)");
            }
            boolean z10 = !AbstractC3340k.a(lowerCase, "right");
            Boolean bool = z2.f28762b;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
            String str2 = z2.f28761a;
            if (str2 == null) {
                str2 = "play store";
            }
            String str3 = str2;
            C2465q c2465q = z2.f28764d;
            long j12 = c2465q != null ? c2465q.f34382a : j11;
            C2465q c2465q2 = z2.f28765e;
            long j13 = c2465q2 != null ? c2465q2.f34382a : j10;
            Integer num = z2.f28766f;
            long jE = num != null ? Fe.b.E(num.intValue()) : L0.j.f6810c;
            Integer num2 = z2.f28767g;
            if (num2 != null) {
                float fIntValue = num2.intValue();
                jB = A6.c.b(fIntValue, fIntValue);
            } else {
                jB = j8;
            }
            c0740o.M(1328580925);
            ?? yVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.y(str3, AbstractC2641B.H(R.drawable.double_arrow_24, c0740o), str3, jB, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f31062f, j13, z10, zBooleanValue, j12, jE);
            c0740o.p(false);
            xVarF = yVar;
        }
        c0740o.p(false);
        if (xVarF == null) {
            xVarF = ic.d.f(AbstractC2641B.H(R.drawable.moloco_skip, c0740o), j8, j10, c0740o, 4);
        }
        c0740o.p(false);
        return xVarF;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k d(h0 h0Var) {
        AbstractC3340k.e(h0Var, "<this>");
        F4.f fVarA = a(h0Var, false);
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k(e(h0Var, false), fVarA, fVarA);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s e(h0 h0Var, boolean z2) {
        C2121s c2121s;
        S s10;
        C2537u c2537u;
        int i5 = 2;
        int i10 = 0;
        int i11 = 1;
        boolean z10 = h0Var.f28823d.f28801a;
        C1894h c1894h = h0Var.f28820a;
        Boolean bool = c1894h == null ? null : Boolean.TRUE;
        int i12 = c1894h != null ? c1894h.f28813a : 0;
        C1903q c1903q = h0Var.f28826g;
        boolean z11 = c1903q != null && c1903q.f28855a && c1903q.f28856b;
        boolean z12 = c1903q != null && c1903q.f28855a;
        C1894h c1894h2 = h0Var.f28821b;
        int i13 = c1894h2.f28813a;
        F f10 = h0Var.f28828i;
        int i14 = (f10 == null || (s10 = f10.f28708e) == null || (c2537u = s10.f28745a) == null) ? 0 : c2537u.f34686a;
        tf.p hVar = new h(h0Var, i10);
        tf.p gVar = new g(z2, c1894h2, h0Var.f28829j);
        tf.p hVar2 = new h(h0Var, i11);
        tf.p hVar3 = new h(h0Var, i5);
        tf.p dVar = new Ad.d(i11, h0Var, z2);
        if (h0Var.f28825f) {
            C2532p c2532p = p.f28883a;
            c2121s = null;
        } else {
            c2121s = (C2121s) p.f28883a.getValue();
        }
        tf.p hVar4 = new h(h0Var, 3);
        tf.p hVar5 = new h(h0Var, 4);
        boolean z13 = !z2;
        long j8 = C2465q.f34373b;
        if ((1537 & 2) != 0) {
            hVar = Q.f31792b;
        }
        tf.p pVar = hVar;
        if ((1537 & 4) != 0) {
            gVar = Q.f31793c;
        }
        tf.p pVar2 = gVar;
        if ((1537 & 8) != 0) {
            hVar2 = Q.f31794d;
        }
        tf.p pVar3 = hVar2;
        tf.p pVar4 = (1537 & 16) != 0 ? pVar3 : hVar3;
        if ((1537 & 32) != 0) {
            dVar = Q.f31795e;
        }
        tf.p pVar5 = dVar;
        C2121s c2121s2 = (1537 & 64) != 0 ? null : c2121s;
        tf.p pVar6 = (1537 & 128) != 0 ? Q.f31796f : hVar4;
        if ((1537 & 256) != 0) {
            hVar5 = Q.f31797g;
        }
        tf.p pVar7 = hVar5;
        Q q4 = Q.f31798h;
        C2532p c2532p2 = com.moloco.sdk.service_locator.i.f29853a;
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s(z10, bool, i12, i13, i14, z11, z12, new G(j8, pVar, pVar2, pVar3, pVar4, pVar5, c2121s2, pVar6, pVar7, q4, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S(), (1537 & 2048) != 0 ? true : z13), h0Var.k, h0Var.f28830l);
    }
}
