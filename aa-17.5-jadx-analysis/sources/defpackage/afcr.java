package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class afcr {
    public static final afcr a;
    public static final afcr b;
    public static final afcr c;
    private static final /* synthetic */ afcr[] d;

    static {
        afcr afcrVar = new afcr("COROUTINE_SUSPENDED", 0);
        a = afcrVar;
        afcr afcrVar2 = new afcr("UNDECIDED", 1);
        b = afcrVar2;
        afcr afcrVar3 = new afcr("RESUMED", 2);
        c = afcrVar3;
        afcr[] afcrVarArr = {afcrVar, afcrVar2, afcrVar3};
        d = afcrVarArr;
        affa.p(afcrVarArr);
    }

    public static afcr valueOf(String str) {
        return (afcr) Enum.valueOf(afcr.class, str);
    }

    public static afcr[] values() {
        return (afcr[]) d.clone();
    }
}
