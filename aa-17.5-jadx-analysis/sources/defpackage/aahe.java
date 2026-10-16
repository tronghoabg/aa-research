package defpackage;

import android.util.Log;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.StreetViewSource;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aahe extends zsm {
    private static final String f = "aahe";
    public final String b;
    public final LatLng c;
    public final Integer d;
    public final StreetViewSource e;
    private final aahd g;
    private final String h;

    public aahe(String str, LatLng latLng, Integer num, StreetViewSource streetViewSource, aahd aahdVar, String str2, aahf aahfVar) {
        zkt.e((str == null && latLng == null) ? false : true, "Failed to provide PanoID or LatLng.");
        zkt.e(str == null || latLng == null, "Cannot set both PanoID and LatLng.");
        this.b = str;
        this.c = latLng;
        this.d = num;
        this.e = streetViewSource;
        this.g = aahdVar;
        zkt.n(str2, "debugStr");
        this.h = str2;
        zkt.n(aahfVar, "streetViewProtoDefaults");
    }

    @Override // defpackage.zsm, defpackage.zsr
    public final void b() {
        g("onPermanentFailure");
        String str = f;
        if (zrn.e(str, 6)) {
            Log.e(str, String.format("onPermanentFailure(%s)", this.h));
        }
        this.g.c(this, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aahe)) {
            return false;
        }
        aahe aaheVar = (aahe) obj;
        return a.C(this.b, aaheVar.b) && a.C(this.c, aaheVar.c) && a.C(this.d, aaheVar.d) && a.C(this.e, aaheVar.e);
    }

    @Override // defpackage.zsr
    public final int h() {
        return 40;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e});
    }

    @Override // defpackage.zsr
    public final void i(DataOutputStream dataOutputStream) throws IOException {
        abnp abnpVarB = aahf.b(0, 0, 0);
        acij acijVar = aahf.d;
        abnpVarB.t();
        acir acirVar = (acir) abnpVarB.b;
        acir acirVar2 = acir.a;
        acijVar.getClass();
        acirVar.h = acijVar;
        acirVar.b |= 32;
        String str = this.b;
        if (str != null) {
            abnpVarB.t();
            acir acirVar3 = (acir) abnpVarB.b;
            acirVar3.b |= 1;
            acirVar3.c = str;
        } else {
            LatLng latLng = this.c;
            double d = aahr.a;
            zkt.n(latLng, "LatLng");
            abnp abnpVarN = acht.a.n();
            int i = aahr.i(latLng.latitude);
            abnpVarN.t();
            acht achtVar = (acht) abnpVarN.b;
            achtVar.b |= 1;
            achtVar.c = i;
            int i2 = aahr.i(latLng.longitude);
            abnpVarN.t();
            acht achtVar2 = (acht) abnpVarN.b;
            achtVar2.b |= 2;
            achtVar2.d = i2;
            acht achtVar3 = (acht) abnpVarN.q();
            abnpVarB.t();
            acir acirVar4 = (acir) abnpVarB.b;
            achtVar3.getClass();
            acirVar4.d = achtVar3;
            acirVar4.b |= 2;
            Integer num = this.d;
            if (num != null) {
                int iIntValue = num.intValue();
                abnpVarB.t();
                acir acirVar5 = (acir) abnpVarB.b;
                acirVar5.b |= 4;
                acirVar5.e = iIntValue;
            }
            if (a.C(this.e, StreetViewSource.OUTDOOR)) {
                acil acilVar = acil.OUTDOOR;
                abnpVarB.t();
                acir acirVar6 = (acir) abnpVarB.b;
                acirVar6.f = acilVar.c;
                acirVar6.b |= 8;
            }
        }
        acir acirVar7 = (acir) abnpVarB.q();
        String str2 = f;
        if (zrn.e(str2, 4)) {
            Log.i(str2, String.format("writeRequestData(%s) => %s", this.h, wox.at(acirVar7)));
        }
        zrp.b(dataOutputStream, acirVar7);
    }

    @Override // defpackage.zsr
    public final void j(DataInputStream dataInputStream) throws IOException {
        aciy aciyVar = aciy.a;
        aciy aciyVar2 = (aciy) zrp.a(abnv.L(aciy.class), dataInputStream);
        String str = f;
        if (zrn.e(str, 4)) {
            Log.i(str, String.format("readResponseData(%s) => %s", this.h, wox.au(aciyVar2)));
        }
        int i = aciyVar2.b;
        if ((i & 1) == 0 || (i & 2) == 0) {
            if (zrn.e(str, 6)) {
                Log.e(str, String.format("Request [%s] had no metadata [%s]", this.h, wox.au(aciyVar2)));
            }
            this.g.c(this, null, null);
        } else {
            byte[] bArr = (byte[]) aahf.a(aciyVar2).get(new aagj(aciyVar2.c, 0, 0, 0));
            aahd aahdVar = this.g;
            acih acihVar = aciyVar2.d;
            if (acihVar == null) {
                acihVar = acih.a;
            }
            aahdVar.c(this, acihVar, bArr);
        }
    }

    @Override // defpackage.zsm
    public final String toString() {
        return String.format("StreetViewMetadataProtoRequest[%s]", this.h);
    }
}
