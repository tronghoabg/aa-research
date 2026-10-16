package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class yqz extends yrm {
    public static final yqz a = new yqz(yro.a);
    private final AtomicReference b;

    public yqz(yrm yrmVar) {
        this.b = new AtomicReference(yrmVar);
    }

    @Override // defpackage.yrm
    public final ypt a() {
        return ((yrm) this.b.get()).a();
    }

    @Override // defpackage.yrm
    public final yrt b() {
        return ((yrm) this.b.get()).b();
    }

    public final void c() {
        this.b.set(yro.a);
    }

    @Override // defpackage.yrm
    public final void d(String str, Level level, boolean z) {
        ((yrm) this.b.get()).d(str, level, z);
    }
}
