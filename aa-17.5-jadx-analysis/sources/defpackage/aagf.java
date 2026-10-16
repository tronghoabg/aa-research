package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.opengl.Visibility;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class aagf implements aagq {
    public static final String a = "aagf";
    public static final ThreadLocal b;
    private static final ThreadLocal f;
    private static final ThreadLocal g;
    private static final ThreadLocal h;
    public final aafs c;
    public int d;
    public final Map e;
    private final aagr i;
    private final aahn j;

    static {
        double d = aahr.a;
        ExecutorService executorService = zrz.a;
        f = new zru(4);
        g = new zru(16);
        h = new zru(16);
        b = new zrw();
    }

    public aagf(aagr aagrVar, aahn aahnVar, double d) {
        aafs aafsVar = aafs.a;
        this.i = aagrVar;
        this.j = aahnVar;
        zkt.k(d, "displayDensityRatio cannot be NaN");
        aclh.o(d > 0.0d, "displayDensityRatio[%s] <= 0", new Object[]{Double.valueOf(d)});
        this.c = aafsVar;
        this.d = 0;
        this.e = new HashMap();
    }

    public final aagb a(aagi aagiVar) {
        if (aagiVar.i()) {
            return null;
        }
        Map map = this.e;
        String str = aagiVar.b;
        aagb aagbVar = (aagb) map.get(str);
        if (aagbVar != null) {
            return aagbVar;
        }
        aagb aagbVar2 = new aagb(aagiVar, this.i, this.j);
        aafq aafqVar = aagbVar2.k;
        if (aafqVar.e) {
            String str2 = aafq.a;
            if (zrn.e(str2, 6)) {
                Log.e(str2, "acquireHandles() called repeatedly without releaseHandles() in between.");
            }
        } else {
            int[] iArr = aafqVar.b;
            Arrays.fill(iArr, 0);
            GLES20.glGenTextures(16, iArr, 0);
            for (int i = 0; i < 16; i++) {
                int i2 = iArr[i];
                if (i2 != 0) {
                    aafqVar.c.push(Integer.valueOf(i2));
                }
            }
            aafqVar.c.size();
            zkt.g(!r5.isEmpty(), "Failed to allocate GL texture pool.");
            aafqVar.e = true;
            String str3 = aafq.a;
            if (zrn.e(str3, 3)) {
                Log.d(str3, String.format("GL texture handles allocated: %s", Arrays.toString(iArr)));
            }
        }
        aagbVar2.b(0, false);
        aagbVar2.b(0, true);
        aagbVar2.i.a(aagbVar2.g);
        map.put(str, aagbVar2);
        return aagbVar2;
    }

    public final void b() {
        String str = a;
        if (zrn.e(str, 4)) {
            Log.i(str, "delete()");
        }
        aafs.f(String.format("%s.delete()::start", str));
        Map map = this.e;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((aagb) it.next()).a();
        }
        map.clear();
        aafs.f(String.format("%s.delete()::end", str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(aagb aagbVar, double d, double d2, float[] fArr, aagn aagnVar, boolean z) throws IllegalStateException {
        int length;
        float[] fArrG;
        char c;
        boolean z2;
        int i;
        aafv[] aafvVarArr;
        int i2;
        aafv[] aafvVarArr2;
        if (aagbVar == null) {
            return true;
        }
        if (fArr == null) {
            fArrG = aagnVar.g();
        } else {
            float[] fArr2 = (float[]) f.get();
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            int i3 = 0;
            while (true) {
                length = fArr2.length;
                if (i3 >= length) {
                    break;
                }
                fArr2[i3] = fArr2[i3] * ((float) d2);
                i3++;
            }
            float[] fArr3 = (float[]) g.get();
            zkt.n(fArr2, "eyePos");
            aclh.o(length >= 3, "illegal length %s < %s", new Object[]{Integer.valueOf(length), 3});
            zkt.n(fArr3, "outputMatrix");
            int length2 = fArr3.length;
            aclh.o(length2 == 16, "illegal length %s != %s", new Object[]{Integer.valueOf(length2), 16});
            float[] fArr4 = (float[]) aagn.c.get();
            aagn.c(aahr.d(aagnVar.e, -89.9f, 89.9f), aagnVar.f, fArr4);
            float f2 = fArr4[0] + fArr2[0];
            fArr4[0] = f2;
            float f3 = fArr4[1] + fArr2[1];
            fArr4[1] = f3;
            float f4 = fArr4[2] + fArr2[2];
            fArr4[2] = f4;
            float f5 = fArr2[0];
            float f6 = fArr2[1];
            float f7 = fArr2[2];
            float[] fArr5 = aagn.d;
            Matrix.setLookAtM(fArr3, 0, f5, f6, f7, f2, f3, f4, fArr5[0], fArr5[1], fArr5[2]);
            float[] fArr6 = (float[]) h.get();
            Matrix.multiplyMM(fArr6, 0, aagnVar.h(), 0, fArr3, 0);
            fArrG = fArr6;
        }
        int i4 = this.d;
        float f8 = (float) d;
        boolean z3 = fArr != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zkt.n(aagnVar, "rendererRaycaster");
        zkt.n(fArrG, "customLookAtAndProjMatrix");
        ysi.T(i4 != 0, "glShaderProgramHandle");
        double d3 = f8;
        ysi.T(d3 >= 0.0d && d3 <= 1.0d, String.format("Invalid opacity %s", Float.valueOf(f8)));
        if (aagbVar.o) {
            String str = aagb.a;
            if (zrn.e(str, 5)) {
                Log.w(str, String.format("onDrawFrame(%s) called after destroy()", aagbVar.f));
            }
        } else {
            String str2 = aagb.a;
            if (zrn.e(str2, 2)) {
                c = 2;
                Log.v(str2, String.format("onDrawFrame(%s)", aagbVar.f));
            } else {
                c = 2;
            }
            aafs.f(String.format("%s.onDrawFrame()::START", str2));
            aagi aagiVar = aagbVar.e;
            float[] fArr7 = aagiVar.f().g;
            float[] fArr8 = (float[]) aagb.b.get();
            Matrix.multiplyMM(fArr8, 0, fArrG, 0, fArr7, 0);
            List<aagk> list = (List) aagb.c.get();
            List list2 = (List) aagb.d.get();
            list.clear();
            list2.clear();
            float f9 = aagnVar.k;
            float f10 = aagnVar.g;
            float fExp = (float) Math.exp((-f10) * aahr.a);
            float fA = aagiVar.a();
            int iMin = Math.min(aagiVar.b(), Math.max(0, (int) aahr.d((aagiVar.b() - 1) - ((int) Math.floor(aahr.f(((fExp * 0.25f) * fA) / aagnVar.i) + (f9 > 1.0f ? 1.0f : 2.0f))), 1.0f, f10 + 3.0f)));
            aagbVar.f();
            aafv[] aafvVarArr3 = z3 ? aagbVar.m : aagbVar.l;
            if (aafvVarArr3[iMin] == null && z) {
                aagbVar.b(iMin, false);
                aagbVar.b(iMin, true);
            }
            int i5 = iMin;
            while (true) {
                if (i5 < 0) {
                    z2 = z3;
                    i = iMin;
                    list.add(aagbVar.g);
                    break;
                }
                aafv aafvVar = aafvVarArr3[i5];
                if (aafvVar != null && aafvVar.b()) {
                    zkt.n(fArr8, "mvpMatrix");
                    zkt.n(list, "output");
                    yfq yfqVar = aafvVar.c;
                    if (yfqVar.size() == 1) {
                        list.add((aagk) yfqVar.get(0));
                        z2 = z3;
                        i = iMin;
                    } else {
                        boolean zB = aafvVar.b();
                        z2 = z3;
                        int i6 = aafvVar.b;
                        zkt.h(zB, "getVisibleTiles(%s)", Integer.valueOf(i6));
                        int[] iArr = aafvVar.d;
                        Arrays.fill(iArr, -1);
                        float[] fArr9 = aafvVar.f;
                        int size = yfqVar.size();
                        int length3 = iArr.length;
                        int iFrustumCullSpheres = Visibility.frustumCullSpheres(fArr8, 0, fArr9, 0, size, iArr, 0, length3);
                        i = iMin;
                        if (iFrustumCullSpheres != 0) {
                            int iMin2 = Math.min(Math.max(0, iFrustumCullSpheres), length3);
                            int i7 = 0;
                            while (i7 < iMin2) {
                                int i8 = iArr[i7];
                                int i9 = iMin2;
                                if (i8 < 0 || i8 >= yfqVar.size()) {
                                    i2 = i7;
                                    String str3 = aafv.a;
                                    if (zrn.e(str3, 6)) {
                                        Integer numValueOf = Integer.valueOf(i6);
                                        String string = Arrays.toString(fArr8);
                                        Integer numValueOf2 = Integer.valueOf(i9);
                                        String string2 = Arrays.toString(iArr);
                                        aafvVarArr2 = aafvVarArr3;
                                        Object[] objArr = new Object[4];
                                        objArr[0] = numValueOf;
                                        objArr[1] = string;
                                        objArr[c] = numValueOf2;
                                        objArr[3] = string2;
                                        Log.e(str3, String.format("frustumCullSpheres() returned an illegal result! z=%s + mvp=%s => #%s + %s", objArr));
                                    }
                                    i7 = i2 + 1;
                                    iMin2 = i9;
                                    aafvVarArr3 = aafvVarArr2;
                                } else {
                                    aagk aagkVar = (aagk) yfqVar.get(i8);
                                    aafu aafuVar = (aafu) aafvVar.e.get(aagkVar);
                                    i2 = i7;
                                    float[] fArr10 = aafuVar.l;
                                    char[] cArr = aafuVar.m;
                                    if (Visibility.visibilityTest(fArr8, 0, fArr10, 0, cArr, 0, cArr.length) > 0) {
                                        list.add(aagkVar);
                                    }
                                }
                                aafvVarArr2 = aafvVarArr3;
                                i7 = i2 + 1;
                                iMin2 = i9;
                                aafvVarArr3 = aafvVarArr2;
                            }
                        }
                    }
                    aafvVarArr = aafvVarArr3;
                    if (!list.isEmpty()) {
                        if (list.size() < 15) {
                            break;
                        }
                        list.clear();
                    } else {
                        continue;
                    }
                } else {
                    z2 = z3;
                    i = iMin;
                    aafvVarArr = aafvVarArr3;
                }
                i5--;
                z3 = z2;
                aafvVarArr3 = aafvVarArr;
                iMin = i;
            }
            for (aagk aagkVar2 : list) {
                aafq aafqVar = aagbVar.k;
                boolean z4 = aafqVar.a(aagkVar2) != null;
                if (!z4 && z) {
                    aagbVar.i.a(aagkVar2);
                }
                while (true) {
                    if (z4) {
                        list2.add(aagkVar2);
                        break;
                    }
                    if (!aagkVar2.a()) {
                        aagkVar2 = (aagk) aagbVar.h.a(aagkVar2.d - 1, aagkVar2.b / 2, aagkVar2.c / 2);
                        if (aagkVar2 == null) {
                            aagkVar2 = aagbVar.g;
                        }
                        z4 = aafqVar.a(aagkVar2) != null;
                    }
                }
            }
            Collections.sort(list2);
            aagbVar.e(fArr8, i4, f8, z2, list2);
            aafs.f(String.format("%s.onDrawFrame()::END", str2));
            if (zrn.e(str2, 3)) {
                String str4 = aagbVar.f;
                Integer numValueOf3 = Integer.valueOf(list.size());
                Integer numValueOf4 = Integer.valueOf(list2.size());
                Integer numValueOf5 = Integer.valueOf(i);
                Integer numValueOf6 = Integer.valueOf(Math.round(f8 * 100.0f));
                Long lValueOf = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                Object[] objArr2 = new Object[6];
                objArr2[0] = str4;
                objArr2[1] = numValueOf3;
                objArr2[c] = numValueOf4;
                objArr2[3] = numValueOf5;
                objArr2[4] = numValueOf6;
                objArr2[5] = lValueOf;
                Log.d(str2, String.format("onDrawFrame(%s) => rendering %s^%s Tiles @ z#%s @ %s%% opacity took %s ms ", objArr2));
            }
        }
        return aagbVar.g();
    }
}
