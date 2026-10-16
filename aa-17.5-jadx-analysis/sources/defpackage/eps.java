package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class eps {
    public static final eps a;
    public static final eps b;
    public static final eps c;
    public static final eps d;
    public static final eps e;
    private static final /* synthetic */ eps[] f;

    static {
        eps epsVar = new eps("DESTROYED", 0);
        a = epsVar;
        eps epsVar2 = new eps("INITIALIZED", 1);
        b = epsVar2;
        eps epsVar3 = new eps("CREATED", 2);
        c = epsVar3;
        eps epsVar4 = new eps("STARTED", 3);
        d = epsVar4;
        eps epsVar5 = new eps("RESUMED", 4);
        e = epsVar5;
        eps[] epsVarArr = {epsVar, epsVar2, epsVar3, epsVar4, epsVar5};
        f = epsVarArr;
        affa.p(epsVarArr);
    }

    public static eps valueOf(String str) {
        return (eps) Enum.valueOf(eps.class, str);
    }

    public static eps[] values() {
        return (eps[]) f.clone();
    }

    public final boolean a(eps epsVar) {
        return compareTo(epsVar) >= 0;
    }
}
