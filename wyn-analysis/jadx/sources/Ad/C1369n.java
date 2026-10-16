package ad;

import android.view.ViewGroup;
import com.google.android.gms.ads.AdSize;
import java.util.List;

/* renamed from: ad.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1369n extends AbstractC1364i implements InterfaceC1366k {

    /* renamed from: b, reason: collision with root package name */
    public final G9.e f17592b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17593c;

    /* renamed from: d, reason: collision with root package name */
    public final List f17594d;

    /* renamed from: e, reason: collision with root package name */
    public final C1367l f17595e;

    /* renamed from: f, reason: collision with root package name */
    public final E0.a f17596f;

    /* renamed from: g, reason: collision with root package name */
    public y6.c f17597g;

    public C1369n(int i5, G9.e eVar, String str, List list, C1367l c1367l, E0.a aVar) {
        super(i5);
        eVar.getClass();
        str.getClass();
        list.getClass();
        c1367l.getClass();
        this.f17592b = eVar;
        this.f17593c = str;
        this.f17594d = list;
        this.f17595e = c1367l;
        this.f17596f = aVar;
    }

    @Override // ad.AbstractC1364i
    public void a() {
        y6.c cVar = this.f17597g;
        if (cVar != null) {
            cVar.a();
            this.f17597g = null;
        }
    }

    @Override // ad.AbstractC1364i
    public io.flutter.plugin.platform.e b() {
        y6.c cVar = this.f17597g;
        if (cVar == null) {
            return null;
        }
        return new N(cVar, 0);
    }

    public final void c() {
        y6.c cVar = new y6.c(this.f17596f.f2782a);
        this.f17597g = cVar;
        if (this instanceof C1358c) {
            cVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
        this.f17597g.setAdUnitId(this.f17593c);
        this.f17597g.setAppEventListener(new C1368m(this));
        List list = this.f17594d;
        AdSize[] adSizeArr = new AdSize[list.size()];
        for (int i5 = 0; i5 < list.size(); i5++) {
            adSizeArr[i5] = ((C1377w) list.get(i5)).f17613a;
        }
        this.f17597g.setAdSizes(adSizeArr);
        this.f17597g.setAdListener(new C1350D(this.f17586a, this.f17592b, this));
        this.f17597g.c(this.f17595e.c());
    }

    public void onAdLoaded() {
        y6.c cVar = this.f17597g;
        if (cVar != null) {
            this.f17592b.z(this.f17586a, cVar.getResponseInfo());
        }
    }
}
