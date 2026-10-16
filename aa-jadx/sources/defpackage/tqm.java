package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
final class tqm {
    public static final defpackage.tqm a;
    public static final defpackage.tqm b;
    private static final /* synthetic */ defpackage.tqm[] c;

    static {
        defpackage.umt umtVar = defpackage.umt.a;
        defpackage.tqm tqmVar = new defpackage.tqm("LEGACY_AMBIENT", 0);
        a = tqmVar;
        defpackage.tqm tqmVar2 = new defpackage.tqm("AMBIENT_2", 1);
        b = tqmVar2;
        c = new defpackage.tqm[]{tqmVar, tqmVar2};
    }

    public static defpackage.tqm valueOf(java.lang.String str) {
        return (defpackage.tqm) java.lang.Enum.valueOf(defpackage.tqm.class, str);
    }

    public static defpackage.tqm[] values() {
        return (defpackage.tqm[]) c.clone();
    }
}
