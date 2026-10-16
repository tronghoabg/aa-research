package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lvf implements java.util.function.ToLongFunction {
    private final /* synthetic */ int a;

    public /* synthetic */ lvf(int i) {
        this.a = i;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(java.lang.Object obj) {
        int i = this.a;
        if (i == 0) {
            defpackage.ygw ygwVar = ((lum) obj).d;
            int i2 = defpackage.lvh.c;
            return ((mesquite.messaging.model.Message) defpackage.ysr.an(ygwVar)).f;
        }
        if (i == 1) {
            defpackage.ygw ygwVar2 = ((lum) obj).d;
            defpackage.yqm yqmVar = lvc.a;
            return ((mesquite.messaging.model.Message) defpackage.ysr.an(ygwVar2)).f;
        }
        if (i == 2) {
            java.lang.Long l = (java.lang.Long) obj;
            l.longValue();
            return l.longValue();
        }
        if (i == 3) {
            return ((java.lang.Long) defpackage.mkc.d((com.google.android.gms.car.RadioProgramSelector) obj).orElse(0L)).longValue();
        }
        if (i != 4) {
            return i != 5 ? ((com.google.android.gms.car.RadioProgramSelector) obj).a.b : ((java.lang.Long) defpackage.mkc.e((com.google.android.gms.car.RadioProgramSelector) obj, 6).orElse(0L)).longValue();
        }
        return ((java.lang.Long) defpackage.mkc.d((com.google.android.gms.car.RadioProgramSelector) obj).orElse(0L)).longValue();
    }
}
