package androidx.camera.viewfinder.core;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ZoomGestureDetector {
    private static final int ANCHORED_ZOOM_MODE_DOUBLE_TAP = 1;
    private static final int ANCHORED_ZOOM_MODE_NONE = 0;
    private static final int ANCHORED_ZOOM_MODE_STYLUS = 2;
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_MIN_SPAN = 0;
    private static final float SCALE_FACTOR = 0.5f;
    private int anchoredZoomMode;
    private float anchoredZoomStartX;
    private float anchoredZoomStartY;
    private final Context context;
    private float currentSpan;
    private float currentSpanX;
    private float currentSpanY;
    private boolean eventBeforeOrAboveStartingGestureEvent;
    private long eventTime;
    private int focusX;
    private int focusY;
    private GestureDetector gestureDetector;
    private float initialSpan;
    private boolean isInProgress;
    private boolean isQuickZoomEnabled;
    private boolean isStylusZoomEnabled;
    private final OnZoomGestureListener listener;
    private final int minSpan;
    private long prevTime;
    private float previousSpan;
    private float previousSpanX;
    private float previousSpanY;
    private final int spanSlop;

    /* compiled from: WazeSource */
    public interface OnZoomGestureListener {
        boolean onZoomEvent(ZoomEvent zoomEvent);
    }

    public ZoomGestureDetector(Context context, int i2, int i3, OnZoomGestureListener onZoomGestureListener) {
        x.f(context, "context");
        x.f(onZoomGestureListener, "listener");
        this.context = context;
        this.spanSlop = i2;
        this.minSpan = i3;
        this.listener = onZoomGestureListener;
        this.isQuickZoomEnabled = true;
        this.isStylusZoomEnabled = true;
        this.gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: androidx.camera.viewfinder.core.ZoomGestureDetector$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                x.f(motionEvent, "e");
                this.this$0.anchoredZoomStartX = motionEvent.getX();
                this.this$0.anchoredZoomStartY = motionEvent.getY();
                this.this$0.anchoredZoomMode = 1;
                return true;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e A[PHI: r0
  0x001e: PHI (r0v4 float) = (r0v3 float), (r0v10 float) binds: [B:10:0x001b, B:7:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final float getIncrementalScaleFactor() {
        /*
            r6 = this;
            boolean r0 = r6.inAnchoredZoomMode()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L39
            boolean r0 = r6.eventBeforeOrAboveStartingGestureEvent
            float r2 = r6.currentSpan
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L17
            float r0 = r6.previousSpan
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 < 0) goto L1f
            goto L1e
        L17:
            float r0 = r6.previousSpan
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 <= 0) goto L1e
            goto L1f
        L1e:
            r3 = r4
        L1f:
            float r2 = r2 / r0
            float r0 = r1 - r2
            float r0 = java.lang.Math.abs(r0)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r2
            float r2 = r6.previousSpan
            int r6 = r6.spanSlop
            float r6 = (float) r6
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 > 0) goto L33
            return r1
        L33:
            if (r3 == 0) goto L37
            float r0 = r0 + r1
            return r0
        L37:
            float r1 = r1 - r0
            return r1
        L39:
            float r0 = r6.previousSpan
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L44
            float r6 = r6.currentSpan
            float r6 = r6 / r0
            return r6
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.viewfinder.core.ZoomGestureDetector.getIncrementalScaleFactor():float");
    }

    private final boolean inAnchoredZoomMode() {
        return this.anchoredZoomMode != 0;
    }

    public final long getTimeDelta() {
        return this.eventTime - this.prevTime;
    }

    public final boolean isQuickZoomEnabled() {
        return this.isQuickZoomEnabled;
    }

    public final boolean isStylusZoomEnabled() {
        return this.isStylusZoomEnabled;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0159 A[PHI: r7
  0x0159: PHI (r7v9 boolean) = (r7v8 boolean), (r7v8 boolean), (r7v14 boolean) binds: [B:80:0x012c, B:82:0x0130, B:87:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.viewfinder.core.ZoomGestureDetector.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setQuickZoomEnabled(boolean z) {
        this.isQuickZoomEnabled = z;
    }

    public final void setStylusZoomEnabled(boolean z) {
        this.isStylusZoomEnabled = z;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    public abstract class ZoomEvent {
        private final long eventTime;
        private final int focusX;
        private final int focusY;

        /* compiled from: WazeSource */
        public final class Begin extends ZoomEvent {
            public Begin(long j2, int i2, int i3) {
                super(j2, i2, i3, null);
            }
        }

        /* compiled from: WazeSource */
        public final class End extends ZoomEvent {
            private final float incrementalScaleFactor;

            public End(long j2, int i2, int i3, float f2) {
                super(j2, i2, i3, null);
                this.incrementalScaleFactor = f2;
            }

            public final float getIncrementalScaleFactor() {
                return this.incrementalScaleFactor;
            }
        }

        /* compiled from: WazeSource */
        public final class Move extends ZoomEvent {
            private final float incrementalScaleFactor;

            public Move(long j2, int i2, int i3, float f2) {
                super(j2, i2, i3, null);
                this.incrementalScaleFactor = f2;
            }

            public final float getIncrementalScaleFactor() {
                return this.incrementalScaleFactor;
            }
        }

        private ZoomEvent(long j2, int i2, int i3) {
            this.eventTime = j2;
            this.focusX = i2;
            this.focusY = i3;
        }

        public final long getEventTime() {
            return this.eventTime;
        }

        public final int getFocusX() {
            return this.focusX;
        }

        public final int getFocusY() {
            return this.focusY;
        }

        public /* synthetic */ ZoomEvent(long j2, int i2, int i3, o oVar) {
            this(j2, i2, i3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZoomGestureDetector(Context context, OnZoomGestureListener onZoomGestureListener) {
        this(context, 0, 0, onZoomGestureListener, 6, null);
        x.f(context, "context");
        x.f(onZoomGestureListener, "listener");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZoomGestureDetector(Context context, int i2, OnZoomGestureListener onZoomGestureListener) {
        this(context, i2, 0, onZoomGestureListener, 4, null);
        x.f(context, "context");
        x.f(onZoomGestureListener, "listener");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ZoomGestureDetector(Context context, int i2, int i3, OnZoomGestureListener onZoomGestureListener, int i4, o oVar) {
        if ((i4 & 2) != 0) {
            int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            i2 = scaledTouchSlop + scaledTouchSlop;
        }
        this(context, i2, (i4 & 4) != 0 ? 0 : i3, onZoomGestureListener);
    }
}
