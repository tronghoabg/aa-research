package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class tlv {
    public static final tlv a;
    public static final tlv b;
    public static final tlv c;
    public static final tlv d;
    public static final tlv e;
    public static final tlv f;
    private static final /* synthetic */ tlv[] g;

    static {
        tlv tlvVar = new tlv("UNSPECIFIED", 0);
        a = tlvVar;
        tlv tlvVar2 = new tlv("CLICK", 1);
        b = tlvVar2;
        tlv tlvVar3 = new tlv("ACTION_1", 2);
        c = tlvVar3;
        tlv tlvVar4 = new tlv("ACTION_2", 3);
        d = tlvVar4;
        tlv tlvVar5 = new tlv("ACTION_3", 4);
        e = tlvVar5;
        tlv tlvVar6 = new tlv("DISMISS", 5);
        f = tlvVar6;
        tlv[] tlvVarArr = {tlvVar, tlvVar2, tlvVar3, tlvVar4, tlvVar5, tlvVar6};
        g = tlvVarArr;
        affa.p(tlvVarArr);
    }

    public static tlv valueOf(String str) {
        return (tlv) Enum.valueOf(tlv.class, str);
    }

    public static tlv[] values() {
        return (tlv[]) g.clone();
    }
}
