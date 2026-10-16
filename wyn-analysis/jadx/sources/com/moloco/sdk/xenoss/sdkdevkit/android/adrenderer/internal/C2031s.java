package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import Hf.InterfaceC0603m;
import ef.C2515C;
import jf.InterfaceC3103c;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2031s implements InterfaceC0603m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y2.B f30501b;

    public /* synthetic */ C2031s(Y2.B b5, int i5) {
        this.f30500a = i5;
        this.f30501b = b5;
    }

    @Override // Hf.InterfaceC0603m
    public final Object emit(Object obj, InterfaceC3103c interfaceC3103c) {
        switch (this.f30500a) {
            case 0:
                this.f30501b.b();
                break;
            case 1:
                this.f30501b.a();
                break;
            default:
                this.f30501b.a();
                break;
        }
        return C2515C.f34653a;
    }
}
