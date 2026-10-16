package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class oqx {
    public static final defpackage.oqx a;
    public static final defpackage.oqx b;
    public static final defpackage.oqx c;
    public static final defpackage.oqx d;
    private static final /* synthetic */ defpackage.oqx[] e;

    static {
        defpackage.oqx oqxVar = new defpackage.oqx("DISABLED", 0);
        a = oqxVar;
        defpackage.oqx oqxVar2 = new defpackage.oqx("MENDEL_FLAG_ENABLED", 1);
        b = oqxVar2;
        defpackage.oqx oqxVar3 = new defpackage.oqx("DEVELOPER_SETTING_ENABLED", 2);
        c = oqxVar3;
        defpackage.oqx oqxVar4 = new defpackage.oqx("CLIENT_FLAG_ENABLED", 3);
        d = oqxVar4;
        e = new defpackage.oqx[]{oqxVar, oqxVar2, oqxVar3, oqxVar4};
    }

    public static defpackage.oqx valueOf(java.lang.String str) {
        return (defpackage.oqx) java.lang.Enum.valueOf(defpackage.oqx.class, str);
    }

    public static defpackage.oqx[] values() {
        return (defpackage.oqx[]) e.clone();
    }
}
