package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ajij {
    public static final ajij a;
    public static final ajij b;
    public static final ajij c;
    public static final ajij d;
    public static final ajij e;
    private static final /* synthetic */ ajij[] g;
    public final String f;

    static {
        ajij ajijVar = new ajij("TLS_1_3", 0, "TLSv1.3");
        a = ajijVar;
        ajij ajijVar2 = new ajij("TLS_1_2", 1, "TLSv1.2");
        b = ajijVar2;
        ajij ajijVar3 = new ajij("TLS_1_1", 2, "TLSv1.1");
        c = ajijVar3;
        ajij ajijVar4 = new ajij("TLS_1_0", 3, "TLSv1");
        d = ajijVar4;
        ajij ajijVar5 = new ajij("SSL_3_0", 4, "SSLv3");
        e = ajijVar5;
        ajij[] ajijVarArr = {ajijVar, ajijVar2, ajijVar3, ajijVar4, ajijVar5};
        g = ajijVarArr;
        affa.p(ajijVarArr);
    }

    private ajij(String str, int i, String str2) {
        this.f = str2;
    }

    public static ajij valueOf(String str) {
        return (ajij) Enum.valueOf(ajij.class, str);
    }

    public static ajij[] values() {
        return (ajij[]) g.clone();
    }
}
