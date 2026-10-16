package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class bjr implements afec {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ bjr(afdr afdrVar, boolean z, cjj cjjVar, cjw cjwVar, int i) {
        this.e = i;
        this.b = afdrVar;
        this.a = z;
        this.d = cjjVar;
        this.c = cjwVar;
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        if (this.e != 0) {
            boolean z = this.a;
            ((cun) obj).w(new bbb((List) this.c, (List) this.b, z, 1));
            this.d.a();
            return afak.a;
        }
        cxd cxdVar = (cxd) obj;
        cxdVar.q();
        if (((Boolean) this.b.invoke()).booleanValue()) {
            Object obj2 = this.c;
            Object obj3 = this.d;
            if (this.a) {
                long jN = cxdVar.n();
                cma cmaVarR = cxdVar.r();
                long jA = cmaVarR.a();
                cmaVarR.b().g();
                try {
                    cmaVarR.c.k(-1.0f, 1.0f, jN);
                    czz.K(cxdVar, (cjj) obj3, 0L, BitmapDescriptorFactory.HUE_RED, (cjw) obj2, 0, 46);
                } finally {
                    cmaVarR.b().e();
                    cmaVarR.h(jA);
                }
            } else {
                czz.K(cxdVar, (cjj) obj3, 0L, BitmapDescriptorFactory.HUE_RED, (cjw) obj2, 0, 46);
            }
        }
        return afak.a;
    }

    public /* synthetic */ bjr(bwq bwqVar, List list, List list2, boolean z, int i) {
        this.e = i;
        this.d = bwqVar;
        this.c = list;
        this.b = list2;
        this.a = z;
    }
}
