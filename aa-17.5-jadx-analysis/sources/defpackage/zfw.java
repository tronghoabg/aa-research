package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
final class zfw {
    public static final zfw a;
    public static final zfw b;
    public static final zfw c;
    private static final /* synthetic */ zfw[] d;

    static {
        zfw zfwVar = new zfw("NOT_RUN", 0);
        a = zfwVar;
        zfw zfwVar2 = new zfw("CANCELLED", 1);
        b = zfwVar2;
        zfw zfwVar3 = new zfw("STARTED", 2);
        c = zfwVar3;
        d = new zfw[]{zfwVar, zfwVar2, zfwVar3};
    }

    public static zfw valueOf(String str) {
        return (zfw) Enum.valueOf(zfw.class, str);
    }

    public static zfw[] values() {
        return (zfw[]) d.clone();
    }
}
