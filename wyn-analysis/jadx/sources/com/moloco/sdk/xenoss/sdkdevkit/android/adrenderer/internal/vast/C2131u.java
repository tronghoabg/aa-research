package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import Hf.InterfaceC0593d;
import Hf.InterfaceC0602l;
import Hf.InterfaceC0603m;
import ef.C2515C;
import jf.InterfaceC3103c;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2131u implements InterfaceC0602l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0593d f32138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f32139b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2093n f32140c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f32141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.common_adapter_internal.a f32142e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f32143f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f32144g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f32145h;

    public C2131u(InterfaceC0593d interfaceC0593d, E e7, C2093n c2093n, double d3, com.moloco.sdk.common_adapter_internal.a aVar, boolean z2, String str, kotlin.jvm.internal.G g9) {
        this.f32138a = interfaceC0593d;
        this.f32139b = e7;
        this.f32140c = c2093n;
        this.f32141d = d3;
        this.f32142e = aVar;
        this.f32143f = z2;
        this.f32144g = str;
        this.f32145h = g9;
    }

    @Override // Hf.InterfaceC0602l
    public final Object collect(InterfaceC0603m interfaceC0603m, InterfaceC3103c interfaceC3103c) {
        Object objCollect = this.f32138a.collect(new C2130t(interfaceC0603m, this.f32139b, this.f32140c, this.f32141d, this.f32142e, this.f32143f, this.f32144g, this.f32145h), interfaceC3103c);
        return objCollect == kf.a.f39711a ? objCollect : C2515C.f34653a;
    }
}
