package defpackage;

import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import j$.time.Duration;

/* loaded from: classes.dex */
public final class ltn implements lth {
    private final eqj A;
    private final eqj B;
    private final eqj C;
    private final eqj D;
    private final eqj E;
    public final eqj a;
    public final eqj b;
    public final eqj c;
    public final eqj d;
    public final eqj e;
    public final eqj f;
    public final eqj g;
    public final eqj h;
    public final eqj i;
    public final eqj j;
    public final eqj k;
    public final eqj l;
    public final eqj m;
    public final eqj n;
    public final eqj o;
    public final eqj p;
    public final eqj q;
    public final eqj r;
    public final eqj s;
    public final eqj t;
    public final eqj u;
    public final eqj v;
    public final eqj w;
    public final eqj x;
    final /* synthetic */ yzz y;
    public final okv z;

    public ltn(eqj eqjVar, eqj eqjVar2, afec afecVar, ltq ltqVar, yzz yzzVar) {
        boolean z;
        eqj eqmVar;
        this.y = yzzVar;
        this.a = eqjVar;
        this.b = eqjVar2;
        int i = 16;
        eqj eqjVarB = eqy.b(eqjVar2, new lta(i));
        this.A = eqjVarB;
        int i2 = 14;
        eqj eqjVarB2 = eqy.b(tby.C(eqjVarB, new lta(10)), new njq(lmd.a, i2));
        this.c = eqjVarB2;
        eqj eqjVarB3 = eqy.b(tby.C(eqjVarB, new lta(i2)), new njq(AaPlaybackState.a, i2));
        this.d = eqjVarB3;
        okv okvVar = (okv) afecVar.invoke(eqjVarB);
        this.z = okvVar;
        int i3 = 15;
        eqj eqjVarB4 = eqy.b(eqjVarB, new njq(new lta(i3), i3));
        this.e = eqjVarB4;
        this.f = eqy.b(eqjVarB4, new lta(17));
        eqj eqjVarA = ltqVar != null ? ltqVar.a(eqjVar, eqjVarB2) : null;
        this.B = eqjVarA;
        String str = "";
        int i4 = 4;
        this.g = eqjVarA != null ? tby.B(eqjVarA, new lta(18)) : eqy.b(eqy.b(eqjVarB2, new lti(i4)), new njq(str, i2));
        int i5 = 5;
        this.h = eqjVarA != null ? tby.B(eqjVarA, new lta(19)) : eqy.b(eqy.b(eqjVarB2, new lti(i5)), new njq(str, i2));
        this.i = eqjVarA != null ? tby.B(eqjVarA, new lta(20)) : eqy.a(eqy.b(eqjVarB2, new lti(6)));
        this.j = eqjVarA != null ? tby.B(eqjVarA, new ltk(1)) : new eqm(null);
        int i6 = 0;
        if (eqjVarA != null) {
            eqmVar = tby.B(eqjVarA, new ltk(i6));
            z = false;
        } else {
            z = false;
            eqmVar = new eqm(gjo.a);
        }
        this.C = eqmVar;
        this.k = eqjVarA != null ? tby.B(eqjVarA, new ltk(2)) : new eqm(afbe.a);
        this.l = eqjVarA != null ? tby.B(eqjVarA, new ltk(3)) : new eqm(null);
        this.m = (eqj) okvVar.b;
        this.n = (eqj) okvVar.d;
        this.o = (eqj) okvVar.c;
        eqj eqjVarA2 = eqy.a(eqy.b(eqjVarB3, new ltk(i4)));
        this.p = eqjVarA2;
        eqj eqjVarB5 = eqy.b(eqjVarB3, new ltk(i5));
        this.D = eqjVarB5;
        affq affqVar = new affq();
        affqVar.a = true;
        this.q = tby.B(eqy.a(eqjVarB5), new ltd(affqVar, i4));
        eqj eqjVarB6 = eqy.b(eqjVarB3, new lta(8));
        this.r = eqjVarB6;
        eqj eqjVarB7 = eqy.b(eqjVarB3, new lta(9));
        this.E = eqjVarB7;
        this.s = eqy.b(tby.C(eqjVarB, new lta(11)), new njq(Boolean.valueOf(z), i2));
        this.t = eqy.b(eqy.b(eqjVar2, new njq(new lta(12), i3)), new njq(lok.c, i2));
        this.u = tby.H(eqjVarB7, eqjVarA2, eqjVarB6, new akh(this, 7));
        eqj eqjVarB8 = eqy.b(eqjVarB2, new lta(13));
        this.v = eqjVarB8;
        eqj eqjVarB9 = tby.B(eqjVarB3, new ado(lto.a, 7));
        ddw ddwVar = new ddw(i);
        eqjVarB8.getClass();
        this.w = new tbn(eqjVarB9, eqjVarB8, ddwVar);
        this.x = acrz.a.gu().q() ? new tbn(eqjVarB3, eqjVarB2, ltl.a) : new eqm(true);
    }

    private static final eqj d(aitx aitxVar, eqj eqjVar, Duration duration, boolean z) {
        return eqy.b(tby.B(eqjVar, new bbb(aitxVar, z, duration, 2)), new njq(new aezu(null, gjo.a), 14));
    }

    @Override // defpackage.lth
    public final eqj a(aitx aitxVar, boolean z) {
        return d(aitxVar, this.i, lto.d, z);
    }

    @Override // defpackage.lth
    public final lkc b() {
        lod lodVar = (lod) this.A.e();
        if (lodVar == null) {
            return null;
        }
        return lodVar.i.d(this.y);
    }

    @Override // defpackage.lth
    public final void c() {
        lkc lkcVarB;
        AaPlaybackState aaPlaybackState = (AaPlaybackState) this.d.e();
        if (aaPlaybackState == null || (lkcVarB = b()) == null) {
            return;
        }
        int iQ = aaPlaybackState.Q();
        if (iQ != 3 && iQ != 6) {
            lkcVarB.c();
            return;
        }
        if (lem.b(aaPlaybackState, 2L) || lem.b(aaPlaybackState, 512L)) {
            lkcVarB.b();
        } else if (lem.b(aaPlaybackState, 1L)) {
            lkcVarB.i();
        }
    }

    @Override // defpackage.lth
    public final eqj e(aitx aitxVar) {
        return d(aitxVar, this.C, lto.e, false);
    }
}
