package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@defpackage.zkg(a = defpackage.zke.a)
public final class lqu {
    public static final defpackage.lqu a;
    public static final defpackage.lqu b;
    public static final defpackage.lqu c;
    public static final defpackage.lqu d;
    public static final defpackage.lqu e;
    public static final defpackage.lqu f;
    public static final defpackage.lqu g;
    public static final defpackage.lqu h;
    public static final defpackage.lqu i;
    private static final /* synthetic */ defpackage.lqu[] j;

    static {
        defpackage.lqu lquVar = new defpackage.lqu("ON_LIFETIME_START", 0);
        a = lquVar;
        defpackage.lqu lquVar2 = new defpackage.lqu("PENDING_CONNECTED_MEDIA_AND_IDLE_CALL", 1);
        b = lquVar2;
        defpackage.lqu lquVar3 = new defpackage.lqu("ON_CONNECTED_MEDIA_AND_IDLE_CALL", 2);
        c = lquVar3;
        defpackage.lqu lquVar4 = new defpackage.lqu("ON_BUFFERING_AFTER_AUTOPLAY_DISPATCH", 3);
        d = lquVar4;
        defpackage.lqu lquVar5 = new defpackage.lqu("ON_PAUSED_AFTER_BUFFERING", 4);
        e = lquVar5;
        defpackage.lqu lquVar6 = new defpackage.lqu("ON_RETRY_INTERVAL_ELAPSED_ATTEMPT_RESUME", 5);
        f = lquVar6;
        defpackage.lqu lquVar7 = new defpackage.lqu("ON_PLAYBACK_START_AFTER_AUTOPLAY_DISPATCH", 6);
        g = lquVar7;
        defpackage.lqu lquVar8 = new defpackage.lqu("ON_TIMEOUT", 7);
        h = lquVar8;
        defpackage.lqu lquVar9 = new defpackage.lqu("ON_CANCELED", 8);
        i = lquVar9;
        j = new defpackage.lqu[]{lquVar, lquVar2, lquVar3, lquVar4, lquVar5, lquVar6, lquVar7, lquVar8, lquVar9};
    }

    public static defpackage.lqu valueOf(java.lang.String str) {
        return (defpackage.lqu) java.lang.Enum.valueOf(defpackage.lqu.class, str);
    }

    public static defpackage.lqu[] values() {
        return (defpackage.lqu[]) j.clone();
    }

    final int a() {
        switch (ordinal()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                throw new java.lang.RuntimeException(null, null);
        }
    }

    public final boolean b() {
        switch (ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return false;
            case 6:
            case 7:
            case 8:
                return true;
            default:
                throw new java.lang.RuntimeException(null, null);
        }
    }
}
