package defpackage;

import j$.time.Instant;

/* loaded from: classes.dex */
public abstract class lyt {
    public boolean b;

    public lyt() {
        oit.a();
        Instant.now().toEpochMilli();
    }

    protected abstract boolean a();

    protected abstract void b(boolean z);

    public final void c() {
        boolean zA = a();
        if (zA == this.b) {
            return;
        }
        this.b = zA;
        oit.a();
        Instant.now().toEpochMilli();
        b(zA);
    }
}
