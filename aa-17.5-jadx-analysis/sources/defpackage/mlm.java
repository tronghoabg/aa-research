package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class mlm implements ngd {
    public static final mlm a;
    private static final /* synthetic */ mlm[] b;

    static {
        mlm mlmVar = new mlm();
        a = mlmVar;
        b = new mlm[]{mlmVar};
    }

    private mlm() {
    }

    public static mlm valueOf(String str) {
        return (mlm) Enum.valueOf(mlm.class, str);
    }

    public static mlm[] values() {
        return (mlm[]) b.clone();
    }

    @Override // defpackage.ngd
    public final String a() {
        return "settings";
    }

    @Override // defpackage.ngd
    public final String b() {
        return name();
    }
}
