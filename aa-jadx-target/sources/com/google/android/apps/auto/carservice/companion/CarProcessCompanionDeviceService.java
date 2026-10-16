package com.google.android.apps.auto.carservice.companion;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014Ê\u0001\f\b\u001f\u0012\b\b \u0012\u0004\b\u0003\u0010BÊ\u0001\f\b!\u0012\b\b \u0012\u0004\b\u0003\u0010B¨\u0006\u001e"}, d2 = {"Lcom/google/android/apps/auto/carservice/companion/CarProcessCompanionDeviceService;", "Landroid/companion/CompanionDeviceService;", "<init>", "()V", "companionDeviceListener", "Lcom/google/android/apps/auto/carservice/companion/CompanionDeviceListener;", "getCompanionDeviceListener", "()Lcom/google/android/apps/auto/carservice/companion/CompanionDeviceListener;", "companionDeviceListener$delegate", "Lkotlin/Lazy;", "carTelemetryLogger", "Lcom/google/android/gms/car/log/CarTelemetryLogger;", "kotlin.jvm.PlatformType", "getCarTelemetryLogger", "()Lcom/google/android/gms/car/log/CarTelemetryLogger;", "carTelemetryLogger$delegate", "onCreate", "", "onRebind", "intent", "Landroid/content/Intent;", "onBindCompanionDeviceService", "onUnbind", "", "onDestroy", "onDeviceAppeared", "associationInfo", "Landroid/companion/AssociationInfo;", "onDeviceDisappeared", "Companion", "java.com.google.android.apps.auto.carservice.companion_companion", "Landroidx/annotation/RequiresApi;", "value", "Landroid/annotation/TargetApi;"}, k = 1, mv = {defpackage.eie.FLOAT_FIELD_NUMBER, defpackage.eie.LONG_FIELD_NUMBER, defpackage.abnt.b}, xi = 48)
public final class CarProcessCompanionDeviceService extends android.companion.CompanionDeviceService {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.CarCmpDvcSvc");
    private final defpackage.afar b = new defpackage.afay(new defpackage.afer() { // from class: jlz
        @Override // defpackage.afer
        public final java.lang.Object invoke() {
            return defpackage.jml.a.a(this.a);
        }
    });
    private final defpackage.afar c = new defpackage.afay(new defpackage.afer() { // from class: jma
        @Override // defpackage.afer
        public final java.lang.Object invoke() {
            return defpackage.rqt.a(this.a);
        }
    });

    private final defpackage.jmm a() {
        return (defpackage.jmm) this.b.a();
    }

    private final defpackage.rqt b() {
        return (defpackage.rqt) this.c.a();
    }

    public final void onBindCompanionDeviceService(android.content.Intent intent) {
        ((defpackage.yqj) a.f()).u("onBind()");
        defpackage.rqt rqtVarB = b();
        rqtVarB.getClass();
        defpackage.ebq.r(rqtVarB, defpackage.zbd.Fx);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((defpackage.yqj) a.f()).u("onCreate()");
        defpackage.rqt rqtVarB = b();
        rqtVarB.getClass();
        defpackage.ebq.r(rqtVarB, defpackage.zbd.Fv);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ((defpackage.yqj) a.f()).u("onDestroy()");
        defpackage.rqt rqtVarB = b();
        rqtVarB.getClass();
        defpackage.ebq.r(rqtVarB, defpackage.zbd.Fw);
        super.onDestroy();
    }

    @Override // android.companion.CompanionDeviceService
    public final void onDeviceAppeared(android.companion.AssociationInfo associationInfo) {
        associationInfo.getClass();
        a().d(associationInfo);
    }

    @Override // android.companion.CompanionDeviceService
    public final void onDeviceDisappeared(android.companion.AssociationInfo associationInfo) {
        associationInfo.getClass();
        a().e(associationInfo);
    }

    @Override // android.app.Service
    public final void onRebind(android.content.Intent intent) {
        super.onRebind(intent);
        ((defpackage.yqj) a.f()).u("onRebind()");
        defpackage.rqt rqtVarB = b();
        rqtVarB.getClass();
        defpackage.ebq.r(rqtVarB, defpackage.zbd.Fz);
    }

    @Override // android.app.Service
    public final boolean onUnbind(android.content.Intent intent) {
        super.onUnbind(intent);
        ((defpackage.yqj) a.f()).u("onUnbind()");
        defpackage.rqt rqtVarB = b();
        rqtVarB.getClass();
        defpackage.ebq.r(rqtVarB, defpackage.zbd.Fy);
        return true;
    }
}
