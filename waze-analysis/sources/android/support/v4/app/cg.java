package android.support.v4.app;

import androidx.lifecycle.Lifecycle;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class cg {

    /* renamed from: a, reason: collision with root package name */
    int f246a;

    /* renamed from: b, reason: collision with root package name */
    ar f247b;

    /* renamed from: c, reason: collision with root package name */
    boolean f248c;

    /* renamed from: d, reason: collision with root package name */
    int f249d;

    /* renamed from: e, reason: collision with root package name */
    int f250e;

    /* renamed from: f, reason: collision with root package name */
    int f251f;

    /* renamed from: g, reason: collision with root package name */
    int f252g;

    /* renamed from: h, reason: collision with root package name */
    Lifecycle.State f253h;

    /* renamed from: i, reason: collision with root package name */
    Lifecycle.State f254i;

    cg(cg cgVar) {
        this.f246a = cgVar.f246a;
        this.f247b = cgVar.f247b;
        this.f248c = cgVar.f248c;
        this.f249d = cgVar.f249d;
        this.f250e = cgVar.f250e;
        this.f251f = cgVar.f251f;
        this.f252g = cgVar.f252g;
        this.f253h = cgVar.f253h;
        this.f254i = cgVar.f254i;
    }

    cg(int i2, ar arVar) {
        this.f246a = i2;
        this.f247b = arVar;
        this.f248c = false;
        Lifecycle.State state = Lifecycle.State.RESUMED;
        this.f253h = state;
        this.f254i = state;
    }

    cg(int i2, ar arVar, byte[] bArr) {
        this.f246a = i2;
        this.f247b = arVar;
        this.f248c = true;
        Lifecycle.State state = Lifecycle.State.RESUMED;
        this.f253h = state;
        this.f254i = state;
    }

    cg() {
    }
}
