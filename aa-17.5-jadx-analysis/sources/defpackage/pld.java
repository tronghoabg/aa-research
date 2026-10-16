package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes2.dex */
public class pld implements plg {
    private static final yob a = yob.c("com/google/android/apps/gmm/shared/cache/LongLRUCache");
    private final pkx b;
    private aenq c = new aenq(null);
    private aemi d = new aemi(null);
    private int e;
    private final vky f;

    public pld(plc plcVar, pkx pkxVar) {
        this.b = pkxVar;
        vky vkyVarD = vky.d(null, plcVar);
        this.f = vkyVarD;
        if (pkxVar != null) {
            pkxVar.c(this, vkyVarD);
        }
    }

    private final synchronized void j(long j) {
        Object objB = this.c.b(j);
        if (objB != null) {
            this.e -= this.d.b(j);
            h(objB);
        }
    }

    @Override // defpackage.plg
    public final String a() {
        return "numItems: " + c() + " measuredSize: " + b();
    }

    public final synchronized int b() {
        return this.e;
    }

    public final synchronized int c() {
        return this.c.k;
    }

    public final synchronized Object d(long j) {
        aenq aenqVar = this.c;
        Object obj = null;
        if (j != 0) {
            long[] jArr = aenqVar.a;
            long j2 = (-7046029254386353131L) * j;
            long j3 = j2 ^ (j2 >>> 32);
            int i = aenqVar.c & ((int) (j3 ^ (j3 >>> 16)));
            long j4 = jArr[i];
            if (j4 != 0) {
                if (j != j4) {
                    while (true) {
                        i = (i + 1) & aenqVar.c;
                        long j5 = jArr[i];
                        if (j5 == 0) {
                            break;
                        }
                        if (j == j5) {
                            aenqVar.z(i);
                            obj = aenqVar.b[i];
                            break;
                        }
                    }
                } else {
                    aenqVar.z(i);
                    obj = aenqVar.b[i];
                }
            }
        } else if (aenqVar.d) {
            aenqVar.z(aenqVar.h);
            return aenqVar.b[aenqVar.h];
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[Catch: all -> 0x00c1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0010, B:28:0x00a4, B:30:0x00b1, B:32:0x00ba, B:31:0x00b5, B:8:0x001d, B:20:0x005f, B:22:0x006b, B:24:0x0091, B:26:0x009a, B:23:0x0076, B:9:0x0022, B:13:0x0040, B:14:0x0048, B:18:0x0056), top: B:38:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[Catch: all -> 0x00c1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0010, B:28:0x00a4, B:30:0x00b1, B:32:0x00ba, B:31:0x00b5, B:8:0x001d, B:20:0x005f, B:22:0x006b, B:24:0x0091, B:26:0x009a, B:23:0x0076, B:9:0x0022, B:13:0x0040, B:14:0x0048, B:18:0x0056), top: B:38:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a A[Catch: all -> 0x00c1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0010, B:28:0x00a4, B:30:0x00b1, B:32:0x00ba, B:31:0x00b5, B:8:0x001d, B:20:0x005f, B:22:0x006b, B:24:0x0091, B:26:0x009a, B:23:0x0076, B:9:0x0022, B:13:0x0040, B:14:0x0048, B:18:0x0056), top: B:38:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1 A[Catch: all -> 0x00c1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0010, B:28:0x00a4, B:30:0x00b1, B:32:0x00ba, B:31:0x00b5, B:8:0x001d, B:20:0x005f, B:22:0x006b, B:24:0x0091, B:26:0x009a, B:23:0x0076, B:9:0x0022, B:13:0x0040, B:14:0x0048, B:18:0x0056), top: B:38:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5 A[Catch: all -> 0x00c1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0010, B:28:0x00a4, B:30:0x00b1, B:32:0x00ba, B:31:0x00b5, B:8:0x001d, B:20:0x005f, B:22:0x006b, B:24:0x0091, B:26:0x009a, B:23:0x0076, B:9:0x0022, B:13:0x0040, B:14:0x0048, B:18:0x0056), top: B:38:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e(long r13, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pld.e(long, java.lang.Object):void");
    }

    @Override // defpackage.plg
    @ResultIgnorabilityUnspecified
    public final synchronized void f(float f) {
        float f2 = 0.5f;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            try {
                ((ynz) a.a(uys.a).ai(6770)).y("fraction %f < 0", Float.valueOf(f));
                f = 0.5f;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f > 1.0f) {
            ((ynz) a.a(uys.a).ai(6769)).y("fraction %f > 1", Float.valueOf(f));
        } else {
            f2 = f;
        }
        int iB = b();
        int i = (int) (iB * f2);
        ((ynz) ((ynz) a.d()).ai(6768)).S("Trimming %s's current size %d to %g, or %d", this.f, Integer.valueOf(iB), Float.valueOf(f2), Integer.valueOf(i));
        g(i);
        aenq aenqVar = this.c;
        aenqVar.F(aenqVar.k);
        aemi aemiVar = this.d;
        aemiVar.z(aemiVar.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void g(int i) {
        if (i != 0) {
            while (!this.c.isEmpty() && this.e > i) {
                i(this.c.q());
            }
            return;
        }
        this.d = new aemi(null);
        if (!this.c.isEmpty()) {
            aeui aeuiVarD = this.c.l().d();
            while (aeuiVarD.hasNext()) {
                K next = aeuiVarD.next();
                ((aenm) next).getKey().longValue();
                h(((aenm) next).getValue());
                ((aenm) next).getKey().longValue();
                ((aenm) next).getValue();
            }
        }
        this.c = new aenq(null);
        this.e = 0;
    }

    @ResultIgnorabilityUnspecified
    public final synchronized void i(long j) {
        j(j);
    }

    protected void h(Object obj) {
    }
}
