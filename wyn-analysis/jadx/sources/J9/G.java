package J9;

import E5.C0441b;
import android.os.Bundle;
import java.util.HashMap;
import java.util.concurrent.Executor;
import z9.C4634b;
import z9.C4635c;
import z9.C4637e;
import z9.C4638f;
import z9.EnumC4624C;
import z9.EnumC4625D;

/* loaded from: classes4.dex */
public final class G {

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f5875h;

    /* renamed from: i, reason: collision with root package name */
    public static final HashMap f5876i;

    /* renamed from: a, reason: collision with root package name */
    public final B8.b f5877a;

    /* renamed from: b, reason: collision with root package name */
    public final s8.g f5878b;

    /* renamed from: c, reason: collision with root package name */
    public final P9.d f5879c;

    /* renamed from: d, reason: collision with root package name */
    public final M9.a f5880d;

    /* renamed from: e, reason: collision with root package name */
    public final w8.d f5881e;

    /* renamed from: f, reason: collision with root package name */
    public final C0651j f5882f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f5883g;

    static {
        HashMap map = new HashMap();
        f5875h = map;
        HashMap map2 = new HashMap();
        f5876i = map2;
        map.put(EnumC4625D.f48426a, z9.Z.UNSPECIFIED_RENDER_ERROR);
        map.put(EnumC4625D.f48427b, z9.Z.IMAGE_FETCH_ERROR);
        map.put(EnumC4625D.f48428c, z9.Z.IMAGE_DISPLAY_ERROR);
        map.put(EnumC4625D.f48429d, z9.Z.IMAGE_UNSUPPORTED_FORMAT);
        map2.put(EnumC4624C.f48422b, z9.r.AUTO);
        map2.put(EnumC4624C.f48423c, z9.r.CLICK);
        map2.put(EnumC4624C.f48424d, z9.r.SWIPE);
        map2.put(EnumC4624C.f48421a, z9.r.UNKNOWN_DISMISS_TYPE);
    }

    public G(B8.b bVar, w8.d dVar, s8.g gVar, P9.d dVar2, M9.a aVar, C0651j c0651j, Executor executor) {
        this.f5877a = bVar;
        this.f5881e = dVar;
        this.f5878b = gVar;
        this.f5879c = dVar2;
        this.f5880d = aVar;
        this.f5882f = c0651j;
        this.f5883g = executor;
    }

    public static boolean b(N9.a aVar) {
        String str;
        return (aVar == null || (str = aVar.f8601a) == null || str.isEmpty()) ? false : true;
    }

    public final C4634b a(N9.h hVar, String str) {
        C4634b c4634bJ = C4635c.j();
        c4634bJ.f();
        s8.g gVar = this.f5878b;
        gVar.a();
        s8.l lVar = gVar.f45330c;
        c4634bJ.g(lVar.f45347e);
        c4634bJ.a((String) hVar.f8623b.f3291c);
        C4637e c4637eD = C4638f.d();
        gVar.a();
        c4637eD.b(lVar.f45344b);
        c4637eD.a(str);
        c4634bJ.b(c4637eD);
        this.f5880d.getClass();
        c4634bJ.c(System.currentTimeMillis());
        return c4634bJ;
    }

    public final void c(N9.h hVar, String str, boolean z2) {
        C0441b c0441b = hVar.f8623b;
        String str2 = (String) c0441b.f3291c;
        String str3 = (String) c0441b.f3292d;
        Bundle bundle = new Bundle();
        bundle.putString("_nmid", str2);
        bundle.putString("_nmn", str3);
        try {
            this.f5880d.getClass();
            bundle.putInt("_ndt", (int) (System.currentTimeMillis() / 1000));
        } catch (NumberFormatException e7) {
            ic.d.G("Error while parsing use_device_time in FIAM event: " + e7.getMessage());
        }
        ic.d.E("Sending event=" + str + " params=" + bundle);
        w8.d dVar = this.f5881e;
        if (dVar == null) {
            ic.d.G("Unable to log event: analytics library is missing");
            return;
        }
        dVar.b("fiam", str, bundle);
        if (z2) {
            dVar.a("fiam", "fiam:".concat(str2));
        }
    }
}
