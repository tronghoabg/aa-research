package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hpj {
    public static final hpj a;
    public static final hpj b;
    public static final /* synthetic */ afdf c;
    private static final /* synthetic */ hpj[] d;

    static {
        hpj hpjVar = new hpj("NORMAL", 0);
        a = hpjVar;
        hpj hpjVar2 = new hpj("VARIANT", 1);
        b = hpjVar2;
        hpj[] hpjVarArr = {hpjVar, hpjVar2};
        d = hpjVarArr;
        c = affa.p(hpjVarArr);
    }

    public static hpj valueOf(String str) {
        return (hpj) Enum.valueOf(hpj.class, str);
    }

    public static hpj[] values() {
        return (hpj[]) d.clone();
    }
}
