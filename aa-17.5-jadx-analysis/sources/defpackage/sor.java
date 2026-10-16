package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class sor extends Exception {
    public final ConnectionResult a;

    public sor(ConnectionResult connectionResult) {
        spu.an(connectionResult.b(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.a = connectionResult;
    }
}
