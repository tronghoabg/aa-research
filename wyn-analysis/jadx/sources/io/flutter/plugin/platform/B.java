package io.flutter.plugin.platform;

import android.app.Activity;
import android.hardware.display.VirtualDisplay;
import android.view.View;

/* loaded from: classes5.dex */
public final class B {

    /* renamed from: i, reason: collision with root package name */
    public static final y f37079i = new y();

    /* renamed from: a, reason: collision with root package name */
    public SingleViewPresentation f37080a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f37081b;

    /* renamed from: c, reason: collision with root package name */
    public final C2865a f37082c;

    /* renamed from: d, reason: collision with root package name */
    public final int f37083d;

    /* renamed from: e, reason: collision with root package name */
    public final int f37084e;

    /* renamed from: f, reason: collision with root package name */
    public final g f37085f;

    /* renamed from: g, reason: collision with root package name */
    public final l f37086g;

    /* renamed from: h, reason: collision with root package name */
    public VirtualDisplay f37087h;

    public B(Activity activity, C2865a c2865a, VirtualDisplay virtualDisplay, e eVar, g gVar, l lVar, int i5) {
        this.f37081b = activity;
        this.f37082c = c2865a;
        this.f37085f = gVar;
        this.f37086g = lVar;
        this.f37084e = i5;
        this.f37087h = virtualDisplay;
        this.f37083d = activity.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(activity, this.f37087h.getDisplay(), eVar, c2865a, i5, lVar);
        this.f37080a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public final View a() {
        SingleViewPresentation singleViewPresentation = this.f37080a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }
}
