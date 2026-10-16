package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class nqm implements ngd {
    public static final nqm a;
    private static final /* synthetic */ nqm[] b;

    static {
        nqm nqmVar = new nqm();
        a = nqmVar;
        nqm[] nqmVarArr = {nqmVar};
        b = nqmVarArr;
        affa.p(nqmVarArr);
    }

    private nqm() {
    }

    public static nqm valueOf(String str) {
        return (nqm) Enum.valueOf(nqm.class, str);
    }

    public static nqm[] values() {
        return (nqm[]) b.clone();
    }

    @Override // defpackage.ngd
    public final String a() {
        return "immersive";
    }

    @Override // defpackage.ngd
    public final String b() {
        return name();
    }
}
