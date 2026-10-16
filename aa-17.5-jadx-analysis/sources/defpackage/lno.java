package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class lno extends eqj {
    public static final /* synthetic */ int a = 0;
    private static final yph h = yph.c("GH.MediaActiveCtrlrsLD");
    private final Context i;
    private final MediaSessionManager j;
    private final MediaSessionManager.OnActiveSessionsChangedListener k;

    public lno(final Context context, MediaSessionManager mediaSessionManager) {
        woy.aa(((mdk) mki.a.i(mdk.class)).m(), "Notification listener service permission is a prerequisite for using this class.");
        this.i = context;
        this.j = mediaSessionManager;
        this.k = new MediaSessionManager.OnActiveSessionsChangedListener() { // from class: lnn
            @Override // android.media.session.MediaSessionManager.OnActiveSessionsChangedListener
            public final void onActiveSessionsChanged(List list) {
                yfq yfqVarB = lno.b(list, context);
                lno.r(yfqVarB);
                this.a.m(yfqVarB);
            }
        };
    }

    public static eqj a(Context context, MediaSessionManager mediaSessionManager) {
        if (((mdk) mki.a.i(mdk.class)).m()) {
            return new lno(context, mediaSessionManager);
        }
        int i = yfq.d;
        yfq yfqVar = yls.a;
        afco afcoVar = tby.a;
        return new eqm(yfqVar);
    }

    public static yfq b(List list, Context context) {
        if (list == null) {
            int i = yfq.d;
            return yls.a;
        }
        int i2 = yfq.d;
        yfl yflVar = new yfl(4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaController mediaController = (MediaController) it.next();
            if (acsx.J()) {
                try {
                    yflVar.i(new lmb(mediaController, context));
                } catch (SecurityException e) {
                    ((ype) ((ype) ((ype) h.h()).p(e)).ai((char) 4072)).u("Failed to create AaMediaController");
                }
            } else {
                yflVar.i(new lmb(mediaController, context));
            }
        }
        return yflVar.g();
    }

    public static void r(List list) {
        Stream map = Collection.EL.stream(list).map(new lka(8));
        int i = yfq.d;
    }

    @Override // defpackage.eqj
    protected final void c() {
        ComponentName componentNameA = mbm.b().a();
        MediaSessionManager mediaSessionManager = this.j;
        yfq yfqVarB = b(mediaSessionManager.getActiveSessions(componentNameA), this.i);
        r(yfqVarB);
        m(yfqVarB);
        mediaSessionManager.addOnActiveSessionsChangedListener(this.k, mbm.b().a());
    }

    @Override // defpackage.eqj
    protected final void d() {
        this.j.removeOnActiveSessionsChangedListener(this.k);
    }
}
