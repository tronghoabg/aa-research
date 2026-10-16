package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class thd {
    public static final thd a;
    public static final thd b;
    public static final thd c;
    public static final thd d;
    public static final thd e;
    public static final thd f;
    public static final thd g;
    public static final thd h;
    private static final /* synthetic */ thd[] i;

    static {
        thd thdVar = new thd("SET_AUDIO_ROUTE", 0);
        a = thdVar;
        thd thdVar2 = new thd("PHONE_PLACE_CALL", 1);
        b = thdVar2;
        thd thdVar3 = new thd("PHONE_ACCEPT_CALL", 2);
        c = thdVar3;
        thd thdVar4 = new thd("PHONE_REJECT_CALL", 3);
        d = thdVar4;
        thd thdVar5 = new thd("PHONE_END_CALL", 4);
        e = thdVar5;
        thd thdVar6 = new thd("PHONE_EXISTING_CALL_AT_STARTUP", 5);
        f = thdVar6;
        thd thdVar7 = new thd("PHONE_ON_CALL_ADDED", 6);
        g = thdVar7;
        thd thdVar8 = new thd("PHONE_RINGING_CALL_ADDED", 7);
        h = thdVar8;
        i = new thd[]{thdVar, thdVar2, thdVar3, thdVar4, thdVar5, thdVar6, thdVar7, thdVar8};
    }

    public static thd valueOf(String str) {
        return (thd) Enum.valueOf(thd.class, str);
    }

    public static thd[] values() {
        return (thd[]) i.clone();
    }
}
