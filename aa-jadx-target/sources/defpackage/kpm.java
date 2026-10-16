package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kpm implements defpackage.afak {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kpm(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.afak, defpackage.afaj
    public final java.lang.Object a() {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return ((defpackage.kpt) this.a).d;
            case 1:
                java.lang.Object obj = this.a;
                defpackage.yqm yqmVar = defpackage.iyh.a;
                return defpackage.slj.a((android.content.Context) obj);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.yqm yqmVar2 = defpackage.kpt.a;
                return ((defpackage.lbn) defpackage.mkp.a.i(defpackage.lbn.class)).a((android.content.Context) this.a, "connectivity_session_id_file");
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.yqm yqmVar3 = defpackage.msi.a;
                return this.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.yqm yqmVar4 = defpackage.msi.a;
                return this.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.yqm yqmVar5 = defpackage.msi.a;
                return new defpackage.mpq((com.google.android.gms.car.display.CarRegionId) this.a);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                int i = defpackage.qfn.g;
                return new defpackage.kwu((android.content.Context) this.a);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                int i2 = defpackage.qfn.g;
                return new com.google.android.apps.auto.components.crossprofile.CrossProfileNotificationPromptManager((android.content.Context) this.a);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                int i3 = defpackage.qfn.g;
                return new defpackage.ofz((android.content.Context) this.a);
            case 9:
                int i4 = defpackage.qfn.g;
                return new com.google.android.apps.auto.components.telecom.impl.DoNotDisturbCallManagerImpl((android.content.Context) this.a);
            case 10:
                int i5 = defpackage.qfn.g;
                return new defpackage.mdn((android.content.Context) this.a);
            case 11:
                int i6 = defpackage.qfn.g;
                return this.a;
            case 12:
                int i7 = defpackage.qfn.g;
                return this.a;
            case 13:
                int i8 = defpackage.qfn.g;
                return new defpackage.lgv((android.content.Context) this.a);
            case 14:
                int i9 = defpackage.qfn.g;
                return new defpackage.mos((android.content.Context) this.a);
            case 15:
                int i10 = defpackage.qfn.g;
                return new defpackage.ool((android.content.Context) this.a);
            case 16:
                int i11 = defpackage.qfn.g;
                return new defpackage.lmt((android.content.Context) this.a);
            case 17:
                int i12 = defpackage.qfn.g;
                return new defpackage.lpx((android.content.Context) this.a);
            case 18:
                int i13 = defpackage.qfn.g;
                return new defpackage.lpg((android.content.Context) this.a);
            case 19:
                int i14 = defpackage.qfn.g;
                return new defpackage.lnl((android.content.Context) this.a, new defpackage.lsx());
            default:
                int i15 = defpackage.qfn.g;
                return new defpackage.nsn((android.content.Context) this.a);
        }
    }
}
