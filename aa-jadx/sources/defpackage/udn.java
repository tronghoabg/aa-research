package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class udn {
    public static final defpackage.udn a;
    public static final defpackage.udn b;
    public static final defpackage.udn c;
    public static final defpackage.udn d;
    public static final defpackage.udn e;
    public static final defpackage.udn f;
    public static final defpackage.udn g;
    private static final /* synthetic */ defpackage.udn[] h;

    static {
        defpackage.udn udnVar = new defpackage.udn("ALL_VISIBLE", 0);
        a = udnVar;
        defpackage.udn udnVar2 = new defpackage.udn("PRIMARY_SECONDARY_VISIBLE", 1);
        b = udnVar2;
        defpackage.udn udnVar3 = new defpackage.udn("PRIMARY_TERTIARY_VISIBLE", 2);
        c = udnVar3;
        defpackage.udn udnVar4 = new defpackage.udn("ONLY_PRIMARY_VISIBLE", 3);
        d = udnVar4;
        defpackage.udn udnVar5 = new defpackage.udn("REPRESSED", 4);
        e = udnVar5;
        defpackage.udn udnVar6 = new defpackage.udn("PLACED_INVISIBLE", 5);
        f = udnVar6;
        defpackage.udn udnVar7 = new defpackage.udn("TRUMPED_PROMOTED", 6);
        g = udnVar7;
        h = new defpackage.udn[]{udnVar, udnVar2, udnVar3, udnVar4, udnVar5, udnVar6, udnVar7};
    }

    public static defpackage.udn valueOf(java.lang.String str) {
        return (defpackage.udn) java.lang.Enum.valueOf(defpackage.udn.class, str);
    }

    public static defpackage.udn[] values() {
        return (defpackage.udn[]) h.clone();
    }
}
