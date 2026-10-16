package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface StartStopTokens {
    public static final Companion Companion = Companion.$$INSTANCE;

    boolean contains(WorkGenerationalId workGenerationalId);

    StartStopToken remove(WorkGenerationalId workGenerationalId);

    StartStopToken remove(WorkSpec workSpec);

    List<StartStopToken> remove(String str);

    StartStopToken tokenFor(WorkGenerationalId workGenerationalId);

    StartStopToken tokenFor(WorkSpec workSpec);

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.StartStopTokens$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static StartStopToken $default$remove(StartStopTokens startStopTokens, WorkSpec workSpec) {
            x.f(workSpec, "spec");
            return startStopTokens.remove(WorkSpecKt.generationalId(workSpec));
        }

        public static StartStopToken $default$tokenFor(StartStopTokens startStopTokens, WorkSpec workSpec) {
            x.f(workSpec, "spec");
            return startStopTokens.tokenFor(WorkSpecKt.generationalId(workSpec));
        }

        public static StartStopTokens create() {
            return StartStopTokens.Companion.create();
        }

        public static StartStopTokens create(boolean z) {
            return StartStopTokens.Companion.create(z);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ StartStopTokens create$default(Companion companion, boolean z, int i2, Object obj) {
            return companion.create(1 == ((z ? 1 : 0) | (i2 & 1)));
        }

        public final StartStopTokens create(boolean z) {
            StartStopTokensImpl startStopTokensImpl = new StartStopTokensImpl();
            return z ? new SynchronizedStartStopTokensImpl(startStopTokensImpl) : startStopTokensImpl;
        }

        public final StartStopTokens create() {
            return create$default(this, false, 1, null);
        }
    }
}
