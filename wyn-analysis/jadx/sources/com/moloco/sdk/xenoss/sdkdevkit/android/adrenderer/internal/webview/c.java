package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import Hf.InterfaceC0592c0;
import Hf.x0;
import ef.C2515C;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0592c0 f32286b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tf.a f32287c;

    public /* synthetic */ c(InterfaceC0592c0 interfaceC0592c0, tf.a aVar, int i5) {
        this.f32285a = i5;
        this.f32286b = interfaceC0592c0;
        this.f32287c = aVar;
    }

    @Override // tf.a
    public final Object invoke() {
        C2515C c2515c = C2515C.f34653a;
        tf.a aVar = this.f32287c;
        InterfaceC0592c0 interfaceC0592c0 = this.f32286b;
        switch (this.f32285a) {
            case 0:
                if (((Boolean) ((x0) interfaceC0592c0).getValue()).booleanValue()) {
                    aVar.invoke();
                    break;
                }
                break;
            case 1:
                if (((Boolean) ((x0) interfaceC0592c0).getValue()).booleanValue()) {
                    aVar.invoke();
                    break;
                }
                break;
            case 2:
                if (((Boolean) ((x0) interfaceC0592c0).getValue()).booleanValue()) {
                    aVar.invoke();
                    break;
                }
                break;
            default:
                float f10 = k.f32342a;
                if (((Boolean) ((x0) interfaceC0592c0).getValue()).booleanValue()) {
                    aVar.invoke();
                    break;
                }
                break;
        }
        return c2515c;
    }
}
