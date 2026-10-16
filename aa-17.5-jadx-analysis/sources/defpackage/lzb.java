package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class lzb {
    public static final lzb a;
    public static final lzb b;
    public static final lzb c;
    public static final lzb d;
    private static final /* synthetic */ lzb[] e;

    static {
        lzb lzbVar = new lzb("LOCKED", 0);
        a = lzbVar;
        lzb lzbVar2 = new lzb("RESTRICTED", 1);
        b = lzbVar2;
        lzb lzbVar3 = new lzb("MODERATED", 2);
        c = lzbVar3;
        lzb lzbVar4 = new lzb("UNLIMITED", 3);
        d = lzbVar4;
        e = new lzb[]{lzbVar, lzbVar2, lzbVar3, lzbVar4};
    }

    public static lzb valueOf(String str) {
        return (lzb) Enum.valueOf(lzb.class, str);
    }

    public static lzb[] values() {
        return (lzb[]) e.clone();
    }
}
