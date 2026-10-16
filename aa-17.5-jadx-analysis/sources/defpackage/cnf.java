package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class cnf {
    private final String a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final long f;
    private final int g;
    private final boolean h;
    private final ArrayList i;
    private final cne j;
    private boolean k;

    public /* synthetic */ cnf(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        long j2;
        if ((i2 & 32) != 0) {
            float[] fArr = clj.a;
            j2 = cjn.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, clj.u);
        } else {
            j2 = j;
        }
        int i3 = (i2 & 64) != 0 ? 5 : i;
        this.a = 1 == (i2 & 1) ? "" : str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        cne cneVar = new cne(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 1023);
        this.j = cneVar;
        arrayList.add(cneVar);
    }

    private final cne e() {
        return (cne) this.i.get(r1.size() - 1);
    }

    private final void f() {
        if (this.k) {
            crt.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
    }

    private static final col g(cne cneVar) {
        return new col(cneVar.a, cneVar.b, cneVar.c, cneVar.d, cneVar.e, cneVar.f, cneVar.g, cneVar.h, cneVar.i, cneVar.j);
    }

    public final cng a() {
        int i;
        f();
        while (this.i.size() > 1) {
            d();
        }
        String str = this.a;
        float f = this.b;
        float f2 = this.c;
        float f3 = this.d;
        float f4 = this.e;
        cne cneVar = this.j;
        long j = this.f;
        int i2 = this.g;
        boolean z = this.h;
        col colVarG = g(cneVar);
        synchronized (cng.b) {
            i = cng.a;
            cng.a = i + 1;
        }
        cng cngVar = new cng(str, f, f2, f3, f4, colVarG, j, i2, z, i);
        this.k = true;
        return cngVar;
    }

    public final void b(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list) {
        f();
        this.i.add(new cne(str, f, f2, f3, f4, f5, f6, f7, list, sk.AUDIO_CONTENT_BUFFER_SIZE));
    }

    public final void c(List list, int i, String str, cjs cjsVar, float f, cjs cjsVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        f();
        e().j.add(new cop(str, list, i, cjsVar, f, cjsVar2, f2, f3, i2, i3, f4, f5, f6, f7));
    }

    public final void d() {
        f();
        e().j.add(g((cne) this.i.remove(r0.size() - 1)));
    }
}
