package defpackage;

import android.graphics.Bitmap;
import android.widget.TextView;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzz {
    public static final String a = "zzz";
    public static final hqx b = new zzv();
    public final aaaa c;
    public final TextView d;
    public final Calendar e;
    public volatile int f = 1;
    public volatile String g = null;
    public final ztc h;
    public volatile abgj i;
    public volatile String j;
    public List k;
    public aaao l;
    public Bitmap m;
    public String n;
    public Bitmap o;
    private final hqw p;
    private final aaab q;
    private final boolean r;
    private final zwk s;
    private final String t;
    private hrl u;
    private hro v;
    private final Executor w;

    public zzz(aaaa aaaaVar, TextView textView, hqw hqwVar, aaab aaabVar, Calendar calendar, boolean z, zwk zwkVar, final zyb zybVar, ztc ztcVar, String str, Executor executor) {
        this.c = aaaaVar;
        this.d = textView;
        this.p = hqwVar;
        this.q = aaabVar;
        this.e = calendar;
        this.r = z;
        this.s = zwkVar;
        this.h = ztcVar;
        this.t = str;
        this.w = executor;
        zybVar.e(new zxz() { // from class: zzu
            @Override // defpackage.zxz
            public final void i() {
                zzz zzzVar = this.a;
                zyb zybVar2 = zybVar;
                String str2 = zybVar2.h;
                abgj abgjVar = zybVar2.i;
                List list = zybVar2.j;
                zzzVar.j = str2;
                zzzVar.i = abgjVar;
                zzzVar.k = list;
                zzzVar.b();
            }
        });
    }

    final void a() {
        hrl hrlVar = this.u;
        if (hrlVar != null) {
            hrlVar.f();
            this.u = null;
            this.m = null;
            this.o = null;
        }
        hro hroVar = this.v;
        if (hroVar != null) {
            hroVar.f();
            this.v = null;
            this.n = null;
        }
    }

    final void b() {
        int i;
        zwk zwkVar = this.s;
        zwkVar.b(false);
        aaao aaaoVarE = this.q.e();
        int i2 = aaaoVarE.f;
        if (i2 <= 0 || (i = aaaoVarE.g) <= 0 || this.i == null || ysi.R(this.j)) {
            return;
        }
        abgj abgjVar = this.i;
        zkt.m(abgjVar);
        abfw abfwVar = abgjVar.g;
        if (abfwVar == null) {
            abfwVar = abfw.a;
        }
        this.l = new aaao(aaaoVarE.e, i2, i, abfwVar.c, aaaoVarE.a, aaaoVarE.b, aaaoVarE.c, aaaoVarE.d);
        if (this.f == 0) {
            a();
            c();
            return;
        }
        String strZ = ysi.z(abgjVar, this.l, this.f, null, this.j, this.g, this.k);
        hrl hrlVar = this.u;
        if (hrlVar != null && strZ.equals(hrlVar.c)) {
            if (e()) {
                zwkVar.b(true);
                return;
            }
            return;
        }
        a();
        zzw zzwVar = new zzw(this, 1);
        String str = this.t;
        zzx zzxVar = new zzx(strZ, zzwVar, str);
        hqw hqwVar = this.p;
        hqwVar.a(zzxVar);
        this.u = zzxVar;
        if (this.r) {
            aaao aaaoVar = this.l;
            int i3 = this.f;
            String str2 = this.j;
            abnr abnrVar = (abnr) abgj.a.o(abgjVar);
            abnp abnpVarW = ysi.w(abgjVar);
            abnrVar.t();
            abgj abgjVar2 = (abgj) abnrVar.b;
            abgjVar2.g = null;
            abgjVar2.b &= -17;
            abnrVar.t();
            abgj abgjVar3 = (abgj) abnrVar.b;
            abgjVar3.f = 5;
            abgjVar3.b |= 8;
            ysi.x(abnrVar, aaaoVar);
            ysi.y(abnrVar, abnpVarW, i3);
            abgm abgmVar = (abgm) abnpVarW.q();
            abnrVar.t();
            abgj abgjVar4 = (abgj) abnrVar.b;
            abgmVar.getClass();
            abgjVar4.e = abgmVar;
            abgjVar4.b |= 2;
            zzy zzyVar = new zzy(ysi.v((abgj) abnrVar.q(), str2), new zzw(this, 0), str);
            hqwVar.a(zzyVar);
            this.v = zzyVar;
        }
        ztc ztcVar = this.h;
        if (ztcVar != null) {
            hqwVar.a(new zzx(ysi.z(abgjVar, this.l, this.f, ztcVar, this.j, "", this.k), new zzw(this, 2), str));
        }
    }

    public final void c() {
        if (e()) {
            ztc ztcVar = this.h;
            this.c.a((ztcVar == null || !ztcVar.a) ? this.m : this.o, this.l);
            this.w.execute(new zte(this, 19));
            this.s.b(true);
        }
    }

    public final void d() {
        if (this.f == 4 || this.f == 2 || (this.g != null && this.f == 1)) {
            this.d.setTextColor(-1);
        } else {
            this.d.setTextColor(-16777216);
        }
    }

    public final boolean e() {
        if (this.u == null) {
            return true;
        }
        ztc ztcVar = this.h;
        if (((ztcVar == null || !ztcVar.a) ? this.m : this.o) != null) {
            return (this.r && this.n == null) ? false : true;
        }
        return false;
    }
}
