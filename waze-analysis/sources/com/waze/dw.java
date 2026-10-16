package com.waze;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import com.waze.planned_drive.PlannedDriveFragment;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class dw implements ActivityResultCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f23598a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f23599b;

    public /* synthetic */ dw(Object obj, int i2) {
        this.f23599b = i2;
        this.f23598a = obj;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        int i2 = this.f23599b;
        if (i2 == 0) {
            el.ai((el) this.f23598a, (ActivityResult) obj);
            return;
        }
        if (i2 == 1) {
            el.ag((el) this.f23598a, (ActivityResult) obj);
            return;
        }
        if (i2 == 2) {
            el.ah((el) this.f23598a, (ActivityResult) obj);
            return;
        }
        if (i2 == 3) {
            ((PlannedDriveFragment) this.f23598a).H(false);
        } else if (i2 == 4) {
            com.waze.bt.f.d((com.waze.bt.f) this.f23598a, (ActivityResult) obj);
        } else if (i2 != 5) {
            h.g.b.x.f((ActivityResult) obj, "it");
            ((com.waze.trip_overview.c.a.ab) this.f23598a).h().l(com.waze.trip_overview.fa.f41456a);
        } else {
            com.waze.bt.f.c((com.waze.bt.f) this.f23598a, (ActivityResult) obj);
        }
    }
}
