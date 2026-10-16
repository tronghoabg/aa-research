package S8;

import C6.l;
import E5.T;
import Hf.j0;
import N1.B;
import N1.C0754c;
import N1.E;
import N1.H;
import N1.z;
import Q1.g;
import Q1.o;
import R1.p;
import V1.i;
import V5.n;
import V5.u;
import V5.x;
import W9.D;
import W9.F;
import X.m;
import android.R;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import b7.k;
import com.applovin.applovin_max.AppLovinMAX;
import com.applovin.applovin_max.AppLovinMAXAdView;
import com.applovin.applovin_max.AppLovinMAXNativeAdView;
import com.applovin.impl.i5;
import com.applovin.impl.sdk.c;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinCmpService;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import flutter.overlay.window.flutter_overlay_window.OverlayService;
import g.C2653a;
import g.InterfaceC2654b;
import java.io.IOException;
import java.util.concurrent.ScheduledFuture;
import k1.r;
import k1.v0;
import k2.C3168z;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import okhttp3.EventListener;
import s2.AbstractC3991a;
import s2.C;
import t.InterfaceC4035a;
import uc.C4278o;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Continuation, g, x, OnCompleteListener, p, SuccessContinuation, EventListener.Factory, InterfaceC4279p, AppLovinCmpService.OnCompletedListener, InterfaceC4035a, c.b, InterfaceC2654b, r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11027a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11028b;

    public /* synthetic */ b(V1.a aVar, Object obj, int i5) {
        this.f11027a = i5;
        this.f11028b = obj;
    }

    @Override // com.applovin.impl.sdk.c.b
    public void a(c.a aVar) {
        ((com.applovin.impl.sdk.d) this.f11028b).c(aVar);
    }

    @Override // t.InterfaceC4035a
    public Object apply(Object obj) {
        return com.applovin.impl.sdk.ad.b.a((com.applovin.impl.sdk.ad.d) this.f11028b, (i5) obj);
    }

    @Override // R1.p
    public void b(long j8, o oVar) {
        AbstractC3991a.f(j8, oVar, (C[]) ((k) this.f11028b).f19397c);
    }

    public void c() {
        AbstractC3343n abstractC3343n = (AbstractC3343n) this.f11028b;
        synchronized (m.f15718b) {
            m.f15723g = ff.o.A0((Iterable) m.f15723g, abstractC3343n);
        }
    }

    @Override // Q1.g
    public void invoke(Object obj) {
        switch (this.f11027a) {
            case 1:
                ((H) obj).w((z) this.f11028b);
                break;
            case 2:
                ((H) obj).v((C0754c) this.f11028b);
                break;
            case 3:
                ((H) obj).u((P1.c) this.f11028b);
                break;
            case 4:
                ((H) obj).w(((U1.r) this.f11028b).f12116a.L);
                break;
            case 5:
                ((H) obj).o((B) this.f11028b);
                break;
            case 6:
            default:
                i iVar = (i) obj;
                iVar.getClass();
                iVar.f12945v = ((h2.g) this.f11028b).f36019a;
                break;
            case 7:
                i iVar2 = (i) obj;
                int i5 = iVar2.f12947x;
                H5.e eVar = (H5.e) this.f11028b;
                iVar2.f12947x = i5 + eVar.f4911h;
                iVar2.f12948y += eVar.f4909f;
                break;
            case 8:
                ((i) obj).f12937n = (E) this.f11028b;
                break;
        }
    }

    @Override // g.InterfaceC2654b
    public void onActivityResult(Object obj) {
        Object obj2 = this.f11028b;
        C2653a c2653a = (C2653a) obj;
        switch (this.f11027a) {
            case 27:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVar = ((MraidActivity) obj2).f30377g;
                if (oVar == null) {
                    AbstractC3340k.m("storeInstallerImpl");
                    throw null;
                }
                int i5 = c2653a.f35454a;
                oVar.a();
                return;
            default:
                j0 j0Var = VastActivity.f31299e;
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, "VastActivity", "Activity result received: resultCode=" + c2653a.f35454a, null, false, 12, null);
                MolocoLogger.info$default(molocoLogger, "VastActivity", "Activity result received: resultData=" + c2653a.f35455b, null, false, 12, null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVar2 = ((VastActivity) obj2).f31308d;
                if (oVar2 != null) {
                    oVar2.a();
                    return;
                } else {
                    AbstractC3340k.m("storeInstallerImpl");
                    throw null;
                }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f11027a) {
            case 13:
                D.b((Intent) this.f11028b);
                break;
            case 14:
                ((F) this.f11028b).f15304b.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) this.f11028b).cancel(false);
                break;
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService.OnCompletedListener
    public void onCompleted(AppLovinCmpError appLovinCmpError) {
        AppLovinMAX.lambda$showCmpForExistingUser$1((InterfaceC4280q) this.f11028b, appLovinCmpError);
    }

    @Override // uc.InterfaceC4279p
    public void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        Object obj = this.f11028b;
        switch (this.f11027a) {
            case 21:
                OverlayService overlayService = OverlayService.f35437q;
                OverlayService overlayService2 = (OverlayService) obj;
                if (!c4278o.f46759a.equals("updateFlag")) {
                    String str = c4278o.f46759a;
                    if (!str.equals("updateOverlayPosition")) {
                        if (str.equals("resizeOverlay")) {
                            int iIntValue = ((Integer) c4278o.a("width")).intValue();
                            int iIntValue2 = ((Integer) c4278o.a("height")).intValue();
                            boolean zBooleanValue = ((Boolean) c4278o.a("enableDrag")).booleanValue();
                            if (overlayService2.f35442d == null) {
                                ((tc.g) interfaceC4280q).a(Boolean.FALSE);
                                break;
                            } else {
                                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) overlayService2.f35443e.getLayoutParams();
                                layoutParams.width = (iIntValue == -1999 || iIntValue == -1) ? -1 : overlayService2.a(iIntValue);
                                if (iIntValue2 != 1999 || iIntValue2 != -1) {
                                    iIntValue2 = overlayService2.a(iIntValue2);
                                }
                                layoutParams.height = iIntValue2;
                                S3.f.k = zBooleanValue;
                                overlayService2.f35442d.updateViewLayout(overlayService2.f35443e, layoutParams);
                                ((tc.g) interfaceC4280q).a(Boolean.TRUE);
                                break;
                            }
                        }
                    } else {
                        overlayService2.b(((Integer) c4278o.a("x")).intValue(), ((Integer) c4278o.a("y")).intValue(), (tc.g) interfaceC4280q);
                        break;
                    }
                } else {
                    String string = c4278o.a("flag").toString();
                    if (overlayService2.f35442d == null) {
                        ((tc.g) interfaceC4280q).a(Boolean.FALSE);
                        break;
                    } else {
                        S3.f.G(string);
                        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) overlayService2.f35443e.getLayoutParams();
                        layoutParams2.flags = S3.f.f10945d | R.attr.accessibilityEventTypes;
                        if (Build.VERSION.SDK_INT < 31 || S3.f.f10945d != overlayService2.f35446h) {
                            layoutParams2.alpha = 1.0f;
                        } else {
                            layoutParams2.alpha = 0.8f;
                        }
                        overlayService2.f35442d.updateViewLayout(overlayService2.f35443e, layoutParams2);
                        ((tc.g) interfaceC4280q).a(Boolean.TRUE);
                        break;
                    }
                }
                break;
            case 22:
            default:
                ((AppLovinMAXNativeAdView) obj).lambda$new$0(c4278o, (tc.g) interfaceC4280q);
                break;
            case 23:
                ((AppLovinMAXAdView) obj).lambda$new$0(c4278o, (tc.g) interfaceC4280q);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws IOException {
        switch (this.f11027a) {
            case 0:
                ((Runnable) this.f11028b).run();
                return Tasks.forResult(null);
            case 12:
                ((l) this.f11028b).getClass();
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            default:
                return (aa.p) ((Task) this.f11028b).getResult();
        }
    }

    @Override // k1.r
    public v0 v(View view, v0 v0Var) {
        return AndroidWebViewContainer.applySafeAreaInsets$lambda$6((AndroidWebViewContainer) this.f11028b, view, v0Var);
    }

    public /* synthetic */ b(V1.a aVar, C3168z c3168z, h2.g gVar, IOException iOException, boolean z2) {
        this.f11027a = 9;
        this.f11028b = gVar;
    }

    @Override // V5.x
    public int a(Object obj) {
        try {
            return ((n) obj).c((T) this.f11028b) ? 1 : 0;
        } catch (u unused) {
            return -1;
        }
    }

    public /* synthetic */ b(Object obj, int i5) {
        this.f11027a = i5;
        this.f11028b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(tf.p pVar) {
        this.f11027a = 16;
        this.f11028b = (AbstractC3343n) pVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult((aa.g) this.f11028b);
    }
}
