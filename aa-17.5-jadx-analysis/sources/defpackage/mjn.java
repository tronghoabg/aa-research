package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class mjn {
    public static final mjn a;
    public static final mjn b;
    public static final mjn c;
    public static final mjn d;
    private static final /* synthetic */ mjn[] e;

    static {
        mjn mjnVar = new mjn("DAB", 0);
        a = mjnVar;
        mjn mjnVar2 = new mjn("FM", 1);
        b = mjnVar2;
        mjn mjnVar3 = new mjn("AM", 2);
        c = mjnVar3;
        mjn mjnVar4 = new mjn("OTHER", 3);
        d = mjnVar4;
        e = new mjn[]{mjnVar, mjnVar2, mjnVar3, mjnVar4};
    }

    public static mjn valueOf(String str) {
        return (mjn) Enum.valueOf(mjn.class, str);
    }

    public static mjn[] values() {
        return (mjn[]) e.clone();
    }
}
