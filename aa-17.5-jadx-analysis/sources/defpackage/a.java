package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public class a {
    public a() {
    }

    public static /* synthetic */ long A(long j, long j2) {
        boolean z = (j ^ j2) < 0;
        long j3 = j2 + j;
        if (z || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ Unsafe B() throws IllegalAccessException, IllegalArgumentException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        return null;
    }

    public static /* synthetic */ boolean C(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static /* synthetic */ String D(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    public static /* synthetic */ Object E(Method method, Object obj, Object[] objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static /* synthetic */ int F(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(bn(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(bo(i2, i, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(bo(i3, i2, "End index: ", " >= "));
    }

    public static /* synthetic */ void G(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(bo(i2, i, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(bp(i, "Index < 0: "));
        }
    }

    public static /* synthetic */ int H(int i) {
        while (i < -536870912) {
            i += 1073741824;
        }
        while (i >= 536870912) {
            i -= 1073741824;
        }
        return i;
    }

    public static /* synthetic */ float I(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f3 = ((f2 - f) + 6.2831855f) % 6.2831855f;
        return ((double) f3) > 3.141592653589793d ? f3 - 6.2831855f : f3;
    }

    public static /* synthetic */ abgx J(aavb aavbVar) {
        int iOrdinal = aavbVar.ordinal();
        if (iOrdinal == 1) {
            return abgx.ROADMAP;
        }
        if (iOrdinal == 2) {
            return abgx.ROADMAP_DARK;
        }
        if (iOrdinal == 3) {
            return abgx.NAVIGATION;
        }
        if (iOrdinal == 4) {
            return abgx.NAVIGATION_LOW_LIGHT;
        }
        if (iOrdinal == 7) {
            return abgx.ROADMAP_SATELLITE;
        }
        switch (iOrdinal) {
            case 10:
                return abgx.TERRAIN_VECTOR_CLIENT;
            case 11:
                return abgx.TERRAIN_VECTOR_CLIENT_DARK;
            case 12:
                return abgx.TRANSIT_FOCUSED;
            case 13:
                return abgx.TRANSIT_FOCUSED_DARK;
            default:
                return abgx.UNKNOWN;
        }
    }

    public static /* synthetic */ String K(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }

    public static /* synthetic */ Object L(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static /* synthetic */ Unsafe M() throws IllegalAccessException, IllegalArgumentException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    public static /* synthetic */ boolean O() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static /* synthetic */ boolean P() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static /* synthetic */ sab Q() {
        mki.a.g();
        return ols.v(kio.b().e(), CarDisplayId.a);
    }

    public static /* synthetic */ PorterDuff.Mode R(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static /* synthetic */ String S(int i) {
        switch (i) {
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            default:
                return "CENTER_Y";
        }
    }

    public static /* synthetic */ byte[] T(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    public static /* synthetic */ String U(Object[] objArr, Class cls) {
        String[] strArrSplit = "majorVersion;minorVersion".split(";");
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getSimpleName());
        sb.append("[");
        int i = 0;
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }

    public static /* synthetic */ int V(Object obj, Object obj2) {
        return (Objects.hashCode(obj) * 31) + Objects.hashCode(obj2);
    }

    public static /* synthetic */ Set W(xxh xxhVar, aezk aezkVar) {
        return xxhVar.f() ? new ymp((vsa) aezkVar.a()) : yly.a;
    }

    public static /* synthetic */ boolean X(Duration duration) {
        return (duration.isZero() || duration.isNegative()) ? false : true;
    }

    public static /* synthetic */ boolean Y(int i, int i2) {
        return i == i2;
    }

    public static /* synthetic */ boolean Z() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static /* synthetic */ void a(cp cpVar, ai aiVar) {
        if (bt.ac(2)) {
            Log.v("FragmentManager", bm(cpVar, "Transition for operation ", " has completed"));
        }
        cpVar.f(aiVar);
    }

    public static /* synthetic */ int aA(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    public static /* synthetic */ int aB(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aC(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static /* synthetic */ int aD(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aE(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aF(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        switch (i) {
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            default:
                return 0;
        }
    }

    public static /* synthetic */ void aG(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(bo(i2, i, "index: ", ", size: "));
        }
    }

    public static /* synthetic */ void aH(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(bo(i2, i, "index: ", ", size: "));
        }
    }

    public static /* synthetic */ void aI(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(br(i3, i2, i, "fromIndex: ", ", toIndex: ", ", size: "));
        }
        if (i > i2) {
            throw new IllegalArgumentException(bo(i2, i, "fromIndex: ", " > toIndex: "));
        }
    }

    public static /* synthetic */ void aJ(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static /* synthetic */ boolean aK(int i) {
        return ap(i) != 0;
    }

    public static /* synthetic */ boolean aL(int i) {
        return as(i) != 0;
    }

    public static /* synthetic */ boolean aM(int i) {
        return at(i) != 0;
    }

    public static /* synthetic */ boolean aN(int i) {
        return av(i) != 0;
    }

    public static /* synthetic */ boolean aO(int i) {
        return ay(i) != 0;
    }

    public static /* synthetic */ boolean aP(int i) {
        return aB(i) != 0;
    }

    public static /* synthetic */ boolean aQ(int i) {
        return aC(i) != 0;
    }

    public static /* synthetic */ boolean aR(int i) {
        return aD(i) != 0;
    }

    public static /* synthetic */ int aS(double d) {
        double d2 = d / 100.0d;
        int iRound = (int) Math.round((d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
        if (iRound < 0) {
            return 0;
        }
        if (iRound > 255) {
            return 255;
        }
        return iRound;
    }

    public static /* synthetic */ int aT(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            default:
                return 0;
        }
    }

    public static /* synthetic */ boolean aU(int i) {
        return ar(i) != 0;
    }

    public static /* synthetic */ Object aV() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ void aW(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static Object aX(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static rz aY(Context context, Fragment fragment, boolean z, boolean z2) throws Resources.NotFoundException {
        int exitAnim;
        boolean z3;
        int nextTransition = fragment.getNextTransition();
        int iCl = 0;
        if (z2) {
            if (z) {
                exitAnim = fragment.getPopEnterAnim();
                z3 = true;
            } else {
                exitAnim = fragment.getPopExitAnim();
                z3 = false;
            }
        } else if (z) {
            exitAnim = fragment.getEnterAnim();
            z3 = true;
        } else {
            exitAnim = fragment.getExitAnim();
            z3 = false;
        }
        boolean z4 = z3;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z3, exitAnim);
        if (animationOnCreateAnimation != null) {
            return new rz(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z3, exitAnim);
        if (animatorOnCreateAnimator != null) {
            return new rz(animatorOnCreateAnimator);
        }
        if (exitAnim != 0) {
            iCl = exitAnim;
        } else if (nextTransition != 0) {
            iCl = nextTransition != 4097 ? nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z3 ? cl(context, android.R.attr.activityOpenEnterAnimation) : cl(context, android.R.attr.activityOpenExitAnimation) : true != z4 ? R.animator.fragment_fade_exit : R.animator.fragment_fade_enter : z3 ? cl(context, android.R.attr.activityCloseEnterAnimation) : cl(context, android.R.attr.activityCloseExitAnimation) : true != z4 ? R.animator.fragment_close_exit : R.animator.fragment_close_enter : true != z4 ? R.animator.fragment_open_exit : R.animator.fragment_open_enter;
        }
        if (iCl != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iCl));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iCl);
                    if (animationLoadAnimation != null) {
                        return new rz(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            } else {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iCl);
                    if (animatorLoadAnimator != null) {
                        return new rz(animatorLoadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (zEquals) {
                        throw e2;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iCl);
                    if (animationLoadAnimation2 != null) {
                        return new rz(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object aZ(defpackage.ept r5, defpackage.afck r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.fts
            if (r0 == 0) goto L13
            r0 = r6
            fts r0 = (defpackage.fts) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fts r0 = new fts
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            affv r5 = r0.d
            java.lang.Object r0 = r0.a
            defpackage.woy.dF(r6)     // Catch: java.lang.Throwable -> L2b
            goto L75
        L2b:
            r6 = move-exception
            goto L89
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.woy.dF(r6)
            eps r6 = r5.a()
            eps r2 = defpackage.eps.d
            boolean r6 = r6.a(r2)
            if (r6 == 0) goto L45
            goto L80
        L45:
            affv r6 = new affv
            r6.<init>()
            r0.a = r5     // Catch: java.lang.Throwable -> L84
            r0.d = r6     // Catch: java.lang.Throwable -> L84
            r0.c = r3     // Catch: java.lang.Throwable -> L84
            aitg r2 = new aitg     // Catch: java.lang.Throwable -> L84
            afck r0 = defpackage.affa.s(r0)     // Catch: java.lang.Throwable -> L84
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L84
            r2.z()     // Catch: java.lang.Throwable -> L84
            ftt r0 = new ftt     // Catch: java.lang.Throwable -> L84
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L84
            r6.a = r0     // Catch: java.lang.Throwable -> L84
            java.lang.Object r0 = r6.a     // Catch: java.lang.Throwable -> L84
            r0.getClass()     // Catch: java.lang.Throwable -> L84
            epz r0 = (defpackage.epz) r0     // Catch: java.lang.Throwable -> L84
            r5.c(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.Object r0 = r2.k()     // Catch: java.lang.Throwable -> L84
            if (r0 == r1) goto L83
            r0 = r5
            r5 = r6
        L75:
            java.lang.Object r5 = r5.a
            epz r5 = (defpackage.epz) r5
            if (r5 == 0) goto L80
            ept r0 = (defpackage.ept) r0
            r0.d(r5)
        L80:
            afak r5 = defpackage.afak.a
            return r5
        L83:
            return r1
        L84:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L89:
            java.lang.Object r5 = r5.a
            epz r5 = (defpackage.epz) r5
            if (r5 == 0) goto L94
            ept r0 = (defpackage.ept) r0
            r0.d(r5)
        L94:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a.aZ(ept, afck):java.lang.Object");
    }

    public static /* synthetic */ String aa(abco abcoVar) {
        StringBuilder sb = new StringBuilder();
        for (abcn abcnVar : abcoVar.c) {
            if (abcnVar.h) {
                sb.append('\n');
            }
            if ((abcnVar.b & 1) != 0) {
                sb.append(abcnVar.c);
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ int ab(int i, int i2, int i3) {
        return (i2 < 0 ? i >> (-i2) : i << i2) + i3;
    }

    public static /* synthetic */ int ac(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 3) {
            return 0;
        }
        if (i == 5) {
            return 1;
        }
        throw new IllegalArgumentException(bp(i, "Unsupported stream type "));
    }

    public static /* synthetic */ afak ad(geu geuVar, uq uqVar) {
        ghe gheVar = (ghe) geuVar.l(ghe.class);
        if (gheVar != null) {
            gheVar.g(gsn.c);
        }
        gca.e(geuVar, uqVar);
        return afak.a;
    }

    public static /* synthetic */ gab ae(bym bymVar) {
        return (gab) bymVar.a();
    }

    public static /* synthetic */ gfa af(bym bymVar) {
        return (gfa) bymVar.a();
    }

    public static /* synthetic */ afak ag(List list, cun cunVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cunVar.x((cuo) list.get(i), 0, 0);
        }
        return afak.a;
    }

    public static /* synthetic */ long ah(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static /* synthetic */ long ai(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public static /* synthetic */ int aj(Context context) {
        if (context == null || Build.VERSION.SDK_INT < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) {
            return 0;
        }
        return context.getResources().getConfiguration().fontWeightAdjustment;
    }

    public static /* synthetic */ afak ak(cuo cuoVar, cun cunVar) {
        cunVar.r(cuoVar, 0, 0, BitmapDescriptorFactory.HUE_RED);
        return afak.a;
    }

    public static /* synthetic */ void al(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static /* synthetic */ void am(String str) {
        throw new IllegalStateException(bq(str, "CompositionLocal ", " not present"));
    }

    public static /* synthetic */ void an(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int next = xmlPullParser.next();
        while (next != 2) {
            if (next == 1) {
                throw new XmlPullParserException("No start tag found");
            }
            next = xmlPullParser.next();
        }
    }

    public static /* synthetic */ boolean ao(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static /* synthetic */ int ap(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static /* synthetic */ int aq(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 2 ? 0 : 4;
        }
        return 3;
    }

    public static /* synthetic */ int ar(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public static /* synthetic */ int as(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int at(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    public static /* synthetic */ int au(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 5;
        }
        if (i != 4) {
            return i != 5 ? 0 : 7;
        }
        return 6;
    }

    public static /* synthetic */ int av(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static /* synthetic */ int aw(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    public static /* synthetic */ int ax(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? 0 : 6;
        }
        return 5;
    }

    public static /* synthetic */ int ay(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static /* synthetic */ int az(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 5;
        }
        return 4;
    }

    public static /* synthetic */ boolean b(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 1) {
            return xmlPullParser.getDepth() <= 0 && xmlPullParser.getEventType() == 3;
        }
        return true;
    }

    public static /* synthetic */ String bA(int i, String str, String str2, String str3) {
        return str2 + str + str3 + i;
    }

    public static /* synthetic */ String bB(int i, int i2, String str, String str2, String str3) {
        return str + i2 + str2 + i + str3;
    }

    public static /* synthetic */ String bC(String str, String str2, String str3, String str4, String str5) {
        return str3 + str2 + str4 + str + str5;
    }

    public static /* synthetic */ String bG(float f, String str) {
        return str + f;
    }

    public static /* synthetic */ String bI(long j, String str, String str2) {
        return str + j + str2;
    }

    public static /* synthetic */ String bJ(String str, String str2, String str3) {
        return str2 + str3 + str;
    }

    public static /* synthetic */ String bK(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ String bL(Object obj, Object obj2, String str, String str2) {
        return str + String.valueOf(obj2) + str2 + String.valueOf(obj);
    }

    public static /* synthetic */ String bM(String str, String str2, String str3, String str4) {
        return str3 + str2 + str4 + str;
    }

    public static /* synthetic */ String bN(long j, String str) {
        return str + j;
    }

    public static /* synthetic */ String bR(boolean z, String str) {
        return str + z;
    }

    public static /* synthetic */ String bV(Object obj, String str, String str2) {
        return str + String.valueOf(obj) + str2;
    }

    public static /* synthetic */ String bW(Object obj, String str, String str2) {
        return str + obj.toString() + str2;
    }

    public static /* synthetic */ String bX(Object obj, String str) {
        return str + obj.toString();
    }

    public static /* synthetic */ String bY(Object obj, String str) {
        return str + String.valueOf(obj);
    }

    public static /* synthetic */ String bZ(char c, String str, String str2) {
        return str + c + str2;
    }

    public static void ba(ajnf ajnfVar, ajnr ajnrVar) throws IOException {
        ajnrVar.getClass();
        if (ajnfVar.i(ajnrVar)) {
            return;
        }
        ajoa ajoaVarA = ajnfVar.a(ajnrVar);
        Bitmap.Config[] configArr = ftw.a;
        e(ajoaVarA);
    }

    public static void bb(ajnf ajnfVar, ajnr ajnrVar) throws IOException {
        ajnrVar.getClass();
        try {
            List<ajnr> listB = ((ajng) ajnfVar).c.b(ajnrVar);
            ArrayList<ajnr> arrayList = new ArrayList();
            for (ajnr ajnrVar2 : listB) {
                ajnrVar2.getClass();
                arrayList.add(ajnrVar2);
            }
            woy.br(arrayList);
            IOException iOException = null;
            for (ajnr ajnrVar3 : arrayList) {
                try {
                    if (ajnfVar.d(ajnrVar3).b) {
                        bb(ajnfVar, ajnrVar3);
                    }
                    ajnfVar.h(ajnrVar3);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static boolean bc(ftn ftnVar) {
        return affa.f(ftnVar, ftn.a);
    }

    public static List bd(List list) {
        int size = list.size();
        if (size == 0) {
            return afbe.a;
        }
        if (size != 1) {
            List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list));
            listUnmodifiableList.getClass();
            return listUnmodifiableList;
        }
        List listSingletonList = Collections.singletonList(woy.bF(list));
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static Map be(Map map) {
        int size = map.size();
        if (size == 0) {
            return afbf.a;
        }
        if (size != 1) {
            Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(new LinkedHashMap(map));
            mapUnmodifiableMap.getClass();
            return mapUnmodifiableMap;
        }
        Map.Entry entry = (Map.Entry) woy.bE(map.entrySet());
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static int bf(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                Bitmap.Config config = bitmap.getConfig();
                return width * (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : config == Bitmap.Config.RGBA_F16 ? 8 : 4);
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig());
    }

    public static Bitmap.Config bg(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        return config == null ? Bitmap.Config.ARGB_8888 : config;
    }

    public static Bitmap.Config bh(Bitmap.Config config) {
        return bi(config) ? Bitmap.Config.ARGB_8888 : config;
    }

    public static boolean bi(Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }

    public static fqv bj(ajna ajnaVar, Context context) {
        return new fqx(ajnaVar, ftw.a(context), null);
    }

    public static fqv bk(ajnr ajnrVar, ajnf ajnfVar, String str, Closeable closeable) {
        ajnfVar.getClass();
        return new fqu(ajnrVar, ajnfVar, str, closeable);
    }

    public static fqv bl(ajna ajnaVar, Context context, dtg dtgVar) {
        return new fqx(ajnaVar, ftw.a(context), dtgVar);
    }

    public static /* synthetic */ String bm(Object obj, String str, String str2) {
        return str + obj + str2;
    }

    public static /* synthetic */ String bn(int i, String str, String str2) {
        return str + i + str2;
    }

    public static /* synthetic */ String bo(int i, int i2, String str, String str2) {
        return str + i2 + str2 + i;
    }

    public static /* synthetic */ String bp(int i, String str) {
        return str + i;
    }

    public static /* synthetic */ String bq(String str, String str2, String str3) {
        return str2 + str + str3;
    }

    public static /* synthetic */ String br(int i, int i2, int i3, String str, String str2, String str3) {
        return str + i3 + str2 + i2 + str3 + i;
    }

    public static /* synthetic */ String bt(Object obj, Object obj2, String str, String str2) {
        return str + obj2 + str2 + obj;
    }

    public static /* synthetic */ void bv(yop yopVar, String str, char c, Throwable th) {
        ((ype) ((ype) ((ype) yopVar).p(th)).ai(c)).u(str);
    }

    public static /* synthetic */ String bw(Object obj, Object obj2, String str, String str2, String str3) {
        return str + obj2 + str2 + obj + str3;
    }

    public static /* synthetic */ String bx(String str, AttributeSet attributeSet, String str2) {
        return attributeSet.getPositionDescription() + str2 + str;
    }

    public static /* synthetic */ String by(Object obj, String str, String str2, String str3) {
        return str2 + str + str3 + obj;
    }

    public static /* synthetic */ String bz(String str, String str2) {
        return str2 + str;
    }

    public static /* synthetic */ afak c(List list, cun cunVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cunVar.r((cuo) list.get(i), 0, 0, BitmapDescriptorFactory.HUE_RED);
        }
        return afak.a;
    }

    public static /* synthetic */ String cc(Message message, String str) {
        return str + message.what;
    }

    public static /* synthetic */ String ce(String str) {
        return System.currentTimeMillis() + str + Math.abs(new SecureRandom().nextLong());
    }

    public static /* synthetic */ String cj(byte b, Object obj, Object obj2, String str, String str2) {
        return str + obj2 + str2 + obj + ((char) b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String ck(Object obj, int i) {
        return "Callable expects " + afxf.getArity(obj) + " arguments, but " + i + " were provided.";
    }

    private static int cl(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static /* synthetic */ void d(azr azrVar, int i) {
        int i2 = azrVar.a;
        if (i2 == -1) {
            i2 = 2;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            azrVar.a(i + i3);
        }
    }

    public static /* synthetic */ void e(Closeable closeable) throws IOException {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ int f(boolean z) {
        return z ? 1231 : 1237;
    }

    public static /* synthetic */ int g(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ boolean h(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean i(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean j(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void k(Appendable appendable, Object obj, afec afecVar) throws IOException {
        if (afecVar != null) {
            appendable.append((CharSequence) afecVar.invoke(obj));
            return;
        }
        if (obj == null || (obj instanceof CharSequence)) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static /* synthetic */ void l(ExecutorService executorService) throws InterruptedException {
        if (executorService == ForkJoinPool.commonPool() || executorService.isTerminated()) {
            return;
        }
        executorService.shutdown();
        boolean zAwaitTermination = false;
        boolean z = false;
        while (!zAwaitTermination) {
            try {
                zAwaitTermination = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                }
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ boolean m() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ void n() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ boolean o(long j, int i) {
        if (j >= -315576000000L && j <= 315576000000L && i >= -999999999 && i < 1000000000) {
            if (j >= 0 && i >= 0) {
                return true;
            }
            if (j <= 0 && i <= 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean p(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(null, obj)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean q(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(obj, null)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ int r(double d) {
        if (d < 0.0d) {
            return -1;
        }
        return d == 0.0d ? 0 : 1;
    }

    public static /* synthetic */ double[] s(double[] dArr, double[][] dArr2) {
        double d = dArr[0];
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = dArr3[1] * d3;
        double d5 = dArr[2];
        double d6 = dArr3[2] * d5;
        double[] dArr4 = dArr2[1];
        double d7 = dArr4[0] * d;
        double d8 = dArr4[1] * d3;
        double d9 = dArr4[2] * d5;
        double[] dArr5 = dArr2[2];
        return new double[]{d2 + d4 + d6, d7 + d8 + d9, (d * dArr5[0]) + (d3 * dArr5[1]) + (d5 * dArr5[2])};
    }

    public static /* synthetic */ double t(double d) {
        return d > 0.008856451679035631d ? Math.pow(d, 0.3333333333333333d) : ((d * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    public static /* synthetic */ double u(double d) {
        double d2 = d * d * d;
        return d2 > 0.008856451679035631d ? d2 : ((d * 116.0d) - 16.0d) / 903.2962962962963d;
    }

    public static /* synthetic */ double v(int i) {
        double d = i / 255.0d;
        return (d <= 0.040449936d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    public static /* synthetic */ double w(double d) {
        double d2 = d / 100.0d;
        return (d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    public static /* synthetic */ boolean x(double d) {
        return d >= 0.0d && d <= 100.0d;
    }

    public static /* synthetic */ double[] y(double[] dArr, double d, double[] dArr2) {
        double d2 = dArr[0];
        double d3 = d2 + ((dArr2[0] - d2) * d);
        double d4 = dArr[1];
        double d5 = d4 + ((dArr2[1] - d4) * d);
        double d6 = dArr[2];
        return new double[]{d3, d5, d6 + ((dArr2[2] - d6) * d)};
    }

    public static /* synthetic */ double[] z(double[] dArr, double[] dArr2) {
        return new double[]{(dArr[0] + dArr2[0]) / 2.0d, (dArr[1] + dArr2[1]) / 2.0d, (dArr[2] + dArr2[2]) / 2.0d};
    }

    public a(char[] cArr) {
    }
}
