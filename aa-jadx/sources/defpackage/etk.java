package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class etk extends defpackage.etv {
    final /* synthetic */ android.support.v4.os.ResultReceiver a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etk(java.lang.Object obj, android.support.v4.os.ResultReceiver resultReceiver) {
        super(obj);
        this.a = resultReceiver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.etv
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
        if ((this.h & 4) != 0 || obj == 0) {
            this.a.b(-1, null);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArray("search_results", (android.os.Parcelable[]) obj.toArray(new android.support.v4.media.MediaBrowserCompat.MediaItem[0]));
        this.a.b(0, bundle);
    }
}
