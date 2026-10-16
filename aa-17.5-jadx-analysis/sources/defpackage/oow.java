package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class oow implements PointerInputEventHandler {
    final /* synthetic */ boolean a;
    final /* synthetic */ bym b;
    final /* synthetic */ bwq c;
    final /* synthetic */ int d;
    final /* synthetic */ axr e;
    final /* synthetic */ afeg f;
    final /* synthetic */ byd g;
    final /* synthetic */ byb h;
    final /* synthetic */ byd i;
    final /* synthetic */ kwp j;

    public oow(boolean z, kwp kwpVar, bym bymVar, byd bydVar, byb bybVar, bwq bwqVar, int i, axr axrVar, afeg afegVar, byd bydVar2) {
        this.a = z;
        this.j = kwpVar;
        this.b = bymVar;
        this.g = bydVar;
        this.h = bybVar;
        this.c = bwqVar;
        this.d = i;
        this.e = axrVar;
        this.f = afegVar;
        this.i = bydVar2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(cqz cqzVar, afck<? super afak> afckVar) {
        final boolean z = this.a;
        final kwp kwpVar = this.j;
        final bym bymVar = this.b;
        final byd bydVar = this.g;
        final byb bybVar = this.h;
        final bwq bwqVar = this.c;
        Object objAK = ca.aK(cqzVar, new anx(new afec() { // from class: oov
            @Override // defpackage.afec
            public final Object invoke(Object obj) {
                if (z) {
                    return afak.a;
                }
                bwq bwqVar2 = bwqVar;
                byb bybVar2 = bybVar;
                byd bydVar2 = bydVar;
                bym bymVar2 = bymVar;
                kwpVar.q(0);
                bydVar2.h(((Number) bymVar2.a()).intValue());
                bybVar2.h(BitmapDescriptorFactory.HUE_RED);
                bwqVar2.b(Boolean.valueOf(true));
                return afak.a;
            }
        }, new oot(bwqVar, bybVar, 2), new oot(bwqVar, bybVar, 3), new hfp(this.d, this.e, this.f, kwpVar, bybVar, this.i, bydVar, bymVar, 5), null), afckVar);
        return objAK == afcr.a ? objAK : afak.a;
    }
}
