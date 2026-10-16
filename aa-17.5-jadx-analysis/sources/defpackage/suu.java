package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* loaded from: classes.dex */
public final class suu extends snw {
    public suu(Context context, Looper looper, snr snrVar, slb slbVar, slc slcVar) {
        super(context, looper, 51, snrVar, slbVar, slcVar);
    }

    @Override // defpackage.snp
    public final boolean C() {
        return false;
    }

    @Override // defpackage.snw, defpackage.snp, defpackage.skv
    public final int a() {
        return 9410000;
    }

    @Override // defpackage.snp
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return iInterfaceQueryLocalInterface instanceof sut ? (sut) iInterfaceQueryLocalInterface : new sut(iBinder);
    }

    @Override // defpackage.snp
    protected final String c() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // defpackage.snp
    protected final String d() {
        return "com.google.android.gms.phenotype.service.START";
    }

    @Override // defpackage.snp
    public final Feature[] g() {
        return sui.k;
    }
}
