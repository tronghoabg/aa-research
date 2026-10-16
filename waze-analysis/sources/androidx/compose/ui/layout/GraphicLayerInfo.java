package androidx.compose.ui.layout;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface GraphicLayerInfo {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.layout.GraphicLayerInfo$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static long $default$getOwnerViewId(GraphicLayerInfo graphicLayerInfo) {
            return 0L;
        }

        public static /* synthetic */ long access$getOwnerViewId$jd(GraphicLayerInfo graphicLayerInfo) {
            return 0L;
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static long getOwnerViewId(GraphicLayerInfo graphicLayerInfo) {
            return 0L;
        }
    }

    long getLayerId();

    long getOwnerViewId();
}
