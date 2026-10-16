package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class epx {
    public static final defpackage.epx a;
    public static final defpackage.epx b;
    public static final defpackage.epx c;
    public static final defpackage.epx d;
    public static final defpackage.epx e;
    private static final /* synthetic */ defpackage.epx[] f;

    static {
        defpackage.epx epxVar = new defpackage.epx("DESTROYED", 0);
        a = epxVar;
        defpackage.epx epxVar2 = new defpackage.epx("INITIALIZED", 1);
        b = epxVar2;
        defpackage.epx epxVar3 = new defpackage.epx("CREATED", 2);
        c = epxVar3;
        defpackage.epx epxVar4 = new defpackage.epx("STARTED", 3);
        d = epxVar4;
        defpackage.epx epxVar5 = new defpackage.epx("RESUMED", 4);
        e = epxVar5;
        defpackage.epx[] epxVarArr = {epxVar, epxVar2, epxVar3, epxVar4, epxVar5};
        f = epxVarArr;
        defpackage.afga.p(epxVarArr);
    }

    public static defpackage.epx valueOf(java.lang.String str) {
        return (defpackage.epx) java.lang.Enum.valueOf(defpackage.epx.class, str);
    }

    public static defpackage.epx[] values() {
        return (defpackage.epx[]) f.clone();
    }

    public final boolean a(defpackage.epx epxVar) {
        return compareTo(epxVar) >= 0;
    }
}
