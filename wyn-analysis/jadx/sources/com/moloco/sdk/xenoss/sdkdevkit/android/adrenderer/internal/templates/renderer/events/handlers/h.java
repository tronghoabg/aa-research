package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import Ef.E;
import Jd.C0672f;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class h extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f30685a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f30686b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f30687c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0672f f30688d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, i iVar, String str2, C0672f c0672f, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30685a = str;
        this.f30686b = iVar;
        this.f30687c = str2;
        this.f30688d = c0672f;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new h(this.f30685a, this.f30686b, this.f30687c, this.f30688d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        h hVar = (h) create((E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        hVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        byte[] bytes = this.f30685a.getBytes(Bf.a.f1670a);
        AbstractC3340k.d(bytes, "getBytes(...)");
        this.f30686b.f30689a.a(this.f30687c, bytes, this.f30688d, null);
        return C2515C.f34653a;
    }
}
