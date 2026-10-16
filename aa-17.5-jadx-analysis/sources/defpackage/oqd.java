package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class oqd {
    public static final oqd a;
    public static final oqd b;
    public static final oqd c;
    public static final oqd d;
    private static final /* synthetic */ oqd[] e;

    static {
        oqd oqdVar = new oqd("DISABLED", 0);
        a = oqdVar;
        oqd oqdVar2 = new oqd("MENDEL_FLAG_ENABLED", 1);
        b = oqdVar2;
        oqd oqdVar3 = new oqd("DEVELOPER_SETTING_ENABLED", 2);
        c = oqdVar3;
        oqd oqdVar4 = new oqd("CLIENT_FLAG_ENABLED", 3);
        d = oqdVar4;
        e = new oqd[]{oqdVar, oqdVar2, oqdVar3, oqdVar4};
    }

    public static oqd valueOf(String str) {
        return (oqd) Enum.valueOf(oqd.class, str);
    }

    public static oqd[] values() {
        return (oqd[]) e.clone();
    }
}
