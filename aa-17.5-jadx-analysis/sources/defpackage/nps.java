package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class nps extends afda {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ ugn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nps(ugn ugnVar, afck afckVar) {
        super(afckVar);
        this.c = ugnVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        Object objD = this.c.d(BitmapDescriptorFactory.HUE_RED, this);
        return objD == afcr.a ? objD : new aezw(objD);
    }
}
