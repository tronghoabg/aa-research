package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lqj {
    public static final defpackage.lqj a;
    public static final defpackage.lqj b;
    public static final defpackage.lqj c;
    public static final defpackage.lqj d;
    public static final defpackage.lqj e;
    private static final /* synthetic */ defpackage.lqj[] f;

    static {
        defpackage.lqj lqjVar = new defpackage.lqj("AUTOPLAY_SHOULD_TRIGGER_PREVIOUS_SESSION_WAS_PLAYING_AT_END", 0);
        a = lqjVar;
        defpackage.lqj lqjVar2 = new defpackage.lqj("AUTOPLAY_SHOULD_TRIGGER_ANY_MEDIA_DURATION_MORE_THAN_THRESHOLD", 1);
        b = lqjVar2;
        defpackage.lqj lqjVar3 = new defpackage.lqj("AUTOPLAY_SHOULD_TRIGGER_PREVIOUS_SESSION_WAS_SHORT_AND_ELIGIBLE", 2);
        c = lqjVar3;
        defpackage.lqj lqjVar4 = new defpackage.lqj("NO_AUTOPLAY_PREVIOUS_SESSION_REQUIREMENTS_NOT_MET", 3);
        d = lqjVar4;
        defpackage.lqj lqjVar5 = new defpackage.lqj("NO_AUTOPLAY_USER_OPTED_OUT", 4);
        e = lqjVar5;
        f = new defpackage.lqj[]{lqjVar, lqjVar2, lqjVar3, lqjVar4, lqjVar5};
    }

    public static defpackage.lqj valueOf(java.lang.String str) {
        return (defpackage.lqj) java.lang.Enum.valueOf(defpackage.lqj.class, str);
    }

    public static defpackage.lqj[] values() {
        return (defpackage.lqj[]) f.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return false;
        }
        throw new java.lang.RuntimeException(null, null);
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
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
        throw new java.lang.RuntimeException(null, null);
    }
}
