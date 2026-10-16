package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jvx {
    public static final jvx a;
    public static final jvx b;
    public static final jvx c;
    public static final jvx d;
    public static final jvx e;
    public static final jvx f;
    private static final /* synthetic */ jvx[] g;

    static {
        jvx jvxVar = new jvx("OK", 0);
        a = jvxVar;
        jvx jvxVar2 = new jvx("NOT_STARTED", 1);
        b = jvxVar2;
        jvx jvxVar3 = new jvx("CAR_ERROR", 2);
        c = jvxVar3;
        jvx jvxVar4 = new jvx("NOT_ALLOWED", 3);
        d = jvxVar4;
        jvx jvxVar5 = new jvx("REPEATED", 4);
        e = jvxVar5;
        jvx jvxVar6 = new jvx("INVALID_TYPE", 5);
        f = jvxVar6;
        g = new jvx[]{jvxVar, jvxVar2, jvxVar3, jvxVar4, jvxVar5, jvxVar6};
    }

    public static jvx valueOf(String str) {
        return (jvx) Enum.valueOf(jvx.class, str);
    }

    public static jvx[] values() {
        return (jvx[]) g.clone();
    }
}
