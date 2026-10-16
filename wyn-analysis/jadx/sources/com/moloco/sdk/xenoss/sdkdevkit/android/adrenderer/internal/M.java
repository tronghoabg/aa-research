package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import Hf.InterfaceC0603m;
import android.graphics.Rect;
import android.view.View;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class M extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public Rect f29988a;

    /* renamed from: b, reason: collision with root package name */
    public int f29989b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f29990c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f29991d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(View view, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29991d = view;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        M m10 = new M(this.f29991d, interfaceC3103c);
        m10.f29990c = obj;
        return m10;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        ((M) create((InterfaceC0603m) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
        return kf.a.f39711a;
    }

    /* JADX WARN: Path cross not found for [B:13:0x003e, B:16:0x0046], limit reached: 22 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[PHI: r1 r5
  0x0058: PHI (r1v2 android.graphics.Rect) = (r1v3 android.graphics.Rect), (r1v4 android.graphics.Rect) binds: [B:18:0x0055, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0058: PHI (r5v2 Hf.m) = (r5v3 Hf.m), (r5v5 Hf.m) binds: [B:18:0x0055, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0064 -> B:11:0x0036). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r8.f29989b
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L29
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            android.graphics.Rect r1 = r8.f29988a
            java.lang.Object r5 = r8.f29990c
            Hf.m r5 = (Hf.InterfaceC0603m) r5
            Fe.e.U(r9)
            goto L36
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            android.graphics.Rect r1 = r8.f29988a
            java.lang.Object r5 = r8.f29990c
            Hf.m r5 = (Hf.InterfaceC0603m) r5
            Fe.e.U(r9)
            goto L58
        L29:
            Fe.e.U(r9)
            java.lang.Object r9 = r8.f29990c
            r5 = r9
            Hf.m r5 = (Hf.InterfaceC0603m) r5
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r4, r4, r4, r4)
        L36:
            android.view.View r9 = r8.f29991d
            boolean r6 = r9.isShown()
            if (r6 == 0) goto L46
            boolean r9 = r9.getGlobalVisibleRect(r1)
            if (r9 == 0) goto L46
            r9 = r3
            goto L47
        L46:
            r9 = r4
        L47:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r8.f29990c = r5
            r8.f29988a = r1
            r8.f29989b = r3
            java.lang.Object r9 = r5.emit(r9, r8)
            if (r9 != r0) goto L58
            goto L66
        L58:
            r8.f29990c = r5
            r8.f29988a = r1
            r8.f29989b = r2
            r6 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r9 = Ef.H.m(r6, r8)
            if (r9 != r0) goto L36
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.M.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
