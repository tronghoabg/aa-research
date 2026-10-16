package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class afn {
    public static final afn a;
    public static final afn b;
    public static final afn c;
    private static final /* synthetic */ afn[] d;

    static {
        afn afnVar = new afn("Default", 0);
        a = afnVar;
        afn afnVar2 = new afn("UserInput", 1);
        b = afnVar2;
        afn afnVar3 = new afn("PreventUserInput", 2);
        c = afnVar3;
        afn[] afnVarArr = {afnVar, afnVar2, afnVar3};
        d = afnVarArr;
        affa.p(afnVarArr);
    }

    public static afn valueOf(String str) {
        return (afn) Enum.valueOf(afn.class, str);
    }

    public static afn[] values() {
        return (afn[]) d.clone();
    }
}
