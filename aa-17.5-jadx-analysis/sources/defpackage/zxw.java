package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.LatLng;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zxw extends zsm {
    public zxv b;
    private final LatLng c;
    private final float d;
    private aacq[] e = null;

    public zxw(LatLng latLng, float f) {
        this.c = latLng;
        this.d = f;
    }

    private static int m(double d) {
        return (int) Math.round(d * 1000000.0d);
    }

    private static acht n(LatLng latLng) {
        abnp abnpVarN = acht.a.n();
        int iM = m(latLng.latitude);
        abnpVarN.t();
        acht achtVar = (acht) abnpVarN.b;
        achtVar.b |= 1;
        achtVar.c = iM;
        int iM2 = m(latLng.longitude);
        abnpVarN.t();
        acht achtVar2 = (acht) abnpVarN.b;
        achtVar2.b |= 2;
        achtVar2.d = iM2;
        return (acht) abnpVarN.q();
    }

    @Override // defpackage.zsm, defpackage.zsr
    public final void a() {
        g("onComplete");
        zxv zxvVar = this.b;
        if (zxvVar != null) {
            zxvVar.a(this);
        }
    }

    @Override // defpackage.zsr
    public final int h() {
        return 50;
    }

    @Override // defpackage.zsr
    public final void i(DataOutputStream dataOutputStream) throws IOException {
        abnp abnpVarN = acfc.a.n();
        abnp abnpVarN2 = achr.a.n();
        abnpVarN2.t();
        achr achrVar = (achr) abnpVarN2.b;
        achrVar.c = 1;
        achrVar.b |= 1;
        LatLng latLng = this.c;
        acht achtVarN = n(latLng);
        abnpVarN2.t();
        achr achrVar2 = (achr) abnpVarN2.b;
        achtVarN.getClass();
        achrVar2.d = achtVarN;
        achrVar2.b |= 2;
        achr achrVar3 = (achr) abnpVarN2.q();
        abnpVarN.t();
        acfc acfcVar = (acfc) abnpVarN.b;
        achrVar3.getClass();
        acfcVar.c = achrVar3;
        acfcVar.b |= 1;
        abnp abnpVarN3 = achs.a.n();
        acht achtVarN2 = n(latLng);
        abnpVarN3.t();
        achs achsVar = (achs) abnpVarN3.b;
        achtVarN2.getClass();
        achsVar.c = achtVarN2;
        achsVar.b |= 1;
        int iM = m(1.0E-6d);
        abnpVarN3.t();
        achs achsVar2 = (achs) abnpVarN3.b;
        achsVar2.b |= 2;
        achsVar2.d = iM;
        int iM2 = m(1.0E-6d);
        abnpVarN3.t();
        achs achsVar3 = (achs) abnpVarN3.b;
        achsVar3.b |= 4;
        achsVar3.e = iM2;
        float f = this.d;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            abnpVarN3.t();
            achs achsVar4 = (achs) abnpVarN3.b;
            achsVar4.b |= 8;
            achsVar4.f = (int) f;
        }
        achs achsVar5 = (achs) abnpVarN3.q();
        abnpVarN.t();
        acfc acfcVar2 = (acfc) abnpVarN.b;
        achsVar5.getClass();
        acfcVar2.d = achsVar5;
        acfcVar2.b |= 4;
        abnpVarN.t();
        acfc acfcVar3 = (acfc) abnpVarN.b;
        acfcVar3.b |= 8;
        acfcVar3.e = true;
        zrp.b(dataOutputStream, (acfc) abnpVarN.q());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zsr
    public final void j(DataInputStream dataInputStream) throws IOException {
        acfd acfdVar = acfd.a;
        acfd acfdVar2 = (acfd) zrp.a(abnv.L(acfd.class), dataInputStream);
        int iAy = a.ay(acfdVar2.b);
        if (iAy == 0 || iAy == 1) {
            this.e = new aacq[acfdVar2.c.size()];
            int i = 0;
            for (acfe acfeVar : acfdVar2.c) {
                String str = acfeVar.b.size() > 0 ? (String) acfeVar.b.get(0) : "";
                if (acfeVar.b.size() > 1) {
                    str = (String) acfeVar.b.get(1);
                }
                this.e[i] = new aacq(str);
                i++;
            }
        }
    }

    public final int k() {
        aacq[] aacqVarArr = this.e;
        if (aacqVarArr != null) {
            return aacqVarArr.length;
        }
        return 0;
    }

    public final aacq l() {
        aacq[] aacqVarArr = this.e;
        if (aacqVarArr.length <= 0) {
            return null;
        }
        return aacqVarArr[0];
    }
}
