package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import com.google.android.apps.auto.components.connectivity.impl.ConnectivityEventHandlerImpl;

/* loaded from: classes.dex */
public final class koz extends ConnectivityManager.NetworkCallback {
    int a = 1;

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        if (this.a != 2) {
            this.a = 2;
            ((ype) ((ype) ConnectivityEventHandlerImpl.a.f()).ai((char) 3295)).u("Internet connected");
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        if (this.a != 3) {
            this.a = 3;
            ((ype) ((ype) ConnectivityEventHandlerImpl.a.f()).ai((char) 3296)).u("Internet disconnected");
        }
    }
}
