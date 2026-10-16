package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class dk extends android.os.Handler {
    boolean a;
    final /* synthetic */ defpackage.dl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk(defpackage.dl dlVar, android.os.Looper looper) {
        super(looper);
        this.b = dlVar;
        this.a = false;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        if (this.a) {
            switch (message.what) {
                case 1:
                    android.support.v4.media.session.MediaSessionCompat.c(message.getData());
                    break;
                case 2:
                    this.b.d((android.support.v4.media.session.PlaybackStateCompat) message.obj);
                    break;
                case 3:
                    this.b.c((android.support.v4.media.MediaMetadataCompat) message.obj);
                    break;
                case 4:
                    this.b.a((defpackage.dn) message.obj);
                    break;
                case 5:
                    this.b.e((java.util.List) message.obj);
                    break;
                case 6:
                    break;
                case 7:
                    android.os.Bundle bundle = (android.os.Bundle) message.obj;
                    android.support.v4.media.session.MediaSessionCompat.c(bundle);
                    this.b.b(bundle);
                    break;
                case 8:
                    this.b.f();
                    break;
                case 9:
                    ((java.lang.Integer) message.obj).intValue();
                    break;
                case 11:
                    ((java.lang.Boolean) message.obj).booleanValue();
                    break;
                case 12:
                    ((java.lang.Integer) message.obj).intValue();
                    break;
            }
        }
    }
}
