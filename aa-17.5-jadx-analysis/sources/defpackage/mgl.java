package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class mgl {
    public static final mgl a;
    public static final mgl b;
    public static final mgl c;
    public static final mgl d;
    public static final mgl e;
    public static final mgl f;
    public static final mgl g;
    public static final mgl h;
    public static final mgl i;
    public static final mgl j;
    public static final mgl k;
    private static final /* synthetic */ mgl[] l;

    static {
        mgl mglVar = new mgl("TEARDOWN", 0);
        a = mglVar;
        mgl mglVar2 = new mgl("ALL_REQUIREMENTS_COMPLETE", 1);
        b = mglVar2;
        mgl mglVar3 = new mgl("NEW_REQUIREMENT_ACTIVE", 2);
        c = mglVar3;
        mgl mglVar4 = new mgl("USER_EXIT", 3);
        d = mglVar4;
        mgl mglVar5 = new mgl("USER_SYSTEM_NAVIGATION_EXIT", 4);
        e = mglVar5;
        mgl mglVar6 = new mgl("TOS_DATA_NOTICE_ACKNOWLEDGED", 5);
        f = mglVar6;
        mgl mglVar7 = new mgl("CAR_AUTHORIZED", 6);
        g = mglVar7;
        mgl mglVar8 = new mgl("DEVICE_UNLOCKED", 7);
        h = mglVar8;
        mgl mglVar9 = new mgl("NOTIFICATION_LISTENER_ACCESS_GRANTED", 8);
        i = mglVar9;
        mgl mglVar10 = new mgl("AUTHORIZATION_DIALOG_DISMISSED", 9);
        j = mglVar10;
        mgl mglVar11 = new mgl("AUTHORIZATION_DIALOG_SHOWN", 10);
        k = mglVar11;
        l = new mgl[]{mglVar, mglVar2, mglVar3, mglVar4, mglVar5, mglVar6, mglVar7, mglVar8, mglVar9, mglVar10, mglVar11};
    }

    public static mgl valueOf(String str) {
        return (mgl) Enum.valueOf(mgl.class, str);
    }

    public static mgl[] values() {
        return (mgl[]) l.clone();
    }
}
