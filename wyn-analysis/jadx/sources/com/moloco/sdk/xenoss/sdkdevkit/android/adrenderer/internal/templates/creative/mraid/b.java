package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid;

import ac.C1346a;
import com.bumptech.glide.f;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class b extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f30605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f30606b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30606b = fVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        b bVar = new b(this.f30606b, interfaceC3103c);
        bVar.f30605a = ((Boolean) obj).booleanValue();
        return bVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        b bVar = (b) create(bool, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        bVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        boolean z2 = this.f30605a;
        C1346a c1346a = (C1346a) this.f30606b.f24234e;
        c1346a.getClass();
        c1346a.J("mraidbridge.setIsViewable(" + z2 + ')');
        return C2515C.f34653a;
    }
}
