package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class afhq {
    public static final afhq a;
    public static final afhq b;
    public static final afhq c;
    public static final afhq d;
    private static final /* synthetic */ afhq[] e;

    static {
        afhq afhqVar = new afhq("INSTANCE", 0);
        a = afhqVar;
        afhq afhqVar2 = new afhq("CONTEXT", 1);
        b = afhqVar2;
        afhq afhqVar3 = new afhq("EXTENSION_RECEIVER", 2);
        c = afhqVar3;
        afhq afhqVar4 = new afhq("VALUE", 3);
        d = afhqVar4;
        afhq[] afhqVarArr = {afhqVar, afhqVar2, afhqVar3, afhqVar4};
        e = afhqVarArr;
        affa.p(afhqVarArr);
    }

    public static afhq valueOf(String str) {
        return (afhq) Enum.valueOf(afhq.class, str);
    }

    public static afhq[] values() {
        return (afhq[]) e.clone();
    }
}
