package androidx.compose.ui.focus;

import androidx.compose.ui.geometry.Rect;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface FocusProperties {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Rect UnsetFocusRect = new Rect(Float.NaN, Float.NaN, Float.NaN, Float.NaN);

        private Companion() {
        }

        public final Rect getUnsetFocusRect() {
            return UnsetFocusRect;
        }
    }

    boolean getCanFocus();

    FocusRequester getDown();

    FocusRequester getEnd();

    l<FocusDirection, FocusRequester> getEnter();

    l<FocusDirection, FocusRequester> getExit();

    Rect getFocusRect();

    FocusRequester getLeft();

    FocusRequester getNext();

    l<FocusEnterExitScope, ab> getOnEnter();

    l<FocusEnterExitScope, ab> getOnExit();

    FocusRequester getPrevious();

    FocusRequester getRight();

    FocusRequester getStart();

    FocusRequester getUp();

    void setCanFocus(boolean z);

    void setDown(FocusRequester focusRequester);

    void setEnd(FocusRequester focusRequester);

    void setEnter(l<? super FocusDirection, FocusRequester> lVar);

    void setExit(l<? super FocusDirection, FocusRequester> lVar);

    void setFocusRect(Rect rect);

    void setLeft(FocusRequester focusRequester);

    void setNext(FocusRequester focusRequester);

    void setOnEnter(l<? super FocusEnterExitScope, ab> lVar);

    void setOnExit(l<? super FocusEnterExitScope, ab> lVar);

    void setPrevious(FocusRequester focusRequester);

    void setRight(FocusRequester focusRequester);

    void setStart(FocusRequester focusRequester);

    void setUp(FocusRequester focusRequester);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.focus.FocusProperties$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void getEnter$annotations() {
        }

        public static /* synthetic */ void getExit$annotations() {
        }

        public static void $default$setDown(FocusProperties focusProperties, FocusRequester focusRequester) {
        }

        public static void $default$setEnd(FocusProperties focusProperties, FocusRequester focusRequester) {
        }

        public static void $default$setFocusRect(FocusProperties focusProperties, Rect rect) {
        }

        public static void $default$setLeft(FocusProperties focusProperties, FocusRequester focusRequester) {
        }

        public static void $default$setNext(FocusProperties focusProperties, FocusRequester focusRequester) {
        }

        public static void $default$setOnEnter(FocusProperties focusProperties, l lVar) {
        }

        public static void $default$setOnExit(FocusProperties focusProperties, l lVar) {
        }

        public static void $default$setPrevious(FocusProperties focusProperties, FocusRequester focusRequester) {
        }

        public static void $default$setRight(FocusProperties focusProperties, FocusRequester focusRequester) {
        }

        public static void $default$setStart(FocusProperties focusProperties, FocusRequester focusRequester) {
        }

        public static void $default$setUp(FocusProperties focusProperties, FocusRequester focusRequester) {
        }
    }
}
