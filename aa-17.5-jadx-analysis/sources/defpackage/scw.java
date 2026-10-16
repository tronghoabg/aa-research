package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class scw {
    public static final scw a;
    public static final scw b;
    public static final scw c;
    private static final /* synthetic */ scw[] d;

    static {
        scw scwVar = new scw("USB", 0);
        a = scwVar;
        scw scwVar2 = new scw("WIFI", 1);
        b = scwVar2;
        scw scwVar3 = new scw("CHROMECAST", 2);
        c = scwVar3;
        d = new scw[]{scwVar, scwVar2, scwVar3};
    }

    public static scw valueOf(String str) {
        return (scw) Enum.valueOf(scw.class, str);
    }

    public static scw[] values() {
        return (scw[]) d.clone();
    }
}
