package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jvy {
    public static final jvy a;
    public static final jvy b;
    public static final jvy c;
    public static final jvy d;
    public static final jvy e;
    private static final /* synthetic */ jvy[] f;

    static {
        jvy jvyVar = new jvy("START", 0);
        a = jvyVar;
        jvy jvyVar2 = new jvy("FETCH", 1);
        b = jvyVar2;
        jvy jvyVar3 = new jvy("SUBSCRIBE", 2);
        c = jvyVar3;
        jvy jvyVar4 = new jvy("UNSUBSCRIBE", 3);
        d = jvyVar4;
        jvy jvyVar5 = new jvy("STOP", 4);
        e = jvyVar5;
        f = new jvy[]{jvyVar, jvyVar2, jvyVar3, jvyVar4, jvyVar5};
    }

    public static jvy valueOf(String str) {
        return (jvy) Enum.valueOf(jvy.class, str);
    }

    public static jvy[] values() {
        return (jvy[]) f.clone();
    }
}
