package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class tkx {
    public static final tkx a;
    public static final tkx b;
    public static final tkx c;
    private static final /* synthetic */ tkx[] d;

    static {
        tkx tkxVar = new tkx("PENDING", 0);
        a = tkxVar;
        tkx tkxVar2 = new tkx("TIMEOUT", 1);
        b = tkxVar2;
        tkx tkxVar3 = new tkx("COMPLETE", 2);
        c = tkxVar3;
        tkx[] tkxVarArr = {tkxVar, tkxVar2, tkxVar3};
        d = tkxVarArr;
        affa.p(tkxVarArr);
    }

    public static tkx valueOf(String str) {
        return (tkx) Enum.valueOf(tkx.class, str);
    }

    public static tkx[] values() {
        return (tkx[]) d.clone();
    }
}
