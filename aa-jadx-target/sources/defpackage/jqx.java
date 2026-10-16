package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class jqx implements defpackage.thn {
    private final /* synthetic */ int a;

    public /* synthetic */ jqx(int i) {
        this.a = i;
    }

    @Override // defpackage.thn
    public final java.lang.Object a() {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return new defpackage.jrf();
            case 1:
                return new defpackage.jqu(defpackage.mkp.a.c);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.jva();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new jxk();
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.jya();
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return new jzh();
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return new jzi();
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return new defpackage.kev();
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return new defpackage.kez(java.util.concurrent.Executors.newSingleThreadScheduledExecutor(), new jtu());
            case 9:
                return new kgx();
            case 10:
                return new kmh();
            case 11:
                return new kql(new defpackage.kqe(defpackage.mkp.a.c), (defpackage.kqf) defpackage.mkp.a.i(defpackage.kqf.class));
            case 12:
                return new defpackage.kwj();
            case 13:
                return com.google.android.apps.auto.components.demand.audio.GhMicrophoneContentProvider.b;
            case 14:
                return new kyg(defpackage.mkp.a.c);
            case 15:
                return new defpackage.kzi();
            case 16:
                return new kzn();
            case 17:
                return new kzo();
            case 18:
                return new defpackage.kzs();
            case 19:
                return new com.google.android.apps.auto.components.firstdrive.FirstDriveNotificationManager();
            default:
                return new defpackage.lje();
        }
    }
}
