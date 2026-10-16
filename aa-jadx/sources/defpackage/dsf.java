package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dsf {
    public static final int[] a = {0, 4, 8};
    private static final android.util.SparseIntArray b;
    private static final android.util.SparseIntArray c;
    private final java.util.HashMap d = new java.util.HashMap();
    private final java.util.HashMap e = new java.util.HashMap();

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        b = sparseIntArray;
        android.util.SparseIntArray sparseIntArray2 = new android.util.SparseIntArray();
        c = sparseIntArray2;
        int[] iArr = defpackage.dsj.a;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int a(android.content.res.TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    /* JADX WARN: Code duplicated, block: B:19:0x0034  */
    /* JADX WARN: Code duplicated, block: B:21:0x0039  */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0050  */
    /* JADX WARN: Code duplicated, block: B:33:0x0054  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    static void m(java.lang.Object obj, android.content.res.TypedArray typedArray, int i, int i2) {
        int iIndexOf;
        int dimensionPixelSize;
        defpackage.drz drzVar;
        defpackage.dsb dsbVar;
        defpackage.drv drvVar;
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 != 3) {
            if (i3 != 5) {
                dimensionPixelSize = typedArray.getInt(i, 0);
                if (dimensionPixelSize == -4) {
                    i4 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z = false;
                }
                if (obj instanceof defpackage.drv) {
                    drvVar = (defpackage.drv) obj;
                    if (i2 == 0) {
                        drvVar.width = i4;
                        drvVar.aa = z;
                        return;
                    } else {
                        drvVar.height = i4;
                        drvVar.ab = z;
                        return;
                    }
                }
                if (obj instanceof defpackage.dsb) {
                    dsbVar = (defpackage.dsb) obj;
                    if (i2 == 0) {
                        dsbVar.d = i4;
                        dsbVar.an = z;
                        return;
                    } else {
                        dsbVar.e = i4;
                        dsbVar.ao = z;
                        return;
                    }
                }
                if (obj instanceof defpackage.drz) {
                    drzVar = (defpackage.drz) obj;
                    if (i2 == 0) {
                        drzVar.b(23, i4);
                        drzVar.d(80, z);
                        return;
                    } else {
                        drzVar.b(21, i4);
                        drzVar.d(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
            z = false;
            i4 = dimensionPixelSize;
            if (obj instanceof defpackage.drv) {
                drvVar = (defpackage.drv) obj;
                if (i2 == 0) {
                    drvVar.width = i4;
                    drvVar.aa = z;
                    return;
                } else {
                    drvVar.height = i4;
                    drvVar.ab = z;
                    return;
                }
            }
            if (obj instanceof defpackage.dsb) {
                dsbVar = (defpackage.dsb) obj;
                if (i2 == 0) {
                    dsbVar.d = i4;
                    dsbVar.an = z;
                    return;
                } else {
                    dsbVar.e = i4;
                    dsbVar.ao = z;
                    return;
                }
            }
            if (obj instanceof defpackage.drz) {
                drzVar = (defpackage.drz) obj;
                if (i2 == 0) {
                    drzVar.b(23, i4);
                    drzVar.d(80, z);
                    return;
                } else {
                    drzVar.b(21, i4);
                    drzVar.d(81, z);
                    return;
                }
            }
            return;
        }
        java.lang.String string = typedArray.getString(i);
        if (string == null || (iIndexOf = string.indexOf(61)) <= 0 || iIndexOf >= string.length() - 1) {
            return;
        }
        java.lang.String strSubstring = string.substring(0, iIndexOf);
        java.lang.String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            java.lang.String strTrim = strSubstring.trim();
            java.lang.String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof defpackage.drv) {
                    defpackage.drv drvVar2 = (defpackage.drv) obj;
                    if (i2 == 0) {
                        drvVar2.width = 0;
                    } else {
                        drvVar2.height = 0;
                    }
                    n(drvVar2, strTrim2);
                    return;
                }
                if (obj instanceof defpackage.dsb) {
                    ((defpackage.dsb) obj).A = strTrim2;
                    return;
                } else {
                    if (obj instanceof defpackage.drz) {
                        ((defpackage.drz) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f = java.lang.Float.parseFloat(strTrim2);
                    if (obj instanceof defpackage.drv) {
                        defpackage.drv drvVar3 = (defpackage.drv) obj;
                        if (i2 == 0) {
                            drvVar3.width = 0;
                            drvVar3.L = f;
                            return;
                        } else {
                            drvVar3.height = 0;
                            drvVar3.M = f;
                            return;
                        }
                    }
                    if (obj instanceof defpackage.dsb) {
                        defpackage.dsb dsbVar2 = (defpackage.dsb) obj;
                        if (i2 == 0) {
                            dsbVar2.d = 0;
                            dsbVar2.W = f;
                            return;
                        } else {
                            dsbVar2.e = 0;
                            dsbVar2.V = f;
                            return;
                        }
                    }
                    if (obj instanceof defpackage.drz) {
                        defpackage.drz drzVar2 = (defpackage.drz) obj;
                        if (i2 == 0) {
                            drzVar2.b(23, 0);
                            drzVar2.a(39, f);
                            return;
                        } else {
                            drzVar2.b(21, 0);
                            drzVar2.a(40, f);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = java.lang.Math.max(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, java.lang.Math.min(1.0f, java.lang.Float.parseFloat(strTrim2)));
                    if (obj instanceof defpackage.drv) {
                        defpackage.drv drvVar4 = (defpackage.drv) obj;
                        if (i2 == 0) {
                            drvVar4.width = 0;
                            drvVar4.V = fMax;
                            drvVar4.P = 2;
                            return;
                        } else {
                            drvVar4.height = 0;
                            drvVar4.W = fMax;
                            drvVar4.Q = 2;
                            return;
                        }
                    }
                    if (obj instanceof defpackage.dsb) {
                        defpackage.dsb dsbVar3 = (defpackage.dsb) obj;
                        if (i2 == 0) {
                            dsbVar3.d = 0;
                            dsbVar3.af = fMax;
                            dsbVar3.Z = 2;
                            return;
                        } else {
                            dsbVar3.e = 0;
                            dsbVar3.ag = fMax;
                            dsbVar3.aa = 2;
                            return;
                        }
                    }
                    if (obj instanceof defpackage.drz) {
                        defpackage.drz drzVar3 = (defpackage.drz) obj;
                        if (i2 == 0) {
                            drzVar3.b(23, 0);
                            drzVar3.b(54, 2);
                        } else {
                            drzVar3.b(21, 0);
                            drzVar3.b(55, 2);
                        }
                    }
                }
            } catch (java.lang.NumberFormatException unused) {
            }
        }
    }

    static void n(defpackage.drv drvVar, java.lang.String str) {
        int i;
        int i2 = -1;
        float fAbs = Float.NaN;
        if (str != null) {
            int iIndexOf = str.indexOf(44);
            int length = str.length();
            int i3 = 0;
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                i = -1;
            } else {
                java.lang.String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i3 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                int i4 = i3;
                i3 = iIndexOf + 1;
                i = i4;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    java.lang.String strSubstring2 = str.substring(i3);
                    if (strSubstring2.length() > 0) {
                        fAbs = java.lang.Float.parseFloat(strSubstring2);
                    }
                } else {
                    java.lang.String strSubstring3 = str.substring(i3, iIndexOf2);
                    java.lang.String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = java.lang.Float.parseFloat(strSubstring3);
                        float f2 = java.lang.Float.parseFloat(strSubstring4);
                        if (f > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED && f2 > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                            fAbs = i == 1 ? java.lang.Math.abs(f2 / f) : java.lang.Math.abs(f / f2);
                        }
                    }
                }
            } catch (java.lang.NumberFormatException unused) {
            }
            i2 = i;
        }
        drvVar.I = str;
        drvVar.J = fAbs;
        drvVar.K = i2;
    }

    private static final int[] s(android.view.View view, java.lang.String str) {
        int length;
        int iIntValue;
        java.lang.Object objD;
        java.lang.String[] strArrSplit = str.split(",");
        android.content.Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = strArrSplit.length;
            if (i >= length) {
                break;
            }
            java.lang.String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = defpackage.dsi.class.getField(strTrim).getInt(null);
            } catch (java.lang.Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0) {
                iIntValue = (view.isInEditMode() && (view.getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout) && (objD = ((androidx.constraintlayout.widget.ConstraintLayout) view.getParent()).d(strTrim)) != null && (objD instanceof java.lang.Integer)) ? ((java.lang.Integer) objD).intValue() : 0;
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != length ? java.util.Arrays.copyOf(iArr, i2) : iArr;
    }

    private static final defpackage.dsa t(android.content.Context context, android.util.AttributeSet attributeSet, boolean z) {
        java.lang.String str;
        java.lang.String str2;
        int i;
        defpackage.dsa dsaVar = new defpackage.dsa();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? defpackage.dsj.c : defpackage.dsj.a);
        java.lang.String str3 = "unused attribute 0x";
        int i2 = 0;
        if (z) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            defpackage.drz drzVar = new defpackage.drz();
            dsaVar.g = drzVar;
            defpackage.dsc dscVar = dsaVar.c;
            dscVar.b = false;
            defpackage.dsb dsbVar = dsaVar.d;
            dsbVar.c = false;
            defpackage.dsd dsdVar = dsaVar.b;
            dsdVar.a = false;
            defpackage.dse dseVar = dsaVar.e;
            dseVar.b = false;
            while (i2 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = i2;
                switch (c.get(index)) {
                    case 2:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dsbVar.K));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    case 30:
                    case 32:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_STRAIGHT /* 36 */:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        str2 = str3;
                        i = indexCount;
                        android.util.Log.w("ConstraintSet", "Unknown attribute 0x" + java.lang.Integer.toHexString(index) + "   " + b.get(index));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 5:
                        str2 = str3;
                        i = indexCount;
                        drzVar.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 6:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dsbVar.E));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 7:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dsbVar.F));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 8:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dsbVar.L));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 11:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dsbVar.R));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 12:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dsbVar.S));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 13:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dsbVar.O));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 14:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dsbVar.Q));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 15:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dsbVar.T));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 16:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dsbVar.P));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 17:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dsbVar.f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 18:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dsbVar.g));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 19:
                        str2 = str3;
                        i = indexCount;
                        drzVar.a(19, typedArrayObtainStyledAttributes.getFloat(index, dsbVar.h));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 20:
                        str2 = str3;
                        i = indexCount;
                        drzVar.a(20, typedArrayObtainStyledAttributes.getFloat(index, dsbVar.y));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 21:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, dsbVar.e));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 22:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(22, a[typedArrayObtainStyledAttributes.getInt(index, dsdVar.b)]);
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 23:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, dsbVar.d));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 24:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dsbVar.H));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 27:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(27, typedArrayObtainStyledAttributes.getInt(index, dsbVar.G));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dsbVar.I));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 31:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dsbVar.M));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dsbVar.J));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 37:
                        str2 = str3;
                        i = indexCount;
                        drzVar.a(37, typedArrayObtainStyledAttributes.getFloat(index, dsbVar.z));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                        str2 = str3;
                        i = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, dsaVar.a);
                        dsaVar.a = resourceId;
                        drzVar.b(38, resourceId);
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                        str2 = str3;
                        i = indexCount;
                        drzVar.a(39, typedArrayObtainStyledAttributes.getFloat(index, dsbVar.W));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                        str2 = str3;
                        i = indexCount;
                        drzVar.a(40, typedArrayObtainStyledAttributes.getFloat(index, dsbVar.V));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(41, typedArrayObtainStyledAttributes.getInt(index, dsbVar.X));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(42, typedArrayObtainStyledAttributes.getInt(index, dsbVar.Y));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                        str2 = str3;
                        i = indexCount;
                        drzVar.a(43, typedArrayObtainStyledAttributes.getFloat(index, dsdVar.d));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                        str2 = str3;
                        i = indexCount;
                        drzVar.d(44, true);
                        drzVar.a(44, typedArrayObtainStyledAttributes.getDimension(index, dseVar.o));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                        str2 = str3;
                        i = indexCount;
                        drzVar.a(45, typedArrayObtainStyledAttributes.getFloat(index, dseVar.d));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                        str2 = str3;
                        i = indexCount;
                        drzVar.a(46, typedArrayObtainStyledAttributes.getFloat(index, dseVar.e));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                        str2 = str3;
                        i = indexCount;
                        drzVar.a(47, typedArrayObtainStyledAttributes.getFloat(index, dseVar.f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 48:
                        str2 = str3;
                        i = indexCount;
                        drzVar.a(48, typedArrayObtainStyledAttributes.getFloat(index, dseVar.g));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                        str2 = str3;
                        i = indexCount;
                        drzVar.a(49, typedArrayObtainStyledAttributes.getDimension(index, dseVar.h));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        str2 = str3;
                        i = indexCount;
                        drzVar.a(50, typedArrayObtainStyledAttributes.getDimension(index, dseVar.i));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 51:
                        str2 = str3;
                        i = indexCount;
                        drzVar.a(51, typedArrayObtainStyledAttributes.getDimension(index, dseVar.k));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 52:
                        str2 = str3;
                        i = indexCount;
                        drzVar.a(52, typedArrayObtainStyledAttributes.getDimension(index, dseVar.l));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 53:
                        str2 = str3;
                        i = indexCount;
                        drzVar.a(53, typedArrayObtainStyledAttributes.getDimension(index, dseVar.m));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 54:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(54, typedArrayObtainStyledAttributes.getInt(index, dsbVar.Z));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 55:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(55, typedArrayObtainStyledAttributes.getInt(index, dsbVar.aa));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 56:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dsbVar.ab));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 57:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dsbVar.ac));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 58:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dsbVar.ad));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 59:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dsbVar.ae));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 60:
                        str2 = str3;
                        i = indexCount;
                        drzVar.a(60, typedArrayObtainStyledAttributes.getFloat(index, dseVar.c));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 62:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dsbVar.C));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 63:
                        str2 = str3;
                        i = indexCount;
                        drzVar.a(63, typedArrayObtainStyledAttributes.getFloat(index, dsbVar.D));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(64, a(typedArrayObtainStyledAttributes, index, dscVar.c));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 65:
                        str2 = str3;
                        i = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            drzVar.c(65, typedArrayObtainStyledAttributes.getString(index));
                            continue;
                        } else {
                            drzVar.c(65, defpackage.dpl.a[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 66:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 67:
                        str2 = str3;
                        i = indexCount;
                        drzVar.a(67, typedArrayObtainStyledAttributes.getFloat(index, dscVar.j));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 68:
                        str2 = str3;
                        i = indexCount;
                        drzVar.a(68, typedArrayObtainStyledAttributes.getFloat(index, dsdVar.e));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 69:
                        str2 = str3;
                        i = indexCount;
                        drzVar.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 70:
                        str2 = str3;
                        i = indexCount;
                        drzVar.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 71:
                        str2 = str3;
                        i = indexCount;
                        android.util.Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 72:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(72, typedArrayObtainStyledAttributes.getInt(index, dsbVar.ah));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 73:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dsbVar.ai));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 74:
                        str2 = str3;
                        i = indexCount;
                        drzVar.c(74, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 75:
                        str2 = str3;
                        i = indexCount;
                        drzVar.d(75, typedArrayObtainStyledAttributes.getBoolean(index, dsbVar.ap));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 76:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(76, typedArrayObtainStyledAttributes.getInt(index, dscVar.f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 77:
                        str2 = str3;
                        i = indexCount;
                        drzVar.c(77, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 78:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(78, typedArrayObtainStyledAttributes.getInt(index, dsdVar.c));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 79:
                        str2 = str3;
                        i = indexCount;
                        drzVar.a(79, typedArrayObtainStyledAttributes.getFloat(index, dscVar.h));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                        str2 = str3;
                        i = indexCount;
                        drzVar.d(80, typedArrayObtainStyledAttributes.getBoolean(index, dsbVar.an));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 81:
                        str2 = str3;
                        i = indexCount;
                        drzVar.d(81, typedArrayObtainStyledAttributes.getBoolean(index, dsbVar.ao));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 82:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, dscVar.d));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 83:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(83, a(typedArrayObtainStyledAttributes, index, dseVar.j));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 84:
                        str2 = str3;
                        i = indexCount;
                        drzVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, dscVar.l));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 85:
                        str2 = str3;
                        i = indexCount;
                        drzVar.a(85, typedArrayObtainStyledAttributes.getFloat(index, dscVar.k));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 86:
                        i = indexCount;
                        android.util.TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(index);
                        str2 = str3;
                        if (typedValuePeekValue.type == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            dscVar.n = resourceId2;
                            drzVar.b(89, resourceId2);
                            if (dscVar.n != -1) {
                                drzVar.b(88, -2);
                            } else {
                                continue;
                            }
                        } else if (typedValuePeekValue.type == 3) {
                            dscVar.m = typedArrayObtainStyledAttributes.getString(index);
                            drzVar.c(90, dscVar.m);
                            if (dscVar.m.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                dscVar.n = resourceId3;
                                drzVar.b(89, resourceId3);
                                drzVar.b(88, -2);
                            } else {
                                drzVar.b(88, -1);
                            }
                        } else {
                            drzVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, dscVar.n));
                        }
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                    case 87:
                        i = indexCount;
                        android.util.Log.w("ConstraintSet", str3 + java.lang.Integer.toHexString(index) + "   " + b.get(index));
                        break;
                    case 93:
                        i = indexCount;
                        drzVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dsbVar.N));
                        break;
                    case 94:
                        i = indexCount;
                        drzVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dsbVar.U));
                        break;
                    case 95:
                        i = indexCount;
                        m(drzVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                        i = indexCount;
                        m(drzVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i = indexCount;
                        drzVar.b(97, typedArrayObtainStyledAttributes.getInt(index, dsbVar.aq));
                        break;
                    case 98:
                        i = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                            dsaVar.a = typedArrayObtainStyledAttributes.getResourceId(index, dsaVar.a);
                        } else {
                            typedArrayObtainStyledAttributes.getString(index);
                        }
                        break;
                    case 99:
                        drzVar.d(99, typedArrayObtainStyledAttributes.getBoolean(index, dsbVar.i));
                        str2 = str3;
                        i = indexCount;
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                        break;
                }
                str2 = str3;
                i2 = i3 + 1;
                indexCount = i;
                str3 = str2;
            }
        } else {
            java.lang.String str4 = "unused attribute 0x";
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            int i4 = 0;
            while (i4 < indexCount2) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index2 != 1 && index2 != 23 && index2 != 24) {
                    dsaVar.c.b = true;
                    dsaVar.d.c = true;
                    dsaVar.b.a = true;
                    dsaVar.e.b = true;
                }
                android.util.SparseIntArray sparseIntArray = b;
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        str = str4;
                        defpackage.dsb dsbVar2 = dsaVar.d;
                        dsbVar2.r = a(typedArrayObtainStyledAttributes, index2, dsbVar2.r);
                        break;
                    case 2:
                        str = str4;
                        defpackage.dsb dsbVar3 = dsaVar.d;
                        dsbVar3.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, dsbVar3.K);
                        break;
                    case 3:
                        str = str4;
                        defpackage.dsb dsbVar4 = dsaVar.d;
                        dsbVar4.q = a(typedArrayObtainStyledAttributes, index2, dsbVar4.q);
                        break;
                    case 4:
                        str = str4;
                        defpackage.dsb dsbVar5 = dsaVar.d;
                        dsbVar5.p = a(typedArrayObtainStyledAttributes, index2, dsbVar5.p);
                        break;
                    case 5:
                        str = str4;
                        dsaVar.d.A = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        str = str4;
                        defpackage.dsb dsbVar6 = dsaVar.d;
                        dsbVar6.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, dsbVar6.E);
                        break;
                    case 7:
                        str = str4;
                        defpackage.dsb dsbVar7 = dsaVar.d;
                        dsbVar7.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, dsbVar7.F);
                        break;
                    case 8:
                        str = str4;
                        defpackage.dsb dsbVar8 = dsaVar.d;
                        dsbVar8.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, dsbVar8.L);
                        break;
                    case 9:
                        str = str4;
                        defpackage.dsb dsbVar9 = dsaVar.d;
                        dsbVar9.x = a(typedArrayObtainStyledAttributes, index2, dsbVar9.x);
                        break;
                    case 10:
                        str = str4;
                        defpackage.dsb dsbVar10 = dsaVar.d;
                        dsbVar10.w = a(typedArrayObtainStyledAttributes, index2, dsbVar10.w);
                        break;
                    case 11:
                        str = str4;
                        defpackage.dsb dsbVar11 = dsaVar.d;
                        dsbVar11.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, dsbVar11.R);
                        break;
                    case 12:
                        str = str4;
                        defpackage.dsb dsbVar12 = dsaVar.d;
                        dsbVar12.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, dsbVar12.S);
                        break;
                    case 13:
                        str = str4;
                        defpackage.dsb dsbVar13 = dsaVar.d;
                        dsbVar13.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, dsbVar13.O);
                        break;
                    case 14:
                        str = str4;
                        defpackage.dsb dsbVar14 = dsaVar.d;
                        dsbVar14.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, dsbVar14.Q);
                        break;
                    case 15:
                        str = str4;
                        defpackage.dsb dsbVar15 = dsaVar.d;
                        dsbVar15.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, dsbVar15.T);
                        break;
                    case 16:
                        str = str4;
                        defpackage.dsb dsbVar16 = dsaVar.d;
                        dsbVar16.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, dsbVar16.P);
                        break;
                    case 17:
                        str = str4;
                        defpackage.dsb dsbVar17 = dsaVar.d;
                        dsbVar17.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, dsbVar17.f);
                        break;
                    case 18:
                        str = str4;
                        defpackage.dsb dsbVar18 = dsaVar.d;
                        dsbVar18.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, dsbVar18.g);
                        break;
                    case 19:
                        str = str4;
                        defpackage.dsb dsbVar19 = dsaVar.d;
                        dsbVar19.h = typedArrayObtainStyledAttributes.getFloat(index2, dsbVar19.h);
                        break;
                    case 20:
                        str = str4;
                        defpackage.dsb dsbVar20 = dsaVar.d;
                        dsbVar20.y = typedArrayObtainStyledAttributes.getFloat(index2, dsbVar20.y);
                        break;
                    case 21:
                        str = str4;
                        defpackage.dsb dsbVar21 = dsaVar.d;
                        dsbVar21.e = typedArrayObtainStyledAttributes.getLayoutDimension(index2, dsbVar21.e);
                        break;
                    case 22:
                        str = str4;
                        defpackage.dsd dsdVar2 = dsaVar.b;
                        int i5 = typedArrayObtainStyledAttributes.getInt(index2, dsdVar2.b);
                        dsdVar2.b = i5;
                        dsdVar2.b = a[i5];
                        break;
                    case 23:
                        str = str4;
                        defpackage.dsb dsbVar22 = dsaVar.d;
                        dsbVar22.d = typedArrayObtainStyledAttributes.getLayoutDimension(index2, dsbVar22.d);
                        break;
                    case 24:
                        str = str4;
                        defpackage.dsb dsbVar23 = dsaVar.d;
                        dsbVar23.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, dsbVar23.H);
                        break;
                    case 25:
                        str = str4;
                        defpackage.dsb dsbVar24 = dsaVar.d;
                        dsbVar24.j = a(typedArrayObtainStyledAttributes, index2, dsbVar24.j);
                        break;
                    case 26:
                        str = str4;
                        defpackage.dsb dsbVar25 = dsaVar.d;
                        dsbVar25.k = a(typedArrayObtainStyledAttributes, index2, dsbVar25.k);
                        break;
                    case 27:
                        str = str4;
                        defpackage.dsb dsbVar26 = dsaVar.d;
                        dsbVar26.G = typedArrayObtainStyledAttributes.getInt(index2, dsbVar26.G);
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        str = str4;
                        defpackage.dsb dsbVar27 = dsaVar.d;
                        dsbVar27.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, dsbVar27.I);
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                        str = str4;
                        defpackage.dsb dsbVar28 = dsaVar.d;
                        dsbVar28.l = a(typedArrayObtainStyledAttributes, index2, dsbVar28.l);
                        break;
                    case 30:
                        str = str4;
                        defpackage.dsb dsbVar29 = dsaVar.d;
                        dsbVar29.m = a(typedArrayObtainStyledAttributes, index2, dsbVar29.m);
                        break;
                    case 31:
                        str = str4;
                        defpackage.dsb dsbVar30 = dsaVar.d;
                        dsbVar30.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, dsbVar30.M);
                        break;
                    case 32:
                        str = str4;
                        defpackage.dsb dsbVar31 = dsaVar.d;
                        dsbVar31.u = a(typedArrayObtainStyledAttributes, index2, dsbVar31.u);
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                        str = str4;
                        defpackage.dsb dsbVar32 = dsaVar.d;
                        dsbVar32.v = a(typedArrayObtainStyledAttributes, index2, dsbVar32.v);
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                        str = str4;
                        defpackage.dsb dsbVar33 = dsaVar.d;
                        dsbVar33.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, dsbVar33.J);
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                        str = str4;
                        defpackage.dsb dsbVar34 = dsaVar.d;
                        dsbVar34.o = a(typedArrayObtainStyledAttributes, index2, dsbVar34.o);
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_STRAIGHT /* 36 */:
                        str = str4;
                        defpackage.dsb dsbVar35 = dsaVar.d;
                        dsbVar35.n = a(typedArrayObtainStyledAttributes, index2, dsbVar35.n);
                        break;
                    case 37:
                        str = str4;
                        defpackage.dsb dsbVar36 = dsaVar.d;
                        dsbVar36.z = typedArrayObtainStyledAttributes.getFloat(index2, dsbVar36.z);
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                        str = str4;
                        dsaVar.a = typedArrayObtainStyledAttributes.getResourceId(index2, dsaVar.a);
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                        str = str4;
                        defpackage.dsb dsbVar37 = dsaVar.d;
                        dsbVar37.W = typedArrayObtainStyledAttributes.getFloat(index2, dsbVar37.W);
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                        str = str4;
                        defpackage.dsb dsbVar38 = dsaVar.d;
                        dsbVar38.V = typedArrayObtainStyledAttributes.getFloat(index2, dsbVar38.V);
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                        str = str4;
                        defpackage.dsb dsbVar39 = dsaVar.d;
                        dsbVar39.X = typedArrayObtainStyledAttributes.getInt(index2, dsbVar39.X);
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                        str = str4;
                        defpackage.dsb dsbVar40 = dsaVar.d;
                        dsbVar40.Y = typedArrayObtainStyledAttributes.getInt(index2, dsbVar40.Y);
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                        str = str4;
                        defpackage.dsd dsdVar3 = dsaVar.b;
                        dsdVar3.d = typedArrayObtainStyledAttributes.getFloat(index2, dsdVar3.d);
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                        str = str4;
                        defpackage.dse dseVar2 = dsaVar.e;
                        dseVar2.n = true;
                        dseVar2.o = typedArrayObtainStyledAttributes.getDimension(index2, dseVar2.o);
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                        str = str4;
                        defpackage.dse dseVar3 = dsaVar.e;
                        dseVar3.d = typedArrayObtainStyledAttributes.getFloat(index2, dseVar3.d);
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                        str = str4;
                        defpackage.dse dseVar4 = dsaVar.e;
                        dseVar4.e = typedArrayObtainStyledAttributes.getFloat(index2, dseVar4.e);
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                        str = str4;
                        defpackage.dse dseVar5 = dsaVar.e;
                        dseVar5.f = typedArrayObtainStyledAttributes.getFloat(index2, dseVar5.f);
                        break;
                    case 48:
                        str = str4;
                        defpackage.dse dseVar6 = dsaVar.e;
                        dseVar6.g = typedArrayObtainStyledAttributes.getFloat(index2, dseVar6.g);
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                        str = str4;
                        defpackage.dse dseVar7 = dsaVar.e;
                        dseVar7.h = typedArrayObtainStyledAttributes.getDimension(index2, dseVar7.h);
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        str = str4;
                        defpackage.dse dseVar8 = dsaVar.e;
                        dseVar8.i = typedArrayObtainStyledAttributes.getDimension(index2, dseVar8.i);
                        break;
                    case 51:
                        str = str4;
                        defpackage.dse dseVar9 = dsaVar.e;
                        dseVar9.k = typedArrayObtainStyledAttributes.getDimension(index2, dseVar9.k);
                        break;
                    case 52:
                        str = str4;
                        defpackage.dse dseVar10 = dsaVar.e;
                        dseVar10.l = typedArrayObtainStyledAttributes.getDimension(index2, dseVar10.l);
                        break;
                    case 53:
                        str = str4;
                        defpackage.dse dseVar11 = dsaVar.e;
                        dseVar11.m = typedArrayObtainStyledAttributes.getDimension(index2, dseVar11.m);
                        break;
                    case 54:
                        str = str4;
                        defpackage.dsb dsbVar41 = dsaVar.d;
                        dsbVar41.Z = typedArrayObtainStyledAttributes.getInt(index2, dsbVar41.Z);
                        break;
                    case 55:
                        str = str4;
                        defpackage.dsb dsbVar42 = dsaVar.d;
                        dsbVar42.aa = typedArrayObtainStyledAttributes.getInt(index2, dsbVar42.aa);
                        break;
                    case 56:
                        str = str4;
                        defpackage.dsb dsbVar43 = dsaVar.d;
                        dsbVar43.ab = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, dsbVar43.ab);
                        break;
                    case 57:
                        str = str4;
                        defpackage.dsb dsbVar44 = dsaVar.d;
                        dsbVar44.ac = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, dsbVar44.ac);
                        break;
                    case 58:
                        str = str4;
                        defpackage.dsb dsbVar45 = dsaVar.d;
                        dsbVar45.ad = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, dsbVar45.ad);
                        break;
                    case 59:
                        str = str4;
                        defpackage.dsb dsbVar46 = dsaVar.d;
                        dsbVar46.ae = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, dsbVar46.ae);
                        break;
                    case 60:
                        str = str4;
                        defpackage.dse dseVar12 = dsaVar.e;
                        dseVar12.c = typedArrayObtainStyledAttributes.getFloat(index2, dseVar12.c);
                        break;
                    case 61:
                        str = str4;
                        defpackage.dsb dsbVar47 = dsaVar.d;
                        dsbVar47.B = a(typedArrayObtainStyledAttributes, index2, dsbVar47.B);
                        break;
                    case 62:
                        str = str4;
                        defpackage.dsb dsbVar48 = dsaVar.d;
                        dsbVar48.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, dsbVar48.C);
                        break;
                    case 63:
                        str = str4;
                        defpackage.dsb dsbVar49 = dsaVar.d;
                        dsbVar49.D = typedArrayObtainStyledAttributes.getFloat(index2, dsbVar49.D);
                        break;
                    case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                        str = str4;
                        defpackage.dsc dscVar2 = dsaVar.c;
                        dscVar2.c = a(typedArrayObtainStyledAttributes, index2, dscVar2.c);
                        break;
                    case 65:
                        str = str4;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type != 3) {
                            dsaVar.c.e = defpackage.dpl.a[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                        } else {
                            dsaVar.c.e = typedArrayObtainStyledAttributes.getString(index2);
                        }
                        break;
                    case 66:
                        str = str4;
                        dsaVar.c.g = typedArrayObtainStyledAttributes.getInt(index2, 0);
                        break;
                    case 67:
                        str = str4;
                        defpackage.dsc dscVar3 = dsaVar.c;
                        dscVar3.j = typedArrayObtainStyledAttributes.getFloat(index2, dscVar3.j);
                        break;
                    case 68:
                        str = str4;
                        defpackage.dsd dsdVar4 = dsaVar.b;
                        dsdVar4.e = typedArrayObtainStyledAttributes.getFloat(index2, dsdVar4.e);
                        break;
                    case 69:
                        str = str4;
                        dsaVar.d.af = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        str = str4;
                        dsaVar.d.ag = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        str = str4;
                        android.util.Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        str = str4;
                        defpackage.dsb dsbVar50 = dsaVar.d;
                        dsbVar50.ah = typedArrayObtainStyledAttributes.getInt(index2, dsbVar50.ah);
                        break;
                    case 73:
                        str = str4;
                        defpackage.dsb dsbVar51 = dsaVar.d;
                        dsbVar51.ai = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, dsbVar51.ai);
                        break;
                    case 74:
                        str = str4;
                        dsaVar.d.al = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        str = str4;
                        defpackage.dsb dsbVar52 = dsaVar.d;
                        dsbVar52.ap = typedArrayObtainStyledAttributes.getBoolean(index2, dsbVar52.ap);
                        break;
                    case 76:
                        str = str4;
                        defpackage.dsc dscVar4 = dsaVar.c;
                        dscVar4.f = typedArrayObtainStyledAttributes.getInt(index2, dscVar4.f);
                        break;
                    case 77:
                        str = str4;
                        dsaVar.d.am = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        str = str4;
                        defpackage.dsd dsdVar5 = dsaVar.b;
                        dsdVar5.c = typedArrayObtainStyledAttributes.getInt(index2, dsdVar5.c);
                        break;
                    case 79:
                        str = str4;
                        defpackage.dsc dscVar5 = dsaVar.c;
                        dscVar5.h = typedArrayObtainStyledAttributes.getFloat(index2, dscVar5.h);
                        break;
                    case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                        str = str4;
                        defpackage.dsb dsbVar53 = dsaVar.d;
                        dsbVar53.an = typedArrayObtainStyledAttributes.getBoolean(index2, dsbVar53.an);
                        break;
                    case 81:
                        str = str4;
                        defpackage.dsb dsbVar54 = dsaVar.d;
                        dsbVar54.ao = typedArrayObtainStyledAttributes.getBoolean(index2, dsbVar54.ao);
                        break;
                    case 82:
                        str = str4;
                        defpackage.dsc dscVar6 = dsaVar.c;
                        dscVar6.d = typedArrayObtainStyledAttributes.getInteger(index2, dscVar6.d);
                        break;
                    case 83:
                        str = str4;
                        defpackage.dse dseVar13 = dsaVar.e;
                        dseVar13.j = a(typedArrayObtainStyledAttributes, index2, dseVar13.j);
                        break;
                    case 84:
                        str = str4;
                        defpackage.dsc dscVar7 = dsaVar.c;
                        dscVar7.l = typedArrayObtainStyledAttributes.getInteger(index2, dscVar7.l);
                        break;
                    case 85:
                        str = str4;
                        defpackage.dsc dscVar8 = dsaVar.c;
                        dscVar8.k = typedArrayObtainStyledAttributes.getFloat(index2, dscVar8.k);
                        break;
                    case 86:
                        str = str4;
                        android.util.TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(index2);
                        if (typedValuePeekValue2.type == 1) {
                            dsaVar.c.n = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (typedValuePeekValue2.type == 3) {
                            defpackage.dsc dscVar9 = dsaVar.c;
                            dscVar9.m = typedArrayObtainStyledAttributes.getString(index2);
                            if (dscVar9.m.indexOf("/") > 0) {
                                dscVar9.n = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, dsaVar.c.n);
                        }
                        break;
                    case 87:
                        str = str4;
                        android.util.Log.w("ConstraintSet", str + java.lang.Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str = str4;
                        android.util.Log.w("ConstraintSet", "Unknown attribute 0x" + java.lang.Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 91:
                        defpackage.dsb dsbVar55 = dsaVar.d;
                        dsbVar55.s = a(typedArrayObtainStyledAttributes, index2, dsbVar55.s);
                        str = str4;
                        break;
                    case 92:
                        defpackage.dsb dsbVar56 = dsaVar.d;
                        dsbVar56.t = a(typedArrayObtainStyledAttributes, index2, dsbVar56.t);
                        str = str4;
                        break;
                    case 93:
                        defpackage.dsb dsbVar57 = dsaVar.d;
                        dsbVar57.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, dsbVar57.N);
                        str = str4;
                        break;
                    case 94:
                        defpackage.dsb dsbVar58 = dsaVar.d;
                        dsbVar58.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, dsbVar58.U);
                        str = str4;
                        break;
                    case 95:
                        m(dsaVar.d, typedArrayObtainStyledAttributes, index2, 0);
                        str = str4;
                        break;
                    case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                        m(dsaVar.d, typedArrayObtainStyledAttributes, index2, 1);
                        str = str4;
                        break;
                    case 97:
                        defpackage.dsb dsbVar59 = dsaVar.d;
                        dsbVar59.aq = typedArrayObtainStyledAttributes.getInt(index2, dsbVar59.aq);
                        str = str4;
                        break;
                }
                i4++;
                str4 = str;
            }
            defpackage.dsb dsbVar60 = dsaVar.d;
            if (dsbVar60.al != null) {
                dsbVar60.ak = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return dsaVar;
    }

    private static final java.lang.String u(int i) {
        if (i != 1) {
            return i != 2 ? "top" : "right";
        }
        return "left";
    }

    public final defpackage.dsa b(int i) {
        java.util.HashMap map = this.e;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new defpackage.dsa());
        }
        return (defpackage.dsa) map.get(numValueOf);
    }

    public final void c(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        q(constraintLayout);
        constraintLayout.f = null;
        constraintLayout.requestLayout();
    }

    public final void d(int i, int i2) {
        defpackage.dsa dsaVar;
        java.util.HashMap map = this.e;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (!map.containsKey(numValueOf) || (dsaVar = (defpackage.dsa) map.get(numValueOf)) == null) {
            return;
        }
        if (i2 == 1) {
            defpackage.dsb dsbVar = dsaVar.d;
            dsbVar.k = -1;
            dsbVar.j = -1;
            dsbVar.H = -1;
            dsbVar.O = Integer.MIN_VALUE;
            return;
        }
        if (i2 == 2) {
            defpackage.dsb dsbVar2 = dsaVar.d;
            dsbVar2.m = -1;
            dsbVar2.l = -1;
            dsbVar2.I = -1;
            dsbVar2.Q = Integer.MIN_VALUE;
            return;
        }
        defpackage.dsb dsbVar3 = dsaVar.d;
        if (i2 != 3) {
            dsbVar3.p = -1;
            dsbVar3.q = -1;
            dsbVar3.K = 0;
            dsbVar3.R = Integer.MIN_VALUE;
            return;
        }
        dsbVar3.o = -1;
        dsbVar3.n = -1;
        dsbVar3.J = 0;
        dsbVar3.P = Integer.MIN_VALUE;
    }

    public final void e(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        int i;
        java.util.HashMap map;
        java.util.HashMap map2;
        defpackage.dsf dsfVar = this;
        int childCount = constraintLayout.getChildCount();
        java.util.HashMap map3 = dsfVar.e;
        map3.clear();
        int i2 = 0;
        while (i2 < childCount) {
            android.view.View childAt = constraintLayout.getChildAt(i2);
            defpackage.drv drvVar = (defpackage.drv) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new java.lang.RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(id);
            if (!map3.containsKey(numValueOf)) {
                map3.put(numValueOf, new defpackage.dsa());
            }
            defpackage.dsa dsaVar = (defpackage.dsa) map3.get(numValueOf);
            if (dsaVar == null) {
                i = childCount;
                map = map3;
            } else {
                java.util.HashMap map4 = dsfVar.d;
                java.util.HashMap map5 = new java.util.HashMap();
                java.lang.Class<?> cls = childAt.getClass();
                for (java.lang.String str : map4.keySet()) {
                    defpackage.drs drsVar = (defpackage.drs) map4.get(str);
                    int i3 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map5.put(str, new defpackage.drs(drsVar, java.lang.Integer.valueOf(((android.graphics.drawable.ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (java.lang.IllegalAccessException e) {
                                e = e;
                                android.util.Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                            } catch (java.lang.NoSuchMethodException e2) {
                                e = e2;
                                android.util.Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                            } catch (java.lang.reflect.InvocationTargetException e3) {
                                e = e3;
                                android.util.Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                            }
                        } else {
                            map2 = map3;
                            map5.put(str, new defpackage.drs(drsVar, cls.getMethod(defpackage.a.bA(str, "getMap"), null).invoke(childAt, null)));
                        }
                    } catch (java.lang.IllegalAccessException e4) {
                        e = e4;
                        map2 = map3;
                    } catch (java.lang.NoSuchMethodException e5) {
                        e = e5;
                        map2 = map3;
                    } catch (java.lang.reflect.InvocationTargetException e6) {
                        e = e6;
                        map2 = map3;
                    }
                    childCount = i3;
                    map3 = map2;
                }
                i = childCount;
                map = map3;
                dsaVar.f = map5;
                dsaVar.a = id;
                int i4 = drvVar.e;
                defpackage.dsb dsbVar = dsaVar.d;
                dsbVar.j = i4;
                dsbVar.k = drvVar.f;
                dsbVar.l = drvVar.g;
                dsbVar.m = drvVar.h;
                dsbVar.n = drvVar.i;
                dsbVar.o = drvVar.j;
                dsbVar.p = drvVar.k;
                dsbVar.q = drvVar.l;
                dsbVar.r = drvVar.m;
                dsbVar.s = drvVar.n;
                dsbVar.t = drvVar.o;
                dsbVar.u = drvVar.s;
                dsbVar.v = drvVar.t;
                dsbVar.w = drvVar.u;
                dsbVar.x = drvVar.v;
                dsbVar.y = drvVar.G;
                dsbVar.z = drvVar.H;
                dsbVar.A = drvVar.I;
                dsbVar.B = drvVar.p;
                dsbVar.C = drvVar.q;
                dsbVar.D = drvVar.r;
                dsbVar.E = drvVar.X;
                dsbVar.F = drvVar.Y;
                dsbVar.G = drvVar.Z;
                dsbVar.h = drvVar.c;
                dsbVar.f = drvVar.a;
                dsbVar.g = drvVar.b;
                dsbVar.d = drvVar.width;
                dsbVar.e = drvVar.height;
                dsbVar.H = drvVar.leftMargin;
                dsbVar.I = drvVar.rightMargin;
                dsbVar.J = drvVar.topMargin;
                dsbVar.K = drvVar.bottomMargin;
                dsbVar.N = drvVar.D;
                dsbVar.V = drvVar.M;
                dsbVar.W = drvVar.L;
                dsbVar.Y = drvVar.O;
                dsbVar.X = drvVar.N;
                dsbVar.an = drvVar.aa;
                dsbVar.ao = drvVar.ab;
                dsbVar.Z = drvVar.P;
                dsbVar.aa = drvVar.Q;
                dsbVar.ab = drvVar.T;
                dsbVar.ac = drvVar.U;
                dsbVar.ad = drvVar.R;
                dsbVar.ae = drvVar.S;
                dsbVar.af = drvVar.V;
                dsbVar.ag = drvVar.W;
                dsbVar.am = drvVar.ac;
                dsbVar.P = drvVar.x;
                dsbVar.R = drvVar.z;
                dsbVar.O = drvVar.w;
                dsbVar.Q = drvVar.y;
                dsbVar.T = drvVar.A;
                dsbVar.S = drvVar.B;
                dsbVar.U = drvVar.C;
                dsbVar.aq = drvVar.ad;
                dsbVar.L = drvVar.getMarginEnd();
                dsbVar.M = drvVar.getMarginStart();
                defpackage.dsd dsdVar = dsaVar.b;
                dsdVar.b = childAt.getVisibility();
                dsdVar.d = childAt.getAlpha();
                defpackage.dse dseVar = dsaVar.e;
                dseVar.c = childAt.getRotation();
                dseVar.d = childAt.getRotationX();
                dseVar.e = childAt.getRotationY();
                dseVar.f = childAt.getScaleX();
                dseVar.g = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    dseVar.h = pivotX;
                    dseVar.i = pivotY;
                }
                dseVar.k = childAt.getTranslationX();
                dseVar.l = childAt.getTranslationY();
                dseVar.m = childAt.getTranslationZ();
                if (dseVar.n) {
                    dseVar.o = childAt.getElevation();
                }
                if (childAt instanceof androidx.constraintlayout.widget.Barrier) {
                    androidx.constraintlayout.widget.Barrier barrier = (androidx.constraintlayout.widget.Barrier) childAt;
                    dsbVar.ap = barrier.b.b;
                    dsbVar.ak = java.util.Arrays.copyOf(barrier.c, barrier.d);
                    dsbVar.ah = barrier.a;
                    dsbVar.ai = barrier.b.c;
                }
            }
            i2++;
            dsfVar = this;
            childCount = i;
            map3 = map;
        }
    }

    public final void f(android.content.Context context, int i) {
        e((androidx.constraintlayout.widget.ConstraintLayout) android.view.LayoutInflater.from(context).inflate(i, (android.view.ViewGroup) null));
    }

    public final void g(int i, int i2, int i3, int i4) {
        java.util.HashMap map = this.e;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new defpackage.dsa());
        }
        defpackage.dsa dsaVar = (defpackage.dsa) map.get(numValueOf);
        if (dsaVar == null) {
            return;
        }
        if (i2 == 1) {
            if (i4 == 1) {
                defpackage.dsb dsbVar = dsaVar.d;
                dsbVar.j = i3;
                dsbVar.k = -1;
                return;
            } else if (i4 == 2) {
                defpackage.dsb dsbVar2 = dsaVar.d;
                dsbVar2.k = i3;
                dsbVar2.j = -1;
                return;
            } else {
                throw new java.lang.IllegalArgumentException("left to " + u(3) + " undefined");
            }
        }
        if (i2 == 2) {
            if (i4 == 1) {
                defpackage.dsb dsbVar3 = dsaVar.d;
                dsbVar3.l = i3;
                dsbVar3.m = -1;
                return;
            } else if (i4 == 2) {
                defpackage.dsb dsbVar4 = dsaVar.d;
                dsbVar4.m = i3;
                dsbVar4.l = -1;
                return;
            } else {
                throw new java.lang.IllegalArgumentException("right to " + u(3) + " undefined");
            }
        }
        if (i2 != 3) {
            if (i4 != 3) {
                throw new java.lang.IllegalArgumentException("right to " + u(i4) + " undefined");
            }
            defpackage.dsb dsbVar5 = dsaVar.d;
            dsbVar5.p = i3;
            dsbVar5.q = -1;
            dsbVar5.r = -1;
            dsbVar5.s = -1;
            dsbVar5.t = -1;
            return;
        }
        if (i4 != 3) {
            throw new java.lang.IllegalArgumentException("right to " + u(i4) + " undefined");
        }
        defpackage.dsb dsbVar6 = dsaVar.d;
        dsbVar6.n = i3;
        dsbVar6.o = -1;
        dsbVar6.r = -1;
        dsbVar6.s = -1;
        dsbVar6.t = -1;
    }

    public final void h(int i, int i2) {
        b(i).d.e = i2;
    }

    public final void i(int i, int i2) {
        b(i).d.d = i2;
    }

    public final void j(int i, int i2) {
        defpackage.dsb dsbVar = b(i).d;
        dsbVar.b = true;
        dsbVar.G = i2;
    }

    public final void k(android.content.Context context, int i) {
        android.content.res.XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    java.lang.String name = xml.getName();
                    defpackage.dsa dsaVarT = t(context, android.util.Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        dsaVarT.d.b = true;
                    }
                    this.e.put(java.lang.Integer.valueOf(dsaVarT.a), dsaVarT);
                }
            }
        } catch (java.io.IOException e) {
            android.util.Log.e("ConstraintSet", defpackage.a.bo(i, "Error parsing resource: "), e);
        } catch (org.xmlpull.v1.XmlPullParserException e2) {
            android.util.Log.e("ConstraintSet", defpackage.a.bo(i, "Error parsing resource: "), e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:277:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac A[Catch: IOException -> 0x073a, XmlPullParserException -> 0x073f, TRY_ENTER, TryCatch #2 {IOException -> 0x073a, XmlPullParserException -> 0x073f, blocks: (B:3:0x0006, B:265:0x0732, B:11:0x0017, B:26:0x0051, B:27:0x005f, B:33:0x0079, B:45:0x00ac, B:47:0x00c6, B:49:0x00cc, B:51:0x00d2, B:53:0x00d8, B:86:0x018f, B:56:0x00f9, B:59:0x0104, B:61:0x0112, B:64:0x0120, B:67:0x012f, B:70:0x0147, B:73:0x0155, B:75:0x0164, B:78:0x0174, B:82:0x017f, B:84:0x0186, B:85:0x018a, B:90:0x019b, B:91:0x01a7, B:92:0x01ac, B:93:0x01c4, B:40:0x0094, B:96:0x01cd, B:101:0x01e7, B:103:0x01fb, B:104:0x0205, B:118:0x0277, B:106:0x020a, B:107:0x0213, B:108:0x021e, B:109:0x0227, B:110:0x0230, B:111:0x0239, B:112:0x0242, B:113:0x024b, B:114:0x0254, B:115:0x025d, B:116:0x0266, B:117:0x026f, B:119:0x027b, B:120:0x0280, B:121:0x0298, B:125:0x02a3, B:127:0x02b8, B:129:0x02be, B:139:0x02f0, B:132:0x02ca, B:135:0x02dc, B:138:0x02e8, B:140:0x02f3, B:141:0x02f8, B:142:0x0310, B:145:0x0319, B:150:0x032d, B:152:0x0342, B:153:0x034c, B:177:0x03f2, B:156:0x0353, B:158:0x035b, B:159:0x0363, B:161:0x0368, B:163:0x0378, B:164:0x0380, B:165:0x0387, B:166:0x0391, B:167:0x039b, B:168:0x03a5, B:169:0x03af, B:170:0x03b9, B:171:0x03c1, B:173:0x03cb, B:174:0x03d2, B:175:0x03dd, B:176:0x03e8, B:178:0x03f6, B:179:0x03fb, B:180:0x0413, B:184:0x041e, B:186:0x0433, B:191:0x044a, B:260:0x070c, B:192:0x046e, B:193:0x0492, B:194:0x049c, B:195:0x04a4, B:196:0x04ae, B:197:0x04b8, B:198:0x04c2, B:199:0x04cc, B:200:0x04d6, B:201:0x04e0, B:202:0x04ea, B:203:0x04f4, B:204:0x04fe, B:205:0x0508, B:206:0x0512, B:207:0x051c, B:208:0x0526, B:209:0x0530, B:210:0x0538, B:211:0x0542, B:212:0x054c, B:213:0x0553, B:214:0x055b, B:215:0x0563, B:216:0x056d, B:217:0x0577, B:218:0x0581, B:219:0x0586, B:220:0x058b, B:221:0x0595, B:222:0x059f, B:223:0x05a9, B:224:0x05b3, B:225:0x05bd, B:226:0x05c7, B:227:0x05d1, B:228:0x05db, B:229:0x05e5, B:230:0x05ef, B:231:0x05f9, B:232:0x0603, B:233:0x060d, B:234:0x0617, B:235:0x0621, B:236:0x062b, B:237:0x0635, B:238:0x063f, B:239:0x0649, B:240:0x0653, B:241:0x065d, B:242:0x0667, B:243:0x0671, B:244:0x067b, B:245:0x0685, B:246:0x068f, B:247:0x0699, B:248:0x06a3, B:249:0x06ac, B:250:0x06b5, B:251:0x06be, B:252:0x06c7, B:253:0x06d0, B:254:0x06d9, B:255:0x06e2, B:256:0x06e9, B:257:0x06f2, B:258:0x06fb, B:259:0x0704, B:261:0x0710, B:262:0x0714, B:263:0x072c, B:264:0x072d), top: B:274:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c6 A[Catch: IOException -> 0x073a, XmlPullParserException -> 0x073f, TryCatch #2 {IOException -> 0x073a, XmlPullParserException -> 0x073f, blocks: (B:3:0x0006, B:265:0x0732, B:11:0x0017, B:26:0x0051, B:27:0x005f, B:33:0x0079, B:45:0x00ac, B:47:0x00c6, B:49:0x00cc, B:51:0x00d2, B:53:0x00d8, B:86:0x018f, B:56:0x00f9, B:59:0x0104, B:61:0x0112, B:64:0x0120, B:67:0x012f, B:70:0x0147, B:73:0x0155, B:75:0x0164, B:78:0x0174, B:82:0x017f, B:84:0x0186, B:85:0x018a, B:90:0x019b, B:91:0x01a7, B:92:0x01ac, B:93:0x01c4, B:40:0x0094, B:96:0x01cd, B:101:0x01e7, B:103:0x01fb, B:104:0x0205, B:118:0x0277, B:106:0x020a, B:107:0x0213, B:108:0x021e, B:109:0x0227, B:110:0x0230, B:111:0x0239, B:112:0x0242, B:113:0x024b, B:114:0x0254, B:115:0x025d, B:116:0x0266, B:117:0x026f, B:119:0x027b, B:120:0x0280, B:121:0x0298, B:125:0x02a3, B:127:0x02b8, B:129:0x02be, B:139:0x02f0, B:132:0x02ca, B:135:0x02dc, B:138:0x02e8, B:140:0x02f3, B:141:0x02f8, B:142:0x0310, B:145:0x0319, B:150:0x032d, B:152:0x0342, B:153:0x034c, B:177:0x03f2, B:156:0x0353, B:158:0x035b, B:159:0x0363, B:161:0x0368, B:163:0x0378, B:164:0x0380, B:165:0x0387, B:166:0x0391, B:167:0x039b, B:168:0x03a5, B:169:0x03af, B:170:0x03b9, B:171:0x03c1, B:173:0x03cb, B:174:0x03d2, B:175:0x03dd, B:176:0x03e8, B:178:0x03f6, B:179:0x03fb, B:180:0x0413, B:184:0x041e, B:186:0x0433, B:191:0x044a, B:260:0x070c, B:192:0x046e, B:193:0x0492, B:194:0x049c, B:195:0x04a4, B:196:0x04ae, B:197:0x04b8, B:198:0x04c2, B:199:0x04cc, B:200:0x04d6, B:201:0x04e0, B:202:0x04ea, B:203:0x04f4, B:204:0x04fe, B:205:0x0508, B:206:0x0512, B:207:0x051c, B:208:0x0526, B:209:0x0530, B:210:0x0538, B:211:0x0542, B:212:0x054c, B:213:0x0553, B:214:0x055b, B:215:0x0563, B:216:0x056d, B:217:0x0577, B:218:0x0581, B:219:0x0586, B:220:0x058b, B:221:0x0595, B:222:0x059f, B:223:0x05a9, B:224:0x05b3, B:225:0x05bd, B:226:0x05c7, B:227:0x05d1, B:228:0x05db, B:229:0x05e5, B:230:0x05ef, B:231:0x05f9, B:232:0x0603, B:233:0x060d, B:234:0x0617, B:235:0x0621, B:236:0x062b, B:237:0x0635, B:238:0x063f, B:239:0x0649, B:240:0x0653, B:241:0x065d, B:242:0x0667, B:243:0x0671, B:244:0x067b, B:245:0x0685, B:246:0x068f, B:247:0x0699, B:248:0x06a3, B:249:0x06ac, B:250:0x06b5, B:251:0x06be, B:252:0x06c7, B:253:0x06d0, B:254:0x06d9, B:255:0x06e2, B:256:0x06e9, B:257:0x06f2, B:258:0x06fb, B:259:0x0704, B:261:0x0710, B:262:0x0714, B:263:0x072c, B:264:0x072d), top: B:274:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cc A[Catch: IOException -> 0x073a, XmlPullParserException -> 0x073f, TryCatch #2 {IOException -> 0x073a, XmlPullParserException -> 0x073f, blocks: (B:3:0x0006, B:265:0x0732, B:11:0x0017, B:26:0x0051, B:27:0x005f, B:33:0x0079, B:45:0x00ac, B:47:0x00c6, B:49:0x00cc, B:51:0x00d2, B:53:0x00d8, B:86:0x018f, B:56:0x00f9, B:59:0x0104, B:61:0x0112, B:64:0x0120, B:67:0x012f, B:70:0x0147, B:73:0x0155, B:75:0x0164, B:78:0x0174, B:82:0x017f, B:84:0x0186, B:85:0x018a, B:90:0x019b, B:91:0x01a7, B:92:0x01ac, B:93:0x01c4, B:40:0x0094, B:96:0x01cd, B:101:0x01e7, B:103:0x01fb, B:104:0x0205, B:118:0x0277, B:106:0x020a, B:107:0x0213, B:108:0x021e, B:109:0x0227, B:110:0x0230, B:111:0x0239, B:112:0x0242, B:113:0x024b, B:114:0x0254, B:115:0x025d, B:116:0x0266, B:117:0x026f, B:119:0x027b, B:120:0x0280, B:121:0x0298, B:125:0x02a3, B:127:0x02b8, B:129:0x02be, B:139:0x02f0, B:132:0x02ca, B:135:0x02dc, B:138:0x02e8, B:140:0x02f3, B:141:0x02f8, B:142:0x0310, B:145:0x0319, B:150:0x032d, B:152:0x0342, B:153:0x034c, B:177:0x03f2, B:156:0x0353, B:158:0x035b, B:159:0x0363, B:161:0x0368, B:163:0x0378, B:164:0x0380, B:165:0x0387, B:166:0x0391, B:167:0x039b, B:168:0x03a5, B:169:0x03af, B:170:0x03b9, B:171:0x03c1, B:173:0x03cb, B:174:0x03d2, B:175:0x03dd, B:176:0x03e8, B:178:0x03f6, B:179:0x03fb, B:180:0x0413, B:184:0x041e, B:186:0x0433, B:191:0x044a, B:260:0x070c, B:192:0x046e, B:193:0x0492, B:194:0x049c, B:195:0x04a4, B:196:0x04ae, B:197:0x04b8, B:198:0x04c2, B:199:0x04cc, B:200:0x04d6, B:201:0x04e0, B:202:0x04ea, B:203:0x04f4, B:204:0x04fe, B:205:0x0508, B:206:0x0512, B:207:0x051c, B:208:0x0526, B:209:0x0530, B:210:0x0538, B:211:0x0542, B:212:0x054c, B:213:0x0553, B:214:0x055b, B:215:0x0563, B:216:0x056d, B:217:0x0577, B:218:0x0581, B:219:0x0586, B:220:0x058b, B:221:0x0595, B:222:0x059f, B:223:0x05a9, B:224:0x05b3, B:225:0x05bd, B:226:0x05c7, B:227:0x05d1, B:228:0x05db, B:229:0x05e5, B:230:0x05ef, B:231:0x05f9, B:232:0x0603, B:233:0x060d, B:234:0x0617, B:235:0x0621, B:236:0x062b, B:237:0x0635, B:238:0x063f, B:239:0x0649, B:240:0x0653, B:241:0x065d, B:242:0x0667, B:243:0x0671, B:244:0x067b, B:245:0x0685, B:246:0x068f, B:247:0x0699, B:248:0x06a3, B:249:0x06ac, B:250:0x06b5, B:251:0x06be, B:252:0x06c7, B:253:0x06d0, B:254:0x06d9, B:255:0x06e2, B:256:0x06e9, B:257:0x06f2, B:258:0x06fb, B:259:0x0704, B:261:0x0710, B:262:0x0714, B:263:0x072c, B:264:0x072d), top: B:274:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f9 A[Catch: IOException -> 0x073a, XmlPullParserException -> 0x073f, TryCatch #2 {IOException -> 0x073a, XmlPullParserException -> 0x073f, blocks: (B:3:0x0006, B:265:0x0732, B:11:0x0017, B:26:0x0051, B:27:0x005f, B:33:0x0079, B:45:0x00ac, B:47:0x00c6, B:49:0x00cc, B:51:0x00d2, B:53:0x00d8, B:86:0x018f, B:56:0x00f9, B:59:0x0104, B:61:0x0112, B:64:0x0120, B:67:0x012f, B:70:0x0147, B:73:0x0155, B:75:0x0164, B:78:0x0174, B:82:0x017f, B:84:0x0186, B:85:0x018a, B:90:0x019b, B:91:0x01a7, B:92:0x01ac, B:93:0x01c4, B:40:0x0094, B:96:0x01cd, B:101:0x01e7, B:103:0x01fb, B:104:0x0205, B:118:0x0277, B:106:0x020a, B:107:0x0213, B:108:0x021e, B:109:0x0227, B:110:0x0230, B:111:0x0239, B:112:0x0242, B:113:0x024b, B:114:0x0254, B:115:0x025d, B:116:0x0266, B:117:0x026f, B:119:0x027b, B:120:0x0280, B:121:0x0298, B:125:0x02a3, B:127:0x02b8, B:129:0x02be, B:139:0x02f0, B:132:0x02ca, B:135:0x02dc, B:138:0x02e8, B:140:0x02f3, B:141:0x02f8, B:142:0x0310, B:145:0x0319, B:150:0x032d, B:152:0x0342, B:153:0x034c, B:177:0x03f2, B:156:0x0353, B:158:0x035b, B:159:0x0363, B:161:0x0368, B:163:0x0378, B:164:0x0380, B:165:0x0387, B:166:0x0391, B:167:0x039b, B:168:0x03a5, B:169:0x03af, B:170:0x03b9, B:171:0x03c1, B:173:0x03cb, B:174:0x03d2, B:175:0x03dd, B:176:0x03e8, B:178:0x03f6, B:179:0x03fb, B:180:0x0413, B:184:0x041e, B:186:0x0433, B:191:0x044a, B:260:0x070c, B:192:0x046e, B:193:0x0492, B:194:0x049c, B:195:0x04a4, B:196:0x04ae, B:197:0x04b8, B:198:0x04c2, B:199:0x04cc, B:200:0x04d6, B:201:0x04e0, B:202:0x04ea, B:203:0x04f4, B:204:0x04fe, B:205:0x0508, B:206:0x0512, B:207:0x051c, B:208:0x0526, B:209:0x0530, B:210:0x0538, B:211:0x0542, B:212:0x054c, B:213:0x0553, B:214:0x055b, B:215:0x0563, B:216:0x056d, B:217:0x0577, B:218:0x0581, B:219:0x0586, B:220:0x058b, B:221:0x0595, B:222:0x059f, B:223:0x05a9, B:224:0x05b3, B:225:0x05bd, B:226:0x05c7, B:227:0x05d1, B:228:0x05db, B:229:0x05e5, B:230:0x05ef, B:231:0x05f9, B:232:0x0603, B:233:0x060d, B:234:0x0617, B:235:0x0621, B:236:0x062b, B:237:0x0635, B:238:0x063f, B:239:0x0649, B:240:0x0653, B:241:0x065d, B:242:0x0667, B:243:0x0671, B:244:0x067b, B:245:0x0685, B:246:0x068f, B:247:0x0699, B:248:0x06a3, B:249:0x06ac, B:250:0x06b5, B:251:0x06be, B:252:0x06c7, B:253:0x06d0, B:254:0x06d9, B:255:0x06e2, B:256:0x06e9, B:257:0x06f2, B:258:0x06fb, B:259:0x0704, B:261:0x0710, B:262:0x0714, B:263:0x072c, B:264:0x072d), top: B:274:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0101  */
    /* JADX WARN: Code duplicated, block: B:59:0x0104 A[Catch: IOException -> 0x073a, XmlPullParserException -> 0x073f, TryCatch #2 {IOException -> 0x073a, XmlPullParserException -> 0x073f, blocks: (B:3:0x0006, B:265:0x0732, B:11:0x0017, B:26:0x0051, B:27:0x005f, B:33:0x0079, B:45:0x00ac, B:47:0x00c6, B:49:0x00cc, B:51:0x00d2, B:53:0x00d8, B:86:0x018f, B:56:0x00f9, B:59:0x0104, B:61:0x0112, B:64:0x0120, B:67:0x012f, B:70:0x0147, B:73:0x0155, B:75:0x0164, B:78:0x0174, B:82:0x017f, B:84:0x0186, B:85:0x018a, B:90:0x019b, B:91:0x01a7, B:92:0x01ac, B:93:0x01c4, B:40:0x0094, B:96:0x01cd, B:101:0x01e7, B:103:0x01fb, B:104:0x0205, B:118:0x0277, B:106:0x020a, B:107:0x0213, B:108:0x021e, B:109:0x0227, B:110:0x0230, B:111:0x0239, B:112:0x0242, B:113:0x024b, B:114:0x0254, B:115:0x025d, B:116:0x0266, B:117:0x026f, B:119:0x027b, B:120:0x0280, B:121:0x0298, B:125:0x02a3, B:127:0x02b8, B:129:0x02be, B:139:0x02f0, B:132:0x02ca, B:135:0x02dc, B:138:0x02e8, B:140:0x02f3, B:141:0x02f8, B:142:0x0310, B:145:0x0319, B:150:0x032d, B:152:0x0342, B:153:0x034c, B:177:0x03f2, B:156:0x0353, B:158:0x035b, B:159:0x0363, B:161:0x0368, B:163:0x0378, B:164:0x0380, B:165:0x0387, B:166:0x0391, B:167:0x039b, B:168:0x03a5, B:169:0x03af, B:170:0x03b9, B:171:0x03c1, B:173:0x03cb, B:174:0x03d2, B:175:0x03dd, B:176:0x03e8, B:178:0x03f6, B:179:0x03fb, B:180:0x0413, B:184:0x041e, B:186:0x0433, B:191:0x044a, B:260:0x070c, B:192:0x046e, B:193:0x0492, B:194:0x049c, B:195:0x04a4, B:196:0x04ae, B:197:0x04b8, B:198:0x04c2, B:199:0x04cc, B:200:0x04d6, B:201:0x04e0, B:202:0x04ea, B:203:0x04f4, B:204:0x04fe, B:205:0x0508, B:206:0x0512, B:207:0x051c, B:208:0x0526, B:209:0x0530, B:210:0x0538, B:211:0x0542, B:212:0x054c, B:213:0x0553, B:214:0x055b, B:215:0x0563, B:216:0x056d, B:217:0x0577, B:218:0x0581, B:219:0x0586, B:220:0x058b, B:221:0x0595, B:222:0x059f, B:223:0x05a9, B:224:0x05b3, B:225:0x05bd, B:226:0x05c7, B:227:0x05d1, B:228:0x05db, B:229:0x05e5, B:230:0x05ef, B:231:0x05f9, B:232:0x0603, B:233:0x060d, B:234:0x0617, B:235:0x0621, B:236:0x062b, B:237:0x0635, B:238:0x063f, B:239:0x0649, B:240:0x0653, B:241:0x065d, B:242:0x0667, B:243:0x0671, B:244:0x067b, B:245:0x0685, B:246:0x068f, B:247:0x0699, B:248:0x06a3, B:249:0x06ac, B:250:0x06b5, B:251:0x06be, B:252:0x06c7, B:253:0x06d0, B:254:0x06d9, B:255:0x06e2, B:256:0x06e9, B:257:0x06f2, B:258:0x06fb, B:259:0x0704, B:261:0x0710, B:262:0x0714, B:263:0x072c, B:264:0x072d), top: B:274:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0112 A[Catch: IOException -> 0x073a, XmlPullParserException -> 0x073f, TryCatch #2 {IOException -> 0x073a, XmlPullParserException -> 0x073f, blocks: (B:3:0x0006, B:265:0x0732, B:11:0x0017, B:26:0x0051, B:27:0x005f, B:33:0x0079, B:45:0x00ac, B:47:0x00c6, B:49:0x00cc, B:51:0x00d2, B:53:0x00d8, B:86:0x018f, B:56:0x00f9, B:59:0x0104, B:61:0x0112, B:64:0x0120, B:67:0x012f, B:70:0x0147, B:73:0x0155, B:75:0x0164, B:78:0x0174, B:82:0x017f, B:84:0x0186, B:85:0x018a, B:90:0x019b, B:91:0x01a7, B:92:0x01ac, B:93:0x01c4, B:40:0x0094, B:96:0x01cd, B:101:0x01e7, B:103:0x01fb, B:104:0x0205, B:118:0x0277, B:106:0x020a, B:107:0x0213, B:108:0x021e, B:109:0x0227, B:110:0x0230, B:111:0x0239, B:112:0x0242, B:113:0x024b, B:114:0x0254, B:115:0x025d, B:116:0x0266, B:117:0x026f, B:119:0x027b, B:120:0x0280, B:121:0x0298, B:125:0x02a3, B:127:0x02b8, B:129:0x02be, B:139:0x02f0, B:132:0x02ca, B:135:0x02dc, B:138:0x02e8, B:140:0x02f3, B:141:0x02f8, B:142:0x0310, B:145:0x0319, B:150:0x032d, B:152:0x0342, B:153:0x034c, B:177:0x03f2, B:156:0x0353, B:158:0x035b, B:159:0x0363, B:161:0x0368, B:163:0x0378, B:164:0x0380, B:165:0x0387, B:166:0x0391, B:167:0x039b, B:168:0x03a5, B:169:0x03af, B:170:0x03b9, B:171:0x03c1, B:173:0x03cb, B:174:0x03d2, B:175:0x03dd, B:176:0x03e8, B:178:0x03f6, B:179:0x03fb, B:180:0x0413, B:184:0x041e, B:186:0x0433, B:191:0x044a, B:260:0x070c, B:192:0x046e, B:193:0x0492, B:194:0x049c, B:195:0x04a4, B:196:0x04ae, B:197:0x04b8, B:198:0x04c2, B:199:0x04cc, B:200:0x04d6, B:201:0x04e0, B:202:0x04ea, B:203:0x04f4, B:204:0x04fe, B:205:0x0508, B:206:0x0512, B:207:0x051c, B:208:0x0526, B:209:0x0530, B:210:0x0538, B:211:0x0542, B:212:0x054c, B:213:0x0553, B:214:0x055b, B:215:0x0563, B:216:0x056d, B:217:0x0577, B:218:0x0581, B:219:0x0586, B:220:0x058b, B:221:0x0595, B:222:0x059f, B:223:0x05a9, B:224:0x05b3, B:225:0x05bd, B:226:0x05c7, B:227:0x05d1, B:228:0x05db, B:229:0x05e5, B:230:0x05ef, B:231:0x05f9, B:232:0x0603, B:233:0x060d, B:234:0x0617, B:235:0x0621, B:236:0x062b, B:237:0x0635, B:238:0x063f, B:239:0x0649, B:240:0x0653, B:241:0x065d, B:242:0x0667, B:243:0x0671, B:244:0x067b, B:245:0x0685, B:246:0x068f, B:247:0x0699, B:248:0x06a3, B:249:0x06ac, B:250:0x06b5, B:251:0x06be, B:252:0x06c7, B:253:0x06d0, B:254:0x06d9, B:255:0x06e2, B:256:0x06e9, B:257:0x06f2, B:258:0x06fb, B:259:0x0704, B:261:0x0710, B:262:0x0714, B:263:0x072c, B:264:0x072d), top: B:274:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0120 A[Catch: IOException -> 0x073a, XmlPullParserException -> 0x073f, TryCatch #2 {IOException -> 0x073a, XmlPullParserException -> 0x073f, blocks: (B:3:0x0006, B:265:0x0732, B:11:0x0017, B:26:0x0051, B:27:0x005f, B:33:0x0079, B:45:0x00ac, B:47:0x00c6, B:49:0x00cc, B:51:0x00d2, B:53:0x00d8, B:86:0x018f, B:56:0x00f9, B:59:0x0104, B:61:0x0112, B:64:0x0120, B:67:0x012f, B:70:0x0147, B:73:0x0155, B:75:0x0164, B:78:0x0174, B:82:0x017f, B:84:0x0186, B:85:0x018a, B:90:0x019b, B:91:0x01a7, B:92:0x01ac, B:93:0x01c4, B:40:0x0094, B:96:0x01cd, B:101:0x01e7, B:103:0x01fb, B:104:0x0205, B:118:0x0277, B:106:0x020a, B:107:0x0213, B:108:0x021e, B:109:0x0227, B:110:0x0230, B:111:0x0239, B:112:0x0242, B:113:0x024b, B:114:0x0254, B:115:0x025d, B:116:0x0266, B:117:0x026f, B:119:0x027b, B:120:0x0280, B:121:0x0298, B:125:0x02a3, B:127:0x02b8, B:129:0x02be, B:139:0x02f0, B:132:0x02ca, B:135:0x02dc, B:138:0x02e8, B:140:0x02f3, B:141:0x02f8, B:142:0x0310, B:145:0x0319, B:150:0x032d, B:152:0x0342, B:153:0x034c, B:177:0x03f2, B:156:0x0353, B:158:0x035b, B:159:0x0363, B:161:0x0368, B:163:0x0378, B:164:0x0380, B:165:0x0387, B:166:0x0391, B:167:0x039b, B:168:0x03a5, B:169:0x03af, B:170:0x03b9, B:171:0x03c1, B:173:0x03cb, B:174:0x03d2, B:175:0x03dd, B:176:0x03e8, B:178:0x03f6, B:179:0x03fb, B:180:0x0413, B:184:0x041e, B:186:0x0433, B:191:0x044a, B:260:0x070c, B:192:0x046e, B:193:0x0492, B:194:0x049c, B:195:0x04a4, B:196:0x04ae, B:197:0x04b8, B:198:0x04c2, B:199:0x04cc, B:200:0x04d6, B:201:0x04e0, B:202:0x04ea, B:203:0x04f4, B:204:0x04fe, B:205:0x0508, B:206:0x0512, B:207:0x051c, B:208:0x0526, B:209:0x0530, B:210:0x0538, B:211:0x0542, B:212:0x054c, B:213:0x0553, B:214:0x055b, B:215:0x0563, B:216:0x056d, B:217:0x0577, B:218:0x0581, B:219:0x0586, B:220:0x058b, B:221:0x0595, B:222:0x059f, B:223:0x05a9, B:224:0x05b3, B:225:0x05bd, B:226:0x05c7, B:227:0x05d1, B:228:0x05db, B:229:0x05e5, B:230:0x05ef, B:231:0x05f9, B:232:0x0603, B:233:0x060d, B:234:0x0617, B:235:0x0621, B:236:0x062b, B:237:0x0635, B:238:0x063f, B:239:0x0649, B:240:0x0653, B:241:0x065d, B:242:0x0667, B:243:0x0671, B:244:0x067b, B:245:0x0685, B:246:0x068f, B:247:0x0699, B:248:0x06a3, B:249:0x06ac, B:250:0x06b5, B:251:0x06be, B:252:0x06c7, B:253:0x06d0, B:254:0x06d9, B:255:0x06e2, B:256:0x06e9, B:257:0x06f2, B:258:0x06fb, B:259:0x0704, B:261:0x0710, B:262:0x0714, B:263:0x072c, B:264:0x072d), top: B:274:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x012b  */
    /* JADX WARN: Code duplicated, block: B:67:0x012f A[Catch: IOException -> 0x073a, XmlPullParserException -> 0x073f, TryCatch #2 {IOException -> 0x073a, XmlPullParserException -> 0x073f, blocks: (B:3:0x0006, B:265:0x0732, B:11:0x0017, B:26:0x0051, B:27:0x005f, B:33:0x0079, B:45:0x00ac, B:47:0x00c6, B:49:0x00cc, B:51:0x00d2, B:53:0x00d8, B:86:0x018f, B:56:0x00f9, B:59:0x0104, B:61:0x0112, B:64:0x0120, B:67:0x012f, B:70:0x0147, B:73:0x0155, B:75:0x0164, B:78:0x0174, B:82:0x017f, B:84:0x0186, B:85:0x018a, B:90:0x019b, B:91:0x01a7, B:92:0x01ac, B:93:0x01c4, B:40:0x0094, B:96:0x01cd, B:101:0x01e7, B:103:0x01fb, B:104:0x0205, B:118:0x0277, B:106:0x020a, B:107:0x0213, B:108:0x021e, B:109:0x0227, B:110:0x0230, B:111:0x0239, B:112:0x0242, B:113:0x024b, B:114:0x0254, B:115:0x025d, B:116:0x0266, B:117:0x026f, B:119:0x027b, B:120:0x0280, B:121:0x0298, B:125:0x02a3, B:127:0x02b8, B:129:0x02be, B:139:0x02f0, B:132:0x02ca, B:135:0x02dc, B:138:0x02e8, B:140:0x02f3, B:141:0x02f8, B:142:0x0310, B:145:0x0319, B:150:0x032d, B:152:0x0342, B:153:0x034c, B:177:0x03f2, B:156:0x0353, B:158:0x035b, B:159:0x0363, B:161:0x0368, B:163:0x0378, B:164:0x0380, B:165:0x0387, B:166:0x0391, B:167:0x039b, B:168:0x03a5, B:169:0x03af, B:170:0x03b9, B:171:0x03c1, B:173:0x03cb, B:174:0x03d2, B:175:0x03dd, B:176:0x03e8, B:178:0x03f6, B:179:0x03fb, B:180:0x0413, B:184:0x041e, B:186:0x0433, B:191:0x044a, B:260:0x070c, B:192:0x046e, B:193:0x0492, B:194:0x049c, B:195:0x04a4, B:196:0x04ae, B:197:0x04b8, B:198:0x04c2, B:199:0x04cc, B:200:0x04d6, B:201:0x04e0, B:202:0x04ea, B:203:0x04f4, B:204:0x04fe, B:205:0x0508, B:206:0x0512, B:207:0x051c, B:208:0x0526, B:209:0x0530, B:210:0x0538, B:211:0x0542, B:212:0x054c, B:213:0x0553, B:214:0x055b, B:215:0x0563, B:216:0x056d, B:217:0x0577, B:218:0x0581, B:219:0x0586, B:220:0x058b, B:221:0x0595, B:222:0x059f, B:223:0x05a9, B:224:0x05b3, B:225:0x05bd, B:226:0x05c7, B:227:0x05d1, B:228:0x05db, B:229:0x05e5, B:230:0x05ef, B:231:0x05f9, B:232:0x0603, B:233:0x060d, B:234:0x0617, B:235:0x0621, B:236:0x062b, B:237:0x0635, B:238:0x063f, B:239:0x0649, B:240:0x0653, B:241:0x065d, B:242:0x0667, B:243:0x0671, B:244:0x067b, B:245:0x0685, B:246:0x068f, B:247:0x0699, B:248:0x06a3, B:249:0x06ac, B:250:0x06b5, B:251:0x06be, B:252:0x06c7, B:253:0x06d0, B:254:0x06d9, B:255:0x06e2, B:256:0x06e9, B:257:0x06f2, B:258:0x06fb, B:259:0x0704, B:261:0x0710, B:262:0x0714, B:263:0x072c, B:264:0x072d), top: B:274:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0144  */
    /* JADX WARN: Code duplicated, block: B:70:0x0147 A[Catch: IOException -> 0x073a, XmlPullParserException -> 0x073f, TryCatch #2 {IOException -> 0x073a, XmlPullParserException -> 0x073f, blocks: (B:3:0x0006, B:265:0x0732, B:11:0x0017, B:26:0x0051, B:27:0x005f, B:33:0x0079, B:45:0x00ac, B:47:0x00c6, B:49:0x00cc, B:51:0x00d2, B:53:0x00d8, B:86:0x018f, B:56:0x00f9, B:59:0x0104, B:61:0x0112, B:64:0x0120, B:67:0x012f, B:70:0x0147, B:73:0x0155, B:75:0x0164, B:78:0x0174, B:82:0x017f, B:84:0x0186, B:85:0x018a, B:90:0x019b, B:91:0x01a7, B:92:0x01ac, B:93:0x01c4, B:40:0x0094, B:96:0x01cd, B:101:0x01e7, B:103:0x01fb, B:104:0x0205, B:118:0x0277, B:106:0x020a, B:107:0x0213, B:108:0x021e, B:109:0x0227, B:110:0x0230, B:111:0x0239, B:112:0x0242, B:113:0x024b, B:114:0x0254, B:115:0x025d, B:116:0x0266, B:117:0x026f, B:119:0x027b, B:120:0x0280, B:121:0x0298, B:125:0x02a3, B:127:0x02b8, B:129:0x02be, B:139:0x02f0, B:132:0x02ca, B:135:0x02dc, B:138:0x02e8, B:140:0x02f3, B:141:0x02f8, B:142:0x0310, B:145:0x0319, B:150:0x032d, B:152:0x0342, B:153:0x034c, B:177:0x03f2, B:156:0x0353, B:158:0x035b, B:159:0x0363, B:161:0x0368, B:163:0x0378, B:164:0x0380, B:165:0x0387, B:166:0x0391, B:167:0x039b, B:168:0x03a5, B:169:0x03af, B:170:0x03b9, B:171:0x03c1, B:173:0x03cb, B:174:0x03d2, B:175:0x03dd, B:176:0x03e8, B:178:0x03f6, B:179:0x03fb, B:180:0x0413, B:184:0x041e, B:186:0x0433, B:191:0x044a, B:260:0x070c, B:192:0x046e, B:193:0x0492, B:194:0x049c, B:195:0x04a4, B:196:0x04ae, B:197:0x04b8, B:198:0x04c2, B:199:0x04cc, B:200:0x04d6, B:201:0x04e0, B:202:0x04ea, B:203:0x04f4, B:204:0x04fe, B:205:0x0508, B:206:0x0512, B:207:0x051c, B:208:0x0526, B:209:0x0530, B:210:0x0538, B:211:0x0542, B:212:0x054c, B:213:0x0553, B:214:0x055b, B:215:0x0563, B:216:0x056d, B:217:0x0577, B:218:0x0581, B:219:0x0586, B:220:0x058b, B:221:0x0595, B:222:0x059f, B:223:0x05a9, B:224:0x05b3, B:225:0x05bd, B:226:0x05c7, B:227:0x05d1, B:228:0x05db, B:229:0x05e5, B:230:0x05ef, B:231:0x05f9, B:232:0x0603, B:233:0x060d, B:234:0x0617, B:235:0x0621, B:236:0x062b, B:237:0x0635, B:238:0x063f, B:239:0x0649, B:240:0x0653, B:241:0x065d, B:242:0x0667, B:243:0x0671, B:244:0x067b, B:245:0x0685, B:246:0x068f, B:247:0x0699, B:248:0x06a3, B:249:0x06ac, B:250:0x06b5, B:251:0x06be, B:252:0x06c7, B:253:0x06d0, B:254:0x06d9, B:255:0x06e2, B:256:0x06e9, B:257:0x06f2, B:258:0x06fb, B:259:0x0704, B:261:0x0710, B:262:0x0714, B:263:0x072c, B:264:0x072d), top: B:274:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0152  */
    /* JADX WARN: Code duplicated, block: B:73:0x0155 A[Catch: IOException -> 0x073a, XmlPullParserException -> 0x073f, TryCatch #2 {IOException -> 0x073a, XmlPullParserException -> 0x073f, blocks: (B:3:0x0006, B:265:0x0732, B:11:0x0017, B:26:0x0051, B:27:0x005f, B:33:0x0079, B:45:0x00ac, B:47:0x00c6, B:49:0x00cc, B:51:0x00d2, B:53:0x00d8, B:86:0x018f, B:56:0x00f9, B:59:0x0104, B:61:0x0112, B:64:0x0120, B:67:0x012f, B:70:0x0147, B:73:0x0155, B:75:0x0164, B:78:0x0174, B:82:0x017f, B:84:0x0186, B:85:0x018a, B:90:0x019b, B:91:0x01a7, B:92:0x01ac, B:93:0x01c4, B:40:0x0094, B:96:0x01cd, B:101:0x01e7, B:103:0x01fb, B:104:0x0205, B:118:0x0277, B:106:0x020a, B:107:0x0213, B:108:0x021e, B:109:0x0227, B:110:0x0230, B:111:0x0239, B:112:0x0242, B:113:0x024b, B:114:0x0254, B:115:0x025d, B:116:0x0266, B:117:0x026f, B:119:0x027b, B:120:0x0280, B:121:0x0298, B:125:0x02a3, B:127:0x02b8, B:129:0x02be, B:139:0x02f0, B:132:0x02ca, B:135:0x02dc, B:138:0x02e8, B:140:0x02f3, B:141:0x02f8, B:142:0x0310, B:145:0x0319, B:150:0x032d, B:152:0x0342, B:153:0x034c, B:177:0x03f2, B:156:0x0353, B:158:0x035b, B:159:0x0363, B:161:0x0368, B:163:0x0378, B:164:0x0380, B:165:0x0387, B:166:0x0391, B:167:0x039b, B:168:0x03a5, B:169:0x03af, B:170:0x03b9, B:171:0x03c1, B:173:0x03cb, B:174:0x03d2, B:175:0x03dd, B:176:0x03e8, B:178:0x03f6, B:179:0x03fb, B:180:0x0413, B:184:0x041e, B:186:0x0433, B:191:0x044a, B:260:0x070c, B:192:0x046e, B:193:0x0492, B:194:0x049c, B:195:0x04a4, B:196:0x04ae, B:197:0x04b8, B:198:0x04c2, B:199:0x04cc, B:200:0x04d6, B:201:0x04e0, B:202:0x04ea, B:203:0x04f4, B:204:0x04fe, B:205:0x0508, B:206:0x0512, B:207:0x051c, B:208:0x0526, B:209:0x0530, B:210:0x0538, B:211:0x0542, B:212:0x054c, B:213:0x0553, B:214:0x055b, B:215:0x0563, B:216:0x056d, B:217:0x0577, B:218:0x0581, B:219:0x0586, B:220:0x058b, B:221:0x0595, B:222:0x059f, B:223:0x05a9, B:224:0x05b3, B:225:0x05bd, B:226:0x05c7, B:227:0x05d1, B:228:0x05db, B:229:0x05e5, B:230:0x05ef, B:231:0x05f9, B:232:0x0603, B:233:0x060d, B:234:0x0617, B:235:0x0621, B:236:0x062b, B:237:0x0635, B:238:0x063f, B:239:0x0649, B:240:0x0653, B:241:0x065d, B:242:0x0667, B:243:0x0671, B:244:0x067b, B:245:0x0685, B:246:0x068f, B:247:0x0699, B:248:0x06a3, B:249:0x06ac, B:250:0x06b5, B:251:0x06be, B:252:0x06c7, B:253:0x06d0, B:254:0x06d9, B:255:0x06e2, B:256:0x06e9, B:257:0x06f2, B:258:0x06fb, B:259:0x0704, B:261:0x0710, B:262:0x0714, B:263:0x072c, B:264:0x072d), top: B:274:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0164 A[Catch: IOException -> 0x073a, XmlPullParserException -> 0x073f, TryCatch #2 {IOException -> 0x073a, XmlPullParserException -> 0x073f, blocks: (B:3:0x0006, B:265:0x0732, B:11:0x0017, B:26:0x0051, B:27:0x005f, B:33:0x0079, B:45:0x00ac, B:47:0x00c6, B:49:0x00cc, B:51:0x00d2, B:53:0x00d8, B:86:0x018f, B:56:0x00f9, B:59:0x0104, B:61:0x0112, B:64:0x0120, B:67:0x012f, B:70:0x0147, B:73:0x0155, B:75:0x0164, B:78:0x0174, B:82:0x017f, B:84:0x0186, B:85:0x018a, B:90:0x019b, B:91:0x01a7, B:92:0x01ac, B:93:0x01c4, B:40:0x0094, B:96:0x01cd, B:101:0x01e7, B:103:0x01fb, B:104:0x0205, B:118:0x0277, B:106:0x020a, B:107:0x0213, B:108:0x021e, B:109:0x0227, B:110:0x0230, B:111:0x0239, B:112:0x0242, B:113:0x024b, B:114:0x0254, B:115:0x025d, B:116:0x0266, B:117:0x026f, B:119:0x027b, B:120:0x0280, B:121:0x0298, B:125:0x02a3, B:127:0x02b8, B:129:0x02be, B:139:0x02f0, B:132:0x02ca, B:135:0x02dc, B:138:0x02e8, B:140:0x02f3, B:141:0x02f8, B:142:0x0310, B:145:0x0319, B:150:0x032d, B:152:0x0342, B:153:0x034c, B:177:0x03f2, B:156:0x0353, B:158:0x035b, B:159:0x0363, B:161:0x0368, B:163:0x0378, B:164:0x0380, B:165:0x0387, B:166:0x0391, B:167:0x039b, B:168:0x03a5, B:169:0x03af, B:170:0x03b9, B:171:0x03c1, B:173:0x03cb, B:174:0x03d2, B:175:0x03dd, B:176:0x03e8, B:178:0x03f6, B:179:0x03fb, B:180:0x0413, B:184:0x041e, B:186:0x0433, B:191:0x044a, B:260:0x070c, B:192:0x046e, B:193:0x0492, B:194:0x049c, B:195:0x04a4, B:196:0x04ae, B:197:0x04b8, B:198:0x04c2, B:199:0x04cc, B:200:0x04d6, B:201:0x04e0, B:202:0x04ea, B:203:0x04f4, B:204:0x04fe, B:205:0x0508, B:206:0x0512, B:207:0x051c, B:208:0x0526, B:209:0x0530, B:210:0x0538, B:211:0x0542, B:212:0x054c, B:213:0x0553, B:214:0x055b, B:215:0x0563, B:216:0x056d, B:217:0x0577, B:218:0x0581, B:219:0x0586, B:220:0x058b, B:221:0x0595, B:222:0x059f, B:223:0x05a9, B:224:0x05b3, B:225:0x05bd, B:226:0x05c7, B:227:0x05d1, B:228:0x05db, B:229:0x05e5, B:230:0x05ef, B:231:0x05f9, B:232:0x0603, B:233:0x060d, B:234:0x0617, B:235:0x0621, B:236:0x062b, B:237:0x0635, B:238:0x063f, B:239:0x0649, B:240:0x0653, B:241:0x065d, B:242:0x0667, B:243:0x0671, B:244:0x067b, B:245:0x0685, B:246:0x068f, B:247:0x0699, B:248:0x06a3, B:249:0x06ac, B:250:0x06b5, B:251:0x06be, B:252:0x06c7, B:253:0x06d0, B:254:0x06d9, B:255:0x06e2, B:256:0x06e9, B:257:0x06f2, B:258:0x06fb, B:259:0x0704, B:261:0x0710, B:262:0x0714, B:263:0x072c, B:264:0x072d), top: B:274:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0170  */
    /* JADX WARN: Code duplicated, block: B:78:0x0174 A[Catch: IOException -> 0x073a, XmlPullParserException -> 0x073f, TryCatch #2 {IOException -> 0x073a, XmlPullParserException -> 0x073f, blocks: (B:3:0x0006, B:265:0x0732, B:11:0x0017, B:26:0x0051, B:27:0x005f, B:33:0x0079, B:45:0x00ac, B:47:0x00c6, B:49:0x00cc, B:51:0x00d2, B:53:0x00d8, B:86:0x018f, B:56:0x00f9, B:59:0x0104, B:61:0x0112, B:64:0x0120, B:67:0x012f, B:70:0x0147, B:73:0x0155, B:75:0x0164, B:78:0x0174, B:82:0x017f, B:84:0x0186, B:85:0x018a, B:90:0x019b, B:91:0x01a7, B:92:0x01ac, B:93:0x01c4, B:40:0x0094, B:96:0x01cd, B:101:0x01e7, B:103:0x01fb, B:104:0x0205, B:118:0x0277, B:106:0x020a, B:107:0x0213, B:108:0x021e, B:109:0x0227, B:110:0x0230, B:111:0x0239, B:112:0x0242, B:113:0x024b, B:114:0x0254, B:115:0x025d, B:116:0x0266, B:117:0x026f, B:119:0x027b, B:120:0x0280, B:121:0x0298, B:125:0x02a3, B:127:0x02b8, B:129:0x02be, B:139:0x02f0, B:132:0x02ca, B:135:0x02dc, B:138:0x02e8, B:140:0x02f3, B:141:0x02f8, B:142:0x0310, B:145:0x0319, B:150:0x032d, B:152:0x0342, B:153:0x034c, B:177:0x03f2, B:156:0x0353, B:158:0x035b, B:159:0x0363, B:161:0x0368, B:163:0x0378, B:164:0x0380, B:165:0x0387, B:166:0x0391, B:167:0x039b, B:168:0x03a5, B:169:0x03af, B:170:0x03b9, B:171:0x03c1, B:173:0x03cb, B:174:0x03d2, B:175:0x03dd, B:176:0x03e8, B:178:0x03f6, B:179:0x03fb, B:180:0x0413, B:184:0x041e, B:186:0x0433, B:191:0x044a, B:260:0x070c, B:192:0x046e, B:193:0x0492, B:194:0x049c, B:195:0x04a4, B:196:0x04ae, B:197:0x04b8, B:198:0x04c2, B:199:0x04cc, B:200:0x04d6, B:201:0x04e0, B:202:0x04ea, B:203:0x04f4, B:204:0x04fe, B:205:0x0508, B:206:0x0512, B:207:0x051c, B:208:0x0526, B:209:0x0530, B:210:0x0538, B:211:0x0542, B:212:0x054c, B:213:0x0553, B:214:0x055b, B:215:0x0563, B:216:0x056d, B:217:0x0577, B:218:0x0581, B:219:0x0586, B:220:0x058b, B:221:0x0595, B:222:0x059f, B:223:0x05a9, B:224:0x05b3, B:225:0x05bd, B:226:0x05c7, B:227:0x05d1, B:228:0x05db, B:229:0x05e5, B:230:0x05ef, B:231:0x05f9, B:232:0x0603, B:233:0x060d, B:234:0x0617, B:235:0x0621, B:236:0x062b, B:237:0x0635, B:238:0x063f, B:239:0x0649, B:240:0x0653, B:241:0x065d, B:242:0x0667, B:243:0x0671, B:244:0x067b, B:245:0x0685, B:246:0x068f, B:247:0x0699, B:248:0x06a3, B:249:0x06ac, B:250:0x06b5, B:251:0x06be, B:252:0x06c7, B:253:0x06d0, B:254:0x06d9, B:255:0x06e2, B:256:0x06e9, B:257:0x06f2, B:258:0x06fb, B:259:0x0704, B:261:0x0710, B:262:0x0714, B:263:0x072c, B:264:0x072d), top: B:274:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x017b  */
    /* JADX WARN: Code duplicated, block: B:82:0x017f A[Catch: IOException -> 0x073a, XmlPullParserException -> 0x073f, TryCatch #2 {IOException -> 0x073a, XmlPullParserException -> 0x073f, blocks: (B:3:0x0006, B:265:0x0732, B:11:0x0017, B:26:0x0051, B:27:0x005f, B:33:0x0079, B:45:0x00ac, B:47:0x00c6, B:49:0x00cc, B:51:0x00d2, B:53:0x00d8, B:86:0x018f, B:56:0x00f9, B:59:0x0104, B:61:0x0112, B:64:0x0120, B:67:0x012f, B:70:0x0147, B:73:0x0155, B:75:0x0164, B:78:0x0174, B:82:0x017f, B:84:0x0186, B:85:0x018a, B:90:0x019b, B:91:0x01a7, B:92:0x01ac, B:93:0x01c4, B:40:0x0094, B:96:0x01cd, B:101:0x01e7, B:103:0x01fb, B:104:0x0205, B:118:0x0277, B:106:0x020a, B:107:0x0213, B:108:0x021e, B:109:0x0227, B:110:0x0230, B:111:0x0239, B:112:0x0242, B:113:0x024b, B:114:0x0254, B:115:0x025d, B:116:0x0266, B:117:0x026f, B:119:0x027b, B:120:0x0280, B:121:0x0298, B:125:0x02a3, B:127:0x02b8, B:129:0x02be, B:139:0x02f0, B:132:0x02ca, B:135:0x02dc, B:138:0x02e8, B:140:0x02f3, B:141:0x02f8, B:142:0x0310, B:145:0x0319, B:150:0x032d, B:152:0x0342, B:153:0x034c, B:177:0x03f2, B:156:0x0353, B:158:0x035b, B:159:0x0363, B:161:0x0368, B:163:0x0378, B:164:0x0380, B:165:0x0387, B:166:0x0391, B:167:0x039b, B:168:0x03a5, B:169:0x03af, B:170:0x03b9, B:171:0x03c1, B:173:0x03cb, B:174:0x03d2, B:175:0x03dd, B:176:0x03e8, B:178:0x03f6, B:179:0x03fb, B:180:0x0413, B:184:0x041e, B:186:0x0433, B:191:0x044a, B:260:0x070c, B:192:0x046e, B:193:0x0492, B:194:0x049c, B:195:0x04a4, B:196:0x04ae, B:197:0x04b8, B:198:0x04c2, B:199:0x04cc, B:200:0x04d6, B:201:0x04e0, B:202:0x04ea, B:203:0x04f4, B:204:0x04fe, B:205:0x0508, B:206:0x0512, B:207:0x051c, B:208:0x0526, B:209:0x0530, B:210:0x0538, B:211:0x0542, B:212:0x054c, B:213:0x0553, B:214:0x055b, B:215:0x0563, B:216:0x056d, B:217:0x0577, B:218:0x0581, B:219:0x0586, B:220:0x058b, B:221:0x0595, B:222:0x059f, B:223:0x05a9, B:224:0x05b3, B:225:0x05bd, B:226:0x05c7, B:227:0x05d1, B:228:0x05db, B:229:0x05e5, B:230:0x05ef, B:231:0x05f9, B:232:0x0603, B:233:0x060d, B:234:0x0617, B:235:0x0621, B:236:0x062b, B:237:0x0635, B:238:0x063f, B:239:0x0649, B:240:0x0653, B:241:0x065d, B:242:0x0667, B:243:0x0671, B:244:0x067b, B:245:0x0685, B:246:0x068f, B:247:0x0699, B:248:0x06a3, B:249:0x06ac, B:250:0x06b5, B:251:0x06be, B:252:0x06c7, B:253:0x06d0, B:254:0x06d9, B:255:0x06e2, B:256:0x06e9, B:257:0x06f2, B:258:0x06fb, B:259:0x0704, B:261:0x0710, B:262:0x0714, B:263:0x072c, B:264:0x072d), top: B:274:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0186 A[Catch: IOException -> 0x073a, XmlPullParserException -> 0x073f, TryCatch #2 {IOException -> 0x073a, XmlPullParserException -> 0x073f, blocks: (B:3:0x0006, B:265:0x0732, B:11:0x0017, B:26:0x0051, B:27:0x005f, B:33:0x0079, B:45:0x00ac, B:47:0x00c6, B:49:0x00cc, B:51:0x00d2, B:53:0x00d8, B:86:0x018f, B:56:0x00f9, B:59:0x0104, B:61:0x0112, B:64:0x0120, B:67:0x012f, B:70:0x0147, B:73:0x0155, B:75:0x0164, B:78:0x0174, B:82:0x017f, B:84:0x0186, B:85:0x018a, B:90:0x019b, B:91:0x01a7, B:92:0x01ac, B:93:0x01c4, B:40:0x0094, B:96:0x01cd, B:101:0x01e7, B:103:0x01fb, B:104:0x0205, B:118:0x0277, B:106:0x020a, B:107:0x0213, B:108:0x021e, B:109:0x0227, B:110:0x0230, B:111:0x0239, B:112:0x0242, B:113:0x024b, B:114:0x0254, B:115:0x025d, B:116:0x0266, B:117:0x026f, B:119:0x027b, B:120:0x0280, B:121:0x0298, B:125:0x02a3, B:127:0x02b8, B:129:0x02be, B:139:0x02f0, B:132:0x02ca, B:135:0x02dc, B:138:0x02e8, B:140:0x02f3, B:141:0x02f8, B:142:0x0310, B:145:0x0319, B:150:0x032d, B:152:0x0342, B:153:0x034c, B:177:0x03f2, B:156:0x0353, B:158:0x035b, B:159:0x0363, B:161:0x0368, B:163:0x0378, B:164:0x0380, B:165:0x0387, B:166:0x0391, B:167:0x039b, B:168:0x03a5, B:169:0x03af, B:170:0x03b9, B:171:0x03c1, B:173:0x03cb, B:174:0x03d2, B:175:0x03dd, B:176:0x03e8, B:178:0x03f6, B:179:0x03fb, B:180:0x0413, B:184:0x041e, B:186:0x0433, B:191:0x044a, B:260:0x070c, B:192:0x046e, B:193:0x0492, B:194:0x049c, B:195:0x04a4, B:196:0x04ae, B:197:0x04b8, B:198:0x04c2, B:199:0x04cc, B:200:0x04d6, B:201:0x04e0, B:202:0x04ea, B:203:0x04f4, B:204:0x04fe, B:205:0x0508, B:206:0x0512, B:207:0x051c, B:208:0x0526, B:209:0x0530, B:210:0x0538, B:211:0x0542, B:212:0x054c, B:213:0x0553, B:214:0x055b, B:215:0x0563, B:216:0x056d, B:217:0x0577, B:218:0x0581, B:219:0x0586, B:220:0x058b, B:221:0x0595, B:222:0x059f, B:223:0x05a9, B:224:0x05b3, B:225:0x05bd, B:226:0x05c7, B:227:0x05d1, B:228:0x05db, B:229:0x05e5, B:230:0x05ef, B:231:0x05f9, B:232:0x0603, B:233:0x060d, B:234:0x0617, B:235:0x0621, B:236:0x062b, B:237:0x0635, B:238:0x063f, B:239:0x0649, B:240:0x0653, B:241:0x065d, B:242:0x0667, B:243:0x0671, B:244:0x067b, B:245:0x0685, B:246:0x068f, B:247:0x0699, B:248:0x06a3, B:249:0x06ac, B:250:0x06b5, B:251:0x06be, B:252:0x06c7, B:253:0x06d0, B:254:0x06d9, B:255:0x06e2, B:256:0x06e9, B:257:0x06f2, B:258:0x06fb, B:259:0x0704, B:261:0x0710, B:262:0x0714, B:263:0x072c, B:264:0x072d), top: B:274:0x0006 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void l(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.util.HashMap map;
        android.content.res.TypedArray typedArrayObtainStyledAttributes;
        int indexCount;
        int i;
        int i2;
        boolean z;
        java.lang.String string;
        java.lang.Object objValueOf;
        java.lang.Object obj;
        int index;
        int i3;
        int resourceId;
        try {
            int eventType = xmlPullParser.getEventType();
            defpackage.dsa dsaVarT = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    int i4 = 2;
                    int i5 = 3;
                    if (eventType == 2) {
                        java.lang.String name = xmlPullParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    if (dsaVarT == null) {
                                        throw new java.lang.RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    defpackage.dsb dsbVar = dsaVarT.d;
                                    android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), defpackage.dsj.e);
                                    dsbVar.c = true;
                                    int indexCount2 = typedArrayObtainStyledAttributes2.getIndexCount();
                                    for (int i6 = 0; i6 < indexCount2; i6++) {
                                        int index2 = typedArrayObtainStyledAttributes2.getIndex(i6);
                                        android.util.SparseIntArray sparseIntArray = defpackage.dsb.a;
                                        int i7 = sparseIntArray.get(index2);
                                        switch (i7) {
                                            case 1:
                                                dsbVar.r = a(typedArrayObtainStyledAttributes2, index2, dsbVar.r);
                                                break;
                                            case 2:
                                                dsbVar.K = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, dsbVar.K);
                                                break;
                                            case 3:
                                                dsbVar.q = a(typedArrayObtainStyledAttributes2, index2, dsbVar.q);
                                                break;
                                            case 4:
                                                dsbVar.p = a(typedArrayObtainStyledAttributes2, index2, dsbVar.p);
                                                break;
                                            case 5:
                                                dsbVar.A = typedArrayObtainStyledAttributes2.getString(index2);
                                                break;
                                            case 6:
                                                dsbVar.E = typedArrayObtainStyledAttributes2.getDimensionPixelOffset(index2, dsbVar.E);
                                                break;
                                            case 7:
                                                dsbVar.F = typedArrayObtainStyledAttributes2.getDimensionPixelOffset(index2, dsbVar.F);
                                                break;
                                            case 8:
                                                dsbVar.L = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, dsbVar.L);
                                                break;
                                            case 9:
                                                dsbVar.x = a(typedArrayObtainStyledAttributes2, index2, dsbVar.x);
                                                break;
                                            case 10:
                                                dsbVar.w = a(typedArrayObtainStyledAttributes2, index2, dsbVar.w);
                                                break;
                                            case 11:
                                                dsbVar.R = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, dsbVar.R);
                                                break;
                                            case 12:
                                                dsbVar.S = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, dsbVar.S);
                                                break;
                                            case 13:
                                                dsbVar.O = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, dsbVar.O);
                                                break;
                                            case 14:
                                                dsbVar.Q = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, dsbVar.Q);
                                                break;
                                            case 15:
                                                dsbVar.T = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, dsbVar.T);
                                                break;
                                            case 16:
                                                dsbVar.P = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, dsbVar.P);
                                                break;
                                            case 17:
                                                dsbVar.f = typedArrayObtainStyledAttributes2.getDimensionPixelOffset(index2, dsbVar.f);
                                                break;
                                            case 18:
                                                dsbVar.g = typedArrayObtainStyledAttributes2.getDimensionPixelOffset(index2, dsbVar.g);
                                                break;
                                            case 19:
                                                dsbVar.h = typedArrayObtainStyledAttributes2.getFloat(index2, dsbVar.h);
                                                break;
                                            case 20:
                                                dsbVar.y = typedArrayObtainStyledAttributes2.getFloat(index2, dsbVar.y);
                                                break;
                                            case 21:
                                                dsbVar.e = typedArrayObtainStyledAttributes2.getLayoutDimension(index2, dsbVar.e);
                                                break;
                                            case 22:
                                                dsbVar.d = typedArrayObtainStyledAttributes2.getLayoutDimension(index2, dsbVar.d);
                                                break;
                                            case 23:
                                                dsbVar.H = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, dsbVar.H);
                                                break;
                                            case 24:
                                                dsbVar.j = a(typedArrayObtainStyledAttributes2, index2, dsbVar.j);
                                                break;
                                            case 25:
                                                dsbVar.k = a(typedArrayObtainStyledAttributes2, index2, dsbVar.k);
                                                break;
                                            case 26:
                                                dsbVar.G = typedArrayObtainStyledAttributes2.getInt(index2, dsbVar.G);
                                                break;
                                            case 27:
                                                dsbVar.I = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, dsbVar.I);
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                                                dsbVar.l = a(typedArrayObtainStyledAttributes2, index2, dsbVar.l);
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                                                dsbVar.m = a(typedArrayObtainStyledAttributes2, index2, dsbVar.m);
                                                break;
                                            case 30:
                                                dsbVar.M = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, dsbVar.M);
                                                break;
                                            case 31:
                                                dsbVar.u = a(typedArrayObtainStyledAttributes2, index2, dsbVar.u);
                                                break;
                                            case 32:
                                                dsbVar.v = a(typedArrayObtainStyledAttributes2, index2, dsbVar.v);
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                                dsbVar.J = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, dsbVar.J);
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                                dsbVar.o = a(typedArrayObtainStyledAttributes2, index2, dsbVar.o);
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                                                dsbVar.n = a(typedArrayObtainStyledAttributes2, index2, dsbVar.n);
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_STRAIGHT /* 36 */:
                                                dsbVar.z = typedArrayObtainStyledAttributes2.getFloat(index2, dsbVar.z);
                                                break;
                                            case 37:
                                                dsbVar.W = typedArrayObtainStyledAttributes2.getFloat(index2, dsbVar.W);
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                dsbVar.V = typedArrayObtainStyledAttributes2.getFloat(index2, dsbVar.V);
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                                dsbVar.X = typedArrayObtainStyledAttributes2.getInt(index2, dsbVar.X);
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                                dsbVar.Y = typedArrayObtainStyledAttributes2.getInt(index2, dsbVar.Y);
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                                m(dsbVar, typedArrayObtainStyledAttributes2, index2, 0);
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                                m(dsbVar, typedArrayObtainStyledAttributes2, index2, 1);
                                                break;
                                            default:
                                                switch (i7) {
                                                    case 61:
                                                        dsbVar.B = a(typedArrayObtainStyledAttributes2, index2, dsbVar.B);
                                                        break;
                                                    case 62:
                                                        dsbVar.C = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, dsbVar.C);
                                                        break;
                                                    case 63:
                                                        dsbVar.D = typedArrayObtainStyledAttributes2.getFloat(index2, dsbVar.D);
                                                        break;
                                                    default:
                                                        switch (i7) {
                                                            case 69:
                                                                dsbVar.af = typedArrayObtainStyledAttributes2.getFloat(index2, 1.0f);
                                                                break;
                                                            case 70:
                                                                dsbVar.ag = typedArrayObtainStyledAttributes2.getFloat(index2, 1.0f);
                                                                break;
                                                            case 71:
                                                                android.util.Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                                break;
                                                            case 72:
                                                                dsbVar.ah = typedArrayObtainStyledAttributes2.getInt(index2, dsbVar.ah);
                                                                break;
                                                            case 73:
                                                                dsbVar.ai = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, dsbVar.ai);
                                                                break;
                                                            case 74:
                                                                dsbVar.al = typedArrayObtainStyledAttributes2.getString(index2);
                                                                break;
                                                            case 75:
                                                                dsbVar.ap = typedArrayObtainStyledAttributes2.getBoolean(index2, dsbVar.ap);
                                                                break;
                                                            case 76:
                                                                dsbVar.aq = typedArrayObtainStyledAttributes2.getInt(index2, dsbVar.aq);
                                                                break;
                                                            case 77:
                                                                dsbVar.s = a(typedArrayObtainStyledAttributes2, index2, dsbVar.s);
                                                                break;
                                                            case 78:
                                                                dsbVar.t = a(typedArrayObtainStyledAttributes2, index2, dsbVar.t);
                                                                break;
                                                            case 79:
                                                                dsbVar.U = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, dsbVar.U);
                                                                break;
                                                            case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                                                                dsbVar.N = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, dsbVar.N);
                                                                break;
                                                            case 81:
                                                                dsbVar.Z = typedArrayObtainStyledAttributes2.getInt(index2, dsbVar.Z);
                                                                break;
                                                            case 82:
                                                                dsbVar.aa = typedArrayObtainStyledAttributes2.getInt(index2, dsbVar.aa);
                                                                break;
                                                            case 83:
                                                                dsbVar.ac = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, dsbVar.ac);
                                                                break;
                                                            case 84:
                                                                dsbVar.ab = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, dsbVar.ab);
                                                                break;
                                                            case 85:
                                                                dsbVar.ae = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, dsbVar.ae);
                                                                break;
                                                            case 86:
                                                                dsbVar.ad = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, dsbVar.ad);
                                                                break;
                                                            case 87:
                                                                dsbVar.an = typedArrayObtainStyledAttributes2.getBoolean(index2, dsbVar.an);
                                                                break;
                                                            case 88:
                                                                dsbVar.ao = typedArrayObtainStyledAttributes2.getBoolean(index2, dsbVar.ao);
                                                                break;
                                                            case 89:
                                                                dsbVar.am = typedArrayObtainStyledAttributes2.getString(index2);
                                                                break;
                                                            case 90:
                                                                dsbVar.i = typedArrayObtainStyledAttributes2.getBoolean(index2, dsbVar.i);
                                                                break;
                                                            case 91:
                                                                android.util.Log.w("ConstraintSet", "unused attribute 0x" + java.lang.Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                                                                break;
                                                            default:
                                                                android.util.Log.w("ConstraintSet", "Unknown attribute 0x" + java.lang.Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                    }
                                    typedArrayObtainStyledAttributes2.recycle();
                                }
                                break;
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    if (dsaVarT == null) {
                                        throw new java.lang.RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    defpackage.dsc dscVar = dsaVarT.c;
                                    android.content.res.TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), defpackage.dsj.f);
                                    dscVar.b = true;
                                    int indexCount3 = typedArrayObtainStyledAttributes3.getIndexCount();
                                    for (int i8 = 0; i8 < indexCount3; i8++) {
                                        int index3 = typedArrayObtainStyledAttributes3.getIndex(i8);
                                        switch (defpackage.dsc.a.get(index3)) {
                                            case 1:
                                                dscVar.j = typedArrayObtainStyledAttributes3.getFloat(index3, dscVar.j);
                                                break;
                                            case 2:
                                                dscVar.f = typedArrayObtainStyledAttributes3.getInt(index3, dscVar.f);
                                                break;
                                            case 3:
                                                if (typedArrayObtainStyledAttributes3.peekValue(index3).type == 3) {
                                                    dscVar.e = typedArrayObtainStyledAttributes3.getString(index3);
                                                } else {
                                                    dscVar.e = defpackage.dpl.a[typedArrayObtainStyledAttributes3.getInteger(index3, 0)];
                                                }
                                                break;
                                            case 4:
                                                dscVar.g = typedArrayObtainStyledAttributes3.getInt(index3, 0);
                                                break;
                                            case 5:
                                                dscVar.c = a(typedArrayObtainStyledAttributes3, index3, dscVar.c);
                                                break;
                                            case 6:
                                                dscVar.d = typedArrayObtainStyledAttributes3.getInteger(index3, dscVar.d);
                                                break;
                                            case 7:
                                                dscVar.h = typedArrayObtainStyledAttributes3.getFloat(index3, dscVar.h);
                                                break;
                                            case 8:
                                                dscVar.l = typedArrayObtainStyledAttributes3.getInteger(index3, dscVar.l);
                                                break;
                                            case 9:
                                                dscVar.k = typedArrayObtainStyledAttributes3.getFloat(index3, dscVar.k);
                                                break;
                                            case 10:
                                                android.util.TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes3.peekValue(index3);
                                                if (typedValuePeekValue.type != 1) {
                                                    if (typedValuePeekValue.type == 3) {
                                                        dscVar.m = typedArrayObtainStyledAttributes3.getString(index3);
                                                        if (dscVar.m.indexOf("/") > 0) {
                                                            dscVar.n = typedArrayObtainStyledAttributes3.getResourceId(index3, -1);
                                                        }
                                                    } else {
                                                        typedArrayObtainStyledAttributes3.getInteger(index3, dscVar.n);
                                                    }
                                                    break;
                                                } else {
                                                    dscVar.n = typedArrayObtainStyledAttributes3.getResourceId(index3, -1);
                                                    break;
                                                }
                                            default:
                                                break;
                                        }
                                    }
                                    typedArrayObtainStyledAttributes3.recycle();
                                }
                                break;
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    dsaVarT = t(context, android.util.Xml.asAttributeSet(xmlPullParser), true);
                                }
                                break;
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    if (dsaVarT == null) {
                                        throw new java.lang.RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    defpackage.dsd dsdVar = dsaVarT.b;
                                    android.content.res.TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), defpackage.dsj.g);
                                    dsdVar.a = true;
                                    int indexCount4 = typedArrayObtainStyledAttributes4.getIndexCount();
                                    for (int i9 = 0; i9 < indexCount4; i9++) {
                                        int index4 = typedArrayObtainStyledAttributes4.getIndex(i9);
                                        if (index4 == 1) {
                                            dsdVar.d = typedArrayObtainStyledAttributes4.getFloat(1, dsdVar.d);
                                        } else {
                                            if (index4 == 0) {
                                                int i10 = typedArrayObtainStyledAttributes4.getInt(0, dsdVar.b);
                                                dsdVar.b = i10;
                                                dsdVar.b = a[i10];
                                            } else if (index4 == 4) {
                                                dsdVar.c = typedArrayObtainStyledAttributes4.getInt(4, dsdVar.c);
                                            } else if (index4 == 3) {
                                                dsdVar.e = typedArrayObtainStyledAttributes4.getFloat(3, dsdVar.e);
                                            }
                                        }
                                    }
                                    typedArrayObtainStyledAttributes4.recycle();
                                }
                                break;
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    if (dsaVarT == null) {
                                        throw new java.lang.RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    defpackage.dse dseVar = dsaVarT.e;
                                    android.content.res.TypedArray typedArrayObtainStyledAttributes5 = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), defpackage.dsj.i);
                                    dseVar.b = true;
                                    int indexCount5 = typedArrayObtainStyledAttributes5.getIndexCount();
                                    for (int i11 = 0; i11 < indexCount5; i11++) {
                                        int index5 = typedArrayObtainStyledAttributes5.getIndex(i11);
                                        switch (defpackage.dse.a.get(index5)) {
                                            case 1:
                                                dseVar.c = typedArrayObtainStyledAttributes5.getFloat(index5, dseVar.c);
                                                break;
                                            case 2:
                                                dseVar.d = typedArrayObtainStyledAttributes5.getFloat(index5, dseVar.d);
                                                break;
                                            case 3:
                                                dseVar.e = typedArrayObtainStyledAttributes5.getFloat(index5, dseVar.e);
                                                break;
                                            case 4:
                                                dseVar.f = typedArrayObtainStyledAttributes5.getFloat(index5, dseVar.f);
                                                break;
                                            case 5:
                                                dseVar.g = typedArrayObtainStyledAttributes5.getFloat(index5, dseVar.g);
                                                break;
                                            case 6:
                                                dseVar.h = typedArrayObtainStyledAttributes5.getDimension(index5, dseVar.h);
                                                break;
                                            case 7:
                                                dseVar.i = typedArrayObtainStyledAttributes5.getDimension(index5, dseVar.i);
                                                break;
                                            case 8:
                                                dseVar.k = typedArrayObtainStyledAttributes5.getDimension(index5, dseVar.k);
                                                break;
                                            case 9:
                                                dseVar.l = typedArrayObtainStyledAttributes5.getDimension(index5, dseVar.l);
                                                break;
                                            case 10:
                                                dseVar.m = typedArrayObtainStyledAttributes5.getDimension(index5, dseVar.m);
                                                break;
                                            case 11:
                                                dseVar.n = true;
                                                dseVar.o = typedArrayObtainStyledAttributes5.getDimension(index5, dseVar.o);
                                                break;
                                            case 12:
                                                dseVar.j = a(typedArrayObtainStyledAttributes5, index5, dseVar.j);
                                                break;
                                        }
                                    }
                                    typedArrayObtainStyledAttributes5.recycle();
                                }
                                break;
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    dsaVarT = t(context, android.util.Xml.asAttributeSet(xmlPullParser), false);
                                    defpackage.dsb dsbVar2 = dsaVarT.d;
                                    dsbVar2.b = true;
                                    dsbVar2.c = true;
                                }
                                break;
                            case 366511058:
                                if (name.equals("CustomMethod")) {
                                    if (dsaVarT != null) {
                                        throw new java.lang.RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    map = dsaVarT.f;
                                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), defpackage.dsj.d);
                                    indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                                    i = 0;
                                    i2 = 0;
                                    z = false;
                                    string = null;
                                    objValueOf = null;
                                    while (i < indexCount) {
                                        index = typedArrayObtainStyledAttributes.getIndex(i);
                                        if (index == 0) {
                                            string = typedArrayObtainStyledAttributes.getString(0);
                                            if (string == null && string.length() > 0) {
                                                string = java.lang.Character.toUpperCase(string.charAt(0)) + string.substring(1);
                                            }
                                        } else if (index == 10) {
                                            string = typedArrayObtainStyledAttributes.getString(10);
                                            z = true;
                                        } else if (index == 1) {
                                            objValueOf = java.lang.Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(1, false));
                                            i2 = 6;
                                        } else {
                                            if (index == i5) {
                                                objValueOf = java.lang.Integer.valueOf(typedArrayObtainStyledAttributes.getColor(i5, 0));
                                            } else if (index == i4) {
                                                objValueOf = java.lang.Integer.valueOf(typedArrayObtainStyledAttributes.getColor(i4, 0));
                                                i2 = 4;
                                            } else {
                                                i5 = 7;
                                                if (index == 7) {
                                                    objValueOf = java.lang.Float.valueOf(android.util.TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(7, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED), context.getResources().getDisplayMetrics()));
                                                } else if (index == 4) {
                                                    objValueOf = java.lang.Float.valueOf(typedArrayObtainStyledAttributes.getDimension(4, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED));
                                                    i2 = 7;
                                                } else {
                                                    i3 = 5;
                                                    if (index == 5) {
                                                        objValueOf = java.lang.Float.valueOf(typedArrayObtainStyledAttributes.getFloat(5, Float.NaN));
                                                        i2 = 2;
                                                    } else if (index == 6) {
                                                        objValueOf = java.lang.Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(6, -1));
                                                        i2 = 1;
                                                    } else {
                                                        if (index == 9) {
                                                            objValueOf = typedArrayObtainStyledAttributes.getString(9);
                                                        } else {
                                                            i3 = 8;
                                                            if (index != 8) {
                                                                resourceId = typedArrayObtainStyledAttributes.getResourceId(8, -1);
                                                                if (resourceId == -1) {
                                                                    resourceId = typedArrayObtainStyledAttributes.getInt(8, -1);
                                                                }
                                                                objValueOf = java.lang.Integer.valueOf(resourceId);
                                                            }
                                                        }
                                                        i2 = i3;
                                                    }
                                                }
                                            }
                                            i2 = i5;
                                        }
                                        i++;
                                        i4 = 2;
                                        i5 = 3;
                                    }
                                    if (string != null && (obj = objValueOf) != null) {
                                        map.put(string, new defpackage.drs(string, i2, obj, z));
                                    }
                                    typedArrayObtainStyledAttributes.recycle();
                                }
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    dsaVarT = t(context, android.util.Xml.asAttributeSet(xmlPullParser), false);
                                    dsaVarT.d.aj = 1;
                                }
                                break;
                            case 1791837707:
                                if (name.equals("CustomAttribute")) {
                                    if (dsaVarT != null) {
                                        throw new java.lang.RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    map = dsaVarT.f;
                                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), defpackage.dsj.d);
                                    indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                                    i = 0;
                                    i2 = 0;
                                    z = false;
                                    string = null;
                                    objValueOf = null;
                                    while (i < indexCount) {
                                        index = typedArrayObtainStyledAttributes.getIndex(i);
                                        if (index == 0) {
                                            string = typedArrayObtainStyledAttributes.getString(0);
                                            if (string == null) {
                                            }
                                        } else if (index == 10) {
                                            string = typedArrayObtainStyledAttributes.getString(10);
                                            z = true;
                                        } else if (index == 1) {
                                            objValueOf = java.lang.Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(1, false));
                                            i2 = 6;
                                        } else {
                                            if (index == i5) {
                                                objValueOf = java.lang.Integer.valueOf(typedArrayObtainStyledAttributes.getColor(i5, 0));
                                            } else if (index == i4) {
                                                objValueOf = java.lang.Integer.valueOf(typedArrayObtainStyledAttributes.getColor(i4, 0));
                                                i2 = 4;
                                            } else {
                                                i5 = 7;
                                                if (index == 7) {
                                                    objValueOf = java.lang.Float.valueOf(android.util.TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(7, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED), context.getResources().getDisplayMetrics()));
                                                } else if (index == 4) {
                                                    objValueOf = java.lang.Float.valueOf(typedArrayObtainStyledAttributes.getDimension(4, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED));
                                                    i2 = 7;
                                                } else {
                                                    i3 = 5;
                                                    if (index == 5) {
                                                        objValueOf = java.lang.Float.valueOf(typedArrayObtainStyledAttributes.getFloat(5, Float.NaN));
                                                        i2 = 2;
                                                    } else if (index == 6) {
                                                        objValueOf = java.lang.Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(6, -1));
                                                        i2 = 1;
                                                    } else {
                                                        if (index == 9) {
                                                            objValueOf = typedArrayObtainStyledAttributes.getString(9);
                                                        } else {
                                                            i3 = 8;
                                                            if (index != 8) {
                                                                resourceId = typedArrayObtainStyledAttributes.getResourceId(8, -1);
                                                                if (resourceId == -1) {
                                                                    resourceId = typedArrayObtainStyledAttributes.getInt(8, -1);
                                                                }
                                                                objValueOf = java.lang.Integer.valueOf(resourceId);
                                                            }
                                                        }
                                                        i2 = i3;
                                                    }
                                                }
                                            }
                                            i2 = i5;
                                        }
                                        i++;
                                        i4 = 2;
                                        i5 = 3;
                                    }
                                    if (string != null) {
                                        map.put(string, new defpackage.drs(string, i2, obj, z));
                                    }
                                    typedArrayObtainStyledAttributes.recycle();
                                }
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    dsaVarT = t(context, android.util.Xml.asAttributeSet(xmlPullParser), false);
                                }
                                break;
                        }
                    } else if (eventType == 3) {
                        java.lang.String lowerCase = xmlPullParser.getName().toLowerCase(java.util.Locale.ROOT);
                        switch (lowerCase.hashCode()) {
                            case -2075718416:
                                if (lowerCase.equals("guideline")) {
                                    this.e.put(java.lang.Integer.valueOf(dsaVarT.a), dsaVarT);
                                    dsaVarT = null;
                                }
                                break;
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    this.e.put(java.lang.Integer.valueOf(dsaVarT.a), dsaVarT);
                                    dsaVarT = null;
                                }
                                break;
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    this.e.put(java.lang.Integer.valueOf(dsaVarT.a), dsaVarT);
                                    dsaVarT = null;
                                }
                                break;
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    return;
                                }
                                break;
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (java.io.IOException e) {
            android.util.Log.e("ConstraintSet", "Error parsing XML resource", e);
        } catch (org.xmlpull.v1.XmlPullParserException e2) {
            android.util.Log.e("ConstraintSet", "Error parsing XML resource", e2);
        }
    }

    public final void o(int i, int i2) {
        b(i).d.f = i2;
        b(i).d.g = -1;
        b(i).d.h = -1.0f;
    }

    public final void p(int i, int i2) {
        b(i).d.g = i2;
        b(i).d.f = -1;
        b(i).d.h = -1.0f;
    }

    public final void q(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        java.lang.String resourceEntryName;
        java.util.HashSet hashSet;
        java.util.HashMap map;
        int i;
        int i2;
        int childCount = constraintLayout.getChildCount();
        java.util.HashMap map2 = this.e;
        java.util.HashSet<java.lang.Integer> hashSet2 = new java.util.HashSet(map2.keySet());
        int i3 = 0;
        while (i3 < childCount) {
            android.view.View childAt = constraintLayout.getChildAt(i3);
            int id = childAt.getId();
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(id);
            if (!map2.containsKey(numValueOf)) {
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (java.lang.Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                android.util.Log.w("ConstraintSet", "id unknown ".concat(java.lang.String.valueOf(resourceEntryName)));
            } else {
                if (id == -1) {
                    throw new java.lang.RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    java.util.HashMap map3 = this.e;
                    if (map3.containsKey(numValueOf)) {
                        hashSet2.remove(numValueOf);
                        defpackage.dsa dsaVar = (defpackage.dsa) map3.get(numValueOf);
                        if (dsaVar != null) {
                            if (childAt instanceof androidx.constraintlayout.widget.Barrier) {
                                defpackage.dsb dsbVar = dsaVar.d;
                                dsbVar.aj = 1;
                                androidx.constraintlayout.widget.Barrier barrier = (androidx.constraintlayout.widget.Barrier) childAt;
                                barrier.setId(id);
                                barrier.a = dsbVar.ah;
                                barrier.b(dsbVar.ai);
                                barrier.b.b = dsbVar.ap;
                                int[] iArr = dsbVar.ak;
                                if (iArr != null) {
                                    barrier.j(iArr);
                                } else {
                                    java.lang.String str = dsbVar.al;
                                    if (str != null) {
                                        dsbVar.ak = s(barrier, str);
                                        barrier.j(dsbVar.ak);
                                    }
                                }
                            }
                            defpackage.drv drvVar = (defpackage.drv) childAt.getLayoutParams();
                            drvVar.a();
                            dsaVar.a(drvVar);
                            java.util.HashMap map4 = dsaVar.f;
                            java.lang.Class<?> cls = childAt.getClass();
                            for (java.lang.String str2 : map4.keySet()) {
                                defpackage.drs drsVar = (defpackage.drs) map4.get(str2);
                                hashSet2 = hashSet2;
                                java.lang.String strConcat = !drsVar.a ? "set".concat(java.lang.String.valueOf(str2)) : str2;
                                try {
                                    int i4 = drsVar.h;
                                    int i5 = i4 - 1;
                                    if (i4 == 0) {
                                        i2 = i3;
                                        throw null;
                                    }
                                    switch (i5) {
                                        case 0:
                                            i2 = i3;
                                            cls.getMethod(strConcat, java.lang.Integer.TYPE).invoke(childAt, java.lang.Integer.valueOf(drsVar.c));
                                            i3 = i2;
                                            break;
                                        case 1:
                                            i2 = i3;
                                            cls.getMethod(strConcat, java.lang.Float.TYPE).invoke(childAt, java.lang.Float.valueOf(drsVar.d));
                                            i3 = i2;
                                            break;
                                        case 2:
                                            i2 = i3;
                                            cls.getMethod(strConcat, java.lang.Integer.TYPE).invoke(childAt, java.lang.Integer.valueOf(drsVar.g));
                                            i3 = i2;
                                            break;
                                        case 3:
                                            i2 = i3;
                                            java.lang.reflect.Method method = cls.getMethod(strConcat, android.graphics.drawable.Drawable.class);
                                            android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable();
                                            colorDrawable.setColor(drsVar.g);
                                            method.invoke(childAt, colorDrawable);
                                            i3 = i2;
                                            break;
                                        case 4:
                                            i2 = i3;
                                            cls.getMethod(strConcat, java.lang.CharSequence.class).invoke(childAt, drsVar.e);
                                            i3 = i2;
                                            break;
                                        case 5:
                                            i2 = i3;
                                            cls.getMethod(strConcat, java.lang.Boolean.TYPE).invoke(childAt, java.lang.Boolean.valueOf(drsVar.f));
                                            i3 = i2;
                                            break;
                                        case 6:
                                            i2 = i3;
                                            cls.getMethod(strConcat, java.lang.Float.TYPE).invoke(childAt, java.lang.Float.valueOf(drsVar.d));
                                            i3 = i2;
                                            break;
                                        case 7:
                                            i2 = i3;
                                            try {
                                                cls.getMethod(strConcat, java.lang.Integer.TYPE).invoke(childAt, java.lang.Integer.valueOf(drsVar.c));
                                            } catch (java.lang.IllegalAccessException e) {
                                                e = e;
                                                android.util.Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e);
                                            } catch (java.lang.NoSuchMethodException e2) {
                                                e = e2;
                                                android.util.Log.e("TransitionLayout", cls.getName() + " must have a method " + strConcat, e);
                                            } catch (java.lang.reflect.InvocationTargetException e3) {
                                                e = e3;
                                                android.util.Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e);
                                            }
                                            i3 = i2;
                                            break;
                                    }
                                } catch (java.lang.IllegalAccessException e4) {
                                    e = e4;
                                    i2 = i3;
                                } catch (java.lang.NoSuchMethodException e5) {
                                    e = e5;
                                    i2 = i3;
                                } catch (java.lang.reflect.InvocationTargetException e6) {
                                    e = e6;
                                    i2 = i3;
                                }
                            }
                            hashSet = hashSet2;
                            map = map2;
                            i = i3;
                            childAt.setLayoutParams(drvVar);
                            defpackage.dsd dsdVar = dsaVar.b;
                            if (dsdVar.c == 0) {
                                childAt.setVisibility(dsdVar.b);
                            }
                            childAt.setAlpha(dsdVar.d);
                            defpackage.dse dseVar = dsaVar.e;
                            childAt.setRotation(dseVar.c);
                            childAt.setRotationX(dseVar.d);
                            childAt.setRotationY(dseVar.e);
                            childAt.setScaleX(dseVar.f);
                            childAt.setScaleY(dseVar.g);
                            if (dseVar.j != -1) {
                                android.view.View viewFindViewById = ((android.view.View) childAt.getParent()).findViewById(dseVar.j);
                                if (viewFindViewById != null) {
                                    int top = viewFindViewById.getTop() + viewFindViewById.getBottom();
                                    int left = viewFindViewById.getLeft() + viewFindViewById.getRight();
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float f = left;
                                        float left2 = childAt.getLeft();
                                        float top2 = childAt.getTop();
                                        childAt.setPivotX((f / 2.0f) - left2);
                                        childAt.setPivotY((top / 2.0f) - top2);
                                    }
                                }
                            } else {
                                if (!java.lang.Float.isNaN(dseVar.h)) {
                                    childAt.setPivotX(dseVar.h);
                                }
                                if (!java.lang.Float.isNaN(dseVar.i)) {
                                    childAt.setPivotY(dseVar.i);
                                }
                            }
                            childAt.setTranslationX(dseVar.k);
                            childAt.setTranslationY(dseVar.l);
                            childAt.setTranslationZ(dseVar.m);
                            if (dseVar.n) {
                                childAt.setElevation(dseVar.o);
                            }
                        } else {
                            hashSet = hashSet2;
                            map = map2;
                            i = i3;
                        }
                    } else {
                        hashSet = hashSet2;
                        map = map2;
                        i = i3;
                        android.util.Log.v("ConstraintSet", defpackage.a.bo(id, "WARNING NO CONSTRAINTS for view "));
                    }
                }
                i3 = i + 1;
                hashSet2 = hashSet;
                map2 = map;
            }
            hashSet = hashSet2;
            map = map2;
            i = i3;
            i3 = i + 1;
            hashSet2 = hashSet;
            map2 = map;
        }
        for (java.lang.Integer num : hashSet2) {
            defpackage.dsa dsaVar2 = (defpackage.dsa) this.e.get(num);
            if (dsaVar2 != null) {
                defpackage.dsb dsbVar2 = dsaVar2.d;
                if (dsbVar2.aj == 1) {
                    androidx.constraintlayout.widget.Barrier barrier2 = new androidx.constraintlayout.widget.Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = dsbVar2.ak;
                    if (iArr2 != null) {
                        barrier2.j(iArr2);
                    } else {
                        java.lang.String str3 = dsbVar2.al;
                        if (str3 != null) {
                            dsbVar2.ak = s(barrier2, str3);
                            barrier2.j(dsbVar2.ak);
                        }
                    }
                    barrier2.a = dsbVar2.ah;
                    barrier2.b(dsbVar2.ai);
                    defpackage.drv drvVar2 = new defpackage.drv();
                    barrier2.k();
                    dsaVar2.a(drvVar2);
                    constraintLayout.addView(barrier2, drvVar2);
                }
                if (dsbVar2.b) {
                    androidx.constraintlayout.widget.Guideline guideline = new androidx.constraintlayout.widget.Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    defpackage.drv drvVar3 = new defpackage.drv();
                    dsaVar2.a(drvVar3);
                    constraintLayout.addView(guideline, drvVar3);
                }
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt2 = constraintLayout.getChildAt(i6);
            if (childAt2 instanceof defpackage.drt) {
                ((defpackage.drt) childAt2).g(constraintLayout);
            }
        }
    }

    public final void r(int i, int i2, int i3, int i4) {
        java.util.HashMap map = this.e;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new defpackage.dsa());
        }
        defpackage.dsa dsaVar = (defpackage.dsa) map.get(numValueOf);
        if (dsaVar == null) {
            return;
        }
        if (i2 != 2) {
            if (i3 != 3) {
                throw new java.lang.IllegalArgumentException("right to " + u(i3) + " undefined");
            }
            defpackage.dsb dsbVar = dsaVar.d;
            dsbVar.n = 0;
            dsbVar.o = -1;
            dsbVar.r = -1;
            dsbVar.s = -1;
            dsbVar.t = -1;
            dsbVar.J = i4;
            return;
        }
        if (i3 == 1) {
            defpackage.dsb dsbVar2 = dsaVar.d;
            dsbVar2.l = 0;
            dsbVar2.m = -1;
        } else {
            if (i3 != 2) {
                throw new java.lang.IllegalArgumentException("right to " + u(3) + " undefined");
            }
            defpackage.dsb dsbVar3 = dsaVar.d;
            dsbVar3.m = 0;
            dsbVar3.l = -1;
        }
        dsaVar.d.I = i4;
    }
}
