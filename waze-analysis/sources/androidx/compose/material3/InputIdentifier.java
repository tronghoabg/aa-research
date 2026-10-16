package androidx.compose.material3;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class InputIdentifier {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int SingleDateInput = 0;
    private static final int StartDateInput = 1;
    private static final int EndDateInput = 2;

    private /* synthetic */ InputIdentifier(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InputIdentifier m5066boximpl(int i2) {
        return new InputIdentifier(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5068equalsimpl(int i2, Object obj) {
        return (obj instanceof InputIdentifier) && i2 == ((InputIdentifier) obj).m5072unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5069equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5071toStringimpl(int i2) {
        return m5069equalsimpl0(i2, SingleDateInput) ? "SingleDateInput" : m5069equalsimpl0(i2, StartDateInput) ? "StartDateInput" : m5069equalsimpl0(i2, EndDateInput) ? "EndDateInput" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5068equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m5071toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5072unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getEndDateInput-J2x2o4M, reason: not valid java name */
        public final int m5073getEndDateInputJ2x2o4M() {
            return InputIdentifier.EndDateInput;
        }

        /* renamed from: getSingleDateInput-J2x2o4M, reason: not valid java name */
        public final int m5074getSingleDateInputJ2x2o4M() {
            return InputIdentifier.SingleDateInput;
        }

        /* renamed from: getStartDateInput-J2x2o4M, reason: not valid java name */
        public final int m5075getStartDateInputJ2x2o4M() {
            return InputIdentifier.StartDateInput;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5067constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5070hashCodeimpl(int i2) {
        return i2;
    }
}
