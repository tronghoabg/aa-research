package com.google.android.apps.auto.carservice.companion;

import android.companion.AssociationInfo;
import android.companion.CompanionDeviceService;
import android.content.Intent;
import defpackage.aezr;
import defpackage.aezy;
import defpackage.afdr;
import defpackage.dsg;
import defpackage.jmf;
import defpackage.rpz;
import defpackage.ype;
import defpackage.yph;
import defpackage.yzy;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¨\u0006\u001e"}, d2 = {"Lcom/google/android/apps/auto/carservice/companion/CarProcessCompanionDeviceService;", "Landroid/companion/CompanionDeviceService;", "<init>", "()V", "companionDeviceListener", "Lcom/google/android/apps/auto/carservice/companion/CompanionDeviceListener;", "getCompanionDeviceListener", "()Lcom/google/android/apps/auto/carservice/companion/CompanionDeviceListener;", "companionDeviceListener$delegate", "Lkotlin/Lazy;", "carTelemetryLogger", "Lcom/google/android/gms/car/log/CarTelemetryLogger;", "kotlin.jvm.PlatformType", "getCarTelemetryLogger", "()Lcom/google/android/gms/car/log/CarTelemetryLogger;", "carTelemetryLogger$delegate", "onCreate", "", "onRebind", "intent", "Landroid/content/Intent;", "onBindCompanionDeviceService", "onUnbind", "", "onDestroy", "onDeviceAppeared", "associationInfo", "Landroid/companion/AssociationInfo;", "onDeviceDisappeared", "Companion", "java.com.google.android.apps.auto.carservice.companion_companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CarProcessCompanionDeviceService extends CompanionDeviceService {
    private static final yph a = yph.c("GH.CarCmpDvcSvc");
    private final aezr b = new aezy(new afdr() { // from class: jls
        @Override // defpackage.afdr
        public final Object invoke() {
            return jme.a.a(this.a);
        }
    });
    private final aezr c = new aezy(new afdr() { // from class: jlt
        @Override // defpackage.afdr
        public final Object invoke() {
            return rpz.a(this.a);
        }
    });

    private final jmf a() {
        return (jmf) this.b.a();
    }

    private final rpz b() {
        return (rpz) this.c.a();
    }

    public final void onBindCompanionDeviceService(Intent intent) {
        ((ype) a.f()).u("onBind()");
        rpz rpzVarB = b();
        rpzVarB.getClass();
        dsg.E(rpzVarB, yzy.Ft);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((ype) a.f()).u("onCreate()");
        rpz rpzVarB = b();
        rpzVarB.getClass();
        dsg.E(rpzVarB, yzy.Fr);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ((ype) a.f()).u("onDestroy()");
        rpz rpzVarB = b();
        rpzVarB.getClass();
        dsg.E(rpzVarB, yzy.Fs);
        super.onDestroy();
    }

    public final void onDeviceAppeared(AssociationInfo associationInfo) {
        associationInfo.getClass();
        a().d(associationInfo);
    }

    public final void onDeviceDisappeared(AssociationInfo associationInfo) {
        associationInfo.getClass();
        a().e(associationInfo);
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        super.onRebind(intent);
        ((ype) a.f()).u("onRebind()");
        rpz rpzVarB = b();
        rpzVarB.getClass();
        dsg.E(rpzVarB, yzy.Fv);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        super.onUnbind(intent);
        ((ype) a.f()).u("onUnbind()");
        rpz rpzVarB = b();
        rpzVarB.getClass();
        dsg.E(rpzVarB, yzy.Fu);
        return true;
    }
}
