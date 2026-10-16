package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class gsi extends afde implements afei {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ gsj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsi(gsj gsjVar, afck afckVar) {
        super(4, afckVar);
        this.d = gsjVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        gtl gtlVar;
        woy.dF(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        gsj gsjVar = this.d;
        gsh gshVar = gsjVar.b;
        boolean z = (gshVar == null || affa.f(obj2, gshVar)) ? false : true;
        gsjVar.b = (gsh) obj2;
        geu geuVar = gsjVar.a;
        gva gvaVarF = null;
        gbg gbgVarC = gax.c(geuVar, R.drawable.gs_list_vd_theme_24, null);
        if (obj3 != null && (gtlVar = ((gta) obj3).b) != null) {
            gvaVarF = gum.f(gtlVar, geuVar, true);
        }
        return new gsk(gvaVarF, hgg.c(geuVar, (gzc) obj4), new hge(new hgd(new dlj(BitmapDescriptorFactory.HUE_RED), new dlj(BitmapDescriptorFactory.HUE_RED)), 13), new gbz(gsjVar, 13), gbgVarC, z);
    }

    @Override // defpackage.afei
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        gsi gsiVar = new gsi(this.d, (afck) obj4);
        gsiVar.a = (gsh) obj;
        gsiVar.b = (gta) obj2;
        gsiVar.c = (gzc) obj3;
        return gsiVar.hT(afak.a);
    }
}
