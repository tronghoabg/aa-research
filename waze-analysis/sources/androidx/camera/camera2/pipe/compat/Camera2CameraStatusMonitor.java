package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.internal.CameraStatusMonitor;
import h.ab;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.a.ad;
import kotlinx.coroutines.a.s;
import kotlinx.coroutines.a.t;
import kotlinx.coroutines.ae;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2CameraStatusMonitor implements CameraStatusMonitor {
    private final bn<CameraStatusMonitor.CameraStatus> _cameraAvailability;
    private final bm<ab> _cameraPriorities;
    private final ch<CameraStatusMonitor.CameraStatus> cameraAvailability;
    private final String cameraId;
    private final bq<ab> cameraPriorities;
    private final k<CameraStatusMonitor.CameraStatus> cameraStatus;
    private final br cameraStatusJob;
    private final kotlinx.a.a closed;
    private final CameraManager manager;
    private final af scope;
    private final Threads threads;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatusFlow$1, reason: invalid class name */
    final class AnonymousClass1 extends h.c.b.a.g implements p<ad<? super CameraStatusMonitor.CameraStatus>, h.c.e<? super ab>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(h.c.e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        static final ab invokeSuspend$lambda$0(Camera2CameraStatusMonitor camera2CameraStatusMonitor, Camera2CameraStatusMonitor$cameraStatusFlow$1$availabilityCallback$1 camera2CameraStatusMonitor$cameraStatusFlow$1$availabilityCallback$1) {
            camera2CameraStatusMonitor.manager.unregisterAvailabilityCallback(camera2CameraStatusMonitor$cameraStatusFlow$1$availabilityCallback$1);
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
            AnonymousClass1 anonymousClass1 = Camera2CameraStatusMonitor.this.new AnonymousClass1(eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h.g.a.p
        public final Object invoke(ad<? super CameraStatusMonitor.CameraStatus> adVar, h.c.e<? super ab> eVar) {
            return ((AnonymousClass1) create(adVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatusFlow$1$availabilityCallback$1] */
        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                e.b.c.b(obj);
                final ad adVar = (ad) this.L$0;
                final Camera2CameraStatusMonitor camera2CameraStatusMonitor = Camera2CameraStatusMonitor.this;
                final ?? r3 = new CameraManager.AvailabilityCallback() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatusFlow$1$availabilityCallback$1
                    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                    public void onCameraAccessPrioritiesChanged() {
                        Object objE = kotlinx.coroutines.a.ab.e(adVar, CameraStatusMonitor.CameraStatus.CameraPrioritiesChanged.INSTANCE);
                        if (objE instanceof s) {
                            t.d(objE);
                            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                                android.util.Log.w(Log.TAG, "Failed to emit CameraPrioritiesChanged");
                            }
                        }
                    }

                    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                    public void onCameraAvailable(String str) {
                        x.f(str, "cameraId");
                        if (x.n(str, camera2CameraStatusMonitor.cameraId)) {
                            ad<CameraStatusMonitor.CameraStatus> adVar2 = adVar;
                            CameraId.m547constructorimpl(str);
                            Object objE = kotlinx.coroutines.a.ab.e(adVar2, new CameraStatusMonitor.CameraStatus.CameraAvailable(str, null));
                            if (objE instanceof s) {
                                t.d(objE);
                                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                                    android.util.Log.w(Log.TAG, b.a(str, "Failed to emit CameraAvailable(", ")"));
                                }
                            }
                        }
                    }

                    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                    public void onCameraUnavailable(String str) {
                        x.f(str, "cameraId");
                        if (x.n(str, camera2CameraStatusMonitor.cameraId)) {
                            ad<CameraStatusMonitor.CameraStatus> adVar2 = adVar;
                            CameraId.m547constructorimpl(str);
                            Object objE = kotlinx.coroutines.a.ab.e(adVar2, new CameraStatusMonitor.CameraStatus.CameraUnavailable(str, null));
                            if (objE instanceof s) {
                                t.d(objE);
                                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                                    android.util.Log.w(Log.TAG, b.a(str, "Failed to emit CameraUnavailable(", ")"));
                                }
                            }
                        }
                    }
                };
                CameraManager cameraManager = Camera2CameraStatusMonitor.this.manager;
                x.e(cameraManager, "access$getManager$p(...)");
                Api28Compat.registerAvailabilityCallback(cameraManager, Camera2CameraStatusMonitor.this.threads.getCamera2Executor(), (CameraManager.AvailabilityCallback) r3);
                final Camera2CameraStatusMonitor camera2CameraStatusMonitor2 = Camera2CameraStatusMonitor.this;
                this.label = 1;
                if (kotlinx.coroutines.a.ab.a(adVar, new h.g.a.a() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatusFlow$1$$ExternalSyntheticLambda0
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return Camera2CameraStatusMonitor.AnonymousClass1.invokeSuspend$lambda$0(camera2CameraStatusMonitor2, r3);
                    }
                }, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
            }
            return ab.f48028a;
        }
    }

    private Camera2CameraStatusMonitor(g.a.a<CameraManager> aVar, Threads threads, String str, br brVar) {
        x.f(aVar, "cameraManager");
        x.f(threads, "threads");
        x.f(str, "cameraId");
        x.f(brVar, "cameraPipeJob");
        this.threads = threads;
        this.cameraId = str;
        this.manager = aVar.get();
        af afVarE = aj.e(aj.P(brVar).plus(threads.getLightweightDispatcher().plus(new ae("CXCP-CameraStatusMonitor"))));
        this.scope = afVarE;
        this.closed = h.e.b.e(false);
        bn<CameraStatusMonitor.CameraStatus> bnVarB = ck.b(CameraStatusMonitor.CameraStatus.Unknown.INSTANCE);
        this._cameraAvailability = bnVarB;
        this.cameraAvailability = ai.U(bnVarB);
        bm<ab> bmVarE = bu.e(0, 0, null, 7);
        this._cameraPriorities = bmVarE;
        this.cameraPriorities = ai.S(bmVarE);
        this.cameraStatus = cameraStatusFlow();
        this.cameraStatusJob = aj.z(afVarE, null, null, new Camera2CameraStatusMonitor$cameraStatusJob$1(this, null), 3);
    }

    private final k<CameraStatusMonitor.CameraStatus> cameraStatusFlow() {
        return ai.n(new AnonymousClass1(null));
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.closed.b(false, true)) {
            this.cameraStatusJob.s(null);
            aj.h(this.scope, null);
        }
    }

    @Override // androidx.camera.camera2.pipe.internal.CameraStatusMonitor
    public ch<CameraStatusMonitor.CameraStatus> getCameraAvailability() {
        return this.cameraAvailability;
    }

    @Override // androidx.camera.camera2.pipe.internal.CameraStatusMonitor
    public bq<ab> getCameraPriorities() {
        return this.cameraPriorities;
    }

    public /* synthetic */ Camera2CameraStatusMonitor(g.a.a aVar, Threads threads, String str, br brVar, o oVar) {
        this(aVar, threads, str, brVar);
    }
}
