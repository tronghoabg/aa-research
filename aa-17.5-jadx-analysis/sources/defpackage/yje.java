package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class yje {
    public static final yje a;
    public static final yje b;
    private static final /* synthetic */ yje[] c;

    static {
        yje yjeVar = new yje("STRONG", 0);
        a = yjeVar;
        yje yjeVar2 = new yje("WEAK", 1);
        b = yjeVar2;
        c = new yje[]{yjeVar, yjeVar2};
    }

    public static yje valueOf(String str) {
        return (yje) Enum.valueOf(yje.class, str);
    }

    public static yje[] values() {
        return (yje[]) c.clone();
    }

    final xww a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return xwt.a;
        }
        if (iOrdinal == 1) {
            return xwu.a;
        }
        throw null;
    }
}
