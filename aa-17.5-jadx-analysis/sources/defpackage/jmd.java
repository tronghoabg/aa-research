package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@zje(a = zjc.a)
/* loaded from: classes.dex */
public final class jmd {
    public static final jmd a;
    public static final jmd b;
    public static final jmd c;
    public static final jmd d;
    public static final jmd e;
    private static final /* synthetic */ jmd[] f;

    static {
        jmd jmdVar = new jmd("ASSOCIATING", 0);
        a = jmdVar;
        jmd jmdVar2 = new jmd("ABSENT", 1);
        b = jmdVar2;
        jmd jmdVar3 = new jmd("APPEARING", 2);
        c = jmdVar3;
        jmd jmdVar4 = new jmd("PRESENT", 3);
        d = jmdVar4;
        jmd jmdVar5 = new jmd("DISAPPEARING", 4);
        e = jmdVar5;
        jmd[] jmdVarArr = {jmdVar, jmdVar2, jmdVar3, jmdVar4, jmdVar5};
        f = jmdVarArr;
        affa.p(jmdVarArr);
    }

    public static jmd valueOf(String str) {
        return (jmd) Enum.valueOf(jmd.class, str);
    }

    public static jmd[] values() {
        return (jmd[]) f.clone();
    }
}
