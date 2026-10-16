package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class etm extends etp {
    final /* synthetic */ Bundle a;
    final /* synthetic */ erb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etm(Object obj, erb erbVar, Bundle bundle) {
        super(obj);
        this.b = erbVar;
        this.a = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.etp
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (obj == 0) {
            this.b.I(null);
            return;
        }
        List<MediaBrowserCompat.MediaItem> listE = obj;
        if ((this.h & 1) != 0) {
            listE = ett.e(obj, this.a);
        }
        ArrayList arrayList = new ArrayList(listE.size());
        for (MediaBrowserCompat.MediaItem mediaItem : listE) {
            Parcel parcelObtain = Parcel.obtain();
            mediaItem.writeToParcel(parcelObtain, 0);
            arrayList.add(parcelObtain);
        }
        this.b.I(arrayList);
    }
}
