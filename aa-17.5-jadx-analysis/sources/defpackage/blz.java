package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.UUID;

/* loaded from: classes.dex */
public final /* synthetic */ class blz implements afdr {
    private final /* synthetic */ int a;

    public /* synthetic */ blz(int i) {
        this.a = i;
    }

    @Override // defpackage.afdr
    public final Object invoke() {
        int i = this.a;
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        switch (i) {
            case 0:
                avp avpVar = bmf.a;
                return bnn.a;
            case 1:
            case 2:
                return null;
            case 3:
                return false;
            case 4:
                return new cnd();
            case 5:
                return new cnh();
            case 6:
                return cqa.b;
            case 7:
                return null;
            case 8:
                zf zfVar = czy.a;
                return false;
            case 9:
                return false;
            case 10:
                return null;
            case 12:
                afeg afegVar = ded.a;
            case 11:
                return false;
            case 13:
                afeg afegVar2 = ded.a;
                return fValueOf;
            case 14:
                afeg afegVar3 = ded.a;
                return fValueOf;
            case 15:
                return afak.a;
            case 16:
                return afak.a;
            case 17:
                return UUID.randomUUID();
            case 18:
                return "DEFAULT_TEST_TAG";
            case 19:
                return false;
            default:
                return UUID.randomUUID();
        }
    }
}
