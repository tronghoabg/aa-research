package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.L0;
import ef.C2515C;
import java.util.ArrayList;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2104a extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.i f31849a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2104a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.i iVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31849a = iVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2104a(this.f31849a, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C2104a c2104a = (C2104a) create((Ef.E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c2104a.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.i iVar = this.f31849a;
        C8.i iVar2 = iVar.f31693j;
        ArrayList arrayList = (ArrayList) iVar2.f1941d;
        if (arrayList != null) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.G.g((L0) iVar2.f1943f, arrayList, null, 14);
            iVar2.f1941d = null;
        }
        iVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.f31674a);
        return C2515C.f34653a;
    }
}
