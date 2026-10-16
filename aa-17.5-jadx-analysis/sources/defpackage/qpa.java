package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class qpa extends snw {
    private final Bundle a;

    public qpa(Context context, Looper looper, snr snrVar, qoz qozVar, slz slzVar, smu smuVar) {
        super(context, looper, 16, snrVar, slzVar, smuVar);
        this.a = qozVar == null ? new Bundle() : new Bundle(qozVar.b);
    }

    @Override // defpackage.snw, defpackage.snp, defpackage.skv
    public final int a() {
        return 12451000;
    }

    @Override // defpackage.snp
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof qpc ? (qpc) iInterfaceQueryLocalInterface : new qpc(iBinder);
    }

    @Override // defpackage.snp
    protected final String c() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // defpackage.snp
    protected final String d() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // defpackage.snp
    public final boolean f() {
        return true;
    }

    @Override // defpackage.snp
    protected final Bundle h() {
        return this.a;
    }

    @Override // defpackage.snp, defpackage.skv
    public final boolean i() {
        snr snrVar = ((snw) this).v;
        Account account = snrVar.a;
        if (TextUtils.isEmpty(account != null ? account.name : null)) {
            return false;
        }
        if (((erb) snrVar.d.get(qoy.a)) == null) {
            return !snrVar.b.isEmpty();
        }
        throw null;
    }
}
