package io.flutter.plugin.platform;

import A7.AbstractC0279p0;
import A7.C0237b0;
import ad.L;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.C3558a;
import o1.C3641c;
import p9.C3778C;
import p9.C3779D;
import p9.C3787h;

/* loaded from: classes5.dex */
public final class x implements g {

    /* renamed from: a, reason: collision with root package name */
    public int f37166a;

    /* renamed from: b, reason: collision with root package name */
    public int f37167b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f37168c;

    /* renamed from: d, reason: collision with root package name */
    public Object f37169d;

    /* renamed from: e, reason: collision with root package name */
    public Object f37170e;

    /* renamed from: f, reason: collision with root package name */
    public Object f37171f;

    @Override // io.flutter.plugin.platform.g
    public void a(int i5, int i10) {
        this.f37166a = i5;
        this.f37167b = i10;
        SurfaceTexture surfaceTexture = (SurfaceTexture) this.f37170e;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i5, i10);
        }
    }

    public void b(String str) {
        String strL = AbstractC0279p0.l("Could not reach Cloud Firestore backend. ", str, "\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend.");
        if (!this.f37168c) {
            Ba.c.p("OnlineStateTracker", "%s", 1, strL);
        } else {
            Ba.c.p("OnlineStateTracker", "%s", 2, strL);
            this.f37168c = false;
        }
    }

    public void c(int i5) {
        boolean z2;
        X2.j jVar;
        if (i5 != this.f37166a) {
            this.f37166a = i5;
            p9.z zVarE = ((p9.s) ((L) ((C3641c) this.f37171f).f41267b).f17515b).e();
            zVarE.a("handleOnlineStateChange");
            ArrayList arrayList = new ArrayList();
            Iterator it = zVarE.f43433c.entrySet().iterator();
            while (true) {
                z2 = false;
                if (!it.hasNext()) {
                    break;
                }
                C3778C c3778c = ((p9.w) ((Map.Entry) it.next()).getValue()).f43428c;
                Object obj = null;
                if (c3778c.f43323b && i5 == 3) {
                    c3778c.f43323b = false;
                    jVar = c3778c.a(new C0237b0((s9.i) c3778c.f43325d, new a2.v(19), (c9.d) c3778c.f43328g, false), null, false);
                } else {
                    jVar = new X2.j(25, obj, Collections.EMPTY_LIST);
                }
                A6.c.z(((List) jVar.f16076c).isEmpty(), "OnlineState should not affect limbo documents.", new Object[0]);
                C3779D c3779d = (C3779D) jVar.f16075b;
                if (c3779d != null) {
                    arrayList.add(c3779d);
                }
            }
            zVarE.f43442m.e(arrayList);
            Q1.n nVar = zVarE.f43442m;
            nVar.f9695a = i5;
            Iterator it2 = ((HashMap) nVar.f9697c).values().iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((C3787h) it2.next()).f43358a.iterator();
                while (it3.hasNext()) {
                    p9.v vVar = (p9.v) it3.next();
                    vVar.f43424e = i5;
                    C3779D c3779d2 = vVar.f43425f;
                    if (c3779d2 != null && !vVar.f43423d && vVar.d(c3779d2, i5)) {
                        vVar.c(vVar.f43425f);
                        z2 = true;
                    }
                }
            }
            if (z2) {
                nVar.f();
            }
        }
    }

    public void d(int i5) {
        C3558a c3558a = (C3558a) this.f37169d;
        if (c3558a != null) {
            c3558a.n();
            this.f37169d = null;
        }
        this.f37167b = 0;
        if (i5 == 2) {
            this.f37168c = false;
        }
        c(i5);
    }

    @Override // io.flutter.plugin.platform.g
    public int getHeight() {
        return this.f37167b;
    }

    @Override // io.flutter.plugin.platform.g
    public long getId() {
        return ((io.flutter.embedding.engine.renderer.i) this.f37169d).f36986a;
    }

    @Override // io.flutter.plugin.platform.g
    public Surface getSurface() {
        Surface surface = (Surface) this.f37171f;
        if (surface == null || this.f37168c) {
            if (surface != null) {
                surface.release();
                this.f37171f = null;
            }
            this.f37171f = new Surface((SurfaceTexture) this.f37170e);
            this.f37168c = false;
        }
        SurfaceTexture surfaceTexture = (SurfaceTexture) this.f37170e;
        if (surfaceTexture == null || surfaceTexture.isReleased()) {
            return null;
        }
        return (Surface) this.f37171f;
    }

    @Override // io.flutter.plugin.platform.g
    public int getWidth() {
        return this.f37166a;
    }

    @Override // io.flutter.plugin.platform.g
    public void release() {
        this.f37170e = null;
        Surface surface = (Surface) this.f37171f;
        if (surface != null) {
            surface.release();
            this.f37171f = null;
        }
    }

    @Override // io.flutter.plugin.platform.g
    public /* synthetic */ void scheduleFrame() {
    }
}
