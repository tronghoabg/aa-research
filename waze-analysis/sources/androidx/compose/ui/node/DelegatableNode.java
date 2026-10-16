package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface DelegatableNode {

    /* compiled from: WazeSource */
    public interface RegistrationHandle {
        void unregister();
    }

    Modifier.Node getNode();

    void onDensityChange();

    void onLayoutDirectionChange();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.node.DelegatableNode$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onDensityChange(DelegatableNode delegatableNode) {
        }

        public static void $default$onLayoutDirectionChange(DelegatableNode delegatableNode) {
        }
    }
}
