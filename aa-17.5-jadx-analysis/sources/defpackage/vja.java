package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Locale;

/* loaded from: classes3.dex */
public class vja {
    public vja(Context context) {
        context.getContentResolver();
    }

    public static Bundle a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(vja.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(vja.class.getClassLoader());
        return bundle2;
    }

    public static Bundle b(Bundle bundle) {
        bundle.setClassLoader(vja.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(vja.class.getClassLoader());
        return bundle2;
    }

    public static Parcelable c(Bundle bundle, String str) {
        Bundle bundleA = a(bundle);
        if (bundleA == null) {
            return null;
        }
        return bundleA.getParcelable(str);
    }

    public static void d(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        Bundle bundleA = a(bundle);
        if (bundleA != null) {
            Bundle bundleB = b(bundle2);
            Parcelable parcelable = bundleA.getParcelable("MapOptions");
            if (parcelable != null) {
                bundleB.putParcelable("MapOptions", parcelable);
            }
            Parcelable parcelable2 = bundleA.getParcelable("StreetViewPanoramaOptions");
            if (parcelable2 != null) {
                bundleB.putParcelable("StreetViewPanoramaOptions", parcelable2);
            }
            Parcelable parcelable3 = bundleA.getParcelable("camera");
            if (parcelable3 != null) {
                bundleB.putParcelable("camera", parcelable3);
            }
            if (bundleA.containsKey("indoor_state")) {
                bundleB.putBundle("indoor_state", bundleA.getBundle("indoor_state"));
            }
            if (bundleA.containsKey("lat_lng_bounds")) {
                bundleB.putParcelable("lat_lng_bounds", bundleA.getParcelable("lat_lng_bounds"));
            }
            if (bundleA.containsKey("paddings")) {
                bundleB.putIntegerArrayList("paddings", bundleA.getIntegerArrayList("paddings"));
            }
            if (bundleA.containsKey("compass_enabled")) {
                bundleB.putBoolean("compass_enabled", bundleA.getBoolean("compass_enabled"));
            }
            if (bundleA.containsKey("min_zoom_preference")) {
                bundleB.putFloat("min_zoom_preference", bundleA.getFloat("min_zoom_preference"));
            }
            if (bundleA.containsKey("max_zoom_preference")) {
                bundleB.putFloat("max_zoom_preference", bundleA.getFloat("max_zoom_preference"));
            }
            bundle2.putBundle("map_state", bundleB);
        }
        if (bundle.containsKey("position")) {
            bundle2.putString("position", bundle.getString("position"));
        }
        if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
            bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
        }
    }

