package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class bkp implements afdr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bkp(int i, afdr afdrVar, int i2) {
        this.c = i2;
        this.a = i;
        this.b = afdrVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [afdr, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() {
        if (this.c == 0) {
            return Integer.valueOf(((bkh) this.b).d.g(this.a));
        }
        bbu bbuVar = bbv.a;
        return new baq(this.a, BitmapDescriptorFactory.HUE_RED, this.b);
    }

    public /* synthetic */ bkp(bkh bkhVar, int i, int i2) {
        this.c = i2;
        this.b = bkhVar;
        this.a = i;
    }
}
