package defpackage;

import android.os.RemoteException;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aael {
    public final veb a;

    public aael(veb vebVar) {
        this.a = vebVar;
    }

    public final void a() {
        try {
            this.a.a();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void b() {
        try {
            this.a.b();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aael) {
            return a.C(this.a, ((aael) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("callback", this.a);
        return zsaVarA.toString();
    }
}
