package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rwt {
    public static final defpackage.rwt a;
    public static final defpackage.rwt b;
    public static final defpackage.rwt c;
    public static final defpackage.rwt d;
    public static final defpackage.rwt e;
    private static final /* synthetic */ defpackage.rwt[] f;

    static {
        defpackage.rwt rwtVar = new defpackage.rwt("IDLE", 0);
        a = rwtVar;
        defpackage.rwt rwtVar2 = new defpackage.rwt("CONNECTING", 1);
        b = rwtVar2;
        defpackage.rwt rwtVar3 = new defpackage.rwt("CONNECTED", 2);
        c = rwtVar3;
        defpackage.rwt rwtVar4 = new defpackage.rwt("DISCONNECTING", 3);
        d = rwtVar4;
        defpackage.rwt rwtVar5 = new defpackage.rwt("DISCONNECTED", 4);
        e = rwtVar5;
        f = new defpackage.rwt[]{rwtVar, rwtVar2, rwtVar3, rwtVar4, rwtVar5};
    }

    public static defpackage.rwt valueOf(java.lang.String str) {
        return (defpackage.rwt) java.lang.Enum.valueOf(defpackage.rwt.class, str);
    }

    public static defpackage.rwt[] values() {
        return (defpackage.rwt[]) f.clone();
    }
}
