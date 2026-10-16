package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aaal {
    private final int a;

    public aaal(int i) {
        this.a = i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RotateEvent{eventType=");
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
