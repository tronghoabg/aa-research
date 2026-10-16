package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tfu {
    public static final defpackage.tfu a;
    public static final defpackage.tfu b;
    public static final defpackage.tfu c;
    public static final defpackage.tfu d;
    public static final defpackage.tfu e;
    private static final /* synthetic */ defpackage.tfu[] f;

    static {
        defpackage.tfu tfuVar = new defpackage.tfu("DEFAULT", 0);
        a = tfuVar;
        defpackage.tfu tfuVar2 = new defpackage.tfu("ASSISTANT", 1);
        b = tfuVar2;
        defpackage.tfu tfuVar3 = new defpackage.tfu("AUDIO", 2);
        c = tfuVar3;
        defpackage.tfu tfuVar4 = new defpackage.tfu("TELECOM", 3);
        d = tfuVar4;
        defpackage.tfu tfuVar5 = new defpackage.tfu("NOTIFICATION_LISTENER_SERVICE", 4);
        e = tfuVar5;
        f = new defpackage.tfu[]{tfuVar, tfuVar2, tfuVar3, tfuVar4, tfuVar5};
    }

    public static defpackage.tfu valueOf(java.lang.String str) {
        return (defpackage.tfu) java.lang.Enum.valueOf(defpackage.tfu.class, str);
    }

    public static defpackage.tfu[] values() {
        return (defpackage.tfu[]) f.clone();
    }
}
