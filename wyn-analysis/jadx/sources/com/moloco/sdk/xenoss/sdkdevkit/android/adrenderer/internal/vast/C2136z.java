package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import Hf.InterfaceC0593d;
import Hf.InterfaceC0602l;
import Hf.InterfaceC0603m;
import ef.C2515C;
import jf.InterfaceC3103c;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2136z implements InterfaceC0602l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0593d f32201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f32202b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E f32203c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f32204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f32205e;

    public C2136z(InterfaceC0593d interfaceC0593d, boolean z2, E e7, String str, kotlin.jvm.internal.G g9) {
        this.f32201a = interfaceC0593d;
        this.f32202b = z2;
        this.f32203c = e7;
        this.f32204d = str;
        this.f32205e = g9;
    }

    @Override // Hf.InterfaceC0602l
    public final Object collect(InterfaceC0603m interfaceC0603m, InterfaceC3103c interfaceC3103c) {
        Object objCollect = this.f32201a.collect(new C2135y(interfaceC0603m, this.f32202b, this.f32203c, this.f32204d, this.f32205e), interfaceC3103c);
        return objCollect == kf.a.f39711a ? objCollect : C2515C.f34653a;
    }
}
