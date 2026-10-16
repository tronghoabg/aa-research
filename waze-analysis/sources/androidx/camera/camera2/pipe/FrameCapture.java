package androidx.camera.camera2.pipe;

import androidx.camera.camera2.pipe.Frame;
import e.a.h.ad;
import h.a.r;
import h.ab;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.ao;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface FrameCapture extends AutoCloseable {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        private final Object useEachFrame$$forInline(List<? extends FrameCapture> list, l<? super Frame, ab> lVar, e<? super ab> eVar) {
            ao aoVar = new ao();
            while (aoVar.f48103a < list.size()) {
                try {
                    FrameCapture frameCapture = list.get(aoVar.f48103a);
                    try {
                        int i2 = aoVar.f48103a;
                        aoVar.f48103a = i2 + 1;
                        Integer.valueOf(i2).intValue();
                        FrameCapture frameCapture2 = frameCapture;
                        frameCapture = (AutoCloseable) frameCapture2.awaitFrame(null);
                        try {
                            FrameCapture$Companion$$ExternalSyntheticAutoCloseableDispatcher0.m(frameCapture2);
                            lVar.invoke((Frame) frameCapture);
                            r.y(frameCapture, null);
                            r.y(frameCapture, null);
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            }
            while (aoVar.f48103a < list.size()) {
                try {
                    int i3 = aoVar.f48103a;
                    aoVar.f48103a = i3 + 1;
                    FrameCapture$Companion$$ExternalSyntheticAutoCloseableDispatcher0.m(list.get(i3));
                } catch (Throwable unused) {
                }
            }
            return ab.f48028a;
        }

        private final <R> Object useEachFrameAsync$$forInline(List<? extends FrameCapture> list, af afVar, q<? super af, ? super Frame, ? super e<? super R>, ? extends Object> qVar, e<? super List<? extends am<? extends R>>> eVar) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(aj.y(afVar, null, ag.f51345d, new FrameCapture$Companion$useEachFrameAsync$$inlined$useEachFrameIndexedAsync$1(list.get(i2), i2, null, qVar), 1));
            }
            return arrayList;
        }

        private final Object useEachFrameIndexed$$forInline(List<? extends FrameCapture> list, p<? super Integer, ? super Frame, ab> pVar, e<? super ab> eVar) {
            ao aoVar = new ao();
            while (aoVar.f48103a < list.size()) {
                try {
                    FrameCapture frameCapture = list.get(aoVar.f48103a);
                    try {
                        int i2 = aoVar.f48103a;
                        aoVar.f48103a = i2 + 1;
                        FrameCapture frameCapture2 = frameCapture;
                        int iIntValue = Integer.valueOf(i2).intValue();
                        frameCapture = (AutoCloseable) frameCapture2.awaitFrame(null);
                        try {
                            FrameCapture$Companion$$ExternalSyntheticAutoCloseableDispatcher0.m(frameCapture2);
                            pVar.invoke(Integer.valueOf(iIntValue), (Frame) frameCapture);
                            r.y(frameCapture, null);
                            r.y(frameCapture, null);
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            }
            while (aoVar.f48103a < list.size()) {
                try {
                    int i3 = aoVar.f48103a;
                    aoVar.f48103a = i3 + 1;
                    FrameCapture$Companion$$ExternalSyntheticAutoCloseableDispatcher0.m(list.get(i3));
                } catch (Throwable unused) {
                }
            }
            return ab.f48028a;
        }

        private final <R> Object useEachFrameIndexedAsync$$forInline(List<? extends FrameCapture> list, af afVar, h.g.a.r<? super af, ? super Integer, ? super Frame, ? super e<? super R>, ? extends Object> rVar, e<? super List<? extends am<? extends R>>> eVar) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(aj.y(afVar, null, ag.f51345d, new FrameCapture$Companion$useEachFrameIndexedAsync$$inlined$useEachIndexedAsync$1(list.get(i2), i2, null, rVar), 1));
            }
            return arrayList;
        }

        private final <R> Object useFrame$$forInline(FrameCapture frameCapture, l<? super Frame, ? extends R> lVar, e<? super R> eVar) throws Exception {
            FrameCapture frameCapture2 = frameCapture;
            try {
                FrameCapture frameCapture3 = frameCapture2;
                frameCapture2 = (AutoCloseable) frameCapture3.awaitFrame(null);
                try {
                    FrameCapture$Companion$$ExternalSyntheticAutoCloseableDispatcher0.m(frameCapture3);
                    R rInvoke = lVar.invoke((Frame) frameCapture2);
                    r.y(frameCapture2, null);
                    r.y(frameCapture2, null);
                    return rInvoke;
                } finally {
                }
            } finally {
            }
        }

        public final void useEach(List<? extends FrameCapture> list, l<? super FrameCapture, ab> lVar) {
            x.f(list, "<this>");
            x.f(lVar, "action");
            int i2 = 0;
            while (i2 < list.size()) {
                try {
                    FrameCapture frameCapture = list.get(i2);
                    i2++;
                    try {
                        lVar.invoke(frameCapture);
                        r.y(frameCapture, null);
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        while (i2 < list.size()) {
                            int i3 = i2 + 1;
                            try {
                                FrameCapture$Companion$$ExternalSyntheticAutoCloseableDispatcher0.m(list.get(i2));
                            } catch (Throwable th3) {
                                ad.c(th, th3);
                            }
                            i2 = i3;
                        }
                        throw th2;
                    }
                }
            }
            while (i2 < list.size()) {
                int i4 = i2 + 1;
                try {
                    FrameCapture$Companion$$ExternalSyntheticAutoCloseableDispatcher0.m(list.get(i2));
                } catch (Throwable unused) {
                }
                i2 = i4;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[LOOP:0: B:21:0x005c->B:90:0x005c, LOOP_START] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0077 A[Catch: all -> 0x00d5, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00d5, blocks: (B:19:0x0054, B:27:0x0077), top: B:73:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x009a -> B:72:0x00a2). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object useEachFrame(java.util.List<? extends androidx.camera.camera2.pipe.FrameCapture> r8, h.g.a.l<? super androidx.camera.camera2.pipe.Frame, h.ab> r9, h.c.e<? super h.ab> r10) {
            /*
                Method dump skipped, instructions count: 246
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.FrameCapture.Companion.useEachFrame(java.util.List, h.g.a.l, h.c.e):java.lang.Object");
        }

        public final <R> Object useEachFrameAsync(List<? extends FrameCapture> list, af afVar, q<? super af, ? super Frame, ? super e<? super R>, ? extends Object> qVar, e<? super List<? extends am<? extends R>>> eVar) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(aj.y(afVar, null, ag.f51345d, new FrameCapture$Companion$useEachFrameAsync$$inlined$useEachFrameIndexedAsync$1(list.get(i2), i2, null, qVar), 1));
            }
            return arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[LOOP:0: B:21:0x0059->B:83:0x0059, LOOP_START] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0074 A[Catch: all -> 0x00ce, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x00ce, blocks: (B:19:0x0051, B:27:0x0074), top: B:78:0x0051 }] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x009b -> B:32:0x00a1). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object useEachFrameIndexed(java.util.List<? extends androidx.camera.camera2.pipe.FrameCapture> r9, h.g.a.p<? super java.lang.Integer, ? super androidx.camera.camera2.pipe.Frame, h.ab> r10, h.c.e<? super h.ab> r11) {
            /*
                Method dump skipped, instructions count: 239
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.FrameCapture.Companion.useEachFrameIndexed(java.util.List, h.g.a.p, h.c.e):java.lang.Object");
        }

        public final <R> Object useEachFrameIndexedAsync(List<? extends FrameCapture> list, af afVar, h.g.a.r<? super af, ? super Integer, ? super Frame, ? super e<? super R>, ? extends Object> rVar, e<? super List<? extends am<? extends R>>> eVar) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(aj.y(afVar, null, ag.f51345d, new FrameCapture$Companion$useEachFrameIndexedAsync$$inlined$useEachIndexedAsync$1(list.get(i2), i2, null, rVar), 1));
            }
            return arrayList;
        }

        public final void useEachIndexed(List<? extends FrameCapture> list, p<? super Integer, ? super FrameCapture, ab> pVar) {
            int i2;
            Throwable th;
            x.f(list, "<this>");
            x.f(pVar, "action");
            int i3 = 0;
            while (i3 < list.size()) {
                try {
                    FrameCapture frameCapture = list.get(i3);
                    i2 = i3 + 1;
                    try {
                        pVar.invoke(Integer.valueOf(i3), frameCapture);
                        try {
                            r.y(frameCapture, null);
                            i3 = i2;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } finally {
                                while (i2 < list.size()) {
                                    int i4 = i2 + 1;
                                    try {
                                        FrameCapture$Companion$$ExternalSyntheticAutoCloseableDispatcher0.m(list.get(i2));
                                    } catch (Throwable th3) {
                                        ad.c(th, th3);
                                    }
                                    i2 = i4;
                                }
                            }
                        }
                    } finally {
                    }
                } catch (Throwable th4) {
                    i2 = i3;
                    th = th4;
                }
            }
            while (i3 < list.size()) {
                int i5 = i3 + 1;
                try {
                    FrameCapture$Companion$$ExternalSyntheticAutoCloseableDispatcher0.m(list.get(i3));
                } catch (Throwable unused) {
                }
                i3 = i5;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <R> java.lang.Object useFrame(androidx.camera.camera2.pipe.FrameCapture r6, h.g.a.l<? super androidx.camera.camera2.pipe.Frame, ? extends R> r7, h.c.e<? super R> r8) throws java.lang.Exception {
            /*
                r5 = this;
                boolean r0 = r8 instanceof androidx.camera.camera2.pipe.FrameCapture$Companion$useFrame$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.camera.camera2.pipe.FrameCapture$Companion$useFrame$1 r0 = (androidx.camera.camera2.pipe.FrameCapture$Companion$useFrame$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.camera.camera2.pipe.FrameCapture$Companion$useFrame$1 r0 = new androidx.camera.camera2.pipe.FrameCapture$Companion$useFrame$1
                r0.<init>(r5, r8)
            L18:
                java.lang.Object r5 = r0.result
                h.c.a.a r8 = h.c.a.a.f48038a
                int r1 = r0.label
                r2 = 1
                if (r1 == 0) goto L40
                if (r1 != r2) goto L38
                java.lang.Object r6 = r0.L$2
                androidx.camera.camera2.pipe.FrameCapture r6 = (androidx.camera.camera2.pipe.FrameCapture) r6
                java.lang.Object r7 = r0.L$1
                java.lang.AutoCloseable r7 = (java.lang.AutoCloseable) r7
                java.lang.Object r8 = r0.L$0
                h.g.a.l r8 = (h.g.a.l) r8
                e.b.c.b(r5)     // Catch: java.lang.Throwable -> L36
                r4 = r8
                r8 = r7
                r7 = r4
                goto L59
            L36:
                r5 = move-exception
                goto L7b
            L38:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L40:
                e.b.c.b(r5)
                r5 = r6
                java.lang.AutoCloseable r5 = (java.lang.AutoCloseable) r5
                r6 = r5
                androidx.camera.camera2.pipe.FrameCapture r6 = (androidx.camera.camera2.pipe.FrameCapture) r6     // Catch: java.lang.Throwable -> L78
                r0.L$0 = r7     // Catch: java.lang.Throwable -> L78
                r0.L$1 = r5     // Catch: java.lang.Throwable -> L78
                r0.L$2 = r6     // Catch: java.lang.Throwable -> L78
                r0.label = r2     // Catch: java.lang.Throwable -> L78
                java.lang.Object r0 = r6.awaitFrame(r0)     // Catch: java.lang.Throwable -> L78
                if (r0 == r8) goto L77
                r8 = r5
                r5 = r0
            L59:
                java.lang.AutoCloseable r5 = (java.lang.AutoCloseable) r5     // Catch: java.lang.Throwable -> L74
                r0 = r5
                androidx.camera.camera2.pipe.Frame r0 = (androidx.camera.camera2.pipe.Frame) r0     // Catch: java.lang.Throwable -> L6d
                androidx.camera.camera2.pipe.FrameCapture$Companion$$ExternalSyntheticAutoCloseableDispatcher0.m(r6)     // Catch: java.lang.Throwable -> L6d
                java.lang.Object r6 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L6d
                r7 = 0
                h.a.r.y(r5, r7)     // Catch: java.lang.Throwable -> L74
                h.a.r.y(r8, r7)
                return r6
            L6d:
                r6 = move-exception
                throw r6     // Catch: java.lang.Throwable -> L6f
            L6f:
                r7 = move-exception
                h.a.r.y(r5, r6)     // Catch: java.lang.Throwable -> L74
                throw r7     // Catch: java.lang.Throwable -> L74
            L74:
                r5 = move-exception
                r7 = r8
                goto L7b
            L77:
                return r8
            L78:
                r6 = move-exception
                r7 = r5
                r5 = r6
            L7b:
                throw r5     // Catch: java.lang.Throwable -> L7c
            L7c:
                r6 = move-exception
                h.a.r.y(r7, r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.FrameCapture.Companion.useFrame(androidx.camera.camera2.pipe.FrameCapture, h.g.a.l, h.c.e):java.lang.Object");
        }
    }

    void addListener(Frame.Listener listener);

    Object awaitFrame(e<? super Frame> eVar);

    Frame getFrame();

    Request getRequest();

    /* renamed from: getStatus-U7r42EA, reason: not valid java name */
    int mo675getStatusU7r42EA();
}
