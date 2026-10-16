package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
final class tvy {
    public static final defpackage.tvy a;
    public static final defpackage.tvy b;
    public static final defpackage.tvy c;
    public static final defpackage.tvy d;
    private static final /* synthetic */ defpackage.tvy[] e;

    static {
        defpackage.tvy tvyVar = new defpackage.tvy("PAN", 0);
        a = tvyVar;
        defpackage.tvy tvyVar2 = new defpackage.tvy("ZOOM", 1);
        b = tvyVar2;
        defpackage.tvy tvyVar3 = new defpackage.tvy("ROTATE", 2);
        c = tvyVar3;
        defpackage.tvy tvyVar4 = new defpackage.tvy("TILT", 3);
        d = tvyVar4;
        e = new defpackage.tvy[]{tvyVar, tvyVar2, tvyVar3, tvyVar4};
    }

    public static defpackage.tvy valueOf(java.lang.String str) {
        return (defpackage.tvy) java.lang.Enum.valueOf(defpackage.tvy.class, str);
    }

    public static defpackage.tvy[] values() {
        return (defpackage.tvy[]) e.clone();
    }
}
