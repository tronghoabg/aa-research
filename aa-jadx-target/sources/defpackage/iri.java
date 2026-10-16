package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class iri implements java.lang.Runnable {
    private final /* synthetic */ int a;

    public /* synthetic */ iri(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                defpackage.yqm yqmVar = defpackage.irk.a;
                java.lang.System.loadLibrary("resampling_jni");
                defpackage.irk.c.countDown();
                return;
            case 1:
                defpackage.aan aanVar = defpackage.czz.L;
                synchronized (aanVar) {
                    int i = 0;
                    if (android.os.Build.VERSION.SDK_INT < 30) {
                        java.lang.Object[] objArr = aanVar.a;
                        int i2 = aanVar.b;
                        while (i < i2) {
                            defpackage.czz czzVar = (defpackage.czz) objArr[i];
                            boolean zF = czzVar.F();
                            czzVar.x = defpackage.dai.m();
                            if (zF != czzVar.F()) {
                                czzVar.post(new defpackage.ku(czzVar, 16, null));
                            }
                            i++;
                        }
                    } else {
                        java.lang.Object[] objArr2 = aanVar.a;
                        int i3 = aanVar.b;
                        while (i < i3) {
                            defpackage.czz czzVar2 = (defpackage.czz) objArr2[i];
                            czzVar2.post(new defpackage.ku(czzVar2, 17, null));
                            i++;
                        }
                    }
                }
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.yqm yqmVar2 = defpackage.iya.a;
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.yqm yqmVar3 = defpackage.nrm.c;
                defpackage.ngr.a().c(ngu.j);
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.yqm yqmVar4 = defpackage.nwi.a;
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.yqm yqmVar5 = defpackage.nwi.a;
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                int i4 = defpackage.nwz.e;
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.yqm yqmVar6 = defpackage.nxa.f;
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
            default:
                return;
            case 9:
                defpackage.wbn.e();
                return;
        }
    }
}
