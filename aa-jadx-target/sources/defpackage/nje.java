package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nje {
    public static final defpackage.nje a;
    public static final defpackage.nje b;
    public static final defpackage.nje c;
    public static final defpackage.nje d;
    public static final defpackage.nje e;
    public static final defpackage.nje f;
    public static final defpackage.nje g;
    public static final defpackage.nje h;
    public static final defpackage.nje i;
    public static final /* synthetic */ defpackage.afef j;
    private static final /* synthetic */ defpackage.nje[] k;

    static {
        defpackage.nje njeVar = new defpackage.nje("NONE", 0);
        a = njeVar;
        defpackage.nje njeVar2 = new defpackage.nje("HOME", 1);
        b = njeVar2;
        defpackage.nje njeVar3 = new defpackage.nje("ASSISTANT", 2);
        c = njeVar3;
        defpackage.nje njeVar4 = new defpackage.nje("RAIL_WIDGET", 3);
        d = njeVar4;
        defpackage.nje njeVar5 = new defpackage.nje("HOTSEAT_ITEM_1", 4);
        e = njeVar5;
        defpackage.nje njeVar6 = new defpackage.nje("HOTSEAT_ITEM_2", 5);
        f = njeVar6;
        defpackage.nje njeVar7 = new defpackage.nje("HOTSEAT_ITEM_3", 6);
        g = njeVar7;
        defpackage.nje njeVar8 = new defpackage.nje("HOTSEAT_ITEM_4", 7);
        h = njeVar8;
        defpackage.nje njeVar9 = new defpackage.nje("STATUS", 8);
        i = njeVar9;
        defpackage.nje[] njeVarArr = {njeVar, njeVar2, njeVar3, njeVar4, njeVar5, njeVar6, njeVar7, njeVar8, njeVar9};
        k = njeVarArr;
        j = defpackage.afga.p(njeVarArr);
    }

    public static defpackage.nje valueOf(java.lang.String str) {
        return (defpackage.nje) java.lang.Enum.valueOf(defpackage.nje.class, str);
    }

    public static defpackage.nje[] values() {
        return (defpackage.nje[]) k.clone();
    }
}
