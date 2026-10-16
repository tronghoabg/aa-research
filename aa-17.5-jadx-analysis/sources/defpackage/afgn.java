package defpackage;

import java.util.Random;

/* loaded from: classes.dex */
public abstract class afgn extends afgs {
    @Override // defpackage.afgs
    public final double a() {
        return e().nextDouble();
    }

    @Override // defpackage.afgs
    public final int b() {
        return e().nextInt();
    }

    @Override // defpackage.afgs
    public final int c(int i) {
        return e().nextInt(i);
    }

    @Override // defpackage.afgs
    public final long d() {
        return e().nextLong();
    }

    public abstract Random e();
}
