package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import E5.Q;
import Ef.H;
import Ef.S;
import Hf.C0588a0;
import Hf.Z;
import Hf.e0;
import Hf.j0;
import Hf.k0;
import Hf.u0;
import Hf.v0;
import Hf.x0;
import R1.q;
import R8.C0805a;
import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.K;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.K0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.L0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.I;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class h implements n, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g {

    /* renamed from: A, reason: collision with root package name */
    public int f32026A;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i f32027a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f32028b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f32029c;

    /* renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k f32030d;

    /* renamed from: e, reason: collision with root package name */
    public final Kd.a f32031e;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f32032f;

    /* renamed from: g, reason: collision with root package name */
    public final j0 f32033g;

    /* renamed from: h, reason: collision with root package name */
    public final String f32034h;

    /* renamed from: i, reason: collision with root package name */
    public final x0 f32035i;

    /* renamed from: j, reason: collision with root package name */
    public final x0 f32036j;
    public final x0 k;

    /* renamed from: l, reason: collision with root package name */
    public final e0 f32037l;

    /* renamed from: m, reason: collision with root package name */
    public final x0 f32038m;

    /* renamed from: n, reason: collision with root package name */
    public int f32039n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f32040o;

    /* renamed from: p, reason: collision with root package name */
    public final String f32041p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f32042q;

    /* renamed from: r, reason: collision with root package name */
    public final b7.k f32043r;

    /* renamed from: s, reason: collision with root package name */
    public final C0805a f32044s;

    /* renamed from: t, reason: collision with root package name */
    public final x0 f32045t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f32046u;

    /* renamed from: v, reason: collision with root package name */
    public final x0 f32047v;

    /* renamed from: w, reason: collision with root package name */
    public final x0 f32048w;

    /* renamed from: x, reason: collision with root package name */
    public final l f32049x;

    /* renamed from: y, reason: collision with root package name */
    public final q f32050y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f32051z;

    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, java.util.List] */
    public h(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, boolean z2, Boolean bool, int i5, boolean z10, boolean z11, Context context, com.moloco.sdk.internal.services.events.c customUserEventBuilderService, G0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar) {
        Object xVar;
        int i10 = 3;
        int i11 = 1;
        int i12 = 0;
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(customUserEventBuilderService, "customUserEventBuilderService");
        AbstractC3340k.e(externalLinkHandler, "externalLinkHandler");
        this.f32027a = iVar;
        this.f32028b = z10;
        this.f32029c = z11;
        this.f32030d = kVar;
        Lf.e eVar = S.f3698a;
        Kd.a aVarC = H.c(Jf.n.f6132a);
        this.f32031e = aVarC;
        j0 j0VarB = k0.b(0, 0, 7);
        this.f32032f = j0VarB;
        this.f32033g = j0VarB;
        String absolutePath = iVar.f31991d;
        this.f32034h = absolutePath;
        x0 x0VarC = k0.c(Boolean.valueOf(z2));
        this.f32035i = x0VarC;
        this.f32036j = x0VarC;
        x0 x0VarC2 = k0.c(new z(Long.valueOf(0)));
        this.k = x0VarC2;
        this.f32037l = new e0(x0VarC2);
        Boolean bool2 = Boolean.FALSE;
        this.f32038m = k0.c(bool2);
        boolean z12 = com.moloco.sdk.service_locator.g.a().f30316b;
        this.f32040o = z12;
        if (!z12) {
            absolutePath = iVar.f31989b.getAbsolutePath();
            AbstractC3340k.d(absolutePath, "getAbsolutePath(...)");
        }
        this.f32041p = absolutePath;
        this.f32042q = iVar.f31992e != null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h hVar = iVar.f31994g;
        this.f32043r = new b7.k(hVar != null ? hVar.f31984e : null, hVar != null ? hVar.f31985f : null);
        I i13 = hVar != null ? hVar.f31980a : null;
        C0805a c0805a = new C0805a(i13, hVar != null ? Integer.valueOf(hVar.f31981b) : null, hVar != null ? Integer.valueOf(hVar.f31982c) : null, hVar != null ? hVar.f31983d : null, aVarC, context, customUserEventBuilderService, externalLinkHandler, new e(this, i12), new e(this, i11));
        this.f32044s = c0805a;
        x0 x0VarC3 = k0.c(bool2);
        this.f32045t = x0VarC3;
        this.f32046u = k0.x(new C0588a0(x0VarC3, (e0) c0805a.f10443h, new K(i10, null, i10)), aVarC, new u0(), null);
        x0 x0VarC4 = k0.c(bool2);
        this.f32047v = x0VarC4;
        this.f32048w = x0VarC4;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k kVar2 = iVar.f31993f;
        this.f32049x = new l(customUserEventBuilderService, kVar2.f31997a, kVar2.f31998b, kVar2.f31999c, kVar2.f32000d, kVar2.f32001e, kVar2.f32002f, kVar2.f32003g, kVar2.f32004h, kVar2.f32005i, kVar2.f32006j, kVar2.k, kVar2.f32007l, kVar2.f32008m, kVar2.f32009n, kVar2.f32010o);
        k0.u(new Z(x0VarC4, new f(this, null), 0), aVarC);
        if (AbstractC3340k.a(bool, bool2)) {
            xVar = null;
        } else if (AbstractC3340k.a(bool, Boolean.TRUE)) {
            xVar = new x(i5 * 1000);
        } else {
            if (bool != null) {
                throw new Q((byte) 0, 9);
            }
            xVar = iVar.f31988a;
        }
        q qVar = new q();
        qVar.f10158b = xVar;
        Lf.e eVar2 = S.f3698a;
        qVar.f10159c = H.c(Jf.n.f6132a);
        qVar.f10162f = k0.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e.f31979a);
        this.f32050y = qVar;
    }

    public final void a(d dVar) {
        H.D(this.f32031e, null, new g(this, dVar, null), 3);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public final void b(boolean z2, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g lastClickPosition) {
        String str = this.f32027a.f31992e;
        if (str != null) {
            if (z2) {
                Integer numValueOf = Integer.valueOf(this.f32026A);
                l lVar = this.f32049x;
                lVar.getClass();
                AbstractC3340k.e(lastClickPosition, "lastClickPosition");
                ?? r22 = lVar.f32058b;
                if (r22 != 0) {
                    ArrayList arrayListB = lVar.f32066j.b();
                    L0 l02 = lVar.k;
                    l02.getClass();
                    com.moloco.sdk.internal.services.events.c customUserEventBuilderService = lVar.f32057a;
                    AbstractC3340k.e(customUserEventBuilderService, "customUserEventBuilderService");
                    if (!r22.isEmpty()) {
                        H.D(l02.f31237b, null, new K0(r22, customUserEventBuilderService, lastClickPosition, l02, arrayListB, null, numValueOf, this.f32034h, null), 3);
                    }
                    lVar.f32058b = null;
                }
            }
            this.f32030d.a(str);
            a(b.f32014a);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public final void destroy() {
        H.j(this.f32031e, null);
        this.f32044s.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g
    public final v0 l() {
        return (x0) this.f32050y.f10162f;
    }
}
