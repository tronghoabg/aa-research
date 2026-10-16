package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hdi {
    public static final hdi a;
    public static final hdi b;
    public static final hdi c;
    public static final hdi d;
    public static final hdi e;
    public static final hdi f;
    private static final /* synthetic */ hdi[] h;
    public final afeg g;

    static {
        hdi hdiVar = new hdi("CIRCLE_IMAGE", 0, new dne(20));
        a = hdiVar;
        hdi hdiVar2 = new hdi("LARGE_IMAGE", 1, new hdh(1));
        b = hdiVar2;
        hdi hdiVar3 = new hdi("MEDIUM_IMAGE", 2, new hdh(0));
        c = hdiVar3;
        hdi hdiVar4 = new hdi("SMALL_IMAGE", 3, new hdh(2));
        d = hdiVar4;
        hdi hdiVar5 = new hdi("EXTRA_SMALL_IMAGE", 4, new hdh(3));
        e = hdiVar5;
        hdi hdiVar6 = new hdi("REGULAR_ICON", 5, new hdh(4));
        f = hdiVar6;
        hdi[] hdiVarArr = {hdiVar, hdiVar2, hdiVar3, hdiVar4, hdiVar5, hdiVar6};
        h = hdiVarArr;
        affa.p(hdiVarArr);
    }

    private hdi(String str, int i, afeg afegVar) {
        this.g = afegVar;
    }

    public static hdi valueOf(String str) {
        return (hdi) Enum.valueOf(hdi.class, str);
    }

    public static hdi[] values() {
        return (hdi[]) h.clone();
    }
}
