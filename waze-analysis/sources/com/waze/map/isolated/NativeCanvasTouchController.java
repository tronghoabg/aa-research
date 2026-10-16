package com.waze.map.isolated;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NativeCanvasTouchController implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f29197a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.native_managers.i f29198b;

    public NativeCanvasTouchController(String str, com.waze.native_managers.i iVar) {
        h.g.b.x.f(str, "canvasId");
        h.g.b.x.f(iVar, "taskScheduler");
        this.f29197a = str;
        this.f29198b = iVar;
    }

    static final void a(NativeCanvasTouchController nativeCanvasTouchController, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            arrayList.add(new r(motionEvent.getX(i2), motionEvent.getY(i2)));
        }
        nativeCanvasTouchController.c(motionEvent.getAction(), arrayList);
    }

    static final void b(NativeCanvasTouchController nativeCanvasTouchController, t tVar, List list) {
        t tVar2 = t.f29248a;
        int iOrdinal = tVar.ordinal();
        int i2 = 5;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i2 = 0;
            } else if (iOrdinal == 2) {
                i2 = 6;
            } else if (iOrdinal == 3) {
                i2 = 1;
            } else if (iOrdinal == 4) {
                i2 = 2;
            } else {
                if (iOrdinal != 5) {
                    throw new h.i();
                }
                i2 = 3;
            }
        }
        nativeCanvasTouchController.c(i2, list);
    }

    private final void c(int i2, List list) {
        int iMin = Math.min(list.size(), 3);
        int[] iArr = new int[iMin + iMin];
        for (int i3 = 0; i3 < iMin; i3++) {
            int i4 = i3 + i3;
            iArr[i4] = (int) ((r) list.get(i3)).a();
            iArr[i4 + 1] = (int) ((r) list.get(i3)).b();
        }
        int i5 = i2 & 255;
        if (i5 == 0) {
            onTouchPressedNTV(this.f29197a, iArr);
            return;
        }
        if (i5 != 1) {
            if (i5 == 2) {
                onTouchMovedNTV(this.f29197a, iArr);
                return;
            }
            if (i5 == 3) {
                onTouchCancelNTV(this.f29197a, iArr);
                return;
            }
            if (i5 == 5) {
                String str = this.f29197a;
                if (iMin == 3) {
                    onTouchTap3NTV(str, iArr);
                    return;
                } else {
                    onTouchPressedNTV(str, iArr);
                    return;
                }
            }
            if (i5 != 6) {
                return;
            }
        }
        onTouchReleasedNTV(this.f29197a, iArr);
    }

    private final native void onTouchCancelNTV(String str, int[] iArr);

    private final native void onTouchMovedNTV(String str, int[] iArr);

    private final native void onTouchPressedNTV(String str, int[] iArr);

    private final native void onTouchReleasedNTV(String str, int[] iArr);

    private final native void onTouchTap3NTV(String str, int[] iArr);

    @Override // com.waze.map.isolated.c
    public final void onTouchEvent(final t tVar, final List<r> list) {
        h.g.b.x.f(tVar, "eventAction");
        h.g.b.x.f(list, "screenCoordinates");
        this.f29198b.post(com.waze.native_managers.h.f30692b, new Runnable() { // from class: com.waze.map.isolated.p
            @Override // java.lang.Runnable
            public final void run() {
                NativeCanvasTouchController.b(this.f29241a, tVar, list);
            }
        });
    }

    @Override // com.waze.map.isolated.c
    public final void onTouchEvent(final MotionEvent motionEvent) {
        h.g.b.x.f(motionEvent, "aEvent");
        this.f29198b.post(com.waze.native_managers.h.f30692b, new Runnable() { // from class: com.waze.map.isolated.o
            @Override // java.lang.Runnable
            public final void run() {
                NativeCanvasTouchController.a(this.f29239a, motionEvent);
            }
        });
    }
}
