package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class thz {
    public static final defpackage.thz a;
    public static final defpackage.thz b;
    public static final defpackage.thz c;
    public static final defpackage.thz d;
    public static final defpackage.thz e;
    public static final defpackage.thz f;
    public static final defpackage.thz g;
    public static final defpackage.thz h;
    private static final /* synthetic */ defpackage.thz[] i;

    static {
        defpackage.thz thzVar = new defpackage.thz("SET_AUDIO_ROUTE", 0);
        a = thzVar;
        defpackage.thz thzVar2 = new defpackage.thz("PHONE_PLACE_CALL", 1);
        b = thzVar2;
        defpackage.thz thzVar3 = new defpackage.thz("PHONE_ACCEPT_CALL", 2);
        c = thzVar3;
        defpackage.thz thzVar4 = new defpackage.thz("PHONE_REJECT_CALL", 3);
        d = thzVar4;
        defpackage.thz thzVar5 = new defpackage.thz("PHONE_END_CALL", 4);
        e = thzVar5;
        defpackage.thz thzVar6 = new defpackage.thz("PHONE_EXISTING_CALL_AT_STARTUP", 5);
        f = thzVar6;
        defpackage.thz thzVar7 = new defpackage.thz("PHONE_ON_CALL_ADDED", 6);
        g = thzVar7;
        defpackage.thz thzVar8 = new defpackage.thz("PHONE_RINGING_CALL_ADDED", 7);
        h = thzVar8;
        i = new defpackage.thz[]{thzVar, thzVar2, thzVar3, thzVar4, thzVar5, thzVar6, thzVar7, thzVar8};
    }

    public static defpackage.thz valueOf(java.lang.String str) {
        return (defpackage.thz) java.lang.Enum.valueOf(defpackage.thz.class, str);
    }

    public static defpackage.thz[] values() {
        return (defpackage.thz[]) i.clone();
    }
}
