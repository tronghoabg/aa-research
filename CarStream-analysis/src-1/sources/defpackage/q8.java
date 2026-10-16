package defpackage;

import com.carstream.tech.car.CarScreen;
import com.carstream.tech.car.t;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class q8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ t c;

    public /* synthetic */ q8(t tVar, String str, int i) {
        this.a = i;
        this.c = tVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t tVar = this.c;
                if (tVar.a.pageTrusted()) {
                    tVar.a.showSheet(this.b);
                    break;
                }
                break;
            default:
                CarScreen carScreen = this.c.a;
                if (carScreen.pageTrusted()) {
                    String str = this.b;
                    if (str == null || str.length() <= 65536) {
                        if (str == null) {
                            str = "";
                        }
                        xc.p(carScreen, "iptvSaved", str);
                        break;
                    }
                }
                break;
        }
    }
}
