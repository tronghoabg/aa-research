package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rup implements defpackage.ruo {
    private final java.lang.Object a = new java.lang.Object();
    private final java.util.Queue b = new java.util.ArrayDeque();
    private defpackage.ruo c = null;

    @Override // defpackage.ruo
    public final void a(com.google.android.gms.car.senderprotocol.ChannelMessage channelMessage) {
        synchronized (this.a) {
            defpackage.ruo ruoVar = this.c;
            if (ruoVar != null) {
                ruoVar.a(channelMessage);
            } else {
                this.b.add(channelMessage);
            }
        }
    }

    final void b(defpackage.ruo ruoVar) {
        com.google.android.gms.car.senderprotocol.ChannelMessage channelMessage;
        synchronized (this.a) {
            defpackage.ysr.bj(this.c == null);
        }
        while (true) {
            synchronized (this.a) {
                channelMessage = (com.google.android.gms.car.senderprotocol.ChannelMessage) this.b.poll();
                if (channelMessage == null) {
                    this.c = ruoVar;
                    return;
                }
            }
            ruoVar.a(channelMessage);
        }
    }
}
