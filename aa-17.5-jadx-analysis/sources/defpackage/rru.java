package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rru {
    public static final rru a;
    public static final rru b;
    public static final rru c;
    private static final /* synthetic */ rru[] d;

    static {
        rru rruVar = new rru("GEARHEAD_PROJECTION", 0);
        a = rruVar;
        rru rruVar2 = new rru("GEARHEAD_CAR", 1);
        b = rruVar2;
        rru rruVar3 = new rru("GMSCORE_CAR", 2);
        c = rruVar3;
        d = new rru[]{rruVar, rruVar2, rruVar3};
    }

    public static rru valueOf(String str) {
        return (rru) Enum.valueOf(rru.class, str);
    }

    public static rru[] values() {
        return (rru[]) d.clone();
    }
}
