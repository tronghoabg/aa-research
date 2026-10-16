package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class p implements e {
    public static final p INSENSITIVE;
    public static final p LENIENT;
    public static final p SENSITIVE;
    public static final p STRICT;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ p[] f49974a;

    static {
        p pVar = new p("SENSITIVE", 0);
        SENSITIVE = pVar;
        p pVar2 = new p("INSENSITIVE", 1);
        INSENSITIVE = pVar2;
        p pVar3 = new p("STRICT", 2);
        STRICT = pVar3;
        p pVar4 = new p("LENIENT", 3);
        LENIENT = pVar4;
        f49974a = new p[]{pVar, pVar2, pVar3, pVar4};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f49974a.clone();
    }

    @Override // j$.time.format.e
    public final boolean f(w wVar, StringBuilder sb) {
        return true;
    }

    @Override // j$.time.format.e
    public final int h(u uVar, CharSequence charSequence, int i2) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            uVar.f49991b = true;
            return i2;
        }
        if (iOrdinal == 1) {
            uVar.f49991b = false;
            return i2;
        }
        if (iOrdinal == 2) {
            uVar.f49992c = true;
            return i2;
        }
        if (iOrdinal != 3) {
            return i2;
        }
        uVar.f49992c = false;
        return i2;
    }

    @Override // java.lang.Enum
    public final String toString() {
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
        throw new IllegalStateException("Unreachable");
    }
}
