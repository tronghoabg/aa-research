package android.support.v4.media.a;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
class k {

    /* renamed from: a, reason: collision with root package name */
    protected final MediaController f402a;

    /* renamed from: c, reason: collision with root package name */
    final u f404c;

    /* renamed from: b, reason: collision with root package name */
    final Object f403b = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final List f405d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f406e = new HashMap();

    k(Context context, u uVar) {
        this.f404c = uVar;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) uVar.d());
        this.f402a = mediaController;
        if (uVar.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new i(this));
        }
    }

    final void a() {
        u uVar = this.f404c;
        if (uVar.a() == null) {
            return;
        }
        for (h hVar : this.f405d) {
            j jVar = new j(hVar);
            this.f406e.put(hVar, jVar);
            hVar.f400c = jVar;
            try {
                uVar.a().b(jVar);
                hVar.c(13, null, null);
            } catch (RemoteException e2) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e2);
            }
        }
        this.f405d.clear();
    }

    public final void b(h hVar, Handler handler) {
        this.f402a.registerCallback(hVar.f398a, handler);
        synchronized (this.f403b) {
            u uVar = this.f404c;
            if (uVar.a() != null) {
                j jVar = new j(hVar);
                this.f406e.put(hVar, jVar);
                hVar.f400c = jVar;
                try {
                    uVar.a().b(jVar);
                    hVar.c(13, null, null);
                } catch (RemoteException e2) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e2);
                }
            } else {
                hVar.f400c = null;
                this.f405d.add(hVar);
            }
        }
    }

    public final void c(h hVar) {
        this.f402a.unregisterCallback(hVar.f398a);
        synchronized (this.f403b) {
            u uVar = this.f404c;
            if (uVar.a() != null) {
                try {
                    j jVar = (j) this.f406e.remove(hVar);
                    if (jVar != null) {
                        hVar.f400c = null;
                        uVar.a().c(jVar);
                    }
                } catch (RemoteException e2) {
                    Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e2);
                }
            }
            this.f405d.remove(hVar);
        }
    }
}
