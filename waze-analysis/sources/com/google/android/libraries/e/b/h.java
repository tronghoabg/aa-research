package com.google.android.libraries.e.b;

import android.net.Uri;
import com.google.d.b.aa;
import com.google.d.d.bn;
import com.google.v.fi;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private Uri f5862a;

    /* renamed from: b, reason: collision with root package name */
    private fi f5863b;

    /* renamed from: c, reason: collision with root package name */
    private aa f5864c = aa.g();

    /* renamed from: d, reason: collision with root package name */
    private bn f5865d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5866e;

    /* renamed from: f, reason: collision with root package name */
    private byte f5867f;

    /* renamed from: g, reason: collision with root package name */
    private com.google.android.libraries.b.c f5868g;

    h() {
    }

    public final i a() {
        Uri uri;
        fi fiVar;
        com.google.android.libraries.b.c cVar;
        if (this.f5865d == null) {
            this.f5865d = bn.p();
        }
        if (this.f5867f == 3 && (uri = this.f5862a) != null && (fiVar = this.f5863b) != null && (cVar = this.f5868g) != null) {
            return new i(uri, fiVar, this.f5864c, this.f5865d, cVar, this.f5866e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f5862a == null) {
            sb.append(" uri");
        }
        if (this.f5863b == null) {
            sb.append(" schema");
        }
        if (this.f5868g == null) {
            sb.append(" variantConfig");
        }
        if ((this.f5867f & 1) == 0) {
            sb.append(" useGeneratedExtensionRegistry");
        }
        if ((this.f5867f & 2) == 0) {
            sb.append(" enableTracing");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        this.f5867f = (byte) (this.f5867f | 2);
    }

    public final void c(fi fiVar) {
        if (fiVar == null) {
            throw new NullPointerException("Null schema");
        }
        this.f5863b = fiVar;
    }

    public final void d(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.f5862a = uri;
    }

    public final void e() {
        this.f5866e = true;
        this.f5867f = (byte) (1 | this.f5867f);
    }

    public final void f(com.google.android.gms.d.b bVar) {
        this.f5864c = aa.i(bVar);
    }

    public final void g(com.google.android.libraries.b.c cVar) {
        this.f5868g = cVar;
    }
}
