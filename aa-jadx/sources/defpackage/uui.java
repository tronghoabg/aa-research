package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class uui {
    public static final defpackage.uui a;
    public static final defpackage.uui b;
    public static final defpackage.uui c;
    public static final int d;
    private static final /* synthetic */ defpackage.uui[] e;

    static {
        defpackage.uui uuiVar = new defpackage.uui("WAIT_FOR_NEXT_FRAME", 0);
        a = uuiVar;
        defpackage.uui uuiVar2 = new defpackage.uui("START_FRAME", 1);
        b = uuiVar2;
        defpackage.uui uuiVar3 = new defpackage.uui("END_FRAME", 2);
        c = uuiVar3;
        e = new defpackage.uui[]{uuiVar, uuiVar2, uuiVar3};
        d = values().length;
    }

    public static defpackage.uui valueOf(java.lang.String str) {
        return (defpackage.uui) java.lang.Enum.valueOf(defpackage.uui.class, str);
    }

    public static defpackage.uui[] values() {
        return (defpackage.uui[]) e.clone();
    }
}
