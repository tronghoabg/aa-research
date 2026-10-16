package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NetworkStateTrackerKt {
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("NetworkStateTracker");
        x.e(strTagWithPrefix, "tagWithPrefix(...)");
        TAG = strTagWithPrefix;
    }

    public static final ConstraintTracker<NetworkState> NetworkStateTracker(Context context, TaskExecutor taskExecutor) {
        x.f(context, "context");
        x.f(taskExecutor, "taskExecutor");
        return new NetworkStateTrackerPre28(context, taskExecutor);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.work.impl.constraints.NetworkState getActiveNetworkState(android.net.ConnectivityManager r7, boolean r8) {
        /*
            java.lang.String r0 = "connectivityManager"
            h.g.b.x.f(r7, r0)
            android.net.NetworkInfo r0 = r7.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L38
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            boolean r3 = r0.isConnected()     // Catch: java.lang.SecurityException -> L16
            if (r3 == 0) goto L1a
            r3 = r1
            r4 = r2
            goto L1d
        L16:
            r0 = move-exception
            r7 = r0
            r5 = r8
            goto L3b
        L1a:
            r3 = r1
            r1 = r2
            r4 = r1
        L1d:
            boolean r2 = isActiveNetworkValidated(r7)     // Catch: java.lang.SecurityException -> L38
            boolean r7 = androidx.core.net.ConnectivityManagerCompat.isActiveNetworkMetered(r7)     // Catch: java.lang.SecurityException -> L38
            if (r0 == 0) goto L2e
            boolean r0 = r0.isRoaming()     // Catch: java.lang.SecurityException -> L16
            if (r0 != 0) goto L2e
            r4 = r3
        L2e:
            androidx.work.impl.constraints.NetworkState r0 = new androidx.work.impl.constraints.NetworkState     // Catch: java.lang.SecurityException -> L38
            r3 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.SecurityException -> L36
            return r0
        L36:
            r0 = move-exception
            goto L3a
        L38:
            r0 = move-exception
            r5 = r8
        L3a:
            r7 = r0
        L3b:
            androidx.work.Logger r8 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.TAG
            java.lang.String r1 = "Unable to get active network state"
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            r8.error(r0, r1, r7)
            androidx.work.impl.constraints.NetworkState r1 = new androidx.work.impl.constraints.NetworkState
            r4 = 0
            r6 = r5
            r5 = 1
            r2 = 0
            r3 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.getActiveNetworkState(android.net.ConnectivityManager, boolean):androidx.work.impl.constraints.NetworkState");
    }

    public static final boolean isActiveNetworkValidated(ConnectivityManager connectivityManager) {
        x.f(connectivityManager, "<this>");
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (SecurityException e2) {
            Logger.get().error(TAG, "Unable to validate active network", e2);
            return false;
        }
    }
}
