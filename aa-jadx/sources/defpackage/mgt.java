package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mgt {
    public static final defpackage.mgt a;
    public static final defpackage.mgt b;
    public static final defpackage.mgt c;
    public static final defpackage.mgt d;
    public static final defpackage.mgt e;
    public static final defpackage.mgt f;
    public static final defpackage.mgt g;
    public static final defpackage.mgt h;
    public static final defpackage.mgt i;
    public static final defpackage.mgt j;
    public static final defpackage.mgt k;
    private static final /* synthetic */ defpackage.mgt[] l;

    static {
        defpackage.mgt mgtVar = new defpackage.mgt("TEARDOWN", 0);
        a = mgtVar;
        defpackage.mgt mgtVar2 = new defpackage.mgt("ALL_REQUIREMENTS_COMPLETE", 1);
        b = mgtVar2;
        defpackage.mgt mgtVar3 = new defpackage.mgt("NEW_REQUIREMENT_ACTIVE", 2);
        c = mgtVar3;
        defpackage.mgt mgtVar4 = new defpackage.mgt("USER_EXIT", 3);
        d = mgtVar4;
        defpackage.mgt mgtVar5 = new defpackage.mgt("USER_SYSTEM_NAVIGATION_EXIT", 4);
        e = mgtVar5;
        defpackage.mgt mgtVar6 = new defpackage.mgt("TOS_DATA_NOTICE_ACKNOWLEDGED", 5);
        f = mgtVar6;
        defpackage.mgt mgtVar7 = new defpackage.mgt("CAR_AUTHORIZED", 6);
        g = mgtVar7;
        defpackage.mgt mgtVar8 = new defpackage.mgt("DEVICE_UNLOCKED", 7);
        h = mgtVar8;
        defpackage.mgt mgtVar9 = new defpackage.mgt("NOTIFICATION_LISTENER_ACCESS_GRANTED", 8);
        i = mgtVar9;
        defpackage.mgt mgtVar10 = new defpackage.mgt("AUTHORIZATION_DIALOG_DISMISSED", 9);
        j = mgtVar10;
        defpackage.mgt mgtVar11 = new defpackage.mgt("AUTHORIZATION_DIALOG_SHOWN", 10);
        k = mgtVar11;
        l = new defpackage.mgt[]{mgtVar, mgtVar2, mgtVar3, mgtVar4, mgtVar5, mgtVar6, mgtVar7, mgtVar8, mgtVar9, mgtVar10, mgtVar11};
    }

    public static defpackage.mgt valueOf(java.lang.String str) {
        return (defpackage.mgt) java.lang.Enum.valueOf(defpackage.mgt.class, str);
    }

    public static defpackage.mgt[] values() {
        return (defpackage.mgt[]) l.clone();
    }
}
