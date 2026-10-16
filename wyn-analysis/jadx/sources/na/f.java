package na;

import com.google.gson.internal.Excluder;
import java.io.IOException;
import la.z;
import qa.C3883a;
import ra.C3962a;
import ra.C3963b;

/* loaded from: classes4.dex */
public final class f extends z {

    /* renamed from: a, reason: collision with root package name */
    public volatile z f40965a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f40966b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f40967c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ la.l f40968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3883a f40969e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Excluder f40970f;

    public f(Excluder excluder, boolean z2, boolean z10, la.l lVar, C3883a c3883a) {
        this.f40970f = excluder;
        this.f40966b = z2;
        this.f40967c = z10;
        this.f40968d = lVar;
        this.f40969e = c3883a;
    }

    @Override // la.z
    public final Object b(C3962a c3962a) throws IOException {
        if (this.f40966b) {
            c3962a.k0();
            return null;
        }
        z zVarD = this.f40965a;
        if (zVarD == null) {
            zVarD = this.f40968d.d(this.f40970f, this.f40969e);
            this.f40965a = zVarD;
        }
        return zVarD.b(c3962a);
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        if (this.f40967c) {
            c3963b.z();
            return;
        }
        z zVarD = this.f40965a;
        if (zVarD == null) {
            zVarD = this.f40968d.d(this.f40970f, this.f40969e);
            this.f40965a = zVarD;
        }
        zVarD.c(c3963b, obj);
    }
}
