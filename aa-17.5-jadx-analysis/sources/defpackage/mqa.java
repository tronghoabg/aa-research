package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class mqa {
    public static final mqa a;
    public static final mqa b;
    private static final /* synthetic */ mqa[] c;

    static {
        mqa mqaVar = new mqa("WORK", 0);
        a = mqaVar;
        mqa mqaVar2 = new mqa("PERSONAL", 1);
        b = mqaVar2;
        mqa[] mqaVarArr = {mqaVar, mqaVar2};
        c = mqaVarArr;
        affa.p(mqaVarArr);
    }

    public static mqa valueOf(String str) {
        return (mqa) Enum.valueOf(mqa.class, str);
    }

    public static mqa[] values() {
        return (mqa[]) c.clone();
    }
}
