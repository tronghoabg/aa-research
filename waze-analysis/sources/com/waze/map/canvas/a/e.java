package com.waze.map.canvas.a;

import com.waze.jni.protos.map.MapBounds;
import com.waze.jni.protos.map.MapConfiguration;
import com.waze.jni.protos.map.MapContent;
import com.waze.map.b.dp;
import com.waze.map.b.dq;
import h.ab;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface e {
    Object addJniAdapter(c cVar, h.c.e<? super com.waze.shared_infra.s.d> eVar);

    void cleanupAndClose();

    Object generateEtaLabelPositions(List<dp> list, List<com.waze.shared_infra.h.c> list2, h.c.e<? super Map<Long, dq>> eVar);

    boolean getSupportPolylines();

    boolean getSupportShowingLoader();

    Object initialize(h.c.e<? super ab> eVar);

    Object performZoomIn(h.c.e<? super ab> eVar);

    Object performZoomOut(h.c.e<? super ab> eVar);

    Object setDarkenHighlight(com.waze.shared_infra.h.c cVar, h.c.e<? super ab> eVar);

    Object setShowMapLoader(boolean z, h.c.e<? super ab> eVar);

    Object setUserLocationOffset(MapBounds.PositionPercentage positionPercentage, boolean z, h.c.e<? super ab> eVar);

    Object updateMapBounds(MapBounds mapBounds, h.c.e<? super ab> eVar);

    Object updateMapConfiguration(MapConfiguration mapConfiguration, h.c.e<? super ab> eVar);

    Object updateMapContent(MapContent mapContent, h.c.e<? super ab> eVar);
}
