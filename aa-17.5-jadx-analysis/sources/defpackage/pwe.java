package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pwe {
    public static final pwe a;
    public static final pwe b;
    public static final pwe c;
    public static final pwe d;
    public static final pwe e;
    public static final pwe f;
    public static final pwe g;
    public static final pwe h;
    public static final pwe i;
    public static final pwe j;
    public static final pwe k;
    public static final pwe l;
    public static final pwe m;
    public static final pwe n;
    private static final /* synthetic */ pwe[] o;

    static {
        pwe pweVar = new pwe("AD_SPAM_ESSENTIAL_COOKIE", 0);
        a = pweVar;
        pwe pweVar2 = new pwe("ADVERTISING_ID", 1);
        b = pweVar2;
        pwe pweVar3 = new pwe("API_TOKEN", 2);
        c = pweVar3;
        pwe pweVar4 = new pwe("APP_CHECK_TOKEN", 3);
        d = pweVar4;
        pwe pweVar5 = new pwe("AUTHENTICATION", 4);
        e = pweVar5;
        pwe pweVar6 = new pwe("CACHED_QUANTIZED_LOCATION", 5);
        f = pweVar6;
        pwe pweVar7 = new pwe("CONNECTIVITY", 6);
        g = pweVar7;
        pwe pweVar8 = new pwe("LOCATION", 7);
        h = pweVar8;
        pwe pweVar9 = new pwe("LOW_PRIORITY_REQUEST_SEND", 8);
        i = pweVar9;
        pwe pweVar10 = new pwe("NETWORK_STACK_READY", 9);
        j = pweVar10;
        pwe pweVar11 = new pwe("NON_DEFAULT_CLIENT_PARAMETERS", 10);
        k = pweVar11;
        pwe pweVar12 = new pwe("QUANTIZED_LOCATION", 11);
        l = pweVar12;
        pwe pweVar13 = new pwe("ZWIEBACK_COOKIE_PRESENT", 12);
        m = pweVar13;
        pwe pweVar14 = new pwe("ZWIEBACK_COOKIE", 13);
        n = pweVar14;
        o = new pwe[]{pweVar, pweVar2, pweVar3, pweVar4, pweVar5, pweVar6, pweVar7, pweVar8, pweVar9, pweVar10, pweVar11, pweVar12, pweVar13, pweVar14};
    }

    public static pwe valueOf(String str) {
        return (pwe) Enum.valueOf(pwe.class, str);
    }

    public static pwe[] values() {
        return (pwe[]) o.clone();
    }
}
