package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class nuf {
    public static final defpackage.nuf a;
    public static final defpackage.nuf b;
    public static final defpackage.nuf c;
    public static final defpackage.nuf d;
    private static final /* synthetic */ defpackage.nuf[] e;

    static {
        defpackage.nuf nufVar = new defpackage.nuf("UNKNOWN", 0);
        a = nufVar;
        defpackage.nuf nufVar2 = new defpackage.nuf("AIRPLANE", 1);
        b = nufVar2;
        defpackage.nuf nufVar3 = new defpackage.nuf("CELLULAR", 2);
        c = nufVar3;
        defpackage.nuf nufVar4 = new defpackage.nuf("SATELLITE", 3);
        d = nufVar4;
        e = new defpackage.nuf[]{nufVar, nufVar2, nufVar3, nufVar4};
    }

    public static defpackage.nuf valueOf(java.lang.String str) {
        return (defpackage.nuf) java.lang.Enum.valueOf(defpackage.nuf.class, str);
    }

    public static defpackage.nuf[] values() {
        return (defpackage.nuf[]) e.clone();
    }
}
