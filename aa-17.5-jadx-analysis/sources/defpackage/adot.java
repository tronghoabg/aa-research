package defpackage;

import android.content.Context;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class adot implements adsm {
    final Context a;
    final Executor b;
    final adwt c;
    final adwt d;
    final adom e;
    final adog f;
    final adoj g;
    ScheduledExecutorService h;
    Executor i;
    private boolean j;

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public adot(ados adosVar) {
        Context context = adosVar.a;
        context.getClass();
        this.a = context;
        adosVar.h.getClass();
        this.b = context.getMainExecutor();
        adwt adwtVar = adosVar.c;
        this.c = adwtVar;
        adwt adwtVar2 = adosVar.b;
        adwtVar2.getClass();
        this.d = adwtVar2;
        adom adomVar = adosVar.d;
        adomVar.getClass();
        this.e = adomVar;
        this.f = adosVar.e;
        this.g = adosVar.f;
        adosVar.g.getClass();
        this.h = (ScheduledExecutorService) adwtVar.a();
        this.i = adwtVar2.a();
    }

    @Override // defpackage.adsm
    public final /* bridge */ /* synthetic */ adss a(SocketAddress socketAddress, adsl adslVar, adiy adiyVar) {
        if (this.j) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        return new ador(this, (adod) socketAddress, adslVar);
    }

    @Override // defpackage.adsm
    public final Collection b() {
        return Collections.singleton(adod.class);
    }

    @Override // defpackage.adsm
    public final ScheduledExecutorService c() {
        return this.h;
    }

    @Override // defpackage.adsm, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.j = true;
        this.c.b(this.h);
        this.h = null;
        this.d.b(this.i);
        this.i = null;
    }
}
