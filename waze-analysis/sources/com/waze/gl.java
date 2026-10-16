package com.waze;

import com.waze.ui.navbar.LaneGuidanceView;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class gl implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f24043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24044b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f24045c;

    gl(NativeManager nativeManager, String str, boolean z, int i2) {
        this.f24045c = i2;
        this.f24044b = str;
        this.f24043a = z;
        Objects.requireNonNull(nativeManager);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.waze.view.text.b, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24045c) {
            case 0:
                this.f24044b.a(this.f24043a);
                break;
            case 1:
                gb.ShowLogsReportedDialogJNI$lambda$0((gb) this.f24044b, this.f24043a);
                break;
            case 2:
                MainActivity mainActivityC = lm.d().c();
                com.waze.map.bq bqVarE = t.e();
                if (bqVarE == null) {
                    if (mainActivityC != null && !mainActivityC.aK()) {
                        MainActivity.z(this);
                        break;
                    }
                } else if (bqVarE.u()) {
                    bqVarE.A((String) this.f24044b, this.f24043a);
                    bqVarE.requestLayout();
                    bqVarE.invalidate();
                    break;
                }
                break;
            case 3:
                iu.onNativeLayerShutDownJNI$lambda$0((iu) this.f24044b, this.f24043a);
                break;
            case 4:
                iu.onLogoutJNI$lambda$0((iu) this.f24044b, this.f24043a);
                break;
            case 5:
                com.waze.sdk.bd.o((com.waze.sdk.bd) this.f24044b, this.f24043a);
                break;
            case 6:
                com.waze.sdk.bd.t((com.waze.sdk.bd) this.f24044b, this.f24043a);
                break;
            default:
                ((LaneGuidanceView) this.f24044b).i(this.f24043a);
                break;
        }
    }

    public /* synthetic */ gl(Object obj, boolean z, int i2) {
        this.f24045c = i2;
        this.f24044b = obj;
        this.f24043a = z;
    }
}
