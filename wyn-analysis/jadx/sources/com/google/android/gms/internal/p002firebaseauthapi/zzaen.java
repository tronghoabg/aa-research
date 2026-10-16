package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import cb.AbstractC1593a;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.security.NoSuchAlgorithmException;
import n7.AbstractC3598c;

/* loaded from: classes.dex */
public final class zzaen {
    private final String zza;
    private final String zzb;

    public zzaen(Context context) {
        this(context, context.getPackageName());
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    private zzaen(Context context, String str) throws NoSuchAlgorithmException {
        AbstractC1732v.i(context);
        AbstractC1732v.f(str);
        this.zza = str;
        try {
            byte[] bArrG = AbstractC3598c.g(context, str);
            if (bArrG != null) {
                this.zzb = AbstractC3598c.c(bArrG);
            } else {
                AbstractC1593a.t("single cert required: ", str, "FBA-PackageInfo");
                this.zzb = null;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            AbstractC1593a.t("no pkg: ", str, "FBA-PackageInfo");
            this.zzb = null;
        }
    }
}
