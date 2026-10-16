package kc;

import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.util.TypedValue;
import ba.C1521a;
import java.util.HashMap;

/* renamed from: kc.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3289a {

    /* renamed from: f, reason: collision with root package name */
    public static final Matrix f39451f = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.k f39452a;

    /* renamed from: b, reason: collision with root package name */
    public final C1521a f39453b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f39454c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f39455d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public int f39456e;

    public C3289a(io.flutter.embedding.engine.renderer.k kVar, boolean z2) {
        this.f39452a = kVar;
        if (C1521a.f19411d == null) {
            C1521a.f19411d = new C1521a(13);
        }
        this.f39453b = C1521a.f19411d;
        this.f39454c = z2;
    }

    public static int b(int i5) {
        if (i5 == 0) {
            return 4;
        }
        if (i5 != 1) {
            if (i5 == 5) {
                return 4;
            }
            if (i5 != 6) {
                if (i5 == 2) {
                    return 5;
                }
                if (i5 != 7) {
                    if (i5 == 3) {
                        return 0;
                    }
                    if (i5 != 8) {
                        return -1;
                    }
                }
                return 3;
            }
        }
        return 6;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v7 int, still in use, count: 2, list:
          (r12v7 int) from 0x009b: IF  (r12v7 int) == (-1 int)  -> B:4:0x000f A[HIDDEN] (LINE:156)
          (r12v7 int) from 0x00a1: PHI (r12v2 int) = (r12v1 int), (r12v7 int) binds: [B:43:0x009f, B:41:0x009b] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:53)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        */
    public final void a(android.view.MotionEvent r28, int r29, int r30, int r31, android.graphics.Matrix r32, java.nio.ByteBuffer r33, android.content.Context r34) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kc.C3289a.a(android.view.MotionEvent, int, int, int, android.graphics.Matrix, java.nio.ByteBuffer, android.content.Context):void");
    }

    public final int c(Context context) {
        if (this.f39456e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.f39456e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f39456e;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0035 A[PHI: r7
  0x0035: PHI (r7v6 char) = (r7v5 char), (r7v7 char) binds: [B:17:0x002c, B:21:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.MotionEvent r13, android.graphics.Matrix r14) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kc.C3289a.d(android.view.MotionEvent, android.graphics.Matrix):void");
    }
}
