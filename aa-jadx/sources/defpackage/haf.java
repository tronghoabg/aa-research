package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class haf implements defpackage.cqc {
    final /* synthetic */ float a;
    final /* synthetic */ defpackage.byh b;

    public haf(float f, defpackage.byh byhVar) {
        this.a = f;
        this.b = byhVar;
    }

    @Override // defpackage.cqc
    public final long a(long j, long j2, int i) {
        int i2 = (int) (j2 & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i2) <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            return 0L;
        }
        defpackage.byh byhVar = this.b;
        if (byhVar.e() <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            return 0L;
        }
        float fMin = java.lang.Math.min(byhVar.e(), java.lang.Float.intBitsToFloat(i2));
        byhVar.h(byhVar.e() - fMin);
        return 4294967295L & ((long) java.lang.Float.floatToRawIntBits(fMin));
    }

    @Override // defpackage.cqc
    public final long b(long j, int i) {
        int i2 = (int) (j & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i2) >= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            return 0L;
        }
        defpackage.byh byhVar = this.b;
        float f = this.a;
        if (byhVar.e() >= f) {
            return 0L;
        }
        float fMin = java.lang.Math.min(f - byhVar.e(), -java.lang.Float.intBitsToFloat(i2));
        byhVar.h(byhVar.e() + fMin);
        return ((long) java.lang.Float.floatToRawIntBits(-fMin)) & 4294967295L;
    }

    @Override // defpackage.cqc
    public final /* synthetic */ java.lang.Object c(long j, long j2, defpackage.afdk afdkVar) {
        return new defpackage.dmd(0L);
    }

    @Override // defpackage.cqc
    public final /* synthetic */ java.lang.Object d(long j, defpackage.afdk afdkVar) {
        return new defpackage.dmd(0L);
    }
}
