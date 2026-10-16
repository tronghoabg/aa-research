package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class kuw {
    public static final kuw a;
    public static final kuw b;
    public static final kuw c;
    public static final kuw d;
    public static final kuw e;
    public static final /* synthetic */ afdf f;
    private static final /* synthetic */ kuw[] h;
    public final afeh g;

    static {
        kuw kuwVar = new kuw("VectorResource", 0, new kup(19));
        a = kuwVar;
        kuw kuwVar2 = new kuw("BitmapResource", 1, new kup(20));
        b = kuwVar2;
        kuw kuwVar3 = new kuw("RawBitmap", 2, new kuv(1));
        c = kuwVar3;
        kuw kuwVar4 = new kuw("RemoteResource", 3, new kuv(0));
        d = kuwVar4;
        kuw kuwVar5 = new kuw("EmptyIcon", 4, new kuv(2));
        e = kuwVar5;
        kuw[] kuwVarArr = {kuwVar, kuwVar2, kuwVar3, kuwVar4, kuwVar5};
        h = kuwVarArr;
        f = affa.p(kuwVarArr);
    }

    private kuw(String str, int i, afeh afehVar) {
        this.g = afehVar;
    }

    public static kuw valueOf(String str) {
        return (kuw) Enum.valueOf(kuw.class, str);
    }

    public static kuw[] values() {
        return (kuw[]) h.clone();
    }
}
