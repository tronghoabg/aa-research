package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class tkr {
    public static final tkr a;
    public static final tkr b;
    private static final /* synthetic */ tkr[] c;

    static {
        tkr tkrVar = new tkr("SETUP", 0);
        a = tkrVar;
        tkr tkrVar2 = new tkr("TEARDOWN", 1);
        b = tkrVar2;
        tkr[] tkrVarArr = {tkrVar, tkrVar2};
        c = tkrVarArr;
        affa.p(tkrVarArr);
    }

    public static tkr valueOf(String str) {
        return (tkr) Enum.valueOf(tkr.class, str);
    }

    public static tkr[] values() {
        return (tkr[]) c.clone();
    }
}
