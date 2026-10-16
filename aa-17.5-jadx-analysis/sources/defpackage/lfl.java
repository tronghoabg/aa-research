package defpackage;

import android.content.pm.PackageInstaller;
import android.util.SparseArray;

/* loaded from: classes2.dex */
public final class lfl extends PackageInstaller.SessionCallback {
    final /* synthetic */ lfm a;
    private final SparseArray b = new SparseArray();
    private final ykd c;

    public lfl(lfm lfmVar, ykd ykdVar) {
        PackageInstaller.SessionInfo sessionInfoA;
        this.a = lfmVar;
        this.c = ykdVar;
        yph yphVar = lfm.a;
        ((ype) yphVar.l().ai((char) 3871)).u("Looking for apps that are already downloading");
        for (lfk lfkVar : lfmVar.e) {
            if (!lfkVar.d(lfmVar.b) && (sessionInfoA = lfmVar.a(lfkVar.a)) != null) {
                ((ype) yphVar.l().ai((char) 3872)).y("App is already downloading: %s", lfkVar);
                this.b.put(sessionInfoA.getSessionId(), lfkVar);
            }
        }
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onActiveChanged(int i, boolean z) {
        SparseArray sparseArray = this.b;
        if (sparseArray.get(i) == null || z) {
            return;
        }
        yph yphVar = lfm.a;
        this.c.e(((lfk) sparseArray.get(i)).a);
        this.a.c.unregisterSessionCallback(this);
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onCreated(int i) {
        lfm lfmVar = this.a;
        PackageInstaller.SessionInfo sessionInfo = lfmVar.c.getSessionInfo(i);
        if (sessionInfo == null) {
            return;
        }
        for (lfk lfkVar : lfmVar.e) {
            if (lfkVar.a.equals(sessionInfo.getAppPackageName())) {
                ((ype) lfm.a.l().ai((char) 3874)).y("New app starts downloading %s", lfkVar);
                this.b.put(i, lfkVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.Map] */
    @Override // android.content.pm.PackageInstaller.SessionCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFinished(int r4, boolean r5) {
        /*
            r3 = this;
            android.util.SparseArray r0 = r3.b
            java.lang.Object r1 = r0.get(r4)
            if (r1 == 0) goto L7b
            yph r1 = defpackage.lfm.a
            yop r1 = r1.l()
            r2 = 3875(0xf23, float:5.43E-42)
            yop r1 = r1.ai(r2)
            ype r1 = (defpackage.ype) r1
            java.lang.String r2 = "Session finished: %d success %b"
            r1.E(r2, r4, r5)
            if (r5 == 0) goto L51
            java.lang.Object r5 = r0.get(r4)
            lfk r5 = (defpackage.lfk) r5
            lfm r1 = r3.a
            android.content.Context r2 = r1.b
            boolean r5 = r5.d(r2)
            if (r5 == 0) goto L51
            lds r5 = r1.f
            java.lang.Object r1 = r0.get(r4)
            lfk r1 = (defpackage.lfk) r1
            java.lang.String r1 = r1.a
            java.lang.Object r5 = r5.a
            java.lang.Object r5 = r5.get(r1)
            lfj r5 = (defpackage.lfj) r5
            r1 = 1
            r5.a = r1
            ykd r5 = r3.c
            java.lang.Object r5 = r5.a
            seg r5 = (defpackage.seg) r5
            com.google.android.gms.carsetup.fsm.impl.FsmController r5 = r5.d
            java.lang.String r1 = "EVENT_APPLICATION_INSTALLED"
            r2 = 0
            r5.f(r1, r2)
            goto L65
        L51:
            lfm r5 = r3.a
            android.content.pm.PackageInstaller r5 = r5.c
            r5.unregisterSessionCallback(r3)
            ykd r5 = r3.c
            java.lang.Object r1 = r0.get(r4)
            lfk r1 = (defpackage.lfk) r1
            java.lang.String r1 = r1.a
            r5.e(r1)
        L65:
            r0.remove(r4)
            int r4 = r0.size()
            if (r4 != 0) goto L7b
            lfm r4 = r3.a
            boolean r5 = r4.f()
            if (r5 == 0) goto L7b
            android.content.pm.PackageInstaller r4 = r4.c
            r4.unregisterSessionCallback(r3)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lfl.onFinished(int, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onProgressChanged(int i, float f) {
        yph yphVar = lfm.a;
        lfk lfkVar = (lfk) this.b.get(i);
        if (lfkVar != null) {
            lfj lfjVar = (lfj) this.a.f.a.get(lfkVar.a);
            lfjVar.a = 4;
            lfjVar.b = f;
            ((seg) this.c.a).d.f("EVENT_DOWNLOAD_APPS_UPDATE", null);
        }
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onBadgingChanged(int i) {
    }
}
