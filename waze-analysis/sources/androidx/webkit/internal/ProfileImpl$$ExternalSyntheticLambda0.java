package androidx.webkit.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class ProfileImpl$$ExternalSyntheticLambda0 implements Executor {
    public /* synthetic */ Handler f$0;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f$0.post(runnable);
    }
}
