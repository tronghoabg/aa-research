package defpackage;

import android.content.Context;
import android.service.media.MediaBrowserService;

/* loaded from: classes2.dex */
class etl extends eti {
    public etl(etj etjVar, Context context) {
        super(etjVar, context);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        ett.g(new etk(str, new erb(result)));
    }
}
