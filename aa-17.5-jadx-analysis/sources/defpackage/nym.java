package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class nym {
    public static final nym a;
    public static final nym b;
    public static final nym c;
    private static final /* synthetic */ nym[] d;

    static {
        nym nymVar = new nym("HIDDEN", 0);
        a = nymVar;
        nym nymVar2 = new nym("DOT", 1);
        b = nymVar2;
        nym nymVar3 = new nym("COUNT", 2);
        c = nymVar3;
        nym[] nymVarArr = {nymVar, nymVar2, nymVar3};
        d = nymVarArr;
        affa.p(nymVarArr);
    }

    public static nym valueOf(String str) {
        return (nym) Enum.valueOf(nym.class, str);
    }

    public static nym[] values() {
        return (nym[]) d.clone();
    }
}
