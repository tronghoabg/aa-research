package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class mbs implements lhg {
    public static final yph a = yph.c("GH.NlsEventManager");
    public final mbd c;
    private boolean h;
    public final Object b = new Object();
    public final Map d = new HashMap();
    public final Set e = new HashSet();
    final mbk f = new qiu(this, 1);
    final mbg g = new mbr(this);

    public mbs(mbd mbdVar) {
        this.c = mbdVar;
    }

    public static mbs a() {
        return (mbs) mki.a.i(mbs.class);
    }

    public final yfq b() {
        yfq yfqVarO;
        synchronized (this.b) {
            yfqVarO = yfq.o(this.d.values());
        }
        return yfqVarO;
    }

    @Override // defpackage.lhg
    public final void c() {
        this.c.b(1);
        if (acui.c()) {
            mbw.b().k(this.f);
        } else {
            mbw.b().j(this.g);
        }
        this.h = true;
    }

    @Override // defpackage.lhg
    public final void d() {
        if (!this.h) {
            ((ype) ((ype) a.h()).ai((char) 4732)).u("Can't stop if not started");
            return;
        }
        this.c.b(3);
        if (acui.c()) {
            mbw.b().m(this.f);
        } else {
            mbw.b().l(this.g);
        }
        synchronized (this.b) {
            this.d.clear();
        }
        this.h = false;
    }

    public final void e(dzg dzgVar) {
        wer.e(new kzu(this, dzgVar, 20));
    }

    public final void f(lxr lxrVar) {
        synchronized (this.b) {
            this.e.add(lxrVar);
        }
    }

    public final void g(lxr lxrVar) {
        synchronized (this.b) {
            this.e.remove(lxrVar);
        }
    }
}
