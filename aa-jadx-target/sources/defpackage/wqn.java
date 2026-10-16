package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class wqn {
    public static defpackage.wqn a;

    public static /* synthetic */ java.lang.String A(int i) {
        switch (i) {
            case 32769:
                return "CAR_CONTROL_SET_CAR_PROPERTY_VALUE_REQUEST";
            case 32770:
                return "CAR_CONTROL_SET_CAR_PROPERTY_VALUE_RESPONSE";
            case 32771:
                return "CAR_CONTROL_REGISTER_CAR_PROPERTY_LISTENERS_REQUEST";
            case 32772:
                return "CAR_CONTROL_REGISTER_CAR_PROPERTY_LISTENERS_RESPONSE";
            case 32773:
                return "CAR_CONTROL_CAR_PROPERTY_CHANGE_EVENT";
            case 32774:
                return "CAR_CONTROL_CAR_ACTION_NOTIFICATION";
            default:
                return "CAR_CONTROL_CAR_CONTROL_GROUP_UPDATE";
        }
    }

    public static int B(int i) {
        switch (i) {
            case 32769:
                return 32769;
            case 32770:
                return 32770;
            case 32771:
                return 32771;
            case 32772:
                return 32772;
            case 32773:
                return 32773;
            case 32774:
                return 32774;
            case 32775:
                return 32775;
            default:
                return 0;
        }
    }

    public static final /* synthetic */ odn C(defpackage.abor aborVar) {
        aborVar.getClass();
        return new odn(aborVar);
    }

    private static float D(java.lang.String[] strArr, int i) {
        float f = java.lang.Float.parseFloat(strArr[i]);
        if (f < 0.0f || f > 1.0f) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bF(f, "Motion easing control point value must be between 0 and 1; instead got: "));
        }
        return f;
    }

    private static java.lang.String E(java.lang.String str, java.lang.String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static boolean F(java.lang.String str, java.lang.String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static void a(android.view.Window window, boolean z) {
        edk edjVar;
        defpackage.erh erhVar = new defpackage.erh(window.getDecorView(), (byte[]) null);
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            edjVar = new edk(window);
        } else {
            edjVar = android.os.Build.VERSION.SDK_INT >= 30 ? new defpackage.edj(window) : new edi(window, erhVar);
        }
        defpackage.ebs.d(z, edjVar);
    }

    public static boolean b(boolean z) {
        return defpackage.sqs.bB(0) || z;
    }

    public static android.animation.TimeInterpolator c(android.content.Context context, int i, android.animation.TimeInterpolator timeInterpolator) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new java.lang.IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        java.lang.String strValueOf = java.lang.String.valueOf(typedValue.string);
        if (!F(strValueOf, "cubic-bezier") && !F(strValueOf, "path")) {
            return android.view.animation.AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!F(strValueOf, "cubic-bezier")) {
            if (F(strValueOf, "path")) {
                return new android.view.animation.PathInterpolator(dtk.b(E(strValueOf, "path")));
            }
            throw new java.lang.IllegalArgumentException("Invalid motion easing type: ".concat(java.lang.String.valueOf(strValueOf)));
        }
        java.lang.String[] strArrSplit = E(strValueOf, "cubic-bezier").split(",");
        int length = strArrSplit.length;
        if (length == 4) {
            return new android.view.animation.PathInterpolator(D(strArrSplit, 0), D(strArrSplit, 1), D(strArrSplit, 2), D(strArrSplit, 3));
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bo(length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: "));
    }

    public static emw d(android.content.Context context, int i) {
        android.util.TypedValue typedValueBn = defpackage.sqs.bn(context, 2130970020);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = typedValueBn == null ? context.obtainStyledAttributes(null, wsi.a, 0, i) : context.obtainStyledAttributes(typedValueBn.resourceId, wsi.a);
        emw emwVar = new emw();
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new java.lang.IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new java.lang.IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            emwVar.e(f);
            emwVar.c(f2);
            typedArrayObtainStyledAttributes.recycle();
            return emwVar;
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static float e(android.content.Context context, int i) {
        return android.util.TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static android.graphics.Rect f(android.view.View view, android.view.View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i3 = i - iArr2[0];
        int i4 = i2 - iArr2[1];
        return new android.graphics.Rect(i3, i4, view2.getWidth() + i3, view2.getHeight() + i4);
    }

    public static android.view.inputmethod.InputMethodManager g(android.view.View view) {
        return (android.view.inputmethod.InputMethodManager) view.getContext().getSystemService(android.view.inputmethod.InputMethodManager.class);
    }

    public static java.lang.Integer h(android.view.View view) {
        android.content.res.ColorStateList colorStateListB = defpackage.wpv.b(view.getBackground());
        if (colorStateListB != null) {
            return java.lang.Integer.valueOf(colorStateListB.getDefaultColor());
        }
        return null;
    }

    public static void i(android.view.View view, wrs wrsVar) {
        defpackage.wrq wrqVar = new defpackage.wrq(wrsVar, new defpackage.wrt(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom()));
        int[] iArr = defpackage.ebt.a;
        defpackage.ebl.e(view, wrqVar);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new wrr());
        }
    }

    public static boolean j(android.view.View view) {
        return view.getLayoutDirection() == 1;
    }

    public static android.graphics.Rect k(android.view.View view) {
        return new android.graphics.Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static void l(android.view.inputmethod.InputConnection inputConnection, xfd xfdVar) {
        if (xfdVar.h()) {
            return;
        }
        java.lang.String strE = xfdVar.e();
        if (strE != null) {
            inputConnection.commitText(strE, 1);
        }
        xfdVar.f();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:102:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:104:0x01af  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:110:0x01df  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:122:0x0218  */
    /* JADX WARN: Code duplicated, block: B:124:0x021d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x0102  */
    /* JADX WARN: Code duplicated, block: B:79:0x010a  */
    /* JADX WARN: Code duplicated, block: B:80:0x010f  */
    /* JADX WARN: Code duplicated, block: B:82:0x011c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0124  */
    /* JADX WARN: Code duplicated, block: B:85:0x0129  */
    /* JADX WARN: Code duplicated, block: B:87:0x0136  */
    /* JADX WARN: Code duplicated, block: B:89:0x013e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0143  */
    /* JADX WARN: Code duplicated, block: B:92:0x0150  */
    /* JADX WARN: Code duplicated, block: B:93:0x0169  */
    /* JADX WARN: Code duplicated, block: B:95:0x0171  */
    /* JADX WARN: Code duplicated, block: B:96:0x0179  */
    /* JADX WARN: Code duplicated, block: B:97:0x0186  */
    /* JADX WARN: Code duplicated, block: B:99:0x019d  */
    public static void m(android.view.inputmethod.InputConnection inputConnection, xfd xfdVar, int i, boolean z, boolean z2) {
        java.lang.String strValueOf;
        java.lang.String strValueOf2;
        boolean z3;
        int[] iArr;
        int iC;
        int[] iArr2;
        int iC2;
        int iC3;
        int[] iArr3;
        int iC4;
        int[] iArr4;
        int i2;
        int[] iArr5;
        int iC5;
        int[] iArr6;
        int[] iArr7;
        int i3;
        if (z && z2) {
            if (i == 12593) {
                i = 12594;
            } else if (i == 12599) {
                i = 12600;
            } else if (i == 12610) {
                i = 12611;
            } else if (i == 12613) {
                i = 12614;
            } else if (i == 12616) {
                i = 12617;
            } else if (i == 12624) {
                i = 12626;
            } else if (i == 12628) {
                i = 12630;
            }
        }
        inputConnection.beginBatchEdit();
        defpackage.ygw ygwVar = xfd.a;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (!ygwVar.contains(numValueOf)) {
            if (xfd.b.contains(numValueOf)) {
                z3 = true;
            } else {
                int i4 = xfdVar.e;
                java.lang.String str = (i4 != -1 ? java.lang.String.valueOf((char) i4) : "") + ((char) i);
                xfdVar.f();
                strValueOf = null;
                strValueOf2 = str;
            }
            if (strValueOf2 != null) {
                inputConnection.commitText(strValueOf2, 1);
            }
            if (strValueOf != null) {
                inputConnection.setComposingText(strValueOf, 1);
            }
            inputConnection.endBatchEdit();
        }
        z3 = false;
        int i5 = xfdVar.c;
        switch (i5) {
            case -1:
                if (true != z3) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                xfdVar.c = i5;
                switch (i5) {
                    case defpackage.abnt.b /* 0 */:
                        xfdVar.d[0] = i;
                        xfdVar.e = i;
                        iC3 = -1;
                        break;
                    case 1:
                        int[] iArr8 = xfdVar.d;
                        int iA = xfd.a(iArr8[0], i);
                        iArr8[0] = iA;
                        defpackage.ysr.bk(xfd.g(iA), "This character cannot form a consonant pair with the previous character");
                        xfdVar.e = iArr8[0];
                        iC3 = -1;
                        break;
                    case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                        iArr4 = xfdVar.d;
                        iArr4[1] = i;
                        i2 = iArr4[0];
                        if (i2 != -1) {
                            xfdVar.e = i;
                            iC3 = -1;
                        } else {
                            if (xfd.g(i2)) {
                                int[] iArrJ = xfd.j(i2);
                                iArr4[0] = iArrJ[1];
                                iC3 = iArrJ[0];
                            } else {
                                iC3 = -1;
                            }
                            xfdVar.e = xfdVar.c();
                        }
                        break;
                    case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                        iArr = xfdVar.d;
                        int iB = xfdVar.b(iArr[1], i);
                        iArr[1] = iB;
                        defpackage.ysr.bk(xfd.i(iB), "This character cannot form a vowel pair with the previous character");
                        if (iArr[0] != -1) {
                            iC = xfdVar.c();
                        } else {
                            iC = iArr[1];
                        }
                        xfdVar.e = iC;
                        iC3 = -1;
                        break;
                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                        iArr6 = xfdVar.d;
                        iArr6[2] = i;
                        if (iArr6[0] == -1) {
                            xfdVar.c = 0;
                            iC3 = iArr6[1];
                            iArr6[0] = i;
                            iArr6[1] = -1;
                            iArr6[2] = -1;
                            xfdVar.e = i;
                        } else {
                            xfdVar.e = xfdVar.c();
                            iC3 = -1;
                        }
                        break;
                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                        int[] iArr9 = xfdVar.d;
                        int iA2 = xfd.a(iArr9[2], i);
                        iArr9[2] = iA2;
                        defpackage.ysr.bk(xfd.g(iA2), "This character cannot form a consonant pair with the previous character");
                        xfdVar.e = xfdVar.c();
                        iC3 = -1;
                        break;
                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                        xfdVar.c = 0;
                        iArr2 = xfdVar.d;
                        if (iArr2[1] != -1) {
                            iC2 = xfdVar.c();
                        } else {
                            iC2 = iArr2[0];
                        }
                        iC3 = iC2;
                        iArr2[0] = i;
                        iArr2[1] = -1;
                        iArr2[2] = -1;
                        xfdVar.e = i;
                        break;
                    case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                        xfdVar.c = 0;
                        iArr5 = xfdVar.d;
                        if (iArr5[0] != -1) {
                            iC5 = xfdVar.c();
                        } else {
                            iC5 = iArr5[1];
                        }
                        iC3 = iC5;
                        iArr5[0] = i;
                        iArr5[1] = -1;
                        iArr5[2] = -1;
                        xfdVar.e = i;
                        break;
                    case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                        xfdVar.c = 2;
                        iArr3 = xfdVar.d;
                        if (iArr3[0] != -1) {
                            iC4 = xfdVar.c();
                        } else {
                            iC4 = iArr3[1];
                        }
                        iC3 = iC4;
                        iArr3[0] = -1;
                        iArr3[1] = i;
                        iArr3[2] = -1;
                        xfdVar.e = i;
                        break;
                    case 9:
                        xfdVar.c = 2;
                        iArr7 = xfdVar.d;
                        i3 = iArr7[2];
                        if (xfd.g(i3)) {
                            iArr7[2] = -1;
                            iC3 = xfdVar.c();
                            iArr7[0] = i3;
                            iArr7[1] = i;
                            xfdVar.e = xfdVar.c();
                        } else {
                            int[] iArrJ2 = xfd.j(i3);
                            iArr7[2] = iArrJ2[0];
                            iC3 = xfdVar.c();
                            iArr7[0] = iArrJ2[1];
                            iArr7[1] = i;
                            iArr7[2] = -1;
                            xfdVar.e = xfdVar.c();
                        }
                        break;
                    default:
                        iC3 = -1;
                        break;
                }
                break;
            case defpackage.abnt.b /* 0 */:
                if (!z3) {
                    if (xfd.a(xfdVar.d[0], i) != -1) {
                        i5 = 1;
                    } else {
                        i5 = 6;
                    }
                    xfdVar.c = i5;
                    switch (i5) {
                        case defpackage.abnt.b /* 0 */:
                            xfdVar.d[0] = i;
                            xfdVar.e = i;
                            iC3 = -1;
                            break;
                        case 1:
                            int[] iArr10 = xfdVar.d;
                            int iA3 = xfd.a(iArr10[0], i);
                            iArr10[0] = iA3;
                            defpackage.ysr.bk(xfd.g(iA3), "This character cannot form a consonant pair with the previous character");
                            xfdVar.e = iArr10[0];
                            iC3 = -1;
                            break;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            break;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            iArr = xfdVar.d;
                            int iB2 = xfdVar.b(iArr[1], i);
                            iArr[1] = iB2;
                            defpackage.ysr.bk(xfd.i(iB2), "This character cannot form a vowel pair with the previous character");
                            if (iArr[0] != -1) {
                                iC = xfdVar.c();
                            } else {
                                iC = iArr[1];
                            }
                            xfdVar.e = iC;
                            iC3 = -1;
                            break;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            iArr6 = xfdVar.d;
                            iArr6[2] = i;
                            if (iArr6[0] == -1) {
                                xfdVar.c = 0;
                                iC3 = iArr6[1];
                                iArr6[0] = i;
                                iArr6[1] = -1;
                                iArr6[2] = -1;
                                xfdVar.e = i;
                            } else {
                                xfdVar.e = xfdVar.c();
                                iC3 = -1;
                            }
                            break;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            int[] iArr11 = xfdVar.d;
                            int iA4 = xfd.a(iArr11[2], i);
                            iArr11[2] = iA4;
                            defpackage.ysr.bk(xfd.g(iA4), "This character cannot form a consonant pair with the previous character");
                            xfdVar.e = xfdVar.c();
                            iC3 = -1;
                            break;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                            xfdVar.c = 0;
                            iArr2 = xfdVar.d;
                            if (iArr2[1] != -1) {
                                iC2 = xfdVar.c();
                            } else {
                                iC2 = iArr2[0];
                            }
                            iC3 = iC2;
                            iArr2[0] = i;
                            iArr2[1] = -1;
                            iArr2[2] = -1;
                            xfdVar.e = i;
                            break;
                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                            xfdVar.c = 0;
                            iArr5 = xfdVar.d;
                            if (iArr5[0] != -1) {
                                iC5 = xfdVar.c();
                            } else {
                                iC5 = iArr5[1];
                            }
                            iC3 = iC5;
                            iArr5[0] = i;
                            iArr5[1] = -1;
                            iArr5[2] = -1;
                            xfdVar.e = i;
                            break;
                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                            xfdVar.c = 2;
                            iArr3 = xfdVar.d;
                            if (iArr3[0] != -1) {
                                iC4 = xfdVar.c();
                            } else {
                                iC4 = iArr3[1];
                            }
                            iC3 = iC4;
                            iArr3[0] = -1;
                            iArr3[1] = i;
                            iArr3[2] = -1;
                            xfdVar.e = i;
                            break;
                        case 9:
                            xfdVar.c = 2;
                            iArr7 = xfdVar.d;
                            i3 = iArr7[2];
                            if (xfd.g(i3)) {
                                iArr7[2] = -1;
                                iC3 = xfdVar.c();
                                iArr7[0] = i3;
                                iArr7[1] = i;
                                xfdVar.e = xfdVar.c();
                            } else {
                                int[] iArrJ3 = xfd.j(i3);
                                iArr7[2] = iArrJ3[0];
                                iC3 = xfdVar.c();
                                iArr7[0] = iArrJ3[1];
                                iArr7[1] = i;
                                iArr7[2] = -1;
                                xfdVar.e = xfdVar.c();
                            }
                            break;
                        default:
                            iC3 = -1;
                            break;
                    }
                } else {
                    xfdVar.c = 2;
                }
                iArr4 = xfdVar.d;
                iArr4[1] = i;
                i2 = iArr4[0];
                if (i2 != -1) {
                    xfdVar.e = i;
                    iC3 = -1;
                } else {
                    if (xfd.g(i2)) {
                        int[] iArrJ4 = xfd.j(i2);
                        iArr4[0] = iArrJ4[1];
                        iC3 = iArrJ4[0];
                    } else {
                        iC3 = -1;
                    }
                    xfdVar.e = xfdVar.c();
                }
                break;
            case 1:
                if (true != z3) {
                    i5 = 6;
                } else {
                    i5 = 2;
                }
                xfdVar.c = i5;
                switch (i5) {
                    case defpackage.abnt.b /* 0 */:
                        xfdVar.d[0] = i;
                        xfdVar.e = i;
                        iC3 = -1;
                        break;
                    case 1:
                        int[] iArr12 = xfdVar.d;
                        int iA5 = xfd.a(iArr12[0], i);
                        iArr12[0] = iA5;
                        defpackage.ysr.bk(xfd.g(iA5), "This character cannot form a consonant pair with the previous character");
                        xfdVar.e = iArr12[0];
                        iC3 = -1;
                        break;
                    case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                        iArr4 = xfdVar.d;
                        iArr4[1] = i;
                        i2 = iArr4[0];
                        if (i2 != -1) {
                            xfdVar.e = i;
                            iC3 = -1;
                        } else {
                            if (xfd.g(i2)) {
                                int[] iArrJ5 = xfd.j(i2);
                                iArr4[0] = iArrJ5[1];
                                iC3 = iArrJ5[0];
                            } else {
                                iC3 = -1;
                            }
                            xfdVar.e = xfdVar.c();
                        }
                        break;
                    case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                        iArr = xfdVar.d;
                        int iB3 = xfdVar.b(iArr[1], i);
                        iArr[1] = iB3;
                        defpackage.ysr.bk(xfd.i(iB3), "This character cannot form a vowel pair with the previous character");
                        if (iArr[0] != -1) {
                            iC = xfdVar.c();
                        } else {
                            iC = iArr[1];
                        }
                        xfdVar.e = iC;
                        iC3 = -1;
                        break;
                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                        iArr6 = xfdVar.d;
                        iArr6[2] = i;
                        if (iArr6[0] == -1) {
                            xfdVar.c = 0;
                            iC3 = iArr6[1];
                            iArr6[0] = i;
                            iArr6[1] = -1;
                            iArr6[2] = -1;
                            xfdVar.e = i;
                        } else {
                            xfdVar.e = xfdVar.c();
                            iC3 = -1;
                        }
                        break;
                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                        int[] iArr13 = xfdVar.d;
                        int iA6 = xfd.a(iArr13[2], i);
                        iArr13[2] = iA6;
                        defpackage.ysr.bk(xfd.g(iA6), "This character cannot form a consonant pair with the previous character");
                        xfdVar.e = xfdVar.c();
                        iC3 = -1;
                        break;
                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                        xfdVar.c = 0;
                        iArr2 = xfdVar.d;
                        if (iArr2[1] != -1) {
                            iC2 = xfdVar.c();
                        } else {
                            iC2 = iArr2[0];
                        }
                        iC3 = iC2;
                        iArr2[0] = i;
                        iArr2[1] = -1;
                        iArr2[2] = -1;
                        xfdVar.e = i;
                        break;
                    case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                        xfdVar.c = 0;
                        iArr5 = xfdVar.d;
                        if (iArr5[0] != -1) {
                            iC5 = xfdVar.c();
                        } else {
                            iC5 = iArr5[1];
                        }
                        iC3 = iC5;
                        iArr5[0] = i;
                        iArr5[1] = -1;
                        iArr5[2] = -1;
                        xfdVar.e = i;
                        break;
                    case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                        xfdVar.c = 2;
                        iArr3 = xfdVar.d;
                        if (iArr3[0] != -1) {
                            iC4 = xfdVar.c();
                        } else {
                            iC4 = iArr3[1];
                        }
                        iC3 = iC4;
                        iArr3[0] = -1;
                        iArr3[1] = i;
                        iArr3[2] = -1;
                        xfdVar.e = i;
                        break;
                    case 9:
                        xfdVar.c = 2;
                        iArr7 = xfdVar.d;
                        i3 = iArr7[2];
                        if (xfd.g(i3)) {
                            iArr7[2] = -1;
                            iC3 = xfdVar.c();
                            iArr7[0] = i3;
                            iArr7[1] = i;
                            xfdVar.e = xfdVar.c();
                        } else {
                            int[] iArrJ6 = xfd.j(i3);
                            iArr7[2] = iArrJ6[0];
                            iC3 = xfdVar.c();
                            iArr7[0] = iArrJ6[1];
                            iArr7[1] = i;
                            iArr7[2] = -1;
                            xfdVar.e = xfdVar.c();
                        }
                        break;
                    default:
                        iC3 = -1;
                        break;
                }
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                if (z3) {
                    i5 = xfdVar.b(xfdVar.d[1], i) != -1 ? 3 : 8;
                    xfdVar.c = i5;
                    switch (i5) {
                        case defpackage.abnt.b /* 0 */:
                            xfdVar.d[0] = i;
                            xfdVar.e = i;
                            iC3 = -1;
                            break;
                        case 1:
                            int[] iArr14 = xfdVar.d;
                            int iA7 = xfd.a(iArr14[0], i);
                            iArr14[0] = iA7;
                            defpackage.ysr.bk(xfd.g(iA7), "This character cannot form a consonant pair with the previous character");
                            xfdVar.e = iArr14[0];
                            iC3 = -1;
                            break;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            iArr4 = xfdVar.d;
                            iArr4[1] = i;
                            i2 = iArr4[0];
                            if (i2 != -1) {
                                xfdVar.e = i;
                                iC3 = -1;
                            } else {
                                if (xfd.g(i2)) {
                                    int[] iArrJ7 = xfd.j(i2);
                                    iArr4[0] = iArrJ7[1];
                                    iC3 = iArrJ7[0];
                                } else {
                                    iC3 = -1;
                                }
                                xfdVar.e = xfdVar.c();
                            }
                            break;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            iArr = xfdVar.d;
                            int iB4 = xfdVar.b(iArr[1], i);
                            iArr[1] = iB4;
                            defpackage.ysr.bk(xfd.i(iB4), "This character cannot form a vowel pair with the previous character");
                            if (iArr[0] != -1) {
                                iC = xfdVar.c();
                            } else {
                                iC = iArr[1];
                            }
                            xfdVar.e = iC;
                            iC3 = -1;
                            break;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            iArr6 = xfdVar.d;
                            iArr6[2] = i;
                            if (iArr6[0] == -1) {
                                xfdVar.c = 0;
                                iC3 = iArr6[1];
                                iArr6[0] = i;
                                iArr6[1] = -1;
                                iArr6[2] = -1;
                                xfdVar.e = i;
                            } else {
                                xfdVar.e = xfdVar.c();
                                iC3 = -1;
                            }
                            break;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            int[] iArr15 = xfdVar.d;
                            int iA8 = xfd.a(iArr15[2], i);
                            iArr15[2] = iA8;
                            defpackage.ysr.bk(xfd.g(iA8), "This character cannot form a consonant pair with the previous character");
                            xfdVar.e = xfdVar.c();
                            iC3 = -1;
                            break;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                            xfdVar.c = 0;
                            iArr2 = xfdVar.d;
                            if (iArr2[1] != -1) {
                                iC2 = xfdVar.c();
                            } else {
                                iC2 = iArr2[0];
                            }
                            iC3 = iC2;
                            iArr2[0] = i;
                            iArr2[1] = -1;
                            iArr2[2] = -1;
                            xfdVar.e = i;
                            break;
                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                            xfdVar.c = 0;
                            iArr5 = xfdVar.d;
                            if (iArr5[0] != -1) {
                                iC5 = xfdVar.c();
                            } else {
                                iC5 = iArr5[1];
                            }
                            iC3 = iC5;
                            iArr5[0] = i;
                            iArr5[1] = -1;
                            iArr5[2] = -1;
                            xfdVar.e = i;
                            break;
                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                            xfdVar.c = 2;
                            iArr3 = xfdVar.d;
                            if (iArr3[0] != -1) {
                                iC4 = xfdVar.c();
                            } else {
                                iC4 = iArr3[1];
                            }
                            iC3 = iC4;
                            iArr3[0] = -1;
                            iArr3[1] = i;
                            iArr3[2] = -1;
                            xfdVar.e = i;
                            break;
                        case 9:
                            xfdVar.c = 2;
                            iArr7 = xfdVar.d;
                            i3 = iArr7[2];
                            if (xfd.g(i3)) {
                                iArr7[2] = -1;
                                iC3 = xfdVar.c();
                                iArr7[0] = i3;
                                iArr7[1] = i;
                                xfdVar.e = xfdVar.c();
                            } else {
                                int[] iArrJ8 = xfd.j(i3);
                                iArr7[2] = iArrJ8[0];
                                iC3 = xfdVar.c();
                                iArr7[0] = iArrJ8[1];
                                iArr7[1] = i;
                                iArr7[2] = -1;
                                xfdVar.e = xfdVar.c();
                            }
                            break;
                        default:
                            iC3 = -1;
                            break;
                    }
                } else {
                    if (i == 12611 || i == 12617) {
                        xfdVar.c = 7;
                        xfdVar.c = 0;
                        iArr5 = xfdVar.d;
                        if (iArr5[0] != -1) {
                            iC5 = xfdVar.c();
                        } else {
                            iC5 = iArr5[1];
                        }
                        iC3 = iC5;
                        iArr5[0] = i;
                        iArr5[1] = -1;
                        iArr5[2] = -1;
                        xfdVar.e = i;
                    } else {
                        xfdVar.c = 4;
                        iArr6 = xfdVar.d;
                        iArr6[2] = i;
                        if (iArr6[0] == -1) {
                            xfdVar.c = 0;
                            iC3 = iArr6[1];
                            iArr6[0] = i;
                            iArr6[1] = -1;
                            iArr6[2] = -1;
                            xfdVar.e = i;
                        } else {
                            xfdVar.e = xfdVar.c();
                            iC3 = -1;
                        }
                    }
                    break;
                }
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                i5 = true != z3 ? 4 : 8;
                xfdVar.c = i5;
                switch (i5) {
                    case defpackage.abnt.b /* 0 */:
                        xfdVar.d[0] = i;
                        xfdVar.e = i;
                        iC3 = -1;
                        break;
                    case 1:
                        int[] iArr16 = xfdVar.d;
                        int iA9 = xfd.a(iArr16[0], i);
                        iArr16[0] = iA9;
                        defpackage.ysr.bk(xfd.g(iA9), "This character cannot form a consonant pair with the previous character");
                        xfdVar.e = iArr16[0];
                        iC3 = -1;
                        break;
                    case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                        iArr4 = xfdVar.d;
                        iArr4[1] = i;
                        i2 = iArr4[0];
                        if (i2 != -1) {
                            xfdVar.e = i;
                            iC3 = -1;
                        } else {
                            if (xfd.g(i2)) {
                                int[] iArrJ9 = xfd.j(i2);
                                iArr4[0] = iArrJ9[1];
                                iC3 = iArrJ9[0];
                            } else {
                                iC3 = -1;
                            }
                            xfdVar.e = xfdVar.c();
                        }
                        break;
                    case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                        iArr = xfdVar.d;
                        int iB5 = xfdVar.b(iArr[1], i);
                        iArr[1] = iB5;
                        defpackage.ysr.bk(xfd.i(iB5), "This character cannot form a vowel pair with the previous character");
                        if (iArr[0] != -1) {
                            iC = xfdVar.c();
                        } else {
                            iC = iArr[1];
                        }
                        xfdVar.e = iC;
                        iC3 = -1;
                        break;
                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                        iArr6 = xfdVar.d;
                        iArr6[2] = i;
                        if (iArr6[0] == -1) {
                            xfdVar.c = 0;
                            iC3 = iArr6[1];
                            iArr6[0] = i;
                            iArr6[1] = -1;
                            iArr6[2] = -1;
                            xfdVar.e = i;
                        } else {
                            xfdVar.e = xfdVar.c();
                            iC3 = -1;
                        }
                        break;
                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                        int[] iArr17 = xfdVar.d;
                        int iA10 = xfd.a(iArr17[2], i);
                        iArr17[2] = iA10;
                        defpackage.ysr.bk(xfd.g(iA10), "This character cannot form a consonant pair with the previous character");
                        xfdVar.e = xfdVar.c();
                        iC3 = -1;
                        break;
                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                        xfdVar.c = 0;
                        iArr2 = xfdVar.d;
                        if (iArr2[1] != -1) {
                            iC2 = xfdVar.c();
                        } else {
                            iC2 = iArr2[0];
                        }
                        iC3 = iC2;
                        iArr2[0] = i;
                        iArr2[1] = -1;
                        iArr2[2] = -1;
                        xfdVar.e = i;
                        break;
                    case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                        xfdVar.c = 0;
                        iArr5 = xfdVar.d;
                        if (iArr5[0] != -1) {
                            iC5 = xfdVar.c();
                        } else {
                            iC5 = iArr5[1];
                        }
                        iC3 = iC5;
                        iArr5[0] = i;
                        iArr5[1] = -1;
                        iArr5[2] = -1;
                        xfdVar.e = i;
                        break;
                    case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                        xfdVar.c = 2;
                        iArr3 = xfdVar.d;
                        if (iArr3[0] != -1) {
                            iC4 = xfdVar.c();
                        } else {
                            iC4 = iArr3[1];
                        }
                        iC3 = iC4;
                        iArr3[0] = -1;
                        iArr3[1] = i;
                        iArr3[2] = -1;
                        xfdVar.e = i;
                        break;
                    case 9:
                        xfdVar.c = 2;
                        iArr7 = xfdVar.d;
                        i3 = iArr7[2];
                        if (xfd.g(i3)) {
                            iArr7[2] = -1;
                            iC3 = xfdVar.c();
                            iArr7[0] = i3;
                            iArr7[1] = i;
                            xfdVar.e = xfdVar.c();
                        } else {
                            int[] iArrJ10 = xfd.j(i3);
                            iArr7[2] = iArrJ10[0];
                            iC3 = xfdVar.c();
                            iArr7[0] = iArrJ10[1];
                            iArr7[1] = i;
                            iArr7[2] = -1;
                            xfdVar.e = xfdVar.c();
                        }
                        break;
                    default:
                        iC3 = -1;
                        break;
                }
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                if (!z3) {
                    if (xfd.a(xfdVar.d[2], i) != -1) {
                        i5 = 5;
                    } else {
                        i5 = 6;
                    }
                    xfdVar.c = i5;
                    switch (i5) {
                        case defpackage.abnt.b /* 0 */:
                            xfdVar.d[0] = i;
                            xfdVar.e = i;
                            iC3 = -1;
                            break;
                        case 1:
                            int[] iArr18 = xfdVar.d;
                            int iA11 = xfd.a(iArr18[0], i);
                            iArr18[0] = iA11;
                            defpackage.ysr.bk(xfd.g(iA11), "This character cannot form a consonant pair with the previous character");
                            xfdVar.e = iArr18[0];
                            iC3 = -1;
                            break;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            iArr4 = xfdVar.d;
                            iArr4[1] = i;
                            i2 = iArr4[0];
                            if (i2 != -1) {
                                xfdVar.e = i;
                                iC3 = -1;
                            } else {
                                if (xfd.g(i2)) {
                                    int[] iArrJ11 = xfd.j(i2);
                                    iArr4[0] = iArrJ11[1];
                                    iC3 = iArrJ11[0];
                                } else {
                                    iC3 = -1;
                                }
                                xfdVar.e = xfdVar.c();
                            }
                            break;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            iArr = xfdVar.d;
                            int iB6 = xfdVar.b(iArr[1], i);
                            iArr[1] = iB6;
                            defpackage.ysr.bk(xfd.i(iB6), "This character cannot form a vowel pair with the previous character");
                            if (iArr[0] != -1) {
                                iC = xfdVar.c();
                            } else {
                                iC = iArr[1];
                            }
                            xfdVar.e = iC;
                            iC3 = -1;
                            break;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            iArr6 = xfdVar.d;
                            iArr6[2] = i;
                            if (iArr6[0] == -1) {
                                xfdVar.c = 0;
                                iC3 = iArr6[1];
                                iArr6[0] = i;
                                iArr6[1] = -1;
                                iArr6[2] = -1;
                                xfdVar.e = i;
                            } else {
                                xfdVar.e = xfdVar.c();
                                iC3 = -1;
                            }
                            break;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            int[] iArr19 = xfdVar.d;
                            int iA12 = xfd.a(iArr19[2], i);
                            iArr19[2] = iA12;
                            defpackage.ysr.bk(xfd.g(iA12), "This character cannot form a consonant pair with the previous character");
                            xfdVar.e = xfdVar.c();
                            iC3 = -1;
                            break;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                            xfdVar.c = 0;
                            iArr2 = xfdVar.d;
                            if (iArr2[1] != -1) {
                                iC2 = xfdVar.c();
                            } else {
                                iC2 = iArr2[0];
                            }
                            iC3 = iC2;
                            iArr2[0] = i;
                            iArr2[1] = -1;
                            iArr2[2] = -1;
                            xfdVar.e = i;
                            break;
                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                            xfdVar.c = 0;
                            iArr5 = xfdVar.d;
                            if (iArr5[0] != -1) {
                                iC5 = xfdVar.c();
                            } else {
                                iC5 = iArr5[1];
                            }
                            iC3 = iC5;
                            iArr5[0] = i;
                            iArr5[1] = -1;
                            iArr5[2] = -1;
                            xfdVar.e = i;
                            break;
                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                            xfdVar.c = 2;
                            iArr3 = xfdVar.d;
                            if (iArr3[0] != -1) {
                                iC4 = xfdVar.c();
                            } else {
                                iC4 = iArr3[1];
                            }
                            iC3 = iC4;
                            iArr3[0] = -1;
                            iArr3[1] = i;
                            iArr3[2] = -1;
                            xfdVar.e = i;
                            break;
                        case 9:
                            break;
                        default:
                            iC3 = -1;
                            break;
                    }
                } else {
                    xfdVar.c = 9;
                }
                xfdVar.c = 2;
                iArr7 = xfdVar.d;
                i3 = iArr7[2];
                if (xfd.g(i3)) {
                    iArr7[2] = -1;
                    iC3 = xfdVar.c();
                    iArr7[0] = i3;
                    iArr7[1] = i;
                    xfdVar.e = xfdVar.c();
                } else {
                    int[] iArrJ12 = xfd.j(i3);
                    iArr7[2] = iArrJ12[0];
                    iC3 = xfdVar.c();
                    iArr7[0] = iArrJ12[1];
                    iArr7[1] = i;
                    iArr7[2] = -1;
                    xfdVar.e = xfdVar.c();
                }
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                if (true != z3) {
                    i5 = 6;
                } else {
                    i5 = 9;
                }
                xfdVar.c = i5;
                switch (i5) {
                    case defpackage.abnt.b /* 0 */:
                        xfdVar.d[0] = i;
                        xfdVar.e = i;
                        iC3 = -1;
                        break;
                    case 1:
                        int[] iArr110 = xfdVar.d;
                        int iA13 = xfd.a(iArr110[0], i);
                        iArr110[0] = iA13;
                        defpackage.ysr.bk(xfd.g(iA13), "This character cannot form a consonant pair with the previous character");
                        xfdVar.e = iArr110[0];
                        iC3 = -1;
                        break;
                    case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                        iArr4 = xfdVar.d;
                        iArr4[1] = i;
                        i2 = iArr4[0];
                        if (i2 != -1) {
                            xfdVar.e = i;
                            iC3 = -1;
                        } else {
                            if (xfd.g(i2)) {
                                int[] iArrJ13 = xfd.j(i2);
                                iArr4[0] = iArrJ13[1];
                                iC3 = iArrJ13[0];
                            } else {
                                iC3 = -1;
                            }
                            xfdVar.e = xfdVar.c();
                        }
                        break;
                    case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                        iArr = xfdVar.d;
                        int iB7 = xfdVar.b(iArr[1], i);
                        iArr[1] = iB7;
                        defpackage.ysr.bk(xfd.i(iB7), "This character cannot form a vowel pair with the previous character");
                        if (iArr[0] != -1) {
                            iC = xfdVar.c();
                        } else {
                            iC = iArr[1];
                        }
                        xfdVar.e = iC;
                        iC3 = -1;
                        break;
                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                        iArr6 = xfdVar.d;
                        iArr6[2] = i;
                        if (iArr6[0] == -1) {
                            xfdVar.c = 0;
                            iC3 = iArr6[1];
                            iArr6[0] = i;
                            iArr6[1] = -1;
                            iArr6[2] = -1;
                            xfdVar.e = i;
                        } else {
                            xfdVar.e = xfdVar.c();
                            iC3 = -1;
                        }
                        break;
                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                        int[] iArr111 = xfdVar.d;
                        int iA14 = xfd.a(iArr111[2], i);
                        iArr111[2] = iA14;
                        defpackage.ysr.bk(xfd.g(iA14), "This character cannot form a consonant pair with the previous character");
                        xfdVar.e = xfdVar.c();
                        iC3 = -1;
                        break;
                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                        xfdVar.c = 0;
                        iArr2 = xfdVar.d;
                        if (iArr2[1] != -1) {
                            iC2 = xfdVar.c();
                        } else {
                            iC2 = iArr2[0];
                        }
                        iC3 = iC2;
                        iArr2[0] = i;
                        iArr2[1] = -1;
                        iArr2[2] = -1;
                        xfdVar.e = i;
                        break;
                    case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                        xfdVar.c = 0;
                        iArr5 = xfdVar.d;
                        if (iArr5[0] != -1) {
                            iC5 = xfdVar.c();
                        } else {
                            iC5 = iArr5[1];
                        }
                        iC3 = iC5;
                        iArr5[0] = i;
                        iArr5[1] = -1;
                        iArr5[2] = -1;
                        xfdVar.e = i;
                        break;
                    case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                        xfdVar.c = 2;
                        iArr3 = xfdVar.d;
                        if (iArr3[0] != -1) {
                            iC4 = xfdVar.c();
                        } else {
                            iC4 = iArr3[1];
                        }
                        iC3 = iC4;
                        iArr3[0] = -1;
                        iArr3[1] = i;
                        iArr3[2] = -1;
                        xfdVar.e = i;
                        break;
                    case 9:
                        xfdVar.c = 2;
                        iArr7 = xfdVar.d;
                        i3 = iArr7[2];
                        if (xfd.g(i3)) {
                            iArr7[2] = -1;
                            iC3 = xfdVar.c();
                            iArr7[0] = i3;
                            iArr7[1] = i;
                            xfdVar.e = xfdVar.c();
                        } else {
                            int[] iArrJ14 = xfd.j(i3);
                            iArr7[2] = iArrJ14[0];
                            iC3 = xfdVar.c();
                            iArr7[0] = iArrJ14[1];
                            iArr7[1] = i;
                            iArr7[2] = -1;
                            xfdVar.e = xfdVar.c();
                        }
                        break;
                    default:
                        iC3 = -1;
                        break;
                }
                break;
            default:
                switch (i5) {
                    case defpackage.abnt.b /* 0 */:
                        xfdVar.d[0] = i;
                        xfdVar.e = i;
                        iC3 = -1;
                        break;
                    case 1:
                        int[] iArr112 = xfdVar.d;
                        int iA15 = xfd.a(iArr112[0], i);
                        iArr112[0] = iA15;
                        defpackage.ysr.bk(xfd.g(iA15), "This character cannot form a consonant pair with the previous character");
                        xfdVar.e = iArr112[0];
                        iC3 = -1;
                        break;
                    case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                        iArr4 = xfdVar.d;
                        iArr4[1] = i;
                        i2 = iArr4[0];
                        if (i2 != -1) {
                            xfdVar.e = i;
                            iC3 = -1;
                        } else {
                            if (xfd.g(i2)) {
                                int[] iArrJ15 = xfd.j(i2);
                                iArr4[0] = iArrJ15[1];
                                iC3 = iArrJ15[0];
                            } else {
                                iC3 = -1;
                            }
                            xfdVar.e = xfdVar.c();
                        }
                        break;
                    case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                        iArr = xfdVar.d;
                        int iB8 = xfdVar.b(iArr[1], i);
                        iArr[1] = iB8;
                        defpackage.ysr.bk(xfd.i(iB8), "This character cannot form a vowel pair with the previous character");
                        if (iArr[0] != -1) {
                            iC = xfdVar.c();
                        } else {
                            iC = iArr[1];
                        }
                        xfdVar.e = iC;
                        iC3 = -1;
                        break;
                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                        iArr6 = xfdVar.d;
                        iArr6[2] = i;
                        if (iArr6[0] == -1) {
                            xfdVar.c = 0;
                            iC3 = iArr6[1];
                            iArr6[0] = i;
                            iArr6[1] = -1;
                            iArr6[2] = -1;
                            xfdVar.e = i;
                        } else {
                            xfdVar.e = xfdVar.c();
                            iC3 = -1;
                        }
                        break;
                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                        int[] iArr113 = xfdVar.d;
                        int iA16 = xfd.a(iArr113[2], i);
                        iArr113[2] = iA16;
                        defpackage.ysr.bk(xfd.g(iA16), "This character cannot form a consonant pair with the previous character");
                        xfdVar.e = xfdVar.c();
                        iC3 = -1;
                        break;
                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                        xfdVar.c = 0;
                        iArr2 = xfdVar.d;
                        if (iArr2[1] != -1) {
                            iC2 = xfdVar.c();
                        } else {
                            iC2 = iArr2[0];
                        }
                        iC3 = iC2;
                        iArr2[0] = i;
                        iArr2[1] = -1;
                        iArr2[2] = -1;
                        xfdVar.e = i;
                        break;
                    case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                        xfdVar.c = 0;
                        iArr5 = xfdVar.d;
                        if (iArr5[0] != -1) {
                            iC5 = xfdVar.c();
                        } else {
                            iC5 = iArr5[1];
                        }
                        iC3 = iC5;
                        iArr5[0] = i;
                        iArr5[1] = -1;
                        iArr5[2] = -1;
                        xfdVar.e = i;
                        break;
                    case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                        xfdVar.c = 2;
                        iArr3 = xfdVar.d;
                        if (iArr3[0] != -1) {
                            iC4 = xfdVar.c();
                        } else {
                            iC4 = iArr3[1];
                        }
                        iC3 = iC4;
                        iArr3[0] = -1;
                        iArr3[1] = i;
                        iArr3[2] = -1;
                        xfdVar.e = i;
                        break;
                    case 9:
                        xfdVar.c = 2;
                        iArr7 = xfdVar.d;
                        i3 = iArr7[2];
                        if (xfd.g(i3)) {
                            iArr7[2] = -1;
                            iC3 = xfdVar.c();
                            iArr7[0] = i3;
                            iArr7[1] = i;
                            xfdVar.e = xfdVar.c();
                        } else {
                            int[] iArrJ16 = xfd.j(i3);
                            iArr7[2] = iArrJ16[0];
                            iC3 = xfdVar.c();
                            iArr7[0] = iArrJ16[1];
                            iArr7[1] = i;
                            iArr7[2] = -1;
                            xfdVar.e = xfdVar.c();
                        }
                        break;
                    default:
                        iC3 = -1;
                        break;
                }
                break;
        }
        strValueOf2 = iC3 != -1 ? java.lang.String.valueOf((char) iC3) : null;
        strValueOf = java.lang.String.valueOf((char) xfdVar.e);
        if (strValueOf2 != null) {
            inputConnection.commitText(strValueOf2, 1);
        }
        if (strValueOf != null) {
            inputConnection.setComposingText(strValueOf, 1);
        }
        inputConnection.endBatchEdit();
    }

    public static boolean n(int i) {
        return i >= 12593 && i <= 12643;
    }

    public static void o(android.view.View view, int i) {
        view.animate().alpha(i == 0 ? 1.0f : 0.0f).setDuration(100L).withEndAction(new defpackage.rhh(view, i, 17));
    }

    public static final /* synthetic */ xpf p(defpackage.abor aborVar) {
        xpf xpfVarQ = aborVar.q();
        xpfVarQ.getClass();
        return xpfVarQ;
    }

    public static final void q(int i, defpackage.abor aborVar) {
        aborVar.t();
        xpf xpfVar = aborVar.b;
        xpf xpfVar2 = xpf.a;
        xpfVar.b |= 8;
        xpfVar.f = i;
    }

    public static final void r(xhj xhjVar, defpackage.abor aborVar) {
        aborVar.t();
        xpf xpfVar = aborVar.b;
        xpf xpfVar2 = xpf.a;
        xpfVar.c = xhjVar;
        xpfVar.b |= 1;
    }

    public static final void s(java.lang.String str, defpackage.abor aborVar) {
        aborVar.t();
        xpf xpfVar = aborVar.b;
        xpf xpfVar2 = xpf.a;
        xpfVar.b |= 4;
        xpfVar.e = str;
    }

    public static final void t(defpackage.xls xlsVar, defpackage.abor aborVar) {
        aborVar.t();
        xpf xpfVar = aborVar.b;
        xpf xpfVar2 = xpf.a;
        xpfVar.d = xlsVar.I;
        xpfVar.b |= 2;
    }

    public static final /* synthetic */ xhp u(defpackage.abor aborVar) {
        xhp xhpVarQ = aborVar.q();
        xhpVarQ.getClass();
        return xhpVarQ;
    }

    public static final /* synthetic */ void v(defpackage.abor aborVar) {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(aborVar.b.b);
        listUnmodifiableList.getClass();
        new abrl(listUnmodifiableList);
    }

    public static int w(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 5) {
            return i != 6 ? 0 : 7;
        }
        return 6;
    }

    public static int x(int i) {
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
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
            case 18:
            default:
                return 0;
            case 16:
                return 17;
            case 17:
                return 18;
            case 19:
                return 20;
        }
    }

    public static int y(int i) {
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
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
            case 31:
            default:
                return 0;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
        }
    }

    public static int z(int i) {
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
            default:
                switch (i) {
                    case 100:
                        return 101;
                    case 101:
                        return 102;
                    case 102:
                        return 103;
                    default:
                        return 0;
                }
        }
    }
}
