package defpackage;

import android.graphics.Path;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class auv implements afec {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ auv(int i, cuo cuoVar, int i2, int i3) {
        this.d = i3;
        this.a = i;
        this.c = cuoVar;
        this.b = i2;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i = this.d;
        if (i == 0) {
            ((cun) obj).r((cuo) this.c, this.a, this.b, BitmapDescriptorFactory.HUE_RED);
            return afak.a;
        }
        if (i == 1) {
            int i2 = this.b;
            ((cun) obj).y((cuo) this.c, this.a, i2, cup.a);
            return afak.a;
        }
        if (i == 2) {
            ((cun) obj).r((cuo) this.c, this.a, this.b, BitmapDescriptorFactory.HUE_RED);
            return afak.a;
        }
        if (i == 3) {
            ((cun) obj).r((cuo) this.c, afgi.k((this.a - r0.a) / 2.0f), afgi.k((this.b - r0.b) / 2.0f), BitmapDescriptorFactory.HUE_RED);
            return afak.a;
        }
        if (i != 4) {
            cun cunVar = (cun) obj;
            yph yphVar = nhm.a;
            cunVar.getClass();
            cuo cuoVar = (cuo) this.c;
            cunVar.x(cuoVar, (this.a - cuoVar.a) / 2, (this.b - cuoVar.b) / 2);
            return afak.a;
        }
        dfd dfdVar = (dfd) obj;
        den denVar = dfdVar.g;
        int iE = dfdVar.e(this.a);
        int iE2 = dfdVar.e(this.b);
        if (iE < 0 || iE > iE2 || iE2 > denVar.c.length()) {
            dka.c("start(" + iE + ") or end(" + iE2 + ") is out of range [0.." + denVar.c.length() + "], or start > end!");
        }
        Path path = new Path();
        dgi dgiVar = denVar.b;
        dgiVar.d.getSelectionPath(iE, iE2, path);
        int i3 = dgiVar.f;
        if (i3 != 0 && !path.isEmpty()) {
            path.offset(BitmapDescriptorFactory.HUE_RED, i3);
        }
        Object obj2 = this.c;
        cjm cjmVar = new cjm(path);
        float f = dfdVar.e;
        cjmVar.m((Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
        ((cjm) obj2).o(cjmVar);
        return afak.a;
    }

    public /* synthetic */ auv(Object obj, int i, int i2, int i3) {
        this.d = i3;
        this.c = obj;
        this.a = i;
        this.b = i2;
    }
}
