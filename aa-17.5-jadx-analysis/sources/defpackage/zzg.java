package defpackage;

/* loaded from: classes3.dex */
public final class zzg {
    private final int a;

    public zzg(int i) {
        this.a = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RotateEvent{eventType=");
        int i = this.a;
        if (i == 0) {
            sb.append("EVENT_TYPE_ON_ROTATE");
        } else if (i != 1) {
            sb.append("EVENT_TYPE_ON_ROTATE_END");
        } else {
            sb.append("EVENT_TYPE_ON_ROTATE_BEGIN");
        }
        sb.append('}');
        return sb.toString();
    }
}
