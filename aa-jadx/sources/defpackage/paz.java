package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class paz {
    public static final defpackage.paz a;
    public static final defpackage.paz b;
    private static final /* synthetic */ defpackage.paz[] c;

    static {
        defpackage.paz pazVar = new defpackage.paz("RFCOMM", 0);
        a = pazVar;
        defpackage.paz pazVar2 = new defpackage.paz("TCP", 1);
        b = pazVar2;
        c = new defpackage.paz[]{pazVar, pazVar2};
    }

    public static defpackage.paz valueOf(java.lang.String str) {
        return (defpackage.paz) java.lang.Enum.valueOf(defpackage.paz.class, str);
    }

    public static defpackage.paz[] values() {
        return (defpackage.paz[]) c.clone();
    }
}
