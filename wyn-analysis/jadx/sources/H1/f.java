package h1;

import j1.InterfaceC3073a;
import java.util.ArrayList;
import x.C4429v;

/* loaded from: classes.dex */
public final class f implements InterfaceC3073a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35951b;

    public /* synthetic */ f(Object obj, int i5) {
        this.f35950a = i5;
        this.f35951b = obj;
    }

    @Override // j1.InterfaceC3073a
    public final void accept(Object obj) {
        switch (this.f35950a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((X2.j) this.f35951b).X(gVar);
                return;
            default:
                g gVar2 = (g) obj;
                synchronized (h.f35956c) {
                    try {
                        C4429v c4429v = h.f35957d;
                        ArrayList arrayList = (ArrayList) c4429v.get((String) this.f35951b);
                        if (arrayList == null) {
                            return;
                        }
                        c4429v.remove((String) this.f35951b);
                        for (int i5 = 0; i5 < arrayList.size(); i5++) {
                            ((InterfaceC3073a) arrayList.get(i5)).accept(gVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
