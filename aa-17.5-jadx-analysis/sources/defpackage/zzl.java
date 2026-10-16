package defpackage;

/* loaded from: classes3.dex */
public final class zzl {
    private final int a;

    public zzl(int i) {
        this.a = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TiltEvent{eventType=");
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
