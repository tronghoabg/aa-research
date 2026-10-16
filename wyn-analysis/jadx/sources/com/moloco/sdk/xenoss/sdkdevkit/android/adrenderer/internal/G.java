package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class G extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public Ef.L f29937a;

    /* renamed from: b, reason: collision with root package name */
    public int f29938b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f29939c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ H f29940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g f29941e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f29942f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(H h10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar, long j8, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29940d = h10;
        this.f29941e = gVar;
        this.f29942f = j8;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        G g9 = new G(this.f29940d, this.f29941e, this.f29942f, interfaceC3103c);
        g9.f29939c = obj;
        return g9;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0109, code lost:
    
        if (r1 != r3) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a  */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
