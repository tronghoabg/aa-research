package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ihx implements java.lang.Cloneable {
    public defpackage.iih A;
    public java.lang.Float B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public defpackage.jto L;
    public long a = 0;
    public defpackage.iih b;
    public java.lang.Float c;
    public defpackage.iih d;
    public java.lang.Float e;
    public defpackage.ihi f;
    public java.lang.Float g;
    public defpackage.ihi[] h;
    public defpackage.ihi i;
    public java.lang.Float j;
    public defpackage.igz k;
    public java.util.List l;
    public defpackage.ihi m;
    public java.lang.Integer n;
    public java.lang.Boolean o;
    public java.lang.String p;
    public java.lang.String q;
    public java.lang.String r;
    public java.lang.Boolean s;
    public java.lang.Boolean t;
    public defpackage.iih u;
    public java.lang.Float v;
    public java.lang.String w;
    public java.lang.String x;
    public defpackage.iih y;
    public java.lang.Float z;

    public static defpackage.ihx a() {
        defpackage.ihx ihxVar = new defpackage.ihx();
        ihxVar.a = -1L;
        defpackage.igz igzVar = defpackage.igz.a;
        ihxVar.b = igzVar;
        ihxVar.C = 1;
        java.lang.Float fValueOf = java.lang.Float.valueOf(1.0f);
        ihxVar.c = fValueOf;
        ihxVar.d = null;
        ihxVar.e = fValueOf;
        ihxVar.f = new defpackage.ihi(1.0f);
        ihxVar.D = 1;
        ihxVar.E = 1;
        ihxVar.g = java.lang.Float.valueOf(4.0f);
        ihxVar.h = null;
        ihxVar.i = new defpackage.ihi(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        ihxVar.j = fValueOf;
        ihxVar.k = igzVar;
        ihxVar.l = null;
        ihxVar.m = new defpackage.ihi(12.0f, 7);
        ihxVar.n = 400;
        ihxVar.F = 1;
        ihxVar.G = 1;
        ihxVar.H = 1;
        ihxVar.I = 1;
        ihxVar.o = java.lang.Boolean.TRUE;
        ihxVar.L = null;
        ihxVar.p = null;
        ihxVar.q = null;
        ihxVar.r = null;
        ihxVar.s = java.lang.Boolean.TRUE;
        ihxVar.t = java.lang.Boolean.TRUE;
        ihxVar.u = igzVar;
        ihxVar.v = fValueOf;
        ihxVar.w = null;
        ihxVar.J = 1;
        ihxVar.x = null;
        ihxVar.y = null;
        ihxVar.z = fValueOf;
        ihxVar.A = null;
        ihxVar.B = fValueOf;
        ihxVar.K = 1;
        return ihxVar;
    }

    protected final java.lang.Object clone() {
        try {
            defpackage.ihx ihxVar = (defpackage.ihx) super.clone();
            defpackage.ihi[] ihiVarArr = this.h;
            if (ihiVarArr != null) {
                ihxVar.h = (defpackage.ihi[]) ihiVarArr.clone();
            }
            return ihxVar;
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.InternalError(e.toString());
        }
    }
}
