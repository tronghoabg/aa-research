package defpackage;

import android.service.notification.StatusBarNotification;
import j$.util.Map;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class mbp implements lhg {
    private static final yph a = yph.c("GH.SbnsImpl");
    private final Map b = new ConcurrentHashMap();
    private final AtomicBoolean c = new AtomicBoolean();

    public mbp(jri jriVar) {
        woy.O(jriVar == jri.b, "StatusBarNotifications should only be stored in the same process as the NotificationListenerService.");
    }

    public static mbp b() {
        return (mbp) mki.a.i(mbp.class);
    }

    public final mbn a(String str) {
        if (!this.c.get()) {
            ((ype) ((ype) a.h()).ai((char) 4715)).u("SBNs isn't running but an SBN was requested.");
            return null;
        }
        mbn mbnVar = (mbn) this.b.get(str);
        if (mbnVar != null) {
            return mbnVar;
        }
        throw new IllegalStateException("Couldn't find SBN for requested key ".concat(String.valueOf(str)));
    }

    @Override // defpackage.lhg
    public final void c() {
        this.c.set(true);
    }

    @Override // defpackage.lhg
    public final void d() {
        this.c.set(false);
        this.b.clear();
    }

    public final void e(StatusBarNotification statusBarNotification) {
        if (this.c.get() && ((mbx) mki.a.i(mbx.class)).a(statusBarNotification)) {
            mbn mbnVar = (mbn) Map.EL.putIfAbsent(this.b, statusBarNotification.getKey(), new mbn(statusBarNotification));
            if (mbnVar != null) {
                mbnVar.a(Optional.of(statusBarNotification), Optional.of(false), Optional.of(false), Optional.empty(), Optional.empty());
            }
        }
    }
}
