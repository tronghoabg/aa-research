package defpackage;

/* loaded from: classes3.dex */
public final class uxj {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public /* synthetic */ uxj(byte[] bArr) {
        this.a = 1;
        this.b = 1;
        this.c = 1;
        this.d = 1;
        this.e = 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxj)) {
            return false;
        }
        uxj uxjVar = (uxj) obj;
        int i = uxjVar.a;
        int i2 = uxjVar.b;
        int i3 = uxjVar.c;
        int i4 = uxjVar.d;
        int i5 = uxjVar.e;
        return true;
    }

    public final int hashCode() {
        return 954305;
    }

    public final String toString() {
        return "LiveLaneVisualization(routeExpression=POLYLINE_ONLY, cameraZoomLevel=DEFAULT, nudgeCardStatus=HIDE, chevronTrackMode=POLYLINE_SNAPPED, chevronDisplayMode=DEFAULT)";
    }

    public uxj() {
        this(null);
    }
}
