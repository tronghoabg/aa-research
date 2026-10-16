package com.waze.navigate;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f31283a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f31284b;

    e(NavigateNativeManager navigateNativeManager, int i2) {
        this.f31284b = i2;
        Objects.requireNonNull(navigateNativeManager);
        this.f31283a = navigateNativeManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31284b) {
            case 0:
                ((h) this.f31283a).y();
                break;
            case 1:
                ((NavigateNativeManager) this.f31283a).ClearPreviewsNTV();
                break;
            case 2:
                cx.showOneOffNavigationSettingsPopupJNI$lambda$0((cx) this.f31283a);
                break;
            case 3:
                ds.refreshInstructionNamesJNI$lambda$0((ds) this.f31283a);
                break;
            case 4:
                ds.onAverageSpeedCamZoneClearJNI$lambda$0((ds) this.f31283a);
                break;
            case 5:
                ds.hideNearingDestinationJNI$lambda$0((ds) this.f31283a);
                break;
            case 6:
                ds.showNearingDestinationJNI$lambda$0((ds) this.f31283a);
                break;
            case 7:
                ds.onRoutingDestinationClearJNI$lambda$0((ds) this.f31283a);
                break;
            case 8:
                ds.onRoutingIdClearedJNI$lambda$0((ds) this.f31283a);
                break;
            case 9:
                ds.onEnforcementZoneClearJNI$lambda$0((ds) this.f31283a);
                break;
            case 10:
                ds.onLanesGuidanceChangedJNI$lambda$0((ds) this.f31283a);
                break;
            case 11:
                ds.onTrafficInfoClearJNI$lambda$0((ds) this.f31283a);
                break;
            case 12:
                kotlinx.coroutines.aj.z(kotlinx.coroutines.aj.f(), null, null, new av((dz) this.f31283a, (h.c.e) null, 3), 3);
                break;
            case 13:
                eg.onStartPointRemovedJNI$lambda$0((eg) this.f31283a);
                break;
            case 14:
                ew.postInit$default((NewVenuePinNativeManager) this.f31283a, null, 1, null);
                break;
            case 15:
                ew.onNewVenueRemovedJNI$lambda$0((ew) this.f31283a);
                break;
            default:
                fh.onParkedRemovedJNI$lambda$0((fh) this.f31283a);
                break;
        }
    }

    public /* synthetic */ e(Object obj, int i2) {
        this.f31284b = i2;
        this.f31283a = obj;
    }
}
