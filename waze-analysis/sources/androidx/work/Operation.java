package androidx.work;

import androidx.lifecycle.LiveData;
import com.google.d.m.a.bm;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface Operation {
    public static final State.IN_PROGRESS IN_PROGRESS;
    public static final State.SUCCESS SUCCESS;

    /* compiled from: WazeSource */
    public abstract class State {

        /* compiled from: WazeSource */
        public final class FAILURE extends State {
            private final Throwable mThrowable;

            public FAILURE(Throwable th) {
                this.mThrowable = th;
            }

            public Throwable getThrowable() {
                return this.mThrowable;
            }

            public String toString() {
                return "FAILURE (" + this.mThrowable.getMessage() + ")";
            }
        }

        /* compiled from: WazeSource */
        public final class IN_PROGRESS extends State {
            private IN_PROGRESS() {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        /* compiled from: WazeSource */
        public final class SUCCESS extends State {
            private SUCCESS() {
            }

            public String toString() {
                return "SUCCESS";
            }
        }

        State() {
        }
    }

    static {
        SUCCESS = new State.SUCCESS();
        IN_PROGRESS = new State.IN_PROGRESS();
    }

    bm<State.SUCCESS> getResult();

    LiveData<State> getState();
}
