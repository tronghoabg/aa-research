package androidx.compose.ui.unit;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class TextUnitType {
    private final long type;
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = 0;
    private static final long Sp = 4294967296L;
    private static final long Em = 8589934592L;

    private /* synthetic */ TextUnitType(long j2) {
        this.type = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnitType m11387boximpl(long j2) {
        return new TextUnitType(j2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11389equalsimpl(long j2, Object obj) {
        return (obj instanceof TextUnitType) && j2 == ((TextUnitType) obj).m11393unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11390equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11391hashCodeimpl(long j2) {
        return TextUnitType$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11392toStringimpl(long j2) {
        return m11390equalsimpl0(j2, Unspecified) ? "Unspecified" : m11390equalsimpl0(j2, Sp) ? "Sp" : m11390equalsimpl0(j2, Em) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m11389equalsimpl(this.type, obj);
    }

    public int hashCode() {
        return m11391hashCodeimpl(this.type);
    }

    public String toString() {
        return m11392toStringimpl(this.type);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m11393unboximpl() {
        return this.type;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getEm-UIouoOA, reason: not valid java name */
        public final long m11394getEmUIouoOA() {
            return TextUnitType.Em;
        }

        /* renamed from: getSp-UIouoOA, reason: not valid java name */
        public final long m11395getSpUIouoOA() {
            return TextUnitType.Sp;
        }

        /* renamed from: getUnspecified-UIouoOA, reason: not valid java name */
        public final long m11396getUnspecifiedUIouoOA() {
            return TextUnitType.Unspecified;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m11388constructorimpl(long j2) {
        return j2;
    }
}
