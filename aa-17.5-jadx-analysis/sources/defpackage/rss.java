package defpackage;

import android.util.SparseArray;
import com.google.android.gms.car.senderprotocol.Channel;

/* loaded from: classes.dex */
public final class rss {
    public final SparseArray a;
    final /* synthetic */ Channel b;

    public rss(Channel channel) {
        this.b = channel;
        SparseArray sparseArray = new SparseArray();
        this.a = sparseArray;
        sparseArray.put(8, new rsr(this, 1));
        sparseArray.put(9, new rsr(this, 0));
    }
}
