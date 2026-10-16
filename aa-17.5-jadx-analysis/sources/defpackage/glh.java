package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class glh implements afec {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ glh(Object obj, boolean z, int i) {
        this.c = i;
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, uo] */
    /* JADX WARN: Type inference failed for: r8v14, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, xc] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        switch (this.c) {
            case 0:
                gej gejVar = (gej) obj;
                gejVar.getClass();
                this.b.sendCheckedChange(this.a, gejVar);
                break;
            case 1:
                boolean z = this.a;
                dec decVar = (dec) obj;
                float f = bqh.a;
                if (!z) {
                    daq.c(decVar);
                }
                Object obj2 = this.b;
                decVar.a(ddx.b, String.valueOf(afgi.k(((bqj) obj2).c() * 100.0f) / 100.0f));
                decVar.a(ddq.i, new ddf(null, new bml(obj2, 6)));
                break;
            case 2:
                gej gejVar2 = (gej) obj;
                gejVar2.getClass();
                this.b.sendPanModeChanged(this.a, gejVar2);
                break;
            case 3:
                giz gizVar = (giz) obj;
                gizVar.getClass();
                break;
            case 4:
                cun cunVar = (cun) obj;
                cunVar.getClass();
                Iterator it = this.b.iterator();
                int i = 0;
                while (it.hasNext()) {
                    int iMax = 0;
                    for (cuo cuoVar : (List) it.next()) {
                        boolean z2 = this.a;
                        iMax = Math.max(iMax, mtl.f(cuoVar, z2));
                        if (z2) {
                            cunVar.r(cuoVar, i, 0, BitmapDescriptorFactory.HUE_RED);
                        } else {
                            cunVar.r(cuoVar, 0, i, BitmapDescriptorFactory.HUE_RED);
                        }
                    }
                    i += iMax;
                }
                break;
            case 5:
                break;
            case 6:
                yph yphVar = myi.a;
                ((czz) obj).getClass();
                if (this.a) {
                    ?? r8 = this.b;
                    r8.invoke(true);
                    break;
                } else {
                    break;
                }
            case 7:
                cie cieVar = (cie) obj;
                yph yphVar2 = nhm.a;
                cieVar.getClass();
                boolean z3 = this.a;
                Object obj3 = this.b;
                if (z3) {
                    cil cilVar = (cil) obj3;
                    cieVar.h(cilVar);
                    cieVar.d(cilVar);
                } else {
                    cil cilVar2 = (cil) obj3;
                    cieVar.e(cilVar2);
                    cieVar.i(cilVar2);
                }
                break;
            default:
                ImageView imageView = (ImageView) obj;
                imageView.getClass();
                Drawable drawable = imageView.getDrawable();
                drawable.getClass();
                nyn nynVar = (nyn) drawable;
                nep nepVar = (nep) this.b;
                nynVar.a(nepVar.a);
                nynVar.b(nepVar.a());
                nynVar.c(this.a);
                break;
        }
        return afak.a;
    }

    public /* synthetic */ glh(boolean z, Object obj, int i) {
        this.c = i;
        this.a = z;
        this.b = obj;
    }
}
