package com.google.firebase.perf.session;

import android.content.Context;
import android.support.v4.app.n;
import com.google.firebase.perf.a.d;
import com.google.firebase.perf.f.i;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class SessionManager extends d {
    private static final SessionManager instance = new SessionManager();
    private final com.google.firebase.perf.a.c appStateMonitor;
    private final Set<WeakReference<c>> clients;
    private final GaugeManager gaugeManager;
    private b perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), b.a(UUID.randomUUID().toString()), com.google.firebase.perf.a.c.a());
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setApplicationContext$0(Context context, b bVar) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (bVar.e()) {
            this.gaugeManager.logGaugeMetadata(bVar.d(), i.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(i iVar) {
        if (this.perfSession.e()) {
            this.gaugeManager.logGaugeMetadata(this.perfSession.d(), iVar);
        }
    }

    private void startOrStopCollectingGauges(i iVar) {
        boolean zE = this.perfSession.e();
        GaugeManager gaugeManager = this.gaugeManager;
        if (zE) {
            gaugeManager.startCollectingGauges(this.perfSession, iVar);
        } else {
            gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        i iVar = i.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(iVar);
        startOrStopCollectingGauges(iVar);
    }

    @Override // com.google.firebase.perf.a.d, com.google.firebase.perf.a.b
    public void onUpdateAppState(i iVar) {
        super.onUpdateAppState(iVar);
        if (this.appStateMonitor.h()) {
            return;
        }
        if (iVar == i.FOREGROUND) {
            updatePerfSession(b.a(UUID.randomUUID().toString()));
        } else if (this.perfSession.f()) {
            updatePerfSession(b.a(UUID.randomUUID().toString()));
        } else {
            startOrStopCollectingGauges(iVar);
        }
    }

    public final b perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<c> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new n(this, context, this.perfSession, 2));
    }

    public void setPerfSession(b bVar) {
        this.perfSession = bVar;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.f()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<c> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(b bVar) {
        if (bVar.d() == this.perfSession.d()) {
            return;
        }
        this.perfSession = bVar;
        synchronized (this.clients) {
            Iterator<WeakReference<c>> it = this.clients.iterator();
            while (it.hasNext()) {
                c cVar = it.next().get();
                if (cVar != null) {
                    cVar.c(bVar);
                } else {
                    it.remove();
                }
            }
        }
        logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.b());
        startOrStopCollectingGauges(this.appStateMonitor.b());
    }

    public SessionManager(GaugeManager gaugeManager, b bVar, com.google.firebase.perf.a.c cVar) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = bVar;
        this.appStateMonitor = cVar;
        registerForAppState();
    }
}
