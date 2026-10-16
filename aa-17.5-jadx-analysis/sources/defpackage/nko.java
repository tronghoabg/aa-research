package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class nko {
    public static final nko a;
    public static final nko b;
    public static final nko c;
    public static final nko d;
    public static final nko e;
    public static final nko f;
    private static final /* synthetic */ nko[] j;
    public final afeg g;
    public final boolean h;
    public final boolean i;

    static {
        nko nkoVar = new nko("AC_ON", 0, new niz(4), true, true);
        a = nkoVar;
        nko nkoVar2 = new nko("AC_OFF", 1, new niz(5), false, true);
        b = nkoVar2;
        nko nkoVar3 = new nko("SYNC", 2, new niz(6), true, false);
        c = nkoVar3;
        nko nkoVar4 = new nko("AUTO", 3, new niz(7), true, false);
        d = nkoVar4;
        nko nkoVar5 = new nko("CONTROL_OFF_DISABLED", 4, new niz(8), false, false);
        e = nkoVar5;
        nko nkoVar6 = new nko("CONTROL_OFF_ENABLED", 5, new niz(9), true, false);
        f = nkoVar6;
        nko[] nkoVarArr = {nkoVar, nkoVar2, nkoVar3, nkoVar4, nkoVar5, nkoVar6};
        j = nkoVarArr;
        affa.p(nkoVarArr);
    }

    private nko(String str, int i, afeg afegVar, boolean z, boolean z2) {
        this.g = afegVar;
        this.h = z;
        this.i = z2;
    }

    public static nko valueOf(String str) {
        return (nko) Enum.valueOf(nko.class, str);
    }

    public static nko[] values() {
        return (nko[]) j.clone();
    }
}
