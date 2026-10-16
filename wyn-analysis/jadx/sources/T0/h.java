package T0;

import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f11238a;

    /* renamed from: b, reason: collision with root package name */
    public final k f11239b;

    /* renamed from: c, reason: collision with root package name */
    public final j f11240c;

    /* renamed from: d, reason: collision with root package name */
    public final i f11241d;

    /* renamed from: e, reason: collision with root package name */
    public final l f11242e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f11243f;

    public h() {
        k kVar = new k();
        kVar.f11320a = 0;
        kVar.f11321b = 0;
        kVar.f11322c = 1.0f;
        kVar.f11323d = Float.NaN;
        this.f11239b = kVar;
        j jVar = new j();
        jVar.f11311a = -1;
        jVar.f11312b = 0;
        jVar.f11313c = -1;
        jVar.f11314d = Float.NaN;
        jVar.f11315e = Float.NaN;
        jVar.f11316f = Float.NaN;
        jVar.f11317g = -1;
        jVar.f11318h = null;
        jVar.f11319i = -1;
        this.f11240c = jVar;
        i iVar = new i();
        iVar.f11270a = false;
        iVar.f11276d = -1;
        iVar.f11278e = -1;
        iVar.f11280f = -1.0f;
        iVar.f11282g = true;
        iVar.f11284h = -1;
        iVar.f11286i = -1;
        iVar.f11288j = -1;
        iVar.k = -1;
        iVar.f11291l = -1;
        iVar.f11293m = -1;
        iVar.f11295n = -1;
        iVar.f11297o = -1;
        iVar.f11299p = -1;
        iVar.f11300q = -1;
        iVar.f11301r = -1;
        iVar.f11302s = -1;
        iVar.f11303t = -1;
        iVar.f11304u = -1;
        iVar.f11305v = -1;
        iVar.f11306w = 0.5f;
        iVar.f11307x = 0.5f;
        iVar.f11308y = null;
        iVar.f11309z = -1;
        iVar.f11245A = 0;
        iVar.f11246B = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        iVar.f11247C = -1;
        iVar.f11248D = -1;
        iVar.f11249E = -1;
        iVar.f11250F = 0;
        iVar.f11251G = 0;
        iVar.f11252H = 0;
        iVar.f11253I = 0;
        iVar.f11254J = 0;
        iVar.f11255K = 0;
        iVar.L = 0;
        iVar.f11256M = Integer.MIN_VALUE;
        iVar.f11257N = Integer.MIN_VALUE;
        iVar.f11258O = Integer.MIN_VALUE;
        iVar.f11259P = Integer.MIN_VALUE;
        iVar.f11260Q = Integer.MIN_VALUE;
        iVar.f11261R = Integer.MIN_VALUE;
        iVar.f11262S = Integer.MIN_VALUE;
        iVar.f11263T = -1.0f;
        iVar.f11264U = -1.0f;
        iVar.f11265V = 0;
        iVar.f11266W = 0;
        iVar.f11267X = 0;
        iVar.f11268Y = 0;
        iVar.f11269Z = 0;
        iVar.f11271a0 = 0;
        iVar.f11273b0 = 0;
        iVar.f11275c0 = 0;
        iVar.f11277d0 = 1.0f;
        iVar.f11279e0 = 1.0f;
        iVar.f11281f0 = -1;
        iVar.f11283g0 = 0;
        iVar.f11285h0 = -1;
        iVar.f11292l0 = false;
        iVar.f11294m0 = false;
        iVar.f11296n0 = true;
        iVar.f11298o0 = 0;
        this.f11241d = iVar;
        l lVar = new l();
        lVar.f11325a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        lVar.f11326b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        lVar.f11327c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        lVar.f11328d = 1.0f;
        lVar.f11329e = 1.0f;
        lVar.f11330f = Float.NaN;
        lVar.f11331g = Float.NaN;
        lVar.f11332h = -1;
        lVar.f11333i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        lVar.f11334j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        lVar.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        lVar.f11335l = false;
        lVar.f11336m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f11242e = lVar;
        this.f11243f = new HashMap();
    }

    public final void a(d dVar) {
        i iVar = this.f11241d;
        dVar.f11181e = iVar.f11284h;
        dVar.f11183f = iVar.f11286i;
        dVar.f11185g = iVar.f11288j;
        dVar.f11187h = iVar.k;
        dVar.f11189i = iVar.f11291l;
        dVar.f11191j = iVar.f11293m;
        dVar.k = iVar.f11295n;
        dVar.f11194l = iVar.f11297o;
        dVar.f11196m = iVar.f11299p;
        dVar.f11198n = iVar.f11300q;
        dVar.f11200o = iVar.f11301r;
        dVar.f11206s = iVar.f11302s;
        dVar.f11207t = iVar.f11303t;
        dVar.f11208u = iVar.f11304u;
        dVar.f11209v = iVar.f11305v;
        ((ViewGroup.MarginLayoutParams) dVar).leftMargin = iVar.f11250F;
        ((ViewGroup.MarginLayoutParams) dVar).rightMargin = iVar.f11251G;
        ((ViewGroup.MarginLayoutParams) dVar).topMargin = iVar.f11252H;
        ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = iVar.f11253I;
        dVar.f11148A = iVar.f11261R;
        dVar.f11149B = iVar.f11260Q;
        dVar.f11211x = iVar.f11257N;
        dVar.f11213z = iVar.f11259P;
        dVar.f11152E = iVar.f11306w;
        dVar.f11153F = iVar.f11307x;
        dVar.f11202p = iVar.f11309z;
        dVar.f11204q = iVar.f11245A;
        dVar.f11205r = iVar.f11246B;
        dVar.f11154G = iVar.f11308y;
        dVar.f11166T = iVar.f11247C;
        dVar.f11167U = iVar.f11248D;
        dVar.f11156I = iVar.f11263T;
        dVar.f11155H = iVar.f11264U;
        dVar.f11158K = iVar.f11266W;
        dVar.f11157J = iVar.f11265V;
        dVar.f11169W = iVar.f11292l0;
        dVar.f11170X = iVar.f11294m0;
        dVar.L = iVar.f11267X;
        dVar.f11159M = iVar.f11268Y;
        dVar.f11162P = iVar.f11269Z;
        dVar.f11163Q = iVar.f11271a0;
        dVar.f11160N = iVar.f11273b0;
        dVar.f11161O = iVar.f11275c0;
        dVar.f11164R = iVar.f11277d0;
        dVar.f11165S = iVar.f11279e0;
        dVar.f11168V = iVar.f11249E;
        dVar.f11177c = iVar.f11280f;
        dVar.f11173a = iVar.f11276d;
        dVar.f11175b = iVar.f11278e;
        ((ViewGroup.MarginLayoutParams) dVar).width = iVar.f11272b;
        ((ViewGroup.MarginLayoutParams) dVar).height = iVar.f11274c;
        String str = iVar.f11290k0;
        if (str != null) {
            dVar.f11171Y = str;
        }
        dVar.f11172Z = iVar.f11298o0;
        dVar.setMarginStart(iVar.f11255K);
        dVar.setMarginEnd(iVar.f11254J);
        dVar.a();
    }

    public final Object clone() {
        h hVar = new h();
        i iVar = hVar.f11241d;
        iVar.getClass();
        i iVar2 = this.f11241d;
        iVar.f11270a = iVar2.f11270a;
        iVar.f11272b = iVar2.f11272b;
        iVar.f11274c = iVar2.f11274c;
        iVar.f11276d = iVar2.f11276d;
        iVar.f11278e = iVar2.f11278e;
        iVar.f11280f = iVar2.f11280f;
        iVar.f11282g = iVar2.f11282g;
        iVar.f11284h = iVar2.f11284h;
        iVar.f11286i = iVar2.f11286i;
        iVar.f11288j = iVar2.f11288j;
        iVar.k = iVar2.k;
        iVar.f11291l = iVar2.f11291l;
        iVar.f11293m = iVar2.f11293m;
        iVar.f11295n = iVar2.f11295n;
        iVar.f11297o = iVar2.f11297o;
        iVar.f11299p = iVar2.f11299p;
        iVar.f11300q = iVar2.f11300q;
        iVar.f11301r = iVar2.f11301r;
        iVar.f11302s = iVar2.f11302s;
        iVar.f11303t = iVar2.f11303t;
        iVar.f11304u = iVar2.f11304u;
        iVar.f11305v = iVar2.f11305v;
        iVar.f11306w = iVar2.f11306w;
        iVar.f11307x = iVar2.f11307x;
        iVar.f11308y = iVar2.f11308y;
        iVar.f11309z = iVar2.f11309z;
        iVar.f11245A = iVar2.f11245A;
        iVar.f11246B = iVar2.f11246B;
        iVar.f11247C = iVar2.f11247C;
        iVar.f11248D = iVar2.f11248D;
        iVar.f11249E = iVar2.f11249E;
        iVar.f11250F = iVar2.f11250F;
        iVar.f11251G = iVar2.f11251G;
        iVar.f11252H = iVar2.f11252H;
        iVar.f11253I = iVar2.f11253I;
        iVar.f11254J = iVar2.f11254J;
        iVar.f11255K = iVar2.f11255K;
        iVar.L = iVar2.L;
        iVar.f11256M = iVar2.f11256M;
        iVar.f11257N = iVar2.f11257N;
        iVar.f11258O = iVar2.f11258O;
        iVar.f11259P = iVar2.f11259P;
        iVar.f11260Q = iVar2.f11260Q;
        iVar.f11261R = iVar2.f11261R;
        iVar.f11262S = iVar2.f11262S;
        iVar.f11263T = iVar2.f11263T;
        iVar.f11264U = iVar2.f11264U;
        iVar.f11265V = iVar2.f11265V;
        iVar.f11266W = iVar2.f11266W;
        iVar.f11267X = iVar2.f11267X;
        iVar.f11268Y = iVar2.f11268Y;
        iVar.f11269Z = iVar2.f11269Z;
        iVar.f11271a0 = iVar2.f11271a0;
        iVar.f11273b0 = iVar2.f11273b0;
        iVar.f11275c0 = iVar2.f11275c0;
        iVar.f11277d0 = iVar2.f11277d0;
        iVar.f11279e0 = iVar2.f11279e0;
        iVar.f11281f0 = iVar2.f11281f0;
        iVar.f11283g0 = iVar2.f11283g0;
        iVar.f11285h0 = iVar2.f11285h0;
        iVar.f11290k0 = iVar2.f11290k0;
        int[] iArr = iVar2.f11287i0;
        if (iArr == null || iVar2.f11289j0 != null) {
            iVar.f11287i0 = null;
        } else {
            iVar.f11287i0 = Arrays.copyOf(iArr, iArr.length);
        }
        iVar.f11289j0 = iVar2.f11289j0;
        iVar.f11292l0 = iVar2.f11292l0;
        iVar.f11294m0 = iVar2.f11294m0;
        iVar.f11296n0 = iVar2.f11296n0;
        iVar.f11298o0 = iVar2.f11298o0;
        j jVar = hVar.f11240c;
        jVar.getClass();
        j jVar2 = this.f11240c;
        jVar2.getClass();
        jVar.f11311a = jVar2.f11311a;
        jVar.f11313c = jVar2.f11313c;
        jVar.f11315e = jVar2.f11315e;
        jVar.f11314d = jVar2.f11314d;
        k kVar = hVar.f11239b;
        k kVar2 = this.f11239b;
        kVar.f11320a = kVar2.f11320a;
        kVar.f11322c = kVar2.f11322c;
        kVar.f11323d = kVar2.f11323d;
        kVar.f11321b = kVar2.f11321b;
        l lVar = hVar.f11242e;
        lVar.getClass();
        l lVar2 = this.f11242e;
        lVar2.getClass();
        lVar.f11325a = lVar2.f11325a;
        lVar.f11326b = lVar2.f11326b;
        lVar.f11327c = lVar2.f11327c;
        lVar.f11328d = lVar2.f11328d;
        lVar.f11329e = lVar2.f11329e;
        lVar.f11330f = lVar2.f11330f;
        lVar.f11331g = lVar2.f11331g;
        lVar.f11332h = lVar2.f11332h;
        lVar.f11333i = lVar2.f11333i;
        lVar.f11334j = lVar2.f11334j;
        lVar.k = lVar2.k;
        lVar.f11335l = lVar2.f11335l;
        lVar.f11336m = lVar2.f11336m;
        hVar.f11238a = this.f11238a;
        return hVar;
    }
}
