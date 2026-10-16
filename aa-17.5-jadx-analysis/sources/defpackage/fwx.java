package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class fwx {
    public static final fwx a;
    public static final fwx b;
    public static final fwx c;
    public static final fwx d;
    public static final fwx e;
    public static final fwx f;
    public static final fwx g;
    private static final /* synthetic */ fwx[] n;
    public final afeg h;
    public final boolean i;
    public final afeg j;
    public final afeg k;
    public final boolean l;
    public final boolean m;

    static {
        fwx fwxVar = new fwx("FILLED", 0, new dne(4), true, null, null, true, true);
        a = fwxVar;
        fwx fwxVar2 = new fwx("TONAL", 1, new dne(5), true, null, null, false, true);
        b = fwxVar2;
        fwx fwxVar3 = new fwx("OUTLINED", 2, new dne(6), true, null, new dne(7), false, true);
        c = fwxVar3;
        fwx fwxVar4 = new fwx("ICON", 3, new dne(8), false, null, null, false, true);
        d = fwxVar4;
        fwx fwxVar5 = new fwx("FAB", 4, new dne(9), false, new dne(10), null, false, true);
        e = fwxVar5;
        fwx fwxVar6 = new fwx("MAP", 5, new dne(11), true, null, new dne(12), false, true);
        f = fwxVar6;
        fwx fwxVar7 = new fwx("RADIO_ICON", 6, new dne(13), true, null, null, false, false);
        g = fwxVar7;
        fwx[] fwxVarArr = {fwxVar, fwxVar2, fwxVar3, fwxVar4, fwxVar5, fwxVar6, fwxVar7};
        n = fwxVarArr;
        affa.p(fwxVarArr);
    }

    private fwx(String str, int i, afeg afegVar, boolean z, afeg afegVar2, afeg afegVar3, boolean z2, boolean z3) {
        this.h = afegVar;
        this.i = z;
        this.j = afegVar2;
        this.k = afegVar3;
        this.l = z2;
        this.m = z3;
    }

    public static fwx valueOf(String str) {
        return (fwx) Enum.valueOf(fwx.class, str);
    }

    public static fwx[] values() {
        return (fwx[]) n.clone();
    }
}
