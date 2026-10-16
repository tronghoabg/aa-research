package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class adpj {
    public static final adpj a;
    public static final adpj b;
    public static final adpj c;
    public static final adpj d;
    public static final adpj e;
    public static final adpj f;
    private static final /* synthetic */ adpj[] g;

    static {
        adpj adpjVar = new adpj("UNINITIALIZED", 0);
        a = adpjVar;
        adpj adpjVar2 = new adpj("INITIALIZED", 1);
        b = adpjVar2;
        adpj adpjVar3 = new adpj("PREFIX_DELIVERED", 2);
        c = adpjVar3;
        adpj adpjVar4 = new adpj("ALL_MESSAGES_DELIVERED", 3);
        d = adpjVar4;
        adpj adpjVar5 = new adpj("SUFFIX_DELIVERED", 4);
        e = adpjVar5;
        adpj adpjVar6 = new adpj("CLOSED", 5);
        f = adpjVar6;
        g = new adpj[]{adpjVar, adpjVar2, adpjVar3, adpjVar4, adpjVar5, adpjVar6};
    }

    public static adpj valueOf(String str) {
        return (adpj) Enum.valueOf(adpj.class, str);
    }

    public static adpj[] values() {
        return (adpj[]) g.clone();
    }
}
