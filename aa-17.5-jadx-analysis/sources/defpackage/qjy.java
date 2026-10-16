package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class qjy {
    public static final qjy a;
    public static final qjy b;
    public static final qjy c;
    public static final qjy d;
    public static final qjy e;
    public static final qjy f;
    private static final /* synthetic */ qjy[] g;

    static {
        qjy qjyVar = new qjy("GOTO_APP", 0);
        a = qjyVar;
        qjy qjyVar2 = new qjy("MUTE_CALL", 1);
        b = qjyVar2;
        qjy qjyVar3 = new qjy("UNMUTE_CALL", 2);
        c = qjyVar3;
        qjy qjyVar4 = new qjy("END_CALL", 3);
        d = qjyVar4;
        qjy qjyVar5 = new qjy("ACCEPT_CALL", 4);
        e = qjyVar5;
        qjy qjyVar6 = new qjy("REJECT_CALL", 5);
        f = qjyVar6;
        g = new qjy[]{qjyVar, qjyVar2, qjyVar3, qjyVar4, qjyVar5, qjyVar6};
    }

    public static qjy valueOf(String str) {
        return (qjy) Enum.valueOf(qjy.class, str);
    }

    public static qjy[] values() {
        return (qjy[]) g.clone();
    }
}
