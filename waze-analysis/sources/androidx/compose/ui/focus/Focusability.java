package androidx.compose.ui.focus;

import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class Focusability {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Always = 1;
    private static final int SystemDefined = 0;
    private static final int Never = 2;

    private /* synthetic */ Focusability(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Focusability m7906boximpl(int i2) {
        return new Focusability(i2);
    }

    /* renamed from: canFocus-impl$ui, reason: not valid java name */
    public static final boolean m7907canFocusimpl$ui(int i2, CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        if (m7910equalsimpl0(i2, Always)) {
            return true;
        }
        if (m7910equalsimpl0(i2, SystemDefined)) {
            return !InputMode.m9071equalsimpl0(((InputModeManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(compositionLocalConsumerModifierNode, CompositionLocalsKt.getLocalInputModeManager())).mo9078getInputModeaOaMEAU(), InputMode.Companion.m9076getTouchaOaMEAU());
        }
        if (m7910equalsimpl0(i2, Never)) {
            return false;
        }
        throw new IllegalStateException("Unknown Focusability");
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7909equalsimpl(int i2, Object obj) {
        return (obj instanceof Focusability) && i2 == ((Focusability) obj).m7913unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7910equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7912toStringimpl(int i2) {
        if (m7910equalsimpl0(i2, Always)) {
            return "Always";
        }
        if (m7910equalsimpl0(i2, SystemDefined)) {
            return "SystemDefined";
        }
        if (m7910equalsimpl0(i2, Never)) {
            return "Never";
        }
        throw new IllegalStateException("Unknown Focusability");
    }

    public boolean equals(Object obj) {
        return m7909equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m7912toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7913unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getAlways-LCbbffg, reason: not valid java name */
        public final int m7914getAlwaysLCbbffg() {
            return Focusability.Always;
        }

        /* renamed from: getNever-LCbbffg, reason: not valid java name */
        public final int m7915getNeverLCbbffg() {
            return Focusability.Never;
        }

        /* renamed from: getSystemDefined-LCbbffg, reason: not valid java name */
        public final int m7916getSystemDefinedLCbbffg() {
            return Focusability.SystemDefined;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m7908constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7911hashCodeimpl(int i2) {
        return i2;
    }
}
