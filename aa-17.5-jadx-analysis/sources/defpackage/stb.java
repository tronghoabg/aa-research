package defpackage;

import android.location.Location;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class stb extends ijo implements stc {
    public final sty a;

    public stb(sty styVar) {
        super("com.google.android.gms.location.ILocationListener");
        this.a = styVar;
    }

    @Override // defpackage.stc
    public final void e() {
        this.a.b().b(new stz(this, 3));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            Location location = (Location) ijp.a(parcel, Location.CREATOR);
            ijp.d(parcel);
            this.a.b().b(new stz(location, 2));
        } else {
            if (i != 2) {
                return false;
            }
            e();
        }
        return true;
    }

    public stb() {
        throw null;
    }
}
