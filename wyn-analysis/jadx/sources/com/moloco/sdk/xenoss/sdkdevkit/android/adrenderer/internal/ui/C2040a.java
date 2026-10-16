package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C2040a implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G0 f30855b;

    public /* synthetic */ C2040a(G0 g02, int i5) {
        this.f30854a = i5;
        this.f30855b = g02;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        String it = (String) obj;
        switch (this.f30854a) {
            case 0:
                AbstractC3340k.e(it, "it");
                this.f30855b.a("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html");
                break;
            default:
                AbstractC3340k.e(it, "it");
                this.f30855b.a("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html");
                break;
        }
        return C2515C.f34653a;
    }
}
