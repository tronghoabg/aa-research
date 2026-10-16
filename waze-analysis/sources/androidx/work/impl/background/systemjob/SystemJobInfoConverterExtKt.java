package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.net.NetworkRequest;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SystemJobInfoConverterExtKt {
    public static final void setRequiredNetworkRequest(JobInfo.Builder builder, NetworkRequest networkRequest) {
        x.f(builder, "builder");
        builder.setRequiredNetwork(networkRequest);
    }
}
