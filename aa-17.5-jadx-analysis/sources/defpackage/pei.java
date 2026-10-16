package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pei implements pej {
    public static final pei a;
    private static final /* synthetic */ pei[] b;

    static {
        pei peiVar = new pei();
        a = peiVar;
        b = new pei[]{peiVar};
    }

    private pei() {
    }

    public static pei valueOf(String str) {
        return (pei) Enum.valueOf(pei.class, str);
    }

    public static pei[] values() {
        return (pei[]) b.clone();
    }

    @Override // defpackage.pej
    public final /* synthetic */ boolean q() {
        return lvl.at(this);
    }
}
