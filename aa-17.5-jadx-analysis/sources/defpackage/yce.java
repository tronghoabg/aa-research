package defpackage;

import com.google.android.apps.auto.components.connectivity.impl.ConnectivityEventHandlerImpl;
import j$.util.stream.Collector;
import java.util.LinkedHashMap;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public final /* synthetic */ class yce implements Supplier {
    private final /* synthetic */ int a;

    public /* synthetic */ yce(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.a;
        if (i == 0) {
            int i2 = yfq.d;
            return new yfl(4);
        }
        if (i == 1) {
            yph yphVar = ConnectivityEventHandlerImpl.a;
            return Boolean.valueOf(!lds.a().c());
        }
        if (i == 2) {
            return new ygp();
        }
        if (i == 3) {
            ygo ygoVar = ygo.a;
            return new oct((char[]) null, (char[]) null);
        }
        if (i != 4) {
            return i != 5 ? new LinkedHashMap() : new yfu(4);
        }
        Collector collector = ycm.a;
        return new ycl(new ycf(6));
    }
}
