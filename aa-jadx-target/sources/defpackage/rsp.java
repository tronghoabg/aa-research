package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@java.lang.Deprecated
public final class rsp {
    public static final defpackage.rsp a;
    public static final defpackage.rsp b;
    public static final defpackage.rsp c;
    public static final defpackage.rsp d;
    public static final defpackage.rsp e;
    private static final /* synthetic */ defpackage.rsp[] f;

    static {
        defpackage.rsp rspVar = new defpackage.rsp("STARTED", 0);
        a = rspVar;
        defpackage.rsp rspVar2 = new defpackage.rsp("ENDED", 1);
        b = rspVar2;
        defpackage.rsp rspVar3 = new defpackage.rsp("CAR_PROCESS_STATE_CACHED", 2);
        c = rspVar3;
        defpackage.rsp rspVar4 = new defpackage.rsp("GEARHEAD_PROJECTION_PROCESS_STATE_CACHED", 3);
        d = rspVar4;
        defpackage.rsp rspVar5 = new defpackage.rsp("GEARHEAD_CAR_PROCESS_STATE_CACHED", 4);
        e = rspVar5;
        f = new defpackage.rsp[]{rspVar, rspVar2, rspVar3, rspVar4, rspVar5};
    }

    public static defpackage.rsp valueOf(java.lang.String str) {
        return (defpackage.rsp) java.lang.Enum.valueOf(defpackage.rsp.class, str);
    }

    public static defpackage.rsp[] values() {
        return (defpackage.rsp[]) f.clone();
    }
}
