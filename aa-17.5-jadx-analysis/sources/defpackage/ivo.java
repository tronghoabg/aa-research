package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class ivo extends rjl {
    public static final yph a = yph.c("CAR.SERVICE");
    public final iuu b;
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();

    public ivo(iuu iuuVar) {
        this.b = iuuVar;
    }

    @Override // defpackage.rjm
    public final void a(rjp rjpVar) {
        this.c.add(rjpVar);
    }

    @Override // defpackage.rjm
    public final void b(List list) {
        rbe.h(new ino(this, list, 10));
    }

    @Override // defpackage.rjm
    public final void c(rjp rjpVar) {
        this.c.remove(rjpVar);
    }
}
