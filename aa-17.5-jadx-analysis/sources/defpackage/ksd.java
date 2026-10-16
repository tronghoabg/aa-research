package defpackage;

import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ksd {
    public static final ksd a;
    public static final ksd b;
    public static final ksd c;
    public static final ksd d;
    public static final ksd e;
    public static final ksd f;
    public static final ksd g;
    public static final ksd h;
    public static final ksd i;
    private static final /* synthetic */ ksd[] k;
    public final afec j;

    static {
        ksd ksdVar = new ksd("P", 0, new krq(4));
        a = ksdVar;
        ksd ksdVar2 = new ksd("S", 1, new krq(5));
        b = ksdVar2;
        ksd ksdVar3 = new ksd("T", 2, new krq(6));
        c = ksdVar3;
        ksd ksdVar4 = new ksd("N", 3, new krq(7));
        d = ksdVar4;
        ksd ksdVar5 = new ksd("NV", 4, new krq(8));
        e = ksdVar5;
        ksd ksdVar6 = new ksd("R", 5, new krq(9));
        f = ksdVar6;
        ksd ksdVar7 = new ksd("G", 6, new krq(10));
        g = ksdVar7;
        ksd ksdVar8 = new ksd("B", 7, new krq(11));
        h = ksdVar8;
        ksd ksdVar9 = new ksd("Y", 8, new krq(12));
        i = ksdVar9;
        ksd[] ksdVarArr = {ksdVar, ksdVar2, ksdVar3, ksdVar4, ksdVar5, ksdVar6, ksdVar7, ksdVar8, ksdVar9};
        k = ksdVarArr;
        affa.p(ksdVarArr);
    }

    private ksd(String str, int i2, afec afecVar) {
        this.j = afecVar;
    }

    public static ksd valueOf(String str) {
        return (ksd) Enum.valueOf(ksd.class, str);
    }

    public static ksd[] values() {
        return (ksd[]) k.clone();
    }

    public final String a() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }
}
