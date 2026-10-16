package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@zje(a = zjc.a)
/* loaded from: classes2.dex */
public final class lqp {
    public static final lqp a;
    public static final lqp b;
    public static final lqp c;
    public static final lqp d;
    public static final lqp e;
    public static final lqp f;
    public static final lqp g;
    public static final lqp h;
    public static final lqp i;
    private static final /* synthetic */ lqp[] j;

    static {
        lqp lqpVar = new lqp("ON_LIFETIME_START", 0);
        a = lqpVar;
        lqp lqpVar2 = new lqp("PENDING_CONNECTED_MEDIA_AND_IDLE_CALL", 1);
        b = lqpVar2;
        lqp lqpVar3 = new lqp("ON_CONNECTED_MEDIA_AND_IDLE_CALL", 2);
        c = lqpVar3;
        lqp lqpVar4 = new lqp("ON_BUFFERING_AFTER_AUTOPLAY_DISPATCH", 3);
        d = lqpVar4;
        lqp lqpVar5 = new lqp("ON_PAUSED_AFTER_BUFFERING", 4);
        e = lqpVar5;
        lqp lqpVar6 = new lqp("ON_RETRY_INTERVAL_ELAPSED_ATTEMPT_RESUME", 5);
        f = lqpVar6;
        lqp lqpVar7 = new lqp("ON_PLAYBACK_START_AFTER_AUTOPLAY_DISPATCH", 6);
        g = lqpVar7;
        lqp lqpVar8 = new lqp("ON_TIMEOUT", 7);
        h = lqpVar8;
        lqp lqpVar9 = new lqp("ON_CANCELED", 8);
        i = lqpVar9;
        j = new lqp[]{lqpVar, lqpVar2, lqpVar3, lqpVar4, lqpVar5, lqpVar6, lqpVar7, lqpVar8, lqpVar9};
    }

    public static lqp valueOf(String str) {
        return (lqp) Enum.valueOf(lqp.class, str);
    }

    public static lqp[] values() {
        return (lqp[]) j.clone();
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
                throw new RuntimeException(null, null);
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
                throw new RuntimeException(null, null);
        }
    }
}
