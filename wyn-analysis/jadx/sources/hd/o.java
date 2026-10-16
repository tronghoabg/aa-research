package hd;

import E5.J;
import N1.C0754c;
import N1.C0773w;
import U1.C0841k;
import U1.C0850u;
import U1.InterfaceC0843m;
import ad.L;
import android.content.Context;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.util.ArrayList;
import k2.G;
import l8.AbstractC3409K;
import l8.e0;
import s8.C4026b;
import uc.InterfaceC4269f;

/* loaded from: classes5.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public final L f36421a;

    /* renamed from: b, reason: collision with root package name */
    public final TextureRegistry$SurfaceProducer f36422b;

    /* renamed from: c, reason: collision with root package name */
    public aa.f f36423c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0843m f36424d;

    public o(L l10, C0773w c0773w, C4026b c4026b, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer, id.c cVar) {
        C0850u c0850uA;
        this.f36421a = l10;
        this.f36422b = textureRegistry$SurfaceProducer;
        switch (cVar.f36957a) {
            case 0:
                Context context = cVar.f36958b;
                C0841k c0841k = new C0841k(context);
                G gC = cVar.f36959c.c(context);
                Q1.k.g(!c0841k.f12107s);
                c0841k.f12093d = new J(gC, 3);
                c0850uA = c0841k.a();
                break;
            default:
                Context context2 = cVar.f36958b;
                C0841k c0841k2 = new C0841k(context2);
                G gC2 = cVar.f36959c.c(context2);
                Q1.k.g(!c0841k2.f12107s);
                c0841k2.f12093d = new J(gC2, 3);
                c0850uA = c0841k2.a();
                break;
        }
        C0850u c0850u = c0850uA;
        this.f36424d = c0850u;
        e0 e0VarN = AbstractC3409K.n(c0773w);
        c0850u.S0();
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < e0VarN.f40103d; i5++) {
            arrayList.add(c0850u.f12166q.c((C0773w) e0VarN.get(i5)));
        }
        c0850u.S0();
        c0850u.F0(arrayList, true, -9223372036854775807L, -1);
        ((C0850u) this.f36424d).z0();
        InterfaceC0843m interfaceC0843m = this.f36424d;
        AbstractC2817a abstractC2817aA = a(interfaceC0843m, textureRegistry$SurfaceProducer);
        C0850u c0850u2 = (C0850u) interfaceC0843m;
        c0850u2.getClass();
        c0850u2.f12161l.a(abstractC2817aA);
        ((C0850u) this.f36424d).E0(new C0754c(3, 0, 1), !c4026b.f45322b);
    }

    public abstract AbstractC2817a a(InterfaceC0843m interfaceC0843m, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer);

    public void b() {
        aa.f fVar = this.f36423c;
        if (fVar != null) {
            com.google.android.gms.internal.consent_sdk.a.J((InterfaceC4269f) fVar.f17430b, (String) fVar.f17431c, null);
        }
        ((C0850u) this.f36424d).A0();
    }
}
