package e.a.b;

import android.content.Context;
import com.google.d.b.an;
import e.a.al;
import e.a.bx;
import e.a.bz;
import e.a.d.fx;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g extends al {

    /* renamed from: a, reason: collision with root package name */
    private final fx f46473a;

    /* renamed from: b, reason: collision with root package name */
    private final e.a.b.a.f f46474b;

    private g(b bVar, Context context, com.waze.uid.f fVar) {
        e.a.b.a.f fVar2 = new e.a.b.a.f();
        fVar2.e(context);
        fVar2.f(fVar);
        this.f46474b = fVar2;
        this.f46473a = new fx(bVar, bVar.d(), fVar2);
        e(TimeUnit.SECONDS);
    }

    public static g r(b bVar, Context context) {
        an.C(bVar, "directAddress");
        return new g(bVar, context, com.waze.uid.f.j());
    }

    @Override // e.a.ak, e.a.bz
    public final bx a() {
        fx fxVar = this.f46473a;
        e.a.b.a.f fVar = this.f46474b;
        fVar.c(fxVar.b());
        g(c.f46467a, fVar.a());
        return super.a();
    }

    @Override // e.a.al, e.a.ak
    protected final bz b() {
        return this.f46473a;
    }

    @Override // e.a.al
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void e(TimeUnit timeUnit) {
        an.v(true, "Idle timeouts are not supported when strict lifecycle management is enabled");
        super.e(timeUnit);
    }

    public final void t(k kVar) {
        this.f46474b.d(kVar);
    }
}
