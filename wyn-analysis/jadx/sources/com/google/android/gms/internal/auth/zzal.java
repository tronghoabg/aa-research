package com.google.android.gms.internal.auth;

import U6.a;
import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.J;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.r;

/* loaded from: classes3.dex */
public final class zzal {
    private static final Status zza = new Status(13, null, null, null);

    public final r addWorkAccount(o oVar, String str) {
        return ((J) oVar).f26468b.doWrite((l) new zzae(this, a.f12351a, oVar, str));
    }

    public final r removeWorkAccount(o oVar, Account account) {
        return ((J) oVar).f26468b.doWrite((l) new zzag(this, a.f12351a, oVar, account));
    }

    public final void setWorkAuthenticatorEnabled(o oVar, boolean z2) {
        setWorkAuthenticatorEnabledWithResult(oVar, z2);
    }

    public final r setWorkAuthenticatorEnabledWithResult(o oVar, boolean z2) {
        return ((J) oVar).f26468b.doWrite((l) new zzac(this, a.f12351a, oVar, z2));
    }
}
