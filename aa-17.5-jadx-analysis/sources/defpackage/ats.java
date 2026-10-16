package defpackage;

/* loaded from: classes.dex */
public final class ats {
    public static final ats a = new ats();

    private ats() {
    }

    public static final cfy a(cfy cfyVar, cfm cfmVar) {
        return cfyVar.a(new aur(cfmVar));
    }

    public static final cfy b(cfy cfyVar, float f, boolean z) {
        if (f <= 0.0d) {
            awx.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return cfyVar.a(new ave(f, z));
    }
}
