package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class cff implements cay, afcm {
    public static final cfe a = new cfe();
    public final bwc b;

    public cff(bwc bwcVar) {
        this.b = bwcVar;
    }

    @Override // defpackage.cay
    public final boolean a() {
        return ((bvv) this.b).k;
    }

    @Override // defpackage.cay
    public final List b() {
        return this.b.T();
    }

    public final void c(Throwable th, Object obj) {
        vh.a(th, new bsh(this, obj, 3, null));
    }

    @Override // defpackage.afco
    public final <R> R fold(R r, afeg<? super R, ? super afcm, ? extends R> afegVar) {
        return afegVar.invoke(r, this);
    }

    @Override // defpackage.afcm, defpackage.afco
    public final /* bridge */ <E extends afcm> E get(afcn<E> afcnVar) {
        return (E) affa.t(this, afcnVar);
    }

    @Override // defpackage.afcm
    public final afcn<?> getKey() {
        return a;
    }

    @Override // defpackage.afco
    public final /* bridge */ afco minusKey(afcn<?> afcnVar) {
        return affa.u(this, afcnVar);
    }

    @Override // defpackage.afco
    public final afco plus(afco afcoVar) {
        afcoVar.getClass();
        return affa.w(this, afcoVar);
    }
}
