package defpackage;

import android.content.pm.PackageInstaller;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class sep extends PackageInstaller.SessionCallback {
    PackageInstaller.SessionInfo a;
    final /* synthetic */ seq b;

    public sep(seq seqVar) {
        PackageInstaller.SessionInfo next;
        this.b = seqVar;
        ypf ypfVar = seq.a;
        ypfVar.l().ai(8833).y("PackageInstallListener: %s", seqVar.b);
        Iterator<PackageInstaller.SessionInfo> it = seqVar.e.getAllSessions().iterator();
        while (true) {
            if (!it.hasNext()) {
                ypfVar.l().ai(8840).y("found no sessions for pkg=%s", seqVar.b);
                next = null;
                break;
            } else {
                next = it.next();
                if (seqVar.b.equals(next.getAppPackageName())) {
                    ypfVar.l().ai(8841).M("Found session: %s for pkg=%s", next, seqVar.b);
                    break;
                }
            }
        }
        if (next != null) {
            ypfVar.l().ai(8834).y("App is already downloading: %s", seqVar.b);
            this.a = next;
        }
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onActiveChanged(int i, boolean z) {
        ypf ypfVar = seq.a;
        ypfVar.l().ai(8835).E("PackageInstallListener:onActiveChanged sessionId=%d, active=%b", i, z);
        PackageInstaller.SessionInfo sessionInfo = this.a;
        if (sessionInfo == null || sessionInfo.getSessionId() != i || z) {
            return;
        }
        ypfVar.h().ai(8836).w("Session goes inactive: %d", i);
        seq seqVar = this.b;
        seqVar.a(5);
        seqVar.e.unregisterSessionCallback(this);
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onCreated(int i) {
        seq.a.l().ai(8837).w("PackageInstallListener:onCreated sessionId=%d", i);
        seq seqVar = this.b;
        PackageInstaller.SessionInfo sessionInfo = seqVar.e.getSessionInfo(i);
        if (sessionInfo == null || !seqVar.b.equals(sessionInfo.getAppPackageName())) {
            return;
        }
        this.a = sessionInfo;
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onFinished(int i, boolean z) {
        seq.a.l().ai(8838).E("PackageInstallListener:onFinished sessionId=%d, success=%b", i, z);
        PackageInstaller.SessionInfo sessionInfo = this.a;
        if (sessionInfo == null || sessionInfo.getSessionId() != i) {
            return;
        }
        seq seqVar = this.b;
        seqVar.a(true != z ? 5 : 1);
        seqVar.e.unregisterSessionCallback(this);
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onProgressChanged(int i, float f) {
        ypf ypfVar = seq.a;
        ypfVar.l().ai(8839).aj(i, f);
        PackageInstaller.SessionInfo sessionInfo = this.a;
        if (sessionInfo == null || sessionInfo.getSessionId() != i) {
            return;
        }
        seq seqVar = this.b;
        ypfVar.l().ai(8845).R("post app status update pkg=%s, state=%d, progress=%f", seqVar.b, 4, Float.valueOf(f));
        eqm eqmVar = seqVar.g;
        ser serVar = (ser) eqmVar.e();
        serVar.getClass();
        serVar.a = 4;
        serVar.a(f);
        eqmVar.j(serVar);
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onBadgingChanged(int i) {
    }
}
