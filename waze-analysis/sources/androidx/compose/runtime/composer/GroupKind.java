package androidx.compose.runtime.composer;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class GroupKind {
    public static final Companion Companion = new Companion(null);
    private static final int Group = 0;
    private static final int Node = 1;
    private static final int ReusableNode = 2;
    private final int value;

    private /* synthetic */ GroupKind(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GroupKind m7403boximpl(int i2) {
        return new GroupKind(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7405equalsimpl(int i2, Object obj) {
        return (obj instanceof GroupKind) && i2 == ((GroupKind) obj).m7411unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7406equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: isNode-impl, reason: not valid java name */
    public static final boolean m7408isNodeimpl(int i2) {
        return i2 != Companion.m7412getGroup9udXigM();
    }

    /* renamed from: isReusable-impl, reason: not valid java name */
    public static final boolean m7409isReusableimpl(int i2) {
        return i2 != Companion.m7413getNode9udXigM();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7410toStringimpl(int i2) {
        return "GroupKind(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m7405equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m7410toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7411unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getGroup-9udXigM, reason: not valid java name */
        public final int m7412getGroup9udXigM() {
            return GroupKind.Group;
        }

        /* renamed from: getNode-9udXigM, reason: not valid java name */
        public final int m7413getNode9udXigM() {
            return GroupKind.Node;
        }

        /* renamed from: getReusableNode-9udXigM, reason: not valid java name */
        public final int m7414getReusableNode9udXigM() {
            return GroupKind.ReusableNode;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m7404constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7407hashCodeimpl(int i2) {
        return i2;
    }
}
