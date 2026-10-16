package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class peg implements pej {
    public static final peg a;
    private static final /* synthetic */ peg[] b;

    static {
        peg pegVar = new peg();
        a = pegVar;
        b = new peg[]{pegVar};
    }

    private peg() {
    }

    public static peg valueOf(String str) {
        return (peg) Enum.valueOf(peg.class, str);
    }

    public static peg[] values() {
        return (peg[]) b.clone();
    }

    @Override // defpackage.pej
    public final /* synthetic */ boolean q() {
        return lvl.at(this);
    }
}
