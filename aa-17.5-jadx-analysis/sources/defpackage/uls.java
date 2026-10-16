package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Calendar;

/* loaded from: classes3.dex */
public final class uls {
    private static final yob f = yob.c("com/google/android/libraries/geo/mapcore/internal/network/paint/PaintTileResponse");
    public final abgp a;
    public final abgo b;
    public final String c;
    public final String d;
    public final yfq e;

    public uls(abgp abgpVar, abgo abgoVar, String str, String str2, yfq yfqVar) {
        this.a = abgpVar;
        this.b = abgoVar;
        this.c = str;
        this.d = str2;
        this.e = yfqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final byte[] a(abgl abglVar) {
        abgp abgpVar = this.a;
        if (abgpVar.i.startsWith("image/")) {
            abuf abufVar = abgpVar.h;
            if (abufVar == null) {
                abufVar = abuf.a;
            }
            abnh abnhVar = abge.c;
            abufVar.j(abnhVar);
            abnl abnlVar = abufVar.w;
            abnu abnuVar = abnhVar.d;
            if (abnlVar.m(abnuVar)) {
                abuf abufVar2 = abgpVar.h;
                if (abufVar2 == null) {
                    abufVar2 = abuf.a;
                }
                abufVar2.j(abnhVar);
                Object objJ = abufVar2.w.j(abnuVar);
                aboh abohVar = ((abge) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).b;
                int size = abohVar.size();
                ygp ygpVar = new ygp();
                for (int i = 0; i < size; i++) {
                    ygpVar.k(((abgb) abohVar.get(i)).b);
                }
                int i2 = Calendar.getInstance().get(1);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    if (abglVar == abgl.GMM_SATELLITE) {
                        int i3 = yfq.d;
                        ujs.b(yls.a, ygpVar.g(), i2, new DataOutputStream(byteArrayOutputStream));
                    } else {
                        ygr ygrVarG = ygpVar.g();
                        int i4 = yfq.d;
                        ujs.b(ygrVarG, yls.a, i2, new DataOutputStream(byteArrayOutputStream));
                    }
                    byte[] bArr = new byte[byteArrayOutputStream.size() + abgpVar.d.d()];
                    System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr, 0, byteArrayOutputStream.size());
                    System.arraycopy(abgpVar.d.D(), 0, bArr, byteArrayOutputStream.size(), abgpVar.d.d());
                    return bArr;
                } catch (IOException e) {
                    ((ynz) ((ynz) ((ynz) f.g()).p(e)).ai((char) 9421)).u("Unable to write copyright header");
                    return this.a.d.D();
                }
            }
        }
        return this.a.d.D();
    }
}
