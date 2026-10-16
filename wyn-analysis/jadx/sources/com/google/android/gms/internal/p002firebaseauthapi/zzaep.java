package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;
import s8.g;

/* loaded from: classes.dex */
public final class zzaep {
    private final FirebaseAuth zza;
    private final Activity zzb;

    public zzaep(FirebaseAuth firebaseAuth, Activity activity) {
        this.zza = firebaseAuth;
        this.zzb = activity;
    }

    public final void zza() {
        Intent intent = new Intent("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent.setClass(this.zzb, RecaptchaActivity.class);
        intent.setPackage(this.zzb.getPackageName());
        g gVar = this.zza.f27283a;
        gVar.a();
        intent.putExtra("com.google.firebase.auth.KEY_API_KEY", gVar.f45330c.f45343a);
        if (!TextUtils.isEmpty(this.zza.b())) {
            intent.putExtra("com.google.firebase.auth.KEY_TENANT_ID", this.zza.b());
        }
        intent.putExtra("com.google.firebase.auth.internal.CLIENT_VERSION", zzads.zza().zzb());
        g gVar2 = this.zza.f27283a;
        gVar2.a();
        intent.putExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME", gVar2.f45329b);
        intent.putExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", this.zza.f27282B);
        this.zzb.startActivity(intent);
    }
}
