package androidx.camera.camera2.pipe;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.view.Surface;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraGraph.Session;
import androidx.camera.camera2.pipe.Metadata;
import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.g.a.l;
import h.g.a.q;
import h.g.b.x;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.af;
import kotlinx.coroutines.am;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraGraphBase<TSession extends CameraGraph.Session> extends AutoCloseable {
    public static final Companion Companion = Companion.$$INSTANCE;

    Object acquireSession(e<? super TSession> eVar);

    TSession acquireSessionOrNull();

    ch<GraphState> getGraphState();

    CameraGraphId getId();

    k<FrameInfo> getLatestFrameInfo();

    k<FrameNumber> getLatestFrameNumber();

    RequestListeners getListeners();

    Parameters getParameters();

    StreamGraph getStreams();

    boolean isForeground();

    /* renamed from: lock3A-vIrNa9k, reason: not valid java name */
    am<Result3A> mo542lock3AvIrNa9k(AeMode aeMode, AfMode afMode, AwbMode awbMode, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, Lock3ABehavior lock3ABehavior, Lock3ABehavior lock3ABehavior2, Lock3ABehavior lock3ABehavior3, AeMode aeMode2, l<? super FrameMetadata, Boolean> lVar, l<? super FrameMetadata, Boolean> lVar2, int i2, long j2, long j3);

    void setForeground(boolean z);

    /* renamed from: setSurface-NYG5g8E, reason: not valid java name */
    void mo543setSurfaceNYG5g8E(int i2, Surface surface);

    void start();

    void stop();

    am<Result3A> unlock3A(Boolean bool, Boolean bool2, Boolean bool3, l<? super FrameMetadata, Boolean> lVar, int i2, long j2);

    /* renamed from: updateAudioRestrictionMode-LwUUkyU, reason: not valid java name */
    void mo544updateAudioRestrictionModeLwUUkyU(int i2);

    <T> Object useSession(q<? super af, ? super TSession, ? super e<? super T>, ? extends Object> qVar, e<? super T> eVar);

    <T> am<T> useSessionIn(af afVar, q<? super af, ? super TSession, ? super e<? super T>, ? extends Object> qVar);

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.CameraGraphBase$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: lock3A-vIrNa9k$default, reason: not valid java name */
        public static /* synthetic */ am m545lock3AvIrNa9k$default(CameraGraphBase cameraGraphBase, AeMode aeMode, AfMode afMode, AwbMode awbMode, List list, List list2, List list3, Lock3ABehavior lock3ABehavior, Lock3ABehavior lock3ABehavior2, Lock3ABehavior lock3ABehavior3, AeMode aeMode2, l lVar, l lVar2, int i2, long j2, long j3, int i3, Object obj) {
            if (obj == null) {
                return cameraGraphBase.mo542lock3AvIrNa9k(1 == (i3 & 1) ? null : aeMode, (i3 & 2) != 0 ? null : afMode, (i3 & 4) != 0 ? null : awbMode, (i3 & 8) != 0 ? null : list, (i3 & 16) != 0 ? null : list2, (i3 & 32) != 0 ? null : list3, (i3 & 64) != 0 ? null : lock3ABehavior, (i3 & 128) != 0 ? null : lock3ABehavior2, (i3 & 256) != 0 ? null : lock3ABehavior3, (i3 & 512) != 0 ? null : aeMode2, (i3 & 1024) != 0 ? null : lVar, (i3 & 2048) == 0 ? lVar2 : null, (i3 & 4096) != 0 ? 60 : i2, (i3 & 8192) != 0 ? 3000000000L : j2, (i3 & 16384) != 0 ? 3000000000L : j3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock3A-vIrNa9k");
        }

        public static <T> k<T> subscribeToLatestFrameResult(CameraGraphBase cameraGraphBase, CaptureResult.Key<T> key, l<? super RequestMetadata, Boolean> lVar) {
            return CameraGraphBase.Companion.subscribeToLatestFrameResult(cameraGraphBase, key, lVar);
        }

        public static k<LatestFrameMetadata> subscribeToLatestFrameResults(CameraGraphBase<?> cameraGraphBase, Set<? extends CaptureResult.Key<?>> set, Set<? extends Metadata.Key<?>> set2, l<? super RequestMetadata, Boolean> lVar) {
            return CameraGraphBase.Companion.subscribeToLatestFrameResults(cameraGraphBase, set, set2, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ am unlock3A$default(CameraGraphBase cameraGraphBase, Boolean bool, Boolean bool2, Boolean bool3, l lVar, int i2, long j2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock3A");
            }
            if (1 == (i3 & 1)) {
                bool = null;
            }
            if ((i3 & 2) != 0) {
                bool2 = null;
            }
            if ((i3 & 4) != 0) {
                bool3 = null;
            }
            if ((i3 & 8) != 0) {
                lVar = null;
            }
            if ((i3 & 16) != 0) {
                i2 = 60;
            }
            if ((i3 & 32) != 0) {
                j2 = CameraGraph.Constants3A.DEFAULT_TIME_LIMIT_NS;
            }
            return cameraGraphBase.unlock3A(bool, bool2, bool3, lVar, i2, j2);
        }

        public static <T> k<T> subscribeToLatestFrameResult(CameraGraphBase cameraGraphBase, Metadata.Key<T> key, l<? super RequestMetadata, Boolean> lVar) {
            return CameraGraphBase.Companion.subscribeToLatestFrameResult(cameraGraphBase, key, lVar);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ k subscribeToLatestFrameResult$default(Companion companion, CameraGraphBase cameraGraphBase, CaptureResult.Key key, l lVar, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                lVar = null;
            }
            return companion.subscribeToLatestFrameResult(cameraGraphBase, key, (l<? super RequestMetadata, Boolean>) lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ k subscribeToLatestFrameResults$default(Companion companion, CameraGraphBase cameraGraphBase, Set set, Set set2, l lVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                set = e.c.d.a.p();
            }
            if ((i2 & 2) != 0) {
                set2 = e.c.d.a.p();
            }
            if ((i2 & 4) != 0) {
                lVar = null;
            }
            return companion.subscribeToLatestFrameResults(cameraGraphBase, set, set2, lVar);
        }

        public final <T> k<T> subscribeToLatestFrameResult(CameraGraphBase cameraGraphBase, final CaptureResult.Key<T> key, l<? super RequestMetadata, Boolean> lVar) {
            x.f(cameraGraphBase, "<this>");
            x.f(key, "captureResultKey");
            final k kVarSubscribeToLatestFrameResults$default = subscribeToLatestFrameResults$default(this, cameraGraphBase, e.c.d.a.o(key), null, lVar, 2, null);
            return new k() { // from class: androidx.camera.camera2.pipe.CameraGraphBase$Companion$subscribeToLatestFrameResult$$inlined$map$1

                /* compiled from: WazeSource */
                /* renamed from: androidx.camera.camera2.pipe.CameraGraphBase$Companion$subscribeToLatestFrameResult$$inlined$map$1$2, reason: invalid class name */
                public final class AnonymousClass2<T> implements kotlinx.coroutines.b.l {
                    final /* synthetic */ CaptureResult.Key $captureResultKey$inlined;
                    final /* synthetic */ kotlinx.coroutines.b.l $this_unsafeFlow;

                    /* renamed from: androidx.camera.camera2.pipe.CameraGraphBase$Companion$subscribeToLatestFrameResult$$inlined$map$1$2$1, reason: invalid class name */
                    public final class AnonymousClass1 extends c {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(e eVar) {
                            super(eVar);
                        }

                        @Override // h.c.b.a.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(kotlinx.coroutines.b.l lVar, CaptureResult.Key key) {
                        this.$this_unsafeFlow = lVar;
                        this.$captureResultKey$inlined = key;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.b.l
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r5, h.c.e r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof androidx.camera.camera2.pipe.CameraGraphBase$Companion$subscribeToLatestFrameResult$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            androidx.camera.camera2.pipe.CameraGraphBase$Companion$subscribeToLatestFrameResult$$inlined$map$1$2$1 r0 = (androidx.camera.camera2.pipe.CameraGraphBase$Companion$subscribeToLatestFrameResult$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            androidx.camera.camera2.pipe.CameraGraphBase$Companion$subscribeToLatestFrameResult$$inlined$map$1$2$1 r0 = new androidx.camera.camera2.pipe.CameraGraphBase$Companion$subscribeToLatestFrameResult$$inlined$map$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            h.c.a.a r1 = h.c.a.a.f48038a
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L2f
                            if (r2 != r3) goto L27
                            e.b.c.b(r6)
                            goto L48
                        L27:
                            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                            r4.<init>(r5)
                            throw r4
                        L2f:
                            e.b.c.b(r6)
                            kotlinx.coroutines.b.l r6 = r4.$this_unsafeFlow
                            r2 = r0
                            h.c.e r2 = (h.c.e) r2
                            androidx.camera.camera2.pipe.LatestFrameMetadata r5 = (androidx.camera.camera2.pipe.LatestFrameMetadata) r5
                            android.hardware.camera2.CaptureResult$Key r4 = r4.$captureResultKey$inlined
                            java.lang.Object r4 = r5.get(r4)
                            r0.label = r3
                            java.lang.Object r4 = r6.emit(r4, r0)
                            if (r4 != r1) goto L48
                            return r1
                        L48:
                            h.ab r4 = h.ab.f48028a
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.CameraGraphBase$Companion$subscribeToLatestFrameResult$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, h.c.e):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.b.k
                public Object collect(kotlinx.coroutines.b.l lVar2, e eVar) {
                    Object objCollect = kVarSubscribeToLatestFrameResults$default.collect(new AnonymousClass2(lVar2, key), eVar);
                    return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
                }
            };
        }

        public final k<LatestFrameMetadata> subscribeToLatestFrameResults(CameraGraphBase<?> cameraGraphBase, Set<? extends CaptureResult.Key<?>> set, Set<? extends Metadata.Key<?>> set2, l<? super RequestMetadata, Boolean> lVar) {
            x.f(cameraGraphBase, "<this>");
            x.f(set, "captureResultKeys");
            x.f(set2, "metadataKeys");
            return ai.u(ai.n(new CameraGraphBase$Companion$subscribeToLatestFrameResults$1(set, set2, lVar, cameraGraphBase, null)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ k subscribeToLatestFrameResult$default(Companion companion, CameraGraphBase cameraGraphBase, Metadata.Key key, l lVar, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                lVar = null;
            }
            return companion.subscribeToLatestFrameResult(cameraGraphBase, key, (l<? super RequestMetadata, Boolean>) lVar);
        }

        public final <T> k<T> subscribeToLatestFrameResult(CameraGraphBase cameraGraphBase, final Metadata.Key<T> key, l<? super RequestMetadata, Boolean> lVar) {
            x.f(cameraGraphBase, "<this>");
            x.f(key, "metadataKey");
            final k kVarSubscribeToLatestFrameResults$default = subscribeToLatestFrameResults$default(this, cameraGraphBase, null, e.c.d.a.o(key), lVar, 1, null);
            return new k() { // from class: androidx.camera.camera2.pipe.CameraGraphBase$Companion$subscribeToLatestFrameResult$$inlined$map$2

                /* compiled from: WazeSource */
                /* renamed from: androidx.camera.camera2.pipe.CameraGraphBase$Companion$subscribeToLatestFrameResult$$inlined$map$2$2, reason: invalid class name */
                public final class AnonymousClass2<T> implements kotlinx.coroutines.b.l {
                    final /* synthetic */ Metadata.Key $metadataKey$inlined;
                    final /* synthetic */ kotlinx.coroutines.b.l $this_unsafeFlow;

                    /* renamed from: androidx.camera.camera2.pipe.CameraGraphBase$Companion$subscribeToLatestFrameResult$$inlined$map$2$2$1, reason: invalid class name */
                    public final class AnonymousClass1 extends c {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(e eVar) {
                            super(eVar);
                        }

                        @Override // h.c.b.a.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(kotlinx.coroutines.b.l lVar, Metadata.Key key) {
                        this.$this_unsafeFlow = lVar;
                        this.$metadataKey$inlined = key;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.b.l
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r5, h.c.e r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof androidx.camera.camera2.pipe.CameraGraphBase$Companion$subscribeToLatestFrameResult$$inlined$map$2.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            androidx.camera.camera2.pipe.CameraGraphBase$Companion$subscribeToLatestFrameResult$$inlined$map$2$2$1 r0 = (androidx.camera.camera2.pipe.CameraGraphBase$Companion$subscribeToLatestFrameResult$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            androidx.camera.camera2.pipe.CameraGraphBase$Companion$subscribeToLatestFrameResult$$inlined$map$2$2$1 r0 = new androidx.camera.camera2.pipe.CameraGraphBase$Companion$subscribeToLatestFrameResult$$inlined$map$2$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            h.c.a.a r1 = h.c.a.a.f48038a
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L2f
                            if (r2 != r3) goto L27
                            e.b.c.b(r6)
                            goto L48
                        L27:
                            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                            r4.<init>(r5)
                            throw r4
                        L2f:
                            e.b.c.b(r6)
                            kotlinx.coroutines.b.l r6 = r4.$this_unsafeFlow
                            r2 = r0
                            h.c.e r2 = (h.c.e) r2
                            androidx.camera.camera2.pipe.LatestFrameMetadata r5 = (androidx.camera.camera2.pipe.LatestFrameMetadata) r5
                            androidx.camera.camera2.pipe.Metadata$Key r4 = r4.$metadataKey$inlined
                            java.lang.Object r4 = r5.get(r4)
                            r0.label = r3
                            java.lang.Object r4 = r6.emit(r4, r0)
                            if (r4 != r1) goto L48
                            return r1
                        L48:
                            h.ab r4 = h.ab.f48028a
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.CameraGraphBase$Companion$subscribeToLatestFrameResult$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, h.c.e):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.b.k
                public Object collect(kotlinx.coroutines.b.l lVar2, e eVar) {
                    Object objCollect = kVarSubscribeToLatestFrameResults$default.collect(new AnonymousClass2(lVar2, key), eVar);
                    return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
                }
            };
        }
    }
}
