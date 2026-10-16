package K8;

import J8.AbstractC0626a;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.p002firebaseauthapi.zzagv;

/* loaded from: classes4.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final int f6609a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0626a f6610b;

    public S(zzagv zzagvVar) {
        int i5 = 5;
        if (zzagvVar.zzg()) {
            zzagvVar.zzc();
        } else {
            zzagvVar.zzb();
        }
        zzagvVar.zzb();
        AbstractC0626a p10 = null;
        if (!zzagvVar.zzh()) {
            this.f6609a = 3;
            this.f6610b = null;
            return;
        }
        String strZzd = zzagvVar.zzd();
        strZzd.getClass();
        switch (strZzd) {
            case "REVERT_SECOND_FACTOR_ADDITION":
                i5 = 6;
                break;
            case "PASSWORD_RESET":
                i5 = 0;
                break;
            case "VERIFY_EMAIL":
                i5 = 1;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                break;
            case "EMAIL_SIGNIN":
                i5 = 4;
                break;
            case "RECOVER_EMAIL":
                i5 = 2;
                break;
            default:
                i5 = 3;
                break;
        }
        this.f6609a = i5;
        if (i5 == 4 || i5 == 3) {
            this.f6610b = null;
            return;
        }
        if (zzagvVar.zzf()) {
            String strZzb = zzagvVar.zzb();
            J8.t tVarY0 = android.support.v4.media.session.b.y0(zzagvVar.zza());
            p10 = new P();
            AbstractC1732v.f(strZzb);
            p10.f5783a = strZzb;
            AbstractC1732v.i(tVarY0);
        } else if (zzagvVar.zzg()) {
            p10 = new N(zzagvVar.zzc(), zzagvVar.zzb());
        } else if (zzagvVar.zze()) {
            String strZzb2 = zzagvVar.zzb();
            p10 = new P();
            AbstractC1732v.f(strZzb2);
            p10.f5783a = strZzb2;
        }
        this.f6610b = p10;
    }
}
