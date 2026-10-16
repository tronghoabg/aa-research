package defpackage;

import android.graphics.PathMeasure;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class blv implements afdr {
    private final /* synthetic */ int a;

    public /* synthetic */ blv(int i) {
        this.a = i;
    }

    @Override // defpackage.afdr
    public final Object invoke() {
        Choreographer choreographer;
        boolean z = true;
        byte[] bArr = null;
        switch (this.a) {
            case 0:
                return bju.a;
            case 1:
                return null;
            case 2:
                return true;
            case 3:
                return new dlj(48.0f);
            case 4:
                return new bog(bArr);
            case 5:
                bvf bvfVar = bpe.a;
                return bpd.a;
            case 6:
                return new dlj(BitmapDescriptorFactory.HUE_RED);
            case 7:
                return buh.a;
            case 8:
                buz.a("Unexpected call to default provider");
                throw new aezp();
            case 9:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 10:
                buz.a("Unexpected call to default provider");
                throw new aezp();
            case 11:
                return cde.a;
            case 12:
                return new cdo(bArr);
            case 13:
            case 14:
                return null;
            case 15:
                return new sm(new PathMeasure());
            case 16:
                return afak.a;
            case 17:
                return new cxb(z, 2, bArr);
            case 18:
                return new cxb(false, 3, bArr);
            case 19:
                a.am("LocalConfiguration");
                throw new aezp();
            default:
                if (a.Z()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    aitu aituVar = aium.a;
                    choreographer = (Choreographer) aiik.a(ajct.a, new dww((afck) null, 1, (byte[]) null));
                }
                dag dagVar = new dag(choreographer, Handler.createAsync(Looper.getMainLooper()));
                return dagVar.plus(dagVar.j);
        }
    }
}
