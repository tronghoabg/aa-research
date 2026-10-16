package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class drx {
    public static final int[] a = {0, 4, 8};
    private static final SparseIntArray b;
    private static final SparseIntArray c;
    private final HashMap d = new HashMap();
    private final HashMap e = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        c = sparseIntArray2;
        int[] iArr = dsb.a;
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
        sparseIntArray.append(EnergyProfile.EVCONNECTOR_TYPE_OTHER, 6);
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
        sparseIntArray2.append(EnergyProfile.EVCONNECTOR_TYPE_OTHER, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void l(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drx.l(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    static void m(drn drnVar, String str) throws NumberFormatException {
        int i;
        int i2 = -1;
        float fAbs = Float.NaN;
        if (str != null) {
            int iIndexOf = str.indexOf(44);
            int length = str.length();
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                i = -1;
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                i = iIndexOf + 1;
                i = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            }
            int iIndexOf2 = str.indexOf(58);
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                }
                i2 = i;
            } else {
                String strSubstring3 = str.substring(i, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                    float f = Float.parseFloat(strSubstring3);
                    float f2 = Float.parseFloat(strSubstring4);
                    if (f > BitmapDescriptorFactory.HUE_RED && f2 > BitmapDescriptorFactory.HUE_RED) {
                        fAbs = i == 1 ? Math.abs(f2 / f) : Math.abs(f / f2);
                    }
                }
                i2 = i;
            }
        }
        drnVar.I = str;
        drnVar.J = fAbs;
        drnVar.K = i2;
    }

    private static final int[] r(View view, String str) throws IllegalAccessException, IllegalArgumentException {
        int length;
        int iIntValue;
        Object objD;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = strArrSplit.length;
            if (i >= length) {
                break;
            }
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = dsa.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0) {
                iIntValue = (view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objD = ((ConstraintLayout) view.getParent()).d(strTrim)) != null && (objD instanceof Integer)) ? ((Integer) objD).intValue() : 0;
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    private static final drs s(Context context, AttributeSet attributeSet, boolean z) throws NumberFormatException {
        String str;
        String str2;
        int i;
        drs drsVar = new drs();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? dsb.c : dsb.a);
        String str3 = "unused attribute 0x";
        int i2 = 0;
        if (z) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            drr drrVar = new drr();
            drsVar.g = drrVar;
            dru druVar = drsVar.c;
            druVar.b = false;
            drt drtVar = drsVar.d;
            drtVar.c = false;
            drv drvVar = drsVar.b;
            drvVar.a = false;
            drw drwVar = drsVar.e;
            drwVar.b = false;
            while (i2 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = i2;
                switch (c.get(index)) {
                    case 2:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, drtVar.K));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    case 30:
                    case 32:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    case Maneuver.TYPE_STRAIGHT /* 36 */:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        str2 = str3;
                        i = indexCount;
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + b.get(index));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 5:
                        str2 = str3;
                        i = indexCount;
                        drrVar.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 6:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, drtVar.E));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 7:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, drtVar.F));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 8:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, drtVar.L));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 11:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, drtVar.R));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 12:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, drtVar.S));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 13:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, drtVar.O));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 14:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, drtVar.Q));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 15:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, drtVar.T));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 16:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, drtVar.P));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 17:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, drtVar.f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 18:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, drtVar.g));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 19:
                        str2 = str3;
                        i = indexCount;
                        drrVar.a(19, typedArrayObtainStyledAttributes.getFloat(index, drtVar.h));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 20:
                        str2 = str3;
                        i = indexCount;
                        drrVar.a(20, typedArrayObtainStyledAttributes.getFloat(index, drtVar.y));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 21:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, drtVar.e));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 22:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(22, a[typedArrayObtainStyledAttributes.getInt(index, drvVar.b)]);
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 23:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, drtVar.d));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 24:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, drtVar.H));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 27:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(27, typedArrayObtainStyledAttributes.getInt(index, drtVar.G));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, drtVar.I));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 31:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, drtVar.M));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, drtVar.J));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 37:
                        str2 = str3;
                        i = indexCount;
                        drrVar.a(37, typedArrayObtainStyledAttributes.getFloat(index, drtVar.z));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                        str2 = str3;
                        i = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, drsVar.a);
                        drsVar.a = resourceId;
                        drrVar.b(38, resourceId);
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                        str2 = str3;
                        i = indexCount;
                        drrVar.a(39, typedArrayObtainStyledAttributes.getFloat(index, drtVar.W));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                        str2 = str3;
                        i = indexCount;
                        drrVar.a(40, typedArrayObtainStyledAttributes.getFloat(index, drtVar.V));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(41, typedArrayObtainStyledAttributes.getInt(index, drtVar.X));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(42, typedArrayObtainStyledAttributes.getInt(index, drtVar.Y));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                        str2 = str3;
                        i = indexCount;
                        drrVar.a(43, typedArrayObtainStyledAttributes.getFloat(index, drvVar.d));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                        str2 = str3;
                        i = indexCount;
                        drrVar.d(44, true);
                        drrVar.a(44, typedArrayObtainStyledAttributes.getDimension(index, drwVar.o));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                        str2 = str3;
                        i = indexCount;
                        drrVar.a(45, typedArrayObtainStyledAttributes.getFloat(index, drwVar.d));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                        str2 = str3;
                        i = indexCount;
                        drrVar.a(46, typedArrayObtainStyledAttributes.getFloat(index, drwVar.e));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                        str2 = str3;
                        i = indexCount;
                        drrVar.a(47, typedArrayObtainStyledAttributes.getFloat(index, drwVar.f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 48:
                        str2 = str3;
                        i = indexCount;
                        drrVar.a(48, typedArrayObtainStyledAttributes.getFloat(index, drwVar.g));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                        str2 = str3;
                        i = indexCount;
                        drrVar.a(49, typedArrayObtainStyledAttributes.getDimension(index, drwVar.h));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        str2 = str3;
                        i = indexCount;
                        drrVar.a(50, typedArrayObtainStyledAttributes.getDimension(index, drwVar.i));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 51:
                        str2 = str3;
                        i = indexCount;
                        drrVar.a(51, typedArrayObtainStyledAttributes.getDimension(index, drwVar.k));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 52:
                        str2 = str3;
                        i = indexCount;
                        drrVar.a(52, typedArrayObtainStyledAttributes.getDimension(index, drwVar.l));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 53:
                        str2 = str3;
                        i = indexCount;
                        drrVar.a(53, typedArrayObtainStyledAttributes.getDimension(index, drwVar.m));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 54:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(54, typedArrayObtainStyledAttributes.getInt(index, drtVar.Z));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 55:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(55, typedArrayObtainStyledAttributes.getInt(index, drtVar.aa));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 56:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, drtVar.ab));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 57:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, drtVar.ac));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 58:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, drtVar.ad));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 59:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, drtVar.ae));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 60:
                        str2 = str3;
                        i = indexCount;
                        drrVar.a(60, typedArrayObtainStyledAttributes.getFloat(index, drwVar.c));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 62:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, drtVar.C));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 63:
                        str2 = str3;
                        i = indexCount;
                        drrVar.a(63, typedArrayObtainStyledAttributes.getFloat(index, drtVar.D));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(64, a(typedArrayObtainStyledAttributes, index, druVar.c));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 65:
                        str2 = str3;
                        i = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            drrVar.c(65, typedArrayObtainStyledAttributes.getString(index));
                            continue;
                        } else {
                            drrVar.c(65, dpd.a[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 66:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 67:
                        str2 = str3;
                        i = indexCount;
                        drrVar.a(67, typedArrayObtainStyledAttributes.getFloat(index, druVar.j));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 68:
                        str2 = str3;
                        i = indexCount;
                        drrVar.a(68, typedArrayObtainStyledAttributes.getFloat(index, drvVar.e));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 69:
                        str2 = str3;
                        i = indexCount;
                        drrVar.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 70:
                        str2 = str3;
                        i = indexCount;
                        drrVar.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 71:
                        str2 = str3;
                        i = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 72:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(72, typedArrayObtainStyledAttributes.getInt(index, drtVar.ah));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 73:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, drtVar.ai));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 74:
                        str2 = str3;
                        i = indexCount;
                        drrVar.c(74, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 75:
                        str2 = str3;
                        i = indexCount;
                        drrVar.d(75, typedArrayObtainStyledAttributes.getBoolean(index, drtVar.ap));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 76:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(76, typedArrayObtainStyledAttributes.getInt(index, druVar.f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 77:
                        str2 = str3;
                        i = indexCount;
                        drrVar.c(77, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 78:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(78, typedArrayObtainStyledAttributes.getInt(index, drvVar.c));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 79:
                        str2 = str3;
                        i = indexCount;
                        drrVar.a(79, typedArrayObtainStyledAttributes.getFloat(index, druVar.h));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                        str2 = str3;
                        i = indexCount;
                        drrVar.d(80, typedArrayObtainStyledAttributes.getBoolean(index, drtVar.an));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 81:
                        str2 = str3;
                        i = indexCount;
                        drrVar.d(81, typedArrayObtainStyledAttributes.getBoolean(index, drtVar.ao));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 82:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, druVar.d));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 83:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(83, a(typedArrayObtainStyledAttributes, index, drwVar.j));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 84:
                        str2 = str3;
                        i = indexCount;
                        drrVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, druVar.l));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 85:
                        str2 = str3;
                        i = indexCount;
                        drrVar.a(85, typedArrayObtainStyledAttributes.getFloat(index, druVar.k));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 86:
                        i = indexCount;
                        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(index);
                        str2 = str3;
                        if (typedValuePeekValue.type == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            druVar.n = resourceId2;
                            drrVar.b(89, resourceId2);
                            if (druVar.n != -1) {
                                drrVar.b(88, -2);
                            } else {
                                continue;
                            }
                        } else if (typedValuePeekValue.type == 3) {
                            druVar.m = typedArrayObtainStyledAttributes.getString(index);
                            drrVar.c(90, druVar.m);
                            if (druVar.m.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                druVar.n = resourceId3;
                                drrVar.b(89, resourceId3);
                                drrVar.b(88, -2);
                            } else {
                                drrVar.b(88, -1);
                            }
                        } else {
                            drrVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, druVar.n));
                        }
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 87:
                        i = indexCount;
                        Log.w("ConstraintSet", str3 + Integer.toHexString(index) + "   " + b.get(index));
                        break;
                    case 93:
                        i = indexCount;
                        drrVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, drtVar.N));
                        break;
                    case 94:
                        i = indexCount;
                        drrVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, drtVar.U));
                        break;
                    case 95:
                        i = indexCount;
                        l(drrVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                        i = indexCount;
                        l(drrVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i = indexCount;
                        drrVar.b(97, typedArrayObtainStyledAttributes.getInt(index, drtVar.aq));
                        break;
                    case 98:
                        i = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                            drsVar.a = typedArrayObtainStyledAttributes.getResourceId(index, drsVar.a);
                            break;
                        } else {
                            typedArrayObtainStyledAttributes.getString(index);
                            break;
                        }
                    case 99:
                        drrVar.d(99, typedArrayObtainStyledAttributes.getBoolean(index, drtVar.i));
                        str2 = str3;
                        i = indexCount;
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                }
                str2 = str3;
                i2 = i3 + 1;
                indexCount = i;
                str3 = str2;
            }
        } else {
            String str4 = "unused attribute 0x";
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            int i4 = 0;
            while (i4 < indexCount2) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index2 != 1 && index2 != 23 && index2 != 24) {
                    drsVar.c.b = true;
                    drsVar.d.c = true;
                    drsVar.b.a = true;
                    drsVar.e.b = true;
                }
                SparseIntArray sparseIntArray = b;
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        str = str4;
                        drt drtVar2 = drsVar.d;
                        drtVar2.r = a(typedArrayObtainStyledAttributes, index2, drtVar2.r);
                        break;
                    case 2:
                        str = str4;
                        drt drtVar3 = drsVar.d;
                        drtVar3.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, drtVar3.K);
                        break;
                    case 3:
                        str = str4;
                        drt drtVar4 = drsVar.d;
                        drtVar4.q = a(typedArrayObtainStyledAttributes, index2, drtVar4.q);
                        break;
                    case 4:
                        str = str4;
                        drt drtVar5 = drsVar.d;
                        drtVar5.p = a(typedArrayObtainStyledAttributes, index2, drtVar5.p);
                        break;
                    case 5:
                        str = str4;
                        drsVar.d.A = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        str = str4;
                        drt drtVar6 = drsVar.d;
                        drtVar6.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, drtVar6.E);
                        break;
                    case 7:
                        str = str4;
                        drt drtVar7 = drsVar.d;
                        drtVar7.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, drtVar7.F);
                        break;
                    case 8:
                        str = str4;
                        drt drtVar8 = drsVar.d;
                        drtVar8.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, drtVar8.L);
                        break;
                    case 9:
                        str = str4;
                        drt drtVar9 = drsVar.d;
                        drtVar9.x = a(typedArrayObtainStyledAttributes, index2, drtVar9.x);
                        break;
                    case 10:
                        str = str4;
                        drt drtVar10 = drsVar.d;
                        drtVar10.w = a(typedArrayObtainStyledAttributes, index2, drtVar10.w);
                        break;
                    case 11:
                        str = str4;
                        drt drtVar11 = drsVar.d;
                        drtVar11.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, drtVar11.R);
                        break;
                    case 12:
                        str = str4;
                        drt drtVar12 = drsVar.d;
                        drtVar12.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, drtVar12.S);
                        break;
                    case 13:
                        str = str4;
                        drt drtVar13 = drsVar.d;
                        drtVar13.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, drtVar13.O);
                        break;
                    case 14:
                        str = str4;
                        drt drtVar14 = drsVar.d;
                        drtVar14.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, drtVar14.Q);
                        break;
                    case 15:
                        str = str4;
                        drt drtVar15 = drsVar.d;
                        drtVar15.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, drtVar15.T);
                        break;
                    case 16:
                        str = str4;
                        drt drtVar16 = drsVar.d;
                        drtVar16.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, drtVar16.P);
                        break;
                    case 17:
                        str = str4;
                        drt drtVar17 = drsVar.d;
                        drtVar17.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, drtVar17.f);
                        break;
                    case 18:
                        str = str4;
                        drt drtVar18 = drsVar.d;
                        drtVar18.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, drtVar18.g);
                        break;
                    case 19:
                        str = str4;
                        drt drtVar19 = drsVar.d;
                        drtVar19.h = typedArrayObtainStyledAttributes.getFloat(index2, drtVar19.h);
                        break;
                    case 20:
                        str = str4;
                        drt drtVar20 = drsVar.d;
                        drtVar20.y = typedArrayObtainStyledAttributes.getFloat(index2, drtVar20.y);
                        break;
                    case 21:
                        str = str4;
                        drt drtVar21 = drsVar.d;
                        drtVar21.e = typedArrayObtainStyledAttributes.getLayoutDimension(index2, drtVar21.e);
                        break;
                    case 22:
                        str = str4;
                        drv drvVar2 = drsVar.b;
                        int i5 = typedArrayObtainStyledAttributes.getInt(index2, drvVar2.b);
                        drvVar2.b = i5;
                        drvVar2.b = a[i5];
                        break;
                    case 23:
                        str = str4;
                        drt drtVar22 = drsVar.d;
                        drtVar22.d = typedArrayObtainStyledAttributes.getLayoutDimension(index2, drtVar22.d);
                        break;
                    case 24:
                        str = str4;
                        drt drtVar23 = drsVar.d;
                        drtVar23.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, drtVar23.H);
                        break;
                    case 25:
                        str = str4;
                        drt drtVar24 = drsVar.d;
                        drtVar24.j = a(typedArrayObtainStyledAttributes, index2, drtVar24.j);
                        break;
                    case 26:
                        str = str4;
                        drt drtVar25 = drsVar.d;
                        drtVar25.k = a(typedArrayObtainStyledAttributes, index2, drtVar25.k);
                        break;
                    case 27:
                        str = str4;
                        drt drtVar26 = drsVar.d;
                        drtVar26.G = typedArrayObtainStyledAttributes.getInt(index2, drtVar26.G);
                        break;
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        str = str4;
                        drt drtVar27 = drsVar.d;
                        drtVar27.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, drtVar27.I);
                        break;
                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                        str = str4;
                        drt drtVar28 = drsVar.d;
                        drtVar28.l = a(typedArrayObtainStyledAttributes, index2, drtVar28.l);
                        break;
                    case 30:
                        str = str4;
                        drt drtVar29 = drsVar.d;
                        drtVar29.m = a(typedArrayObtainStyledAttributes, index2, drtVar29.m);
                        break;
                    case 31:
                        str = str4;
                        drt drtVar30 = drsVar.d;
                        drtVar30.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, drtVar30.M);
                        break;
                    case 32:
                        str = str4;
                        drt drtVar31 = drsVar.d;
                        drtVar31.u = a(typedArrayObtainStyledAttributes, index2, drtVar31.u);
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                        str = str4;
                        drt drtVar32 = drsVar.d;
                        drtVar32.v = a(typedArrayObtainStyledAttributes, index2, drtVar32.v);
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                        str = str4;
                        drt drtVar33 = drsVar.d;
                        drtVar33.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, drtVar33.J);
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                        str = str4;
                        drt drtVar34 = drsVar.d;
                        drtVar34.o = a(typedArrayObtainStyledAttributes, index2, drtVar34.o);
                        break;
                    case Maneuver.TYPE_STRAIGHT /* 36 */:
                        str = str4;
                        drt drtVar35 = drsVar.d;
                        drtVar35.n = a(typedArrayObtainStyledAttributes, index2, drtVar35.n);
                        break;
                    case 37:
                        str = str4;
                        drt drtVar36 = drsVar.d;
                        drtVar36.z = typedArrayObtainStyledAttributes.getFloat(index2, drtVar36.z);
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                        str = str4;
                        drsVar.a = typedArrayObtainStyledAttributes.getResourceId(index2, drsVar.a);
                        break;
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                        str = str4;
                        drt drtVar37 = drsVar.d;
                        drtVar37.W = typedArrayObtainStyledAttributes.getFloat(index2, drtVar37.W);
                        break;
                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                        str = str4;
                        drt drtVar38 = drsVar.d;
                        drtVar38.V = typedArrayObtainStyledAttributes.getFloat(index2, drtVar38.V);
                        break;
                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                        str = str4;
                        drt drtVar39 = drsVar.d;
                        drtVar39.X = typedArrayObtainStyledAttributes.getInt(index2, drtVar39.X);
                        break;
                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                        str = str4;
                        drt drtVar40 = drsVar.d;
                        drtVar40.Y = typedArrayObtainStyledAttributes.getInt(index2, drtVar40.Y);
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                        str = str4;
                        drv drvVar3 = drsVar.b;
                        drvVar3.d = typedArrayObtainStyledAttributes.getFloat(index2, drvVar3.d);
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                        str = str4;
                        drw drwVar2 = drsVar.e;
                        drwVar2.n = true;
                        drwVar2.o = typedArrayObtainStyledAttributes.getDimension(index2, drwVar2.o);
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                        str = str4;
                        drw drwVar3 = drsVar.e;
                        drwVar3.d = typedArrayObtainStyledAttributes.getFloat(index2, drwVar3.d);
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                        str = str4;
                        drw drwVar4 = drsVar.e;
                        drwVar4.e = typedArrayObtainStyledAttributes.getFloat(index2, drwVar4.e);
                        break;
                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                        str = str4;
                        drw drwVar5 = drsVar.e;
                        drwVar5.f = typedArrayObtainStyledAttributes.getFloat(index2, drwVar5.f);
                        break;
                    case 48:
                        str = str4;
                        drw drwVar6 = drsVar.e;
                        drwVar6.g = typedArrayObtainStyledAttributes.getFloat(index2, drwVar6.g);
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                        str = str4;
                        drw drwVar7 = drsVar.e;
                        drwVar7.h = typedArrayObtainStyledAttributes.getDimension(index2, drwVar7.h);
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        str = str4;
                        drw drwVar8 = drsVar.e;
                        drwVar8.i = typedArrayObtainStyledAttributes.getDimension(index2, drwVar8.i);
                        break;
                    case 51:
                        str = str4;
                        drw drwVar9 = drsVar.e;
                        drwVar9.k = typedArrayObtainStyledAttributes.getDimension(index2, drwVar9.k);
                        break;
                    case 52:
                        str = str4;
                        drw drwVar10 = drsVar.e;
                        drwVar10.l = typedArrayObtainStyledAttributes.getDimension(index2, drwVar10.l);
                        break;
                    case 53:
                        str = str4;
                        drw drwVar11 = drsVar.e;
                        drwVar11.m = typedArrayObtainStyledAttributes.getDimension(index2, drwVar11.m);
                        break;
                    case 54:
                        str = str4;
                        drt drtVar41 = drsVar.d;
                        drtVar41.Z = typedArrayObtainStyledAttributes.getInt(index2, drtVar41.Z);
                        break;
                    case 55:
                        str = str4;
                        drt drtVar42 = drsVar.d;
                        drtVar42.aa = typedArrayObtainStyledAttributes.getInt(index2, drtVar42.aa);
                        break;
                    case 56:
                        str = str4;
                        drt drtVar43 = drsVar.d;
                        drtVar43.ab = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, drtVar43.ab);
                        break;
                    case 57:
                        str = str4;
                        drt drtVar44 = drsVar.d;
                        drtVar44.ac = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, drtVar44.ac);
                        break;
                    case 58:
                        str = str4;
                        drt drtVar45 = drsVar.d;
                        drtVar45.ad = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, drtVar45.ad);
                        break;
                    case 59:
                        str = str4;
                        drt drtVar46 = drsVar.d;
                        drtVar46.ae = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, drtVar46.ae);
                        break;
                    case 60:
                        str = str4;
                        drw drwVar12 = drsVar.e;
                        drwVar12.c = typedArrayObtainStyledAttributes.getFloat(index2, drwVar12.c);
                        break;
                    case 61:
                        str = str4;
                        drt drtVar47 = drsVar.d;
                        drtVar47.B = a(typedArrayObtainStyledAttributes, index2, drtVar47.B);
                        break;
                    case 62:
                        str = str4;
                        drt drtVar48 = drsVar.d;
                        drtVar48.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, drtVar48.C);
                        break;
                    case 63:
                        str = str4;
                        drt drtVar49 = drsVar.d;
                        drtVar49.D = typedArrayObtainStyledAttributes.getFloat(index2, drtVar49.D);
                        break;
                    case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                        str = str4;
                        dru druVar2 = drsVar.c;
                        druVar2.c = a(typedArrayObtainStyledAttributes, index2, druVar2.c);
                        break;
                    case 65:
                        str = str4;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type != 3) {
                            drsVar.c.e = dpd.a[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            break;
                        } else {
                            drsVar.c.e = typedArrayObtainStyledAttributes.getString(index2);
                            break;
                        }
                    case 66:
                        str = str4;
                        drsVar.c.g = typedArrayObtainStyledAttributes.getInt(index2, 0);
                        break;
                    case 67:
                        str = str4;
                        dru druVar3 = drsVar.c;
                        druVar3.j = typedArrayObtainStyledAttributes.getFloat(index2, druVar3.j);
                        break;
                    case 68:
                        str = str4;
                        drv drvVar4 = drsVar.b;
                        drvVar4.e = typedArrayObtainStyledAttributes.getFloat(index2, drvVar4.e);
                        break;
                    case 69:
                        str = str4;
                        drsVar.d.af = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        str = str4;
                        drsVar.d.ag = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        str = str4;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        str = str4;
                        drt drtVar50 = drsVar.d;
                        drtVar50.ah = typedArrayObtainStyledAttributes.getInt(index2, drtVar50.ah);
                        break;
                    case 73:
                        str = str4;
                        drt drtVar51 = drsVar.d;
                        drtVar51.ai = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, drtVar51.ai);
                        break;
                    case 74:
                        str = str4;
                        drsVar.d.al = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        str = str4;
                        drt drtVar52 = drsVar.d;
                        drtVar52.ap = typedArrayObtainStyledAttributes.getBoolean(index2, drtVar52.ap);
                        break;
                    case 76:
                        str = str4;
                        dru druVar4 = drsVar.c;
                        druVar4.f = typedArrayObtainStyledAttributes.getInt(index2, druVar4.f);
                        break;
                    case 77:
                        str = str4;
                        drsVar.d.am = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        str = str4;
                        drv drvVar5 = drsVar.b;
                        drvVar5.c = typedArrayObtainStyledAttributes.getInt(index2, drvVar5.c);
                        break;
                    case 79:
                        str = str4;
                        dru druVar5 = drsVar.c;
                        druVar5.h = typedArrayObtainStyledAttributes.getFloat(index2, druVar5.h);
                        break;
                    case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                        str = str4;
                        drt drtVar53 = drsVar.d;
                        drtVar53.an = typedArrayObtainStyledAttributes.getBoolean(index2, drtVar53.an);
                        break;
                    case 81:
                        str = str4;
                        drt drtVar54 = drsVar.d;
                        drtVar54.ao = typedArrayObtainStyledAttributes.getBoolean(index2, drtVar54.ao);
                        break;
                    case 82:
                        str = str4;
                        dru druVar6 = drsVar.c;
                        druVar6.d = typedArrayObtainStyledAttributes.getInteger(index2, druVar6.d);
                        break;
                    case 83:
                        str = str4;
                        drw drwVar13 = drsVar.e;
                        drwVar13.j = a(typedArrayObtainStyledAttributes, index2, drwVar13.j);
                        break;
                    case 84:
                        str = str4;
                        dru druVar7 = drsVar.c;
                        druVar7.l = typedArrayObtainStyledAttributes.getInteger(index2, druVar7.l);
                        break;
                    case 85:
                        str = str4;
                        dru druVar8 = drsVar.c;
                        druVar8.k = typedArrayObtainStyledAttributes.getFloat(index2, druVar8.k);
                        break;
                    case 86:
                        str = str4;
                        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(index2);
                        if (typedValuePeekValue2.type == 1) {
                            drsVar.c.n = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (typedValuePeekValue2.type == 3) {
                            dru druVar9 = drsVar.c;
                            druVar9.m = typedArrayObtainStyledAttributes.getString(index2);
                            if (druVar9.m.indexOf("/") > 0) {
                                druVar9.n = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, drsVar.c.n);
                        }
                        break;
                    case 87:
                        str = str4;
                        Log.w("ConstraintSet", str + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str = str4;
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 91:
                        drt drtVar55 = drsVar.d;
                        drtVar55.s = a(typedArrayObtainStyledAttributes, index2, drtVar55.s);
                        str = str4;
                        break;
                    case 92:
                        drt drtVar56 = drsVar.d;
                        drtVar56.t = a(typedArrayObtainStyledAttributes, index2, drtVar56.t);
                        str = str4;
                        break;
                    case 93:
                        drt drtVar57 = drsVar.d;
                        drtVar57.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, drtVar57.N);
                        str = str4;
                        break;
                    case 94:
                        drt drtVar58 = drsVar.d;
                        drtVar58.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, drtVar58.U);
                        str = str4;
                        break;
                    case 95:
                        l(drsVar.d, typedArrayObtainStyledAttributes, index2, 0);
                        str = str4;
                        break;
                    case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                        l(drsVar.d, typedArrayObtainStyledAttributes, index2, 1);
                        str = str4;
                        break;
                    case 97:
                        drt drtVar59 = drsVar.d;
                        drtVar59.aq = typedArrayObtainStyledAttributes.getInt(index2, drtVar59.aq);
                        str = str4;
                        break;
                }
                i4++;
                str4 = str;
            }
            drt drtVar60 = drsVar.d;
            if (drtVar60.al != null) {
                drtVar60.ak = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return drsVar;
    }

    private static final String t(int i) {
        return i != 1 ? i != 2 ? "top" : "right" : "left";
    }

    public final drs b(int i) {
        HashMap map = this.e;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new drs());
        }
        return (drs) map.get(numValueOf);
    }

    public final void c(ConstraintLayout constraintLayout) {
        p(constraintLayout);
        constraintLayout.f = null;
        constraintLayout.requestLayout();
    }

    public final void d(int i, int i2) {
        drs drsVar;
        HashMap map = this.e;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf) || (drsVar = (drs) map.get(numValueOf)) == null) {
            return;
        }
        if (i2 == 1) {
            drt drtVar = drsVar.d;
            drtVar.k = -1;
            drtVar.j = -1;
            drtVar.H = -1;
            drtVar.O = Integer.MIN_VALUE;
            return;
        }
        if (i2 == 2) {
            drt drtVar2 = drsVar.d;
            drtVar2.m = -1;
            drtVar2.l = -1;
            drtVar2.I = -1;
            drtVar2.Q = Integer.MIN_VALUE;
            return;
        }
        drt drtVar3 = drsVar.d;
        if (i2 != 3) {
            drtVar3.p = -1;
            drtVar3.q = -1;
            drtVar3.K = 0;
            drtVar3.R = Integer.MIN_VALUE;
            return;
        }
        drtVar3.o = -1;
        drtVar3.n = -1;
        drtVar3.J = 0;
        drtVar3.P = Integer.MIN_VALUE;
    }

    public final void e(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        HashMap map2;
        drx drxVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = drxVar.e;
        map3.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            drn drnVar = (drn) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            Integer numValueOf = Integer.valueOf(id);
            if (!map3.containsKey(numValueOf)) {
                map3.put(numValueOf, new drs());
            }
            drs drsVar = (drs) map3.get(numValueOf);
            if (drsVar == null) {
                i = childCount;
                map = map3;
            } else {
                HashMap map4 = drxVar.d;
                HashMap map5 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map4.keySet()) {
                    drk drkVar = (drk) map4.get(str);
                    int i3 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map5.put(str, new drk(drkVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e) {
                                e = e;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                                childCount = i3;
                                map3 = map2;
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                childCount = i3;
                                map3 = map2;
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                                childCount = i3;
                                map3 = map2;
                            }
                        } else {
                            map2 = map3;
                            map5.put(str, new drk(drkVar, cls.getMethod(a.bz(str, "getMap"), null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e4) {
                        e = e4;
                        map2 = map3;
                    } catch (NoSuchMethodException e5) {
                        e = e5;
                        map2 = map3;
                    } catch (InvocationTargetException e6) {
                        e = e6;
                        map2 = map3;
                    }
                    childCount = i3;
                    map3 = map2;
                }
                i = childCount;
                map = map3;
                drsVar.f = map5;
                drsVar.a = id;
                int i4 = drnVar.e;
                drt drtVar = drsVar.d;
                drtVar.j = i4;
                drtVar.k = drnVar.f;
                drtVar.l = drnVar.g;
                drtVar.m = drnVar.h;
                drtVar.n = drnVar.i;
                drtVar.o = drnVar.j;
                drtVar.p = drnVar.k;
                drtVar.q = drnVar.l;
                drtVar.r = drnVar.m;
                drtVar.s = drnVar.n;
                drtVar.t = drnVar.o;
                drtVar.u = drnVar.s;
                drtVar.v = drnVar.t;
                drtVar.w = drnVar.u;
                drtVar.x = drnVar.v;
                drtVar.y = drnVar.G;
                drtVar.z = drnVar.H;
                drtVar.A = drnVar.I;
                drtVar.B = drnVar.p;
                drtVar.C = drnVar.q;
                drtVar.D = drnVar.r;
                drtVar.E = drnVar.X;
                drtVar.F = drnVar.Y;
                drtVar.G = drnVar.Z;
                drtVar.h = drnVar.c;
                drtVar.f = drnVar.a;
                drtVar.g = drnVar.b;
                drtVar.d = drnVar.width;
                drtVar.e = drnVar.height;
                drtVar.H = drnVar.leftMargin;
                drtVar.I = drnVar.rightMargin;
                drtVar.J = drnVar.topMargin;
                drtVar.K = drnVar.bottomMargin;
                drtVar.N = drnVar.D;
                drtVar.V = drnVar.M;
                drtVar.W = drnVar.L;
                drtVar.Y = drnVar.O;
                drtVar.X = drnVar.N;
                drtVar.an = drnVar.aa;
                drtVar.ao = drnVar.ab;
                drtVar.Z = drnVar.P;
                drtVar.aa = drnVar.Q;
                drtVar.ab = drnVar.T;
                drtVar.ac = drnVar.U;
                drtVar.ad = drnVar.R;
                drtVar.ae = drnVar.S;
                drtVar.af = drnVar.V;
                drtVar.ag = drnVar.W;
                drtVar.am = drnVar.ac;
                drtVar.P = drnVar.x;
                drtVar.R = drnVar.z;
                drtVar.O = drnVar.w;
                drtVar.Q = drnVar.y;
                drtVar.T = drnVar.A;
                drtVar.S = drnVar.B;
                drtVar.U = drnVar.C;
                drtVar.aq = drnVar.ad;
                drtVar.L = drnVar.getMarginEnd();
                drtVar.M = drnVar.getMarginStart();
                drv drvVar = drsVar.b;
                drvVar.b = childAt.getVisibility();
                drvVar.d = childAt.getAlpha();
                drw drwVar = drsVar.e;
                drwVar.c = childAt.getRotation();
                drwVar.d = childAt.getRotationX();
                drwVar.e = childAt.getRotationY();
                drwVar.f = childAt.getScaleX();
                drwVar.g = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    drwVar.h = pivotX;
                    drwVar.i = pivotY;
                }
                drwVar.k = childAt.getTranslationX();
                drwVar.l = childAt.getTranslationY();
                drwVar.m = childAt.getTranslationZ();
                if (drwVar.n) {
                    drwVar.o = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    drtVar.ap = barrier.b.b;
                    drtVar.ak = Arrays.copyOf(barrier.c, barrier.d);
                    drtVar.ah = barrier.a;
                    drtVar.ai = barrier.b.c;
                }
            }
            i2++;
            drxVar = this;
            childCount = i;
            map3 = map;
        }
    }

    public final void f(Context context, int i) {
        e((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public final void g(int i, int i2, int i3, int i4) {
        HashMap map = this.e;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new drs());
        }
        drs drsVar = (drs) map.get(numValueOf);
        if (drsVar == null) {
            return;
        }
        if (i2 == 1) {
            if (i4 == 1) {
                drt drtVar = drsVar.d;
                drtVar.j = i3;
                drtVar.k = -1;
                return;
            } else if (i4 == 2) {
                drt drtVar2 = drsVar.d;
                drtVar2.k = i3;
                drtVar2.j = -1;
                return;
            } else {
                throw new IllegalArgumentException("left to " + t(3) + " undefined");
            }
        }
        if (i2 == 2) {
            if (i4 == 1) {
                drt drtVar3 = drsVar.d;
                drtVar3.l = i3;
                drtVar3.m = -1;
                return;
            } else if (i4 == 2) {
                drt drtVar4 = drsVar.d;
                drtVar4.m = i3;
                drtVar4.l = -1;
                return;
            } else {
                throw new IllegalArgumentException("right to " + t(3) + " undefined");
            }
        }
        if (i2 != 3) {
            if (i4 != 3) {
                throw new IllegalArgumentException("right to " + t(i4) + " undefined");
            }
            drt drtVar5 = drsVar.d;
            drtVar5.p = i3;
            drtVar5.q = -1;
            drtVar5.r = -1;
            drtVar5.s = -1;
            drtVar5.t = -1;
            return;
        }
        if (i4 != 3) {
            throw new IllegalArgumentException("right to " + t(i4) + " undefined");
        }
        drt drtVar6 = drsVar.d;
        drtVar6.n = i3;
        drtVar6.o = -1;
        drtVar6.r = -1;
        drtVar6.s = -1;
        drtVar6.t = -1;
    }

    public final void h(int i, int i2) {
        b(i).d.d = i2;
    }

    public final void i(int i, int i2) {
        drt drtVar = b(i).d;
        drtVar.b = true;
        drtVar.G = i2;
    }

    public final void j(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    drs drsVarS = s(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        drsVarS.d.b = true;
                    }
                    this.e.put(Integer.valueOf(drsVarS.a), drsVarS);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", a.bp(i, "Error parsing resource: "), e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", a.bp(i, "Error parsing resource: "), e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(android.content.Context r21, org.xmlpull.v1.XmlPullParser r22) {
        /*
            Method dump skipped, instructions count: 2122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drx.k(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public final void n(int i, int i2) {
        b(i).d.f = i2;
        b(i).d.g = -1;
        b(i).d.h = -1.0f;
    }

    public final void o(int i, int i2) {
        b(i).d.g = i2;
        b(i).d.f = -1;
        b(i).d.h = -1.0f;
    }

    public final void p(ConstraintLayout constraintLayout) {
        String resourceEntryName;
        HashSet hashSet;
        HashMap map;
        int i;
        HashMap map2;
        String strConcat;
        int i2;
        int i3;
        int i4;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = this.e;
        HashSet hashSet2 = new HashSet(map3.keySet());
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout.getChildAt(i5);
            int id = childAt.getId();
            Integer numValueOf = Integer.valueOf(id);
            if (!map3.containsKey(numValueOf)) {
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                Log.w("ConstraintSet", "id unknown ".concat(String.valueOf(resourceEntryName)));
            } else {
                if (id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    HashMap map4 = this.e;
                    if (map4.containsKey(numValueOf)) {
                        hashSet2.remove(numValueOf);
                        drs drsVar = (drs) map4.get(numValueOf);
                        if (drsVar != null) {
                            if (childAt instanceof Barrier) {
                                drt drtVar = drsVar.d;
                                drtVar.aj = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.a = drtVar.ah;
                                barrier.b(drtVar.ai);
                                barrier.b.b = drtVar.ap;
                                int[] iArr = drtVar.ak;
                                if (iArr != null) {
                                    barrier.j(iArr);
                                } else {
                                    String str = drtVar.al;
                                    if (str != null) {
                                        drtVar.ak = r(barrier, str);
                                        barrier.j(drtVar.ak);
                                    }
                                }
                            }
                            drn drnVar = (drn) childAt.getLayoutParams();
                            drnVar.a();
                            drsVar.a(drnVar);
                            HashMap map5 = drsVar.f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map5.keySet()) {
                                drk drkVar = (drk) map5.get(str2);
                                HashSet hashSet3 = hashSet2;
                                if (drkVar.a) {
                                    map2 = map3;
                                    strConcat = str2;
                                } else {
                                    map2 = map3;
                                    strConcat = "set".concat(String.valueOf(str2));
                                }
                                try {
                                    i3 = drkVar.h;
                                    i4 = i3 - 1;
                                } catch (IllegalAccessException e) {
                                    e = e;
                                    i2 = i5;
                                } catch (NoSuchMethodException e2) {
                                    e = e2;
                                    i2 = i5;
                                } catch (InvocationTargetException e3) {
                                    e = e3;
                                    i2 = i5;
                                }
                                if (i3 == 0) {
                                    i2 = i5;
                                    throw null;
                                }
                                switch (i4) {
                                    case 0:
                                        i2 = i5;
                                        cls.getMethod(strConcat, Integer.TYPE).invoke(childAt, Integer.valueOf(drkVar.c));
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                        break;
                                    case 1:
                                        i2 = i5;
                                        cls.getMethod(strConcat, Float.TYPE).invoke(childAt, Float.valueOf(drkVar.d));
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                        break;
                                    case 2:
                                        i2 = i5;
                                        cls.getMethod(strConcat, Integer.TYPE).invoke(childAt, Integer.valueOf(drkVar.g));
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                        break;
                                    case 3:
                                        i2 = i5;
                                        Method method = cls.getMethod(strConcat, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(drkVar.g);
                                        method.invoke(childAt, colorDrawable);
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                        break;
                                    case 4:
                                        i2 = i5;
                                        cls.getMethod(strConcat, CharSequence.class).invoke(childAt, drkVar.e);
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                        break;
                                    case 5:
                                        i2 = i5;
                                        cls.getMethod(strConcat, Boolean.TYPE).invoke(childAt, Boolean.valueOf(drkVar.f));
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                        break;
                                    case 6:
                                        i2 = i5;
                                        cls.getMethod(strConcat, Float.TYPE).invoke(childAt, Float.valueOf(drkVar.d));
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                        break;
                                    case 7:
                                        i2 = i5;
                                        try {
                                            cls.getMethod(strConcat, Integer.TYPE).invoke(childAt, Integer.valueOf(drkVar.c));
                                        } catch (IllegalAccessException e4) {
                                            e = e4;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e);
                                            hashSet2 = hashSet3;
                                            map3 = map2;
                                            i5 = i2;
                                        } catch (NoSuchMethodException e5) {
                                            e = e5;
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + strConcat, e);
                                            hashSet2 = hashSet3;
                                            map3 = map2;
                                            i5 = i2;
                                        } catch (InvocationTargetException e6) {
                                            e = e6;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e);
                                            hashSet2 = hashSet3;
                                            map3 = map2;
                                            i5 = i2;
                                        }
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                    default:
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        break;
                                }
                            }
                            hashSet = hashSet2;
                            map = map3;
                            i = i5;
                            childAt.setLayoutParams(drnVar);
                            drv drvVar = drsVar.b;
                            if (drvVar.c == 0) {
                                childAt.setVisibility(drvVar.b);
                            }
                            childAt.setAlpha(drvVar.d);
                            drw drwVar = drsVar.e;
                            childAt.setRotation(drwVar.c);
                            childAt.setRotationX(drwVar.d);
                            childAt.setRotationY(drwVar.e);
                            childAt.setScaleX(drwVar.f);
                            childAt.setScaleY(drwVar.g);
                            if (drwVar.j != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(drwVar.j);
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
                                if (!Float.isNaN(drwVar.h)) {
                                    childAt.setPivotX(drwVar.h);
                                }
                                if (!Float.isNaN(drwVar.i)) {
                                    childAt.setPivotY(drwVar.i);
                                }
                            }
                            childAt.setTranslationX(drwVar.k);
                            childAt.setTranslationY(drwVar.l);
                            childAt.setTranslationZ(drwVar.m);
                            if (drwVar.n) {
                                childAt.setElevation(drwVar.o);
                            }
                        } else {
                            hashSet = hashSet2;
                            map = map3;
                            i = i5;
                        }
                    } else {
                        hashSet = hashSet2;
                        map = map3;
                        i = i5;
                        Log.v("ConstraintSet", a.bp(id, "WARNING NO CONSTRAINTS for view "));
                    }
                }
                i5 = i + 1;
                hashSet2 = hashSet;
                map3 = map;
            }
            hashSet = hashSet2;
            map = map3;
            i = i5;
            i5 = i + 1;
            hashSet2 = hashSet;
            map3 = map;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            drs drsVar2 = (drs) this.e.get(num);
            if (drsVar2 != null) {
                drt drtVar2 = drsVar2.d;
                if (drtVar2.aj == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = drtVar2.ak;
                    if (iArr2 != null) {
                        barrier2.j(iArr2);
                    } else {
                        String str3 = drtVar2.al;
                        if (str3 != null) {
                            drtVar2.ak = r(barrier2, str3);
                            barrier2.j(drtVar2.ak);
                        }
                    }
                    barrier2.a = drtVar2.ah;
                    barrier2.b(drtVar2.ai);
                    drn drnVar2 = new drn();
                    barrier2.k();
                    drsVar2.a(drnVar2);
                    constraintLayout.addView(barrier2, drnVar2);
                }
                if (drtVar2.b) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    drn drnVar3 = new drn();
                    drsVar2.a(drnVar3);
                    constraintLayout.addView(guideline, drnVar3);
                }
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = constraintLayout.getChildAt(i6);
            if (childAt2 instanceof drl) {
                ((drl) childAt2).g(constraintLayout);
            }
        }
    }

    public final void q(int i, int i2, int i3, int i4) {
        HashMap map = this.e;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new drs());
        }
        drs drsVar = (drs) map.get(numValueOf);
        if (drsVar == null) {
            return;
        }
        if (i2 != 2) {
            if (i3 != 3) {
                throw new IllegalArgumentException("right to " + t(i3) + " undefined");
            }
            drt drtVar = drsVar.d;
            drtVar.n = 0;
            drtVar.o = -1;
            drtVar.r = -1;
            drtVar.s = -1;
            drtVar.t = -1;
            drtVar.J = i4;
            return;
        }
        if (i3 == 1) {
            drt drtVar2 = drsVar.d;
            drtVar2.l = 0;
            drtVar2.m = -1;
        } else {
            if (i3 != 2) {
                throw new IllegalArgumentException("right to " + t(3) + " undefined");
            }
            drt drtVar3 = drsVar.d;
            drtVar3.m = 0;
            drtVar3.l = -1;
        }
        drsVar.d.I = i4;
    }
}
