package com.google.android.gms.common.api;

import A7.AbstractC0279p0;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.C1695i;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.base.zau;

@KeepName
/* loaded from: classes3.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f26420b = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f26421a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i5, int i10, Intent intent) {
        super.onActivityResult(i5, i10, intent);
        if (i5 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f26421a = 0;
            setResult(i10, intent);
            if (booleanExtra) {
                C1695i c1695iH = C1695i.h(this);
                if (i10 == -1) {
                    zau zauVar = c1695iH.f26543n;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                } else if (i10 == 0) {
                    c1695iH.j(new d7.b(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i5 == 2) {
            this.f26421a = 0;
            setResult(i10, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f26421a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f26421a = bundle.getInt("resolution");
        }
        if (this.f26421a == 1) {
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            AbstractC1732v.i(num);
            d7.e.f34127d.e(this, num.intValue(), this);
            this.f26421a = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.f26421a = 1;
            } catch (ActivityNotFoundException e7) {
                e = e7;
                if (extras.getBoolean("notify_manager", true)) {
                    C1695i.h(this).j(new d7.b(22, null, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String strL = AbstractC0279p0.l("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        strL = strL.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", strL, e);
                }
                googleApiActivity.f26421a = 1;
                finish();
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        } catch (ActivityNotFoundException e11) {
            e = e11;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e12) {
            e = e12;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f26421a);
        super.onSaveInstanceState(bundle);
    }
}
