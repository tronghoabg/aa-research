package com.waze.beacons;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.v7.app.ap;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.sdk.bd;
import com.waze.sdk.bh;
import com.waze.settings.ba;
import com.waze.settings.tree.views.WazeSettingsView;
import com.waze.sharedui.views.ad;
import com.waze.trip_overview.views.trip_details_container.TripOverviewDetailsList;
import com.waze.ui.navbar.LaneGuidanceView;
import com.waze.ui.z.as;
import com.waze.uid.aa;
import com.waze.uid.c.bt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f16277a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f16278b;

    public /* synthetic */ p(Object obj, int i2) {
        this.f16278b = i2;
        this.f16277a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [h.g.a.a, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16278b) {
            case 0:
                u.api_turn_on_asyncJNI$lambda$0((u) this.f16277a);
                break;
            case 1:
                ((BeaconsNativeManager) this.f16277a).dumpEntries();
                break;
            case 2:
                u.api_get_status_asyncJNI$lambda$0((u) this.f16277a);
                break;
            case 3:
                u.api_stopJNI$lambda$0((u) this.f16277a);
                break;
            case 4:
                ((bd) this.f16277a).W();
                break;
            case 5:
                bd bdVar = (bd) this.f16277a;
                bdVar.f35316h.post(new com.waze.g.f(bdVar, 20));
                break;
            case 6:
                bh bhVar = (bh) this.f16277a;
                bhVar.f35327a.A(bhVar.f35328b);
                break;
            case 7:
                ?? r2 = this.f16277a;
                int i2 = ba.f36843a;
                r2.invoke();
                break;
            case 8:
                WazeSettingsView wazeSettingsView = (WazeSettingsView) this.f16277a;
                if (wazeSettingsView.isAttachedToWindow()) {
                    wazeSettingsView.D(false);
                    break;
                }
                break;
            case 9:
                ((com.waze.settings.f.a.e) this.f16277a).e();
                break;
            case 10:
                View view = (View) this.f16277a;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                x.d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = as.f(-8);
                view.setLayoutParams(layoutParams2);
                break;
            case 11:
                com.waze.sharedui.d.b.b((com.waze.sharedui.d.b) this.f16277a);
                break;
            case 12:
                ((ap) this.f16277a).dismiss();
                break;
            case 13:
                View view2 = (View) this.f16277a;
                Context context = view2.getContext();
                x.e(context, "getContext(...)");
                InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(context, InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(view2, 1);
                    break;
                }
                break;
            case 14:
                ad.j((ad) this.f16277a);
                break;
            case 15:
                Object obj = this.f16277a;
                TripOverviewDetailsList tripOverviewDetailsList = (TripOverviewDetailsList) obj;
                tripOverviewDetailsList.c();
                ((RecyclerView) tripOverviewDetailsList.findViewById(R.id.routeDetailsRecycler)).ai(((com.waze.trip_overview.views.trip_details_container.q) obj).k().a());
                break;
            case 16:
                LaneGuidanceView.a((LaneGuidanceView) this.f16277a);
                break;
            case 17:
                ((aa) this.f16277a).f44049k.eraseAllAddressItems();
                break;
            case 18:
                ((bt) this.f16277a).F();
                break;
            case 19:
                ((ObjectAnimator) this.f16277a).start();
                break;
            default:
                ((com.waze.view.navbar.i) this.f16277a).k();
                break;
        }
    }
}
