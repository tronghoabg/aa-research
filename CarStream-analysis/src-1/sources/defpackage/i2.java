package defpackage;

import com.carstream.tech.media.ControllerService;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class i2 implements v7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.v7
    public final void a() {
        int iG;
        switch (this.a) {
            case 0:
                ((j2) this.b).b.post(new f(this, 13));
                break;
            case 1:
                ControllerService controllerService = (ControllerService) this.b;
                if (controllerService.theoGioiHan() && (iG = w7.g()) != controllerService.lastNavLimit) {
                    controllerService.lastNavLimit = iG;
                    controllerService.publishNowPlaying();
                    break;
                }
                break;
            case 2:
                ((za) this.b).b.post(new t7(this, 6));
                break;
            default:
                ((lb) this.b).b.post(new t7(this, 11));
                break;
        }
    }
}
