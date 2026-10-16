package defpackage;

import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class eth extends etp {
    final /* synthetic */ erb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eth(Object obj, erb erbVar) {
        super(obj);
        this.a = erbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.etp
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ArrayList arrayList;
        if (obj == 0) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(obj.size());
            Iterator it = obj.iterator();
            while (it.hasNext()) {
                MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) it.next();
                Parcel parcelObtain = Parcel.obtain();
                mediaItem.writeToParcel(parcelObtain, 0);
                arrayList2.add(parcelObtain);
            }
            arrayList = arrayList2;
        }
        this.a.I(arrayList);
    }
}
