package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lsa implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ lsa(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        boolean z = false;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                lph lphVar = (lph) obj;
                defpackage.lsb lsbVar = defpackage.lsd.a;
                lphVar.getClass();
                if (lphVar.b && !defpackage.afga.f(lphVar.a, defpackage.mkt.F)) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 1:
                com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState = (com.google.android.apps.auto.components.media.compat.AaPlaybackState) obj;
                defpackage.lsb lsbVar2 = defpackage.lsd.a;
                aaPlaybackState.getClass();
                return java.lang.Boolean.valueOf(aaPlaybackState.Q() == 1);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.lsb lsbVar3 = defpackage.lsd.a;
                return obj;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                lok lokVar = (lok) obj;
                return lokVar != null ? lokVar.e : defpackage.tcu.b;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ltj ltjVar = (ltj) obj;
                ltjVar.getClass();
                return ltjVar.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ltj ltjVar2 = (ltj) obj;
                ltjVar2.getClass();
                return ltjVar2.b;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ltj ltjVar3 = (ltj) obj;
                return ltjVar3 != null ? ltjVar3.c : defpackage.afce.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                lph lphVar2 = (lph) obj;
                j$.time.Duration duration = defpackage.ltu.a;
                lphVar2.getClass();
                return defpackage.lpg.j().e(lphVar2);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                lph lphVar3 = (lph) obj;
                j$.time.Duration duration2 = defpackage.ltu.a;
                lphVar3.getClass();
                return lphVar3.a;
            case 9:
                android.content.ComponentName componentName = (android.content.ComponentName) obj;
                j$.time.Duration duration3 = defpackage.ltu.a;
                componentName.getClass();
                return defpackage.tcu.B(defpackage.lpx.i().f(), new defpackage.lra(componentName, 9));
            case 10:
                com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState2 = (com.google.android.apps.auto.components.media.compat.AaPlaybackState) obj;
                aaPlaybackState2.getClass();
                if (aaPlaybackState2.Q() != 1 && aaPlaybackState2.Q() != 2) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 11:
                com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState3 = (com.google.android.apps.auto.components.media.compat.AaPlaybackState) obj;
                aaPlaybackState3.getClass();
                return java.lang.Long.valueOf(aaPlaybackState3.R());
            case 12:
                lok lokVar2 = (lok) obj;
                lokVar2.getClass();
                return lokVar2.f;
            case 13:
                lok lokVar3 = (lok) obj;
                lokVar3.getClass();
                return lokVar3.h;
            case 14:
                los losVar = (los) obj;
                losVar.getClass();
                return losVar.e();
            case 15:
                defpackage.lmk lmkVar = (defpackage.lmk) obj;
                lmkVar.getClass();
                return defpackage.ysr.cC(lmkVar.O("android.media.metadata.DURATION"));
            case 16:
                lok lokVar4 = (lok) obj;
                lokVar4.getClass();
                return lokVar4.e;
            case 17:
                lok lokVar5 = (lok) obj;
                lokVar5.getClass();
                return lokVar5.c;
            case 18:
                return defpackage.tna.aC((los) obj);
            case 19:
                defpackage.lke lkeVar = (defpackage.lke) obj;
                return java.lang.Integer.valueOf(lkeVar != null ? lkeVar.h : -1);
            default:
                ltv ltvVar = (ltv) obj;
                ltvVar.getClass();
                return ltvVar.g();
        }
    }
}
