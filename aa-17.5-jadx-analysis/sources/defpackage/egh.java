package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class egh implements eep {
    public final File a;
    public final eha b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public egh(File file, eha ehaVar) {
        this.a = file;
        this.b = ehaVar;
    }

    @Override // defpackage.eep
    public final void a() {
        this.c.set(true);
    }

    protected final void b() {
        if (this.c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }
}
