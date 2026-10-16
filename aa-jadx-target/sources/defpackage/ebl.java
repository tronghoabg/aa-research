package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ebl {
    public ebl() {
    }

    public static defpackage.edf c(android.view.View view, defpackage.edf edfVar, android.graphics.Rect rect) {
        android.view.WindowInsets windowInsetsE = edfVar.e();
        if (windowInsetsE != null) {
            return defpackage.edf.q(view.computeSystemWindowInsets(windowInsetsE, rect), view);
        }
        rect.setEmpty();
        return edfVar;
    }

    static void d(android.view.WindowInsets windowInsets, android.view.View view) {
        android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (android.view.View.OnApplyWindowInsetsListener) view.getTag(2131429720);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static void e(android.view.View view, defpackage.eap eapVar) {
        defpackage.ebk ebkVar = eapVar != null ? new defpackage.ebk(view, eapVar) : null;
        if (android.os.Build.VERSION.SDK_INT < 30) {
            view.setTag(2131429710, ebkVar);
        }
        if (view.getTag(2131429708) != null) {
            return;
        }
        if (ebkVar != null) {
            view.setOnApplyWindowInsetsListener(ebkVar);
        } else {
            view.setOnApplyWindowInsetsListener((android.view.View.OnApplyWindowInsetsListener) view.getTag(2131429720));
        }
    }

    public static int f(android.content.res.Resources resources, int i, dzu dzuVar, int i2) {
        int dimensionPixelSize;
        if (i != -1) {
            return (i == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i)) < 0) ? i2 : dimensionPixelSize;
        }
        return ((java.lang.Integer) dzuVar.a()).intValue();
    }

    public static boolean g(int i, int i2, int i3) {
        android.view.InputDevice device = android.view.InputDevice.getDevice(i);
        return (device == null || device.getMotionRange(i2, i3) == null) ? false : true;
    }

    public static void i(android.view.View view) {
        java.util.Iterator itA = new defpackage.afcb(new niz(view, (defpackage.afdk) null, 1), 3).a();
        while (itA.hasNext()) {
            x((android.view.View) itA.next()).x();
        }
    }

    public static defpackage.ers j(defpackage.erw erwVar, defpackage.afie afieVar, defpackage.esi esiVar) {
        try {
            try {
                return erwVar.c(afieVar, esiVar);
            } catch (java.lang.AbstractMethodError unused) {
                java.lang.Class<?> jClass = ((defpackage.affr) afieVar).getJClass();
                jClass.getClass();
                return erwVar.b(jClass, esiVar);
            }
        } catch (java.lang.AbstractMethodError unused2) {
            java.lang.Class<?> jClass2 = ((defpackage.affr) afieVar).getJClass();
            jClass2.getClass();
            return erwVar.a(jClass2);
        }
    }

    public static defpackage.ers k(java.lang.Class cls) throws java.lang.reflect.InvocationTargetException {
        try {
            java.lang.reflect.Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!java.lang.reflect.Modifier.isPublic(declaredConstructor.getModifiers())) {
                java.util.Objects.toString(cls);
                throw new java.lang.RuntimeException("Cannot create an instance of ".concat(cls.toString()));
            }
            try {
                java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (defpackage.ers) objNewInstance;
            } catch (java.lang.IllegalAccessException e) {
                java.util.Objects.toString(cls);
                throw new java.lang.RuntimeException("Cannot create an instance of ".concat(cls.toString()), e);
            } catch (java.lang.InstantiationException e2) {
                java.util.Objects.toString(cls);
                throw new java.lang.RuntimeException("Cannot create an instance of ".concat(cls.toString()), e2);
            }
        } catch (java.lang.NoSuchMethodException e3) {
            java.util.Objects.toString(cls);
            throw new java.lang.RuntimeException("Cannot create an instance of ".concat(cls.toString()), e3);
        }
    }

    public static defpackage.ers l(defpackage.afie afieVar, defpackage.esa esaVar, java.lang.String str, defpackage.erw erwVar, defpackage.esi esiVar) {
        if (erwVar == null) {
            erwVar = defpackage.edd.e(esaVar);
        }
        defpackage.ery eryVarE = defpackage.ebq.e(esaVar, erwVar, esiVar);
        if (str == null) {
            return eryVarE.b(afieVar);
        }
        afieVar.getClass();
        return eryVarE.b.w(afieVar, str);
    }

    public static defpackage.eas m(android.view.Display display, int i) {
        android.view.RoundedCorner roundedCornerM;
        int i2;
        if (android.os.Build.VERSION.SDK_INT < 31 || (roundedCornerM = a$.ExternalSyntheticApiModelOutline0.m(display, i)) == null) {
            return null;
        }
        int iM$1 = a$.ExternalSyntheticApiModelOutline0.m$1(roundedCornerM);
        if (iM$1 != 0) {
            i2 = 1;
            if (iM$1 != 1) {
                i2 = 2;
                if (iM$1 != 2) {
                    i2 = 3;
                    if (iM$1 != 3) {
                        throw new java.lang.IllegalArgumentException(defpackage.a.bo(iM$1, "Invalid position: "));
                    }
                }
            }
        } else {
            i2 = 0;
        }
        int iM = a$.ExternalSyntheticApiModelOutline0.m(roundedCornerM);
        android.graphics.Point pointM = a$.ExternalSyntheticApiModelOutline0.m(roundedCornerM);
        return new defpackage.eas(i2, iM, pointM.x, pointM.y);
    }

    public static void n(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException((java.lang.String) obj);
        }
    }

    public static void o(boolean z, java.lang.String str) {
        if (!z) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    public static void p(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static void q(java.lang.Object obj) {
        obj.getClass();
    }

    public static void r(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.NullPointerException((java.lang.String) obj2);
        }
    }

    public static void s(java.lang.Object obj) {
        obj.getClass();
    }

    public static defpackage.dwh t(android.content.res.Configuration configuration) {
        return new defpackage.dwh(new defpackage.dwi(a$.ExternalSyntheticApiModelOutline2.m(configuration)));
    }

    public static android.os.Bundle u(defpackage.afau... afauVarArr) {
        afauVarArr.getClass();
        android.os.Bundle bundle = new android.os.Bundle(afauVarArr.length);
        for (defpackage.afau afauVar : afauVarArr) {
            java.lang.String str = (java.lang.String) afauVar.a;
            java.lang.Object obj = afauVar.b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof java.lang.Boolean) {
                bundle.putBoolean(str, ((java.lang.Boolean) obj).booleanValue());
            } else if (obj instanceof java.lang.Byte) {
                bundle.putByte(str, ((java.lang.Number) obj).byteValue());
            } else if (obj instanceof java.lang.Character) {
                bundle.putChar(str, ((java.lang.Character) obj).charValue());
            } else if (obj instanceof java.lang.Double) {
                bundle.putDouble(str, ((java.lang.Number) obj).doubleValue());
            } else if (obj instanceof java.lang.Float) {
                bundle.putFloat(str, ((java.lang.Number) obj).floatValue());
            } else if (obj instanceof java.lang.Integer) {
                bundle.putInt(str, ((java.lang.Number) obj).intValue());
            } else if (obj instanceof java.lang.Long) {
                bundle.putLong(str, ((java.lang.Number) obj).longValue());
            } else if (obj instanceof java.lang.Short) {
                bundle.putShort(str, ((java.lang.Number) obj).shortValue());
            } else if (obj instanceof android.os.Bundle) {
                bundle.putBundle(str, (android.os.Bundle) obj);
            } else if (obj instanceof java.lang.CharSequence) {
                bundle.putCharSequence(str, (java.lang.CharSequence) obj);
            } else if (obj instanceof android.os.Parcelable) {
                bundle.putParcelable(str, (android.os.Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof java.lang.Object[]) {
                java.lang.Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (android.os.Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (android.os.Parcelable[]) obj);
                } else if (java.lang.String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (java.lang.String[]) obj);
                } else if (java.lang.CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (java.lang.CharSequence[]) obj);
                } else {
                    if (!java.io.Serializable.class.isAssignableFrom(componentType)) {
                        throw new java.lang.IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + "\"");
                    }
                    bundle.putSerializable(str, (java.io.Serializable) obj);
                }
            } else if (obj instanceof java.io.Serializable) {
                bundle.putSerializable(str, (java.io.Serializable) obj);
            } else if (obj instanceof android.os.IBinder) {
                bundle.putBinder(str, (android.os.IBinder) obj);
            } else if (obj instanceof android.util.Size) {
                bundle.putSize(str, (android.util.Size) obj);
            } else {
                if (!(obj instanceof android.util.SizeF)) {
                    throw new java.lang.IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + "\"");
                }
                bundle.putSizeF(str, (android.util.SizeF) obj);
            }
        }
        return bundle;
    }

    public static java.lang.Object v(android.os.Bundle bundle, java.lang.String str, java.lang.Class cls) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return ag$.ExternalSyntheticApiModelOutline0.m(bundle, str, cls);
        }
        android.os.Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static java.util.ArrayList w(android.os.Bundle bundle, java.lang.String str, java.lang.Class cls) {
        return android.os.Build.VERSION.SDK_INT >= 34 ? ag$.ExternalSyntheticApiModelOutline0.m(bundle, str, cls) : bundle.getParcelableArrayList(str);
    }

    public static defpackage.ldx x(android.view.View view) {
        defpackage.ldx ldxVar = (defpackage.ldx) view.getTag(2131429193);
        if (ldxVar != null) {
            return ldxVar;
        }
        defpackage.ldx ldxVar2 = new defpackage.ldx((byte[]) null, (char[]) null);
        view.setTag(2131429193, ldxVar2);
        return ldxVar2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:24:0x0061->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0080 -> B:24:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0083 -> B:24:0x0061). Please report as a decompilation issue!!! */
    public final java.lang.Object h(java.util.List list, efk efkVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.efc efcVar;
        ?? r6;
        defpackage.afgv afgvVar;
        ?? it;
        java.lang.Throwable th;
        defpackage.affc affcVar;
        if (afdkVar instanceof defpackage.efc) {
            efcVar = (defpackage.efc) afdkVar;
            int i = efcVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                efcVar.d = i - Integer.MIN_VALUE;
            } else {
                efcVar = new defpackage.efc(this, afdkVar);
            }
        } else {
            efcVar = new defpackage.efc(this, afdkVar);
        }
        java.lang.Object obj = efcVar.c;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = efcVar.d;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            defpackage.efe efeVar = new defpackage.efe(list, arrayList, null);
            efcVar.a = arrayList;
            efcVar.d = 1;
            if (efkVar.a(efeVar, efcVar) != afdrVar) {
                r6 = arrayList;
            }
            return afdrVar;
        }
        if (i2 == 1) {
            java.lang.Object obj2 = efcVar.a;
            defpackage.afga.cz(obj);
            r6 = obj2;
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = efcVar.b;
            afgvVar = efcVar.e;
            try {
                defpackage.afga.cz(obj);
                it = it;
            } catch (java.lang.Throwable th2) {
                java.lang.Object obj3 = afgvVar.a;
                if (obj3 == null) {
                    afgvVar.a = th2;
                    it = it;
                } else {
                    defpackage.adrs.E((java.lang.Throwable) obj3, th2);
                    it = it;
                }
            }
        }
        while (it.hasNext()) {
            affcVar = (defpackage.affc) it.next();
            efcVar.a = null;
            efcVar.e = afgvVar;
            efcVar.b = it;
            efcVar.d = 2;
            if (affcVar.invoke(efcVar) == afdrVar) {
                return afdrVar;
            }
        }
        th = (java.lang.Throwable) afgvVar.a;
        if (th == null) {
            return defpackage.afbk.a;
        }
        throw th;
        afgvVar = new defpackage.afgv();
        it = r6.iterator();
        while (it.hasNext()) {
            affcVar = (defpackage.affc) it.next();
            efcVar.a = null;
            efcVar.e = afgvVar;
            efcVar.b = it;
            efcVar.d = 2;
            if (affcVar.invoke(efcVar) == afdrVar) {
                return afdrVar;
            }
        }
        th = (java.lang.Throwable) afgvVar.a;
        if (th == null) {
            return defpackage.afbk.a;
        }
        throw th;
    }

    public ebl(char[] cArr) {
    }

    public void a(int i) {
    }

    public void b(android.graphics.Typeface typeface) {
    }
}
