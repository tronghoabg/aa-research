package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@zje(a = zjc.a)
/* loaded from: classes.dex */
public final class mpz {
    public static final mpz a;
    public static final mpz b;
    public static final mpz c;
    public static final mpz d;
    public static final mpz e;
    public static final mpz f;
    public static final mpz g;
    private static final /* synthetic */ mpz[] i;
    public final int h;

    static {
        mpz mpzVar = new mpz("OTHER", 0, 0);
        a = mpzVar;
        mpz mpzVar2 = new mpz("NAVIGATION", 1, 1);
        b = mpzVar2;
        mpz mpzVar3 = new mpz("PHONE", 2, 2);
        c = mpzVar3;
        mpz mpzVar4 = new mpz("MEDIA", 3, 3);
        d = mpzVar4;
        mpz mpzVar5 = new mpz("PHONE_MEDIA", 4, 8);
        e = mpzVar5;
        mpz mpzVar6 = new mpz("SYSTEM", 5, 7);
        f = mpzVar6;
        mpz mpzVar7 = new mpz("OEM", 6, 4);
        g = mpzVar7;
        mpz[] mpzVarArr = {mpzVar, mpzVar2, mpzVar3, mpzVar4, mpzVar5, mpzVar6, mpzVar7};
        i = mpzVarArr;
        affa.p(mpzVarArr);
    }

    private mpz(String str, int i2, int i3) {
        this.h = i3;
    }

    public static mpz valueOf(String str) {
        return (mpz) Enum.valueOf(mpz.class, str);
    }

    public static mpz[] values() {
        return (mpz[]) i.clone();
    }
}
