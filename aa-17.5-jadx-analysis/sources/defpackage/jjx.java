package defpackage;

import j$.time.Duration;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jjx {
    public static final jjx a;
    public static final jjx b;
    public static final jjx c;
    public static final jjx d;
    private static final /* synthetic */ jjx[] i;
    public final Duration e;
    public final yzy f;
    public final Duration g;
    public final Duration h;

    static {
        jjx jjxVar = new jjx("RESIZE", 0, wub.an(5), yzy.Lv, wub.an(1), null, 8);
        a = jjxVar;
        Duration duration = null;
        jjx jjxVar2 = new jjx("STARTUP", 1, wub.an(12), yzy.Lu, null, duration, 12);
        b = jjxVar2;
        jjx jjxVar3 = new jjx("VIDEO_FOCUS", 2, wub.an(4), yzy.Lw, duration, wub.am(1), 4);
        c = jjxVar3;
        jjx jjxVar4 = new jjx("STARTUP_NO_TIMEOUT", 3, null, yzy.Lu, null, null, 12);
        d = jjxVar4;
        jjx[] jjxVarArr = {jjxVar, jjxVar2, jjxVar3, jjxVar4};
        i = jjxVarArr;
        affa.p(jjxVarArr);
    }

    public /* synthetic */ jjx(String str, int i2, Duration duration, yzy yzyVar, Duration duration2, Duration duration3, int i3) {
        if ((i3 & 4) != 0) {
            duration2 = Duration.ofSeconds(2L);
            duration2.getClass();
        }
        if ((i3 & 8) != 0) {
            duration3 = Duration.ZERO;
            duration3.getClass();
        }
        this.e = duration;
        this.f = yzyVar;
        this.g = duration2;
        this.h = duration3;
    }

    public static jjx valueOf(String str) {
        return (jjx) Enum.valueOf(jjx.class, str);
    }

    public static jjx[] values() {
        return (jjx[]) i.clone();
    }
}
