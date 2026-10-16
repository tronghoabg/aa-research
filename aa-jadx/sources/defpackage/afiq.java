package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class afiq {
    public static final defpackage.afiq a;
    public static final defpackage.afiq b;
    public static final defpackage.afiq c;
    public static final defpackage.afiq d;
    private static final /* synthetic */ defpackage.afiq[] e;

    static {
        defpackage.afiq afiqVar = new defpackage.afiq("INSTANCE", 0);
        a = afiqVar;
        defpackage.afiq afiqVar2 = new defpackage.afiq("CONTEXT", 1);
        b = afiqVar2;
        defpackage.afiq afiqVar3 = new defpackage.afiq("EXTENSION_RECEIVER", 2);
        c = afiqVar3;
        defpackage.afiq afiqVar4 = new defpackage.afiq("VALUE", 3);
        d = afiqVar4;
        defpackage.afiq[] afiqVarArr = {afiqVar, afiqVar2, afiqVar3, afiqVar4};
        e = afiqVarArr;
        defpackage.afga.p(afiqVarArr);
    }

    public static defpackage.afiq valueOf(java.lang.String str) {
        return (defpackage.afiq) java.lang.Enum.valueOf(defpackage.afiq.class, str);
    }

    public static defpackage.afiq[] values() {
        return (defpackage.afiq[]) e.clone();
    }
}
