package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* loaded from: classes.dex */
public final class sjd extends snw {
    public sjd(Context context, Looper looper, snr snrVar, slb slbVar, slc slcVar) {
        super(context, looper, 40, snrVar, slbVar, slcVar);
    }

    @Override // defpackage.snw, defpackage.snp, defpackage.skv
    public final int a() {
        return 11925000;
    }

    @Override // defpackage.snp
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return iInterfaceQueryLocalInterface instanceof sjf ? (sjf) iInterfaceQueryLocalInterface : new sjf(iBinder);
    }

    @Override // defpackage.snp
    protected final String c() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    @Override // defpackage.snp
    protected final String d() {
        return "com.google.android.gms.clearcut.service.START";
    }

    @Override // defpackage.snp
    public final Feature[] g() {
        return new Feature[]{siq.a, siq.c};
    }
}
