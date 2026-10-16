package defpackage;

import com.google.android.gms.car.CarInfo;

/* loaded from: classes.dex */
public final /* synthetic */ class mmb implements kix {
    public final /* synthetic */ String a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ mmb(qrn qrnVar, String str, int i) {
        this.d = i;
        this.b = qrnVar;
        this.c = "driver_position_setting_key";
        this.a = str;
    }

    @Override // defpackage.kix
    public final Object a() throws qrz {
        int i = this.d;
        if (i == 0) {
            mki.a.g();
            return ols.y((qrn) this.b, (String) this.c, this.a);
        }
        if (i == 1) {
            mki.a.g();
            CarInfo carInfo = (CarInfo) this.c;
            return Boolean.valueOf(((qsz) this.b).d().N(String.format("%s_%s_%s_%s", carInfo.a, carInfo.b, carInfo.c, this.a)));
        }
        Object obj = this.b;
        Object obj2 = this.c;
        qhn qhnVarF = qho.f((qrn) obj2, (qpi) obj);
        String str = this.a;
        try {
            qho.e();
            Boolean boolValueOf = Boolean.valueOf(ols.A((qrn) obj2, str, ((qpi) obj).ordinal()));
            if (qhnVarF != null) {
                qhnVarF.close();
            }
            return boolValueOf;
        } catch (Throwable th) {
            if (qhnVarF != null) {
                try {
                    qhnVarF.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public /* synthetic */ mmb(qrn qrnVar, CarInfo carInfo, String str, int i) {
        this.d = i;
        this.b = qrnVar;
        this.c = carInfo;
        this.a = str;
    }

    public /* synthetic */ mmb(qrn qrnVar, qpi qpiVar, String str, int i) {
        this.d = i;
        this.c = qrnVar;
        this.b = qpiVar;
        this.a = str;
    }
}
