package defpackage;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.Visibility;
import android.util.Log;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class aagb implements aagq {
    public static final String a = "aagb";
    public static final ThreadLocal b;
    public static final ThreadLocal c;
    public static final ThreadLocal d;
    public final aagi e;
    public final String f;
    public final aagk g;
    public final aahq h;
    public final aagr i;
    public final aahn j;
    public final aafq k;
    final aafv[] l;
    final aafv[] m;
    final ConcurrentLinkedQueue n;
    public boolean o;
    private final Executor p;

    static {
        double d2 = aahr.a;
        ExecutorService executorService = zrz.a;
        b = new zru(16);
        c = new zrw();
        d = new zrw();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public aagb(aagi aagiVar, aagr aagrVar, aahn aahnVar) {
        aafq aafqVar = new aafq();
        ExecutorService executorServiceC = zrz.c("sv-mesh", 4);
        aafs aafsVar = aafs.a;
        zkt.n(aagiVar, "pano");
        this.e = aagiVar;
        int i = 1;
        zkt.e(!aagiVar.i(), "NULL_TARGET");
        this.f = aagiVar.b;
        zkt.g(!aagiVar.i(), "NULL_TARGET");
        this.g = aagiVar.c;
        zkt.g(!aagiVar.i(), "NULL_TARGET");
        aahq aahqVar = new aahq();
        aahqVar.b(0, 0, 0, aagiVar.c);
        for (int i2 = 1; i2 < aagiVar.j.size(); i2++) {
            zro zroVar = (zro) aagiVar.j.get(i2);
            int iIntValue = ((Integer) zroVar.a).intValue();
            int iIntValue2 = ((Integer) zroVar.b).intValue();
            int i3 = i << i2;
            int iIntValue3 = iIntValue / aagiVar.h.intValue();
            int iMin = Math.min(iIntValue % aagiVar.h.intValue() != 0 ? iIntValue3 + 1 : iIntValue3, i3);
            int iIntValue4 = iIntValue2 / aagiVar.i.intValue();
            int iMin2 = Math.min(iIntValue2 % aagiVar.i.intValue() != 0 ? iIntValue4 + 1 : iIntValue4, i3);
            int i4 = 0;
            while (i4 < iMin) {
                int i5 = i4 + 1;
                int i6 = 0;
                while (i6 < iMin2) {
                    int i7 = i6 + 1;
                    aahqVar.b(i2, i4, i6, new aagk(aagiVar.b, i4, i6, i2, aagiVar.h.intValue() - Math.max(0, (aagiVar.h.intValue() * i5) - iIntValue), aagiVar.i.intValue() - Math.max(0, (aagiVar.i.intValue() * i7) - iIntValue2)));
                    iMin2 = iMin2;
                    i6 = i7;
                    i = i;
                    iMin = iMin;
                }
                i4 = i5;
            }
        }
        this.h = aahqVar;
        this.i = aagrVar;
        this.j = aahnVar;
        this.k = aafqVar;
        zkt.n(executorServiceC, "backgroundThreadPool");
        this.p = executorServiceC;
        this.l = new aafv[aagiVar.b() + 1];
        this.m = new aafv[aagiVar.b() + 1];
        this.n = new ConcurrentLinkedQueue();
        this.o = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void h(aafv[] aafvVarArr, String str) {
        for (int i = 0; i < aafvVarArr.length; i++) {
            aafv aafvVar = aafvVarArr[i];
            if (aafvVar != null) {
                try {
                    if (aafvVar.e != null) {
                        String str2 = aafv.a;
                        if (zrn.e(str2, 3)) {
                            Log.d(str2, String.format("deleteMeshes(%s)", Integer.valueOf(aafvVar.b)));
                        }
                        yfq yfqVar = aafvVar.c;
                        int size = yfqVar.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            aafu aafuVar = (aafu) aafvVar.e.get((aagk) yfqVar.get(i2));
                            if (aafuVar.h) {
                                aafs aafsVar = aafuVar.g;
                                aafs.e(aafuVar.i);
                                aafs.e(aafuVar.j);
                                aafs.e(aafuVar.k);
                                aafuVar.i = null;
                                aafuVar.j = null;
                                aafuVar.k = null;
                                aafuVar.h = false;
                            } else {
                                String str3 = aafu.a;
                                if (zrn.e(str3, 6)) {
                                    Log.e(str3, String.format("%s.glDeleteBuffers() called before glUploadBuffers()", aafuVar.b));
                                }
                            }
                        }
                        aafvVar.e = null;
                        aafvVar.f = null;
                    }
                } catch (Error | RuntimeException e) {
                    String str4 = a;
                    if (zrn.e(str4, 6)) {
                        Log.e(str4, String.format("destroy(%s,%s,%s) => %s", this.f, Integer.valueOf(i), str, e), e);
                    }
                }
                aafvVarArr[i] = null;
            }
        }
    }

    public final void a() {
        if (this.o) {
            String str = a;
            if (zrn.e(str, 6)) {
                Log.e(str, String.format("destroy(%s) called more than once", this.f));
                return;
            }
            return;
        }
        this.o = true;
        String str2 = a;
        if (zrn.e(str2, 4)) {
            Log.i(str2, String.format("destroy(%s)", this.f));
        }
        try {
            aafq aafqVar = this.k;
            if (aafqVar.e) {
                aafqVar.d.clear();
                aafqVar.c.clear();
                int[] iArr = aafqVar.b;
                GLES20.glDeleteTextures(16, iArr, 0);
                Arrays.fill(iArr, 0);
                aafqVar.e = false;
            } else {
                String str3 = aafq.a;
                if (zrn.e(str3, 6)) {
                    Log.e(str3, "releaseHandles() called without a preceding acquireHandles() call.");
                }
            }
        } catch (Error | RuntimeException e) {
            String str4 = a;
            if (zrn.e(str4, 6)) {
                Log.e(str4, String.format("destroy(%s,lru) => %s", this.f, e), e);
            }
        }
        h(this.l, "smooth");
        h(this.m, "depth");
        this.n.clear();
        this.h.a.clear();
    }

    final void b(int i, final boolean z) {
        String str = a;
        if (zrn.e(str, 3)) {
            Log.d(str, String.format("initializeZoomLevel(%s,%s,%s)", this.f, Integer.valueOf(i), Boolean.valueOf(z)));
        }
        aafv[] aafvVarArr = z ? this.m : this.l;
        if (aafvVarArr[i] != null) {
            return;
        }
        aahq aahqVar = this.h;
        String str2 = aafv.a;
        aclh.o(i >= 0, "illegal zoomLevel: %s", new Object[]{Integer.valueOf(i)});
        ArrayList arrayList = new ArrayList();
        int i2 = 2 << i;
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                aagk aagkVar = (aagk) aahqVar.a(i, i3, i4);
                if (aagkVar != null) {
                    arrayList.add(aagkVar);
                }
            }
        }
        final aafv aafvVar = new aafv(i, yfq.o(arrayList), aafr.a);
        aafvVarArr[i] = aafvVar;
        this.p.execute(new Runnable() { // from class: aaga
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r43v1 */
            /* JADX WARN: Type inference failed for: r43v2 */
            /* JADX WARN: Type inference failed for: r43v3 */
            /* JADX WARN: Type inference failed for: r5v10 */
            /* JADX WARN: Type inference failed for: r5v11, types: [boolean] */
            /* JADX WARN: Type inference failed for: r5v31 */
            /* JADX WARN: Type inference failed for: r6v14 */
            /* JADX WARN: Type inference failed for: r6v15, types: [boolean] */
            /* JADX WARN: Type inference failed for: r6v32 */
            @Override // java.lang.Runnable
            public final void run() {
                int i5;
                int i6;
                float fD;
                boolean z2;
                int i7;
                float fC;
                boolean z3;
                int i8;
                long jCurrentTimeMillis = System.currentTimeMillis();
                aagb aagbVar = this.a;
                aagi aagiVar = aagbVar.e;
                int i9 = 1;
                zkt.e(!aagiVar.i(), "NULL_TARGET");
                String str3 = aafv.a;
                boolean zE = zrn.e(str3, 3);
                boolean z4 = z;
                aafv aafvVar2 = aafvVar;
                int i10 = 0;
                if (zE) {
                    Log.d(str3, String.format("constructMeshesAndBoundingSpheres(%s,%s,%s)", aagiVar.b, Integer.valueOf(aafvVar2.b), Boolean.valueOf(z4)));
                }
                int i11 = aafvVar2.b;
                zkt.g(!aagiVar.i(), "NULL_TARGET");
                yfq yfqVar = aagiVar.j;
                aclh.o(i11 < yfqVar.size(), "Illegal zoom level [%s] >= [%s]", new Object[]{Integer.valueOf(i11), Integer.valueOf(yfqVar.size())});
                zro zroVar = (zro) yfqVar.get(i11);
                int i12 = true != z4 ? 1 : 2;
                yfq yfqVar2 = aafvVar2.c;
                HashMap map = new HashMap(yrm.E(yfqVar2.size()));
                float[] fArr = new float[yfqVar2.size() * 4];
                int i13 = 0;
                while (i10 < yfqVar2.size()) {
                    aagk aagkVar2 = (aagk) yfqVar2.get(i10);
                    float f = aagkVar2.e;
                    int i14 = i9;
                    int iCeil = ((int) Math.ceil((f / aagiVar.d()) * 32.0f * (f / ((Integer) zroVar.a).intValue()))) * i12;
                    float f2 = aagkVar2.f;
                    long j = jCurrentTimeMillis;
                    int iCeil2 = ((int) Math.ceil((f2 / aagiVar.c()) * 32.0f * (f2 / ((Integer) zroVar.b).intValue()))) * i12;
                    zkt.e(!aagiVar.i(), "NULL_TARGET");
                    zkt.n(aagkVar2, "coord");
                    int i15 = aagkVar2.d;
                    int iB = aagiVar.b();
                    zro zroVar2 = zroVar;
                    Object[] objArr = new Object[2];
                    objArr[i13] = aagkVar2;
                    objArr[i14] = aagiVar;
                    aclh.o(i15 <= iB ? i14 : i13, "Coord OOB: %s vs %s", objArr);
                    Object[] objArr2 = new Object[i14];
                    objArr2[i13] = Integer.valueOf(iCeil);
                    aclh.o(iCeil > 0 ? i14 : i13, "gridMeshQuadWidth:%s", objArr2);
                    Object[] objArr3 = new Object[1];
                    objArr3[i13] = Integer.valueOf(iCeil2);
                    aclh.o(iCeil2 > 0 ? true : i13, "gridMeshQuadHeight:%s", objArr3);
                    zkt.l(200.0f, "defaultRadiusM");
                    Integer numValueOf = Integer.valueOf(i15);
                    int i16 = aagkVar2.b;
                    Integer numValueOf2 = Integer.valueOf(i16);
                    int i17 = aagkVar2.c;
                    Integer numValueOf3 = Integer.valueOf(i17);
                    Object[] objArr4 = new Object[3];
                    objArr4[i13] = numValueOf;
                    objArr4[1] = numValueOf2;
                    objArr4[2] = numValueOf3;
                    aafu aafuVar = new aafu(String.format("Tile#Z%s@[X%s,Y%s]", objArr4), iCeil, iCeil2);
                    int iB2 = aagiVar.b() - i15;
                    zkt.g(!aagiVar.i(), "NULL_TARGET");
                    int iIntValue = aagiVar.g.intValue() >> iB2;
                    int iA = aagiVar.a() >> iB2;
                    int iD = aagiVar.d() * i16;
                    aagi aagiVar2 = aagiVar;
                    int iC = i17 * aagiVar.c();
                    int iD2 = (i16 + 1) * aagiVar2.d();
                    int iC2 = (i17 + 1) * aagiVar2.c();
                    int iD3 = aagiVar2.d();
                    int iC3 = aagiVar2.c();
                    if (iD2 > iIntValue) {
                        int i18 = iIntValue - iD;
                        i5 = i12;
                        fD = i18 / aagiVar2.d();
                        i6 = i18;
                        iD2 = iIntValue;
                    } else {
                        i5 = i12;
                        i6 = iD3;
                        fD = 1.0f;
                    }
                    if (iC2 > iA) {
                        int i19 = iA - iC;
                        z2 = z4;
                        fC = i19 / aagiVar2.c();
                        i7 = i19;
                        iC2 = iA;
                    } else {
                        z2 = z4;
                        i7 = iC3;
                        fC = 1.0f;
                    }
                    if (iD >= iD2 || iC >= iC2) {
                        z3 = i13;
                        i8 = i10;
                    } else {
                        i8 = i10;
                        z3 = true;
                    }
                    Object[] objArr5 = new Object[2];
                    objArr5[i13] = aagkVar2;
                    objArr5[1] = aagiVar2;
                    zkt.h(z3, "Illegal Tile %s for %s", objArr5);
                    aags aagsVarF = aagiVar2.f();
                    aagt aagtVarG = z2 ? aagiVar2.g() : null;
                    yfq yfqVar3 = yfqVar2;
                    float[] fArr2 = new float[4];
                    fArr2[i13] = 0.0f;
                    fArr2[1] = 0.0f;
                    fArr2[2] = 0.0f;
                    fArr2[3] = 1.0f;
                    int i20 = i13;
                    aagb aagbVar2 = aagbVar;
                    while (true) {
                        int i21 = aafuVar.c;
                        if (i20 <= i21) {
                            HashMap map2 = map;
                            aagk aagkVar3 = aagkVar2;
                            int i22 = i13;
                            while (true) {
                                int i23 = aafuVar.d;
                                if (i22 <= i23) {
                                    aafu aafuVar2 = aafuVar;
                                    float f3 = iD;
                                    int i24 = iD;
                                    float f4 = iIntValue;
                                    int i25 = iIntValue;
                                    float f5 = iA;
                                    int i26 = iA;
                                    float f6 = i20 / i21;
                                    float f7 = i22 / i23;
                                    float f8 = 90.0f - (((iC + (f7 * i7)) / f5) * 180.0f);
                                    float f9 = (((f3 + (i6 * f6)) / f4) * 360.0f) - 180.0f;
                                    aagn.c(f8, f9, fArr2);
                                    float fAbs = aagtVarG != null ? Math.abs(aagtVarG.c(aagsVarF, f8, f9 + aagsVarF.b)) : 200.0f;
                                    float f10 = fArr2[i13] * fAbs;
                                    fArr2[i13] = f10;
                                    float f11 = fArr2[1] * fAbs;
                                    fArr2[1] = f11;
                                    float f12 = fArr2[2] * fAbs;
                                    fArr2[2] = f12;
                                    int i27 = i22;
                                    aafuVar2.d(i20, i27, f10, f11, f12, f6 * fD, f7 * fC);
                                    i22 = i27 + 1;
                                    aafuVar = aafuVar2;
                                    iD = i24;
                                    iIntValue = i25;
                                    iA = i26;
                                }
                            }
                            i20++;
                            map = map2;
                            aagkVar2 = aagkVar3;
                            iA = iA;
                        }
                    }
                    aafu aafuVar3 = aafuVar;
                    HashMap map3 = map;
                    Visibility.computeBoundingSphere(aafuVar3.l, i13, aafuVar3.e * aafuVar3.f, fArr, i8 * 4);
                    map3.put(aagkVar2, aafuVar3);
                    i10 = i8 + 1;
                    map = map3;
                    yfqVar2 = yfqVar3;
                    zroVar = zroVar2;
                    jCurrentTimeMillis = j;
                    aagiVar = aagiVar2;
                    i12 = i5;
                    z4 = z2;
                    aagbVar = aagbVar2;
                    i13 = 0;
                    i9 = 1;
                }
                long j2 = jCurrentTimeMillis;
                aagb aagbVar3 = aagbVar;
                boolean z5 = z4;
                HashMap map4 = map;
                synchronized (aafvVar2) {
                    aafvVar2.g = map4;
                    aafvVar2.h = fArr;
                }
                String str4 = aafv.a;
                if (zrn.e(str4, 3)) {
                    Log.d(str4, String.format("constructMeshesAndBoundingSpheres(%s,?dm=%s) took %s ms", Integer.valueOf(aafvVar2.b), Boolean.valueOf(z5), Long.valueOf(System.currentTimeMillis() - j2)));
                }
                aagbVar3.n.add(aafvVar2);
                aagbVar3.j.b("PANOSPHERE_QUAD_TREE_NODE_MESH_CONSTRUCTED");
            }
        });
    }

    public final void c(aagj aagjVar, Bitmap bitmap) {
        int iIntValue;
        String str = a;
        if (zrn.e(str, 4)) {
            Log.i(str, String.format("onTileResponse(%s,%s)", aagjVar, bitmap));
        }
        zkt.n(aagjVar, "key");
        if (this.o) {
            if (zrn.e(str, 5)) {
                Log.w(str, String.format("onTileResponse(%s,%s) called after destroy()", aagjVar, bitmap));
                return;
            }
            return;
        }
        if (bitmap != null) {
            aafq aafqVar = this.k;
            aafqVar.a(this.g);
            try {
                zkt.n(aagjVar, "key");
                if (aafqVar.e) {
                    aahp aahpVar = aafqVar.d;
                    Integer num = (Integer) aahpVar.get(aagjVar);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        aahpVar.put(aagjVar, 0);
                        Stack stack = aafqVar.c;
                        zkt.g(!stack.isEmpty(), String.format("Failed to gc handles: %s", aafqVar));
                        iIntValue = ((Integer) stack.pop()).intValue();
                    }
                    aafs.j(iIntValue, bitmap);
                    Integer numValueOf = Integer.valueOf(iIntValue);
                    aahpVar.put(aagjVar, numValueOf);
                    String str2 = aafq.a;
                    if (zrn.e(str2, 3)) {
                        Log.d(str2, String.format("uploadBitmapToGL(%s) => (%s,%s)", aagjVar, numValueOf, bitmap));
                    }
                } else {
                    String str3 = aafq.a;
                    if (zrn.e(str3, 6)) {
                        Log.e(str3, String.format("uploadBitmapToGL(%s) called before acquireHandles()", aagjVar));
                    }
                }
            } catch (Error | RuntimeException e) {
                String str4 = a;
                if (zrn.e(str4, 6)) {
                    Log.e(str4, String.format("onTileResponse(%s,%s) => %s", aagjVar, bitmap, e), e);
                }
            }
            this.j.b("PANOSPHERE_QUAD_TREE_NODE_BITMAP_UPLOADED");
        }
    }

    final void d(int i, int i2, aagk aagkVar, boolean z) {
        aafu aafuVarA = (z ? this.m : this.l)[aagkVar.d].a(aagkVar);
        Integer numA = this.k.a(aagkVar);
        if (aafuVarA == null || numA == null) {
            aagkVar.a();
            return;
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, numA.intValue());
        GLES20.glUniform1i(i2, 0);
        aafuVarA.b(i);
        aafuVarA.c();
    }

    final void e(float[] fArr, int i, float f, boolean z, List list) throws IllegalStateException {
        ysi.V(i != 0, "glShaderProgramHandle");
        GLES20.glUseProgram(i);
        GLES20.glUniformMatrix4fv(GLES20.glGetUniformLocation(i, "uMVPMatrix"), 1, false, fArr, 0);
        GLES20.glUniform1f(GLES20.glGetUniformLocation(i, "alpha"), f);
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "u_Texture");
        GLES20.glDisable(2929);
        GLES20.glDepthMask(false);
        if (z) {
            try {
                d(i, iGlGetUniformLocation, this.g, false);
            } catch (Error | RuntimeException e) {
                String str = a;
                if (zrn.e(str, 6)) {
                    Log.e(str, String.format("Error rendering %s: %s", this.g, e), e);
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aagk aagkVar = (aagk) it.next();
            try {
                d(i, iGlGetUniformLocation, aagkVar, z);
            } catch (Error | RuntimeException e2) {
                String str2 = a;
                if (zrn.e(str2, 6)) {
                    Log.e(str2, String.format("Error rendering %s: %s", aagkVar, e2), e2);
                }
            }
        }
        GLES20.glBindBuffer(34962, 0);
        GLES20.glBindBuffer(34963, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aagb) {
            return a.C(this.f, ((aagb) obj).f);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void f() {
        String str = a;
        if (zrn.e(str, 2)) {
            Log.v(str, String.format("uploadPendingMeshesOnRenderingThread(%s)", this.n));
        }
        aafv aafvVar = (aafv) this.n.poll();
        while (aafvVar != null) {
            try {
                if (aafvVar.e == null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    synchronized (aafvVar) {
                        Map map = aafvVar.g;
                        if (map != null) {
                            aafvVar.e = map;
                            aafvVar.g = null;
                            aafvVar.f = aafvVar.h;
                            aafvVar.h = null;
                            yfq yfqVar = aafvVar.c;
                            int size = yfqVar.size();
                            for (int i = 0; i < size; i++) {
                                ((aafu) aafvVar.e.get((aagk) yfqVar.get(i))).a();
                            }
                            String str2 = aafv.a;
                            if (zrn.e(str2, 3)) {
                                Log.d(str2, String.format("maybeUploadMeshes(%s) took %s ms", Integer.valueOf(aafvVar.b), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
                            }
                        }
                    }
                }
            } catch (Error | RuntimeException e) {
                String str3 = a;
                if (zrn.e(str3, 6)) {
                    Log.e(str3, String.format("uploadPendingMeshesOnRenderingThread(%s,%s) => %s", this.f, aafvVar, e), e);
                }
            }
            aafvVar = (aafv) this.n.poll();
        }
    }

    public final boolean g() {
        if (!this.o) {
            aafq aafqVar = this.k;
            aagk aagkVar = this.g;
            if (aafqVar.a(aagkVar) != null && this.l[0].a(aagkVar) != null && this.m[0].a(aagkVar) != null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f});
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("panoId", this.f);
        zsaVarA.e("originalImageMaxTileZoom", this.e.b());
        return zsaVarA.toString();
    }
}
