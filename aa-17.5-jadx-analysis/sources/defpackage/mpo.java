package defpackage;

import android.util.ArrayMap;
import com.google.android.gms.car.display.CarDisplayId;
import java.util.Map;

/* loaded from: classes.dex */
public final class mpo implements mpy {
    public static final /* synthetic */ int a = 0;
    private final nsg b = new mpn();
    private final Map c = new ArrayMap();

    static {
        yph.c("GH.ALCUpdater");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mpy
    public final void a() {
        wer.c();
        yph yphVar = nsr.a;
        yfq yfqVarE = ((nsr) mki.a.i(nsr.class)).e();
        int size = yfqVarE.size();
        for (int i = 0; i < size; i++) {
            nso nsoVar = (nso) yfqVarE.get(i);
            nsoVar.w(this.b);
            noe noeVar = new noe(nsoVar, 1);
            this.c.put(nsoVar, noeVar);
            nsoVar.x(nsn.a, noeVar);
            if (CarDisplayId.a.equals(nsoVar.o)) {
                nsoVar.x(nsn.s, noeVar);
                nsoVar.x(nsn.t, noeVar);
            }
        }
    }

    @Override // defpackage.lhg
    @Deprecated
    public final void c() {
        kio.b().e();
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mpy, defpackage.lhg
    public final void d() {
        wer.c();
        yfq yfqVarE = nsr.c().e();
        int size = yfqVarE.size();
        for (int i = 0; i < size; i++) {
            nso nsoVar = (nso) yfqVarE.get(i);
            nsoVar.A(this.b);
            nsk nskVar = (nsk) this.c.remove(nsoVar);
            nskVar.getClass();
            nsoVar.B(nsn.a, nskVar);
            nsoVar.B(nsn.s, nskVar);
            nsoVar.B(nsn.t, nskVar);
        }
    }
}
