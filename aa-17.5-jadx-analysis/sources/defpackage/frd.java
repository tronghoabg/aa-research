package defpackage;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final class frd implements Closeable {
    public final frc a;
    public final /* synthetic */ frf b;
    private boolean c;

    public frd(frf frfVar, frc frcVar) {
        this.b = frfVar;
        this.a = frcVar;
    }

    public final ajnr a(int i) {
        if (this.c) {
            throw new IllegalStateException("snapshot is closed");
        }
        Object obj = this.a.c.get(i);
        obj.getClass();
        return (ajnr) obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        frf frfVar = this.b;
        synchronized (frfVar) {
            frc frcVar = this.a;
            int i = frcVar.g - 1;
            frcVar.g = i;
            if (i == 0 && frcVar.f) {
                frfVar.f(frcVar);
            }
        }
    }
}
