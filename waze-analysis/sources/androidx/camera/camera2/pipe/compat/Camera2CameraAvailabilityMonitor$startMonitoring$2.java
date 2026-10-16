package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.compat.CameraAvailabilityMonitor;
import androidx.camera.camera2.pipe.core.Log;
import h.ab;
import h.g.a.p;
import h.g.b.x;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2CameraAvailabilityMonitor$startMonitoring$2 implements CameraAvailabilityMonitor.Session {
    private final CopyOnWriteArrayList<CompletableDeferred<ab>> listeners;
    private final af scope;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$1, reason: invalid class name */
    final class AnonymousClass1 extends h.c.b.a.g implements p<af, h.c.e<? super ab>, Object> {
        final /* synthetic */ String $cameraId;
        int label;
        final /* synthetic */ Camera2CameraAvailabilityMonitor this$0;
        final /* synthetic */ Camera2CameraAvailabilityMonitor$startMonitoring$2 this$1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Camera2CameraAvailabilityMonitor camera2CameraAvailabilityMonitor, String str, Camera2CameraAvailabilityMonitor$startMonitoring$2 camera2CameraAvailabilityMonitor$startMonitoring$2, h.c.e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.this$0 = camera2CameraAvailabilityMonitor;
            this.$cameraId = str;
            this.this$1 = camera2CameraAvailabilityMonitor$startMonitoring$2;
        }

        @Override // h.c.b.a.a
        public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
            return new AnonymousClass1(this.this$0, this.$cameraId, this.this$1, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, h.c.e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                e.b.c.b(obj);
                Camera2CameraAvailabilityMonitor camera2CameraAvailabilityMonitor = this.this$0;
                final String str = this.$cameraId;
                final Camera2CameraAvailabilityMonitor$startMonitoring$2 camera2CameraAvailabilityMonitor$startMonitoring$2 = this.this$1;
                this.label = 1;
                if (camera2CameraAvailabilityMonitor.availableCameraFlow.collect(new l() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor.startMonitoring.2.1.1
                    @Override // kotlinx.coroutines.b.l
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, h.c.e eVar) {
                        return m1008emit0r8Bogc(((CameraId) obj2).m553unboximpl(), eVar);
                    }

                    /* renamed from: emit-0r8Bogc, reason: not valid java name */
                    public final Object m1008emit0r8Bogc(String str2, h.c.e<? super ab> eVar) {
                        if (CameraId.m549equalsimpl0(str2, str)) {
                            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                                android.util.Log.d(Log.TAG, CameraId.m552toStringimpl(str2).concat(" has become available! Notifying listeners..."));
                            }
                            Iterator it = camera2CameraAvailabilityMonitor$startMonitoring$2.listeners.iterator();
                            x.e(it, "iterator(...)");
                            while (it.hasNext()) {
                                ((CompletableDeferred) it.next()).a(ab.f48028a);
                            }
                        }
                        return ab.f48028a;
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

    Camera2CameraAvailabilityMonitor$startMonitoring$2(Camera2CameraAvailabilityMonitor camera2CameraAvailabilityMonitor, String str) {
        af afVarE = aj.e(camera2CameraAvailabilityMonitor.threads.getBackgroundDispatcher().plus(aj.P(camera2CameraAvailabilityMonitor.cameraPipeJob)));
        this.scope = afVarE;
        this.listeners = new CopyOnWriteArrayList<>();
        aj.z(afVarE, null, null, new AnonymousClass1(camera2CameraAvailabilityMonitor, str, this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.camera.camera2.pipe.compat.CameraAvailabilityMonitor.Session
    /* renamed from: awaitAvailableCamera-KLykuaI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo1007awaitAvailableCameraKLykuaI(long r8, kotlinx.coroutines.am<h.ab> r10, h.c.e<? super java.lang.Boolean> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1 r0 = (androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1 r0 = new androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.CompletableDeferred r8 = (kotlinx.coroutines.CompletableDeferred) r8
            e.b.c.b(r11)
            goto L81
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            e.b.c.b(r11)
            java.util.concurrent.CopyOnWriteArrayList<kotlinx.coroutines.CompletableDeferred<h.ab>> r11 = r7.listeners
            kotlinx.coroutines.CompletableDeferred r2 = kotlinx.coroutines.bo.j()
            r11.add(r2)
            kotlinx.coroutines.g.k r11 = new kotlinx.coroutines.g.k
            h.c.j r4 = r0.getContext()
            r11.<init>(r4)
            r4 = r11
            kotlinx.coroutines.g.k r4 = (kotlinx.coroutines.g.k) r4
            kotlinx.coroutines.g.e r4 = r2.h()
            androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1$1 r5 = new androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1$1
            r6 = 0
            r5.<init>(r6)
            h.g.a.p r5 = (h.g.a.p) r5
            r11.k(r4, r5)
            org.a.d.a r10 = r10.cb()
            androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1$2 r4 = new androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1$2
            r4.<init>(r6)
            h.g.a.l r4 = (h.g.a.l) r4
            r11.n(r10, r4)
            androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1$3 r10 = new androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1$3
            r10.<init>(r6)
            h.g.a.l r10 = (h.g.a.l) r10
            long r8 = kotlinx.coroutines.aj.o(r8)
            kotlinx.coroutines.g.d.a(r11, r8, r10)
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r11 = r11.d(r0)
            if (r11 == r1) goto L8c
            r8 = r2
        L81:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            r11.booleanValue()
            java.util.concurrent.CopyOnWriteArrayList<kotlinx.coroutines.CompletableDeferred<h.ab>> r7 = r7.listeners
            r7.remove(r8)
            return r11
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2.mo1007awaitAvailableCameraKLykuaI(long, kotlinx.coroutines.am, h.c.e):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        aj.h(this.scope, null);
    }
}
