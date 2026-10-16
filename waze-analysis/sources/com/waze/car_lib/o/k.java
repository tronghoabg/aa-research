package com.waze.car_lib.o;

import com.waze.NativeManager;
import com.waze.config.ConfigValues;
import com.waze.lm;
import com.waze.mywaze.MyWazeNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class k implements com.waze.settings.tree.c.c {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f20475a;

    public /* synthetic */ k(int i2) {
        this.f20475a = i2;
    }

    @Override // com.waze.settings.tree.c.c
    public final boolean a() {
        switch (this.f20475a) {
            case 0:
                Boolean boolB = ConfigValues.CONFIG_VALUE_LICENSE_PLATE_FEATURE_ENABLED.b();
                h.g.b.x.e(boolB, "getValue(...)");
                return boolB.booleanValue();
            case 1:
                Boolean boolB2 = ConfigValues.CONFIG_VALUE_ROUTING_PERSONAL_ETA_FEATURE_ENABLED.b();
                h.g.b.x.e(boolB2, "getValue(...)");
                return boolB2.booleanValue();
            case 2:
                return !MyWazeNativeManager.getInstance().isGuestUser();
            case 3:
                return MyWazeNativeManager.getInstance().isGuestUser();
            case 4:
                return NativeManager.getInstance().ShouldDisplayGasInSettings();
            case 5:
                return com.waze.google_assistant.aa.f24060a.a().E();
            case 6:
                return com.waze.sharedui.profile.b.c().getBasicInfo().getBirthDateSec() != null;
            case 7:
                return NativeManager.getInstance().ShouldDisplayGasInSettings();
            case 8:
                return com.waze.google_assistant.aa.f24060a.a().D();
            case 9:
            default:
                return true;
            case 10:
                int i2 = com.waze.settings.tree.a.h.f37469a;
                com.waze.sharedui.a.e eVarE = lm.d().e();
                return (eVarE == null || com.waze.settings.tree.a.d.b().resolveActivity(eVarE.getPackageManager()) == null) ? false : true;
            case 11:
                return NativeManager.getInstance().ShouldDisplayGasInSettings();
        }
    }
}
