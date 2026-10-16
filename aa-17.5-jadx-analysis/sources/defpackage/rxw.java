package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
final class rxw {
    public static final rxw a;
    public static final rxw b;
    public static final rxw c;
    public static final rxw d;
    public static final rxw e;
    private static final /* synthetic */ rxw[] f;

    static {
        rxw rxwVar = new rxw("START", 0);
        a = rxwVar;
        rxw rxwVar2 = new rxw("USB_CONFIGURED", 1);
        b = rxwVar2;
        rxw rxwVar3 = new rxw("ACCESSORY_MODE", 2);
        c = rxwVar3;
        rxw rxwVar4 = new rxw("FIRST_ACTIVITY_LAUNCHED", 3);
        d = rxwVar4;
        rxw rxwVar5 = new rxw("PROJECTING", 4);
        e = rxwVar5;
        f = new rxw[]{rxwVar, rxwVar2, rxwVar3, rxwVar4, rxwVar5};
    }

    public static rxw valueOf(String str) {
        return (rxw) Enum.valueOf(rxw.class, str);
    }

    public static rxw[] values() {
        return (rxw[]) f.clone();
    }
}
