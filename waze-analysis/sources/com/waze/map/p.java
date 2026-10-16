package com.waze.map;

import android.view.MotionEvent;
import com.waze.jni.protos.MapAdObject;
import com.waze.jni.protos.map.DisplayRects;
import com.waze.jni.protos.map.MapMovementChanged;
import com.waze.jni.protos.map.MapVisibleAreaChanged;
import com.waze.jni.protos.map.ScreenPoint;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f29586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29587b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f29588c;

    public /* synthetic */ p(u uVar, String str, int i2) {
        this.f29588c = i2;
        this.f29587b = uVar;
        this.f29586a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29588c) {
            case 0:
                u.onMapDataShownJNI$lambda$0((u) this.f29586a, (DisplayRects) this.f29587b);
                break;
            case 1:
                u.onCanvasCreatedJNI$lambda$0((u) this.f29587b, (String) this.f29586a);
                break;
            case 2:
                u.OnFallthroughClickOnMapJNI$lambda$0((u) this.f29586a, (ScreenPoint) this.f29587b);
                break;
            case 3:
                u.onMarkerSelectedJNI$lambda$0((u) this.f29587b, (String) this.f29586a);
                break;
            case 4:
                u.onMapVisibleAreaChangedJNI$lambda$0((u) this.f29586a, (MapVisibleAreaChanged) this.f29587b);
                break;
            case 5:
                u.onCanvasDestroyedJNI$lambda$0((u) this.f29587b, (String) this.f29586a);
                break;
            case 6:
                u.onMapMovementStateChangedJNI$lambda$0((u) this.f29586a, (MapMovementChanged) this.f29587b);
                break;
            case 7:
                bh.onMapObjectTappedJNI$lambda$0((bh) this.f29586a, (MapAdObject) this.f29587b);
                break;
            default:
                ((NativeMapTouchController) this.f29586a).onTouchEventHandler((MotionEvent) this.f29587b);
                break;
        }
    }

    public /* synthetic */ p(Object obj, Object obj2, int i2) {
        this.f29588c = i2;
        this.f29586a = obj;
        this.f29587b = obj2;
    }
}
