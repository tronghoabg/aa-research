package defpackage;

import java.util.Deque;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class tur {
    protected final tuy a;
    public boolean b;
    protected final float c;
    protected final float d;

    public tur(tuy tuyVar, float f, float f2) {
        tuyVar.getClass();
        this.a = tuyVar;
        this.c = f;
        this.d = f2;
    }

    public final void a(tvc tvcVar) {
        if (!this.b) {
            throw new IllegalStateException("Gesture already inactive: ".concat(String.valueOf(getClass().getName())));
        }
        this.b = false;
        b(tvcVar);
    }

    protected abstract void b(tvc tvcVar);

    protected abstract boolean c(tvc tvcVar);

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    protected abstract boolean g(tvc tvcVar);

    protected abstract int h(long j, Deque deque, List list);
}
