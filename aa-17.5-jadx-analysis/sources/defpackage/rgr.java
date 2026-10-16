package defpackage;

import j$.time.Duration;

/* loaded from: classes.dex */
final class rgr {
    final rgp a;
    final Duration b;
    final int c;
    final rgp d;
    final Duration e;
    int f;

    public rgr(rgp rgpVar) {
        this.f = 0;
        this.a = rgpVar;
        this.b = Duration.ZERO;
        this.c = 0;
        this.d = rgp.STATE_INITIAL;
        this.e = Duration.ZERO;
    }

    public final String toString() {
        String str;
        String hexString = Integer.toHexString(hashCode());
        int i = this.c;
        Duration duration = this.b;
        String strName = this.a.name();
        String strValueOf = String.valueOf(duration);
        int i2 = this.f;
        if (i > 0) {
            rgp rgpVar = this.d;
            Duration duration2 = this.e;
            str = ", nextStateAfterMax=" + rgpVar.name() + ", delayMsAfterMax=" + String.valueOf(duration2);
        } else {
            str = "";
        }
        return "Transition@" + hexString + "[nextState=" + strName + ", delay=" + strValueOf + ", maxCount=" + i + ", count=" + i2 + str + "]";
    }

    public rgr(rgp rgpVar, Duration duration, int i, rgp rgpVar2, Duration duration2) {
        this.f = 0;
        this.a = rgpVar;
        this.b = duration;
        this.c = i;
        this.d = rgpVar2;
        this.e = duration2;
    }

    public rgr(rgp rgpVar, Duration duration) {
        this.f = 0;
        this.a = rgpVar;
        this.b = duration;
        this.c = 0;
        this.d = rgp.STATE_INITIAL;
        this.e = Duration.ZERO;
    }
}
