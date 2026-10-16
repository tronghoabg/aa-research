package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import h.ab;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface TextToolbar {
    TextToolbarStatus getStatus();

    void hide();

    void showMenu(Rect rect, a<ab> aVar, a<ab> aVar2, a<ab> aVar3, a<ab> aVar4);

    void showMenu(Rect rect, a<ab> aVar, a<ab> aVar2, a<ab> aVar3, a<ab> aVar4, a<ab> aVar5);

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public final class DefaultImpls {
        @Deprecated
        public static void showMenu(TextToolbar textToolbar, Rect rect, a<ab> aVar, a<ab> aVar2, a<ab> aVar3, a<ab> aVar4, a<ab> aVar5) {
            textToolbar.showMenu(rect, aVar, aVar2, aVar3, aVar4);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.TextToolbar$-CC, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showMenu$default(TextToolbar textToolbar, Rect rect, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
            }
            if ((i2 & 2) != 0) {
                aVar = null;
            }
            if ((i2 & 4) != 0) {
                aVar2 = null;
            }
            if ((i2 & 8) != 0) {
                aVar3 = null;
            }
            if ((i2 & 16) != 0) {
                aVar4 = null;
            }
            if ((i2 & 32) != 0) {
                aVar5 = null;
            }
            textToolbar.showMenu(rect, aVar, aVar2, aVar3, aVar4, aVar5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showMenu$default(TextToolbar textToolbar, Rect rect, a aVar, a aVar2, a aVar3, a aVar4, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
            }
            if ((i2 & 2) != 0) {
                aVar = null;
            }
            if ((i2 & 4) != 0) {
                aVar2 = null;
            }
            if ((i2 & 8) != 0) {
                aVar3 = null;
            }
            if ((i2 & 16) != 0) {
                aVar4 = null;
            }
            textToolbar.showMenu(rect, aVar, aVar2, aVar3, aVar4);
        }
    }
}
