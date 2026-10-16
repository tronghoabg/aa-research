package hd;

import A7.AbstractC0279p0;
import J8.AbstractC0626a;
import U1.C0850u;
import ad.L;
import ad.Z;
import android.content.Context;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import cb.AbstractC1593a;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import j$.util.Objects;
import java.io.File;
import java.util.HashMap;
import jd.C3100b;
import ka.AbstractC3256n;
import oc.C3665d;
import qc.C3884a;
import qc.InterfaceC3885b;
import s8.C4026b;
import uc.C4273j;
import uc.InterfaceC4269f;

/* loaded from: classes5.dex */
public class q implements InterfaceC3885b {

    /* renamed from: b, reason: collision with root package name */
    public C8.i f36427b;

    /* renamed from: a, reason: collision with root package name */
    public final LongSparseArray f36426a = new LongSparseArray();

    /* renamed from: c, reason: collision with root package name */
    public final C4026b f36428c = new C4026b(5);

    /* renamed from: d, reason: collision with root package name */
    public long f36429d = 1;

    public static AbstractC0626a e(e eVar) {
        String str = eVar.f36401a;
        if (str.startsWith("asset:")) {
            if (str.startsWith("asset:///")) {
                return new c(str, 0);
            }
            throw new IllegalArgumentException("assetUrl must start with 'asset:///'");
        }
        if (str.startsWith("rtsp:")) {
            if (str.startsWith("rtsp://")) {
                return new c(str, 1);
            }
            throw new IllegalArgumentException("rtspUrl must start with 'rtsp://'");
        }
        g gVar = eVar.f36402b;
        int i5 = 1;
        if (gVar != null) {
            int iOrdinal = gVar.ordinal();
            if (iOrdinal == 0) {
                i5 = 3;
            } else if (iOrdinal == 1) {
                i5 = 4;
            } else if (iOrdinal == 2) {
                i5 = 2;
            }
        }
        return new C2818b(str, i5, new HashMap(eVar.f36403c), eVar.f36404d);
    }

    public final Long a(e eVar) {
        AbstractC0626a abstractC0626aE = e(eVar);
        long j8 = this.f36429d;
        this.f36429d = 1 + j8;
        C8.i iVar = this.f36427b;
        Context context = (Context) iVar.f1939b;
        C4273j c4273j = new C4273j((InterfaceC4269f) iVar.f1940c, AbstractC0279p0.k(j8, "flutter.io/videoPlayer/videoEvents"));
        n nVar = new n();
        c4273j.a(new Wa.d(nVar, 2));
        id.d dVar = new id.d(new L(nVar, 8), abstractC0626aE.b(), this.f36428c, null, new id.c(context, abstractC0626aE, 0));
        InterfaceC4269f interfaceC4269f = (InterfaceC4269f) this.f36427b.f1940c;
        String string = Long.toString(j8);
        com.google.android.gms.internal.consent_sdk.a.J(interfaceC4269f, string, dVar);
        dVar.f36423c = new aa.f(10, interfaceC4269f, string);
        this.f36426a.put(j8, dVar);
        return Long.valueOf(j8);
    }

    public final j b(e eVar) {
        AbstractC0626a abstractC0626aE = e(eVar);
        long j8 = this.f36429d;
        this.f36429d = 1 + j8;
        TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducerC = ((io.flutter.embedding.engine.renderer.k) this.f36427b.f1943f).c(1);
        C8.i iVar = this.f36427b;
        Context context = (Context) iVar.f1939b;
        C4273j c4273j = new C4273j((InterfaceC4269f) iVar.f1940c, AbstractC0279p0.k(j8, "flutter.io/videoPlayer/videoEvents"));
        n nVar = new n();
        c4273j.a(new Wa.d(nVar, 2));
        C3100b c3100b = new C3100b(new L(nVar, 8), abstractC0626aE.b(), this.f36428c, textureRegistry$SurfaceProducerC, new id.c(context, abstractC0626aE, 1));
        c3100b.f38755e = true;
        textureRegistry$SurfaceProducerC.setCallback(c3100b);
        Surface surface = textureRegistry$SurfaceProducerC.getSurface();
        ((C0850u) c3100b.f36424d).L0(surface);
        c3100b.f38755e = surface == null;
        InterfaceC4269f interfaceC4269f = (InterfaceC4269f) this.f36427b.f1940c;
        String string = Long.toString(j8);
        com.google.android.gms.internal.consent_sdk.a.J(interfaceC4269f, string, c3100b);
        c3100b.f36423c = new aa.f(10, interfaceC4269f, string);
        this.f36426a.put(j8, c3100b);
        Long lValueOf = Long.valueOf(j8);
        Long lValueOf2 = Long.valueOf(textureRegistry$SurfaceProducerC.id());
        j jVar = new j();
        jVar.f36411a = lValueOf;
        jVar.f36412b = lValueOf2;
        return jVar;
    }

    public final void c(Long l10) {
        long jLongValue = l10.longValue();
        LongSparseArray longSparseArray = this.f36426a;
        o oVar = (o) longSparseArray.get(jLongValue);
        if (oVar != null) {
            oVar.b();
            longSparseArray.remove(l10.longValue());
        } else {
            String strH = AbstractC1593a.h(jLongValue, "No player found with playerId <", ">");
            if (longSparseArray.size() == 0) {
                strH = N0.a.f(strH, " and no active players created by the plugin.");
            }
            throw new IllegalStateException(strH);
        }
    }

    public final String d(String str, String str2) {
        if (str2 == null) {
            return ((p) this.f36427b.f1941d).f36425a.b(str);
        }
        C3665d c3665d = ((p) this.f36427b.f1942e).f36425a;
        c3665d.getClass();
        StringBuilder sb2 = new StringBuilder("packages");
        String str3 = File.separator;
        return c3665d.b(AbstractC3256n.h(sb2, str3, str2, str3, str));
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        b7.k kVarZ = b7.k.z();
        Context context = c3884a.f44186a;
        C3665d c3665d = (C3665d) kVarZ.f19396b;
        p pVar = new p(c3665d);
        p pVar2 = new p(c3665d);
        io.flutter.embedding.engine.renderer.k kVar = c3884a.f44189d;
        InterfaceC4269f interfaceC4269f = c3884a.f44188c;
        this.f36427b = new C8.i(context, interfaceC4269f, pVar, pVar2, kVar, 12);
        com.google.android.gms.internal.consent_sdk.a.I(interfaceC4269f, this);
        LongSparseArray longSparseArray = this.f36426a;
        Objects.requireNonNull(longSparseArray);
        c3884a.f44190e.j("plugins.flutter.dev/video_player_android", new Z(new com.unity3d.services.core.webview.b(longSparseArray, 9)));
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        if (this.f36427b == null) {
            Log.wtf("VideoPlayerPlugin", "Detached from the engine before registering to it.");
        }
        C8.i iVar = this.f36427b;
        InterfaceC4269f interfaceC4269f = c3884a.f44188c;
        iVar.getClass();
        com.google.android.gms.internal.consent_sdk.a.I(interfaceC4269f, null);
        this.f36427b = null;
        int i5 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.f36426a;
            if (i5 >= longSparseArray.size()) {
                longSparseArray.clear();
                return;
            } else {
                ((o) longSparseArray.valueAt(i5)).b();
                i5++;
            }
        }
    }
}
