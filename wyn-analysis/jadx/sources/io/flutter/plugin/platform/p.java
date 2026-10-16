package io.flutter.plugin.platform;

import android.app.Activity;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import ba.C1521a;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import kc.C3289a;

/* loaded from: classes5.dex */
public final class p implements j {

    /* renamed from: a, reason: collision with root package name */
    public n f37117a;

    /* renamed from: b, reason: collision with root package name */
    public C3289a f37118b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f37119c;

    /* renamed from: d, reason: collision with root package name */
    public kc.r f37120d;

    /* renamed from: f, reason: collision with root package name */
    public io.flutter.plugin.editing.i f37122f;

    /* renamed from: g, reason: collision with root package name */
    public Y2.B f37123g;
    public final C1521a k;

    /* renamed from: e, reason: collision with root package name */
    public FlutterJNI f37121e = null;

    /* renamed from: n, reason: collision with root package name */
    public Surface f37129n = null;

    /* renamed from: o, reason: collision with root package name */
    public SurfaceControl f37130o = null;

    /* renamed from: p, reason: collision with root package name */
    public final n f37131p = new n(this, 3);

    /* renamed from: h, reason: collision with root package name */
    public final C2865a f37124h = new C2865a();

    /* renamed from: i, reason: collision with root package name */
    public final SparseArray f37125i = new SparseArray();

    /* renamed from: j, reason: collision with root package name */
    public final SparseArray f37126j = new SparseArray();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f37127l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f37128m = new ArrayList();

    public p() {
        if (C1521a.f19411d == null) {
            C1521a.f19411d = new C1521a(13);
        }
        this.k = C1521a.f19411d;
    }

    @Override // io.flutter.plugin.platform.j
    public final void a(io.flutter.view.l lVar) {
        this.f37124h.f37090a = lVar;
    }

    @Override // io.flutter.plugin.platform.j
    public final View b(int i5) {
        e eVar = (e) this.f37125i.get(i5);
        if (eVar == null) {
            return null;
        }
        return eVar.getView();
    }

    @Override // io.flutter.plugin.platform.j
    public final boolean c(int i5) {
        return false;
    }

    @Override // io.flutter.plugin.platform.j
    public final void d() {
        this.f37124h.f37090a = null;
    }
}
