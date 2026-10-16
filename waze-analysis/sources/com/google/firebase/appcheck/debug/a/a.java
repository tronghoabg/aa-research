package com.google.firebase.appcheck.debug.a;

import android.support.v4.media.MediaMetadataCompat;
import android.view.View;
import android.widget.ScrollView;
import com.google.android.gms.o.w;
import com.google.firebase.e;
import com.waze.main_screen.g.d;
import com.waze.main_screen.g.j;
import com.waze.map.bs;
import com.waze.menus.SideMenuAutoCompleteRecycler;
import com.waze.menus.SideMenuSearchBar;
import com.waze.menus.i;
import com.waze.planned_drive.PlannedDriveFragment;
import com.waze.realtime.RealtimeNativeManager;
import com.waze.reports.ax;
import com.waze.reports.di;
import com.waze.reports_v2.presentation.ap;
import com.waze.reports_v2.presentation.av;
import com.waze.reports_v2.presentation.ba;
import com.waze.sdk.an;
import com.waze.sdk.bd;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f8881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8882b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f8883c;

    public /* synthetic */ a(Object obj, Object obj2, int i2) {
        this.f8883c = i2;
        this.f8881a = obj;
        this.f8882b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v22, types: [com.waze.shared_infra.s.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v10, types: [h.g.a.a, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8883c) {
            case 0:
                b.c((e) this.f8881a, (w) this.f8882b);
                break;
            case 1:
                d.j((d) this.f8882b, (j) this.f8881a);
                break;
            case 2:
                ((bs) this.f8882b).c().invoke(this.f8881a);
                break;
            case 3:
                ((SideMenuAutoCompleteRecycler) this.f8881a).bf((i) this.f8882b);
                break;
            case 4:
                ((SideMenuSearchBar) this.f8882b).f29625a.setHint((String) this.f8881a);
                break;
            case 5:
                ?? r0 = this.f8881a;
                Object objInvoke = this.f8882b.invoke();
                if (r0 != 0) {
                    r0.invoke(objInvoke);
                    break;
                }
                break;
            case 6:
                PlannedDriveFragment.q((PlannedDriveFragment) this.f8881a, (View) this.f8882b);
                break;
            case 7:
                ((RealtimeNativeManager) this.f8882b).lambda$runOnRealtimeInitialized$0(this.f8881a);
                break;
            case 8:
                ((ScrollView) this.f8882b).scrollTo(0, ((ax) this.f8881a).x);
                break;
            case 9:
                ((ScrollView) this.f8882b).scrollTo(0, (int) (((ax) this.f8881a).f33668k * 20.0f));
                break;
            case 10:
                ((ScrollView) this.f8882b).scrollTo(0, (int) (((ax) this.f8881a).f33668k * 20.0f));
                break;
            case 11:
                di.x((di) this.f8882b, this.f8881a);
                break;
            case 12:
                ((ap) this.f8882b).z((ba) this.f8881a);
                break;
            case 13:
                ((ap) this.f8882b).y(((av) this.f8881a).a());
                break;
            case 14:
                ap.l((ap) this.f8882b, this.f8881a);
                break;
            case 15:
                ((ap) this.f8882b).y((ba) this.f8881a);
                break;
            case 16:
                ap.f((ap) this.f8882b, (ba) this.f8881a);
                break;
            case 17:
                ap.k((ap) this.f8882b, this.f8881a);
                break;
            case 18:
                ap.e((ap) this.f8882b, this.f8881a);
                break;
            case 19:
                bd.h((bd) this.f8881a, (MediaMetadataCompat) this.f8882b);
                break;
            default:
                bd.r((bd) this.f8881a, (an) this.f8882b);
                break;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f8883c = i2;
        this.f8882b = obj;
        this.f8881a = obj2;
    }
}
