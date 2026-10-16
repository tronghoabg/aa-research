package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ksa implements defpackage.afer {
    private final /* synthetic */ int a;

    public /* synthetic */ ksa(int i) {
        this.a = i;
    }

    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        boolean z;
        byte[] bArr = null;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return new defpackage.ksi(bArr);
            case 1:
                int i = defpackage.kms.a;
                throw new java.lang.IllegalStateException("defaultFocus() can only be called on Composables in a CarComposeView");
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.ksc kscVar = defpackage.ksi.a;
                return new android.content.res.loader.ResourcesLoader();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new defpackage.ksn(bArr);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return defpackage.ksx.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.ktf ktfVar = defpackage.ktf.a;
                return defpackage.afga.ac(defpackage.ktf.a, defpackage.ktf.b, defpackage.ktf.c, defpackage.ktf.d);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.afar afarVar = defpackage.ktl.a;
                return new defpackage.ktg();
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.afar afarVar2 = defpackage.ktl.a;
                return new defpackage.kth();
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.afar afarVar3 = defpackage.ktl.a;
                return new kti();
            case 9:
                defpackage.afar afarVar4 = defpackage.ktl.a;
                return new defpackage.mku((byte[]) null);
            case 10:
                defpackage.afar afarVar5 = defpackage.ktl.a;
                return new defpackage.ktj();
            case 11:
                defpackage.afar afarVar6 = defpackage.ktl.a;
                return new defpackage.ktk();
            case 12:
                defpackage.yqm yqmVar = defpackage.kvi.a;
                return defpackage.kve.a;
            case 13:
                defpackage.lap lapVar = defpackage.laq.a;
                try {
                    z = defpackage.mkp.a.c.getPackageManager().getPackageInfo("com.google.android.googlequicksearchbox", 0).versionCode >= 301313649;
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    ((defpackage.yqj) defpackage.laq.b.h()).u("No GSA package found, VP2 disabled");
                }
                return java.lang.Boolean.valueOf(z);
            case 14:
                return new defpackage.laq();
            case 15:
                return new defpackage.lee();
            case 16:
                defpackage.led ledVar = defpackage.lee.a;
                return java.lang.Boolean.valueOf(defpackage.acpp.a.fF().f());
            case 17:
                return new defpackage.lek();
            case 18:
                defpackage.lel lelVar = defpackage.lem.a;
                defpackage.acqe acqeVar = defpackage.acqe.a;
                return new defpackage.nrt(java.lang.Boolean.valueOf(acqeVar.fF().z()), java.lang.Boolean.valueOf(acqeVar.fF().z() && acqeVar.fF().A()), java.lang.Boolean.valueOf(acqeVar.fF().z()), false);
            case 19:
                return new defpackage.lem();
            default:
                return new defpackage.leo();
        }
    }
}
