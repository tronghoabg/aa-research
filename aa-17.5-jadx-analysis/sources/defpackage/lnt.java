package defpackage;

import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes2.dex */
public final class lnt extends eqj {
    final /* synthetic */ lnu a;
    private final String h;
    private final Bundle i;

    public lnt(lnu lnuVar, String str, Bundle bundle) {
        this.a = lnuVar;
        this.h = str;
        this.i = bundle;
    }

    @Override // defpackage.eqj
    protected final void c() {
        yph yphVar = lnu.d;
        ype ypeVar = (ype) yphVar.l().ai(4085);
        lnu lnuVar = this.a;
        zjd zjdVar = new zjd(zjc.a, lnuVar.b.a.flattenToShortString());
        String str = this.h;
        Bundle bundle = this.i;
        ypeVar.R("search componentName=%s query=%s extras=%s", zjdVar, str, bundle);
        llu lluVar = lnuVar.e;
        if (!lluVar.s()) {
            ((ype) ((ype) ((ype) yphVar.g()).q(ypd.LARGE)).ai((char) 4086)).u("search subscription activated outside active connection lifetime, skipping");
            m(lpb.b(4));
            return;
        }
        m(lpb.b(1));
        lns lnsVar = new lns(this);
        MediaBrowserCompat mediaBrowserCompat = (MediaBrowserCompat) lluVar.b;
        cy cyVar = (cy) lnsVar.b;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("query cannot be empty");
        }
        if (cyVar == null) {
            throw new IllegalArgumentException("callback cannot be null");
        }
        cw cwVar = mediaBrowserCompat.b;
        if (!cwVar.a()) {
            throw new IllegalStateException("search() called while not connected");
        }
        rz rzVar = cwVar.i;
        if (rzVar == null) {
            Log.i("MediaBrowserCompat", "The connected service doesn't support search.");
            cwVar.d.post(new ae(cyVar, str, bundle, 2));
            return;
        }
        MediaBrowserCompat.SearchResultReceiver searchResultReceiver = new MediaBrowserCompat.SearchResultReceiver(str, bundle, cyVar, cwVar.d);
        try {
            Messenger messenger = cwVar.g;
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_search_query", str);
            bundle2.putBundle("data_search_extras", bundle);
            bundle2.putParcelable("data_result_receiver", searchResultReceiver);
            rzVar.h(8, bundle2, messenger);
        } catch (RemoteException e) {
            Log.i("MediaBrowserCompat", "Remote error searching items with query: ".concat(String.valueOf(str)), e);
            cwVar.d.post(new ae(cyVar, str, bundle, 3));
        }
    }
}
