package R3;

import a1.AbstractC1312b;
import a2.v;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.gms.common.api.internal.H;
import com.google.android.material.datepicker.k;
import j1.AbstractC3076d;
import java.util.ArrayList;
import java.util.List;
import l4.DialogC3391g;
import od.I0;
import od.W0;
import pd.j;
import y1.AbstractC4524e;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10228a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10229b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10230c;

    public /* synthetic */ c(Object obj, int i5, int i10) {
        this.f10228a = i10;
        this.f10230c = obj;
        this.f10229b = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10228a) {
            case 0:
                ((SystemForegroundService) this.f10230c).f19088e.cancel(this.f10229b);
                return;
            case 1:
                ((H) this.f10230c).f(this.f10229b);
                return;
            case 2:
                ((k) this.f10230c).f26922h.smoothScrollToPosition(this.f10229b);
                return;
            case 3:
                AbstractC1312b abstractC1312b = (AbstractC1312b) ((v) this.f10230c).f17322b;
                if (abstractC1312b != null) {
                    abstractC1312b.j(this.f10229b);
                    return;
                }
                return;
            case 4:
                DialogC3391g dialogC3391g = (DialogC3391g) ((E9.d) this.f10230c).f3605b;
                dialogC3391g.f39993h.requestFocus();
                dialogC3391g.f39988c.f39985z.scrollToPosition(this.f10229b);
                return;
            case 5:
                j jVar = (j) this.f10230c;
                try {
                    Xd.b.c();
                    try {
                        Xd.a aVar = Xd.b.f16226a;
                        aVar.getClass();
                        W0 w02 = jVar.f41870a;
                        int i5 = this.f10229b;
                        w02.getClass();
                        Fe.e.p("numMessages must be > 0", i5 > 0);
                        if (!w02.isClosed()) {
                            w02.f41836m += i5;
                            w02.a();
                        }
                        aVar.getClass();
                        return;
                    } finally {
                    }
                } catch (Throwable th) {
                    jVar.n(th);
                    return;
                }
            case 6:
                ((I0) this.f10230c).f41594f.c(this.f10229b);
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f10230c;
                int size = arrayList.size();
                int i10 = 0;
                if (this.f10229b != 1) {
                    while (i10 < size) {
                        ((AbstractC4524e) arrayList.get(i10)).a();
                        i10++;
                    }
                    return;
                } else {
                    while (i10 < size) {
                        ((AbstractC4524e) arrayList.get(i10)).b();
                        i10++;
                    }
                    return;
                }
        }
    }

    public c(List list, int i5, Throwable th) {
        this.f10228a = 7;
        AbstractC3076d.d(list, "initCallbacks cannot be null");
        this.f10230c = new ArrayList(list);
        this.f10229b = i5;
    }
}
