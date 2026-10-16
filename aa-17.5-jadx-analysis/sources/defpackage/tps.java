package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class tps {
    public static final tps a;
    public static final tps b;
    private static final /* synthetic */ tps[] c;

    static {
        tps tpsVar = new tps("PIXEL", 0);
        a = tpsVar;
        tps tpsVar2 = new tps("WORLD", 1);
        b = tpsVar2;
        c = new tps[]{tpsVar, tpsVar2};
    }

    public static tps valueOf(String str) {
        return (tps) Enum.valueOf(tps.class, str);
    }

    public static tps[] values() {
        return (tps[]) c.clone();
    }
}
