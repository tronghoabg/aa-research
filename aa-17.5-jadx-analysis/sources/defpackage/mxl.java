package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class mxl implements afec {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ mxl(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i = this.b;
        if (i == 0) {
            return myi.z(this.a, (cmd) obj);
        }
        if (i != 1) {
            return myi.z(this.a, (cmd) obj);
        }
        cmd cmdVar = (cmd) obj;
        cmdVar.getClass();
        long j = this.a;
        czz.aK(cmdVar, new ckh(woy.bi(new cjv(cjv.h(j, 0.4f)), new cjv(j)), (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (cmdVar.o() >> 32))) << 32), (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) & 4294967295L)), 0L, 0L, null, 0, 126);
        List listBi = woy.bi(new cjv(cjv.h(j, 0.4f)), new cjv(j));
        long jFloatToRawIntBits = Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED);
        czz.aK(cmdVar, new ckh(listBi, (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) & 4294967295L) | (jFloatToRawIntBits << 32), (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (cmdVar.o() & 4294967295L))) & 4294967295L)), 0L, 0L, null, 0, 126);
        return afak.a;
    }
}
