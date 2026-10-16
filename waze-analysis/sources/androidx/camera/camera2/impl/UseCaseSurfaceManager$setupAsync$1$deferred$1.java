package androidx.camera.camera2.impl;

import android.view.Surface;
import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import e.b.c;
import h.a.i;
import h.a.r;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import h.k.n;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.df;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class UseCaseSurfaceManager$setupAsync$1$deferred$1 extends g implements p<af, e<? super Boolean>, Object> {
    final /* synthetic */ List<DeferrableSurface> $deferrableSurfaces;
    final /* synthetic */ CameraGraph $graph;
    final /* synthetic */ SessionConfigAdapter $sessionConfigAdapter;
    final /* synthetic */ Map<DeferrableSurface, StreamId> $surfaceToStreamMap;
    final /* synthetic */ long $timeoutMillis;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UseCaseSurfaceManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UseCaseSurfaceManager$setupAsync$1$deferred$1(SessionConfigAdapter sessionConfigAdapter, UseCaseSurfaceManager useCaseSurfaceManager, List<? extends DeferrableSurface> list, long j2, Map<DeferrableSurface, StreamId> map, CameraGraph cameraGraph, e<? super UseCaseSurfaceManager$setupAsync$1$deferred$1> eVar) {
        super(2, eVar);
        this.$sessionConfigAdapter = sessionConfigAdapter;
        this.this$0 = useCaseSurfaceManager;
        this.$deferrableSurfaces = list;
        this.$timeoutMillis = j2;
        this.$surfaceToStreamMap = map;
        this.$graph = cameraGraph;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        UseCaseSurfaceManager$setupAsync$1$deferred$1 useCaseSurfaceManager$setupAsync$1$deferred$1 = new UseCaseSurfaceManager$setupAsync$1$deferred$1(this.$sessionConfigAdapter, this.this$0, this.$deferrableSurfaces, this.$timeoutMillis, this.$surfaceToStreamMap, this.$graph, eVar);
        useCaseSurfaceManager$setupAsync$1$deferred$1.L$0 = obj;
        return useCaseSurfaceManager$setupAsync$1$deferred$1;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super Boolean> eVar) {
        return ((UseCaseSurfaceManager$setupAsync$1$deferred$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        af afVar;
        a aVar = a.f48038a;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                c.b(obj);
                af afVar2 = (af) this.L$0;
                if (!this.$sessionConfigAdapter.isSessionConfigValid()) {
                    throw new IllegalStateException("Check failed.");
                }
                this.L$0 = afVar2;
                this.label = 1;
                Object surfaces = this.this$0.getSurfaces(this.$deferrableSurfaces, this.$timeoutMillis, this);
                if (surfaces == aVar) {
                    return aVar;
                }
                afVar = afVar2;
                obj = surfaces;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                afVar = (af) this.L$0;
                c.b(obj);
            }
            List list = (List) obj;
            if (!aj.j(afVar) || list.isEmpty()) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isInfoEnabled(Log.TAG)) {
                    android.util.Log.i(Camera2Logger.TRUNCATED_TAG, "Failed to get Surfaces: isActive=" + aj.j(afVar) + ", surfaces=" + list);
                }
                return false;
            }
            if (!this.this$0.areValid(list)) {
                Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
                if (Logger.isWarnEnabled(Log.TAG)) {
                    android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Surface setup failed: Some Surfaces are invalid");
                }
                this.$sessionConfigAdapter.reportSurfaceInvalid(this.$deferrableSurfaces.get(list.indexOf(null)));
                return false;
            }
            UseCaseSurfaceManager useCaseSurfaceManager = this.this$0;
            List<DeferrableSurface> list2 = this.$deferrableSurfaces;
            synchronized (useCaseSurfaceManager.lock) {
                List<DeferrableSurface> list3 = list2;
                LinkedHashMap linkedHashMap = new LinkedHashMap(n.h(r.a(i.q(list3, 10)), 16));
                for (Object obj2 : list3) {
                    Object obj3 = list.get(list2.indexOf((DeferrableSurface) obj2));
                    if (obj3 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    linkedHashMap.put((Surface) obj3, obj2);
                }
                useCaseSurfaceManager.configuredSurfaceMap = linkedHashMap;
                useCaseSurfaceManager.setSurfaceListener();
            }
            Map<DeferrableSurface, StreamId> map = this.$surfaceToStreamMap;
            List<DeferrableSurface> list4 = this.$deferrableSurfaces;
            CameraGraph cameraGraph = this.$graph;
            UseCaseSurfaceManager useCaseSurfaceManager2 = this.this$0;
            for (Map.Entry<DeferrableSurface, StreamId> entry : map.entrySet()) {
                int iM980unboximpl = entry.getValue().m980unboximpl();
                Surface surface = (Surface) list.get(list4.indexOf(entry.getKey()));
                Camera2Logger camera2Logger3 = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled(Log.TAG)) {
                    android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Configured " + surface + " for " + StreamId.m979toStringimpl(iM980unboximpl));
                }
                cameraGraph.mo543setSurfaceNYG5g8E(iM980unboximpl, surface);
                useCaseSurfaceManager2.inactiveSurfaceCloser.mo225configurehB7JTeY(iM980unboximpl, entry.getKey(), cameraGraph);
            }
            Camera2Logger camera2Logger4 = Camera2Logger.INSTANCE;
            if (Logger.isInfoEnabled(Log.TAG)) {
                android.util.Log.i(Camera2Logger.TRUNCATED_TAG, "Surface setup complete");
            }
            return true;
        } catch (DeferrableSurface.SurfaceClosedException e2) {
            Camera2Logger camera2Logger5 = Camera2Logger.INSTANCE;
            DeferrableSurface.SurfaceClosedException surfaceClosedException = e2;
            if (Logger.isWarnEnabled(Log.TAG)) {
                android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Failed to get Surfaces: Surfaces closed", surfaceClosedException);
            }
            SessionConfigAdapter sessionConfigAdapter = this.$sessionConfigAdapter;
            DeferrableSurface deferrableSurface = e2.getDeferrableSurface();
            x.e(deferrableSurface, "getDeferrableSurface(...)");
            sessionConfigAdapter.reportSurfaceInvalid(deferrableSurface);
            return false;
        } catch (df unused) {
            Camera2Logger camera2Logger6 = Camera2Logger.INSTANCE;
            long j2 = this.$timeoutMillis;
            if (Logger.isWarnEnabled(Log.TAG)) {
                android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Failed to get Surfaces within " + j2 + " ms");
            }
            return false;
        }
    }
}
