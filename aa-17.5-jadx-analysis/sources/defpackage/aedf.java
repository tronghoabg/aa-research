package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class aedf {
    public static final aedf a;
    public static final aedf b;
    public static final aedf c;
    private static final /* synthetic */ aedf[] d;

    static {
        aedf aedfVar = new aedf("BLOCKING", 0);
        a = aedfVar;
        aedf aedfVar2 = new aedf("FUTURE", 1);
        b = aedfVar2;
        aedf aedfVar3 = new aedf("ASYNC", 2);
        c = aedfVar3;
        d = new aedf[]{aedfVar, aedfVar2, aedfVar3};
    }

    public static aedf valueOf(String str) {
        return (aedf) Enum.valueOf(aedf.class, str);
    }

    public static aedf[] values() {
        return (aedf[]) d.clone();
    }
}
