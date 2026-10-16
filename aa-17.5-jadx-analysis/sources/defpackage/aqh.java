package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class aqh implements apr {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public aqh(amq amqVar, amu amuVar, int i) {
        this.c = i;
        this.b = amqVar;
        this.a = amuVar;
    }

    @Override // defpackage.apr
    public final float a(float f) {
        if (this.c != 0) {
            amq amqVar = (amq) this.b;
            float fC = amqVar.a.c(f);
            float fB = fC - amqVar.a.b();
            ((amu) this.a).a(fC, BitmapDescriptorFactory.HUE_RED);
            return fB;
        }
        if (Math.abs(f) != BitmapDescriptorFactory.HUE_RED && !((Boolean) ((aqk) this.a).e.invoke()).booleanValue()) {
            throw new aon();
        }
        Object obj = this.a;
        aqk aqkVar = (aqk) obj;
        return aqkVar.a(aqkVar.b(((izj) this.b).o(aqkVar.d(aqkVar.f(f)), 2)));
    }

    public aqh(aqk aqkVar, izj izjVar, int i) {
        this.c = i;
        this.a = aqkVar;
        this.b = izjVar;
    }
}
