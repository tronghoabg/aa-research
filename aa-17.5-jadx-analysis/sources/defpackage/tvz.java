package defpackage;

import android.content.Context;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class tvz extends tvl implements tyw, tpz {
    public static final yob c = yob.c("com/google/android/libraries/geo/mapcore/internal/impl/ClientLineImpl");
    public static final ujl[] d = new ujl[0];
    public float e;
    public ufk f;
    public ufk g;
    public final Object h;
    public final List i;
    public boolean j;
    public final Map k;
    public abdd l;
    public ufp m;
    public final boolean n;
    private ujl[] o;
    private final utf p;
    private final txj q;
    private final uvg r;
    private final gjv s;

    public tvz(txj txjVar, ush ushVar, uvg uvgVar, Map map, gjv gjvVar, qrx qrxVar, Context context, utf utfVar, boolean z, uaj uajVar) {
        super(gjvVar);
        this.e = BitmapDescriptorFactory.HUE_RED;
        this.h = new Object();
        this.i = new ArrayList();
        this.k = map;
        this.r = uvgVar;
        this.s = gjvVar;
        this.q = txjVar;
        this.p = utfVar;
        this.o = null;
        this.l = null;
        this.m = null;
        this.n = z;
        this.m = new ufp(ushVar, uvgVar, this, context.getResources().getDisplayMetrics().density, qrxVar, uajVar);
    }

    private final void t(final boolean z, final boolean z2) {
        boolean z3;
        synchronized (this) {
            if (this.b) {
                return;
            }
            vaq.d();
            synchronized (this.h) {
                List list = this.i;
                if (list.isEmpty()) {
                    z3 = true;
                } else {
                    ajju ajjuVar = new ajju(list.size(), new Runnable() { // from class: tvy
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.c(z, z2);
                        }
                    });
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((tqo) it.next()).c(new tvv(ajjuVar, 4));
                    }
                    z3 = false;
                }
            }
            if (z3) {
                c(z, z2);
            }
        }
    }

    @Override // defpackage.tqs
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final abdd j() {
        abdd abddVar = this.l;
        return abddVar != null ? abddVar : abdd.a;
    }

    public final void b(boolean z) {
        uui.a();
        vaq.d();
        synchronized (this) {
            if (this.b) {
                return;
            }
            ufk ufkVar = this.f;
            if (ufkVar == null) {
                return;
            }
            if (this.j) {
                ufk ufkVar2 = this.g;
                if (ufkVar2 != null) {
                    ufkVar2.h();
                }
                ufkVar.f();
            }
            this.g = ufkVar;
            this.f = null;
            boolean z2 = this.a;
            this.a = true;
            if (!z || z2) {
                return;
            }
            m();
        }
    }

    public final void c(boolean z, boolean z2) {
        synchronized (this) {
            ufk ufkVar = this.f;
            if (ufkVar != null) {
                ufkVar.j();
                if (z2 || !this.n) {
                    l(new jgv(this, z, 14));
                }
            } else {
                ujl[] ujlVarArr = this.o;
                if (ujlVarArr != null) {
                    d(ujlVarArr);
                }
            }
        }
    }

    final void d(ujl[] ujlVarArr) {
        if (ujlVarArr.length == 0) {
            return;
        }
        vaq.d();
        ufp ufpVar = this.m;
        ujl ujlVar = ujlVarArr[0];
        long j = ujlVar.g.g(ujlVar.w).F;
        ujl ujlVar2 = ujlVarArr[0];
        long j2 = ujlVar2.c;
        long j3 = ujlVar2.d;
        vaq.d();
        synchronized (ufpVar.u) {
            ufpVar.r = j;
            ufpVar.s = j2;
            ufpVar.t = j3;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.a = false;
            ufk ufkVar = this.f;
            if (ufkVar != null) {
                ufkVar.g();
            }
            this.o = ujlVarArr;
            ufp ufpVar2 = this.m;
            uvg uvgVar = this.r;
            gjv gjvVar = this.s;
            utf utfVar = this.p;
            abdd abddVarJ = j();
            abnh abnhVar = ujr.g;
            abddVarJ.j(abnhVar);
            Object objJ = abddVarJ.w.j(abnhVar.d);
            this.f = new ufk(ujlVarArr, ufpVar2, uvgVar, gjvVar, utfVar, ((Boolean) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).booleanValue());
            t(true, false);
        }
    }

    @Override // defpackage.tvl, defpackage.tpz
    public final synchronized void e() {
        super.e();
        ufp ufpVar = this.m;
        synchronized (ufpVar.j) {
            if (ufpVar.k) {
                ufpVar.k = false;
                umb umbVar = ufpVar.i;
                if (umbVar != null) {
                    umbVar.x = umi.a;
                }
            }
        }
    }

    @Override // defpackage.tpz
    public final void f() {
        this.q.b(this);
    }

    @Override // defpackage.tvl, defpackage.tpz
    public final synchronized void g(tqq tqqVar) {
        super.g(tqqVar);
        this.m.m();
    }

    @Override // defpackage.tvl, defpackage.tpz
    public final synchronized void h() {
        super.h();
        this.m.m();
    }

    @Override // defpackage.tpz
    public final void i() {
        this.q.d(this);
    }

    @Override // defpackage.tvl
    public final void o(tqd tqdVar) {
        p(tqdVar, this);
    }

    @Override // defpackage.tyw
    public final void u() {
        synchronized (this) {
            if (this.b) {
                return;
            }
            t(false, true);
        }
    }

    @Override // defpackage.tyw
    public final void v() {
        synchronized (this) {
            if (this.b) {
                return;
            }
            l(new tvv(this, 5));
        }
    }

    @Override // defpackage.tyw
    public final void w() {
        synchronized (this) {
            if (this.b) {
                return;
            }
            l(new tvv(this, 3));
        }
    }

    @Override // defpackage.tyw
    public final void x() {
        synchronized (this) {
            if (this.b) {
                return;
            }
            l(new tvv(this, 2));
        }
    }
}
