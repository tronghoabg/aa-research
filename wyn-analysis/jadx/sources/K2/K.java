package k2;

import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class K implements Q1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z1.d f38912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3168z f38913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h2.g f38914c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IOException f38915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f38916e;

    public /* synthetic */ K(Z1.d dVar, C3168z c3168z, h2.g gVar, IOException iOException, boolean z2) {
        this.f38912a = dVar;
        this.f38913b = c3168z;
        this.f38914c = gVar;
        this.f38915d = iOException;
        this.f38916e = z2;
    }

    @Override // Q1.c
    public final void accept(Object obj) {
        M m10 = (M) obj;
        Z1.d dVar = this.f38912a;
        m10.s(dVar.f16926a, dVar.f16927b, this.f38913b, this.f38914c, this.f38915d, this.f38916e);
    }
}
