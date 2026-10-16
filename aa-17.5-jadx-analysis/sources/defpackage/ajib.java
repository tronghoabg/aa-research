package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ajib {
    public static final ajib a;
    public static final ajib b;
    public static final ajib c;
    public static final ajib d;
    public static final ajib e;
    public static final ajib f;
    public static final ajib g;
    private static final /* synthetic */ ajib[] i;
    public final String h;

    static {
        ajib ajibVar = new ajib("HTTP_1_0", 0, "http/1.0");
        a = ajibVar;
        ajib ajibVar2 = new ajib("HTTP_1_1", 1, "http/1.1");
        b = ajibVar2;
        ajib ajibVar3 = new ajib("SPDY_3", 2, "spdy/3.1");
        c = ajibVar3;
        ajib ajibVar4 = new ajib("HTTP_2", 3, "h2");
        d = ajibVar4;
        ajib ajibVar5 = new ajib("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        e = ajibVar5;
        ajib ajibVar6 = new ajib("QUIC", 5, "quic");
        f = ajibVar6;
        ajib ajibVar7 = new ajib("HTTP_3", 6, "h3");
        g = ajibVar7;
        ajib[] ajibVarArr = {ajibVar, ajibVar2, ajibVar3, ajibVar4, ajibVar5, ajibVar6, ajibVar7};
        i = ajibVarArr;
        affa.p(ajibVarArr);
    }

    private ajib(String str, int i2, String str2) {
        this.h = str2;
    }

    public static ajib valueOf(String str) {
        return (ajib) Enum.valueOf(ajib.class, str);
    }

    public static ajib[] values() {
        return (ajib[]) i.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.h;
    }
}
