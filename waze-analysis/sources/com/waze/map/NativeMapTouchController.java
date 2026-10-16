package com.waze.map;

import android.view.MotionEvent;
import com.waze.jni.protos.map.TouchData;
import com.waze.jni.protos.map.TouchPoint;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NativeMapTouchController extends el implements com.waze.map.isolated.c {
    private final Executor eventExecutor;
    private final String mapId;

    public NativeMapTouchController(String str, Executor executor) {
        h.g.b.x.f(str, "mapId");
        h.g.b.x.f(executor, "eventExecutor");
        this.mapId = str;
        this.eventExecutor = executor;
    }

    private final int convertToMotionEvent(com.waze.map.isolated.t tVar) {
        com.waze.map.isolated.t tVar2 = com.waze.map.isolated.t.f29248a;
        int iOrdinal = tVar.ordinal();
        if (iOrdinal == 0) {
            return 5;
        }
        if (iOrdinal == 1) {
            return 0;
        }
        if (iOrdinal == 2) {
            return 6;
        }
        if (iOrdinal == 3) {
            return 1;
        }
        if (iOrdinal == 4) {
            return 2;
        }
        if (iOrdinal == 5) {
            return 3;
        }
        throw new h.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onTouchEventHandler(int i2, long j2, List<com.waze.map.isolated.r> list) {
        TouchData.Builder builderNewBuilder = TouchData.newBuilder();
        List<com.waze.map.isolated.r> list2 = list;
        ArrayList arrayList = new ArrayList(h.a.i.q(list2, 10));
        for (com.waze.map.isolated.r rVar : list2) {
            TouchPoint.Builder builderNewBuilder2 = TouchPoint.newBuilder();
            builderNewBuilder2.setX((int) rVar.a());
            builderNewBuilder2.setY((int) rVar.b());
            arrayList.add(builderNewBuilder2.build());
        }
        int i3 = i2 & 255;
        builderNewBuilder.addAllPoints(arrayList);
        builderNewBuilder.setTimestampMs(j2);
        TouchData touchDataBuild = builderNewBuilder.build();
        h.g.b.x.e(touchDataBuild, "build(...)");
        TouchData touchData = touchDataBuild;
        if (i3 == 0) {
            onTouchPressed(this.mapId, touchData);
        } else if (i3 == 1) {
            onTouchReleased(this.mapId, touchData);
        } else if (i3 == 2) {
            onTouchMoved(this.mapId, touchData);
        } else {
            if (i3 == 3) {
                onTouchCancel(this.mapId, touchData);
                return false;
            }
            if (i3 != 5) {
                if (i3 != 6) {
                    return false;
                }
                onTouchReleased(this.mapId, touchData);
            } else {
                onTouchPressed(this.mapId, touchData);
            }
        }
        return true;
    }

    public final Executor getEventExecutor() {
        return this.eventExecutor;
    }

    public final String getMapId() {
        return this.mapId;
    }

    public final native void onTouchCancelNTV(String str, byte[] bArr);

    @Override // com.waze.map.isolated.c
    public void onTouchEvent(final com.waze.map.isolated.t tVar, final List<com.waze.map.isolated.r> list) {
        h.g.b.x.f(tVar, "eventAction");
        h.g.b.x.f(list, "screenCoordinates");
        this.eventExecutor.execute(new Runnable() { // from class: com.waze.map.ej
            @Override // java.lang.Runnable
            public final void run() {
                NativeMapTouchController nativeMapTouchController = this.f28837a;
                nativeMapTouchController.onTouchEventHandler(nativeMapTouchController.convertToMotionEvent(tVar), System.currentTimeMillis(), list);
            }
        });
    }

    public final native void onTouchMovedNTV(String str, byte[] bArr);

    public final native void onTouchPressedNTV(String str, byte[] bArr);

    public final native void onTouchReleasedNTV(String str, byte[] bArr);

    @Override // com.waze.map.isolated.c
    public void onTouchEvent(MotionEvent motionEvent) {
        h.g.b.x.f(motionEvent, "aEvent");
        this.eventExecutor.execute(new p(this, motionEvent, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTouchEventHandler(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            arrayList.add(new com.waze.map.isolated.r(motionEvent.getX(i2), motionEvent.getY(i2)));
        }
        onTouchEventHandler(motionEvent.getAction(), motionEvent.getEventTime(), arrayList);
    }
}
