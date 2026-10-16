package defpackage;

import android.content.Context;
import j$.util.Optional;

/* loaded from: classes2.dex */
public final class kpz extends kpy {
    public static final yph a = yph.c("GH.Conn.CarToken");
    public final Object h = new Object();
    public Optional i = Optional.empty();
    final rbt j = new pdn(this, 1);
    private final Context k;

    public kpz(Context context) {
        this.k = context;
    }

    @Override // defpackage.eqj
    protected final void c() {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 3368)).u("onActive");
        synchronized (this.h) {
            if (this.i.isPresent()) {
                ((ype) ((ype) yphVar.f()).ai(3373)).u("Car connection listener already present");
                return;
            }
            ((ype) ((ype) yphVar.f()).ai(3372)).u("Registering for connection events");
            Context context = this.k;
            context.getClass();
            Optional optionalOf = Optional.of(omc.b(context, this.j, new wzf(this, 1), null, 0));
            this.i = optionalOf;
            ((qsz) optionalOf.get()).e();
        }
    }

    @Override // defpackage.eqj
    protected final void d() {
        Object obj = this.h;
        synchronized (obj) {
            synchronized (obj) {
                Optional optional = this.i;
                jfz jfzVar = new jfz(this, 7);
                if (true == optional.isPresent()) {
                    Object obj2 = optional.get();
                    Object obj3 = jfzVar.a;
                    synchronized (((kpz) obj3).h) {
                        ((qsz) obj2).g();
                        ((kpz) obj3).i = Optional.empty();
                    }
                }
            }
        }
        p();
    }
}