    public static void e(Bundle bundle, String str, Parcelable parcelable) {
        Bundle bundleB = b(bundle);
        bundleB.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundleB);
    }

    public static byte f(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    public static Boolean g(byte b) {
        if (b != 0) {
            return b != 1 ? null : true;
        }
        return false;
    }

    public static int h(double d) {
        return (int) Math.round(d * 1.0E7d);
    }

    public static boolean i(zpi zpiVar) {
        zpe zpeVar = vcw.a(zpiVar).a.d;
        if (zpeVar == null) {
            zpeVar = zpe.a;
        }
        int iAq = a.aq(zpeVar.b);
        return iAq != 0 && iAq == 3;
    }

    public static void j(final cmw cmwVar, cfy cfyVar, long j, bux buxVar, final int i, final int i2) {
        int i3;
        long j2;
        final cfy cfyVar2;
        final long j3;
        cmwVar.getClass();
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-1924880865);
        if (i4 == 0) {
            i3 = (true != ((i & 8) == 0 ? buxVarC.C(cmwVar) : buxVarC.E(cmwVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.C(null) ? 16 : 32;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            int i6 = 1024;
            if ((i2 & 8) == 0) {
                j2 = j;
                if (buxVarC.B(j2)) {
                    i6 = 2048;
                }
            } else {
                j2 = j;
            }
            i3 |= i6;
        } else {
            j2 = j;
        }
        if (buxVarC.I((i3 & 1171) != 1170, i3 & 1)) {
            int i7 = i2 & 8;
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                cfy cfyVar3 = i5 != 0 ? cfy.e : cfyVar;
                if (i7 != 0) {
                    i3 &= -7169;
                    cfyVar2 = cfyVar3;
                    j3 = ((cjv) buxVarC.f(bnm.a)).a;
                    buxVarC.l();
                    boc.a(cmwVar, null, cfyVar2, j3, buxVarC, (i3 & 14) | 8 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                } else {
                    cfyVar2 = cfyVar3;
                }
            } else {
                buxVarC.s();
                if (i7 != 0) {
                    i3 &= -7169;
                }
                cfyVar2 = cfyVar;
            }
            j3 = j2;
            buxVarC.l();
            boc.a(cmwVar, null, cfyVar2, j3, buxVarC, (i3 & 14) | 8 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
            j3 = j2;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: vjx
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    ((Integer) obj2).intValue();
                    int i8 = i | 1;
                    int i9 = 306783378 & i8;
                    int i10 = 613566756 & i8;
                    vja.j(cmwVar, cfyVar2, j3, buxVar2, (i8 & (-920350135)) | i9 | (i10 >> 1) | ((i9 + i9) & i10), i2);
                    return afak.a;
                }
            };
        }
    }

    public static void k(cfy cfyVar, long j, bux buxVar, int i) {
        cfy cfyVar2;
        long j2;
        bux buxVarC = buxVar.c(964649005);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.z(BitmapDescriptorFactory.HUE_RED) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                cfyVar = cfy.e;
                j = m(buxVarC);
            } else {
                buxVarC.s();
            }
            cfy cfyVar3 = cfyVar;
            long j3 = j;
            buxVarC.l();
            xb.a(cfyVar3, BitmapDescriptorFactory.HUE_RED, j3, buxVarC, i2 & 126, 0);
            cfyVar2 = cfyVar3;
            j2 = j3;
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
            j2 = j;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new vjw(cfyVar2, j2, i, 0);
        }
    }

    public static void l(cfy cfyVar, long j, bux buxVar, int i) {
        int i2;
        long j2;
        bux buxVarC = buxVar.c(634017535);
        if ((i & 6) == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.z(BitmapDescriptorFactory.HUE_RED) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                j = m(buxVarC);
            } else {
                buxVarC.s();
            }
            long j3 = j;
            buxVarC.l();
            xb.b(cfyVar, BitmapDescriptorFactory.HUE_RED, j3, buxVarC, i2 & 126, 0);
            j2 = j3;
        } else {
            buxVarC.s();
            j2 = j;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new vjw(cfyVar, j2, i, 1);
        }
    }

    public static long m(bux buxVar) {
        bng bngVarAt = czz.at(buxVar);
        return a.Y(24, 0) ? bngVarAt.n : a.Y(24, 1) ? bngVarAt.w : a.Y(24, 2) ? bngVarAt.y : a.Y(24, 3) ? bngVarAt.v : a.Y(24, 4) ? bngVarAt.e : a.Y(24, 5) ? bngVarAt.u : a.Y(24, 6) ? bngVarAt.o : a.Y(24, 7) ? bngVarAt.x : a.Y(24, 8) ? bngVarAt.z : a.Y(24, 9) ? bngVarAt.b : a.Y(24, 10) ? bngVarAt.d : a.Y(24, 11) ? bngVarAt.M : a.Y(24, 12) ? bngVarAt.N : a.Y(24, 13) ? bngVarAt.g : a.Y(24, 14) ? bngVarAt.i : a.Y(24, 15) ? bngVarAt.Q : a.Y(24, 16) ? bngVarAt.R : a.Y(24, 17) ? bngVarAt.q : a.Y(24, 18) ? bngVarAt.s : a.Y(24, 19) ? bngVarAt.k : a.Y(24, 20) ? bngVarAt.m : a.Y(24, 21) ? bngVarAt.U : a.Y(24, 22) ? bngVarAt.V : a.Y(24, 23) ? bngVarAt.A : a.Y(24, 24) ? bngVarAt.B : a.Y(24, 25) ? bngVarAt.a : a.Y(24, 26) ? bngVarAt.c : a.Y(24, 27) ? bngVarAt.K : a.Y(24, 28) ? bngVarAt.L : a.Y(24, 29) ? bngVarAt.C : a.Y(24, 30) ? bngVarAt.f : a.Y(24, 31) ? bngVarAt.h : a.Y(24, 32) ? bngVarAt.O : a.Y(24, 33) ? bngVarAt.P : a.Y(24, 34) ? bngVarAt.p : a.Y(24, 35) ? bngVarAt.D : a.Y(24, 36) ? bngVarAt.F : a.Y(24, 37) ? bngVarAt.G : a.Y(24, 38) ? bngVarAt.H : a.Y(24, 39) ? bngVarAt.I : a.Y(24, 40) ? bngVarAt.J : a.Y(24, 41) ? bngVarAt.E : a.Y(24, 42) ? bngVarAt.r : a.Y(24, 43) ? bngVarAt.j : a.Y(24, 44) ? bngVarAt.l : a.Y(24, 45) ? bngVarAt.S : a.Y(24, 46) ? bngVarAt.T : cjn.n();
    }

    public static svz p(zgp zgpVar) {
        erb erbVar = new erb((short[]) null);
        nok nokVar = new nok((erb) erbVar.a);
        wub.ah(zgpVar, new vav(nokVar, zgpVar, erbVar), zfq.a);
        return (svz) nokVar.a;
    }

    public static uzy q(Object obj) {
        return new vaa(obj).a;
    }

    public static adiz r(yfq yfqVar) {
        return new zin(new uxu(yfqVar, 2), abow.class, abow.class);
    }

    public static Locale s(Context context) {
        Locale localeE = dsg.y(context.getApplicationContext().getResources().getConfiguration()).e(0);
        if (localeE != null) {
            return localeE;
        }
        Locale locale = Locale.getDefault();
        locale.getClass();
        return locale;
    }

    public vja(byte[] bArr) {
    }

    private vja() {
    }

    public void n(vjs vjsVar) {
    }

    public void o(double d) {
    }
}
