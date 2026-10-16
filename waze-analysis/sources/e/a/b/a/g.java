package e.a.b.a;

import android.content.Context;
import androidx.core.content.ContextCompat;
import e.a.d.gr;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements e.a.d.am {

    /* renamed from: a, reason: collision with root package name */
    final Context f46383a;

    /* renamed from: b, reason: collision with root package name */
    final Executor f46384b;

    /* renamed from: c, reason: collision with root package name */
    final gr f46385c;

    /* renamed from: d, reason: collision with root package name */
    final gr f46386d;

    /* renamed from: e, reason: collision with root package name */
    final e.a.b.k f46387e;

    /* renamed from: f, reason: collision with root package name */
    final e.a.b.f f46388f;

    /* renamed from: g, reason: collision with root package name */
    final e.a.b.h f46389g;

    /* renamed from: h, reason: collision with root package name */
    ScheduledExecutorService f46390h;

    /* renamed from: i, reason: collision with root package name */
    Executor f46391i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f46392j;

    /* synthetic */ g(f fVar) {
        Context context = fVar.f46375a;
        com.google.d.b.an.B(context);
        this.f46383a = context;
        com.google.d.b.an.B(fVar.f46382h);
        this.f46384b = ContextCompat.getMainExecutor(context);
        gr grVar = fVar.f46377c;
        this.f46385c = grVar;
        gr grVar2 = fVar.f46376b;
        com.google.d.b.an.B(grVar2);
        this.f46386d = grVar2;
        e.a.b.k kVar = fVar.f46378d;
        com.google.d.b.an.B(kVar);
        this.f46387e = kVar;
        this.f46388f = fVar.f46379e;
        this.f46389g = fVar.f46380f;
        com.google.d.b.an.B(fVar.f46381g);
        this.f46390h = (ScheduledExecutorService) grVar.a();
        this.f46391i = (Executor) grVar2.a();
    }

    @Override // e.a.d.am
    public final /* bridge */ /* synthetic */ e.a.d.as a(SocketAddress socketAddress, e.a.d.al alVar, e.a.j jVar) {
        if (this.f46392j) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        return new e(this, (e.a.b.b) socketAddress, alVar);
    }

    @Override // e.a.d.am
    public final Collection b() {
        return Collections.singleton(e.a.b.b.class);
    }

    @Override // e.a.d.am
    public final ScheduledExecutorService c() {
        return this.f46390h;
    }

    @Override // e.a.d.am, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f46392j = true;
        this.f46385c.b(this.f46390h);
        this.f46390h = null;
        this.f46386d.b(this.f46391i);
        this.f46391i = null;
    }
}
