package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.IndividualNetworkCallback;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.am;
import h.g.b.x;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class IndividualNetworkCallback extends ConnectivityManager.NetworkCallback {
    public static final Companion Companion = new Companion(null);
    private final l<ConstraintsState, ab> onConstraintState;

    /* JADX WARN: Multi-variable type inference failed */
    private IndividualNetworkCallback(l<? super ConstraintsState, ab> lVar) {
        this.onConstraintState = lVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        x.f(network, "network");
        x.f(networkCapabilities, "networkCapabilities");
        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        this.onConstraintState.invoke(ConstraintsState.ConstraintsMet.INSTANCE);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        x.f(network, "network");
        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onLost callback");
        this.onConstraintState.invoke(new ConstraintsState.ConstraintsNotMet(7));
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final ab addCallback$lambda$0(am amVar, ConnectivityManager connectivityManager, IndividualNetworkCallback individualNetworkCallback) {
            if (amVar.f48101a) {
                Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController unregister callback");
                connectivityManager.unregisterNetworkCallback(individualNetworkCallback);
            }
            return ab.f48028a;
        }

        public final a<ab> addCallback(final ConnectivityManager connectivityManager, NetworkRequest networkRequest, l<? super ConstraintsState, ab> lVar) {
            x.f(connectivityManager, "connManager");
            x.f(networkRequest, "networkRequest");
            x.f(lVar, "onConstraintState");
            final IndividualNetworkCallback individualNetworkCallback = new IndividualNetworkCallback(lVar, null);
            final am amVar = new am();
            try {
                Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController register callback");
                connectivityManager.registerNetworkCallback(networkRequest, individualNetworkCallback);
                amVar.f48101a = true;
            } catch (SecurityException e2) {
                Logger.get().error(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController couldn't register callback", e2);
                lVar.invoke(new ConstraintsState.ConstraintsNotMet(7));
            } catch (RuntimeException e3) {
                String name = e3.getClass().getName();
                x.e(name, "getName(...)");
                if (!o.l(name, "TooManyRequestsException", false)) {
                    throw e3;
                }
                Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController couldn't register callback", e3);
                lVar.invoke(new ConstraintsState.ConstraintsNotMet(7));
            }
            return new a() { // from class: androidx.work.impl.constraints.IndividualNetworkCallback$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return IndividualNetworkCallback.Companion.addCallback$lambda$0(amVar, connectivityManager, individualNetworkCallback);
                }
            };
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }

    public /* synthetic */ IndividualNetworkCallback(l lVar, h.g.b.o oVar) {
        this(lVar);
    }
}
