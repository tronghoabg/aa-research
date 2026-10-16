package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lqd {
    public static final lqd a;
    public static final lqd b;
    public static final lqd c;
    public static final lqd d;
    public static final lqd e;
    private static final /* synthetic */ lqd[] f;

    static {
        lqd lqdVar = new lqd("AUTOPLAY_SHOULD_TRIGGER_PREVIOUS_SESSION_WAS_PLAYING_AT_END", 0);
        a = lqdVar;
        lqd lqdVar2 = new lqd("AUTOPLAY_SHOULD_TRIGGER_ANY_MEDIA_DURATION_MORE_THAN_THRESHOLD", 1);
        b = lqdVar2;
        lqd lqdVar3 = new lqd("AUTOPLAY_SHOULD_TRIGGER_PREVIOUS_SESSION_WAS_SHORT_AND_ELIGIBLE", 2);
        c = lqdVar3;
        lqd lqdVar4 = new lqd("NO_AUTOPLAY_PREVIOUS_SESSION_REQUIREMENTS_NOT_MET", 3);
        d = lqdVar4;
        lqd lqdVar5 = new lqd("NO_AUTOPLAY_USER_OPTED_OUT", 4);
        e = lqdVar5;
        f = new lqd[]{lqdVar, lqdVar2, lqdVar3, lqdVar4, lqdVar5};
    }

    public static lqd valueOf(String str) {
        return (lqd) Enum.valueOf(lqd.class, str);
    }

    public static lqd[] values() {
        return (lqd[]) f.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return false;
        }
        throw new RuntimeException(null, null);
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "autoplay should trigger: previous session was playing at end";
        }
        if (iOrdinal == 1) {
            return "autoplay should trigger: any media duration higher than threshold";
        }
        if (iOrdinal == 2) {
            return "autoplay should trigger: previous session was short and eligible";
        }
        if (iOrdinal == 3) {
            return "no autoplay: previous session requirements not met";
        }
        if (iOrdinal == 4) {
            return "no autoplay: user not opted in";
        }
        throw new RuntimeException(null, null);
    }
}
