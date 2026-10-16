package androidx.camera.camera2.impl;

import android.view.Surface;
import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser;
import androidx.camera.camera2.config.UseCaseCameraScope;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.CameraSurfaceManager;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.DeferrableSurfaces;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.ListenableFutureKt;
import com.google.d.m.a.bm;
import h.a.i;
import h.ab;
import h.c.a.a;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
@UseCaseCameraScope
/* loaded from: classes2.dex */
public class UseCaseSurfaceManager implements CameraSurfaceManager.SurfaceListener {
    private final Map<Surface, DeferrableSurface> activeSurfaceMap;
    private final CameraPipe cameraPipe;
    private Map<Surface, ? extends DeferrableSurface> configuredSurfaceMap;
    private final InactiveSurfaceCloser inactiveSurfaceCloser;
    private final Object lock;
    private final SessionConfigAdapter sessionConfigAdapter;
    private am<Boolean> setupDeferred;
    private CompletableDeferred<ab> stopDeferred;
    private final UseCaseThreads threads;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.UseCaseSurfaceManager$awaitSetupCompletion$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UseCaseSurfaceManager.awaitSetupCompletion$suspendImpl(UseCaseSurfaceManager.this, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$1, reason: invalid class name and case insensitive filesystem */
    final class C01501 extends c {
        int label;
        /* synthetic */ Object result;

        C01501(e<? super C01501> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UseCaseSurfaceManager.this.getSurfaces(null, 0L, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super List<Surface>>, Object> {
        final /* synthetic */ List<DeferrableSurface> $deferrableSurfaces;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(List<? extends DeferrableSurface> list, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$deferrableSurfaces = list;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass2(this.$deferrableSurfaces, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super List<Surface>> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            List<DeferrableSurface> list = this.$deferrableSurfaces;
            ArrayList arrayList = new ArrayList(i.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Futures.nonCancellationPropagating(((DeferrableSurface) it.next()).getSurface()));
            }
            bm bmVarSuccessfulAsList = Futures.successfulAsList(arrayList);
            x.e(bmVarSuccessfulAsList, "successfulAsList(...)");
            this.label = 1;
            Object objAwait = ListenableFutureKt.await(bmVarSuccessfulAsList, this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    public UseCaseSurfaceManager(UseCaseThreads useCaseThreads, CameraPipe cameraPipe, InactiveSurfaceCloser inactiveSurfaceCloser, SessionConfigAdapter sessionConfigAdapter) {
        x.f(useCaseThreads, "threads");
        x.f(cameraPipe, "cameraPipe");
        x.f(inactiveSurfaceCloser, "inactiveSurfaceCloser");
        x.f(sessionConfigAdapter, "sessionConfigAdapter");
        this.threads = useCaseThreads;
        this.cameraPipe = cameraPipe;
        this.inactiveSurfaceCloser = inactiveSurfaceCloser;
        this.sessionConfigAdapter = sessionConfigAdapter;
        this.lock = new Object();
        this.activeSurfaceMap = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean areValid(List<? extends Surface> list) {
        return (list.isEmpty() || list.contains(null)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object awaitSetupCompletion$suspendImpl(androidx.camera.camera2.impl.UseCaseSurfaceManager r5, h.c.e<? super java.lang.Boolean> r6) {
        /*
            boolean r0 = r6 instanceof androidx.camera.camera2.impl.UseCaseSurfaceManager.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.camera.camera2.impl.UseCaseSurfaceManager$awaitSetupCompletion$1 r0 = (androidx.camera.camera2.impl.UseCaseSurfaceManager.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.impl.UseCaseSurfaceManager$awaitSetupCompletion$1 r0 = new androidx.camera.camera2.impl.UseCaseSurfaceManager$awaitSetupCompletion$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            e.b.c.b(r6)     // Catch: java.util.concurrent.CancellationException -> L4a
            return r6
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            e.b.c.b(r6)
            java.lang.Object r6 = r5.lock
            monitor-enter(r6)
            kotlinx.coroutines.am<java.lang.Boolean> r2 = r5.setupDeferred     // Catch: java.lang.Throwable -> L68
            if (r2 == 0) goto L62
            kotlinx.coroutines.CompletableDeferred<h.ab> r5 = r5.stopDeferred     // Catch: java.lang.Throwable -> L68
            if (r5 == 0) goto L3f
            goto L62
        L3f:
            monitor-exit(r6)
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> L4a
            java.lang.Object r5 = r2.c(r0)     // Catch: java.util.concurrent.CancellationException -> L4a
            if (r5 != r1) goto L49
            return r1
        L49:
            return r5
        L4a:
            androidx.camera.camera2.impl.Camera2Logger r5 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            java.lang.String r5 = "CXCP"
            boolean r5 = androidx.camera.core.Logger.isWarnEnabled(r5)
            if (r5 == 0) goto L5d
            java.lang.String r5 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r6 = "Surface setup was cancelled"
            android.util.Log.w(r5, r6)
        L5d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L62:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L68
            monitor-exit(r6)
            return r5
        L68:
            r5 = move-exception
            monitor-exit(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.UseCaseSurfaceManager.awaitSetupCompletion$suspendImpl(androidx.camera.camera2.impl.UseCaseSurfaceManager, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getSurfaces(java.util.List<? extends androidx.camera.core.impl.DeferrableSurface> r5, long r6, h.c.e<? super java.util.List<? extends android.view.Surface>> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof androidx.camera.camera2.impl.UseCaseSurfaceManager.C01501
            if (r0 == 0) goto L13
            r0 = r8
            androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$1 r0 = (androidx.camera.camera2.impl.UseCaseSurfaceManager.C01501) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$1 r0 = new androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$1
            r0.<init>(r8)
        L18:
            java.lang.Object r4 = r0.result
            h.c.a.a r8 = h.c.a.a.f48038a
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            e.b.c.b(r4)
            goto L42
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r4)
            androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$2 r4 = new androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$2
            r1 = 0
            r4.<init>(r5, r1)
            h.g.a.p r4 = (h.g.a.p) r4
            r0.label = r2
            java.lang.Object r4 = kotlinx.coroutines.aj.I(r6, r4, r0)
            if (r4 == r8) goto L4b
        L42:
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L4a
            java.util.List r4 = h.a.i.h()
        L4a:
            return r4
        L4b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.UseCaseSurfaceManager.getSurfaces(java.util.List, long, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSurfaceListener() {
        this.cameraPipe.cameraSurfaceManager().addListener(this);
    }

    public static /* synthetic */ am setupAsync$default(UseCaseSurfaceManager useCaseSurfaceManager, CameraGraph cameraGraph, SessionConfigAdapter sessionConfigAdapter, Map map, long j2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setupAsync");
        }
        if ((i2 & 8) != 0) {
            j2 = 5000;
        }
        return useCaseSurfaceManager.setupAsync(cameraGraph, sessionConfigAdapter, map, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab setupAsync$lambda$0$3$0(List list, Throwable th) {
        DeferrableSurfaces.decrementAll(list);
        return ab.f48028a;
    }

    private final void tryClearSurfaceListener() {
        synchronized (this.lock) {
            if (this.activeSurfaceMap.isEmpty() && this.configuredSurfaceMap == null) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled(Log.TAG)) {
                    android.util.Log.d(Camera2Logger.TRUNCATED_TAG, this + " remove surface listener");
                }
                this.cameraPipe.cameraSurfaceManager().removeListener(this);
                CompletableDeferred<ab> completableDeferred = this.stopDeferred;
                if (completableDeferred != null) {
                    completableDeferred.a(ab.f48028a);
                }
            }
        }
    }

    public Object awaitSetupCompletion(e<? super Boolean> eVar) {
        return awaitSetupCompletion$suspendImpl(this, eVar);
    }

    @Override // androidx.camera.camera2.pipe.CameraSurfaceManager.SurfaceListener
    public void onSurfaceActive(Surface surface) {
        DeferrableSurface deferrableSurface;
        x.f(surface, "surface");
        synchronized (this.lock) {
            Map<Surface, ? extends DeferrableSurface> map = this.configuredSurfaceMap;
            if (map != null && (deferrableSurface = map.get(surface)) != null && !this.activeSurfaceMap.containsKey(surface)) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled(Log.TAG)) {
                    android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "SurfaceActive " + deferrableSurface + " in " + this);
                }
                this.activeSurfaceMap.put(surface, deferrableSurface);
                try {
                    deferrableSurface.incrementUseCount();
                } catch (DeferrableSurface.SurfaceClosedException e2) {
                    DeferrableSurface.SurfaceClosedException surfaceClosedException = e2;
                    if (Logger.isWarnEnabled(Log.TAG)) {
                        android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Error when " + surface + " going to increase the use count.", surfaceClosedException);
                    }
                    SessionConfigAdapter sessionConfigAdapter = this.sessionConfigAdapter;
                    DeferrableSurface deferrableSurface2 = e2.getDeferrableSurface();
                    x.e(deferrableSurface2, "getDeferrableSurface(...)");
                    sessionConfigAdapter.reportSurfaceInvalid(deferrableSurface2);
                }
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraSurfaceManager.SurfaceListener
    public void onSurfaceInactive(Surface surface) {
        x.f(surface, "surface");
        synchronized (this.lock) {
            DeferrableSurface deferrableSurfaceRemove = this.activeSurfaceMap.remove(surface);
            if (deferrableSurfaceRemove != null) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled(Log.TAG)) {
                    android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "SurfaceInactive " + deferrableSurfaceRemove + " in " + this);
                }
                this.inactiveSurfaceCloser.onSurfaceInactive(deferrableSurfaceRemove);
                try {
                    deferrableSurfaceRemove.decrementUseCount();
                } catch (IllegalStateException e2) {
                    IllegalStateException illegalStateException = e2;
                    if (Logger.isWarnEnabled(Log.TAG)) {
                        android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Error when " + surface + " going to decrease the use count.", illegalStateException);
                    }
                }
                tryClearSurfaceListener();
            }
        }
    }

    public final am<Boolean> setupAsync(CameraGraph cameraGraph, SessionConfigAdapter sessionConfigAdapter, Map<DeferrableSurface, StreamId> map, long j2) {
        CompletableDeferred completableDeferredH;
        x.f(cameraGraph, "graph");
        x.f(sessionConfigAdapter, "sessionConfigAdapter");
        x.f(map, "surfaceToStreamMap");
        synchronized (this.lock) {
            if (this.setupDeferred != null) {
                throw new IllegalStateException("Surfaces should only be set up once!");
            }
            if (this.stopDeferred != null) {
                throw new IllegalStateException("Surfaces being setup after stopped!");
            }
            if (this.configuredSurfaceMap != null) {
                throw new IllegalStateException("Check failed.");
            }
            final List<DeferrableSurface> deferrableSurfaces = sessionConfigAdapter.getDeferrableSurfaces();
            try {
                DeferrableSurfaces.incrementAll(deferrableSurfaces);
                completableDeferredH = aj.y(this.threads.getScope(), null, null, new UseCaseSurfaceManager$setupAsync$1$deferred$1(sessionConfigAdapter, this, deferrableSurfaces, j2, map, cameraGraph, null), 3);
                completableDeferredH.bY(new l() { // from class: androidx.camera.camera2.impl.UseCaseSurfaceManager$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return UseCaseSurfaceManager.setupAsync$lambda$0$3$0(deferrableSurfaces, (Throwable) obj);
                    }
                });
                this.setupDeferred = completableDeferredH;
            } catch (DeferrableSurface.SurfaceClosedException e2) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isWarnEnabled(Log.TAG)) {
                    android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Failed to increment DeferrableSurfaces: Surfaces closed");
                }
                aj.z(this.threads.getScope(), null, null, new UseCaseSurfaceManager$setupAsync$1$4(sessionConfigAdapter, e2, null), 3);
                completableDeferredH = bo.h(false);
            }
        }
        return completableDeferredH;
    }

    public final am<ab> stopAsync() {
        CompletableDeferred<ab> completableDeferredJ;
        synchronized (this.lock) {
            completableDeferredJ = this.stopDeferred;
            if (completableDeferredJ != null) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isWarnEnabled(Log.TAG)) {
                    android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "UseCaseSurfaceManager is already stopping!");
                }
            } else {
                am<Boolean> amVar = this.setupDeferred;
                if (amVar != null) {
                    amVar.s(null);
                }
                this.inactiveSurfaceCloser.closeAll();
                this.configuredSurfaceMap = null;
                completableDeferredJ = bo.j();
                this.stopDeferred = completableDeferredJ;
                tryClearSurfaceListener();
            }
        }
        return completableDeferredJ;
    }
}
