package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.NetworkApi24;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import h.g.b.x;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NetworkStateTrackerPre28 extends ConstraintTracker<NetworkState> {
    private final ConnectivityManager connectivityManager;
    private volatile boolean isBlocked;
    private final Object lock;
    private final NetworkStateTrackerPre28$networkCallback$1 networkCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.work.impl.constraints.trackers.NetworkStateTrackerPre28$networkCallback$1] */
    public NetworkStateTrackerPre28(Context context, TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        x.f(context, "context");
        x.f(taskExecutor, "taskExecutor");
        Object systemService = getAppContext().getSystemService("connectivity");
        x.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (ConnectivityManager) systemService;
        this.lock = new Object();
        this.networkCallback = new ConnectivityManager.NetworkCallback() { // from class: androidx.work.impl.constraints.trackers.NetworkStateTrackerPre28$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onBlockedStatusChanged(Network network, boolean z) {
                x.f(network, "network");
                if (x.n(network, this.this$0.connectivityManager.getActiveNetwork())) {
                    Logger.get().debug(NetworkStateTrackerKt.TAG, "Network blocked status changed: " + z);
                    NetworkState state = this.this$0.getState();
                    NetworkStateTrackerPre28 networkStateTrackerPre28 = this.this$0;
                    synchronized (networkStateTrackerPre28.lock) {
                        if (networkStateTrackerPre28.isBlocked == z) {
                            return;
                        }
                        networkStateTrackerPre28.isBlocked = z;
                        this.this$0.setState(NetworkState.copy$default(state, false, false, false, false, z, 15, null));
                    }
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                x.f(network, "network");
                x.f(networkCapabilities, "capabilities");
                Logger logger = Logger.get();
                String str = NetworkStateTrackerKt.TAG;
                Objects.toString(networkCapabilities);
                logger.debug(str, "Network capabilities changed: ".concat(String.valueOf(networkCapabilities)));
                NetworkStateTrackerPre28 networkStateTrackerPre28 = this.this$0;
                this.this$0.setState(NetworkStateTrackerKt.getActiveNetworkState(networkStateTrackerPre28.connectivityManager, networkStateTrackerPre28.isBlocked));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                x.f(network, "network");
                Logger.get().debug(NetworkStateTrackerKt.TAG, "Network connection lost");
                this.this$0.setState(new NetworkState(false, false, false, false, false));
            }
        };
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public NetworkState readSystemState() {
        return NetworkStateTrackerKt.getActiveNetworkState(this.connectivityManager, this.isBlocked);
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void startTracking() {
        try {
            Logger.get().debug(NetworkStateTrackerKt.TAG, "Registering network callback");
            NetworkApi24.registerDefaultNetworkCallbackCompat(this.connectivityManager, this.networkCallback);
        } catch (IllegalArgumentException e2) {
            Logger.get().error(NetworkStateTrackerKt.TAG, "Received exception while registering network callback", e2);
        } catch (SecurityException e3) {
            Logger.get().error(NetworkStateTrackerKt.TAG, "Received exception while registering network callback", e3);
        }
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void stopTracking() {
        try {
            Logger.get().debug(NetworkStateTrackerKt.TAG, "Unregistering network callback");
            this.connectivityManager.unregisterNetworkCallback(this.networkCallback);
        } catch (IllegalArgumentException e2) {
            Logger.get().error(NetworkStateTrackerKt.TAG, "Received exception while unregistering network callback", e2);
        } catch (SecurityException e3) {
            Logger.get().error(NetworkStateTrackerKt.TAG, "Received exception while unregistering network callback", e3);
        }
    }
}
