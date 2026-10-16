package com.waze.map;

import com.waze.jni.protos.map.TouchData;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class el {
    public static com.waze.map.canvas.bk a(com.waze.map.b.o oVar) {
        h.g.b.x.f(oVar, "<this>");
        return new com.waze.map.canvas.bk(oVar.h(), oVar.i(), oVar.g(), oVar.k());
    }

    public static kotlinx.coroutines.b.k b(kotlinx.coroutines.b.k kVar) {
        h.g.b.x.f(kVar, "<this>");
        return kotlinx.coroutines.b.ai.y(new com.waze.map.canvas.ai(kVar, 4));
    }

    public static boolean c(com.waze.map.canvas.bj bjVar) {
        h.g.b.x.f(bjVar, "<this>");
        return bjVar == com.waze.map.canvas.bj.f28602d;
    }

    public static boolean d(com.waze.map.canvas.bj bjVar) {
        h.g.b.x.f(bjVar, "<this>");
        return bjVar == com.waze.map.canvas.bj.f28601c;
    }

    public void onTouchCancel(String str, TouchData touchData) {
        h.g.b.x.f(str, "mapId");
        h.g.b.x.f(touchData, "touchData");
        byte[] byteArray = touchData.toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        ((NativeMapTouchController) this).onTouchCancelNTV(str, byteArray);
    }

    public void onTouchMoved(String str, TouchData touchData) {
        h.g.b.x.f(str, "mapId");
        h.g.b.x.f(touchData, "touchData");
        byte[] byteArray = touchData.toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        ((NativeMapTouchController) this).onTouchMovedNTV(str, byteArray);
    }

    public void onTouchPressed(String str, TouchData touchData) {
        h.g.b.x.f(str, "mapId");
        h.g.b.x.f(touchData, "touchData");
        byte[] byteArray = touchData.toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        ((NativeMapTouchController) this).onTouchPressedNTV(str, byteArray);
    }

    public void onTouchReleased(String str, TouchData touchData) {
        h.g.b.x.f(str, "mapId");
        h.g.b.x.f(touchData, "touchData");
        byte[] byteArray = touchData.toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        ((NativeMapTouchController) this).onTouchReleasedNTV(str, byteArray);
    }
}
