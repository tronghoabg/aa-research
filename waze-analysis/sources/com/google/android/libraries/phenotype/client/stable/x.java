package com.google.android.libraries.phenotype.client.stable;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Location;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.waze.CalendarApprovedActivity;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.SimpleListMenuActivity;
import com.waze.beacons.BeaconsNativeManager;
import com.waze.feedback.FeedbackActivity;
import com.waze.inbox.InboxRecycler;
import com.waze.jni.protos.EtaLabelRequest;
import com.waze.navigate.bx;
import com.waze.realtime.RealtimeNativeManager;
import com.waze.sharedui.views.OvalButton;
import com.waze.view.popups.RequestAlwaysLocationDialogActivity;
import com.waze.web.SimpleWebActivity;
import j$.util.Objects;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f6161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6162b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f6163c;

    public /* synthetic */ x(Object obj, Object obj2, int i2) {
        this.f6163c = i2;
        this.f6161a = obj;
        this.f6162b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.waze.view.text.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.waze.hv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [com.waze.location.o, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        SharedPreferences.Editor editorEdit = null;
        Object[] objArr = 0;
        switch (this.f6163c) {
            case 0:
                Map mapB = z.b(((com.google.android.libraries.phenotype.client.h) this.f6161a).a());
                Object obj = this.f6162b;
                if (!mapB.containsKey(obj)) {
                    Log.e("FilePhenotypeFlags", "Config package " + ((String) obj) + " cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
                    break;
                }
                break;
            case 1:
                SharedPreferences sharedPreferencesA = al.a((Context) this.f6161a);
                for (Map.Entry<String, ?> entry : sharedPreferencesA.getAll().entrySet()) {
                    if (entry.getValue() instanceof String) {
                        if (entry.getValue().equals(this.f6162b)) {
                            if (editorEdit == null) {
                                editorEdit = sharedPreferencesA.edit();
                            }
                            editorEdit.remove(entry.getKey());
                        }
                    }
                }
                if (editorEdit != null) {
                    editorEdit.commit();
                    break;
                }
                break;
            case 2:
                final com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
                com.waze.ab.o oVar = new com.waze.ab.o();
                oVar.Q(aVarA.c(R.string.CALENDAR_SYNCED_TITLE, new Object[0]));
                oVar.P(aVarA.c(R.string.CALENDAR_SYNCED_BODY, new Object[0]));
                oVar.M(aVarA.c(R.string.CALENDAR_SYNCED_OK, new Object[0]));
                oVar.N(aVarA.c(R.string.CALENDAR_SYNCED_LEARN_MORE, new Object[0]));
                Object obj2 = this.f6162b;
                Object obj3 = this.f6161a;
                final CalendarApprovedActivity calendarApprovedActivity = (CalendarApprovedActivity) obj3;
                final NativeManager nativeManager = (NativeManager) obj2;
                oVar.f13808a = new com.waze.ab.q() { // from class: com.waze.ah
                    @Override // com.waze.ab.q
                    public final void onClick(boolean z) {
                        CalendarApprovedActivity calendarApprovedActivity2 = calendarApprovedActivity;
                        if (z) {
                            CalendarChangeReceiver.a(calendarApprovedActivity2, true);
                            if (ix.m(calendarApprovedActivity2)) {
                                calendarApprovedActivity2.finish();
                                return;
                            } else {
                                RequestAlwaysLocationDialogActivity.n(calendarApprovedActivity2, com.waze.view.popups.n.f45329c, 1031);
                                return;
                            }
                        }
                        com.waze.shared_infra.o.a aVar = aVarA;
                        NativeManager nativeManager2 = nativeManager;
                        calendarApprovedActivity2.finish();
                        Intent intent = new Intent(calendarApprovedActivity2, (Class<?>) SimpleWebActivity.class);
                        intent.putExtra("webViewURL", nativeManager2.getCalendarLearnMoreUrl());
                        intent.putExtra("webViewTitle", aVar.c(R.string.CALENDAR_SYNCED_LEARN_MORE_TITLE, new Object[0]));
                        calendarApprovedActivity2.startActivityForResult(intent, 0);
                    }
                };
                oVar.y(false);
                com.waze.z.a.d.ai.r(oVar, (com.waze.sharedui.a.e) obj3);
                break;
            case 3:
                ((NativeManager) this.f6161a).lambda$getETALabel$0((EtaLabelRequest) this.f6162b);
                break;
            case 4:
                ((NativeManager) this.f6161a).lambda$shouldShowTypingWhileDrivingWarning$0(this.f6162b);
                break;
            case 5:
                ((NativeManager) this.f6162b).lambda$getCurrentLineForReporting$0(this.f6161a);
                break;
            case 6:
                com.waze.sharedui.a.e eVar = (com.waze.sharedui.a.e) this.f6162b;
                boolean zIsFinishing = eVar.isFinishing();
                Object obj4 = this.f6161a;
                if (zIsFinishing || !eVar.aK()) {
                    Objects.requireNonNull(obj4);
                    eVar.aD(new com.google.android.material.internal.o(obj4, 6));
                    break;
                } else {
                    ((Dialog) obj4).show();
                    break;
                }
                break;
            case 7:
                Object obj5 = this.f6161a;
                int i2 = SimpleListMenuActivity.f13560f;
                int iC = com.waze.design_components.d.b.c((View) obj5);
                LinearLayout linearLayout = (LinearLayout) this.f6162b;
                linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), iC);
                break;
            case 8:
                ((NativeManager) this.f6161a).logAnalyticsAdsContextNTV((String) this.f6162b);
                break;
            case 9:
                ((BeaconsNativeManager) this.f6162b).processEntry((com.waze.beacons.d) this.f6161a);
                break;
            case 10:
                Context context = (Context) this.f6161a;
                ((com.waze.car_lib.c.a) this.f6162b).f19215a.reportAuditEvent(new com.waze.sharedui.b.a(i.b.a.p.WAZE_PERMISSION_LOCATION, i.b.a.m.SYETEM_PRIVILEGES, (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) ? i.b.a.o.ENABLED : i.b.a.o.DISABLED, "", h.a.i.h()));
                break;
            case 11:
                Object obj6 = this.f6162b;
                org.a.d.a.a aVar = (org.a.d.a.a) obj6;
                if (aVar instanceof org.a.d.a.b) {
                    bVarC = ((org.a.d.a.b) aVar).l();
                    int i3 = h.g.b.ar.f48106a;
                    mVar = new h.g.b.m(RealtimeNativeManager.class);
                } else {
                    bVarC = aVar.getKoin().a().c();
                    int i4 = h.g.b.ar.f48106a;
                    mVar = new h.g.b.m(RealtimeNativeManager.class);
                }
                ((RealtimeNativeManager) bVarC.a(mVar, null, null)).runOnRealtimeInitialized(new x(obj6, this.f6161a, 10, objArr == true ? 1 : 0));
                break;
            case 12:
                int iC2 = com.waze.design_components.d.b.c((View) this.f6162b);
                RecyclerView recyclerView = (RecyclerView) this.f6161a;
                recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), iC2);
                break;
            case 13:
                ((OvalButton) this.f6161a).A();
                ((OvalButton) this.f6162b).A();
                break;
            case 14:
                ((FeedbackActivity) this.f6161a).f().d((String) this.f6162b);
                break;
            case 15:
                ((InboxRecycler) this.f6162b).aY((com.waze.inbox.j) this.f6161a, false);
                break;
            case 16:
                ((InboxRecycler) this.f6162b).aY((com.waze.inbox.j) this.f6161a, true);
                break;
            case 17:
                Location lastLocation = this.f6161a.getLastLocation();
                if (lastLocation != null && lastLocation.hasSpeed()) {
                    kotlinx.coroutines.a.ab.e((kotlinx.coroutines.a.ag) this.f6162b, Float.valueOf(lastLocation.getSpeed()));
                    break;
                }
                break;
            case 18:
                com.waze.main.navigate.e.i((com.waze.main.navigate.e) this.f6161a, (com.waze.main_screen.l.b.i) this.f6162b);
                break;
            case 19:
                ((com.waze.main_screen.bottom_bars.scrollable_eta.h) this.f6161a).f25972k.d((bx) this.f6162b);
                break;
            default:
                ((com.waze.main_screen.g.d) this.f6161a).e((com.waze.main_screen.g.j) this.f6162b);
                break;
        }
    }

    public /* synthetic */ x(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f6163c = i2;
        this.f6162b = obj;
        this.f6161a = obj2;
    }
}
