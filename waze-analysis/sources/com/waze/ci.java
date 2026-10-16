package com.waze;

import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ci {

    /* renamed from: a, reason: collision with root package name */
    private static final List f22414a = h.a.i.i(new ch(ImageTypeToIconMapping$ImageType.Preferred, com.waze.design_components.b.d.bX), new ch(ImageTypeToIconMapping$ImageType.Traffic, com.waze.design_components.b.d.bY), new ch(ImageTypeToIconMapping$ImageType.Accident, com.waze.design_components.b.d.bD), new ch(ImageTypeToIconMapping$ImageType.Construction, com.waze.design_components.b.d.bL), new ch(ImageTypeToIconMapping$ImageType.Pothole, com.waze.design_components.b.d.bM), new ch(ImageTypeToIconMapping$ImageType.BrokenTrafficLight, com.waze.design_components.b.d.bK), new ch(ImageTypeToIconMapping$ImageType.Weather, com.waze.design_components.b.d.bR), new ch(ImageTypeToIconMapping$ImageType.SlipperyRoad, com.waze.design_components.b.d.bV), new ch(ImageTypeToIconMapping$ImageType.Flood, com.waze.design_components.b.d.bW), new ch(ImageTypeToIconMapping$ImageType.UnplowedRoad, com.waze.design_components.b.d.bP), new ch(ImageTypeToIconMapping$ImageType.Fog, com.waze.design_components.b.d.bN), new ch(ImageTypeToIconMapping$ImageType.IcyRoad, com.waze.design_components.b.d.bO), new ch(ImageTypeToIconMapping$ImageType.BlockedLane, com.waze.design_components.b.d.bE));

    public static final com.waze.design_components.b.d a(int i2) {
        ImageTypeToIconMapping$ImageType next;
        Object next2;
        Iterator<ImageTypeToIconMapping$ImageType> it = ImageTypeToIconMapping$ImageType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((int) next.getNumericValue()) == i2) {
                break;
            }
        }
        ImageTypeToIconMapping$ImageType imageTypeToIconMapping$ImageType = next;
        if (imageTypeToIconMapping$ImageType != null) {
            Iterator it2 = f22414a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((ch) next2).a() == imageTypeToIconMapping$ImageType) {
                    break;
                }
            }
            ch chVar = (ch) next2;
            if (chVar != null) {
                return chVar.b();
            }
        }
        return null;
    }
}
