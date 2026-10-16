package androidx.work;

import androidx.work.OneTimeWorkRequest;
import h.g.b.o;
import h.g.b.x;
import h.l.c;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class OneTimeWorkRequestKt {
    public static final /* synthetic */ <W extends ListenableWorker> OneTimeWorkRequest.Builder OneTimeWorkRequestBuilder() {
        x.i();
        return new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) ListenableWorker.class);
    }

    public static final OneTimeWorkRequest.Builder setInputMerger(OneTimeWorkRequest.Builder builder, c<? extends InputMerger> cVar) {
        x.f(builder, "<this>");
        x.f(cVar, "inputMerger");
        builder.setInputMerger(o.w(cVar));
        return builder;
    }
}
