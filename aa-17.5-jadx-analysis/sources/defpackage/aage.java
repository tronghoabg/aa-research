package defpackage;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.util.Log;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class aage implements aagc {
    public static final String a = "aage";
    private static final ThreadLocal j;
    private static final int[][] k;
    private static final float[][] l;
    private static final float[][] m;
    private static final aagg n;
    private static final yfq o;
    public final aahn b;
    public final zrt c;
    public boolean d;
    boolean e;
    public aagi f;
    final Map g;
    public boolean h;
    public aagi i;
    private final double p;
    private final CharSequence[] q;
    private final aagg r;
    private final aafs s;
    private int t;
    private int u;
    private aafu v;
    private aagn w;
    private final List x;

    static {
        ExecutorService executorService = zrz.a;
        j = new zrx();
        k = new int[][]{new int[]{0, 0}, new int[]{1, 0}, new int[]{0, 1}, new int[]{1, 1}};
        l = new float[][]{new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED}, new float[]{1.0f, BitmapDescriptorFactory.HUE_RED}, new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f}, new float[]{1.0f, 1.0f}};
        m = new float[][]{new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f}, new float[]{2.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f}, new float[]{BitmapDescriptorFactory.HUE_RED, -1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f}, new float[]{2.0f, -1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f}};
        n = new aagg(Bitmap.Config.ARGB_8888);
        int i = yfq.d;
        o = yls.a;
    }

    public aage(double d, aahn aahnVar, CharSequence[] charSequenceArr) {
        zrt zrtVar = zrt.a;
        aagg aaggVar = n;
        aafs aafsVar = aafs.a;
        zkt.k(d, "displayDensityRatio");
        this.p = d;
        zkt.n(aahnVar, "frameRequestor");
        this.b = aahnVar;
        zkt.n(charSequenceArr, "compassDirectionSuffixes");
        this.q = charSequenceArr;
        int length = charSequenceArr.length;
        zkt.e(length == 8, String.format("compassDirectionSuffixes#%s != 8", Integer.valueOf(length)));
        zkt.n(zrtVar, "uiThreadChecker");
        this.c = zrtVar;
        zkt.n(aaggVar, "textRenderer");
        this.r = aaggVar;
        this.s = aafsVar;
        synchronized (this) {
            this.d = false;
            this.e = false;
            this.t = 0;
            this.u = 0;
            this.v = null;
            aagi aagiVar = aagi.a;
            this.f = aagiVar;
            this.g = new HashMap();
            this.h = true;
            this.i = aagiVar;
            this.w = null;
            this.x = new ArrayList(11);
        }
    }

    public final void a() {
        this.c.b();
        Map map = this.g;
        if (map.isEmpty()) {
            return;
        }
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((aagd) it.next()).a;
            i++;
        }
        Arrays.sort(iArr);
        GLES20.glDeleteTextures(size, iArr, 0);
        map.clear();
    }

    public final void b(String str) {
        aafu aafuVar;
        if (this.d) {
            String str2 = a;
            if (zrn.e(str2, 6)) {
                Log.e(str2, String.format("%s called after onDestroy()", str));
                return;
            }
            return;
        }
        String str3 = a;
        if (zrn.e(str3, 4)) {
            Log.i(str3, String.format("%s::performGLPreflightTasks() IN PROGRESS", str));
        }
        this.e = false;
        try {
            this.g.clear();
            this.f = aagi.a;
            int[] iArr = (int[]) aafs.b.get();
            iArr[0] = 0;
            GLES20.glGetIntegerv(3379, iArr, 0);
            int i = iArr[0];
            this.t = i;
            if (i == 0) {
                throw new IllegalStateException("Failed to load maximum texture size.");
            }
            int iE = aafu.e(str3);
            this.u = iE;
            if (iE == 0) {
                throw new IllegalStateException("Failed to register GridMesh shader program!");
            }
            this.v = new aafu("RoadLabels", 1, 1);
            int i2 = 0;
            while (true) {
                int[][] iArr2 = k;
                int length = iArr2.length;
                aafuVar = this.v;
                if (i2 >= 4) {
                    break;
                }
                int[] iArr3 = iArr2[i2];
                int i3 = iArr3[0];
                int i4 = iArr3[1];
                float[] fArr = m[i2];
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = fArr[2];
                float[] fArr2 = l[i2];
                aafuVar.d(i3, i4, f, f2, f3, fArr2[0], fArr2[1]);
                i2++;
            }
            aafuVar.a();
            if (zrn.e(str3, 4)) {
                Log.i(str3, String.format("%s::performGLPreflightTasks() SUCCESS!", str));
            }
            this.e = true;
        } catch (RuntimeException e) {
            String str4 = a;
            if (zrn.e(str4, 6)) {
                Log.e(str4, String.format("%s::performGLPreflightTasks() FAILED to set up road label GL", str), e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03ee A[PHI: r7 r23 r24 r25 r27 r30 r31
  0x03ee: PHI (r7v6 int) = (r7v4 int), (r7v27 int) binds: [B:113:0x03d9, B:90:0x039b] A[DONT_GENERATE, DONT_INLINE]
  0x03ee: PHI (r23v5 boolean) = (r23v3 boolean), (r23v11 boolean) binds: [B:113:0x03d9, B:90:0x039b] A[DONT_GENERATE, DONT_INLINE]
  0x03ee: PHI (r24v6 aagi) = (r24v4 aagi), (r24v10 aagi) binds: [B:113:0x03d9, B:90:0x039b] A[DONT_GENERATE, DONT_INLINE]
  0x03ee: PHI (r25v6 yfq) = (r25v4 yfq), (r25v10 yfq) binds: [B:113:0x03d9, B:90:0x039b] A[DONT_GENERATE, DONT_INLINE]
  0x03ee: PHI (r27v4 java.lang.String) = (r27v2 java.lang.String), (r27v8 java.lang.String) binds: [B:113:0x03d9, B:90:0x039b] A[DONT_GENERATE, DONT_INLINE]
  0x03ee: PHI (r30v3 int) = (r30v1 int), (r30v9 int) binds: [B:113:0x03d9, B:90:0x039b] A[DONT_GENERATE, DONT_INLINE]
  0x03ee: PHI (r31v3 int) = (r31v1 int), (r31v9 int) binds: [B:113:0x03d9, B:90:0x039b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.aagn r39) {
        /*
            Method dump skipped, instructions count: 1143
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aage.c(aagn):void");
    }

    public final synchronized boolean d() {
        this.c.a();
        return this.h;
    }
}
