package u0;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import d0.AbstractC2382a;
import d0.C2383b;
import ef.InterfaceC2521e;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3906k;
import x0.AbstractC4436f;
import x0.AbstractC4444n;
import x0.C4438h;
import x0.C4440j;
import x0.C4441k;
import x0.InterfaceC4439i;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final Class[] f46167a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(C4441k c4441k) {
        return Fe.e.F(c4441k.f(), AbstractC4444n.f47624i) == null;
    }

    public static final void b(float[] fArr, float[] fArr2) {
        float fE = e(0, 0, fArr2, fArr);
        float fE2 = e(0, 1, fArr2, fArr);
        float fE3 = e(0, 2, fArr2, fArr);
        float fE4 = e(0, 3, fArr2, fArr);
        float fE5 = e(1, 0, fArr2, fArr);
        float fE6 = e(1, 1, fArr2, fArr);
        float fE7 = e(1, 2, fArr2, fArr);
        float fE8 = e(1, 3, fArr2, fArr);
        float fE9 = e(2, 0, fArr2, fArr);
        float fE10 = e(2, 1, fArr2, fArr);
        float fE11 = e(2, 2, fArr2, fArr);
        float fE12 = e(2, 3, fArr2, fArr);
        float fE13 = e(3, 0, fArr2, fArr);
        float fE14 = e(3, 1, fArr2, fArr);
        float fE15 = e(3, 2, fArr2, fArr);
        float fE16 = e(3, 3, fArr2, fArr);
        fArr[0] = fE;
        fArr[1] = fE2;
        fArr[2] = fE3;
        fArr[3] = fE4;
        fArr[4] = fE5;
        fArr[5] = fE6;
        fArr[6] = fE7;
        fArr[7] = fE8;
        fArr[8] = fE9;
        fArr[9] = fE10;
        fArr[10] = fE11;
        fArr[11] = fE12;
        fArr[12] = fE13;
        fArr[13] = fE14;
        fArr[14] = fE15;
        fArr[15] = fE16;
    }

    public static final boolean c(Object obj) {
        if (obj instanceof N.Y) {
            N.Y y10 = (N.Y) obj;
            N.P p10 = N.P.f7727c;
            N.A0 a02 = y10.f7734b;
            if (a02 == p10 || a02 == N.P.f7730f || a02 == N.P.f7728d) {
                Object value = y10.getValue();
                if (value == null) {
                    return true;
                }
                return c(value);
            }
        } else if (!(obj instanceof InterfaceC2521e) || !(obj instanceof Serializable)) {
            Class[] clsArr = f46167a;
            for (int i5 = 0; i5 < 7; i5++) {
                if (clsArr[i5].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final int d(float f10) {
        return ((int) (f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Math.ceil(f10) : Math.floor(f10))) * (-1);
    }

    public static final float e(int i5, int i10, float[] fArr, float[] fArr2) {
        int i11 = i5 * 4;
        return (fArr[i11 + 3] * fArr2[12 + i10]) + (fArr[i11 + 2] * fArr2[8 + i10]) + (fArr[i11 + 1] * fArr2[4 + i10]) + (fArr[i11] * fArr2[i10]);
    }

    public static final C4185l0 f(ArrayList arrayList, int i5) {
        AbstractC3340k.e(arrayList, "<this>");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((C4185l0) arrayList.get(i10)).f46253a == i5) {
                return (C4185l0) arrayList.get(i10);
            }
        }
        return null;
    }

    public static final void g(Region region, C4441k c4441k, LinkedHashMap linkedHashMap, C4441k c4441k2) {
        t0.t tVar;
        C4438h c4438hU;
        t0.t tVar2 = c4441k2.f47605g;
        boolean z2 = (tVar2.f45528s && tVar2.r()) ? false : true;
        boolean zIsEmpty = region.isEmpty();
        int i5 = c4441k.f47604f;
        int i10 = c4441k2.f47604f;
        if (!zIsEmpty || i10 == i5) {
            if (!z2 || c4441k2.f47601c) {
                boolean z10 = c4441k2.f47603e.f47594b;
                C4438h c4438h = c4441k2.f47599a;
                if (z10 && (c4438hU = S3.f.u(c4441k2.f47605g)) != null) {
                    c4438h = c4438hU;
                }
                boolean z11 = c4438h.f15787a;
                d0.d dVarQ = d0.d.f33936e;
                if (z11) {
                    Object objF = Fe.e.F(((C4440j) ((InterfaceC4439i) ((Z.j) c4438h.f15789c))).f47598b, AbstractC4436f.f47580b);
                    t0.y yVar = (t0.y) c4438h.f15788b;
                    if (objF == null) {
                        dVarQ = Fe.g.q(yVar);
                    } else if (yVar.S()) {
                        InterfaceC3906k interfaceC3906kZ = Fe.g.z(yVar);
                        C2383b c2383b = yVar.f45573r;
                        if (c2383b == null) {
                            c2383b = new C2383b();
                            c2383b.f33927a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            c2383b.f33928b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            c2383b.f33929c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            c2383b.f33930d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            yVar.f45573r = c2383b;
                        }
                        long jA = yVar.A(yVar.K());
                        c2383b.f33927a = -d0.f.d(jA);
                        c2383b.f33928b = -d0.f.b(jA);
                        c2383b.f33929c = d0.f.d(jA) + yVar.h();
                        c2383b.f33930d = d0.f.b(jA) + ((int) (yVar.f44309c & 4294967295L));
                        while (true) {
                            if (yVar == interfaceC3906kZ) {
                                dVarQ = new d0.d(c2383b.f33927a, c2383b.f33928b, c2383b.f33929c, c2383b.f33930d);
                                break;
                            }
                            yVar.a0(c2383b, false, true);
                            if (c2383b.b()) {
                                break;
                            }
                            yVar = yVar.f45562f;
                            AbstractC3340k.b(yVar);
                        }
                    }
                }
                Rect rectR = e0.z.r(dVarQ);
                Region region2 = new Region();
                region2.set(rectR);
                if (i10 == i5) {
                    i10 = -1;
                }
                if (region2.op(region, region2, Region.Op.INTERSECT)) {
                    Integer numValueOf = Integer.valueOf(i10);
                    Rect bounds = region2.getBounds();
                    AbstractC3340k.d(bounds, "region.bounds");
                    linkedHashMap.put(numValueOf, new C4187m0(c4441k2, bounds));
                    List listE = c4441k2.e(false);
                    for (int size = listE.size() - 1; -1 < size; size--) {
                        g(region, c4441k, linkedHashMap, (C4441k) listE.get(size));
                    }
                    region.op(rectR, region, Region.Op.REVERSE_DIFFERENCE);
                    return;
                }
                if (c4441k2.f47601c) {
                    C4441k c4441kG = c4441k2.g();
                    linkedHashMap.put(Integer.valueOf(i10), new C4187m0(c4441k2, e0.z.r((c4441kG == null || (tVar = c4441kG.f47605g) == null || !tVar.f45528s) ? new d0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10.0f, 10.0f) : c4441kG.d())));
                } else if (i10 == -1) {
                    Integer numValueOf2 = Integer.valueOf(i10);
                    Rect bounds2 = region2.getBounds();
                    AbstractC3340k.d(bounds2, "region.bounds");
                    linkedHashMap.put(numValueOf2, new C4187m0(c4441k2, bounds2));
                }
            }
        }
    }

    public static final boolean h(float[] invertTo, float[] other) {
        AbstractC3340k.e(invertTo, "$this$invertTo");
        AbstractC3340k.e(other, "other");
        float f10 = invertTo[0];
        float f11 = invertTo[1];
        float f12 = invertTo[2];
        float f13 = invertTo[3];
        float f14 = invertTo[4];
        float f15 = invertTo[5];
        float f16 = invertTo[6];
        float f17 = invertTo[7];
        float f18 = invertTo[8];
        float f19 = invertTo[9];
        float f20 = invertTo[10];
        float f21 = invertTo[11];
        float f22 = invertTo[12];
        float f23 = invertTo[13];
        float f24 = invertTo[14];
        float f25 = invertTo[15];
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f10 * f17) - (f13 * f14);
        float f29 = (f11 * f16) - (f12 * f15);
        float f30 = (f11 * f17) - (f13 * f15);
        float f31 = (f12 * f17) - (f13 * f16);
        float f32 = (f18 * f23) - (f19 * f22);
        float f33 = (f18 * f24) - (f20 * f22);
        float f34 = (f18 * f25) - (f21 * f22);
        float f35 = (f19 * f24) - (f20 * f23);
        float f36 = (f19 * f25) - (f21 * f23);
        float f37 = (f20 * f25) - (f21 * f24);
        float f38 = (f31 * f32) + (((f29 * f34) + ((f28 * f35) + ((f26 * f37) - (f27 * f36)))) - (f30 * f33));
        if (f38 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return false;
        }
        float f39 = 1.0f / f38;
        other[0] = ((f17 * f35) + ((f15 * f37) - (f16 * f36))) * f39;
        other[1] = (((f12 * f36) + ((-f11) * f37)) - (f13 * f35)) * f39;
        other[2] = ((f25 * f29) + ((f23 * f31) - (f24 * f30))) * f39;
        other[3] = (((f20 * f30) + ((-f19) * f31)) - (f21 * f29)) * f39;
        float f40 = -f14;
        other[4] = (((f16 * f34) + (f40 * f37)) - (f17 * f33)) * f39;
        other[5] = ((f13 * f33) + ((f37 * f10) - (f12 * f34))) * f39;
        float f41 = -f22;
        other[6] = (((f24 * f28) + (f41 * f31)) - (f25 * f27)) * f39;
        other[7] = ((f21 * f27) + ((f31 * f18) - (f20 * f28))) * f39;
        other[8] = ((f17 * f32) + ((f14 * f36) - (f15 * f34))) * f39;
        other[9] = (((f34 * f11) + ((-f10) * f36)) - (f13 * f32)) * f39;
        other[10] = ((f25 * f26) + ((f22 * f30) - (f23 * f28))) * f39;
        other[11] = (((f28 * f19) + ((-f18) * f30)) - (f21 * f26)) * f39;
        other[12] = (((f15 * f33) + (f40 * f35)) - (f16 * f32)) * f39;
        other[13] = ((f12 * f32) + ((f10 * f35) - (f11 * f33))) * f39;
        other[14] = (((f23 * f27) + (f41 * f29)) - (f24 * f26)) * f39;
        other[15] = ((f20 * f26) + ((f18 * f29) - (f19 * f27))) * f39;
        return true;
    }

    public static final boolean i(float f10, float f11, long j8, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fB = AbstractC2382a.b(j8);
        float fC = AbstractC2382a.c(j8);
        return ((f15 * f15) / (fC * fC)) + ((f14 * f14) / (fB * fB)) <= 1.0f;
    }

    public static final String j(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static void k(View view) {
        try {
            if (!s0.f46362p) {
                s0.f46362p = true;
                if (Build.VERSION.SDK_INT < 28) {
                    s0.f46360n = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                    s0.f46361o = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    s0.f46360n = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    s0.f46361o = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = s0.f46360n;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = s0.f46361o;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = s0.f46361o;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = s0.f46360n;
            if (method2 != null) {
                method2.invoke(view, new Object[0]);
            }
        } catch (Throwable unused) {
            s0.f46363q = true;
        }
    }
}
