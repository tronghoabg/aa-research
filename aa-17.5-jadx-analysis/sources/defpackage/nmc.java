package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class nmc implements afec {
    public final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ nmc(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i = this.b;
        float f = BitmapDescriptorFactory.HUE_RED;
        if (i == 0) {
            ((abh) obj).getClass();
            boolean z = this.a;
            return new aby(acl.B(z ? ca.F(200, 0, null, 6) : new afr(0), 2), acl.C(z ? ca.F(200, 0, null, 6) : new afr(0), 2), BitmapDescriptorFactory.HUE_RED, 12);
        }
        cks cksVar = (cks) obj;
        yph yphVar = nhm.a;
        cksVar.getClass();
        if (true == this.a) {
            f = 1.0f;
        }
        cksVar.o(f);
        return afak.a;
    }
}
