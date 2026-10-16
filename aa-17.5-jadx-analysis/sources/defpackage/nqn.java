package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class nqn implements nge {
    public static final nqn a;
    private static final /* synthetic */ nqn[] b;

    static {
        nqn nqnVar = new nqn();
        a = nqnVar;
        nqn[] nqnVarArr = {nqnVar};
        b = nqnVarArr;
        affa.p(nqnVarArr);
    }

    private nqn() {
    }

    public static nqn valueOf(String str) {
        return (nqn) Enum.valueOf(nqn.class, str);
    }

    public static nqn[] values() {
        return (nqn[]) b.clone();
    }

    @Override // defpackage.nge
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        throw null;
    }

    @Override // defpackage.nge
    public final String c() {
        return "immersive";
    }

    @Override // defpackage.nge
    public final String d() {
        return name();
    }
}
