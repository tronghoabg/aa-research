package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class ajo extends cfx implements cwk {
    public final ase a;
    public boolean b;
    public boolean c;
    public boolean d;

    public ajo(ase aseVar) {
        this.a = aseVar;
    }

    @Override // defpackage.cwk
    public final void b(cxd cxdVar) {
        cxdVar.q();
        if (this.b) {
            czz.I(cxdVar, cjv.h(-72057594037927936L, 0.3f), 0L, cxdVar.o(), BitmapDescriptorFactory.HUE_RED, null, 122);
        } else if (this.c || this.d) {
            czz.I(cxdVar, cjv.h(-72057594037927936L, 0.1f), 0L, cxdVar.o(), BitmapDescriptorFactory.HUE_RED, null, 122);
        }
    }

    @Override // defpackage.cfx
    public final void er() {
        ahnc.d(N(), null, 0, new ada(this, (afck) null, 4), 3);
    }

    @Override // defpackage.cwk
    public final /* synthetic */ void a() {
    }
}
