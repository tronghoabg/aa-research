package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class dda implements cga {
    public static final dda b = new dda();

    @Override // defpackage.cga
    public final float a() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.afco
    public final <R> R fold(R r, afeg<? super R, ? super afcm, ? extends R> afegVar) {
        return afegVar.invoke(r, this);
    }

    @Override // defpackage.afcm, defpackage.afco
    public final <E extends afcm> E get(afcn<E> afcnVar) {
        return (E) affa.t(this, afcnVar);
    }

    @Override // defpackage.afcm
    public final /* synthetic */ afcn getKey() {
        return cga.a;
    }

    @Override // defpackage.afco
    public final afco minusKey(afcn<?> afcnVar) {
        return affa.u(this, afcnVar);
    }

    @Override // defpackage.afco
    public final afco plus(afco afcoVar) {
        return affa.v(this, afcoVar);
    }
}
