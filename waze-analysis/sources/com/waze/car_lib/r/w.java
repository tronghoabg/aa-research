package com.waze.car_lib.r;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.AndroidRuntimeException;
import androidx.car.app.CarContext;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21719a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ao f21720b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.install.a.a f21721c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f21722d;

    /* renamed from: e, reason: collision with root package name */
    private final String f21723e;

    /* renamed from: f, reason: collision with root package name */
    private final CarContext f21724f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f21725g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f21726h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.car_lib.p.dg f21727i;

    public w(com.waze.shared_infra.o.a aVar, com.waze.ao aoVar, com.waze.install.a.a aVar2, boolean z, String str, CarContext carContext, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(aoVar, "carManager");
        h.g.b.x.f(aVar2, "forceUpgradeStatsSender");
        h.g.b.x.f(str, "appDownloadUrl");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(eVar, "logger");
        this.f21719a = aVar;
        this.f21720b = aoVar;
        this.f21721c = aVar2;
        this.f21722d = z;
        this.f21723e = str;
        this.f21724f = carContext;
        this.f21725g = eVar;
        boolean z2 = (aoVar.a().d() instanceof com.waze.ak) && !z;
        this.f21726h = z2;
        this.f21727i = new com.waze.car_lib.p.dg(z ? aVar.c(R.string.ANDROID_IN_CAR_FORCE_UPGRADE_OLD_OS_TITLE, new Object[0]) : aVar.c(R.string.ANDROID_IN_CAR_FORCE_UPGRADE_TITLE, new Object[0]), z ? aVar.c(R.string.ANDROID_IN_CAR_FORCE_UPGRADE_OLD_OS_MESSAGE, new Object[0]) : aVar.c(R.string.ANDROID_IN_CAR_FORCE_UPGRADE_MESSAGE, new Object[0]), Integer.valueOf(R.drawable.launch_icon_64px), false, z2 ? new com.waze.car_lib.p.dc(aVar.c(R.string.ANDROID_IN_CAR_FORCE_UPGRADE_BUTTON, new Object[0]), true) : null, null, 32);
    }

    private final void c() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f21723e));
            intent.setFlags(268435456);
            this.f21724f.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            this.f21725g.b("ActivityNotFoundException while trying to open store: ".concat(String.valueOf(e2.getMessage())));
        } catch (AndroidRuntimeException e3) {
            this.f21725g.b("AndroidRuntimeException while trying to open store: ".concat(String.valueOf(e3.getMessage())));
        }
    }

    public final com.waze.car_lib.p.dg a() {
        return this.f21727i;
    }

    public final void b() {
        if (this.f21726h) {
            this.f21721c.a(this.f21723e);
            c();
        }
    }
}
