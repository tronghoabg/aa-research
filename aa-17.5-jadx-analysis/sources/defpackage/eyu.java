package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class eyu {
    public static final eyu a;
    public static final eyu b;
    public static final eyu c;
    private static final /* synthetic */ eyu[] d;

    static {
        eyu eyuVar = new eyu("NO_OP", 0);
        a = eyuVar;
        eyu eyuVar2 = new eyu("ADD", 1);
        b = eyuVar2;
        eyu eyuVar3 = new eyu("REMOVE", 2);
        c = eyuVar3;
        eyu[] eyuVarArr = {eyuVar, eyuVar2, eyuVar3};
        d = eyuVarArr;
        affa.p(eyuVarArr);
    }

    public static eyu valueOf(String str) {
        return (eyu) Enum.valueOf(eyu.class, str);
    }

    public static eyu[] values() {
        return (eyu[]) d.clone();
    }
}
