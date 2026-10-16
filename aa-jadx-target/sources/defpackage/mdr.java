package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mdr {
    public static final defpackage.mdr a;
    public static final defpackage.mdr b;
    public static final defpackage.mdr c;
    public static final defpackage.mdr d;
    public static final defpackage.mdr e;
    public static final defpackage.mdr f;
    public static final defpackage.mdr g;
    public static final defpackage.mdr h;
    private static final /* synthetic */ defpackage.mdr[] i;

    static {
        defpackage.mdr mdrVar = new defpackage.mdr("PHONE", 0);
        a = mdrVar;
        defpackage.mdr mdrVar2 = new defpackage.mdr("CONTACTS", 1);
        b = mdrVar2;
        defpackage.mdr mdrVar3 = new defpackage.mdr("LOCATION", 2);
        c = mdrVar3;
        defpackage.mdr mdrVar4 = new defpackage.mdr("SMS", 3);
        d = mdrVar4;
        defpackage.mdr mdrVar5 = new defpackage.mdr("MICROPHONE", 4);
        e = mdrVar5;
        defpackage.mdr mdrVar6 = new defpackage.mdr("CALENDAR", 5);
        f = mdrVar6;
        defpackage.mdr mdrVar7 = new defpackage.mdr("CALL_LOG", 6);
        g = mdrVar7;
        defpackage.mdr mdrVar8 = new defpackage.mdr("NEARBY_DEVICES", 7);
        h = mdrVar8;
        i = new defpackage.mdr[]{mdrVar, mdrVar2, mdrVar3, mdrVar4, mdrVar5, mdrVar6, mdrVar7, mdrVar8};
    }

    public static defpackage.mdr valueOf(java.lang.String str) {
        return (defpackage.mdr) java.lang.Enum.valueOf(defpackage.mdr.class, str);
    }

    public static defpackage.mdr[] values() {
        return (defpackage.mdr[]) i.clone();
    }
}
