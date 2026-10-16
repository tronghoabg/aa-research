package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class vry {
    public static final defpackage.vry a;
    public static final defpackage.vry b;
    public static final defpackage.vry c;
    public static final defpackage.vry d;
    public static final defpackage.vry e;
    private static final /* synthetic */ defpackage.vry[] f;

    static {
        defpackage.vry vryVar = new defpackage.vry("WAKELOCK", 0);
        a = vryVar;
        defpackage.vry vryVar2 = new defpackage.vry("SYNC", 1);
        b = vryVar2;
        defpackage.vry vryVar3 = new defpackage.vry("JOB", 2);
        c = vryVar3;
        defpackage.vry vryVar4 = new defpackage.vry("PROCESS", 3);
        d = vryVar4;
        defpackage.vry vryVar5 = new defpackage.vry("SENSOR", 4);
        e = vryVar5;
        f = new defpackage.vry[]{vryVar, vryVar2, vryVar3, vryVar4, vryVar5};
    }

    public static defpackage.vry valueOf(java.lang.String str) {
        return (defpackage.vry) java.lang.Enum.valueOf(defpackage.vry.class, str);
    }

    public static defpackage.vry[] values() {
        return (defpackage.vry[]) f.clone();
    }
}
