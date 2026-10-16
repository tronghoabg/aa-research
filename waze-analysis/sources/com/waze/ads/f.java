package com.waze.ads;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.fe;
import com.waze.NativeManager;
import com.waze.map.isolated.v;
import com.waze.navbar.p;
import com.waze.planned_drive.PlannedDriveFragment;
import com.waze.planned_drive.ay;
import com.waze.realtime.RealtimeNativeManager;
import com.waze.reports.AddPlaceFlowActivity;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f14025a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f14026b;

    public /* synthetic */ f(Object obj, int i2) {
        this.f14026b = i2;
        this.f14025a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v4, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [h.g.a.a, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14026b) {
            case 0:
                g.handleExternalPoiFailedLoadingJNI$lambda$0((g) this.f14025a);
                break;
            case 1:
                int i2 = v.f29256b;
                boolean zN = x.n(Looper.myLooper(), Looper.getMainLooper());
                ?? r6 = this.f14025a;
                if (!zN) {
                    new Handler(Looper.getMainLooper()).postAtFrontOfQueue(r6);
                    break;
                } else {
                    r6.run();
                    break;
                }
            case 2:
                this.f14025a.invoke();
                break;
            case 3:
                this.f14025a.invoke();
                break;
            case 4:
                com.waze.mywaze.l.i((com.waze.mywaze.l) this.f14025a);
                break;
            case 5:
                com.waze.navbar.f.e((com.waze.navbar.f) this.f14025a);
                break;
            case 6:
                com.waze.navbar.f.h((com.waze.navbar.f) this.f14025a);
                break;
            case 7:
                com.waze.navbar.f.i((com.waze.navbar.f) this.f14025a);
                break;
            case 8:
                ((com.waze.navbar.f) this.f14025a).n.setTranslationX(0.0f);
                break;
            case 9:
                ((com.waze.navbar.f) this.f14025a).f30880g.setVisibility(8);
                break;
            case 10:
                ((com.waze.navbar.f) this.f14025a).s.setVisibility(8);
                break;
            case 11:
                ((com.waze.navbar.f) this.f14025a).o.setTranslationY(0.0f);
                break;
            case 12:
                p.i((p) this.f14025a);
                break;
            case 13:
                com.waze.sharedui.f.h hVar = (com.waze.sharedui.f.h) this.f14025a;
                RealtimeNativeManager.getInstance().setLoginData(hVar.e(), hVar.c(), hVar.d(), hVar.a(), hVar.b());
                break;
            case 14:
                ((PlannedDriveFragment) this.f14025a).o.stopNavigation();
                break;
            case 15:
                ((PlannedDriveFragment) this.f14025a).H(false);
                break;
            case 16:
                ((ay) this.f14025a).N();
                break;
            case 17:
                ((fe) this.f14025a).setIsRecyclable(true);
                break;
            case 18:
                AddPlaceFlowActivity addPlaceFlowActivity = (AddPlaceFlowActivity) this.f14025a;
                addPlaceFlowActivity.B = NativeManager.getInstance().getAddressByLocationNTV(addPlaceFlowActivity.o.b(), addPlaceFlowActivity.o.a());
                break;
            case 19:
                ((AddPlaceFlowActivity) this.f14025a).finish();
                break;
            default:
                AddPlaceFlowActivity.s((AddPlaceFlowActivity) this.f14025a);
                break;
        }
    }
}
