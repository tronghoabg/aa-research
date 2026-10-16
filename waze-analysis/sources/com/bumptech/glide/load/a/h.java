package com.bumptech.glide.load.a;

import com.google.android.gms.common.api.internal.be;
import java.io.File;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h implements l, com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    private final List f3126a;

    /* renamed from: b, reason: collision with root package name */
    private final m f3127b;

    /* renamed from: c, reason: collision with root package name */
    private final k f3128c;

    /* renamed from: d, reason: collision with root package name */
    private int f3129d = -1;

    /* renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.load.o f3130e;

    /* renamed from: f, reason: collision with root package name */
    private List f3131f;

    /* renamed from: g, reason: collision with root package name */
    private int f3132g;

    /* renamed from: h, reason: collision with root package name */
    private File f3133h;

    /* renamed from: i, reason: collision with root package name */
    private volatile be f3134i;

    h(List list, m mVar, k kVar) {
        this.f3126a = list;
        this.f3127b = mVar;
        this.f3128c = kVar;
    }

    private final boolean d() {
        return this.f3132g < this.f3131f.size();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bumptech.glide.load.data.e, java.lang.Object] */
    @Override // com.bumptech.glide.load.a.l
    public final void a() {
        be beVar = this.f3134i;
        if (beVar != null) {
            beVar.f4791b.bk();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.bumptech.glide.load.data.e, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.d
    public final void b(Object obj) {
        this.f3128c.e(this.f3130e, obj, this.f3134i.f4791b, 3, this.f3130e);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [com.bumptech.glide.load.data.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.bumptech.glide.load.data.e, java.lang.Object] */
    @Override // com.bumptech.glide.load.a.l
    public final boolean c() {
        while (true) {
            boolean z = false;
            if (this.f3131f != null && d()) {
                this.f3134i = null;
                while (!z && d()) {
                    List list = this.f3131f;
                    int i2 = this.f3132g;
                    this.f3132g = i2 + 1;
                    com.bumptech.glide.load.b.ad adVar = (com.bumptech.glide.load.b.ad) list.get(i2);
                    File file = this.f3133h;
                    m mVar = this.f3127b;
                    this.f3134i = adVar.b(file, mVar.b(), mVar.a(), mVar.f());
                    if (this.f3134i != null && mVar.t(this.f3134i.f4791b.a())) {
                        this.f3134i.f4791b.f(mVar.c(), this);
                        z = true;
                    }
                }
                return z;
            }
            int i3 = this.f3129d + 1;
            this.f3129d = i3;
            List list2 = this.f3126a;
            if (i3 >= list2.size()) {
                return false;
            }
            com.bumptech.glide.load.o oVar = (com.bumptech.glide.load.o) list2.get(this.f3129d);
            m mVar2 = this.f3127b;
            File fileA = mVar2.l().a(new i(oVar, mVar2.e()));
            this.f3133h = fileA;
            if (fileA != null) {
                this.f3130e = oVar;
                this.f3131f = mVar2.q(fileA);
                this.f3132g = 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.bumptech.glide.load.data.e, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.d
    public final void e(Exception exc) {
        this.f3128c.d(this.f3130e, exc, this.f3134i.f4791b, 3);
    }
}
