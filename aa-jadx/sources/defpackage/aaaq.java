package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aaaq {
    private final int a;

    public aaaq(int i) {
        this.a = i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TiltEvent{eventType=");
        int i = this.a;
        if (i == 0) {
            sb.append("EVENT_TYPE_ON_TILTING");
        } else if (i != 1) {
            sb.append("EVENT_TYPE_ON_TILT_END");
        } else {
            sb.append("EVENT_TYPE_ON_TILT_BEGIN");
        }
        sb.append('}');
        return sb.toString();
    }
}
