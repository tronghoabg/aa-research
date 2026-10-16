package com.waze.sound;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ax implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final ar f39477a;

    /* renamed from: b, reason: collision with root package name */
    private final fm f39478b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.h.b.r f39479c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f39480d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f39481e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.ab f39482f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f39483g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    private kotlinx.coroutines.af f39484h;

    /* renamed from: i, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f39485i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f39486j;

    /* renamed from: k, reason: collision with root package name */
    private final hl f39487k;

    public /* synthetic */ ax(ar arVar, fm fmVar, com.waze.h.b.r rVar, hl hlVar, com.waze.shared_infra.i.b bVar, com.waze.shared_infra.i.e eVar, kotlinx.coroutines.ab abVar) {
        this.f39477a = arVar;
        this.f39478b = fmVar;
        this.f39479c = rVar;
        this.f39487k = hlVar;
        this.f39480d = bVar;
        this.f39481e = eVar;
        this.f39482f = abVar;
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(com.waze.h.c.f24335a);
        this.f39485i = bnVarB;
        this.f39486j = kotlinx.coroutines.b.ai.U(bnVarB);
    }

    public static final /* synthetic */ Object b(ax axVar, h.c.e eVar) {
        Object objCollect = kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.y(kotlinx.coroutines.b.ai.q(axVar.f39479c.b(), axVar.f39487k.k(), new au(null))), new av(axVar, (h.c.e) null, 0)).collect(new bh(axVar, 1), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }

    public static /* synthetic */ h.ab e(ax axVar) {
        axVar.f39481e.g("audio focus lost, closing");
        kotlinx.coroutines.af afVar = axVar.f39484h;
        if (afVar != null) {
            kotlinx.coroutines.bo.d(afVar, kotlinx.coroutines.cl.f51810b, new aw(axVar, (h.c.e) null, 0));
        }
        return h.ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(as asVar) {
        Object objA;
        Object objA2;
        Object objA3;
        Object objA4;
        com.waze.h.c cVar;
        boolean zCompareAndSet = this.f39483g.compareAndSet(true, false);
        com.waze.shared_infra.i.e eVar = this.f39481e;
        if (!zCompareAndSet) {
            eVar.g("Audio session is already closed or was never opened. Ignoring call to close().");
            return;
        }
        eVar.a("close(reason=" + asVar + ")");
        try {
            ax axVar = this;
            this.f39479c.close();
            objA = h.ab.f48028a;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            this.f39481e.c("Failed to close utterance recorder", thC);
            this.f39480d.a(thC, null);
        }
        try {
            ax axVar2 = this;
            this.f39487k.close();
            objA2 = h.ab.f48028a;
        } catch (Throwable th2) {
            objA2 = e.b.c.a(th2);
        }
        Throwable thC2 = h.m.c(objA2);
        if (thC2 != null) {
            this.f39481e.c("Failed to close streaming audio player", thC2);
            this.f39480d.a(thC2, null);
        }
        try {
            ax axVar3 = this;
            this.f39478b.e();
            objA3 = h.ab.f48028a;
        } catch (Throwable th3) {
            objA3 = e.b.c.a(th3);
        }
        Throwable thC3 = h.m.c(objA3);
        if (thC3 != null) {
            this.f39481e.c("Failed to stop sound player", thC3);
            this.f39480d.a(thC3, null);
        }
        this.f39477a.c();
        try {
            ax axVar4 = this;
            this.f39478b.f();
            objA4 = h.ab.f48028a;
        } catch (Throwable th4) {
            objA4 = e.b.c.a(th4);
        }
        Throwable thC4 = h.m.c(objA4);
        if (thC4 != null) {
            this.f39481e.c("Failed to unmute sound player", thC4);
            this.f39480d.a(thC4, null);
        }
        kotlinx.coroutines.af afVar = this.f39484h;
        if (afVar != null) {
            kotlinx.coroutines.aj.h(afVar, null);
        }
        kotlinx.coroutines.b.bn bnVar = this.f39485i;
        as asVar2 = as.f39460a;
        int iOrdinal = asVar.ordinal();
        if (iOrdinal == 0) {
            cVar = com.waze.h.c.f24335a;
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            cVar = com.waze.h.b.f24318a;
        }
        bnVar.e(cVar);
    }

    public final Object c(kotlinx.coroutines.b.k kVar, h.c.e eVar) {
        return this.f39487k.j(kVar, eVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        j(as.f39460a);
    }

    public final Object d(com.waze.h.c.b bVar, h.c.e eVar) {
        return this.f39479c.a(bVar, eVar);
    }

    public final kotlinx.coroutines.b.ch g() {
        return this.f39486j;
    }

    public final boolean i() {
        Object objA;
        boolean z;
        boolean zCompareAndSet = this.f39483g.compareAndSet(false, true);
        com.waze.shared_infra.i.e eVar = this.f39481e;
        if (!zCompareAndSet) {
            eVar.g("Audio session is already open. Ignoring call to open().");
            return true;
        }
        eVar.a(TtmlNode.TEXT_EMPHASIS_MARK_OPEN);
        try {
            ax axVar = this;
            fm fmVar = this.f39478b;
            fmVar.e();
            fmVar.b();
            if (this.f39477a.b(new com.waze.reports_v2.presentation.bq(this, 16))) {
                kotlinx.coroutines.af afVar = this.f39484h;
                if (afVar != null) {
                    kotlinx.coroutines.aj.h(afVar, null);
                }
                kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(this.f39482f.plus(kotlinx.coroutines.aj.Q()));
                kotlinx.coroutines.aj.z(afVarE, null, null, new bi(this, (h.c.e) null, 1), 3);
                this.f39484h = afVarE;
                this.f39481e.a("Audio session started successfully.");
                z = true;
            } else {
                this.f39481e.g("Audio focus was not granted. aborting");
                close();
                z = false;
            }
            objA = Boolean.valueOf(z);
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            this.f39481e.c("Exception while starting audio session", thC);
            this.f39480d.a(thC, null);
            close();
        }
        if (true == (objA instanceof h.l)) {
            objA = false;
        }
        return ((Boolean) objA).booleanValue();
    }
}
