package lc;

import K8.H;
import M.y;
import Va.X7;
import a2.C1323c;
import a2.v;
import ac.C1346a;
import ad.L;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import ba.C1521a;
import g2.C2690k;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.k;
import io.flutter.plugin.platform.p;
import java.util.HashMap;
import java.util.HashSet;
import ld.InterfaceC3460b;
import me.C3558a;
import oc.C3665d;
import q.C3828o;
import t6.q;
import tc.C4155a;
import tc.j;
import uc.C4281r;
import uc.C4286w;
import uc.C4287x;
import vc.C4337a;
import xc.C4508a;

/* renamed from: lc.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3458b implements InterfaceC3460b {

    /* renamed from: w, reason: collision with root package name */
    public static long f40249w = 1;

    /* renamed from: x, reason: collision with root package name */
    public static final HashMap f40250x = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f40251a;

    /* renamed from: b, reason: collision with root package name */
    public final k f40252b;

    /* renamed from: c, reason: collision with root package name */
    public final mc.b f40253c;

    /* renamed from: d, reason: collision with root package name */
    public final H f40254d;

    /* renamed from: e, reason: collision with root package name */
    public final C4337a f40255e;

    /* renamed from: f, reason: collision with root package name */
    public final C3558a f40256f;

    /* renamed from: g, reason: collision with root package name */
    public final C2690k f40257g;

    /* renamed from: h, reason: collision with root package name */
    public final C1323c f40258h;

    /* renamed from: i, reason: collision with root package name */
    public final C1346a f40259i;

    /* renamed from: j, reason: collision with root package name */
    public final L f40260j;
    public final C3828o k;

    /* renamed from: l, reason: collision with root package name */
    public final C1521a f40261l;

    /* renamed from: m, reason: collision with root package name */
    public final v f40262m;

    /* renamed from: n, reason: collision with root package name */
    public final tc.i f40263n;

    /* renamed from: o, reason: collision with root package name */
    public final j f40264o;

    /* renamed from: p, reason: collision with root package name */
    public final C4155a f40265p;

    /* renamed from: q, reason: collision with root package name */
    public final q f40266q;

    /* renamed from: r, reason: collision with root package name */
    public final io.flutter.plugin.platform.q f40267r;

    /* renamed from: s, reason: collision with root package name */
    public final p f40268s;

    /* renamed from: t, reason: collision with root package name */
    public final HashSet f40269t;

    /* renamed from: u, reason: collision with root package name */
    public final long f40270u;

    /* renamed from: v, reason: collision with root package name */
    public final eb.e f40271v;

    public C3458b(Context context, String[] strArr) {
        this(context, null, new io.flutter.plugin.platform.q(), strArr, true, false);
    }

    public C3458b(Context context, FlutterJNI flutterJNI, io.flutter.plugin.platform.q qVar, String[] strArr, boolean z2, boolean z10) {
        AssetManager assets;
        this.f40269t = new HashSet();
        this.f40271v = new eb.e(this, 1);
        long j8 = f40249w;
        f40249w = 1 + j8;
        this.f40270u = j8;
        f40250x.put(Long.valueOf(j8), this);
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        b7.k kVarZ = b7.k.z();
        if (flutterJNI == null) {
            Object obj = kVarZ.f19397c;
            flutterJNI = new FlutterJNI();
        }
        this.f40251a = flutterJNI;
        mc.b bVar = new mc.b(flutterJNI, assets, this.f40270u);
        this.f40253c = bVar;
        flutterJNI.setPlatformMessageHandler((mc.j) bVar.f40526e);
        b7.k.z().getClass();
        C3558a c3558a = new C3558a();
        v vVar = new v(c3558a, 26);
        X7 x72 = new X7(bVar, C4286w.f46765a, (Object) null, "flutter/accessibility");
        c3558a.f40736a = x72;
        x72.n(vVar);
        c3558a.f40737b = flutterJNI;
        this.f40256f = c3558a;
        new C4281r(bVar, "flutter/deferredcomponent", C4287x.f46768b, null).b(new C1323c(new a2.k(), 27));
        b7.k.z().getClass();
        new HashMap();
        this.f40257g = new C2690k(bVar);
        q qVar2 = new q(bVar, 1);
        this.f40258h = new C1323c(bVar);
        this.f40259i = new C1346a(bVar);
        this.f40260j = new L(bVar);
        this.f40261l = new C1521a(bVar);
        C1521a c1521a = new C1521a(bVar, context.getPackageManager());
        C4281r c4281r = new C4281r(bVar, "flutter/restoration", C4287x.f46768b, null);
        C3828o c3828o = new C3828o();
        c3828o.f43847d = false;
        c3828o.f43848e = false;
        C1346a c1346a = new C1346a(c3828o, 23);
        c3828o.f43844a = c4281r;
        c3828o.f43846c = z10;
        c4281r.b(c1346a);
        this.k = c3828o;
        this.f40262m = new v(bVar);
        this.f40263n = new tc.i(bVar);
        j jVar = new j();
        new C4281r(bVar, "flutter/spellcheck", C4287x.f46768b, null).b(new L(jVar, 28));
        this.f40264o = jVar;
        this.f40265p = new C4155a(bVar);
        this.f40266q = new q(bVar, 3);
        C4337a c4337a = new C4337a(context, qVar2);
        this.f40255e = c4337a;
        C3665d c3665d = (C3665d) kVarZ.f19396b;
        if (!flutterJNI.isAttached()) {
            c3665d.c(context.getApplicationContext());
            c3665d.a(context, strArr);
        }
        p pVar = new p();
        pVar.f37117a = qVar.f37133a;
        pVar.f37121e = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.f40271v);
        flutterJNI.setPlatformViewsController(qVar);
        flutterJNI.setPlatformViewsController2(pVar);
        flutterJNI.setLocalizationPlugin(c4337a);
        kVarZ.getClass();
        flutterJNI.setDeferredComponentManager(null);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f40252b = new k(flutterJNI);
        this.f40267r = qVar;
        this.f40268s = pVar;
        H h10 = new H(context.getApplicationContext(), this, c3665d);
        this.f40254d = h10;
        c4337a.b(context.getResources().getConfiguration());
        if (z2 && ((y) c3665d.f41476d).f7226a) {
            A6.h.H(this);
        }
        S3.f.i(context, this);
        h10.e(new C4508a(c1521a));
    }
}
