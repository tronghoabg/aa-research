package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ezk {
    public static final ezk a;
    public static final ezk b;
    public static final ezk c;
    private static final /* synthetic */ ezk[] d;

    static {
        ezk ezkVar = new ezk("DEFERRED", 0);
        a = ezkVar;
        ezk ezkVar2 = new ezk("IMMEDIATE", 1);
        b = ezkVar2;
        ezk ezkVar3 = new ezk("EXCLUSIVE", 2);
        c = ezkVar3;
        ezk[] ezkVarArr = {ezkVar, ezkVar2, ezkVar3};
        d = ezkVarArr;
        affa.p(ezkVarArr);
    }

    public static ezk valueOf(String str) {
        return (ezk) Enum.valueOf(ezk.class, str);
    }

    public static ezk[] values() {
        return (ezk[]) d.clone();
    }
}
