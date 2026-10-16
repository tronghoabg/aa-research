package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class etj extends defpackage.etv {
    final /* synthetic */ android.support.v4.os.ResultReceiver a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etj(java.lang.Object obj, android.support.v4.os.ResultReceiver resultReceiver) {
        super(obj);
        this.a = resultReceiver;
    }

    @Override // defpackage.etv
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
        android.support.v4.media.MediaBrowserCompat.MediaItem mediaItem = (android.support.v4.media.MediaBrowserCompat.MediaItem) obj;
        if ((this.h & 2) != 0) {
            this.a.b(-1, null);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("media_item", mediaItem);
        this.a.b(0, bundle);
    }
}
