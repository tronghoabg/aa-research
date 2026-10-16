package defpackage;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes2.dex */
public final class jxc {
    public static final void a(fxs fxsVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        ajh ajhVarB;
        bux buxVarC = buxVar.c(676073172);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(fxsVar) : buxVarC.E(fxsVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            if (ca.bl(buxVarC)) {
                buxVarC.v(1794370831);
                ajhVarB = afp.B(2.0f, czz.at(buxVarC).B);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(1794462126);
                ((bvv) buxVarC).Y(false);
                ajhVarB = null;
            }
            gfk gfkVar = fxsVar.b;
            fxl fxlVar = new fxl(fxsVar.a, gfkVar, fxsVar.d, fxsVar.e, fxsVar.f, ajhVarB, false, false, 448);
            aezr aezrVar = ktf.a;
            buxVar2 = buxVarC;
            jtq.a(fxlVar, awd.d(j(gut.e(cfyVar, fxsVar), fxsVar.j), jts.b.e.h), kgq.e(kfn.i(buxVarC).N(), czz.at(buxVarC).q, 0L, 0L, 0L, 0L, 0L, buxVar2, 252), fxa.i(), buxVar2, 8, 0);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new jtt(fxsVar, cfyVar, i, 17);
        }
    }

    public static final void b(fxs fxsVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1095288268);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(fxsVar) : buxVarC.E(fxsVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            int i5 = i2 & 14;
            int i6 = fxsVar.j - 1;
            if (i6 == 0) {
                buxVarC.v(305043740);
                a(fxsVar, cfyVar, buxVarC, (i2 & 112) | i5 | 8);
                ((bvv) buxVarC).Y(false);
            } else if (i6 != 1) {
                buxVarC.v(305058177);
                d(fxsVar, 3, cfyVar, buxVarC, ((i2 << 3) & 896) | i5 | 56);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(305046880);
                if (affa.f(fxsVar.a, gey.b)) {
                    buxVarC.v(866725305);
                    d(fxsVar, 2, cfyVar, buxVarC, ((i2 << 3) & 896) | i5 | 56);
                    ((bvv) buxVarC).Y(false);
                } else {
                    buxVarC.v(866604994);
                    a(fxsVar, cfyVar, buxVarC, (i2 & 112) | i5 | 8);
                    ((bvv) buxVarC).Y(false);
                }
                ((bvv) buxVarC).Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new jtt(fxsVar, cfyVar, i, i4);
        }
    }

    public static final void c(fxs fxsVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-676682218);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(fxsVar) : buxVarC.E(fxsVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        int i4 = 18;
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            fwn.f(fxsVar.i, 0, 0, bxc.i(793354270, true, new fun(fxsVar, cfyVar, 14), buxVarC), buxVarC, 3072, 6);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new jtt(fxsVar, cfyVar, i, i4);
        }
    }

    public static final void d(fxs fxsVar, int i, cfy cfyVar, bux buxVar, int i2) {
        int i3;
        bux buxVarC = buxVar.c(-716407489);
        if ((i2 & 6) == 0) {
            i3 = (true != ((i2 & 8) == 0 ? buxVarC.C(fxsVar) : buxVarC.E(fxsVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != buxVarC.A(i + (-1)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if (buxVarC.I((i3 & 147) != 146, i3 & 1)) {
            jtr.a(new fxn(fxsVar.b, fxsVar.d, fxsVar.f, i, false, 16), j(gut.e(cfyVar, fxsVar), fxsVar.j), fxa.i(), buxVarC, 8, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new fwz(fxsVar, i, cfyVar, i2, 14);
        }
    }

    public static /* synthetic */ int e(int i, int i2) {
        int i3 = i / i2;
        return (i - (i2 * i3) != 0 && (((i ^ i2) >> 31) | 1) < 0) ? i3 - 1 : i3;
    }

    public static void f(Context context, boolean z) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        wifiManager.getClass();
        wifiManager.setWifiEnabled(z);
    }

    public static tgu g(InputStream inputStream, OutputStream outputStream, Closeable closeable, par parVar, par parVar2) {
        woy.aa(koo.n(), "Failure injection is not enabled");
        return new koc(closeable, new kod(inputStream, parVar), new kog(outputStream, parVar2));
    }

    public static tgu h(ParcelFileDescriptor parcelFileDescriptor) {
        return g(new FileInputStream(parcelFileDescriptor.getFileDescriptor()), new FileOutputStream(parcelFileDescriptor.getFileDescriptor()), parcelFileDescriptor, par.GAL_READ, par.GAL_WRITE);
    }

    public static tgu i(Socket socket, int i) throws IOException {
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        boolean z = i == 1;
        return g(inputStream, outputStream, socket, z ? par.WPP_READ : par.GAL_READ, z ? par.WPP_WRITE : par.GAL_WRITE);
    }

    private static final cfy j(cfy cfyVar, int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? awd.n(cfyVar, jts.c.f, Float.NaN) : awd.n(cfyVar, jts.b.f, Float.NaN) : awd.n(cfyVar, jts.b.f, Float.NaN);
    }
}
