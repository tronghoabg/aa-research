package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class xyo {
    public static final xyo a;
    private static final /* synthetic */ xyo[] b;

    static {
        xyo xyoVar = new xyo();
        a = xyoVar;
        b = new xyo[]{xyoVar};
    }

    private xyo() {
    }

    public static xyo valueOf(String str) {
        return (xyo) Enum.valueOf(xyo.class, str);
    }

    public static xyo[] values() {
        return (xyo[]) b.clone();
    }
}
