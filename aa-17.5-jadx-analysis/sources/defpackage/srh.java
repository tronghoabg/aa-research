package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* loaded from: classes2.dex */
public final class srh extends snw {
    public final Context a;

    public srh(Context context, Looper looper, slb slbVar, slc slcVar, snr snrVar) {
        super(context, looper, 29, snrVar, slbVar, slcVar);
        this.a = context;
        sxo.b(context);
    }

    @Override // defpackage.snw, defpackage.snp, defpackage.skv
    public final int a() {
        return 11925000;
    }

    @Override // defpackage.snp
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
        return iInterfaceQueryLocalInterface instanceof srj ? (srj) iInterfaceQueryLocalInterface : new srj(iBinder);
    }

    @Override // defpackage.snp
    protected final String c() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // defpackage.snp
    protected final String d() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // defpackage.snp
    public final boolean f() {
        return true;
    }

    @Override // defpackage.snp
    public final Feature[] g() {
        return sqz.b;
    }
}
