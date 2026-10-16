package com.google.android.material.internal;

import android.app.Dialog;
import android.content.res.Resources;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.common.api.internal.bc;
import com.waze.MainActivity;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.config.PreferencesConfigNativeManager;
import com.waze.favorites.AddHomeWorkActivity;
import com.waze.favorites.FavoritesActivity;
import com.waze.favorites.v;
import com.waze.gp;
import com.waze.kj;
import com.waze.map.NativeCanvasRenderer;
import com.waze.navigate.DriveToNativeManager;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f6618a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f6619b;

    public /* synthetic */ o(Object obj, int i2) {
        this.f6619b = i2;
        this.f6618a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r5v26, types: [h.g.a.a, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        int i2 = 9;
        switch (this.f6619b) {
            case 0:
                View view = (View) this.f6618a;
                t.s(view).showSoftInput(view, 1);
                break;
            case 1:
                ((MainActivity) this.f6618a).aQ();
                break;
            case 2:
                ((NativeManager) this.f6618a).lambda$showTypingWhileDrivingWarningIfNeeded$0();
                break;
            case 3:
                ((NativeManager) this.f6618a).lambda$shutDown$0();
                break;
            case 4:
                ((NativeManager) this.f6618a).lambda$startLocation$0();
                break;
            case 5:
                kj.i((kj) this.f6618a);
                break;
            case 6:
                ((Dialog) this.f6618a).show();
                break;
            case 7:
                PreferencesConfigNativeManager.getInstance().getWebUrlWhiteList(new com.airbnb.lottie.b.q(this.f6618a, i2));
                break;
            case 8:
                ((NativeManager) this.f6618a).logAnalyticsAdsContextClearNTV();
                break;
            case 9:
                ((NativeManager) this.f6618a).logAnalyticsAdsContextNavigationSaveNTV();
                break;
            case 10:
                this.f6618a.a(ab.f48028a);
                break;
            case 11:
                ((com.waze.car_lib.login.m) this.f6618a).a();
                break;
            case 12:
                NativeCanvasRenderer.w();
                ((com.waze.car_lib.i.f) this.f6618a).f20163a.ResetDisplay(NativeCanvasRenderer.a(), new bc(i2));
                break;
            case 13:
                this.f6618a.invoke();
                break;
            case 14:
                com.waze.app_nav.hub.b.c cVarA = com.waze.app_nav.hub.b.c.f15258a.a();
                String string = ((com.waze.sharedui.c.c) this.f6618a).d().toString();
                x.f(cVarA, "popupManager");
                x.f(string, "url");
                String str = "DeepLinkUpgradeDialog";
                cVarA.b(new com.waze.app_nav.hub.b.k(str, null, new gp(string, 3), 6));
                break;
            case 15:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f6618a;
                if (lottieAnimationView.q()) {
                    lottieAnimationView.g();
                    break;
                }
                break;
            case 16:
                int i3 = AddHomeWorkActivity.f23778f;
                NativeManager.getInstance().OpenProgressIconPopup((String) this.f6618a, R.drawable.bigblue_v_icon, 2000);
                break;
            case 17:
                AddHomeWorkActivity.l((AddHomeWorkActivity) this.f6618a);
                break;
            case 18:
                ((FavoritesActivity) this.f6618a).f23785k.j().notifyDataSetChanged();
                break;
            case 19:
                ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).storeAddressItem(((v) this.f6618a).f23832c, false, null);
                break;
            default:
                com.waze.google_assistant.b.a((com.waze.google_assistant.b) this.f6618a);
                break;
        }
    }
}
