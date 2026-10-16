package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class jtp implements afec {
    public final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ jtp(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i = this.b;
        float f = BitmapDescriptorFactory.HUE_RED;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                cks cksVar = (cks) obj;
                cksVar.getClass();
                if (true == this.a) {
                    f = 1.0f;
                }
                cksVar.o(f);
                break;
            case 8:
                cks cksVar2 = (cks) obj;
                cksVar2.getClass();
                if (true == this.a) {
                    f = 1.0f;
                }
                cksVar2.o(f);
                break;
            case 9:
                cie cieVar = (cie) obj;
                cieVar.getClass();
                cieVar.a(!this.a);
                break;
            default:
                tjt tjtVar = (tjt) obj;
                tjtVar.getClass();
                boolean z = tjtVar.b;
                boolean z2 = this.a;
                if (z2 != z) {
                    tjtVar.e();
                    tjtVar.b = z2;
                }
                break;
        }
        return afak.a;
    }
}
