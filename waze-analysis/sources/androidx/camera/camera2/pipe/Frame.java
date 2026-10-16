package androidx.camera.camera2.pipe;

import androidx.camera.camera2.pipe.FrameReference;
import androidx.camera.camera2.pipe.media.OutputImage;
import e.a.h.ad;
import h.a.r;
import h.ab;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import h.j;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface Frame extends FrameReference, AutoCloseable {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.Frame$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: $default$awaitImage-NYG5g8E, reason: not valid java name */
        public static Object m648$default$awaitImageNYG5g8E(Frame frame, int i2, e eVar) {
            return null;
        }

        /* renamed from: $default$getImage-aKI5c8E, reason: not valid java name */
        public static OutputImage m650$default$getImageaKI5c8E(Frame frame, int i2) {
            return null;
        }

        /* renamed from: $default$getImage-iYJqvbA, reason: not valid java name */
        public static OutputImage m651$default$getImageiYJqvbA(Frame frame, int i2) {
            throw new j("An operation is not implemented: Not yet implemented");
        }

        /* renamed from: $default$getImages-aKI5c8E, reason: not valid java name */
        public static List m652$default$getImagesaKI5c8E(Frame frame, int i2) {
            throw new j("An operation is not implemented: Not yet implemented");
        }

        /* renamed from: access$awaitImage-NYG5g8E$jd, reason: not valid java name */
        public static /* synthetic */ Object m654access$awaitImageNYG5g8E$jd(Frame frame, int i2, e eVar) {
            return null;
        }

        /* renamed from: access$getImage-aKI5c8E$jd, reason: not valid java name */
        public static /* synthetic */ OutputImage m656access$getImageaKI5c8E$jd(Frame frame, int i2) {
            return null;
        }

        /* renamed from: awaitImage-A9nWXxg$suspendImpl, reason: not valid java name */
        public static /* synthetic */ Object m660awaitImageA9nWXxg$suspendImpl(Frame frame, int i2, e<? super OutputImage> eVar) {
            throw new j("An operation is not implemented: Not yet implemented");
        }

        /* renamed from: awaitImage-NYG5g8E$suspendImpl, reason: not valid java name */
        public static /* synthetic */ Object m661awaitImageNYG5g8E$suspendImpl(Frame frame, int i2, e<? super OutputImage> eVar) {
            return null;
        }

        /* renamed from: awaitImages-NYG5g8E$suspendImpl, reason: not valid java name */
        public static /* synthetic */ Object m662awaitImagesNYG5g8E$suspendImpl(Frame frame, int i2, e<? super List<? extends OutputImage>> eVar) {
            throw new j("An operation is not implemented: Not yet implemented");
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Request getRequest(Frame frame) {
            x.f(frame, "<this>");
            return frame.getRequestMetadata().getRequest();
        }

        public final boolean isFrameInfoAvailable(FrameReference frameReference) {
            x.f(frameReference, "<this>");
            return OutputStatus.m744equalsimpl0(frameReference.mo698getFrameInfoStatusU7r42EA(), OutputStatus.Companion.m748getAVAILABLEU7r42EA());
        }

        /* renamed from: isImageAvailable-og7wgUk, reason: not valid java name */
        public final boolean m663isImageAvailableog7wgUk(FrameReference frameReference, int i2) {
            x.f(frameReference, "$this$isImageAvailable");
            return OutputStatus.m744equalsimpl0(frameReference.mo701imageStatusBWjvHWQ(i2), OutputStatus.Companion.m748getAVAILABLEU7r42EA());
        }

        /* renamed from: isImageAvailable-vKMW96A, reason: not valid java name */
        public final boolean m664isImageAvailablevKMW96A(FrameReference frameReference, int i2) {
            x.f(frameReference, "$this$isImageAvailable");
            return OutputStatus.m744equalsimpl0(frameReference.mo702imageStatusOo2lJfM(i2), OutputStatus.Companion.m748getAVAILABLEU7r42EA());
        }

        public final void useEach(List<? extends Frame> list, l<? super Frame, ab> lVar) {
            x.f(list, "<this>");
            x.f(lVar, "action");
            int i2 = 0;
            while (i2 < list.size()) {
                try {
                    Frame frame = list.get(i2);
                    i2++;
                    try {
                        lVar.invoke(frame);
                        r.y(frame, null);
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        while (i2 < list.size()) {
                            int i3 = i2 + 1;
                            try {
                                Frame$Companion$$ExternalSyntheticAutoCloseableDispatcher0.m(list.get(i2));
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
                    Frame$Companion$$ExternalSyntheticAutoCloseableDispatcher0.m(list.get(i2));
                } catch (Throwable unused) {
                }
                i2 = i4;
            }
        }

        public final void useEachIndexed(List<? extends Frame> list, p<? super Integer, ? super Frame, ab> pVar) {
            int i2;
            Throwable th;
            x.f(list, "<this>");
            x.f(pVar, "action");
            int i3 = 0;
            while (i3 < list.size()) {
                try {
                    Frame frame = list.get(i3);
                    i2 = i3 + 1;
                    try {
                        pVar.invoke(Integer.valueOf(i3), frame);
                        try {
                            r.y(frame, null);
                            i3 = i2;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } finally {
                                while (i2 < list.size()) {
                                    int i4 = i2 + 1;
                                    try {
                                        Frame$Companion$$ExternalSyntheticAutoCloseableDispatcher0.m(list.get(i2));
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
                    Frame$Companion$$ExternalSyntheticAutoCloseableDispatcher0.m(list.get(i3));
                } catch (Throwable unused) {
                }
                i3 = i5;
            }
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        /* renamed from: awaitImage-A9nWXxg, reason: not valid java name */
        public static Object m665awaitImageA9nWXxg(Frame frame, int i2, e<? super OutputImage> eVar) {
            return CC.m660awaitImageA9nWXxg$suspendImpl(frame, i2, eVar);
        }

        @Deprecated
        /* renamed from: awaitImage-NYG5g8E, reason: not valid java name */
        public static Object m666awaitImageNYG5g8E(Frame frame, int i2, e<? super OutputImage> eVar) {
            return null;
        }

        @Deprecated
        /* renamed from: awaitImages-NYG5g8E, reason: not valid java name */
        public static Object m667awaitImagesNYG5g8E(Frame frame, int i2, e<? super List<? extends OutputImage>> eVar) {
            return CC.m662awaitImagesNYG5g8E$suspendImpl(frame, i2, eVar);
        }

        @Deprecated
        /* renamed from: getImage-aKI5c8E, reason: not valid java name */
        public static OutputImage m668getImageaKI5c8E(Frame frame, int i2) {
            return null;
        }

        @Deprecated
        /* renamed from: getImage-iYJqvbA, reason: not valid java name */
        public static OutputImage m669getImageiYJqvbA(Frame frame, int i2) {
            return CC.m651$default$getImageiYJqvbA(frame, i2);
        }

        @Deprecated
        /* renamed from: getImages-aKI5c8E, reason: not valid java name */
        public static List<OutputImage> m670getImagesaKI5c8E(Frame frame, int i2) {
            return CC.m652$default$getImagesaKI5c8E(frame, i2);
        }

        @Deprecated
        /* renamed from: imageStatus-BWjvHWQ, reason: not valid java name */
        public static int m671imageStatusBWjvHWQ(Frame frame, int i2) {
            return FrameReference.CC.m703$default$imageStatusBWjvHWQ(frame, i2);
        }
    }

    void addListener(Listener listener);

    Object awaitFrameInfo(e<? super FrameInfo> eVar);

    /* renamed from: awaitImage-A9nWXxg, reason: not valid java name */
    Object mo641awaitImageA9nWXxg(int i2, e<? super OutputImage> eVar);

    /* renamed from: awaitImage-NYG5g8E, reason: not valid java name */
    Object mo642awaitImageNYG5g8E(int i2, e<? super OutputImage> eVar);

    /* renamed from: awaitImages-NYG5g8E, reason: not valid java name */
    Object mo643awaitImagesNYG5g8E(int i2, e<? super List<? extends OutputImage>> eVar);

    FrameInfo getFrameInfo();

    /* renamed from: getImage-aKI5c8E, reason: not valid java name */
    OutputImage mo644getImageaKI5c8E(int i2);

    /* renamed from: getImage-iYJqvbA, reason: not valid java name */
    OutputImage mo645getImageiYJqvbA(int i2);

    /* renamed from: getImages-aKI5c8E, reason: not valid java name */
    List<OutputImage> mo646getImagesaKI5c8E(int i2);

    /* compiled from: WazeSource */
    public interface Listener {
        void onFrameComplete();

        void onFrameInfoAvailable();

        /* renamed from: onFrameStarted-cfZT-5Y, reason: not valid java name */
        void m672onFrameStartedcfZT5Y(long j2, long j3);

        /* renamed from: onImageAvailable-aKI5c8E, reason: not valid java name */
        void m673onImageAvailableaKI5c8E(int i2);

        void onImagesAvailable();

        /* compiled from: WazeSource */
        /* renamed from: androidx.camera.camera2.pipe.Frame$Listener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            /* renamed from: $default$onImageAvailable-aKI5c8E, reason: not valid java name */
            public static void m674$default$onImageAvailableaKI5c8E(Listener listener, int i2) {
            }
        }
    }
}
