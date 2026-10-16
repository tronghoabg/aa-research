package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class ajvs {
    public static final ajvs a;
    public static final ajvs b;
    public static final ajvs c;
    public static final ajvs d;
    public static final ajvs e;
    public static final ajvs f;
    private static final /* synthetic */ ajvs[] g;

    static {
        ajvs ajvsVar = new ajvs("UNINITIATED", 0);
        a = ajvsVar;
        ajvs ajvsVar2 = new ajvs("CHALLENGE_RECEIVED", 1);
        b = ajvsVar2;
        ajvs ajvsVar3 = new ajvs("MSG_TYPE1_GENERATED", 2);
        c = ajvsVar3;
        ajvs ajvsVar4 = new ajvs("MSG_TYPE2_RECEVIED", 3);
        d = ajvsVar4;
        ajvs ajvsVar5 = new ajvs("MSG_TYPE3_GENERATED", 4);
        e = ajvsVar5;
        ajvs ajvsVar6 = new ajvs("FAILED", 5);
        f = ajvsVar6;
        g = new ajvs[]{ajvsVar, ajvsVar2, ajvsVar3, ajvsVar4, ajvsVar5, ajvsVar6};
    }

    public static ajvs valueOf(String str) {
        return (ajvs) Enum.valueOf(ajvs.class, str);
    }

    public static ajvs[] values() {
        return (ajvs[]) g.clone();
    }
}
