package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.TransferableContent;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class ReceiveContentConfiguration {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    public abstract ReceiveContentListener getReceiveContentListener();

    public final boolean onCommitContent(TransferableContent transferableContent) {
        return !x.n(getReceiveContentListener().onReceive(transferableContent), transferableContent);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final ReceiveContentConfiguration invoke(ReceiveContentListener receiveContentListener) {
            return new ReceiveContentConfigurationImpl(receiveContentListener);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
