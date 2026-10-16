package C;

import kotlin.jvm.internal.AbstractC3340k;
import p0.t;

/* loaded from: classes.dex */
public final class e implements L0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1713a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1714b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1715c;

    /* renamed from: d, reason: collision with root package name */
    public final Nf.d f1716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L0.b f1717e;

    public e(t density) {
        AbstractC3340k.e(density, "density");
        this.f1717e = density;
        this.f1716d = new Nf.d(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(lf.AbstractC3464c r5) {
        /*
            r4 = this;
            int r0 = r4.f1713a
            switch(r0) {
                case 0: goto L56;
                default: goto L5;
            }
        L5:
            boolean r0 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a
            if (r0 == 0) goto L18
            r0 = r5
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a) r0
            int r1 = r0.f31935d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f31935d = r1
            goto L1d
        L18:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a
            r0.<init>(r4, r5)
        L1d:
            java.lang.Object r5 = r0.f31933b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f31935d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            C.e r0 = r0.f31932a
            Fe.e.U(r5)
            goto L4f
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L36:
            Fe.e.U(r5)
            boolean r5 = r4.f1714b
            if (r5 != 0) goto L4e
            boolean r5 = r4.f1715c
            if (r5 != 0) goto L4e
            r0.f31932a = r4
            r0.f31935d = r3
            Nf.d r5 = r4.f1716d
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L4e
            goto L55
        L4e:
            r0 = r4
        L4f:
            boolean r5 = r0.f1714b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
        L55:
            return r1
        L56:
            boolean r0 = r5 instanceof C.d
            if (r0 == 0) goto L69
            r0 = r5
            C.d r0 = (C.d) r0
            int r1 = r0.f1712d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L69
            int r1 = r1 - r2
            r0.f1712d = r1
            goto L6e
        L69:
            C.d r0 = new C.d
            r0.<init>(r4, r5)
        L6e:
            java.lang.Object r5 = r0.f1710b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f1712d
            r3 = 1
            if (r2 == 0) goto L87
            if (r2 != r3) goto L7f
            C.e r0 = r0.f1709a
            Fe.e.U(r5)
            goto La0
        L7f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L87:
            Fe.e.U(r5)
            boolean r5 = r4.f1714b
            if (r5 != 0) goto L9f
            boolean r5 = r4.f1715c
            if (r5 != 0) goto L9f
            r0.f1709a = r4
            r0.f1712d = r3
            Nf.d r5 = r4.f1716d
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L9f
            goto La6
        L9f:
            r0 = r4
        La0:
            boolean r5 = r0.f1714b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: C.e.a(lf.c):java.lang.Object");
    }

    @Override // L0.b
    public final float b() {
        switch (this.f1713a) {
            case 0:
                return this.f1717e.b();
            default:
                return ((t) this.f1717e).f43179d.b();
        }
    }

    @Override // L0.b
    public final float getFontScale() {
        switch (this.f1713a) {
            case 0:
                return this.f1717e.getFontScale();
            default:
                return ((t) this.f1717e).f43179d.getFontScale();
        }
    }

    @Override // L0.b
    public final int j(float f10) {
        switch (this.f1713a) {
            case 0:
                return this.f1717e.j(f10);
            default:
                return ((t) this.f1717e).f43179d.j(f10);
        }
    }

    @Override // L0.b
    public final float l(long j8) {
        switch (this.f1713a) {
            case 0:
                return this.f1717e.l(j8);
            default:
                return ((t) this.f1717e).f43179d.l(j8);
        }
    }

    @Override // L0.b
    public final float t(float f10) {
        switch (this.f1713a) {
            case 0:
                return this.f1717e.t(f10);
            default:
                return ((t) this.f1717e).f43179d.t(f10);
        }
    }

    @Override // L0.b
    public final long y(long j8) {
        switch (this.f1713a) {
            case 0:
                return this.f1717e.y(j8);
            default:
                return ((t) this.f1717e).f43179d.y(j8);
        }
    }

    public e(L0.b density) {
        AbstractC3340k.e(density, "density");
        this.f1717e = density;
        this.f1716d = new Nf.d(false);
    }
}
