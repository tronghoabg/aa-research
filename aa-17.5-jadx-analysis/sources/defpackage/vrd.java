package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class vrd {
    public static final vrd a;
    public static final vrd b;
    public static final vrd c;
    public static final vrd d;
    public static final vrd e;
    private static final /* synthetic */ vrd[] f;

    static {
        vrd vrdVar = new vrd("WAKELOCK", 0);
        a = vrdVar;
        vrd vrdVar2 = new vrd("SYNC", 1);
        b = vrdVar2;
        vrd vrdVar3 = new vrd("JOB", 2);
        c = vrdVar3;
        vrd vrdVar4 = new vrd("PROCESS", 3);
        d = vrdVar4;
        vrd vrdVar5 = new vrd("SENSOR", 4);
        e = vrdVar5;
        f = new vrd[]{vrdVar, vrdVar2, vrdVar3, vrdVar4, vrdVar5};
    }

    public static vrd valueOf(String str) {
        return (vrd) Enum.valueOf(vrd.class, str);
    }

    public static vrd[] values() {
        return (vrd[]) f.clone();
    }
}
