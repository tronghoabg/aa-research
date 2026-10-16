package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ryq {
    public static final defpackage.ryq a;
    public static final defpackage.ryq b;
    public static final defpackage.ryq c;
    public static final defpackage.ryq d;
    public static final defpackage.ryq e;
    private static final /* synthetic */ defpackage.ryq[] f;

    static {
        defpackage.ryq ryqVar = new defpackage.ryq("START", 0);
        a = ryqVar;
        defpackage.ryq ryqVar2 = new defpackage.ryq("USB_CONFIGURED", 1);
        b = ryqVar2;
        defpackage.ryq ryqVar3 = new defpackage.ryq("ACCESSORY_MODE", 2);
        c = ryqVar3;
        defpackage.ryq ryqVar4 = new defpackage.ryq("FIRST_ACTIVITY_LAUNCHED", 3);
        d = ryqVar4;
        defpackage.ryq ryqVar5 = new defpackage.ryq("PROJECTING", 4);
        e = ryqVar5;
        f = new defpackage.ryq[]{ryqVar, ryqVar2, ryqVar3, ryqVar4, ryqVar5};
    }

    public static defpackage.ryq valueOf(java.lang.String str) {
        return (defpackage.ryq) java.lang.Enum.valueOf(defpackage.ryq.class, str);
    }

    public static defpackage.ryq[] values() {
        return (defpackage.ryq[]) f.clone();
    }
}
