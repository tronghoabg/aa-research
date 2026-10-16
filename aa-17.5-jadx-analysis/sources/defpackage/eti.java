package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes2.dex */
class eti extends MediaBrowserService {
    final /* synthetic */ etj a;

    public eti(etj etjVar, Context context) {
        this.a = etjVar;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        int i2;
        Bundle bundle2;
        Object obj;
        etf etfVar;
        MediaSessionCompat.c(bundle);
        Bundle bundle3 = bundle == null ? null : new Bundle(bundle);
        etj etjVar = this.a;
        if (bundle3 == null || bundle3.getInt("extra_client_version", 0) == 0) {
            i2 = -1;
            bundle2 = null;
        } else {
            bundle3.remove("extra_client_version");
            ett ettVar = etjVar.d;
            etjVar.c = new Messenger(ettVar.d);
            Bundle bundle4 = new Bundle();
            bundle4.putInt("extra_service_version", 2);
            bundle4.putBinder("extra_messenger", etjVar.c.getBinder());
            MediaSessionCompat.Token token = ettVar.e;
            if (token != null) {
                di diVarA = token.a();
                bundle4.putBinder("extra_session_binder", diVarA == null ? null : diVarA.asBinder());
            } else {
                etjVar.a.add(bundle4);
            }
            int i3 = bundle3.getInt("extra_calling_pid", -1);
            bundle3.remove("extra_calling_pid");
            i2 = i3;
            bundle2 = bundle4;
        }
        ett ettVar2 = etjVar.d;
        etg etgVar = new etg(ettVar2, str, i2, i, null);
        etf etfVarA = ettVar2.a(str, i, bundle3);
        if (etfVarA == null) {
            etfVar = null;
        } else {
            if (etjVar.c != null) {
                ettVar2.b.add(etgVar);
            }
            if (bundle2 == null) {
                obj = etfVarA.b;
            } else {
                Object obj2 = etfVarA.b;
                obj = bundle2;
                if (obj2 != null) {
                    bundle2.putAll((Bundle) obj2);
                    obj = bundle2;
                }
            }
            etfVar = new etf((String) etfVarA.a, (Bundle) obj);
        }
        if (etfVar == null) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot((String) etfVar.a, (Bundle) etfVar.b);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        this.a.d.c(str, new eth(str, new erb(result)));
    }
}
