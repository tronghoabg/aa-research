package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class gzv implements cpt {
    final /* synthetic */ float a;
    final /* synthetic */ byb b;

    public gzv(float f, byb bybVar) {
        this.a = f;
        this.b = bybVar;
    }

    @Override // defpackage.cpt
    public final long a(long j, long j2, int i) {
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) <= BitmapDescriptorFactory.HUE_RED) {
            return 0L;
        }
        byb bybVar = this.b;
        if (bybVar.e() <= BitmapDescriptorFactory.HUE_RED) {
            return 0L;
        }
        bybVar.h(bybVar.e() - Math.min(bybVar.e(), Float.intBitsToFloat(i2)));
        return (4294967295L & Float.floatToRawIntBits(r5)) | (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32);
    }

    @Override // defpackage.cpt
    public final long b(long j, int i) {
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i2) >= BitmapDescriptorFactory.HUE_RED) {
            return 0L;
        }
        byb bybVar = this.b;
        float f = this.a;
        if (bybVar.e() >= f) {
            return 0L;
        }
        bybVar.h(bybVar.e() + Math.min(f - bybVar.e(), -Float.intBitsToFloat(i2)));
        return (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(-r4) & 4294967295L);
    }

    @Override // defpackage.cpt
    public final /* synthetic */ Object c(long j, long j2, afck afckVar) {
        return new dlv(0L);
    }

    @Override // defpackage.cpt
    public final /* synthetic */ Object d(long j, afck afckVar) {
        return new dlv(0L);
    }
}
