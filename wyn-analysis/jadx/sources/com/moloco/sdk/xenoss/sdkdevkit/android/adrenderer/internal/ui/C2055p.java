package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import Hf.InterfaceC0603m;
import N.V;
import ef.C2515C;
import ef.C2537u;
import jf.InterfaceC3103c;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2055p implements InterfaceC0603m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V f30964b;

    public /* synthetic */ C2055p(V v2, int i5) {
        this.f30963a = i5;
        this.f30964b = v2;
    }

    @Override // Hf.InterfaceC0603m
    public final Object emit(Object obj, InterfaceC3103c interfaceC3103c) {
        switch (this.f30963a) {
            case 0:
                this.f30964b.setValue(Integer.valueOf(((Number) obj).intValue()));
                break;
            case 1:
                int i5 = ((C2537u) obj).f34686a;
                ((tf.a) this.f30964b.getValue()).invoke();
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f30964b.setValue(bool);
                break;
        }
        return C2515C.f34653a;
    }
}
