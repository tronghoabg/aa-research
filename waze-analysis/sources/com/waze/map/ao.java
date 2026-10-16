package com.waze.map;

import com.waze.jni.protos.NavigationSegment;
import com.waze.jni.protos.map.MapLine;
import com.waze.jni.protos.map.MapLineIntersectionMetadata;
import com.waze.native_managers.WazeNativeLooperDispatcher;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class ao {
    private final WazeNativeLooperDispatcher wazeNativeLooperDispatcher;

    public ao(WazeNativeLooperDispatcher wazeNativeLooperDispatcher) {
        h.g.b.x.f(wazeNativeLooperDispatcher, "wazeNativeLooperDispatcher");
        this.wazeNativeLooperDispatcher = wazeNativeLooperDispatcher;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void findIntersectionMetadata$default(ao aoVar, int i2, int i3, h.g.a.l lVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findIntersectionMetadata");
        }
        if ((i4 & 4) != 0) {
            lVar = null;
        }
        aoVar.findIntersectionMetadata(i2, i3, lVar);
    }

    static final byte[] findIntersectionMetadata$lambda$0(ao aoVar, int i2, int i3) {
        h.g.b.x.d(aoVar, "null cannot be cast to non-null type com.waze.map.MapLineResolverNativeManager");
        return ((MapLineResolverNativeManager) aoVar).findIntersectionMetadataNTV(i2, i3);
    }

    static final h.ab findIntersectionMetadata$lambda$1(h.g.a.l lVar, byte[] bArr) {
        MapLineIntersectionMetadata mapLineIntersectionMetadata = null;
        if (bArr != null) {
            try {
                mapLineIntersectionMetadata = (MapLineIntersectionMetadata) MapLineIntersectionMetadata.parser().c(bArr);
            } catch (com.google.v.eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(mapLineIntersectionMetadata);
            }
        } else if (lVar != null) {
            lVar.invoke(null);
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void findNearestLine$default(ao aoVar, int i2, int i3, h.g.a.l lVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findNearestLine");
        }
        if ((i4 & 4) != 0) {
            lVar = null;
        }
        aoVar.findNearestLine(i2, i3, lVar);
    }

    static final byte[] findNearestLine$lambda$0(ao aoVar, int i2, int i3) {
        h.g.b.x.d(aoVar, "null cannot be cast to non-null type com.waze.map.MapLineResolverNativeManager");
        return ((MapLineResolverNativeManager) aoVar).findNearestLineNTV(i2, i3);
    }

    static final h.ab findNearestLine$lambda$1(h.g.a.l lVar, byte[] bArr) {
        MapLine mapLine = null;
        if (bArr != null) {
            try {
                mapLine = (MapLine) MapLine.parser().c(bArr);
            } catch (com.google.v.eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(mapLine);
            }
        } else if (lVar != null) {
            lVar.invoke(null);
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void resolveSegmentToLine$default(ao aoVar, NavigationSegment navigationSegment, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolveSegmentToLine");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        aoVar.resolveSegmentToLine(navigationSegment, lVar);
    }

    static final byte[] resolveSegmentToLine$lambda$0(ao aoVar, NavigationSegment navigationSegment) {
        h.g.b.x.d(aoVar, "null cannot be cast to non-null type com.waze.map.MapLineResolverNativeManager");
        byte[] byteArray = navigationSegment.toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        return ((MapLineResolverNativeManager) aoVar).resolveSegmentToLineNTV(byteArray);
    }

    static final h.ab resolveSegmentToLine$lambda$1(h.g.a.l lVar, byte[] bArr) {
        MapLine mapLine = null;
        if (bArr != null) {
            try {
                mapLine = (MapLine) MapLine.parser().c(bArr);
            } catch (com.google.v.eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(mapLine);
            }
        } else if (lVar != null) {
            lVar.invoke(null);
        }
        return h.ab.f48028a;
    }

    public void findIntersectionMetadata(int i2, int i3, h.g.a.l<? super MapLineIntersectionMetadata, h.ab> lVar) {
        com.waze.aj.b.c(this.wazeNativeLooperDispatcher, new an(this, i2, i3, 1), new i(lVar, 7));
    }

    public void findNearestLine(int i2, int i3, h.g.a.l<? super MapLine, h.ab> lVar) {
        com.waze.aj.b.c(this.wazeNativeLooperDispatcher, new an(this, i2, i3, 0), new i(lVar, 8));
    }

    public final WazeNativeLooperDispatcher getWazeNativeLooperDispatcher() {
        return this.wazeNativeLooperDispatcher;
    }

    public void resolveSegmentToLine(NavigationSegment navigationSegment, h.g.a.l<? super MapLine, h.ab> lVar) {
        h.g.b.x.f(navigationSegment, "segment");
        com.waze.aj.b.c(this.wazeNativeLooperDispatcher, new r(this, navigationSegment, 4), new i(lVar, 9));
    }

    public final void findIntersectionMetadata(int i2, int i3) {
        findIntersectionMetadata$default(this, i2, i3, null, 4, null);
    }

    public final void findNearestLine(int i2, int i3) {
        findNearestLine$default(this, i2, i3, null, 4, null);
    }

    public final void resolveSegmentToLine(NavigationSegment navigationSegment) {
        h.g.b.x.f(navigationSegment, "segment");
        resolveSegmentToLine$default(this, navigationSegment, null, 2, null);
    }
}
