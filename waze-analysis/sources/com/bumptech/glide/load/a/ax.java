package com.bumptech.glide.load.a;

import com.google.android.gms.common.api.internal.be;
import java.io.File;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ax implements l, com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    private final k f3052a;

    /* renamed from: b, reason: collision with root package name */
    private final m f3053b;

    /* renamed from: c, reason: collision with root package name */
    private int f3054c;

    /* renamed from: d, reason: collision with root package name */
    private int f3055d = -1;

    /* renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.load.o f3056e;

    /* renamed from: f, reason: collision with root package name */
    private List f3057f;

    /* renamed from: g, reason: collision with root package name */
    private int f3058g;

    /* renamed from: h, reason: collision with root package name */
    private File f3059h;

    /* renamed from: i, reason: collision with root package name */
    private ay f3060i;

    /* renamed from: j, reason: collision with root package name */
    private volatile be f3061j;

    ax(m mVar, k kVar) {
        this.f3053b = mVar;
        this.f3052a = kVar;
    }

    private final boolean d() {
        return this.f3058g < this.f3057f.size();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bumptech.glide.load.data.e, java.lang.Object] */
    @Override // com.bumptech.glide.load.a.l
    public final void a() {
        be beVar = this.f3061j;
        if (beVar != null) {
            beVar.f4791b.bk();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.bumptech.glide.load.data.e, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.d
    public final void b(Object obj) {
        this.f3052a.e(this.f3056e, obj, this.f3061j.f4791b, 4, this.f3060i);
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [com.bumptech.glide.load.data.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [com.bumptech.glide.load.data.e, java.lang.Object] */
    @Override // com.bumptech.glide.load.a.l
    public final boolean c() {
        m mVar = this.f3053b;
        List listO = mVar.o();
        boolean z = false;
        if (listO.isEmpty()) {
            return false;
        }
        List listR = mVar.r();
        if (listR.isEmpty()) {
            if (File.class.equals(mVar.n())) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + String.valueOf(mVar.m()) + " to " + String.valueOf(mVar.n()));
        }
        while (true) {
            if (this.f3057f != null && d()) {
                this.f3061j = null;
                while (!z && d()) {
                    List list = this.f3057f;
                    int i2 = this.f3058g;
                    this.f3058g = i2 + 1;
                    this.f3061j = ((com.bumptech.glide.load.b.ad) list.get(i2)).b(this.f3059h, mVar.b(), mVar.a(), mVar.f());
                    if (this.f3061j != null && mVar.t(this.f3061j.f4791b.a())) {
                        this.f3061j.f4791b.f(mVar.c(), this);
                        z = true;
                    }
                }
                return z;
            }
            int i3 = this.f3055d + 1;
            this.f3055d = i3;
            if (i3 >= listR.size()) {
                int i4 = this.f3054c + 1;
                this.f3054c = i4;
                if (i4 >= listO.size()) {
                    return false;
                }
                this.f3055d = 0;
            }
            com.bumptech.glide.load.o oVar = (com.bumptech.glide.load.o) listO.get(this.f3054c);
            Class cls = (Class) listR.get(this.f3055d);
            this.f3060i = new ay(mVar.w(), oVar, mVar.e(), mVar.b(), mVar.a(), mVar.h(cls), cls, mVar.f());
            File fileA = mVar.l().a(this.f3060i);
            this.f3059h = fileA;
            if (fileA != null) {
                this.f3056e = oVar;
                this.f3057f = mVar.q(fileA);
                this.f3058g = 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.bumptech.glide.load.data.e, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.d
    public final void e(Exception exc) {
        this.f3052a.d(this.f3060i, exc, this.f3061j.f4791b, 4);
    }
}
