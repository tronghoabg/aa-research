package com.waze.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class MapNativeManager extends bh implements eq {
    private static MapNativeManager sInstance;
    private final Set<bd> mainCanvasListeners = new HashSet();
    private final Set<be> shareDriveCanvasListeners = new HashSet();
    private Boolean wazeMapAsPrimaryEnabled = null;

    public static synchronized MapNativeManager getInstance() {
        MapNativeManager mapNativeManager;
        mapNativeManager = sInstance;
        if (mapNativeManager == null) {
            mapNativeManager = new MapNativeManager();
            sInstance = mapNativeManager;
        }
        return mapNativeManager;
    }

    public static boolean hasInstance() {
        return sInstance != null;
    }

    public void addMainMapListener(bd bdVar) {
        this.mainCanvasListeners.add(bdVar);
    }

    public void addShareDriveCanvasListener(be beVar) {
        this.shareDriveCanvasListeners.add(beVar);
    }

    public native boolean getIsWazeMapAsPrimaryEnabledNTV();

    public native void initNativeLayerNTV();

    boolean isPopupShownWithType(int i2) {
        bq bqVarE = com.waze.t.e();
        if (bqVarE == null) {
            return false;
        }
        return bqVarE.v(i2);
    }

    @Override // com.waze.map.eq
    public boolean isWazeMapAsPrimaryEnabled() {
        Boolean boolValueOf;
        Boolean bool = this.wazeMapAsPrimaryEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (this) {
            boolValueOf = Boolean.valueOf(getIsWazeMapAsPrimaryEnabledNTV());
            this.wazeMapAsPrimaryEnabled = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    void onMapClicked() {
        Iterator<bd> it = this.mainCanvasListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    void onMapDragged() {
        Iterator<bd> it = this.mainCanvasListeners.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    void onMapIsDarkOverlayShownChanged(boolean z) {
        Iterator<bd> it = this.mainCanvasListeners.iterator();
        while (it.hasNext()) {
            it.next().b(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void onMapObjectTapped(com.waze.jni.protos.MapAdObject r6) {
        /*
            r5 = this;
            java.lang.Class<com.waze.map.isolated.h> r5 = com.waze.map.isolated.h.class
            java.lang.Object r5 = com.waze.web.r.h(r5)
            com.waze.map.isolated.h r5 = (com.waze.map.isolated.h) r5
            java.lang.String r0 = "<this>"
            h.g.b.x.f(r6, r0)
            boolean r0 = r6.hasPosition()
            r1 = 0
            if (r0 != 0) goto L15
            goto L74
        L15:
            com.waze.jni.protos.MapAdObject$PinType r0 = r6.getPinType()
            com.waze.jni.protos.MapAdObject$PinType r2 = com.waze.jni.protos.MapAdObject.PinType.PIN_TYPE_UNSPECIFIED
            int r0 = r0.ordinal()
            if (r0 == 0) goto L37
            r2 = 1
            if (r0 == r2) goto L34
            r2 = 2
            if (r0 == r2) goto L31
            r2 = 3
            if (r0 != r2) goto L2b
            goto L37
        L2b:
            h.i r5 = new h.i
            r5.<init>()
            throw r5
        L31:
            com.waze.map.isolated.a r0 = com.waze.map.isolated.a.f29208b
            goto L38
        L34:
            com.waze.map.isolated.a r0 = com.waze.map.isolated.a.f29207a
            goto L38
        L37:
            r0 = r1
        L38:
            if (r0 != 0) goto L3b
            goto L74
        L3b:
            com.waze.shared_infra.h.c r2 = new com.waze.shared_infra.h.c
            com.waze.jni.protos.Position$IntPosition r3 = r6.getPosition()
            int r3 = r3.getLatitude()
            com.waze.jni.protos.Position$IntPosition r4 = r6.getPosition()
            int r4 = r4.getLongitude()
            r2.<init>(r3, r4)
            java.lang.String r3 = r6.getVenueId()
            java.lang.String r4 = "getVenueId(...)"
            h.g.b.x.e(r3, r4)
            java.lang.String r6 = r6.getVenueContext()
            if (r6 == 0) goto L6a
            r4 = r6
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r4 = r4.length()
            if (r4 > 0) goto L69
            goto L6a
        L69:
            r1 = r6
        L6a:
            com.waze.map.isolated.e r6 = new com.waze.map.isolated.e
            r6.<init>(r0, r2, r3, r1)
            com.waze.map.isolated.f r1 = new com.waze.map.isolated.f
            r1.<init>(r6)
        L74:
            if (r1 == 0) goto L79
            r5.a(r1)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.MapNativeManager.onMapObjectTapped(com.waze.jni.protos.MapAdObject):void");
    }

    void onShareDriveCanvasDragged() {
        Iterator<be> it = this.shareDriveCanvasListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    void onShareDriveCanvasTapped() {
        Iterator<be> it = this.shareDriveCanvasListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void removeMainMapListener(bd bdVar) {
        this.mainCanvasListeners.remove(bdVar);
    }

    public void removeShareDriveCanvasListener(be beVar) {
        this.shareDriveCanvasListeners.remove(beVar);
    }
}
