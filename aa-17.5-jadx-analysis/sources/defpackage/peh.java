package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class peh implements pej {
    public static final peh a;
    private static final /* synthetic */ peh[] b;

    static {
        peh pehVar = new peh();
        a = pehVar;
        b = new peh[]{pehVar};
    }

    private peh() {
    }

    public static peh valueOf(String str) {
        return (peh) Enum.valueOf(peh.class, str);
    }

    public static peh[] values() {
        return (peh[]) b.clone();
    }

    @Override // defpackage.pej
    public final /* synthetic */ boolean q() {
        return lvl.at(this);
    }
}
