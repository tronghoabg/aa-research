package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import j$.util.Objects;

/* loaded from: classes2.dex */
public class moc implements moa {
    public static final yph h = yph.c("GH.StreamItem");
    public static final mny i = mny.b;
    private final int a;
    private final mnz b;
    private final yzr c;
    private final yzq d;
    private final long e;
    private final int f;
    private final CharSequence g;
    public final yzr j;
    public final long k;
    public final String l;
    public final CharSequence m;
    public final Bitmap n;
    public final Uri o;
    public Long p;
    public int q;
    public boolean r;
    public String s;
    private final CharSequence t;
    private final int u;
    private final Uri v;
    private final int w;
    private final int x;
    private final mny y;
    private final int z;

    public moc(mob mobVar) {
        this.k = mobVar.h;
        yzr yzrVar = mobVar.j;
        yzr yzrVar2 = yzr.UNKNOWN;
        woy.N(yzrVar != yzrVar2);
        this.j = mobVar.j;
        yzr yzrVar3 = mobVar.k;
        this.c = yzrVar3 == yzrVar2 ? mobVar.j : yzrVar3;
        this.d = mobVar.l;
        this.l = mobVar.i;
        this.e = mobVar.m;
        this.f = mobVar.n;
        this.r = mobVar.o;
        this.q = mobVar.p;
        this.s = mobVar.q;
        this.y = mobVar.r;
        this.m = mobVar.s;
        this.g = mobVar.t;
        this.t = mobVar.u;
        this.a = mobVar.v;
        this.z = mobVar.D;
        this.w = mobVar.w;
        this.x = mobVar.x;
        this.u = mobVar.y;
        this.n = mobVar.z;
        this.v = mobVar.A;
        this.o = mobVar.B;
        mnz mnzVar = mobVar.C;
        this.b = mnzVar;
        if (mnzVar != null) {
            mnzVar.c = this;
        }
    }

    @Override // defpackage.moa
    public final long A() {
        return this.k;
    }

    @Override // defpackage.moa
    public final long B() {
        return this.e;
    }

    @Override // defpackage.moa
    public final Bitmap C() {
        return this.n;
    }

    @Override // defpackage.moa
    public final Uri D() {
        return this.v;
    }

    @Override // defpackage.moa
    public final Uri E() {
        return this.o;
    }

    @Override // defpackage.moa
    public final mny F() {
        return this.y;
    }

    @Override // defpackage.moa
    public final mnz G() {
        return this.b;
    }

    @Override // defpackage.moa
    public final yzq H() {
        return this.d;
    }

    @Override // defpackage.moa
    public final yzr I() {
        return this.c;
    }

    @Override // defpackage.moa
    public final yzr J() {
        return this.j;
    }

    @Override // defpackage.moa
    public final CharSequence K() {
        return this.m;
    }

    @Override // defpackage.moa
    public final CharSequence L() {
        return this.g;
    }

    @Override // defpackage.moa
    public final CharSequence M() {
        return this.t;
    }

    @Override // defpackage.moa
    public final Long N() {
        return this.p;
    }

    @Override // defpackage.moa
    public final String O() {
        return this.l;
    }

    @Override // defpackage.moa
    public final String P() {
        return this.s;
    }

    @Override // defpackage.moa
    public final void Q(int i2) {
        this.q = i2;
    }

    @Override // defpackage.moa
    public final void R(boolean z) {
        this.r = z;
    }

    @Override // defpackage.moa
    public final void S(String str) {
        this.s = str;
    }

    @Override // defpackage.moa
    public final boolean T() {
        return this.r;
    }

    @Override // defpackage.moa
    public final int V() {
        return this.z;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof moc)) {
            return false;
        }
        moc mocVar = (moc) obj;
        return this.k == mocVar.k && this.j == mocVar.j;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.k), this.j);
    }

    public String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, this.j.name());
        xxgVarAo.g("id", this.k);
        xxgVarAo.b("contentId", this.p);
        return xxgVarAo.toString();
    }

    @Override // defpackage.moa
    public final int u() {
        return this.a;
    }

    @Override // defpackage.moa
    public final int v() {
        return this.w;
    }

    @Override // defpackage.moa
    public final int w() {
        int i2 = this.f;
        if (i2 > 0) {
            return i2;
        }
        return 8000;
    }

    @Override // defpackage.moa
    public final int x() {
        return this.q;
    }

    @Override // defpackage.moa
    public final int y() {
        return this.x;
    }

    @Override // defpackage.moa
    public final int z() {
        return this.u;
    }

    @Override // defpackage.moa
    public final void U() {
    }

    @Override // defpackage.moa
    public final void W() {
    }

    @Override // defpackage.moa
    public final void X() {
    }

    @Override // defpackage.moa
    public final void Y() {
    }
}
