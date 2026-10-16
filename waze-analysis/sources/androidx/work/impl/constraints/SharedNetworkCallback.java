package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class SharedNetworkCallback extends ConnectivityManager.NetworkCallback {
    private static NetworkCapabilities cachedCapabilities;
    private static boolean capabilitiesInitialized;
    private static Boolean isBlocked;
    public static final SharedNetworkCallback INSTANCE = new SharedNetworkCallback();
    private static final Object requestsLock = new Object();
    private static final Map<l<ConstraintsState, ab>, NetworkRequest> requests = new LinkedHashMap();

    private SharedNetworkCallback() {
    }

    static final ab addCallback$lambda$1(l lVar, ConnectivityManager connectivityManager) {
        synchronized (requestsLock) {
            Map<l<ConstraintsState, ab>, NetworkRequest> map = requests;
            map.remove(lVar);
            if (map.isEmpty()) {
                Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController unregister shared callback");
                connectivityManager.unregisterNetworkCallback(INSTANCE);
                isBlocked = null;
                cachedCapabilities = null;
                capabilitiesInitialized = false;
            }
        }
        return ab.f48028a;
    }

    private final boolean areNetworkConstraintsSatisfied(NetworkRequest networkRequest, NetworkCapabilities networkCapabilities) {
        Boolean bool = isBlocked;
        x.c(bool);
        return !bool.booleanValue() && networkRequest.canBeSatisfiedBy(networkCapabilities);
    }

    private final void dispatchOnConstraintState() {
        ArrayList<k> arrayList = new ArrayList();
        synchronized (requestsLock) {
            if (capabilitiesInitialized && isBlocked != null) {
                Iterator<T> it = requests.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    arrayList.add(new k((l) entry.getKey(), INSTANCE.areNetworkConstraintsSatisfied((NetworkRequest) entry.getValue(), cachedCapabilities) ? ConstraintsState.ConstraintsMet.INSTANCE : new ConstraintsState.ConstraintsNotMet(7)));
                }
                for (k kVar : arrayList) {
                    ((l) kVar.a()).invoke((ConstraintsState) kVar.b());
                }
                return;
            }
            Logger.get().debug(WorkConstraintsTrackerKt.TAG, "Not dispatching constraint state yet: isBlocked=" + isBlocked + ", capabilitiesInitialized=" + capabilitiesInitialized);
        }
    }

    public final a<ab> addCallback(final ConnectivityManager connectivityManager, NetworkRequest networkRequest, final l<? super ConstraintsState, ab> lVar) {
        x.f(connectivityManager, "connManager");
        x.f(networkRequest, "networkRequest");
        x.f(lVar, "onConstraintState");
        synchronized (requestsLock) {
            Map<l<ConstraintsState, ab>, NetworkRequest> map = requests;
            if (map.isEmpty()) {
                Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController register shared callback");
                try {
                    connectivityManager.registerDefaultNetworkCallback(INSTANCE);
                } catch (SecurityException e2) {
                    Logger.get().error(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController couldn't register callback", e2);
                    lVar.invoke(new ConstraintsState.ConstraintsNotMet(7));
                    return new a() { // from class: androidx.work.impl.constraints.SharedNetworkCallback$$ExternalSyntheticLambda0
                        @Override // h.g.a.a
                        public final Object invoke() {
                            return ab.f48028a;
                        }
                    };
                }
            } else if (capabilitiesInitialized && isBlocked != null) {
                Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController send initial capabilities");
                lVar.invoke(INSTANCE.areNetworkConstraintsSatisfied(networkRequest, cachedCapabilities) ? ConstraintsState.ConstraintsMet.INSTANCE : new ConstraintsState.ConstraintsNotMet(7));
            }
            map.put(lVar, networkRequest);
        }
        return new a() { // from class: androidx.work.impl.constraints.SharedNetworkCallback$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return SharedNetworkCallback.addCallback$lambda$1(lVar, connectivityManager);
            }
        };
    }

    public final NetworkCapabilities getCachedCapabilities() {
        return cachedCapabilities;
    }

    public final boolean getCapabilitiesInitialized() {
        return capabilitiesInitialized;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z) {
        x.f(network, "network");
        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onBlockedStatusChanged callback " + z);
        synchronized (requestsLock) {
            Boolean bool = isBlocked;
            Boolean boolValueOf = Boolean.valueOf(z);
            if (x.n(bool, boolValueOf)) {
                return;
            }
            isBlocked = boolValueOf;
            dispatchOnConstraintState();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        x.f(network, "network");
        x.f(networkCapabilities, "networkCapabilities");
        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (requestsLock) {
            cachedCapabilities = networkCapabilities;
            capabilitiesInitialized = true;
        }
        dispatchOnConstraintState();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        x.f(network, "network");
        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onLost callback");
        synchronized (requestsLock) {
            cachedCapabilities = null;
            Iterator<T> it = requests.keySet().iterator();
            while (it.hasNext()) {
                ((l) it.next()).invoke(new ConstraintsState.ConstraintsNotMet(7));
            }
        }
    }

    public final void setCachedCapabilities(NetworkCapabilities networkCapabilities) {
        cachedCapabilities = networkCapabilities;
    }

    public final void setCapabilitiesInitialized(boolean z) {
        capabilitiesInitialized = z;
    }
}
