package defpackage;

import android.graphics.Bitmap;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class uhz {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/legacy/vector/gl/drawable/GLVectorTileStyler");
    private static final ukf o;
    private static final ukf p;
    public final uie b;
    public final String c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final Map i;
    public boolean j;
    public final acjs k;
    public final acjs l;
    public final acjs m;
    public final acjs n;
    private final boolean q;

    static {
        uje ujeVarF = ujf.c.f();
        ujeVarF.a = false;
        ujeVarF.g = 1862270976;
        o = ukf.k(new ujf(ujeVarF), false);
        uje ujeVarF2 = ujf.c.f();
        ujeVarF2.a = false;
        ujeVarF2.g = -872415232;
        p = ukf.k(new ujf(ujeVarF2), false);
    }

    public uhz(ukp ukpVar, abgl abglVar, boolean z) {
        this.b = new uie();
        this.k = new acjs(64, (byte[]) null);
        this.l = new acjs(16, (byte[]) null);
        this.m = new acjs(16, (byte[]) null);
        this.n = new acjs(4, (byte[]) null);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new HashMap();
        this.j = false;
        this.c = "tile at " + ukpVar.toString() + ", tileType " + abglVar.name();
        this.q = z;
    }

    public static ukf b(tzy tzyVar) {
        int i = tzyVar.c;
        return i > 0 ? o : i < 0 ? p : ukf.a;
    }

    @ResultIgnorabilityUnspecified
    static boolean i(adut adutVar, ujf ujfVar, boolean z) {
        int iE = 0;
        if (z) {
            if (!ujfVar.i && ujfVar.t()) {
                iE = ujfVar.e();
            }
            adutVar.b = iE;
            adutVar.c = null;
            return true;
        }
        boolean z2 = ujfVar.h;
        int i = true != z2 ? -1 : 0;
        float[] fArr = ujfVar.E;
        adutVar.b = i;
        adutVar.c = fArr;
        int i2 = ujfVar.F;
        if (z2 || i2 == adutVar.a) {
            return true;
        }
        adutVar.a = i2;
        return false;
    }

    public final byte a(uhv uhvVar) {
        return this.k.f(uhvVar);
    }

    @ResultIgnorabilityUnspecified
    public final int c(uhv uhvVar) {
        int iH = this.k.h(uhvVar);
        if (iH == 1) {
            this.d.add(new uid());
            return iH;
        }
        if (iH == 3) {
            ((ynz) ((ynz) ((ynz) a.g()).p(new uhy(this, "area", 64))).ai((char) 9367)).y("Failure adding AreaStyleKey: %s", uhvVar);
        }
        return iH;
    }

    @ResultIgnorabilityUnspecified
    public final void d(float f) {
        j(this.f, this.l, f);
    }

    @ResultIgnorabilityUnspecified
    public final void e(float f) {
        j(this.g, this.m, f);
    }

    public final void f(uvg uvgVar) {
        this.j = true;
        uvgVar.k();
    }

    public final uwi g(String str, upr uprVar, final uvg uvgVar) {
        uwg uwgVar = uvgVar.o;
        int iHashCode = str.hashCode();
        if (uwgVar == null) {
            return null;
        }
        uwi uwiVarG = uwgVar.g(iHashCode);
        if (uwiVarG != null) {
            return uwiVarG;
        }
        upy upyVarC = uprVar.c(str, "GLVectorTileStyler#getResourceBitmap()", null);
        if (upyVarC.l()) {
            Bitmap bitmapC = upyVarC.c();
            if (bitmapC != null) {
                return uwgVar.f(bitmapC, iHashCode, -1, 0, 0, 1.0f);
            }
            return null;
        }
        upyVarC.e(new upw() { // from class: uhu
            @Override // defpackage.upw
            public final void a(upy upyVar) {
                this.a.f(uvgVar);
            }
        });
        if (!upyVarC.l()) {
            return null;
        }
        f(uvgVar);
        return null;
    }

    @ResultIgnorabilityUnspecified
    public final void h(int i, upr uprVar, uvg uvgVar) {
        uwi uwiVarG;
        uwi uwiVarG2;
        acjs acjsVar = this.k;
        for (uhv uhvVar : acjsVar.g()) {
            byte bF = acjsVar.f(uhvVar);
            uju ujuVar = uhvVar.b;
            ujf ujfVarA = this.b.a(ujuVar, ujuVar.b() ? i : uhvVar.c);
            List list = this.d;
            if (((uid) list.get(bF)).o == null) {
                ((uid) list.get(bF)).o = Integer.valueOf(ujfVarA.F);
            }
            uid uidVar = (uid) list.get(bF);
            tzy tzyVar = uhvVar.a;
            List list2 = this.e;
            boolean z = !uha.e(ujfVarA) || uha.f(ujfVarA, this.q);
            if (tzyVar != null) {
                int i2 = tzyVar.c;
                uidVar.b(i2 > 0 ? 1862270976 : i2 < 0 ? -872415232 : 0, 0);
            } else {
                uidVar.b(ujfVarA.d ? 0 : ujfVarA.j, z ? 0 : ujfVarA.n[0].b);
            }
            uidVar.c = false;
            uidVar.d = false;
            uidVar.e = 0;
            uidVar.f = 0;
            uidVar.g = 0;
            uidVar.h = 0;
            uidVar.i = 0;
            uidVar.j = 0;
            uidVar.k = 0;
            uidVar.l = 0;
            uidVar.m = 0;
            uidVar.n = 0;
            if (uvgVar.o != null && ujfVarA.h()) {
                if (ujfVarA.K != -1 && (uwiVarG2 = g(ujfVarA.L.b, uprVar, uvgVar)) != null) {
                    int iC = uid.c(ujfVarA.S, ujfVarA.T, ujfVarA.U);
                    uidVar.j = uwiVarG2.b;
                    uidVar.k = uwiVarG2.c;
                    uidVar.l = uwiVarG2.d;
                    uidVar.m = uwiVarG2.e;
                    uidVar.n = iC;
                    uidVar.d = true;
                    list2.add(uwiVarG2);
                }
                if (ujfVarA.M != -1 && (uwiVarG = g(ujfVarA.N.b, uprVar, uvgVar)) != null) {
                    int iC2 = uid.c(ujfVarA.V, ujfVarA.W, ujfVarA.X);
                    uidVar.e = uwiVarG.b;
                    uidVar.f = uwiVarG.c;
                    uidVar.g = uwiVarG.d;
                    uidVar.h = uwiVarG.e;
                    uidVar.i = iC2;
                    uidVar.c = true;
                    list2.add(uwiVarG);
                }
            }
            int i3 = ujfVarA.F;
            if (!z || !ujfVarA.d) {
                Integer num = uidVar.o;
                if (num != null) {
                    num.intValue();
                }
            }
        }
        this.j = false;
    }

    public final void j(List list, acjs acjsVar, float f) {
        ujf ujfVarF;
        for (uhx uhxVar : acjsVar.g()) {
            byte bF = acjsVar.f(uhxVar);
            uju ujuVar = uhxVar.b;
            float f2 = ujuVar.b() ? f : uhxVar.c;
            uie uieVar = this.b;
            if (ujuVar.c()) {
                ujfVarF = ujf.c;
            } else if (ujuVar.b()) {
                Object obj = uieVar.b;
                if (obj == null) {
                    ujfVarF = ujf.c;
                } else {
                    int i = ujuVar.e;
                    if (i != 0) {
                        ujfVarF = ((ukh) obj).b(i).f(f2);
                    } else {
                        long j = ujuVar.c;
                        if (j != -1) {
                            ujfVarF = ((ukh) obj).c(j).f(f2);
                        } else {
                            int i2 = ujuVar.d;
                            ujfVarF = i2 != -1 ? ((ukh) obj).c(i2).f(f2) : ujf.c;
                        }
                    }
                }
            } else {
                ukf ukfVarE = ujuVar.e((ukh) uieVar.a, null, null);
                Object obj2 = uieVar.c;
                ukf ukfVarI = obj2 != null ? ukfVarE.i(((ujk) obj2).L) : null;
                ujfVarF = ukfVarI != null ? ukfVarI.f(f2) : ukfVarE.f(f2);
            }
            if (!((xxh) ((ajnt) list.get(bF)).b).f()) {
                ((ajnt) list.get(bF)).e(ujfVarF.F);
            }
            ajnt ajntVar = (ajnt) list.get(bF);
            int i3 = ujfVarF.m;
            int i4 = ujfVarF.O;
            boolean z = ujfVarF.g || !ujfVarF.s();
            int i5 = ujfVarF.F;
            if (!z && i5 != ((Integer) ((xxh) ajntVar.b).d(0)).intValue()) {
                ajntVar.e(i5);
                return;
            }
            if (true == z) {
                i3 = 0;
            }
            ajntVar.a = i3;
            if (ujfVarF.m()) {
                wub.aC(ujfVarF.d());
            }
            if (ujfVarF.k()) {
                wub.aC(ujfVarF.b());
            }
            if (ujfVarF.l()) {
                ujfVarF.c();
            }
            if (ujfVarF.j()) {
                ujfVarF.a();
            }
        }
    }

    public uhz(boolean z) {
        this.b = new uie();
        this.k = new acjs(64, (byte[]) null);
        this.l = new acjs(16, (byte[]) null);
        this.m = new acjs(16, (byte[]) null);
        this.n = new acjs(4, (byte[]) null);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new HashMap();
        this.j = false;
        this.c = "client injected geometry";
        this.q = z;
    }
}
