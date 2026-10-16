package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class etg {
    final android.content.IntentFilter a;
    final android.content.BroadcastReceiver b;
    boolean c;
    boolean d;

    public etg(android.content.IntentFilter intentFilter, android.content.BroadcastReceiver broadcastReceiver) {
        this.a = intentFilter;
        this.b = broadcastReceiver;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.b);
        sb.append(" filter=");
        sb.append(this.a);
        if (this.d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
