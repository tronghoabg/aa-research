package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import Ef.E;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.I;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.G;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class v extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G f32093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f32094b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(G g9, I i5, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f32093a = g9;
        this.f32094b = i5;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new v(this.f32093a, this.f32094b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        v vVar = (v) create((E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        vVar.invokeSuspend(c2515c);
        return c2515c;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kf.a r0 = kf.a.f39711a
            Fe.e.U(r5)
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.I r5 = r4.f32094b
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC3340k.e(r5, r0)
            boolean r0 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.F
            r1 = 1
            java.lang.String r2 = "mraid.js"
            if (r0 == 0) goto L22
            Bf.i r0 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y0.f32363a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.F r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.F) r5
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o r5 = r5.f31463a
            java.lang.String r5 = r5.f31495a
            boolean r0 = Bf.k.n0(r5, r2, r1)
            if (r0 == 0) goto L53
            goto L54
        L22:
            boolean r0 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.G
            if (r0 == 0) goto L35
            Bf.i r0 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y0.f32363a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.G r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.G) r5
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p r5 = r5.f31464a
            java.lang.String r5 = r5.f31496a
            boolean r0 = Bf.k.n0(r5, r2, r1)
            if (r0 == 0) goto L53
            goto L54
        L35:
            boolean r0 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.H
            if (r0 == 0) goto L5b
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.H r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.H) r5
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A r5 = r5.f31465a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n r0 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n.f31493b
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n r3 = r5.f31433b
            if (r3 != r0) goto L53
            Bf.i r0 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y0.f32363a
            java.lang.String r0 = "adm"
            java.lang.String r5 = r5.f31432a
            kotlin.jvm.internal.AbstractC3340k.e(r5, r0)
            boolean r0 = Bf.k.n0(r5, r2, r1)
            if (r0 == 0) goto L53
            goto L54
        L53:
            r5 = 0
        L54:
            kotlin.jvm.internal.G r0 = r4.f32093a
            r0.f39740a = r5
            ef.C r5 = ef.C2515C.f34653a
            return r5
        L5b:
            E5.Q r5 = new E5.Q
            r0 = 9
            r1 = 0
            r5.<init>(r1, r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
