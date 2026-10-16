package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aabe {
    public static final java.lang.String a = "aabe";
    public static final defpackage.hrg b = new defpackage.aaba();
    public final defpackage.aabf c;
    public final android.widget.TextView d;
    public final java.util.Calendar e;
    public volatile int f = 1;
    public volatile java.lang.String g = null;
    public final defpackage.zug h;
    public volatile defpackage.abhm i;
    public volatile java.lang.String j;
    public java.util.List k;
    public defpackage.aabu l;
    public android.graphics.Bitmap m;
    public java.lang.String n;
    public android.graphics.Bitmap o;
    private final defpackage.hrf p;
    private final defpackage.aabg q;
    private final boolean r;
    private final defpackage.zxn s;
    private final java.lang.String t;
    private defpackage.hru u;
    private defpackage.hrx v;
    private final java.util.concurrent.Executor w;

    public aabe(defpackage.aabf aabfVar, android.widget.TextView textView, defpackage.hrf hrfVar, defpackage.aabg aabgVar, java.util.Calendar calendar, boolean z, defpackage.zxn zxnVar, final defpackage.zzf zzfVar, defpackage.zug zugVar, java.lang.String str, java.util.concurrent.Executor executor) {
        this.c = aabfVar;
        this.d = textView;
        this.p = hrfVar;
        this.q = aabgVar;
        this.e = calendar;
        this.r = z;
        this.s = zxnVar;
        this.h = zugVar;
        this.t = str;
        this.w = executor;
        zzfVar.e(new defpackage.zzd() { // from class: aaaz
            @Override // defpackage.zzd
            public final void i() {
                defpackage.aabe aabeVar = this.a;
                defpackage.zzf zzfVar2 = zzfVar;
                java.lang.String str2 = zzfVar2.h;
                defpackage.abhm abhmVar = zzfVar2.i;
                java.util.List list = zzfVar2.j;
                aabeVar.j = str2;
                aabeVar.i = abhmVar;
                aabeVar.k = list;
                aabeVar.b();
            }
        });
    }

    final void a() {
        defpackage.hru hruVar = this.u;
        if (hruVar != null) {
            hruVar.f();
            this.u = null;
            this.m = null;
            this.o = null;
        }
        defpackage.hrx hrxVar = this.v;
        if (hrxVar != null) {
            hrxVar.f();
            this.v = null;
            this.n = null;
        }
    }

    final void b() {
        int i;
        defpackage.zxn zxnVar = this.s;
        zxnVar.b(false);
        defpackage.aabu aabuVarE = this.q.e();
        int i2 = aabuVarE.f;
        if (i2 <= 0 || (i = aabuVarE.g) <= 0 || this.i == null || defpackage.zlv.G(this.j)) {
            return;
        }
        defpackage.abhm abhmVar = this.i;
        defpackage.zlv.m(abhmVar);
        defpackage.abgz abgzVar = abhmVar.g;
        if (abgzVar == null) {
            abgzVar = defpackage.abgz.a;
        }
        this.l = new defpackage.aabu(aabuVarE.e, i2, i, abgzVar.c, aabuVarE.a, aabuVarE.b, aabuVarE.c, aabuVarE.d);
        if (this.f == 0) {
            a();
            c();
            return;
        }
        java.lang.String strAb = defpackage.wpv.ab(abhmVar, this.l, this.f, null, this.j, this.g, this.k);
        defpackage.hru hruVar = this.u;
        if (hruVar != null && strAb.equals(hruVar.c)) {
            if (e()) {
                zxnVar.b(true);
                return;
            }
            return;
        }
        a();
        defpackage.aabb aabbVar = new defpackage.aabb(this, 1);
        java.lang.String str = this.t;
        defpackage.aabc aabcVar = new defpackage.aabc(strAb, aabbVar, str);
        defpackage.hrf hrfVar = this.p;
        hrfVar.a(aabcVar);
        this.u = aabcVar;
        if (this.r) {
            defpackage.aabu aabuVar = this.l;
            int i3 = this.f;
            java.lang.String str2 = this.j;
            defpackage.abot abotVar = (defpackage.abot) defpackage.abhm.a.o(abhmVar);
            defpackage.abor aborVarY = defpackage.wpv.Y(abhmVar);
            abotVar.t();
            defpackage.abhm abhmVar2 = (defpackage.abhm) abotVar.b;
            abhmVar2.g = null;
            abhmVar2.b &= -17;
            abotVar.t();
            defpackage.abhm abhmVar3 = (defpackage.abhm) abotVar.b;
            abhmVar3.f = 5;
            abhmVar3.b |= 8;
            defpackage.wpv.Z(abotVar, aabuVar);
            defpackage.wpv.aa(abotVar, aborVarY, i3);
            defpackage.abhp abhpVar = (defpackage.abhp) aborVarY.q();
            abotVar.t();
            defpackage.abhm abhmVar4 = (defpackage.abhm) abotVar.b;
            abhpVar.getClass();
            abhmVar4.e = abhpVar;
            abhmVar4.b |= 2;
            defpackage.aabd aabdVar = new defpackage.aabd(defpackage.wpv.X((defpackage.abhm) abotVar.q(), str2), new defpackage.aabb(this, 0), str);
            hrfVar.a(aabdVar);
            this.v = aabdVar;
        }
        defpackage.zug zugVar = this.h;
        if (zugVar != null) {
            hrfVar.a(new defpackage.aabc(defpackage.wpv.ab(abhmVar, this.l, this.f, zugVar, this.j, "", this.k), new defpackage.aabb(this, 2), str));
        }
    }

    public final void c() {
        if (e()) {
            defpackage.zug zugVar = this.h;
            this.c.a((zugVar == null || !zugVar.a) ? this.m : this.o, this.l);
            this.w.execute(new defpackage.zyi(this, 7));
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
        defpackage.zug zugVar = this.h;
        if (((zugVar == null || !zugVar.a) ? this.m : this.o) != null) {
            return (this.r && this.n == null) ? false : true;
        }
        return false;
    }
}
