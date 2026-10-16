package defpackage;

import android.os.Looper;

/* loaded from: classes3.dex */
public final /* synthetic */ class tic implements afdr {
    private final /* synthetic */ int a;

    public /* synthetic */ tic(int i) {
        this.a = i;
    }

    @Override // defpackage.afdr
    public final Object invoke() {
        switch (this.a) {
            case 0:
                bvf bvfVar = tii.a;
                a.am("LocalContext");
                throw new aezp();
            case 1:
                bvf bvfVar2 = tii.a;
                a.am("LocalConfiguration");
                throw new aezp();
            case 2:
                bvf bvfVar3 = tii.a;
                a.am("LocalCarContext");
                throw new aezp();
            case 3:
                bvf bvfVar4 = tii.a;
                a.am("LocalScreen");
                throw new aezp();
            case 4:
                return new tjl();
            case 5:
                bvf bvfVar5 = tii.a;
                a.am("LocalScreenFactory");
                throw new aezp();
            case 6:
                return new IllegalStateException("CheckedReference used in wrong context");
            case 7:
                return Boolean.valueOf(affa.f(Thread.currentThread(), Looper.getMainLooper().getThread()));
            case 8:
                return new IllegalStateException("MainThreadCheckedReference accessed outside of main thread");
            case 9:
                return Long.valueOf(System.currentTimeMillis());
            default:
                return null;
        }
    }
}
