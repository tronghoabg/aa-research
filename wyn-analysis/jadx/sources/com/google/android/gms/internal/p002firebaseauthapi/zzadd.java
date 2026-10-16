package com.google.android.gms.internal.p002firebaseauthapi;

import J8.t;
import K8.J;
import android.support.v4.media.session.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzadd extends zzady<String, J> {
    private final String zzu;
    private final String zzv;

    public zzadd(String str, String str2) {
        super(4);
        AbstractC1732v.g(str, "code cannot be null or empty");
        this.zzu = str;
        this.zzv = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "verifyPasswordResetCode";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        char c10 = 5;
        char c11 = 3;
        zzagv zzagvVar = this.zzm;
        if (zzagvVar.zzg()) {
            zzagvVar.zzc();
        } else {
            zzagvVar.zzb();
        }
        zzagvVar.zzb();
        if (zzagvVar.zzh()) {
            String strZzd = zzagvVar.zzd();
            strZzd.getClass();
            switch (strZzd) {
                case "REVERT_SECOND_FACTOR_ADDITION":
                    c10 = 6;
                    break;
                case "PASSWORD_RESET":
                    c10 = 0;
                    break;
                case "VERIFY_EMAIL":
                    c10 = 1;
                    break;
                case "VERIFY_AND_CHANGE_EMAIL":
                    break;
                case "EMAIL_SIGNIN":
                    c10 = 4;
                    break;
                case "RECOVER_EMAIL":
                    c10 = 2;
                    break;
                default:
                    c10 = 3;
                    break;
            }
            if (c10 != 4 && c10 != 3) {
                if (zzagvVar.zzf()) {
                    String strZzb = zzagvVar.zzb();
                    t tVarY0 = b.y0(zzagvVar.zza());
                    AbstractC1732v.f(strZzb);
                    AbstractC1732v.i(tVarY0);
                } else if (zzagvVar.zzg()) {
                    String strZzc = zzagvVar.zzc();
                    String strZzb2 = zzagvVar.zzb();
                    AbstractC1732v.f(strZzc);
                    AbstractC1732v.f(strZzb2);
                } else if (zzagvVar.zze()) {
                    AbstractC1732v.f(zzagvVar.zzb());
                }
            }
            c11 = c10;
        }
        if (c11 != 0) {
            zza(new Status(17499, null, null, null));
        } else {
            zzb(this.zzm.zzb());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zzd(this.zzu, this.zzv, this.zzb);
    }
}
