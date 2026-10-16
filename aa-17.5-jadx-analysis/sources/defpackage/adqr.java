package defpackage;

import android.os.Binder;
import android.os.Parcel;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
final class adqr implements adps {
    final /* synthetic */ int a;
    final /* synthetic */ Logger b;
    final /* synthetic */ adps c;

    public adqr(int i, Logger logger, adps adpsVar) {
        this.a = i;
        this.b = logger;
        this.c = adpsVar;
    }

    @Override // defpackage.adps
    public final boolean a(int i, Parcel parcel) {
        int callingUid = Binder.getCallingUid();
        int i2 = this.a;
        if (callingUid == i2) {
            return this.c.a(i, parcel);
        }
        this.b.logp(Level.WARNING, "io.grpc.binder.internal.TransactionUtils$1", "handleTransaction", a.bo(i2, callingUid, "dropped txn from ", " !="));
        return false;
    }
}
