package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class mza {
    public static final mza a;
    public static final mza b;
    public static final mza c;
    public static final mza d;
    public static final mza e;
    public static final /* synthetic */ afdf f;
    private static final /* synthetic */ mza[] i;
    public final float g;
    public final int h;

    static {
        mza mzaVar = new mza("FIVE_ACTIONS", 0, 920.0f, 5);
        a = mzaVar;
        mza mzaVar2 = new mza("FOUR_ACTIONS", 1, 844.0f, 4);
        b = mzaVar2;
        mza mzaVar3 = new mza("THREE_ACTIONS", 2, 768.0f, 3);
        c = mzaVar3;
        mza mzaVar4 = new mza("TWO_ACTIONS", 3, 692.0f, 2);
        d = mzaVar4;
        mza mzaVar5 = new mza("ONE_ACTION", 4, 300.0f, 1);
        e = mzaVar5;
        mza[] mzaVarArr = {mzaVar, mzaVar2, mzaVar3, mzaVar4, mzaVar5};
        i = mzaVarArr;
        f = affa.p(mzaVarArr);
    }

    private mza(String str, int i2, float f2, int i3) {
        this.g = f2;
        this.h = i3;
    }

    public static mza valueOf(String str) {
        return (mza) Enum.valueOf(mza.class, str);
    }

    public static mza[] values() {
        return (mza[]) i.clone();
    }
}
