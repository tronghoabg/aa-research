package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public abstract class ett extends Service {
    static final boolean a = Log.isLoggable("MBServiceCompat", 3);
    public final ArrayList b;
    public final yw c;
    final ets d;
    MediaSessionCompat.Token e;
    public final ajmd f = new ajmd(this, null);
    private etj g;

    public ett() {
        new etg(this, "android.media.session.MediaController", -1, -1, null);
        this.b = new ArrayList();
        this.c = new yw();
        this.d = new ets(this);
    }

    static final List e(List list, Bundle bundle) {
        int i;
        if (list == null) {
            return null;
        }
        int i2 = -1;
        int i3 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i4 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i3 != -1) {
            i2 = i3;
        } else if (i4 == -1) {
            return list;
        }
        if (i2 < 0 || i4 <= 0 || (i = i2 * i4) >= list.size()) {
            return Collections.EMPTY_LIST;
        }
        int size = i4 + i;
        if (size > list.size()) {
            size = list.size();
        }
        return list.subList(i, size);
    }

    public static final void g(etp etpVar) {
        etpVar.h = 2;
        etpVar.b(null);
    }

    public abstract etf a(String str, int i, Bundle bundle);

    public final void b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        etj etjVar = this.g;
        etjVar.b.notifyChildrenChanged(str);
        etjVar.d.d.post(new esx(etjVar, str, 3));
    }

    public abstract void c(String str, etp etpVar);

    public final void d(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.e != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.e = token;
        etj etjVar = this.g;
        etjVar.d.d.a(new esx(etjVar, token, 2));
    }

    public final void f(String str, etp etpVar) {
        etpVar.h = 1;
        c(str, etpVar);
    }

    public final void h(String str, etg etgVar, Bundle bundle) {
        etc etcVar = new etc(this, str, etgVar, str, bundle);
        if (bundle == null) {
            c(str, etcVar);
        } else {
            f(str, etcVar);
        }
        if (etcVar.c()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + etgVar.a + " id=" + str);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.g.b.onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        eto etoVar = new eto(this);
        this.g = etoVar;
        etoVar.b = new etn(etoVar, etoVar.e);
        etoVar.b.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.d.a = null;
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
