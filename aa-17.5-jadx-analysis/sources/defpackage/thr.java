package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class thr {
    public static final thr a;
    public static final thr b;
    public static final thr c;
    private static final /* synthetic */ thr[] e;
    public final int d;

    static {
        thr thrVar = new thr("Primary", 0, 1);
        a = thrVar;
        thr thrVar2 = new thr("IsPersistent", 1, 2);
        b = thrVar2;
        thr thrVar3 = new thr("Default", 2, 4);
        c = thrVar3;
        thr[] thrVarArr = {thrVar, thrVar2, thrVar3};
        e = thrVarArr;
        affa.p(thrVarArr);
    }

    private thr(String str, int i, int i2) {
        this.d = i2;
    }

    public static thr valueOf(String str) {
        return (thr) Enum.valueOf(thr.class, str);
    }

    public static thr[] values() {
        return (thr[]) e.clone();
    }
}
