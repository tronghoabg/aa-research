package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.maps.GoogleMap;

/* loaded from: classes3.dex */
public final class vda extends vio {
    final /* synthetic */ GoogleMap.SnapshotReadyCallback a;

    public vda(GoogleMap.SnapshotReadyCallback snapshotReadyCallback) {
        this.a = snapshotReadyCallback;
    }

    @Override // defpackage.vip
    public final void a(Bitmap bitmap) {
        this.a.onSnapshotReady(bitmap);
    }

    @Override // defpackage.vip
    public final void b(sqj sqjVar) {
        this.a.onSnapshotReady((Bitmap) sqi.a(sqjVar));
    }
}
