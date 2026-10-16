package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class ves extends ijo implements vet {
    final /* synthetic */ zhc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ves(zhc zhcVar) {
        super("com.google.android.libraries.maps.internal.IMapsAppCheckTokenCallback");
        this.a = zhcVar;
    }

    @Override // defpackage.vet
    public final void e() {
        this.a.p(new RuntimeException("Failed to fetch App Check token."));
    }

    @Override // defpackage.vet
    public final void f(String str) {
        this.a.o(str);
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            e();
            return true;
        }
        String string = parcel.readString();
        ijp.d(parcel);
        f(string);
        return true;
    }
}
