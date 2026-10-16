package androidx.compose.runtime.tooling;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class ComposeStackTraceMode {
    private static boolean isMinified;
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = 0;
    private static final int GroupKeys = 1;
    private static final int SourceInformation = 2;

    private /* synthetic */ ComposeStackTraceMode(int i2) {
        this.value = i2;
    }

    public static final /* synthetic */ boolean access$isMinified$cp() {
        return true;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ComposeStackTraceMode m7637boximpl(int i2) {
        return new ComposeStackTraceMode(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7639equalsimpl(int i2, Object obj) {
        return (obj instanceof ComposeStackTraceMode) && i2 == ((ComposeStackTraceMode) obj).m7643unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7640equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7642toStringimpl(int i2) {
        return "ComposeStackTraceMode(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m7639equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m7642toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7643unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getAuto-MD5MrJc, reason: not valid java name */
        public final int m7644getAutoMD5MrJc() {
            return m7645getGroupKeysMD5MrJc();
        }

        /* renamed from: getGroupKeys-MD5MrJc, reason: not valid java name */
        public final int m7645getGroupKeysMD5MrJc() {
            return ComposeStackTraceMode.GroupKeys;
        }

        /* renamed from: getNone-MD5MrJc, reason: not valid java name */
        public final int m7646getNoneMD5MrJc() {
            return ComposeStackTraceMode.None;
        }

        /* renamed from: getSourceInformation-MD5MrJc, reason: not valid java name */
        public final int m7647getSourceInformationMD5MrJc() {
            return ComposeStackTraceMode.SourceInformation;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m7638constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7641hashCodeimpl(int i2) {
        return i2;
    }
}
