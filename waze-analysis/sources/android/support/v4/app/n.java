package android.support.v4.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.Settings;
import android.view.View;
import android.widget.ScrollView;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.waze.ConfigManager;
import com.waze.MoodManager;
import com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsRequest;
import com.waze.mg;
import com.waze.navigate.AddressItem;
import com.waze.planned_drive.PlannedDriveFragment;
import com.waze.settings.ew;
import com.waze.settings.tree.views.WazeSettingsView;
import j$.util.function.Consumer$CC;
import java.lang.ref.WeakReference;
import java.util.function.Consumer;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f351a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f352b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f353c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f354d;

    public /* synthetic */ n(cq cqVar, View view, Rect rect, int i2) {
        this.f354d = i2;
        this.f351a = cqVar;
        this.f352b = view;
        this.f353c = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f354d) {
            case 0:
                Object obj = this.f353c;
                ((cq) this.f351a).getBoundsOnScreen((View) this.f352b, (Rect) obj);
                return;
            case 1:
                Object obj2 = this.f351a;
                try {
                    ((com.google.firebase.messaging.f) this.f352b).b((Intent) this.f353c);
                    return;
                } finally {
                    ((com.google.android.gms.o.w) obj2).c(null);
                }
            case 2:
                Object obj3 = this.f351a;
                ((SessionManager) this.f352b).lambda$setApplicationContext$0((Context) this.f353c, (com.google.firebase.perf.session.b) obj3);
                return;
            case 3:
                Object obj4 = this.f351a;
                ((GaugeManager) this.f353c).lambda$stopCollectingGauges$0((String) this.f352b, (com.google.firebase.perf.f.i) obj4);
                return;
            case 4:
                Object obj5 = this.f351a;
                ((GaugeManager) this.f353c).lambda$startCollectingGauges$0((String) this.f352b, (com.google.firebase.perf.f.i) obj5);
                return;
            case 5:
                Object obj6 = this.f351a;
                com.google.firebase.perf.d.f.b((com.google.firebase.perf.d.f) this.f353c, (com.google.firebase.perf.f.r) this.f352b, (com.google.firebase.perf.f.i) obj6);
                return;
            case 6:
                Object obj7 = this.f351a;
                com.google.firebase.perf.d.f.f((com.google.firebase.perf.d.f) this.f353c, (com.google.firebase.perf.f.ao) this.f352b, (com.google.firebase.perf.f.i) obj7);
                return;
            case 7:
                Object obj8 = this.f351a;
                com.google.firebase.perf.d.f.g((com.google.firebase.perf.d.f) this.f353c, (com.google.firebase.perf.f.ab) this.f352b, (com.google.firebase.perf.f.i) obj8);
                return;
            case 8:
                int i2 = com.google.firebase.remoteconfig.internal.n.f10711c;
                Object obj9 = this.f352b;
                Object obj10 = this.f351a;
                ((com.google.firebase.messaging.b) ((com.google.firebase.messaging.l) this.f353c).f10212a).c((String) obj9, (com.google.firebase.remoteconfig.internal.h) obj10);
                return;
            case 9:
                Object obj11 = this.f352b;
                ((ConfigManager) this.f353c).lambda$setConfigValueString$0((com.waze.config.d) this.f351a, (String) obj11);
                return;
            case 10:
                Object obj12 = this.f352b;
                ((MoodManager) this.f353c).lambda$refreshMoodsList$0((MoodManager.Mood[]) this.f351a, (MoodManager.Mood[]) obj12);
                return;
            case 11:
                Object obj13 = this.f351a;
                PlannedDriveFragment.n((PlannedDriveFragment) this.f352b, (LoadPlannedDriveOptionsRequest) this.f353c, (AddressItem) obj13);
                return;
            case 12:
                Object obj14 = this.f353c;
                ((ScrollView) this.f351a).smoothScrollTo(0, ((View) obj14).getTop() - ((int) (((com.waze.reports.ax) this.f352b).f33668k * 100.0f)));
                return;
            case 13:
                Object obj15 = this.f351a;
                com.waze.sdk.ae.r((com.waze.sdk.ae) this.f352b, (View) this.f353c, (View) obj15);
                return;
            case 14:
                Object obj16 = this.f351a;
                com.waze.sdk.bi.x((com.waze.sdk.bi) this.f352b, (Resources) this.f353c, (com.waze.search.h.ay) obj16);
                return;
            case 15:
                Object obj17 = this.f353c;
                Object obj18 = this.f352b;
                com.waze.sharedui.a.e eVar = (com.waze.sharedui.a.e) obj17;
                final ew ewVar = (ew) this.f351a;
                final WazeSettingsView wazeSettingsView = (WazeSettingsView) obj18;
                final com.waze.ifs.ui.a aVar = (com.waze.ifs.ui.a) obj17;
                final Consumer consumer = new Consumer() { // from class: com.waze.settings.fk
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void u(Object obj19) {
                        ew.e(ewVar, wazeSettingsView, aVar, ((Boolean) obj19).booleanValue());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                };
                if (Settings.canDrawOverlays(mg.a())) {
                    consumer.u(true);
                    return;
                }
                Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:".concat(String.valueOf(eVar.getPackageName()))));
                final int iE = com.waze.utils.o.e(com.waze.utils.f.ACTIVITY_RESULT);
                final WeakReference weakReference = new WeakReference(eVar);
                com.waze.sharedui.a.e.aN(iE, new com.waze.sharedui.a.a() { // from class: com.waze.settings.gt
                    @Override // com.waze.sharedui.a.a
                    public final void a(int i3) {
                        Context context = (Context) weakReference.get();
                        if (i3 != iE || context == null) {
                            return;
                        }
                        consumer.u(Boolean.valueOf(Settings.canDrawOverlays(context)));
                    }
                });
                eVar.startActivityForResult(intent, iE);
                return;
            default:
                Object obj19 = this.f351a;
                ((e.a.d.bh) this.f352b).f46663h.e((com.waze.uid.f) this.f353c, (e.a.cm) obj19);
                return;
        }
    }

    public /* synthetic */ n(com.waze.reports.ax axVar, ScrollView scrollView, View view, int i2) {
        this.f354d = i2;
        this.f352b = axVar;
        this.f351a = scrollView;
        this.f353c = view;
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i2) {
        this.f354d = i2;
        this.f352b = obj;
        this.f353c = obj2;
        this.f351a = obj3;
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i2, byte[] bArr) {
        this.f354d = i2;
        this.f353c = obj;
        this.f352b = obj2;
        this.f351a = obj3;
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i2, char[] cArr) {
        this.f354d = i2;
        this.f353c = obj;
        this.f351a = obj2;
        this.f352b = obj3;
    }
}
