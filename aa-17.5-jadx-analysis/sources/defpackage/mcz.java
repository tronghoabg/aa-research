package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
final /* synthetic */ class mcz extends afey implements afeh {
    public static final mcz a = new mcz();

    public mcz() {
        super(3, mcx.class, "<init>", "<init>(Lcom/google/android/gms/car/CarClientToken;Ljava/util/Map;Z)V", 0);
    }

    @Override // defpackage.afeh
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Map map = (Map) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        map.getClass();
        return new mcx((qrn) obj, map, zBooleanValue);
    }
}
