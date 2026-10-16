package androidx.compose.ui.text.input;

import androidx.webkit.Profile;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class ImeAction {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unspecified = -1;
    private static final int Default = 1;
    private static final int None = 0;
    private static final int Go = 2;
    private static final int Search = 3;
    private static final int Send = 4;
    private static final int Previous = 5;
    private static final int Next = 6;
    private static final int Done = 7;

    private /* synthetic */ ImeAction(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImeAction m10714boximpl(int i2) {
        return new ImeAction(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10716equalsimpl(int i2, Object obj) {
        return (obj instanceof ImeAction) && i2 == ((ImeAction) obj).m10720unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10717equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10719toStringimpl(int i2) {
        return m10717equalsimpl0(i2, Unspecified) ? "Unspecified" : m10717equalsimpl0(i2, None) ? "None" : m10717equalsimpl0(i2, Default) ? Profile.DEFAULT_PROFILE_NAME : m10717equalsimpl0(i2, Go) ? "Go" : m10717equalsimpl0(i2, Search) ? "Search" : m10717equalsimpl0(i2, Send) ? "Send" : m10717equalsimpl0(i2, Previous) ? "Previous" : m10717equalsimpl0(i2, Next) ? "Next" : m10717equalsimpl0(i2, Done) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m10716equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m10719toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m10720unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getDefault-eUduSuo, reason: not valid java name */
        public final int m10730getDefaulteUduSuo() {
            return ImeAction.Default;
        }

        /* renamed from: getDone-eUduSuo, reason: not valid java name */
        public final int m10731getDoneeUduSuo() {
            return ImeAction.Done;
        }

        /* renamed from: getGo-eUduSuo, reason: not valid java name */
        public final int m10732getGoeUduSuo() {
            return ImeAction.Go;
        }

        /* renamed from: getNext-eUduSuo, reason: not valid java name */
        public final int m10733getNexteUduSuo() {
            return ImeAction.Next;
        }

        /* renamed from: getNone-eUduSuo, reason: not valid java name */
        public final int m10734getNoneeUduSuo() {
            return ImeAction.None;
        }

        /* renamed from: getPrevious-eUduSuo, reason: not valid java name */
        public final int m10735getPreviouseUduSuo() {
            return ImeAction.Previous;
        }

        /* renamed from: getSearch-eUduSuo, reason: not valid java name */
        public final int m10736getSearcheUduSuo() {
            return ImeAction.Search;
        }

        /* renamed from: getSend-eUduSuo, reason: not valid java name */
        public final int m10737getSendeUduSuo() {
            return ImeAction.Send;
        }

        /* renamed from: getUnspecified-eUduSuo, reason: not valid java name */
        public final int m10738getUnspecifiedeUduSuo() {
            return ImeAction.Unspecified;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* renamed from: getDefault-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m10721getDefaulteUduSuo$annotations() {
        }

        /* renamed from: getDone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m10722getDoneeUduSuo$annotations() {
        }

        /* renamed from: getGo-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m10723getGoeUduSuo$annotations() {
        }

        /* renamed from: getNext-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m10724getNexteUduSuo$annotations() {
        }

        /* renamed from: getNone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m10725getNoneeUduSuo$annotations() {
        }

        /* renamed from: getPrevious-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m10726getPreviouseUduSuo$annotations() {
        }

        /* renamed from: getSearch-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m10727getSearcheUduSuo$annotations() {
        }

        /* renamed from: getSend-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m10728getSendeUduSuo$annotations() {
        }

        /* renamed from: getUnspecified-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m10729getUnspecifiedeUduSuo$annotations() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m10715constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10718hashCodeimpl(int i2) {
        return i2;
    }
}
