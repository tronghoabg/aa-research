package defpackage;

import com.carstream.tech.car.c;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class f1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ f1(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c cVar = this.b;
                if (!cVar.a.a.isFullscreen()) {
                    cVar.f();
                    cVar.b.postDelayed(new f(this, 5), 250L);
                    break;
                }
                break;
            case 1:
                this.b.a.a("if(window.__cntGoFullscreen){window.__cntGoFullscreen();}");
                break;
            default:
                this.b.a.a("if(window.__cntMiniGoBig){window.__cntMiniGoBig();}");
                break;
        }
    }
}
