package com.google.android.apps.auto.carservice.car.window.composition;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.a;
import defpackage.afck;
import defpackage.affa;
import defpackage.afyh;
import defpackage.ahnc;
import defpackage.aizz;
import defpackage.dty;
import defpackage.ebh;
import defpackage.edb;
import defpackage.edc;
import defpackage.edd;
import defpackage.ehs;
import defpackage.jit;
import defpackage.jja;
import defpackage.jje;
import defpackage.jjf;
import defpackage.jjl;
import defpackage.kwp;
import defpackage.ob;
import defpackage.ype;
import defpackage.yph;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 6B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u00067"}, d2 = {"Lcom/google/android/apps/auto/carservice/car/window/composition/ProjectionRootActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "callback", "Lcom/google/android/apps/auto/carservice/car/window/composition/RelayHostCallback;", "rootLayout", "Landroid/widget/FrameLayout;", "contentContainer", "getContentContainer$java_com_google_android_apps_auto_carservice_car_window_composition_relay_composer$annotations", "getContentContainer$java_com_google_android_apps_auto_carservice_car_window_composition_relay_composer", "()Landroid/widget/FrameLayout;", "setContentContainer$java_com_google_android_apps_auto_carservice_car_window_composition_relay_composer", "(Landroid/widget/FrameLayout;)V", "windowViews", "", "", "Lcom/google/android/apps/auto/carservice/car/window/composition/ProjectionSurfaceView;", "appliedPixelAspectRatio", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onUiStateChanged", "state", "Lcom/google/android/apps/auto/carservice/car/window/composition/RelayUiState;", "onUiStateChanged$java_com_google_android_apps_auto_carservice_car_window_composition_relay_composer", "removeOrphanedViews", "currentIds", "", "createOrUpdateViews", "windows", "", "Lcom/google/android/apps/auto/carservice/car/window/composition/WindowData;", "backgroundColor", "createProjectionSurfaceView", "windowId", "hostCallback", "createProjectionSurfaceView$java_com_google_android_apps_auto_carservice_car_window_composition_relay_composer", "onDestroy", "logSurfaceViewState", "dumpViewHierarchy", "view", "Landroid/view/View;", "depth", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "applyPixelAspectRatio", "par", "applyDisplayGeometry", "geometry", "Lcom/google/android/apps/auto/carservice/car/window/composition/DisplayGeometry;", "Companion", "java.com.google.android.apps.auto.carservice.car.window.composition_relay_composer"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public class ProjectionRootActivity extends ob {
    public static final yph a = yph.c("CAR.WM.ProjRootAct");
    public jjf b;
    public FrameLayout c;
    public FrameLayout d;
    public final Map e = new LinkedHashMap();
    private float m = -1.0f;

    public final FrameLayout a() {
        FrameLayout frameLayout = this.d;
        if (frameLayout != null) {
            return frameLayout;
        }
        affa.d("contentContainer");
        return null;
    }

    public final void b(jit jitVar) {
        int i;
        int i2;
        int i3 = jitVar.c;
        if (i3 <= 0 || (i = jitVar.d) <= 0) {
            throw new IllegalStateException("Usable dimensions must be positive: " + i3 + "x" + jitVar.d);
        }
        int i4 = jitVar.a;
        if (i4 < 0 || (i2 = jitVar.b) < 0) {
            throw new IllegalStateException("Margins must be non-negative: left=" + i4 + ", top=" + jitVar.b);
        }
        float f = jitVar.e;
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalStateException(a.bG(f, "Pixel aspect ratio must be positive: "));
        }
        ViewGroup.LayoutParams layoutParams = a().getLayoutParams();
        layoutParams.getClass();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2.leftMargin != i4 || layoutParams2.topMargin != i2 || layoutParams2.width != i3 || layoutParams2.height != i) {
            ((ype) a.f()).af(Integer.valueOf(layoutParams2.leftMargin), Integer.valueOf(layoutParams2.topMargin), Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(layoutParams2.width), Integer.valueOf(layoutParams2.height), Integer.valueOf(i3), Integer.valueOf(i));
            layoutParams2.leftMargin = i4;
            layoutParams2.topMargin = i2;
            layoutParams2.width = i3;
            layoutParams2.height = i;
            a().setLayoutParams(layoutParams2);
        }
        float f2 = this.m;
        if (f2 == f) {
            return;
        }
        ((ype) a.f()).z("onUiStateChanged: dynamic PAR updated from %f to %f", f2, f);
        this.m = f;
        if (f != 1.0f) {
            a().setPivotX(BitmapDescriptorFactory.HUE_RED);
            a().setPivotY(BitmapDescriptorFactory.HUE_RED);
            if (f > 1.0f) {
                a().setScaleX(1.0f / f);
                a().setScaleY(1.0f);
            } else {
                a().setScaleX(1.0f);
                a().setScaleY(f);
            }
        }
    }

    public final void c(View view, int i, List list, StringBuilder sb) {
        Object obj;
        Object next;
        String str;
        String strValueOf;
        String strValueOf2;
        String strD = afyh.d("  ", i);
        Iterator it = this.e.entrySet().iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
                if (((Map.Entry) next).getValue() == view) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        Integer num = entry != null ? (Integer) entry.getKey() : null;
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            int i2 = ((jjl) next2).a;
            if (num != null && i2 == num.intValue()) {
                obj = next2;
                break;
            }
        }
        jjl jjlVar = (jjl) obj;
        if (!(view instanceof jja) || num == null) {
            str = "N/A";
            strValueOf = str;
        } else {
            jja jjaVar = (jja) view;
            strValueOf = String.valueOf(jjaVar.getCompositionOrder());
            str = jjaVar.e != null ? "attached" : "null";
        }
        sb.append(strD);
        if (num == null || (strValueOf2 = String.valueOf(num.intValue())) == null) {
            strValueOf2 = "N/A";
        }
        sb.append(a.bq(strValueOf2, "ID: ", ", "));
        sb.append(a.bq(jjlVar != null ? jjlVar.b : "N/A", "Name: ", ", "));
        sb.append("Bounds: (" + view.getLeft() + ", " + view.getTop() + " - " + view.getRight() + ", " + view.getBottom() + "), ");
        float z = view.getZ();
        StringBuilder sb2 = new StringBuilder("Z: ");
        sb2.append(z);
        sb2.append(", ");
        sb.append(sb2.toString());
        sb.append(a.bq(strValueOf, "CO: ", ", "));
        sb.append("Alpha: " + view.getAlpha() + ", ");
        sb.append(a.bq(str, "Package: ", "\n"));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = viewGroup.getChildAt(i3);
                childAt.getClass();
                c(childAt, i + 1, list, sb);
            }
        }
    }

    @Override // defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        yph yphVar = a;
        ((ype) yphVar.f()).u("onCreate");
        ebh.d(getWindow(), false);
        Window window = getWindow();
        (Build.VERSION.SDK_INT >= 35 ? new edd(window) : Build.VERSION.SDK_INT >= 30 ? new edc(window) : new edb(window, new kwp(getWindow().getDecorView()))).f();
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(-16777216);
        this.c = frameLayout;
        setContentView(frameLayout);
        int intExtra = getIntent().getIntExtra("usable_width", Integer.MIN_VALUE);
        int intExtra2 = getIntent().getIntExtra("usable_height", Integer.MIN_VALUE);
        int intExtra3 = getIntent().getIntExtra("display_left_margin", Integer.MIN_VALUE);
        int intExtra4 = getIntent().getIntExtra("display_top_margin", Integer.MIN_VALUE);
        float floatExtra = getIntent().getFloatExtra("par", -1.0f);
        if (intExtra <= 0 || intExtra2 <= 0 || intExtra3 < 0 || intExtra4 < 0 || floatExtra <= BitmapDescriptorFactory.HUE_RED) {
            ((ype) yphVar.g()).T("Invalid or missing critical display geometry extras: width=%d, height=%d, left=%d, top=%d, par=%f. Finishing activity.", Integer.valueOf(intExtra), Integer.valueOf(intExtra2), Integer.valueOf(intExtra3), Integer.valueOf(intExtra4), Float.valueOf(floatExtra));
            finish();
            return;
        }
        this.d = new FrameLayout(this);
        FrameLayout frameLayout2 = this.c;
        if (frameLayout2 == null) {
            affa.d("rootLayout");
            frameLayout2 = null;
        }
        frameLayout2.addView(a());
        b(new jit(intExtra3, intExtra4, intExtra, intExtra2, floatExtra));
        Intent intent = getIntent();
        Bundle bundleExtra = intent != null ? intent.getBundleExtra("relay_host_callback_bundle") : null;
        if (bundleExtra == null) {
            ((ype) yphVar.g()).u("Missing EXTRA_RELAY_HOST_CALLBACK_BUNDLE, finishing activity");
            finish();
            return;
        }
        IBinder binder = bundleExtra.getBinder("relay_host_callback");
        if (!(binder instanceof jje)) {
            ((ype) yphVar.g()).u("Missing or invalid EXTRA_RELAY_HOST_CALLBACK, finishing activity");
            finish();
            return;
        }
        jje jjeVar = (jje) binder;
        this.b = jjeVar.a;
        aizz aizzVar = jjeVar.b;
        if (aizzVar != null) {
            ahnc.d(dty.f(this), null, 0, new ehs(this, aizzVar, (afck) null, 20), 3);
        } else {
            ((ype) yphVar.g()).u("UI state flow is null, finishing activity");
            finish();
        }
    }
}
