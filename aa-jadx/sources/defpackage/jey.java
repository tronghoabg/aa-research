package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jey {
    public static final defpackage.jey a;
    public static final defpackage.jey b;
    public static final defpackage.jey c;
    public static final defpackage.jey d;
    public static final defpackage.jey e;
    public static final defpackage.jey f;
    private static final /* synthetic */ defpackage.jey[] g;

    static {
        defpackage.jey jeyVar = new defpackage.jey("IDLE", 0);
        a = jeyVar;
        defpackage.jey jeyVar2 = new defpackage.jey("CONNECTING", 1);
        b = jeyVar2;
        defpackage.jey jeyVar3 = new defpackage.jey("CONNECTED", 2);
        c = jeyVar3;
        defpackage.jey jeyVar4 = new defpackage.jey("DISCONNECTING", 3);
        d = jeyVar4;
        defpackage.jey jeyVar5 = new defpackage.jey("DISCONNECTED", 4);
        e = jeyVar5;
        defpackage.jey jeyVar6 = new defpackage.jey("PREFLIGHT", 5);
        f = jeyVar6;
        g = new defpackage.jey[]{jeyVar, jeyVar2, jeyVar3, jeyVar4, jeyVar5, jeyVar6};
    }

    public static defpackage.jey valueOf(java.lang.String str) {
        return (defpackage.jey) java.lang.Enum.valueOf(defpackage.jey.class, str);
    }

    public static defpackage.jey[] values() {
        return (defpackage.jey[]) g.clone();
    }
}
