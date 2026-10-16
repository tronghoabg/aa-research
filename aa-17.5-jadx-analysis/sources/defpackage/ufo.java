package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class ufo {
    public ujl a;
    public final Map b = new LinkedHashMap();
    public boolean c;
    boolean d;
    protected usm e;
    public final uvg f;

    static {
        Math.log(2.0d);
        Math.log(2.0d);
    }

    public ufo(uvg uvgVar) {
        this.f = uvgVar;
    }

    public final synchronized void a(ufh ufhVar) {
        List list = (List) this.b.get(this.a);
        if (list != null) {
            list.add(ufhVar.a);
            this.d = true;
        }
    }

    public final synchronized void b() {
        ujl ujlVar = this.a;
        Map map = this.b;
        if (ujlVar != null) {
            List list = (List) map.get(ujlVar);
            if (list != null) {
                list.clear();
            }
        } else {
            map.clear();
        }
        this.d = true;
    }

    public synchronized void c() {
        if (this.c) {
            g();
        }
    }

    protected abstract void d(utf utfVar);

    public final void e() {
        this.d = true;
    }

    final synchronized void f(utf utfVar) {
        c();
        this.c = true;
        d(utfVar);
    }

    public abstract void g();

    protected abstract void h(usy usyVar);

    public final synchronized void i(usy usyVar, tot totVar) {
        if (this.c) {
            if (k(usyVar) && totVar != null && !this.b.isEmpty() && j(usyVar, totVar)) {
                usyVar.a();
            }
            h(usyVar);
        }
    }

    protected abstract boolean j(usy usyVar, tot totVar);

    public boolean k(usy usyVar) {
        throw null;
    }
}
