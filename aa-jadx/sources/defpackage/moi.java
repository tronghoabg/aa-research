package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class moi implements defpackage.mog {
    public static final defpackage.yqm h = defpackage.yqm.c("GH.StreamItem");
    public static final defpackage.moe i = defpackage.moe.b;
    private final int a;
    private final defpackage.mof b;
    private final defpackage.zaw c;
    private final defpackage.zav d;
    private final long e;
    private final int f;
    private final java.lang.CharSequence g;
    public final defpackage.zaw j;
    public final long k;
    public final java.lang.String l;
    public final java.lang.CharSequence m;
    public final android.graphics.Bitmap n;
    public final android.net.Uri o;
    public java.lang.Long p;
    public int q;
    public boolean r;
    public java.lang.String s;
    private final java.lang.CharSequence t;
    private final int u;
    private final android.net.Uri v;
    private final int w;
    private final int x;
    private final defpackage.moe y;
    private final int z;

    public moi(defpackage.moh mohVar) {
        this.k = mohVar.h;
        defpackage.zaw zawVar = mohVar.j;
        defpackage.zaw zawVar2 = defpackage.zaw.UNKNOWN;
        defpackage.ysr.aX(zawVar != zawVar2);
        this.j = mohVar.j;
        defpackage.zaw zawVar3 = mohVar.k;
        this.c = zawVar3 == zawVar2 ? mohVar.j : zawVar3;
        this.d = mohVar.l;
        this.l = mohVar.i;
        this.e = mohVar.m;
        this.f = mohVar.n;
        this.r = mohVar.o;
        this.q = mohVar.p;
        this.s = mohVar.q;
        this.y = mohVar.r;
        this.m = mohVar.s;
        this.g = mohVar.t;
        this.t = mohVar.u;
        this.a = mohVar.v;
        this.z = mohVar.D;
        this.w = mohVar.w;
        this.x = mohVar.x;
        this.u = mohVar.y;
        this.n = mohVar.z;
        this.v = mohVar.A;
        this.o = mohVar.B;
        defpackage.mof mofVar = mohVar.C;
        this.b = mofVar;
        if (mofVar != null) {
            mofVar.c = this;
        }
    }

    @Override // defpackage.mog
    public final long A() {
        return this.k;
    }

    @Override // defpackage.mog
    public final long B() {
        return this.e;
    }

    @Override // defpackage.mog
    public final android.graphics.Bitmap C() {
        return this.n;
    }

    @Override // defpackage.mog
    public final android.net.Uri D() {
        return this.v;
    }

    @Override // defpackage.mog
    public final android.net.Uri E() {
        return this.o;
    }

    @Override // defpackage.mog
    public final defpackage.moe F() {
        return this.y;
    }

    @Override // defpackage.mog
    public final defpackage.mof G() {
        return this.b;
    }

    @Override // defpackage.mog
    public final defpackage.zav H() {
        return this.d;
    }

    @Override // defpackage.mog
    public final defpackage.zaw I() {
        return this.c;
    }

    @Override // defpackage.mog
    public final defpackage.zaw J() {
        return this.j;
    }

    @Override // defpackage.mog
    public final java.lang.CharSequence K() {
        return this.m;
    }

    @Override // defpackage.mog
    public final java.lang.CharSequence L() {
        return this.g;
    }

    @Override // defpackage.mog
    public final java.lang.CharSequence M() {
        return this.t;
    }

    @Override // defpackage.mog
    public final java.lang.Long N() {
        return this.p;
    }

    @Override // defpackage.mog
    public final java.lang.String O() {
        return this.l;
    }

    @Override // defpackage.mog
    public final java.lang.String P() {
        return this.s;
    }

    @Override // defpackage.mog
    public final void Q(int i2) {
        this.q = i2;
    }

    @Override // defpackage.mog
    public final void R(boolean z) {
        this.r = z;
    }

    @Override // defpackage.mog
    public final void S(java.lang.String str) {
        this.s = str;
    }

    @Override // defpackage.mog
    public final boolean T() {
        return this.r;
    }

    @Override // defpackage.mog
    public final int V() {
        return this.z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof defpackage.moi)) {
            return false;
        }
        defpackage.moi moiVar = (defpackage.moi) obj;
        return this.k == moiVar.k && this.j == moiVar.j;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(java.lang.Long.valueOf(this.k), this.j);
    }

    public java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b(com.google.android.sidekick.shared.remoteapi.RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, this.j.name());
        xymVarBy.g("id", this.k);
        xymVarBy.b("contentId", this.p);
        return xymVarBy.toString();
    }

    @Override // defpackage.mog
    public final int u() {
        return this.a;
    }

    @Override // defpackage.mog
    public final int v() {
        return this.w;
    }

    @Override // defpackage.mog
    public final int w() {
        int i2 = this.f;
        if (i2 > 0) {
            return i2;
        }
        return 8000;
    }

    @Override // defpackage.mog
    public final int x() {
        return this.q;
    }

    @Override // defpackage.mog
    public final int y() {
        return this.x;
    }

    @Override // defpackage.mog
    public final int z() {
        return this.u;
    }

    @Override // defpackage.mog
    public final void U() {
    }

    @Override // defpackage.mog
    public final void W() {
    }

    @Override // defpackage.mog
    public final void X() {
    }

    @Override // defpackage.mog
    public final void Y() {
    }
}
