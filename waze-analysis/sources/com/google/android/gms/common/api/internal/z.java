package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.waze.ConfigManager;
import com.waze.NativeManager;
import com.waze.rtalerts.RtAlertsNativeManager;
import com.waze.view.bottom.BottomNotificationIcon;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4858b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4859c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f4860d;

    public /* synthetic */ z(ad adVar, a aVar, int i2, int i3) {
        this.f4860d = i3;
        this.f4858b = adVar;
        this.f4859c = aVar;
        this.f4857a = i2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f4860d;
        if (i2 == 0) {
            h hVar = (h) this.f4859c;
            if (hVar.m()) {
                ((ad) this.f4858b).f4713a.v(this.f4857a);
                hVar.k(false);
                return;
            }
            return;
        }
        if (i2 == 1) {
            ((ConfigManager) this.f4859c).lambda$setConfigValueInt$0((com.waze.config.c) this.f4858b, this.f4857a);
            return;
        }
        if (i2 == 2) {
            ?? r0 = this.f4858b;
            ((NativeManager) this.f4859c).lambda$ResetDisplay$0(this.f4857a, r0);
        } else if (i2 == 3) {
            ?? r02 = this.f4858b;
            com.waze.reports_v2.presentation.ap.j((com.waze.reports_v2.presentation.ap) this.f4859c, this.f4857a, r02);
        } else if (i2 != 4) {
            Object obj = this.f4859c;
            ((BottomNotificationIcon) this.f4858b).lambda$setImageResourcesAndPoints$0(this.f4857a, (Context) obj);
        } else {
            Object obj2 = this.f4858b;
            ((RtAlertsNativeManager) this.f4859c).lambda$postComment$0(this.f4857a, (String) obj2);
        }
    }

    public /* synthetic */ z(ConfigManager configManager, com.waze.config.c cVar, int i2, int i3) {
        this.f4860d = i3;
        this.f4859c = configManager;
        this.f4858b = cVar;
        this.f4857a = i2;
    }

    public /* synthetic */ z(BottomNotificationIcon bottomNotificationIcon, int i2, Context context, int i3) {
        this.f4860d = i3;
        this.f4858b = bottomNotificationIcon;
        this.f4857a = i2;
        this.f4859c = context;
    }

    public /* synthetic */ z(Object obj, int i2, Object obj2, int i3) {
        this.f4860d = i3;
        this.f4859c = obj;
        this.f4857a = i2;
        this.f4858b = obj2;
    }
}
