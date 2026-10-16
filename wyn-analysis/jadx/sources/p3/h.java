package p3;

import android.content.Context;
import ef.C2532p;
import kotlin.jvm.internal.AbstractC3340k;
import o3.InterfaceC3644a;

/* loaded from: classes.dex */
public final class h implements o3.d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f43227a;

    /* renamed from: b, reason: collision with root package name */
    public final String f43228b;

    /* renamed from: c, reason: collision with root package name */
    public final N2.j f43229c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f43230d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f43231e;

    /* renamed from: f, reason: collision with root package name */
    public final C2532p f43232f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f43233g;

    public h(Context context, String str, N2.j callback, boolean z2, boolean z10) {
        AbstractC3340k.e(callback, "callback");
        this.f43227a = context;
        this.f43228b = str;
        this.f43229c = callback;
        this.f43230d = z2;
        this.f43231e = z10;
        this.f43232f = Fe.c.z(new C3762c(this, 0));
    }

    @Override // o3.d
    public final InterfaceC3644a I() {
        return ((g) this.f43232f.getValue()).a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C2532p c2532p = this.f43232f;
        if (c2532p.isInitialized()) {
            ((g) c2532p.getValue()).close();
        }
    }

    @Override // o3.d
    public final void setWriteAheadLoggingEnabled(boolean z2) {
        C2532p c2532p = this.f43232f;
        if (c2532p.isInitialized()) {
            ((g) c2532p.getValue()).setWriteAheadLoggingEnabled(z2);
        }
        this.f43233g = z2;
    }
}
