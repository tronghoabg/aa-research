package com.waze.uid.activities;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Status;
import com.waze.uid.b.r;
import com.waze.uid.b.s;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f implements ActivityResultCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ UidFragmentActivity f44090a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f44091b;

    public f(UidFragmentActivity uidFragmentActivity, int i2) {
        this.f44091b = i2;
        this.f44090a = uidFragmentActivity;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final /* synthetic */ void onActivityResult(Object obj) throws com.google.android.gms.common.api.i {
        if (this.f44091b == 0) {
            ActivityResult activityResult = (ActivityResult) obj;
            x.f(activityResult, "result");
            com.waze.shared_infra.i.h.b("UidFragmentActivity", "UidActivityResultCallback: onActivityResult(" + activityResult + ")");
            q qVarF = this.f44090a.f();
            activityResult.getResultCode();
            activityResult.getData();
            qVarF.o(new com.waze.uid.b.q());
            return;
        }
        ActivityResult activityResult2 = (ActivityResult) obj;
        x.f(activityResult2, "result");
        com.waze.shared_infra.i.h.b("UidFragmentActivity", "AuthorizationIntentResultCallback: onActivityResult(" + activityResult2 + ")");
        try {
            UidFragmentActivity uidFragmentActivity = this.f44090a;
            UidFragmentActivity uidFragmentActivity2 = uidFragmentActivity;
            new com.google.android.gms.auth.api.identity.a.h((Activity) uidFragmentActivity2, new com.google.android.gms.auth.api.identity.a());
            Intent data = activityResult2.getData();
            if (data == null) {
                throw new com.google.android.gms.common.api.i(Status.f4688c);
            }
            Status status = (Status) a.a.S(data, NotificationCompat.CATEGORY_STATUS, Status.CREATOR);
            if (status == null) {
                throw new com.google.android.gms.common.api.i(Status.f4690e);
            }
            if (!status.f()) {
                throw new com.google.android.gms.common.api.i(status);
            }
            com.google.android.gms.auth.api.identity.d dVar = (com.google.android.gms.auth.api.identity.d) a.a.S(data, "authorization_result", com.google.android.gms.auth.api.identity.d.CREATOR);
            if (dVar == null) {
                throw new com.google.android.gms.common.api.i(Status.f4688c);
            }
            uidFragmentActivity.f().o(new s(dVar));
        } catch (com.google.android.gms.common.api.i e2) {
            e2.toString();
            com.waze.shared_infra.i.h.b("UidFragmentActivity", "ActivityResultCallback: ".concat(e2.toString()));
            this.f44090a.f().o(new r(e2));
        }
    }
}
