package e.a.b.a;

import android.os.Binder;
import android.os.Parcel;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class as implements aa {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f46359a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Logger f46360b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ aa f46361c;

    as(int i2, Logger logger, aa aaVar) {
        this.f46359a = i2;
        this.f46360b = logger;
        this.f46361c = aaVar;
    }

    @Override // e.a.b.a.aa
    public final boolean a(int i2, Parcel parcel) {
        int callingUid = Binder.getCallingUid();
        int i3 = this.f46359a;
        if (callingUid == i3) {
            return this.f46361c.a(i2, parcel);
        }
        this.f46360b.logp(Level.WARNING, "io.grpc.binder.internal.TransactionUtils$1", "handleTransaction", "dropped txn from " + callingUid + " !=" + i3);
        return false;
    }
}
