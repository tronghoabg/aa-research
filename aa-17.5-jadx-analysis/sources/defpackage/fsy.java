package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache$Key;
import java.util.List;

/* loaded from: classes2.dex */
public final class fsy {
    public final int A;
    public final Context a;
    public final Object b;
    public final ftp c;
    public final Bitmap.Config d;
    public final fqo e;
    public final List f;
    public final ftr g;
    public final ajhv h;
    public final fth i;
    public final boolean k;
    public final fsr n;
    public final fsr o;
    public final fsr p;
    public final aitu q;
    public final aitu r;
    public final aitu s;
    public final aitu t;
    public final ept u;
    public final fto v;
    public final fte w;
    public final fst x;
    public final fss y;
    public final int z;
    private final fsx B = null;
    private final MemoryCache$Key C = null;
    private final String D = null;
    private final ColorSpace E = null;
    private final aezu F = null;
    public final boolean j = true;
    public final boolean l = false;
    public final boolean m = true;
    private final MemoryCache$Key G = null;
    private final Integer H = null;
    private final Drawable I = null;
    private final Integer J = null;
    private final Drawable K = null;
    private final Integer L = null;
    private final Drawable M = null;

    public fsy(Context context, Object obj, ftp ftpVar, Bitmap.Config config, int i, fqo fqoVar, List list, ftr ftrVar, ajhv ajhvVar, fth fthVar, boolean z, fsr fsrVar, fsr fsrVar2, fsr fsrVar3, aitu aituVar, aitu aituVar2, aitu aituVar3, aitu aituVar4, ept eptVar, fto ftoVar, int i2, fte fteVar, fst fstVar, fss fssVar) {
        this.a = context;
        this.b = obj;
        this.c = ftpVar;
        this.d = config;
        this.z = i;
        this.e = fqoVar;
        this.f = list;
        this.g = ftrVar;
        this.h = ajhvVar;
        this.i = fthVar;
        this.k = z;
        this.n = fsrVar;
        this.o = fsrVar2;
        this.p = fsrVar3;
        this.q = aituVar;
        this.r = aituVar2;
        this.s = aituVar3;
        this.t = aituVar4;
        this.u = eptVar;
        this.v = ftoVar;
        this.A = i2;
        this.w = fteVar;
        this.x = fstVar;
        this.y = fssVar;
    }

    public static /* synthetic */ fsw a(fsy fsyVar) {
        return new fsw(fsyVar, fsyVar.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsy)) {
            return false;
        }
        fsy fsyVar = (fsy) obj;
        if (!affa.f(this.a, fsyVar.a) || !affa.f(this.b, fsyVar.b) || !affa.f(this.c, fsyVar.c)) {
            return false;
        }
        fsx fsxVar = fsyVar.B;
        if (!affa.f(null, null)) {
            return false;
        }
        MemoryCache$Key memoryCache$Key = fsyVar.C;
        if (!affa.f(null, null)) {
            return false;
        }
        String str = fsyVar.D;
        if (!affa.f(null, null) || this.d != fsyVar.d) {
            return false;
        }
        ColorSpace colorSpace = fsyVar.E;
        if (!affa.f(null, null) || this.z != fsyVar.z) {
            return false;
        }
        aezu aezuVar = fsyVar.F;
        if (!affa.f(null, null) || !affa.f(this.e, fsyVar.e) || !affa.f(this.f, fsyVar.f) || !affa.f(this.g, fsyVar.g) || !affa.f(this.h, fsyVar.h) || !affa.f(this.i, fsyVar.i)) {
            return false;
        }
        boolean z = fsyVar.j;
        if (this.k != fsyVar.k) {
            return false;
        }
        boolean z2 = fsyVar.l;
        boolean z3 = fsyVar.m;
        if (this.n != fsyVar.n || this.o != fsyVar.o || this.p != fsyVar.p || !affa.f(this.q, fsyVar.q) || !affa.f(this.r, fsyVar.r) || !affa.f(this.s, fsyVar.s) || !affa.f(this.t, fsyVar.t)) {
            return false;
        }
        MemoryCache$Key memoryCache$Key2 = fsyVar.G;
        if (!affa.f(null, null)) {
            return false;
        }
        Integer num = fsyVar.H;
        if (!affa.f(null, null)) {
            return false;
        }
        Drawable drawable = fsyVar.I;
        if (!affa.f(null, null)) {
            return false;
        }
        Integer num2 = fsyVar.J;
        if (!affa.f(null, null)) {
            return false;
        }
        Drawable drawable2 = fsyVar.K;
        if (!affa.f(null, null)) {
            return false;
        }
        Integer num3 = fsyVar.L;
        if (!affa.f(null, null)) {
            return false;
        }
        Drawable drawable3 = fsyVar.M;
        return affa.f(null, null) && affa.f(this.u, fsyVar.u) && affa.f(this.v, fsyVar.v) && this.A == fsyVar.A && affa.f(this.w, fsyVar.w) && affa.f(this.x, fsyVar.x) && affa.f(this.y, fsyVar.y);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        ftp ftpVar = this.c;
        int iHashCode2 = ((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + (ftpVar != null ? ftpVar.hashCode() : 0)) * 923521) + this.d.hashCode()) * 961) + this.z) * 961) + (this.e != null ? 1231 : 0)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + ahdw.a(this.h)) * 31) + this.i.hashCode()) * 31) + a.f(true)) * 31) + a.f(this.k)) * 31) + a.f(false)) * 31) + a.f(true)) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31) + this.s.hashCode()) * 31) + this.t.hashCode()) * 31) + this.u.hashCode()) * 31) + this.v.hashCode()) * 31;
        int i = this.A;
        a.aW(i);
        return ((((((iHashCode2 + i) * 31) + this.w.hashCode()) * (-1807454463)) + this.x.hashCode()) * 31) + this.y.hashCode();
    }
}
