package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes2.dex */
final class etn extends etl {
    final /* synthetic */ eto b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etn(eto etoVar, Context context) {
        super(etoVar, context);
        this.b = etoVar;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        MediaSessionCompat.c(bundle);
        this.b.e.f(str, new etm(str, new erb(result), bundle));
    }
}
