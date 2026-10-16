package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class abk implements abh {
    public final agg a;
    public cfn b;
    public dlr c;
    public final bwq d = new ParcelableSnapshotMutableState(new dlq(0), bxp.c);
    public bym e;
    public final aan f;

    public final class a<S> extends cxt<abm<S>> {
        private final agb a;
        private final bym b;
        private final abk c;

        public a(agb agbVar, bym bymVar, abk abkVar) {
            this.a = agbVar;
            this.b = bymVar;
            this.c = abkVar;
        }

        @Override // defpackage.cxt
        public final /* bridge */ /* synthetic */ cfx d() {
            return new abm(this.a, this.b, this.c);
        }

        @Override // defpackage.cxt
        public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
            abm abmVar = (abm) cfxVar;
            abmVar.a = this.a;
            abmVar.b = this.b;
            abmVar.c = this.c;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return affa.f(aVar.a, this.a) && affa.f(aVar.b, this.b);
        }

        public final int hashCode() {
            int iHashCode = this.c.hashCode() * 31;
            agb agbVar = this.a;
            return ((iHashCode + (agbVar != null ? agbVar.hashCode() : 0)) * 31) + this.b.hashCode();
        }
    }

    public abk(agg aggVar, cfn cfnVar, dlr dlrVar) {
        this.a = aggVar;
        this.b = cfnVar;
        this.c = dlrVar;
        long[] jArr = aao.a;
        this.f = new aan(6);
    }

    private final boolean i() {
        if (defpackage.a.Y(4, 0)) {
            return true;
        }
        if (defpackage.a.Y(4, 4) && this.c == dlr.a) {
            return true;
        }
        return defpackage.a.Y(4, 5) && this.c == dlr.b;
    }

    private final boolean j() {
        if (defpackage.a.Y(4, 1)) {
            return true;
        }
        if (defpackage.a.Y(4, 4) && this.c == dlr.b) {
            return true;
        }
        return defpackage.a.Y(4, 5) && this.c == dlr.a;
    }

    @Override // defpackage.abh
    public final acp a(aew aewVar, afec afecVar) {
        if (i()) {
            return acl.d(aewVar, new abi(afecVar, this, 1));
        }
        if (j()) {
            return acl.d(aewVar, new abi(afecVar, this, 0));
        }
        int i = 2;
        if (defpackage.a.Y(4, 2)) {
            return acl.e(aewVar, new abi(afecVar, this, i));
        }
        return defpackage.a.Y(4, 3) ? acl.e(aewVar, new abi(afecVar, this, 3)) : acp.a;
    }

    @Override // defpackage.abh
    public final acq b(aew aewVar, afec afecVar) {
        byte[] bArr = null;
        return i() ? acl.i(aewVar, new abi(this, afecVar, 4, bArr)) : j() ? acl.i(aewVar, new abi(this, afecVar, 5, bArr)) : defpackage.a.Y(4, 2) ? acl.j(aewVar, new abi(this, afecVar, 6, bArr)) : defpackage.a.Y(4, 3) ? acl.j(aewVar, new abi(this, afecVar, 7, bArr)) : acq.a;
    }

    @Override // defpackage.abh
    public final void c(aby abyVar, adi adiVar) {
        abyVar.d = adiVar;
    }

    public final long d(long j, long j2) {
        return this.b.a(j, j2, dlr.a);
    }

    public final long e() {
        bym bymVar = this.e;
        return bymVar != null ? ((dlq) bymVar.a()).a : ((dlq) this.d.a()).a;
    }

    @Override // defpackage.agc
    public final Object f() {
        return this.a.d().f();
    }

    @Override // defpackage.agc
    public final Object g() {
        return this.a.d().g();
    }

    @Override // defpackage.agc
    public final /* synthetic */ boolean h(Object obj, Object obj2) {
        return afp.s(this, obj, obj2);
    }
}
