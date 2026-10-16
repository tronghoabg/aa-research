package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements j$.time.format.e {
    public static final j$.time.format.p INSENSITIVE;
    public static final j$.time.format.p LENIENT;
    public static final j$.time.format.p SENSITIVE;
    public static final j$.time.format.p STRICT;
    public static final /* synthetic */ j$.time.format.p[] a;

    static {
        j$.time.format.p pVar = new j$.time.format.p("SENSITIVE", 0);
        SENSITIVE = pVar;
        j$.time.format.p pVar2 = new j$.time.format.p("INSENSITIVE", 1);
        INSENSITIVE = pVar2;
        j$.time.format.p pVar3 = new j$.time.format.p("STRICT", 2);
        STRICT = pVar3;
        j$.time.format.p pVar4 = new j$.time.format.p("LENIENT", 3);
        LENIENT = pVar4;
        a = new j$.time.format.p[]{pVar, pVar2, pVar3, pVar4};
    }

    public static j$.time.format.p valueOf(java.lang.String str) {
        return (j$.time.format.p) java.lang.Enum.valueOf(j$.time.format.p.class, str);
    }

    public static j$.time.format.p[] values() {
        return (j$.time.format.p[]) a.clone();
    }

    @Override // j$.time.format.e
    public final boolean h(j$.time.format.x xVar, java.lang.StringBuilder sb) {
        return true;
    }

    @Override // j$.time.format.e
    public final int k(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            vVar.b = true;
            return i;
        }
        if (iOrdinal == 1) {
            vVar.b = false;
            return i;
        }
        if (iOrdinal == 2) {
            vVar.c = true;
            return i;
        }
        if (iOrdinal != 3) {
            return i;
        }
        vVar.c = false;
        return i;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (iOrdinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (iOrdinal == 2) {
            return "ParseStrict(true)";
        }
        if (iOrdinal == 3) {
            return "ParseStrict(false)";
        }
        throw new java.lang.IllegalStateException("Unreachable");
    }
}
