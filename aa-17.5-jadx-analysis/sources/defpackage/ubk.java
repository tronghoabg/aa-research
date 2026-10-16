package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes3.dex */
final class ubk {
    final yfq a;
    final yfq b;
    public final uwk c;
    final yfq d;
    public final tpf e = new tpf();
    public double f;
    public float g;
    public final float h;
    public final float i;
    public nzj j;

    public ubk(ubm ubmVar, List list, List list2, List list3, List list4, List list5) {
        this.a = yfq.o(list);
        this.d = yfq.o(list5);
        yfq.o(list2);
        yfq.o(list3);
        this.b = yfq.o(list4);
        ufa ufaVar = ubmVar.h;
        this.c = ufaVar == null ? null : ufaVar.a();
        this.h = ubmVar.c();
        this.i = ubmVar.a();
    }

    public final void a() {
        ubm.f(this.a);
        ubm.f(this.b);
        uwk uwkVar = this.c;
        if (uwkVar != null) {
            uwkVar.c();
        }
    }

    public final boolean b() {
        yfq yfqVar = this.d;
        if (yfqVar.isEmpty()) {
            return false;
        }
        return yfqVar.size() == this.a.size();
    }

    public ubk() {
        int i = yfq.d;
        yfq yfqVar = yls.a;
        this.a = yfqVar;
        this.d = yfqVar;
        this.b = yfqVar;
        this.c = null;
        this.h = BitmapDescriptorFactory.HUE_RED;
        this.i = BitmapDescriptorFactory.HUE_RED;
    }
}
