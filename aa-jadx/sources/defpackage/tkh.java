package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class tkh {
    public static final defpackage.tkh a;
    public static final defpackage.tkh b;
    public static final defpackage.tkh c;
    public static final defpackage.tkh d;
    private static final /* synthetic */ defpackage.tkh[] e;

    static {
        defpackage.tkh tkhVar = new defpackage.tkh("AppIcon", 0);
        a = tkhVar;
        defpackage.tkh tkhVar2 = new defpackage.tkh("Back", 1);
        b = tkhVar2;
        defpackage.tkh tkhVar3 = new defpackage.tkh("Pan", 2);
        c = tkhVar3;
        defpackage.tkh tkhVar4 = new defpackage.tkh("ComposeMessage", 3);
        d = tkhVar4;
        defpackage.tkh[] tkhVarArr = {tkhVar, tkhVar2, tkhVar3, tkhVar4};
        e = tkhVarArr;
        defpackage.afga.p(tkhVarArr);
    }

    public static defpackage.tkh valueOf(java.lang.String str) {
        return (defpackage.tkh) java.lang.Enum.valueOf(defpackage.tkh.class, str);
    }

    public static defpackage.tkh[] values() {
        return (defpackage.tkh[]) e.clone();
    }
}
