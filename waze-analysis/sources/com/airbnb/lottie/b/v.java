package com.airbnb.lottie.b;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.waze.c.e.bk;
import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f2079a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f2080b;

    public /* synthetic */ v(Object obj, int i2) {
        this.f2080b = i2;
        this.f2079a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v23, types: [androidx.datastore.core.DataStore, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f2080b) {
            case 0:
                w wVar = (w) this.f2079a;
                break;
            case 1:
                break;
            case 2:
                w wVar2 = (w) this.f2079a;
                if (wVar2.getValue() == null && wVar2.b() == null) {
                    z = false;
                }
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                ((com.waze.q.l) this.f2079a).f();
                break;
            case 8:
                break;
            case 9:
                int i2 = ar.f48106a;
                break;
            case 10:
                com.waze.a.h hVar = com.waze.a.h.f13638a;
                com.waze.app_nav.hub.b.c.f15258a.a().c((com.waze.app_nav.hub.b.k) this.f2079a);
                break;
            case 11:
                com.waze.a.h hVar2 = com.waze.a.h.f13638a;
                com.waze.app_nav.hub.b.c.f15258a.a().c((com.waze.app_nav.hub.b.k) this.f2079a);
                break;
            case 12:
                ViewModelProvider viewModelProvider = new ViewModelProvider((ViewModelStoreOwner) this.f2079a);
                int i3 = ar.f48106a;
                break;
            case 13:
                ((com.waze.a.e) this.f2079a).c(com.waze.a.a.f.f13590a);
                break;
            case 14:
                ((com.waze.a.e) this.f2079a).c(com.waze.a.a.g.f13591a);
                break;
            case 15:
                ((com.waze.a.e) this.f2079a).c(com.waze.a.a.f.f13590a);
                break;
            case 16:
                ((com.waze.a.e) this.f2079a).c(com.waze.a.a.g.f13591a);
                break;
            case 17:
                ((com.waze.c.e.al) this.f2079a).g();
                break;
            case 18:
                ((com.waze.c.e.al) this.f2079a).d().e(com.waze.ui.b.o.f42079a);
                break;
            case 19:
                ((com.waze.c.e.al) this.f2079a).g();
                break;
            default:
                ((bk) this.f2079a).q();
                break;
        }
        return h.ab.f48028a;
    }
}
