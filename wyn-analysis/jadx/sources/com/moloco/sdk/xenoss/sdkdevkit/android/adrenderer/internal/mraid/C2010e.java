package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import Hf.j0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity;
import ef.C2515C;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C3330a;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C2010e extends C3330a implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30399a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2010e(int i5, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i5, obj, cls, str, str2, i10);
        this.f30399a = i11;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C2515C c2515c = C2515C.f34653a;
        switch (this.f30399a) {
            case 0:
                MraidActivity mraidActivity = (MraidActivity) this.receiver;
                j0 j0Var = MraidActivity.f30371h;
                mraidActivity.u((B) obj);
                break;
            default:
                FullscreenWebviewActivity fullscreenWebviewActivity = (FullscreenWebviewActivity) this.receiver;
                WeakReference weakReference = FullscreenWebviewActivity.f30710d;
                fullscreenWebviewActivity.E((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b) obj);
                break;
        }
        return c2515c;
    }
}
