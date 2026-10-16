package defpackage;

import com.carstream.tech.car.e;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class t2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ t2(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    this.b.b.host().finish();
                    break;
                } catch (Exception e) {
                    String.valueOf(e);
                    return;
                }
            default:
                this.b.b.lockNow("key khong con hieu luc");
                break;
        }
    }
}
