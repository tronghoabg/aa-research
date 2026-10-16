package androidx.work.multiprocess;

import androidx.work.OneTimeWorkRequest;
import com.google.d.m.a.bm;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class RemoteWorkContinuation {
    protected RemoteWorkContinuation() {
    }

    public static RemoteWorkContinuation combine(List<RemoteWorkContinuation> list) {
        return list.get(0).combineInternal(list);
    }

    protected abstract RemoteWorkContinuation combineInternal(List<RemoteWorkContinuation> list);

    public abstract bm<Void> enqueue();

    public final RemoteWorkContinuation then(OneTimeWorkRequest oneTimeWorkRequest) {
        return then(Collections.singletonList(oneTimeWorkRequest));
    }

    public abstract RemoteWorkContinuation then(List<OneTimeWorkRequest> list);
}
