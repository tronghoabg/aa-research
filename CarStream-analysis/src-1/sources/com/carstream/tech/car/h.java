package com.carstream.tech.car;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                CarScreen carScreen = ((e) this.b).b;
                if (carScreen.locked) {
                    carScreen.locked = false;
                    carScreen.buildEverything();
                    carScreen.startLicenseWatch();
                    break;
                }
                break;
            default:
                u uVar = (u) this.b;
                uVar.d = null;
                uVar.e = 0L;
                uVar.c(uVar.a.a.keepAliveWanted);
                break;
        }
    }
}
