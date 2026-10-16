package rb;

import D6.P0;
import D6.c1;
import ad.L;
import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest$Builder;
import nb.InterfaceC3613b;
import x6.C4476g;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44711a;

    /* renamed from: b, reason: collision with root package name */
    public Object f44712b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f44713c;

    /* renamed from: d, reason: collision with root package name */
    public final nb.c f44714d;

    /* renamed from: e, reason: collision with root package name */
    public final com.unity3d.scar.adapter.common.c f44715e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f44716f;

    /* renamed from: g, reason: collision with root package name */
    public Object f44717g;

    public /* synthetic */ a(Context context, nb.c cVar, Object obj, com.unity3d.scar.adapter.common.c cVar2, int i5) {
        this.f44711a = i5;
        this.f44713c = context;
        this.f44714d = cVar;
        this.f44716f = obj;
        this.f44715e = cVar2;
    }

    public final void b(InterfaceC3613b interfaceC3613b) {
        C4476g c4476g;
        switch (this.f44711a) {
            case 0:
                C4476g c4476gH = ((L) this.f44716f).h(this.f44714d.f41003d);
                if (interfaceC3613b != null) {
                    ((b) this.f44717g).f44718a = interfaceC3613b;
                }
                c(c4476gH);
                break;
            default:
                String str = this.f44714d.f41003d;
                tc.j jVar = (tc.j) this.f44716f;
                jVar.getClass();
                if (str.isEmpty()) {
                    AdRequest$Builder adRequest$Builder = (AdRequest$Builder) new AdRequest$Builder(14).V(((c1) jVar.f46015a).f2412a);
                    Bundle bundle = new Bundle();
                    bundle.putString("query_info_type", "requester_type_5");
                    c4476g = new C4476g((AdRequest$Builder) adRequest$Builder.x(AdMobAdapter.class, bundle));
                } else {
                    AdRequest$Builder adRequest$Builder2 = (AdRequest$Builder) new AdRequest$Builder(14).V(((c1) jVar.f46015a).f2412a);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("query_info_type", "requester_type_5");
                    AdRequest$Builder adRequest$Builder3 = (AdRequest$Builder) adRequest$Builder2.x(AdMobAdapter.class, bundle2);
                    ((P0) adRequest$Builder3.f421a).f2355m = str;
                    c4476g = new C4476g(adRequest$Builder3);
                }
                if (interfaceC3613b != null) {
                    ((b) this.f44717g).f44718a = interfaceC3613b;
                }
                c(c4476g);
                break;
        }
    }

    public abstract void c(C4476g c4476g);
}
