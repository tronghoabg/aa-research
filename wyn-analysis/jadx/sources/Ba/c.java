package Ba;

import A.AbstractC0213f;
import A3.h;
import A7.AbstractC0279p0;
import A7.C0237b0;
import B.F;
import Bf.k;
import Ea.f;
import I5.i;
import K.AbstractC0682g;
import K.AbstractC0684i;
import K.C0680e;
import N.C0718d;
import N.C0740o;
import O.B;
import Pf.g;
import ac.C1346a;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import c0.C1542g;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzun;
import com.moloco.sdk.internal.ortb.model.D;
import com.moloco.sdk.internal.publisher.H;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import e0.C2465q;
import e0.z;
import ff.AbstractC2641B;
import h0.AbstractC2765c;
import j.AbstractC3062C;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3340k;
import md.J;
import p7.AbstractC3772b;
import re.C3977a;
import tf.l;
import yc.q;
import yc.r;

/* loaded from: classes4.dex */
public abstract class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public static Field f1653a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f1654b = false;

    /* renamed from: c, reason: collision with root package name */
    public static Class f1655c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f1656d = false;

    /* renamed from: e, reason: collision with root package name */
    public static Field f1657e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f1658f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Field f1659g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f1660h = false;

    /* renamed from: i, reason: collision with root package name */
    public static int f1661i = 2;

    public static float A(int i5, String[] strArr) throws NumberFormatException {
        float f10 = Float.parseFloat(strArr[i5]);
        if (f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f10 <= 1.0f) {
            return f10;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f10);
    }

    public static boolean B(int i5) {
        return i5 >= 2;
    }

    public static final boolean C(int i5, d0.d dVar, d0.d dVar2) {
        float f10 = dVar.f33937a;
        float f11 = dVar.f33939c;
        float f12 = dVar2.f33937a;
        float f13 = dVar2.f33939c;
        if (i5 == 3) {
            return (f13 > f11 || f12 >= f11) && f12 > f10;
        }
        if (i5 == 4) {
            return (f12 < f10 || f13 <= f10) && f13 < f11;
        }
        float f14 = dVar.f33938b;
        float f15 = dVar.f33940d;
        float f16 = dVar2.f33938b;
        float f17 = dVar2.f33940d;
        if (i5 == 5) {
            return (f17 > f15 || f16 >= f15) && f16 > f14;
        }
        if (i5 == 6) {
            return (f16 < f14 || f17 <= f14) && f17 < f15;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final long D(int i5, d0.d dVar, d0.d dVar2) {
        float f10;
        float f11;
        float fB;
        float f12 = dVar.f33938b;
        float f13 = dVar.f33937a;
        float f14 = dVar2.f33938b;
        float f15 = dVar2.f33937a;
        if (i5 == 3) {
            f10 = f13 - dVar2.f33939c;
        } else if (i5 == 4) {
            f10 = f15 - dVar.f33939c;
        } else if (i5 == 5) {
            f10 = f12 - dVar2.f33940d;
        } else {
            if (i5 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = f14 - dVar.f33940d;
        }
        long jAbs = (long) Math.abs(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10));
        if (i5 == 3 || i5 == 4) {
            float fB2 = dVar.b();
            float f16 = 2;
            f11 = (fB2 / f16) + f12;
            fB = (dVar2.b() / f16) + f14;
        } else {
            if (i5 != 5 && i5 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float fC = dVar.c();
            float f17 = 2;
            f11 = (fC / f17) + f13;
            fB = (dVar2.c() / f17) + f15;
        }
        long jAbs2 = (long) Math.abs(f11 - fB);
        return (jAbs2 * jAbs2) + (13 * jAbs * jAbs);
    }

    public static boolean E() {
        return AbstractC0213f.f(f1661i) >= 0;
    }

    public static boolean F(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean G(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static h H(String str) throws NumberFormatException {
        String strGroup;
        if (str == null || k.y0(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
        if (!matcher.matches() || (strGroup = matcher.group(1)) == null) {
            return null;
        }
        int i5 = Integer.parseInt(strGroup);
        String strGroup2 = matcher.group(2);
        if (strGroup2 == null) {
            return null;
        }
        int i10 = Integer.parseInt(strGroup2);
        String strGroup3 = matcher.group(3);
        if (strGroup3 == null) {
            return null;
        }
        int i11 = Integer.parseInt(strGroup3);
        String description = matcher.group(4) != null ? matcher.group(4) : "";
        AbstractC3340k.d(description, "description");
        return new h(i5, i10, i11, description);
    }

    public static final void I(Pf.i iVar, l block) throws EOFException {
        AbstractC3340k.e(iVar, "<this>");
        AbstractC3340k.e(block, "block");
        Pf.a buffer = iVar.getBuffer();
        if (buffer.exhausted()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        g gVar = buffer.f9454a;
        AbstractC3340k.b(gVar);
        int i5 = gVar.f9470b;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(gVar.f9469a, i5, gVar.f9471c - i5);
        AbstractC3340k.b(byteBufferWrap);
        block.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - i5;
        if (iPosition != 0) {
            if (iPosition < 0) {
                throw new IllegalStateException("Returned negative read bytes count");
            }
            if (iPosition > gVar.a()) {
                throw new IllegalStateException("Returned too many bytes");
            }
            buffer.skip(iPosition);
        }
    }

    public static int J(Context context, int i5, int i10) {
        TypedValue typedValueJ = A6.h.J(context, i5);
        return (typedValueJ == null || typedValueJ.type != 16) ? i10 : typedValueJ.data;
    }

    public static TimeInterpolator K(Context context, int i5, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i5, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!G(strValueOf, "cubic-bezier") && !G(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!G(strValueOf, "cubic-bezier")) {
            if (G(strValueOf, "path")) {
                return new PathInterpolator(AbstractC3772b.o(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return new PathInterpolator(A(0, strArrSplit), A(1, strArrSplit), A(2, strArrSplit), A(3, strArrSplit));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    public static final boolean M(C1542g c1542g, C1542g c1542g2, int i5, F f10) {
        C1542g c1542gR;
        P.d dVar = c1542g.f19499c;
        P.d dVar2 = new P.d(new C1542g[dVar.f8972c]);
        dVar2.c(0, dVar);
        while (dVar2.j() && (c1542gR = r(dVar2, A6.c.v(c1542g2), i5)) != null) {
            if (!c1542gR.f19500d.a()) {
                return ((Boolean) f10.invoke(c1542gR)).booleanValue();
            }
            if (M(c1542gR, c1542g2, i5, f10)) {
                return true;
            }
            dVar2.k(c1542gR);
        }
        return false;
    }

    public static final void N(B b5, int i5, int i10) {
        int i11 = 1 << i5;
        int i12 = b5.f8706h;
        if ((i12 & i11) == 0) {
            b5.f8706h = i11 | i12;
            b5.f8702d[(b5.f8703e - b5.b0().f8698a) + i5] = i10;
        } else {
            C0718d.P("Already pushed argument " + b5.b0().b(i5));
            throw null;
        }
    }

    public static final void O(B b5, int i5, Object obj) {
        int i10 = 1 << i5;
        int i11 = b5.f8707i;
        if ((i11 & i10) == 0) {
            b5.f8707i = i10 | i11;
            b5.f8704f[(b5.f8705g - b5.b0().f8699b) + i5] = obj;
        } else {
            C0718d.P("Already pushed argument " + b5.b0().c(i5));
            throw null;
        }
    }

    public static final long R(long j8) {
        return H.I((int) (j8 >> 32), (int) (j8 & 4294967295L));
    }

    public static C0237b0 S(Object obj) {
        return new C0237b0(obj.getClass().getSimpleName());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean T(c0.C1542g r9, int r10, B.F r11) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ba.c.T(c0.g, int, B.F):boolean");
    }

    public static void U(C1346a c1346a, String message) {
        c1346a.getClass();
        AbstractC3340k.e(message, "message");
        C3977a c3977a = (C3977a) ((C8.i) c1346a.f17489b).f1941d;
        ae.a aVar = c3977a.f44801a;
        ae.a aVar2 = ae.a.f17623b;
        if (aVar.f17625a <= 20) {
            Log.w(c3977a.f44802b, C1346a.K(message), null);
        }
    }

    public static ArrayList V(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static Rect W(List list) {
        Iterator it = list.iterator();
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    public static List X(zzf zzfVar) {
        Point[] pointArr = new Point[4];
        double dSin = Math.sin(Math.toRadians(zzfVar.zze));
        double dCos = Math.cos(Math.toRadians(zzfVar.zze));
        pointArr[0] = new Point(zzfVar.zza, zzfVar.zzb);
        double d3 = zzfVar.zza;
        double d5 = zzfVar.zzc;
        Point point = new Point((int) (d3 + (d5 * dCos)), (int) ((d5 * dSin) + zzfVar.zzb));
        pointArr[1] = point;
        double d10 = point.x;
        int i5 = zzfVar.zzd;
        pointArr[2] = new Point((int) (d10 - (i5 * dSin)), (int) ((i5 * dCos) + pointArr[1].y));
        Point point2 = pointArr[0];
        int i10 = point2.x;
        Point point3 = pointArr[2];
        int i11 = point3.x;
        Point point4 = pointArr[1];
        pointArr[3] = new Point((i11 - point4.x) + i10, (point3.y - point4.y) + point2.y);
        return Arrays.asList(pointArr);
    }

    public static final long a(int i5, int i10) {
        return (i10 & 4294967295L) | (i5 << 32);
    }

    public static final V.d b(Z.d dVar, E.F f10, long j8, long j10, long j11, x xVar, D d3, C0740o c0740o, int i5) {
        E.F f11;
        c0740o.M(-992573618);
        Z.d dVar2 = (i5 & 1) != 0 ? Z.a.f16902c : dVar;
        if ((i5 & 2) != 0) {
            float f12 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f31057a;
            f11 = new E.F(f12, f12, f12, f12);
        } else {
            f11 = f10;
        }
        long jB = (i5 & 4) != 0 ? ((C0680e) c0740o.j(AbstractC0682g.f6260a)).b() : j8;
        long j12 = (i5 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f31059c : j10;
        long j13 = (i5 & 16) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f31058b : j11;
        V.d dVarB = AbstractC2641B.b(dVar2, f11, jB, j12, j13, (i5 & 32) != 0 ? c(null, 0L, 0L, c0740o, 15) : xVar, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.f32405a, (i5 & 128) != 0 ? null : d3, c0740o);
        c0740o.p(false);
        return dVarB;
    }

    public static final x c(AbstractC2765c abstractC2765c, long j8, long j10, C0740o c0740o, int i5) {
        c0740o.M(571957227);
        if ((i5 & 1) != 0) {
            abstractC2765c = AbstractC2641B.H(R.drawable.ic_round_close_24, c0740o);
        }
        AbstractC2765c abstractC2765c2 = abstractC2765c;
        if ((i5 & 2) != 0) {
            j8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f31059c;
        }
        long j11 = j8;
        H.d dVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f31061e;
        if ((i5 & 8) != 0) {
            j10 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f31060d;
        }
        x xVar = new x(abstractC2765c2, "Close", j11, dVar, j10);
        c0740o.p(false);
        return xVar;
    }

    public static final boolean d(d0.d dVar, d0.d dVar2, d0.d dVar3, int i5) {
        float f10;
        float f11;
        if (e(i5, dVar3, dVar) || !e(i5, dVar2, dVar)) {
            return false;
        }
        float f12 = dVar3.f33938b;
        float f13 = dVar3.f33940d;
        float f14 = dVar3.f33937a;
        float f15 = dVar3.f33939c;
        float f16 = dVar.f33940d;
        float f17 = dVar.f33938b;
        float f18 = dVar.f33939c;
        float f19 = dVar.f33937a;
        if (i5 == 3) {
            if (f19 < f15) {
                return true;
            }
        } else if (i5 == 4) {
            if (f18 > f14) {
                return true;
            }
        } else if (i5 == 5) {
            if (f17 < f13) {
                return true;
            }
        } else {
            if (i5 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (f16 > f12) {
                return true;
            }
        }
        if (i5 == 3 || i5 == 4) {
            return true;
        }
        if (i5 == 3) {
            f10 = f19 - dVar2.f33939c;
        } else if (i5 == 4) {
            f10 = dVar2.f33937a - f18;
        } else if (i5 == 5) {
            f10 = f17 - dVar2.f33940d;
        } else {
            if (i5 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = dVar2.f33938b - f16;
        }
        float fMax = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10);
        if (i5 == 3) {
            f11 = f19 - f14;
        } else if (i5 == 4) {
            f11 = f15 - f18;
        } else if (i5 == 5) {
            f11 = f17 - f12;
        } else {
            if (i5 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f11 = f13 - f16;
        }
        return fMax < Math.max(1.0f, f11);
    }

    public static final boolean e(int i5, d0.d dVar, d0.d dVar2) {
        if (i5 == 3 || i5 == 4) {
            return dVar.f33940d > dVar2.f33938b && dVar.f33938b < dVar2.f33940d;
        }
        if (i5 == 5 || i5 == 6) {
            return dVar.f33939c > dVar2.f33937a && dVar.f33937a < dVar2.f33939c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static void l(long j8, String str) {
        if (j8 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j8 + ") must be >= 0");
    }

    public static void m(boolean z2) {
        if (!z2) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static final void n(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                Fe.b.d(th, th2);
            }
        }
    }

    public static Bitmap o(int i5, byte[] bArr) throws IOException {
        int i10 = 0;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i5, null);
        if (bitmapDecodeByteArray == null) {
            throw N1.D.a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            B1.h hVar = new B1.h(byteArrayInputStream);
            byteArrayInputStream.close();
            switch (hVar.e()) {
                case 3:
                case 4:
                    i10 = 180;
                    break;
                case 5:
                case 8:
                    i10 = 270;
                    break;
                case 6:
                case 7:
                    i10 = 90;
                    break;
            }
            if (i10 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i10);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } finally {
        }
    }

    public static void p(String str, String str2, int i5, Object... objArr) {
        if (AbstractC0213f.f(i5) >= AbstractC0213f.f(f1661i)) {
            String strConcat = AbstractC0279p0.l("(25.1.1) [", str, "]: ").concat(String.format(str2, objArr));
            int iF = AbstractC0213f.f(i5);
            if (iF == 0) {
                Log.i("Firestore", strConcat);
            } else if (iF == 1) {
                Log.w("Firestore", strConcat);
            } else if (iF == 2) {
                throw new IllegalStateException("Trying to log something on level NONE");
            }
        }
    }

    public static void q(C1346a c1346a, String message) {
        c1346a.getClass();
        AbstractC3340k.e(message, "message");
        C3977a c3977a = (C3977a) ((C8.i) c1346a.f17489b).f1941d;
        ae.a aVar = c3977a.f44801a;
        ae.a aVar2 = ae.a.f17623b;
        if (aVar.f17625a <= 30) {
            Log.e(c3977a.f44802b, C1346a.K(message), null);
        }
    }

    public static final C1542g r(P.d dVar, d0.d dVar2, int i5) {
        d0.d dVarD;
        if (i5 == 3) {
            dVarD = dVar2.d(dVar2.c() + 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else if (i5 == 4) {
            dVarD = dVar2.d(-(dVar2.c() + 1), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else if (i5 == 5) {
            dVarD = dVar2.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dVar2.b() + 1);
        } else {
            if (i5 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            dVarD = dVar2.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -(dVar2.b() + 1));
        }
        int i10 = dVar.f8972c;
        C1542g c1542g = null;
        if (i10 > 0) {
            Object[] objArr = dVar.f8970a;
            int i11 = 0;
            do {
                C1542g c1542g2 = (C1542g) objArr[i11];
                if (A6.c.D(c1542g2)) {
                    d0.d dVarV = A6.c.v(c1542g2);
                    if (C(i5, dVarV, dVar2) && (!C(i5, dVarD, dVar2) || d(dVar2, dVarV, dVarD, i5) || (!d(dVar2, dVarD, dVarV, i5) && D(i5, dVar2, dVarV) < D(i5, dVar2, dVarD)))) {
                        c1542g = c1542g2;
                        dVarD = dVarV;
                    }
                }
                i11++;
            } while (i11 < i10);
        }
        return c1542g;
    }

    public static Object s(Serializable serializable, Object obj) {
        if (serializable != null) {
            return serializable;
        }
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static void t(Object obj) throws NoSuchFieldException, SecurityException {
        LongSparseArray longSparseArray;
        if (!f1656d) {
            try {
                f1655c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e7) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e7);
            }
            f1656d = true;
        }
        Class cls = f1655c;
        if (cls == null) {
            return;
        }
        if (!f1658f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f1657e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e10);
            }
            f1658f = true;
        }
        Field field = f1657e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e11);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            AbstractC3062C.a(longSparseArray);
        }
    }

    public static ArrayList u(Activity activity) throws CameraAccessException, NumberFormatException {
        int i5;
        CameraManager cameraManager = (CameraManager) activity.getSystemService("camera");
        String[] cameraIdList = cameraManager.getCameraIdList();
        ArrayList arrayList = new ArrayList();
        for (String str : cameraIdList) {
            try {
                i5 = Integer.parseInt(str, 10);
            } catch (NumberFormatException unused) {
                i5 = -1;
            }
            if (i5 >= 0) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                int iIntValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
                int iIntValue2 = ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue();
                r rVar = r.FRONT;
                if (iIntValue2 != 0) {
                    if (iIntValue2 == 1) {
                        rVar = r.BACK;
                    } else if (iIntValue2 == 2) {
                        rVar = r.EXTERNAL;
                    }
                }
                Long lValueOf = Long.valueOf(iIntValue);
                q qVar = new q();
                if (str == null) {
                    throw new IllegalStateException("Nonnull field \"name\" is null.");
                }
                qVar.f48159a = str;
                qVar.f48160b = rVar;
                qVar.f48161c = lValueOf;
                arrayList.add(qVar);
            }
        }
        return arrayList;
    }

    public static f v(Ca.h hVar) {
        Ea.g gVar = (Ea.g) ya.g.c().a(Ea.g.class);
        gVar.getClass();
        Ea.a aVar = (Ea.a) gVar.f3639a.get(hVar);
        Executor executorF = hVar.f();
        ya.d dVar = gVar.f3640b;
        if (executorF != null) {
            dVar.getClass();
        } else {
            executorF = (Executor) dVar.f48044a.get();
        }
        return new f(aVar, executorF, zzun.zzb(hVar.a()), hVar);
    }

    public static ColorStateList w(Context context, TypedArray typedArray, int i5) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i5) || (resourceId = typedArray.getResourceId(i5, 0)) == 0 || (colorStateList = Y0.e.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i5) : colorStateList;
    }

    public static ColorStateList x(Context context, J j8, int i5) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) j8.f40581b;
        return (!typedArray.hasValue(i5) || (resourceId = typedArray.getResourceId(i5, 0)) == 0 || (colorStateList = Y0.e.getColorStateList(context, resourceId)) == null) ? j8.m(i5) : colorStateList;
    }

    public static float y(C0740o c0740o) {
        c0740o.M(621183615);
        c0740o.M(-1528360391);
        long j8 = ((C2465q) c0740o.j(AbstractC0684i.f6262a)).f34382a;
        if (((C0680e) c0740o.j(AbstractC0682g.f6260a)).d()) {
            z.l(j8);
        } else {
            z.l(j8);
        }
        c0740o.p(false);
        c0740o.p(false);
        return 0.38f;
    }

    public static Drawable z(Context context, TypedArray typedArray, int i5) {
        int resourceId;
        Drawable drawableB;
        return (!typedArray.hasValue(i5) || (resourceId = typedArray.getResourceId(i5, 0)) == 0 || (drawableB = Fe.g.B(context, resourceId)) == null) ? typedArray.getDrawable(i5) : drawableB;
    }

    public abstract void P();

    public abstract void Q();

    public boolean j() {
        return false;
    }

    public void L() {
    }
}
