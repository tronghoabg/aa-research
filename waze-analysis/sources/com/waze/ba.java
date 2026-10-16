package com.waze;

import com.waze.navigate.DriveToNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class ba implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f16182a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f16183b;

    public /* synthetic */ ba(Object obj, int i2) {
        this.f16183b = i2;
        this.f16182a = obj;
    }

    @Override // com.waze.hw
    public final Object a() {
        switch (this.f16183b) {
            case 0:
                bc.sendLogsClick$lambda$0((bc) this.f16182a);
                return null;
            case 1:
                bc.sendLogsAutoConfirm$lambda$0((bc) this.f16182a);
                return null;
            case 2:
                bc.aboutClick$lambda$0((bc) this.f16182a);
                return null;
            case 3:
                bm.postInit$lambda$0((bm) this.f16182a);
                return null;
            case 4:
                return iu.loadServerEnv$lambda$0((iu) this.f16182a);
            case 5:
                iu.showDebugToolsMenu$lambda$0((iu) this.f16182a);
                return null;
            case 6:
                iu.onAppBackground$lambda$0((iu) this.f16182a);
                return null;
            case 7:
                iu.calendarRequestAccess$lambda$0((iu) this.f16182a);
                return null;
            case 8:
                iu.StopFollow$lambda$0((iu) this.f16182a);
                return null;
            case 9:
                iu.DeleteAccount$lambda$0((iu) this.f16182a);
                return null;
            case 10:
                iu.restorePoiFocus$lambda$0((iu) this.f16182a);
                return null;
            case 11:
                iu.auditReportConsentBumpAgreeClicked$lambda$0((iu) this.f16182a);
                return null;
            case 12:
                iu.onAppForeground$lambda$0((iu) this.f16182a);
                return null;
            case 13:
                return iu.GetSocialIsFirstTime$lambda$0((iu) this.f16182a);
            case 14:
                iu.SilentLogOut$lambda$0((iu) this.f16182a);
                return null;
            case 15:
                return iu.venueProviderGetCategoryGroups$lambda$0((iu) this.f16182a);
            case 16:
                iu.cancelMySosAlert$lambda$0((iu) this.f16182a);
                return null;
            case 17:
                return iu.randomUserMsg$lambda$0((iu) this.f16182a);
            case 18:
                iu.notifyOrientationChanged$lambda$0((iu) this.f16182a);
                return null;
            case 19:
                iu.resetEvents$lambda$0((iu) this.f16182a);
                return null;
            default:
                return ((DriveToNativeManager) this.f16182a).getAutoCompleteNTV();
        }
    }
}
