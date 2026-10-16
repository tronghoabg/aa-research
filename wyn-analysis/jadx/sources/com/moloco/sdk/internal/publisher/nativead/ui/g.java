package com.moloco.sdk.internal.publisher.nativead.ui;

import Ef.H;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.EnumC1449m;
import androidx.lifecycle.V;
import com.moloco.sdk.internal.C1880b;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v;
import ef.C2515C;
import ef.C2529m;
import ef.C2530n;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.Nullable;
import u0.L;

/* loaded from: classes4.dex */
public final class g extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final q f29262a;

    /* renamed from: b, reason: collision with root package name */
    public final C1880b f29263b;

    /* renamed from: c, reason: collision with root package name */
    public L f29264c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, q vastAdController, S s10, C1880b c1880b, v vVar, S8.d dVar) {
        super(context);
        AbstractC3340k.e(vastAdController, "vastAdController");
        this.f29262a = vastAdController;
        this.f29263b = c1880b;
        V.d dVar2 = new V.d(1867022133, true, new f(vVar, this, dVar, s10));
        L l10 = new L(context);
        l10.setContent(new V.d(1870157091, true, new d(dVar2, 1)));
        addView(l10, new ViewGroup.LayoutParams(-1, -1));
        this.f29264c = l10;
    }

    public static /* synthetic */ void getVideoView$annotations() {
    }

    @Nullable
    public final L getVideoView() {
        return this.f29264c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "VideoContainer", "onAttachedToWindow", null, false, 12, null);
        C1880b c1880b = this.f29263b;
        c1880b.getClass();
        Bf.g gVar = new Bf.g(4, this, c1880b);
        Kd.a aVar = com.moloco.sdk.internal.scheduling.c.f29368a;
        H.D(com.moloco.sdk.internal.scheduling.c.f29368a, null, new com.moloco.sdk.internal.scheduling.b(gVar, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "VideoContainer", "onDetachedFromWindow", null, false, 12, null);
        C1880b c1880b = this.f29263b;
        c1880b.getClass();
        View rootView = getRootView();
        if (rootView == null) {
            MolocoLogger.warn$default(molocoLogger, "ViewLifecycleOwner", "RootView is absent, skipping", null, false, 12, null);
            return;
        }
        if (AbstractC3340k.a(tg.b.y(rootView), c1880b)) {
            MolocoLogger.info$default(molocoLogger, "ViewLifecycleOwner", "Removing ViewTreeSavedStateRegistryOwner", null, false, 12, null);
            tg.b.O(rootView, null);
        }
        if (AbstractC3340k.a(V.e(rootView), c1880b)) {
            MolocoLogger.info$default(molocoLogger, "ViewLifecycleOwner", "Removing ViewTreeLifecycleOwner", null, false, 12, null);
            V.h(rootView, null);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        Object objZ = C2515C.f34653a;
        C1880b c1880b = this.f29263b;
        if (!z2) {
            c1880b.getClass();
            View rootView = getRootView();
            AbstractC3340k.b(rootView);
            if (AbstractC3340k.a(V.e(rootView), c1880b)) {
                try {
                    c1880b.f28489a.f(EnumC1449m.ON_PAUSE);
                } catch (Throwable th) {
                    objZ = Fe.e.z(th);
                }
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                StringBuilder sb2 = new StringBuilder("lifecycle pause success ");
                sb2.append(!(objZ instanceof C2529m));
                MolocoLogger.info$default(molocoLogger, "ViewLifecycleOwner", sb2.toString(), C2530n.a(objZ), false, 8, null);
                return;
            }
            return;
        }
        c1880b.getClass();
        View rootView2 = getRootView();
        AbstractC3340k.b(rootView2);
        if (AbstractC3340k.a(V.e(rootView2), c1880b)) {
            try {
                c1880b.f28489a.f(EnumC1449m.ON_RESUME);
            } catch (Throwable th2) {
                objZ = Fe.e.z(th2);
            }
            if (!(objZ instanceof C2529m)) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "lifecycle resume success", null, false, 12, null);
            }
            Throwable thA = C2530n.a(objZ);
            if (thA != null) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "lifecycle resume failure", thA, false, 8, null);
            }
        }
    }

    public final void setVideoView(@Nullable L l10) {
        this.f29264c = l10;
    }
}
