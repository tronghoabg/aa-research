package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes2.dex */
public class cw {
    final Context a;
    public final MediaBrowser b;
    protected final Bundle c;
    public final ct d = new ct(this);
    public final yw e = new yw();
    public int f;
    public Messenger g;
    public MediaSessionCompat.Token h;
    public rz i;

    public cw(Context context, ComponentName componentName, cv cvVar, Bundle bundle) {
        this.a = context;
        Bundle bundle2 = new Bundle(bundle);
        this.c = bundle2;
        bundle2.putInt("extra_client_version", 1);
        bundle2.putInt("extra_calling_pid", Process.myPid());
        cvVar.b = this;
        this.b = new MediaBrowser(context, componentName, cvVar.a, bundle2);
    }

    public final boolean a() {
        return this.b.isConnected();
    }
}
