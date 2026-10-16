package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uyf {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public /* synthetic */ uyf(byte[] bArr) {
        this.a = 1;
        this.b = 1;
        this.c = 1;
        this.d = 1;
        this.e = 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.uyf)) {
            return false;
        }
        defpackage.uyf uyfVar = (defpackage.uyf) obj;
        int i = uyfVar.a;
        int i2 = uyfVar.b;
        int i3 = uyfVar.c;
        int i4 = uyfVar.d;
        int i5 = uyfVar.e;
        return true;
    }

    public final int hashCode() {
        return 954305;
    }

    public final java.lang.String toString() {
        return "LiveLaneVisualization(routeExpression=POLYLINE_ONLY, cameraZoomLevel=DEFAULT, nudgeCardStatus=HIDE, chevronTrackMode=POLYLINE_SNAPPED, chevronDisplayMode=DEFAULT)";
    }

    public uyf() {
        this(null);
    }
}
