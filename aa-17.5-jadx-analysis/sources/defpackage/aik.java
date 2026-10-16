package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class aik {
    public static final aik a;
    public static final aik b;
    public static final aik c;
    public static final aik d;
    private static final /* synthetic */ aik[] e;

    static {
        aik aikVar = new aik("Float", 0);
        a = aikVar;
        aik aikVar2 = new aik("Int", 1);
        b = aikVar2;
        aik aikVar3 = new aik("Color", 2);
        c = aikVar3;
        aik aikVar4 = new aik("Path", 3);
        d = aikVar4;
        aik[] aikVarArr = {aikVar, aikVar2, aikVar3, aikVar4};
        e = aikVarArr;
        affa.p(aikVarArr);
    }

    public static aik valueOf(String str) {
        return (aik) Enum.valueOf(aik.class, str);
    }

    public static aik[] values() {
        return (aik[]) e.clone();
    }
}
