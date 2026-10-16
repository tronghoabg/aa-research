package com.airbnb.lottie.a.b;

import android.graphics.Path;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class s extends f {

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.d.b.m f1904d;

    /* renamed from: e, reason: collision with root package name */
    private final Path f1905e;

    /* renamed from: f, reason: collision with root package name */
    private Path f1906f;

    /* renamed from: g, reason: collision with root package name */
    private Path f1907g;

    /* renamed from: h, reason: collision with root package name */
    private List f1908h;

    public s(List list) {
        super(list);
        this.f1904d = new com.airbnb.lottie.d.b.m();
        this.f1905e = new Path();
    }

    @Override // com.airbnb.lottie.a.b.f
    public final /* bridge */ /* synthetic */ Object g(com.airbnb.lottie.h.a aVar, float f2) {
        com.airbnb.lottie.d.b.m mVar = (com.airbnb.lottie.d.b.m) aVar.f2433a;
        com.airbnb.lottie.d.b.m mVar2 = (com.airbnb.lottie.d.b.m) aVar.f2434b;
        com.airbnb.lottie.d.b.m mVar3 = mVar2 == null ? mVar : mVar2;
        com.airbnb.lottie.d.b.m mVarB = this.f1904d;
        mVarB.c(mVar, mVar3, f2);
        List list = this.f1908h;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                mVarB = ((com.airbnb.lottie.a.a.r) this.f1908h.get(size)).b(mVarB);
            }
        }
        Path path = this.f1905e;
        com.airbnb.lottie.g.f.c(mVarB, path);
        if (this.f1877c == null) {
            return path;
        }
        if (this.f1906f == null) {
            this.f1906f = new Path();
            this.f1907g = new Path();
        }
        com.airbnb.lottie.g.f.c(mVar, this.f1906f);
        if (mVar2 != null) {
            com.airbnb.lottie.g.f.c(mVar2, this.f1907g);
        }
        com.airbnb.lottie.h.c cVar = this.f1877c;
        float f3 = aVar.f2438f;
        float fFloatValue = aVar.f2439g.floatValue();
        Path path2 = this.f1906f;
        return (Path) cVar.b(f3, fFloatValue, path2, mVar2 == null ? path2 : this.f1907g, f2, c(), this.f1876b);
    }

    public final void o(List list) {
        this.f1908h = list;
    }
}
