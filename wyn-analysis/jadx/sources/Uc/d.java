package Uc;

import Pc.C0799o;
import android.app.Activity;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1451o;
import com.applovin.impl.e5;
import com.applovin.impl.mediation.MaxAdapterParametersImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.t4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import m9.W;
import m9.Y;
import vf.AbstractC4345a;

/* loaded from: classes5.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12717b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12718c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12721f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f12722g;

    public /* synthetic */ d(MaxFullscreenAdImpl maxFullscreenAdImpl, String str, String str2, Activity activity, ViewGroup viewGroup, AbstractC1451o abstractC1451o) {
        this.f12716a = 2;
        this.f12717b = maxFullscreenAdImpl;
        this.f12719d = str;
        this.f12718c = str2;
        this.f12720e = activity;
        this.f12721f = viewGroup;
        this.f12722g = abstractC1451o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f12721f;
        Object obj2 = this.f12718c;
        Object obj3 = this.f12720e;
        Object obj4 = this.f12719d;
        Object obj5 = this.f12717b;
        Object obj6 = this.f12722g;
        switch (this.f12716a) {
            case 0:
                t tVar = (t) obj5;
                n nVar = (n) obj2;
                String str = (String) obj4;
                Boolean bool = (Boolean) obj3;
                u uVar = (u) obj;
                C0799o c0799o = (C0799o) obj6;
                HashMap map = f.f12728h;
                try {
                    int iH = xg.g.H(tVar.f12771a);
                    W wI = xg.g.I(f.c(nVar), str, bool.booleanValue(), uVar);
                    if (wI == null) {
                        c0799o.b(new o("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null));
                    } else {
                        c0799o.a(xg.g.X((Y) Tasks.await(wI.c(iH)), xg.g.G(tVar.f12772b)));
                    }
                    break;
                } catch (Exception e7) {
                    AbstractC4345a.K(c0799o, e7);
                    return;
                }
            case 1:
                ((MediationServiceImpl) obj5).a((t4) obj2, (com.applovin.impl.mediation.h) obj4, (MaxAdapterParametersImpl) obj3, (e5) obj, (Activity) obj6);
                break;
            case 2:
                String str2 = (String) obj4;
                ((MaxFullscreenAdImpl) obj5).a(str2, (String) obj2, (Activity) obj3, (ViewGroup) obj, (AbstractC1451o) obj6);
                break;
            case 3:
                com.applovin.impl.mediation.ads.a.a((String) obj4, (String) obj5, (MaxAdFormat) obj2, (String) obj3, (com.applovin.impl.sdk.k) obj, (String) obj6);
                break;
            default:
                MaxSignalProvider maxSignalProvider = (MaxSignalProvider) obj2;
                ((com.applovin.impl.mediation.h) obj5).a(maxSignalProvider, (MaxAdapterSignalCollectionParameters) obj4, (Activity) obj3, (e5) obj, (t4) obj6);
                break;
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i5) {
        this.f12716a = i5;
        this.f12717b = obj;
        this.f12718c = obj2;
        this.f12719d = obj3;
        this.f12720e = obj4;
        this.f12721f = obj5;
        this.f12722g = obj6;
    }

    public /* synthetic */ d(String str, String str2, MaxAdFormat maxAdFormat, String str3, com.applovin.impl.sdk.k kVar, String str4) {
        this.f12716a = 3;
        this.f12719d = str;
        this.f12717b = str2;
        this.f12718c = maxAdFormat;
        this.f12720e = str3;
        this.f12721f = kVar;
        this.f12722g = str4;
    }
}
