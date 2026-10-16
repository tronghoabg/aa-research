package defpackage;

import android.os.Build;

/* loaded from: classes.dex */
public final /* synthetic */ class iqz implements Runnable {
    private final /* synthetic */ int a;

    public /* synthetic */ iqz(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yph yphVar = irb.a;
                System.loadLibrary("resampling_jni");
                irb.c.countDown();
                return;
            case 1:
                aag aagVar = czq.L;
                synchronized (aagVar) {
                    byte[] bArr = null;
                    int i = 0;
                    if (Build.VERSION.SDK_INT < 30) {
                        Object[] objArr = aagVar.a;
                        int i2 = aagVar.b;
                        while (i < i2) {
                            czq czqVar = (czq) objArr[i];
                            boolean zF = czqVar.F();
                            czqVar.x = czz.m();
                            if (zF != czqVar.F()) {
                                czqVar.post(new lh(czqVar, 12, bArr));
                            }
                            i++;
                        }
                    } else {
                        Object[] objArr2 = aagVar.a;
                        int i3 = aagVar.b;
                        while (i < i3) {
                            czq czqVar2 = (czq) objArr2[i];
                            czqVar2.post(new lh(czqVar2, 13, bArr));
                            i++;
                        }
                    }
                }
                return;
            case 2:
                yph yphVar2 = ixs.a;
                return;
            case 3:
                yph yphVar3 = nqu.c;
                nfy.a().c(ngb.j);
                return;
            case 4:
                yph yphVar4 = nvs.a;
                return;
            case 5:
                yph yphVar5 = nvs.a;
                return;
            case 6:
                int i4 = nwj.e;
                return;
            case 7:
                yph yphVar6 = nwk.f;
                return;
            case 8:
            default:
                return;
            case 9:
                war.e();
                return;
        }
    }
}
