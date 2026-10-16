package defpackage;

import j$.time.Duration;

/* loaded from: classes3.dex */
public final class yuo extends yup {
    public yuo(Duration duration, int i) {
        super(duration, i);
    }

    public final String toString() {
        xxg xxgVar = new xxg("exponentialBackoff");
        xxgVar.g("firstDelayMs", this.b.toMillis());
        xxgVar.d("multiplier", 2.0d);
        xxgVar.f("tries", this.a);
        return xxgVar.toString();
    }
}
