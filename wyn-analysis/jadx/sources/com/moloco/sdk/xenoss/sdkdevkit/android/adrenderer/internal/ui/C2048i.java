package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C2048i implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30875a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tf.a f30876b;

    public /* synthetic */ C2048i(tf.a aVar, int i5) {
        this.f30875a = i5;
        this.f30876b = aVar;
    }

    @Override // tf.a
    public final Object invoke() {
        switch (this.f30875a) {
            case 0:
                this.f30876b.invoke();
                break;
            case 1:
                this.f30876b.invoke();
                break;
            case 2:
                this.f30876b.invoke();
                break;
            default:
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdWebViewRenderer", "Skip button shown callback triggered in MraidAdContainerScreen", null, false, 12, null);
                this.f30876b.invoke();
                break;
        }
        return C2515C.f34653a;
    }
}
