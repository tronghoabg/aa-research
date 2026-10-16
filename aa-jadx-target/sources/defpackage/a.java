package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class a {
    public a() {
    }

    public static /* synthetic */ sun.misc.Unsafe A() throws java.lang.IllegalAccessException {
        for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            java.lang.Object obj = field.get(null);
            if (sun.misc.Unsafe.class.isInstance(obj)) {
                return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
            }
        }
        return null;
    }

    public static /* synthetic */ boolean B(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static /* synthetic */ java.lang.String C(java.lang.String str) {
        if (str.isEmpty()) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.Character.toLowerCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (java.lang.Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(java.lang.Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    public static /* synthetic */ java.lang.Object D(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object[] objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            java.lang.Throwable cause = e2.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static /* synthetic */ int E(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException(bm(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException(bn(i2, i, "Beginning index larger than ending index: ", ", "));
        }
        throw new java.lang.IndexOutOfBoundsException(bn(i3, i2, "End index: ", " >= "));
    }

    public static /* synthetic */ void F(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException(bn(i2, i, "Index > length: ", ", "));
            }
            throw new java.lang.ArrayIndexOutOfBoundsException(bo(i, "Index < 0: "));
        }
    }

    public static /* synthetic */ int G(int i) {
        while (i < -536870912) {
            i += 1073741824;
        }
        while (i >= 536870912) {
            i -= 1073741824;
        }
        return i;
    }

    public static /* synthetic */ float H(float f, float f2) {
        if (java.lang.Float.isNaN(f) || java.lang.Float.isNaN(f2)) {
            return 0.0f;
        }
        float f3 = ((f2 - f) + 6.2831855f) % 6.2831855f;
        return ((double) f3) > 3.141592653589793d ? f3 - 6.2831855f : f3;
    }

    public static /* synthetic */ abia I(aawe aaweVar) {
        int iOrdinal = aaweVar.ordinal();
        if (iOrdinal == 1) {
            return abia.O;
        }
        if (iOrdinal == 2) {
            return abia.R;
        }
        if (iOrdinal == 3) {
            return abia.q;
        }
        if (iOrdinal == 4) {
            return abia.J;
        }
        if (iOrdinal == 7) {
            return abia.U;
        }
        switch (iOrdinal) {
            case 10:
                return abia.ad;
            case 11:
                return abia.ae;
            case 12:
                return abia.af;
            case 13:
                return abia.ag;
            default:
                return abia.a;
        }
    }

    public static /* synthetic */ java.lang.String J(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int length = bArr.length;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + length);
        for (byte b : bArr) {
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }

    public static /* synthetic */ java.lang.Object K(java.util.concurrent.Future future) {
        java.lang.Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static /* synthetic */ sun.misc.Unsafe L() throws java.lang.IllegalAccessException {
        for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            java.lang.Object obj = field.get(null);
            if (sun.misc.Unsafe.class.isInstance(obj)) {
                return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
            }
        }
        throw new java.lang.NoSuchFieldError("the Unsafe");
    }

    public static /* synthetic */ boolean N() {
        return android.os.Build.VERSION.SDK_INT >= 30;
    }

    public static /* synthetic */ boolean O() {
        return android.os.Build.VERSION.SDK_INT >= 35;
    }

    public static /* synthetic */ defpackage.sax P() {
        defpackage.mkp.a.g();
        return defpackage.oml.v(defpackage.kit.b().e(), com.google.android.gms.car.display.CarDisplayId.a);
    }

    public static /* synthetic */ android.graphics.PorterDuff.Mode Q(int i, android.graphics.PorterDuff.Mode mode) {
        if (i == 3) {
            return android.graphics.PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return android.graphics.PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return android.graphics.PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return android.graphics.PorterDuff.Mode.MULTIPLY;
            case 15:
                return android.graphics.PorterDuff.Mode.SCREEN;
            case 16:
                return android.graphics.PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static /* synthetic */ java.lang.String R(int i) {
        switch (i) {
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return "LEFT";
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return "TOP";
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return "RIGHT";
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return "BOTTOM";
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return "BASELINE";
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return "CENTER";
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return "CENTER_X";
            default:
                return "CENTER_Y";
        }
    }

    public static /* synthetic */ byte[] S(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    public static /* synthetic */ java.lang.String T(java.lang.Object[] objArr, java.lang.Class cls) {
        java.lang.String[] strArrSplit = "majorVersion;minorVersion".split(";");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
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

    public static /* synthetic */ int U(java.lang.Object obj, java.lang.Object obj2) {
        return (j$.util.Objects.hashCode(obj) * 31) + j$.util.Objects.hashCode(obj2);
    }

    public static /* synthetic */ java.util.Set V(defpackage.xyn xynVar, defpackage.afak afakVar) {
        return xynVar.f() ? new defpackage.ynu((defpackage.vsw) afakVar.a()) : defpackage.ynd.a;
    }

    public static /* synthetic */ boolean W(j$.time.Duration duration) {
        return (duration.isZero() || duration.isNegative()) ? false : true;
    }

    public static /* synthetic */ boolean X(int i, int i2) {
        return i == i2;
    }

    public static /* synthetic */ boolean Y() {
        return android.os.Looper.myLooper() == android.os.Looper.getMainLooper();
    }

    public static /* synthetic */ java.lang.String Z(abdr abdrVar) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (abdq abdqVar : abdrVar.c) {
            if (abdqVar.h) {
                sb.append('\n');
            }
            if ((abdqVar.b & 1) != 0) {
                sb.append(abdqVar.c);
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ void a(defpackage.cp cpVar, ai aiVar) {
        if (defpackage.bt.ac(2)) {
            android.util.Log.v("FragmentManager", bl(cpVar, "Transition for operation ", " has completed"));
        }
        cpVar.f(aiVar);
    }

    public static /* synthetic */ int aA(int i) {
        switch (i) {
            case defpackage.abnt.b /* 0 */:
                return 1;
            case 1:
                return 2;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return 3;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return 4;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return 5;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return 6;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return 7;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return 8;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
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

    public static /* synthetic */ int aB(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static /* synthetic */ int aC(int i) {
        switch (i) {
            case defpackage.abnt.b /* 0 */:
                return 1;
            case 1:
                return 2;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return 3;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return 4;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return 5;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return 6;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return 7;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return 8;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aD(int i) {
        switch (i) {
            case defpackage.abnt.b /* 0 */:
                return 1;
            case 1:
                return 2;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return 3;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return 4;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return 5;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return 6;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return 7;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return 8;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return 9;
            case 9:
                return 10;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aE(int i) {
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

    public static /* synthetic */ void aF(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new java.lang.IndexOutOfBoundsException(bn(i2, i, "index: ", ", size: "));
        }
    }

    public static /* synthetic */ void aG(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new java.lang.IndexOutOfBoundsException(bn(i2, i, "index: ", ", size: "));
        }
    }

    public static /* synthetic */ void aH(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new java.lang.IndexOutOfBoundsException(bq(i3, i2, i, "fromIndex: ", ", toIndex: ", ", size: "));
        }
        if (i > i2) {
            throw new java.lang.IllegalArgumentException(bn(i2, i, "fromIndex: ", " > toIndex: "));
        }
    }

    public static /* synthetic */ void aI(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static /* synthetic */ boolean aJ(int i) {
        return ao(i) != 0;
    }

    public static /* synthetic */ boolean aK(int i) {
        return ar(i) != 0;
    }

    public static /* synthetic */ boolean aL(int i) {
        return as(i) != 0;
    }

    public static /* synthetic */ boolean aM(int i) {
        return au(i) != 0;
    }

    public static /* synthetic */ boolean aN(int i) {
        return ax(i) != 0;
    }

    public static /* synthetic */ boolean aO(int i) {
        return aA(i) != 0;
    }

    public static /* synthetic */ boolean aP(int i) {
        return aB(i) != 0;
    }

    public static /* synthetic */ boolean aQ(int i) {
        return aC(i) != 0;
    }

    public static /* synthetic */ int aR(double d) {
        double d2 = d / 100.0d;
        int iRound = (int) java.lang.Math.round((d2 <= 0.0031308d ? d2 * 12.92d : (java.lang.Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
        if (iRound < 0) {
            return 0;
        }
        if (iRound > 255) {
            return 255;
        }
        return iRound;
    }

    public static /* synthetic */ int aS(int i) {
        switch (i) {
            case defpackage.abnt.b /* 0 */:
                return 1;
            case 1:
                return 2;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return 3;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return 4;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return 5;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return 6;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return 7;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return 8;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
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

    public static /* synthetic */ boolean aT(int i) {
        return aq(i) != 0;
    }

    public static /* synthetic */ java.lang.Object aU() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ void aV(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static java.lang.Object aW(android.os.Parcel parcel, android.os.Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00de A[Catch: RuntimeException -> 0x00e4, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00e4, blocks: (B:68:0x00d8, B:70:0x00de), top: B:81:0x00d8 }] */
    public static se aX(android.content.Context context, android.support.v4.app.Fragment fragment, boolean z, boolean z2) {
        int exitAnim;
        boolean z3;
        android.animation.Animator animatorLoadAnimator;
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
        android.view.ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getTag(2131429877) != null) {
            fragment.mContainer.setTag(2131429877, null);
        }
        android.view.ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        android.view.animation.Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z3, exitAnim);
        if (animationOnCreateAnimation != null) {
            return new se(animationOnCreateAnimation);
        }
        android.animation.Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z3, exitAnim);
        if (animatorOnCreateAnimator != null) {
            return new se(animatorOnCreateAnimator);
        }
        if (exitAnim != 0) {
            iCl = exitAnim;
        } else if (nextTransition != 0) {
            if (nextTransition == 4097) {
                iCl = true != z4 ? 2130837516 : 2130837515;
            } else if (nextTransition == 8194) {
                iCl = true != z4 ? 2130837512 : 2130837511;
            } else if (nextTransition == 8197) {
                iCl = z3 ? cl(context, android.R.attr.activityCloseEnterAnimation) : cl(context, android.R.attr.activityCloseExitAnimation);
            } else if (nextTransition == 4099) {
                iCl = true != z4 ? 2130837514 : 2130837513;
            } else if (nextTransition != 4100) {
                iCl = -1;
            } else {
                iCl = z3 ? cl(context, android.R.attr.activityOpenEnterAnimation) : cl(context, android.R.attr.activityOpenExitAnimation);
            }
        }
        if (iCl != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iCl));
            if (zEquals) {
                try {
                    android.view.animation.Animation animationLoadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, iCl);
                    if (animationLoadAnimation != null) {
                        return new se(animationLoadAnimation);
                    }
                } catch (android.content.res.Resources.NotFoundException e) {
                    throw e;
                } catch (java.lang.RuntimeException unused) {
                    try {
                        animatorLoadAnimator = android.animation.AnimatorInflater.loadAnimator(context, iCl);
                        if (animatorLoadAnimator != null) {
                            return new se(animatorLoadAnimator);
                        }
                    } catch (java.lang.RuntimeException e2) {
                        if (zEquals) {
                            throw e2;
                        }
                        android.view.animation.Animation animationLoadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(context, iCl);
                        if (animationLoadAnimation2 != null) {
                            return new se(animationLoadAnimation2);
                        }
                    }
                }
            } else {
                animatorLoadAnimator = android.animation.AnimatorInflater.loadAnimator(context, iCl);
                if (animatorLoadAnimator != null) {
                    return new se(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    public static java.util.List aY(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return defpackage.afce.a;
        }
        if (size != 1) {
            java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(list));
            listUnmodifiableList.getClass();
            return listUnmodifiableList;
        }
        java.util.List listSingletonList = java.util.Collections.singletonList(defpackage.afga.az(list));
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static java.util.Map aZ(java.util.Map map) {
        int size = map.size();
        if (size == 0) {
            return defpackage.afcf.a;
        }
        if (size != 1) {
            java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(new java.util.LinkedHashMap(map));
            mapUnmodifiableMap.getClass();
            return mapUnmodifiableMap;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) defpackage.afga.ay(map.entrySet());
        java.util.Map mapSingletonMap = java.util.Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static /* synthetic */ int aa(int i, int i2, int i3) {
        return (i2 < 0 ? i >> (-i2) : i << i2) + i3;
    }

    public static /* synthetic */ int ab(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 3) {
            return 0;
        }
        if (i == 5) {
            return 1;
        }
        throw new java.lang.IllegalArgumentException(bo(i, "Unsupported stream type "));
    }

    public static /* synthetic */ defpackage.afbk ac(gfa gfaVar, uv uvVar) {
        ghk ghkVarL = gfaVar.l(ghk.class);
        if (ghkVarL != null) {
            ghkVarL.g(gsv.c);
        }
        gdd.i(gfaVar, uvVar);
        return defpackage.afbk.a;
    }

    public static /* synthetic */ gah ad(defpackage.bys bysVar) {
        return (gah) bysVar.a();
    }

    public static /* synthetic */ gcw ae(defpackage.bys bysVar) {
        return (gcw) bysVar.a();
    }

    public static /* synthetic */ defpackage.afbk af(java.util.List list, defpackage.cuw cuwVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cuwVar.x((defpackage.cux) list.get(i), 0, 0);
        }
        return defpackage.afbk.a;
    }

    public static /* synthetic */ long ag(float f, float f2) {
        return (((long) java.lang.Float.floatToRawIntBits(f2)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32);
    }

    public static /* synthetic */ long ah(long j, long j2) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) + java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static /* synthetic */ int ai(android.content.Context context) {
        if (context == null || android.os.Build.VERSION.SDK_INT < 31 || a$.ExternalSyntheticApiModelOutline0.m(context.getResources().getConfiguration()) == Integer.MAX_VALUE) {
            return 0;
        }
        return a$.ExternalSyntheticApiModelOutline0.m(context.getResources().getConfiguration());
    }

    public static /* synthetic */ defpackage.afbk aj(defpackage.cux cuxVar, defpackage.cuw cuwVar) {
        cuwVar.r(cuxVar, 0, 0, 0.0f);
        return defpackage.afbk.a;
    }

    public static /* synthetic */ void ak(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.NullPointerException(str);
        }
    }

    public static /* synthetic */ void al(java.lang.String str) {
        throw new java.lang.IllegalStateException(bp(str, "CompositionLocal ", " not present"));
    }

    public static /* synthetic */ void am(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int next = xmlPullParser.next();
        while (next != 2) {
            if (next == 1) {
                throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
            }
            next = xmlPullParser.next();
        }
    }

    public static /* synthetic */ boolean an(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static /* synthetic */ int ao(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static /* synthetic */ int ap(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 2 ? 0 : 4;
        }
        return 3;
    }

    public static /* synthetic */ int aq(int i) {
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

    public static /* synthetic */ int ar(int i) {
        switch (i) {
            case defpackage.abnt.b /* 0 */:
                return 1;
            case 1:
                return 2;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return 3;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return 4;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return 5;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return 6;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return 7;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int as(int i) {
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

    public static /* synthetic */ int at(int i) {
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

    public static /* synthetic */ int au(int i) {
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

    public static /* synthetic */ int av(int i) {
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

    public static /* synthetic */ int aw(int i) {
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

    public static /* synthetic */ int ax(int i) {
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

    public static /* synthetic */ int ay(int i) {
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

    public static /* synthetic */ int az(int i) {
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

    public static /* synthetic */ boolean b(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 1) {
            return xmlPullParser.getDepth() <= 0 && xmlPullParser.getEventType() == 3;
        }
        return true;
    }

    public static /* synthetic */ java.lang.String bA(java.lang.String str, java.lang.String str2) {
        return str2 + str;
    }

    public static /* synthetic */ java.lang.String bB(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return str3 + str2 + str4 + str + str5;
    }

    public static /* synthetic */ java.lang.String bF(float f, java.lang.String str) {
        return str + f;
    }

    public static /* synthetic */ java.lang.String bH(long j, java.lang.String str, java.lang.String str2) {
        return str + j + str2;
    }

    public static /* synthetic */ java.lang.String bI(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str2 + str3 + str;
    }

    public static /* synthetic */ java.lang.String bJ(java.lang.String str, java.lang.String str2) {
        return str + str2;
    }

    public static /* synthetic */ java.lang.String bK(java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.String str2) {
        return str + java.lang.String.valueOf(obj2) + str2 + java.lang.String.valueOf(obj);
    }

    public static /* synthetic */ java.lang.String bL(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return str3 + str2 + str4 + str;
    }

    public static /* synthetic */ java.lang.String bM(long j, java.lang.String str) {
        return str + j;
    }

    public static /* synthetic */ java.lang.String bQ(boolean z, java.lang.String str) {
        return str + z;
    }

    public static /* synthetic */ java.lang.String bU(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        return str + java.lang.String.valueOf(obj) + str2;
    }

    public static /* synthetic */ java.lang.String bV(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        return str + obj.toString() + str2;
    }

    public static /* synthetic */ java.lang.String bW(java.lang.Object obj, java.lang.String str) {
        return str + obj.toString();
    }

    public static /* synthetic */ java.lang.String bX(java.lang.Object obj, java.lang.String str) {
        return str + java.lang.String.valueOf(obj);
    }

    public static /* synthetic */ java.lang.String bY(char c, java.lang.String str, java.lang.String str2) {
        return str + c + str2;
    }

    public static int ba(android.graphics.Bitmap bitmap) {
        int i;
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (java.lang.Exception unused) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                android.graphics.Bitmap.Config config = bitmap.getConfig();
                if (config == android.graphics.Bitmap.Config.ALPHA_8) {
                    i = 1;
                } else if (config == android.graphics.Bitmap.Config.RGB_565 || config == android.graphics.Bitmap.Config.ARGB_4444) {
                    i = 2;
                } else {
                    i = config == a$.ExternalSyntheticApiModelOutline1.m$1() ? 8 : 4;
                }
                return width * i;
            }
        }
        throw new java.lang.IllegalStateException("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig());
    }

    public static android.graphics.Bitmap.Config bb(android.graphics.Bitmap bitmap) {
        android.graphics.Bitmap.Config config = bitmap.getConfig();
        return config == null ? android.graphics.Bitmap.Config.ARGB_8888 : config;
    }

    public static android.graphics.Bitmap.Config bc(android.graphics.Bitmap.Config config) {
        return bd(config) ? android.graphics.Bitmap.Config.ARGB_8888 : config;
    }

    public static boolean bd(android.graphics.Bitmap.Config config) {
        return config == a$.ExternalSyntheticApiModelOutline1.m();
    }

    public static fre be(ajoa ajoaVar, android.content.Context context) {
        return new frg(ajoaVar, fug.a(context), (defpackage.a) null);
    }

    public static fre bf(ajor ajorVar, ajof ajofVar, java.lang.String str, java.io.Closeable closeable) {
        ajofVar.getClass();
        return new frd(ajorVar, ajofVar, str, closeable);
    }

    public static boolean bg(java.lang.String str) {
        return afzh.R("Content-Length", str) || afzh.R("Content-Encoding", str) || afzh.R("Content-Type", str);
    }

    public static boolean bh(java.lang.String str) {
        return (afzh.R("Connection", str) || afzh.R("Keep-Alive", str) || afzh.R("Proxy-Authenticate", str) || afzh.R("Proxy-Authorization", str) || afzh.R("TE", str) || afzh.R("Trailers", str) || afzh.R("Transfer-Encoding", str) || afzh.R("Upgrade", str)) ? false : true;
    }

    public static double bi(int i, int i2, int i3, int i4, int i5) {
        double d = i2;
        double d2 = ((double) i3) / ((double) i);
        double d3 = ((double) i4) / d;
        return i5 + (-1) != 0 ? java.lang.Math.min(d2, d3) : java.lang.Math.max(d2, d3);
    }

    public static fre bj(ajoa ajoaVar, android.content.Context context, defpackage.a aVar) {
        return new frg(ajoaVar, fug.a(context), aVar);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0008  */
    /* JADX WARN: Code duplicated, block: B:53:0x00db  */
    public static defpackage.kqe bk(ajjc ajjcVar, fsu fsuVar, java.util.Date date, java.lang.String str, java.util.Date date2, java.lang.String str2, java.util.Date date3, long j, long j2, java.lang.String str3, int i) {
        long millis;
        java.lang.String string;
        long time;
        java.lang.String str4;
        fsu fsuVar2;
        int i2;
        ajjc ajjcVar2 = ajjcVar;
        if (fsuVar != null && (!ajjcVar2.c() || fsuVar.c)) {
            ajif ajifVarA = fsuVar.a();
            if (ajjcVar2.b().d || fsuVar.a().d || defpackage.afga.f(fsuVar.d.b("Vary"), "*")) {
                fsuVar2 = null;
            } else {
                ajif ajifVarB = ajjcVar2.b();
                if (ajifVarB.c) {
                    fsuVar2 = null;
                } else {
                    java.lang.String str5 = "If-Modified-Since";
                    if (ajjcVar2.a("If-Modified-Since") == null && ajjcVar2.a("If-None-Match") == null) {
                        long jMax = date != null ? java.lang.Math.max(0L, j2 - date.getTime()) : 0L;
                        if (i != -1) {
                            jMax = java.lang.Math.max(jMax, java.util.concurrent.TimeUnit.SECONDS.toMillis(i));
                        }
                        long j3 = j2 - j;
                        long jLongValue = ((java.lang.Number) ful.a.invoke()).longValue() - j2;
                        int i3 = fsuVar.a().e;
                        if (i3 != -1) {
                            millis = 0;
                            time = java.util.concurrent.TimeUnit.SECONDS.toMillis(i3);
                        } else {
                            millis = 0;
                            if (date3 != null) {
                                time = date3.getTime() - (date != null ? date.getTime() : j2);
                                if (time <= 0) {
                                    time = 0;
                                }
                            } else if (date2 == null) {
                                time = 0;
                            } else {
                                java.util.List list = ajjcVar2.a.d;
                                if (list == null) {
                                    string = null;
                                } else {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    aike.b(list, sb);
                                    string = sb.toString();
                                }
                                if (string != null) {
                                    time = 0;
                                } else {
                                    long time2 = (date != null ? date.getTime() : j) - date2.getTime();
                                    if (time2 > 0) {
                                        time = time2 / 10;
                                    } else {
                                        time = 0;
                                    }
                                }
                            }
                        }
                        int i4 = ajifVarB.e;
                        if (i4 != -1) {
                            time = java.lang.Math.min(time, java.util.concurrent.TimeUnit.SECONDS.toMillis(i4));
                        }
                        int i5 = ajifVarB.k;
                        long millis2 = i5 != -1 ? java.util.concurrent.TimeUnit.SECONDS.toMillis(i5) : millis;
                        if (!ajifVarA.i && (i2 = ajifVarB.j) != -1) {
                            millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(i2);
                        }
                        if (ajifVarA.c || jMax + j3 + jLongValue + millis2 >= time + millis) {
                            if (str3 != null) {
                                str4 = str3;
                                str5 = "If-None-Match";
                            } else if (date2 != null) {
                                str2.getClass();
                                str4 = str2;
                            } else {
                                if (date != null) {
                                    str.getClass();
                                    str4 = str;
                                }
                                fsuVar2 = null;
                            }
                            ajjb ajjbVar = new ajjb(ajjcVar2);
                            str4.getClass();
                            ajjbVar.d.ac(str5, str4);
                            return new defpackage.kqe(new ajjc(ajjbVar), fsuVar);
                        }
                        fsuVar2 = fsuVar;
                        ajjcVar2 = null;
                    } else {
                        fsuVar2 = null;
                    }
                }
            }
        } else {
            fsuVar2 = null;
        }
        return new defpackage.kqe(ajjcVar2, fsuVar2);
    }

    public static /* synthetic */ java.lang.String bl(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        return str + obj + str2;
    }

    public static /* synthetic */ java.lang.String bm(int i, java.lang.String str, java.lang.String str2) {
        return str + i + str2;
    }

    public static /* synthetic */ java.lang.String bn(int i, int i2, java.lang.String str, java.lang.String str2) {
        return str + i2 + str2 + i;
    }

    public static /* synthetic */ java.lang.String bo(int i, java.lang.String str) {
        return str + i;
    }

    public static /* synthetic */ java.lang.String bp(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str2 + str + str3;
    }

    public static /* synthetic */ java.lang.String bq(int i, int i2, int i3, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str + i3 + str2 + i2 + str3 + i;
    }

    public static /* synthetic */ java.lang.String bs(java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.String str2) {
        return str + obj2 + str2 + obj;
    }

    public static /* synthetic */ java.lang.String bv(java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str + obj2 + str2 + obj + str3;
    }

    public static /* synthetic */ java.lang.String bw(java.lang.String str, android.util.AttributeSet attributeSet, java.lang.String str2) {
        return attributeSet.getPositionDescription() + str2 + str;
    }

    public static /* synthetic */ java.lang.String bx(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str2 + str + str3 + obj;
    }

    public static /* synthetic */ java.lang.String by(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str2 + str + str3 + i;
    }

    public static /* synthetic */ java.lang.String bz(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str + i2 + str2 + i + str3;
    }

    public static /* synthetic */ defpackage.afbk c(java.util.List list, defpackage.cuw cuwVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cuwVar.r((defpackage.cux) list.get(i), 0, 0, 0.0f);
        }
        return defpackage.afbk.a;
    }

    public static /* synthetic */ java.lang.String cb(android.os.Message message, java.lang.String str) {
        return str + message.what;
    }

    public static /* synthetic */ java.lang.String ce(java.lang.String str) {
        return java.lang.System.currentTimeMillis() + str + java.lang.Math.abs(new java.security.SecureRandom().nextLong());
    }

    public static /* synthetic */ java.lang.String cj(byte b, java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.String str2) {
        return str + obj2 + str2 + obj + ((char) b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.String ck(java.lang.Object obj, int i) {
        return "Callable expects " + afyf.getArity(obj) + " arguments, but " + i + " were provided.";
    }

    private static int cl(android.content.Context context, int i) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static /* synthetic */ void d(java.io.Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception unused) {
        }
    }

    public static /* synthetic */ int e(boolean z) {
        return z ? 1231 : 1237;
    }

    public static /* synthetic */ int f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ boolean g(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.Object obj, java.lang.Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean h(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean i(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void j(java.lang.Appendable appendable, java.lang.Object obj, defpackage.affc affcVar) throws java.io.IOException {
        if (affcVar != null) {
            appendable.append((java.lang.CharSequence) affcVar.invoke(obj));
            return;
        }
        if (obj == null || (obj instanceof java.lang.CharSequence)) {
            appendable.append((java.lang.CharSequence) obj);
        } else if (obj instanceof java.lang.Character) {
            appendable.append(((java.lang.Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static /* synthetic */ void k(java.util.concurrent.ExecutorService executorService) {
        if (executorService == a$.ExternalSyntheticApiModelOutline2.m() || executorService.isTerminated()) {
            return;
        }
        executorService.shutdown();
        boolean zAwaitTermination = false;
        boolean z = false;
        while (!zAwaitTermination) {
            try {
                zAwaitTermination = executorService.awaitTermination(1L, java.util.concurrent.TimeUnit.DAYS);
            } catch (java.lang.InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                }
                z = true;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ boolean l() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ void m() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ boolean n(long j, int i) {
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

    public static /* synthetic */ boolean o(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.Object obj) {
        while (!atomicReference.compareAndSet(null, obj)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean p(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.Object obj) {
        while (!atomicReference.compareAndSet(obj, null)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ int q(double d) {
        if (d < 0.0d) {
            return -1;
        }
        return d == 0.0d ? 0 : 1;
    }

    public static /* synthetic */ double[] r(double[] dArr, double[][] dArr2) {
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

    public static /* synthetic */ double s(double d) {
        return d > 0.008856451679035631d ? java.lang.Math.pow(d, 0.3333333333333333d) : ((d * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    public static /* synthetic */ double t(double d) {
        double d2 = d * d * d;
        return d2 > 0.008856451679035631d ? d2 : ((d * 116.0d) - 16.0d) / 903.2962962962963d;
    }

    public static /* synthetic */ double u(int i) {
        double d = ((double) i) / 255.0d;
        return (d <= 0.040449936d ? d / 12.92d : java.lang.Math.pow((d + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    public static /* synthetic */ double v(double d) {
        double d2 = d / 100.0d;
        return (d2 <= 0.0031308d ? d2 * 12.92d : (java.lang.Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    public static /* synthetic */ boolean w(double d) {
        return d >= 0.0d && d <= 100.0d;
    }

    public static /* synthetic */ double[] x(double[] dArr, double d, double[] dArr2) {
        double d2 = dArr[0];
        double d3 = d2 + ((dArr2[0] - d2) * d);
        double d4 = dArr[1];
        double d5 = d4 + ((dArr2[1] - d4) * d);
        double d6 = dArr[2];
        return new double[]{d3, d5, d6 + ((dArr2[2] - d6) * d)};
    }

    public static /* synthetic */ double[] y(double[] dArr, double[] dArr2) {
        return new double[]{(dArr[0] + dArr2[0]) / 2.0d, (dArr[1] + dArr2[1]) / 2.0d, (dArr[2] + dArr2[2]) / 2.0d};
    }

    public static /* synthetic */ long z(long j, long j2) {
        boolean z = (j ^ j2) < 0;
        long j3 = j2 + j;
        if (z || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new java.lang.ArithmeticException();
    }

    public a(char[] cArr) {
    }
}
