package T0;

import A.AbstractC0213f;
import R8.v;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f11337d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f11338e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f11339f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11340a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11341b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f11342c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11338e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f11339f = sparseIntArray2;
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
        sparseIntArray.append(101, 6);
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
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(Barrier barrier, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        HashMap map;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i5 = 0;
        int i10 = 0;
        while (i5 < strArrSplit.length) {
            String strTrim = strArrSplit[i5].trim();
            Object obj = null;
            try {
                iIntValue = p.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((strTrim instanceof String) && (map = constraintLayout.f18033m) != null && map.containsKey(strTrim)) {
                    obj = constraintLayout.f18033m.get(strTrim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i10] = iIntValue;
            i5++;
            i10++;
        }
        return i10 != strArrSplit.length ? Arrays.copyOf(iArr, i10) : iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:126:0x05fc. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0088. Please report as an issue. */
    public static h d(Context context, AttributeSet attributeSet, boolean z2) {
        int i5;
        String str;
        String str2;
        int i10;
        int i11;
        h hVar = new h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? q.f11346c : q.f11344a);
        int[] iArr = f11337d;
        String[] strArr = P0.a.f8984a;
        SparseIntArray sparseIntArray = f11338e;
        k kVar = hVar.f11239b;
        l lVar = hVar.f11242e;
        j jVar = hVar.f11240c;
        i iVar = hVar.f11241d;
        String str3 = "ConstraintSet";
        if (z2) {
            g gVar = new g();
            gVar.f11227a = new int[10];
            gVar.f11228b = new int[10];
            gVar.f11229c = 0;
            gVar.f11230d = new int[10];
            gVar.f11231e = new float[10];
            gVar.f11232f = 0;
            gVar.f11233g = new int[5];
            gVar.f11234h = new String[5];
            gVar.f11235i = 0;
            gVar.f11236j = new int[4];
            gVar.k = new boolean[4];
            gVar.f11237l = 0;
            jVar.getClass();
            iVar.getClass();
            lVar.getClass();
            int i12 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i12 < indexCount; indexCount = i11) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                int i13 = i12;
                switch (f11339f.get(index)) {
                    case 2:
                        i11 = indexCount;
                        gVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f11253I));
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i11 = indexCount;
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 5:
                        i11 = indexCount;
                        gVar.c(5, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 6:
                        i11 = indexCount;
                        gVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, iVar.f11247C));
                        break;
                    case 7:
                        i11 = indexCount;
                        gVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, iVar.f11248D));
                        break;
                    case 8:
                        i11 = indexCount;
                        gVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f11254J));
                        break;
                    case 11:
                        i11 = indexCount;
                        gVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f11259P));
                        break;
                    case 12:
                        i11 = indexCount;
                        gVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f11260Q));
                        break;
                    case 13:
                        i11 = indexCount;
                        gVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f11256M));
                        break;
                    case 14:
                        i11 = indexCount;
                        gVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f11258O));
                        break;
                    case 15:
                        i11 = indexCount;
                        gVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f11261R));
                        break;
                    case 16:
                        i11 = indexCount;
                        gVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f11257N));
                        break;
                    case 17:
                        i11 = indexCount;
                        gVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, iVar.f11276d));
                        break;
                    case 18:
                        i11 = indexCount;
                        gVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, iVar.f11278e));
                        break;
                    case 19:
                        i11 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, iVar.f11280f), 19);
                        break;
                    case 20:
                        i11 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, iVar.f11306w), 20);
                        break;
                    case 21:
                        i11 = indexCount;
                        gVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, iVar.f11274c));
                        break;
                    case 22:
                        i11 = indexCount;
                        gVar.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, kVar.f11320a)]);
                        break;
                    case 23:
                        i11 = indexCount;
                        gVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, iVar.f11272b));
                        break;
                    case 24:
                        i11 = indexCount;
                        gVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f11250F));
                        break;
                    case 27:
                        i11 = indexCount;
                        gVar.b(27, typedArrayObtainStyledAttributes.getInt(index, iVar.f11249E));
                        break;
                    case 28:
                        i11 = indexCount;
                        gVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f11251G));
                        break;
                    case 31:
                        i11 = indexCount;
                        gVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f11255K));
                        break;
                    case 34:
                        i11 = indexCount;
                        gVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f11252H));
                        break;
                    case 37:
                        i11 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, iVar.f11307x), 37);
                        break;
                    case 38:
                        i11 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, hVar.f11238a);
                        hVar.f11238a = resourceId;
                        gVar.b(38, resourceId);
                        break;
                    case 39:
                        i11 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, iVar.f11264U), 39);
                        break;
                    case 40:
                        i11 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, iVar.f11263T), 40);
                        break;
                    case 41:
                        i11 = indexCount;
                        gVar.b(41, typedArrayObtainStyledAttributes.getInt(index, iVar.f11265V));
                        break;
                    case 42:
                        i11 = indexCount;
                        gVar.b(42, typedArrayObtainStyledAttributes.getInt(index, iVar.f11266W));
                        break;
                    case 43:
                        i11 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, kVar.f11322c), 43);
                        break;
                    case 44:
                        i11 = indexCount;
                        gVar.d(44, true);
                        gVar.a(typedArrayObtainStyledAttributes.getDimension(index, lVar.f11336m), 44);
                        break;
                    case 45:
                        i11 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, lVar.f11326b), 45);
                        break;
                    case 46:
                        i11 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, lVar.f11327c), 46);
                        break;
                    case 47:
                        i11 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, lVar.f11328d), 47);
                        break;
                    case 48:
                        i11 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, lVar.f11329e), 48);
                        break;
                    case 49:
                        i11 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getDimension(index, lVar.f11330f), 49);
                        break;
                    case 50:
                        i11 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getDimension(index, lVar.f11331g), 50);
                        break;
                    case 51:
                        i11 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getDimension(index, lVar.f11333i), 51);
                        break;
                    case 52:
                        i11 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getDimension(index, lVar.f11334j), 52);
                        break;
                    case 53:
                        i11 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getDimension(index, lVar.k), 53);
                        break;
                    case 54:
                        i11 = indexCount;
                        gVar.b(54, typedArrayObtainStyledAttributes.getInt(index, iVar.f11267X));
                        break;
                    case 55:
                        i11 = indexCount;
                        gVar.b(55, typedArrayObtainStyledAttributes.getInt(index, iVar.f11268Y));
                        break;
                    case 56:
                        i11 = indexCount;
                        gVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f11269Z));
                        break;
                    case 57:
                        i11 = indexCount;
                        gVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f11271a0));
                        break;
                    case 58:
                        i11 = indexCount;
                        gVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f11273b0));
                        break;
                    case 59:
                        i11 = indexCount;
                        gVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f11275c0));
                        break;
                    case 60:
                        i11 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, lVar.f11325a), 60);
                        break;
                    case 62:
                        i11 = indexCount;
                        gVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f11245A));
                        break;
                    case 63:
                        i11 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, iVar.f11246B), 63);
                        break;
                    case 64:
                        i11 = indexCount;
                        gVar.b(64, f(typedArrayObtainStyledAttributes, index, jVar.f11311a));
                        break;
                    case 65:
                        i11 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            gVar.c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            gVar.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        i11 = indexCount;
                        gVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i11 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, jVar.f11315e), 67);
                        break;
                    case 68:
                        i11 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, kVar.f11323d), 68);
                        break;
                    case 69:
                        i11 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 69);
                        break;
                    case 70:
                        i11 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 70);
                        break;
                    case 71:
                        i11 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i11 = indexCount;
                        gVar.b(72, typedArrayObtainStyledAttributes.getInt(index, iVar.f11281f0));
                        break;
                    case 73:
                        i11 = indexCount;
                        gVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f11283g0));
                        break;
                    case 74:
                        i11 = indexCount;
                        gVar.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i11 = indexCount;
                        gVar.d(75, typedArrayObtainStyledAttributes.getBoolean(index, iVar.f11296n0));
                        break;
                    case 76:
                        i11 = indexCount;
                        gVar.b(76, typedArrayObtainStyledAttributes.getInt(index, jVar.f11313c));
                        break;
                    case 77:
                        i11 = indexCount;
                        gVar.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i11 = indexCount;
                        gVar.b(78, typedArrayObtainStyledAttributes.getInt(index, kVar.f11321b));
                        break;
                    case 79:
                        i11 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, jVar.f11314d), 79);
                        break;
                    case 80:
                        i11 = indexCount;
                        gVar.d(80, typedArrayObtainStyledAttributes.getBoolean(index, iVar.f11292l0));
                        break;
                    case 81:
                        i11 = indexCount;
                        gVar.d(81, typedArrayObtainStyledAttributes.getBoolean(index, iVar.f11294m0));
                        break;
                    case 82:
                        i11 = indexCount;
                        gVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, jVar.f11312b));
                        break;
                    case 83:
                        i11 = indexCount;
                        gVar.b(83, f(typedArrayObtainStyledAttributes, index, lVar.f11332h));
                        break;
                    case 84:
                        i11 = indexCount;
                        gVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, jVar.f11317g));
                        break;
                    case 85:
                        i11 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, jVar.f11316f), 85);
                        break;
                    case 86:
                        i11 = indexCount;
                        int i14 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i14 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            jVar.f11319i = resourceId2;
                            gVar.b(89, resourceId2);
                            if (jVar.f11319i != -1) {
                                gVar.b(88, -2);
                            }
                        } else if (i14 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            jVar.f11318h = string;
                            gVar.c(90, string);
                            if (jVar.f11318h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                jVar.f11319i = resourceId3;
                                gVar.b(89, resourceId3);
                                gVar.b(88, -2);
                            } else {
                                gVar.b(88, -1);
                            }
                        } else {
                            gVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, jVar.f11319i));
                        }
                        break;
                    case 87:
                        i11 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i11 = indexCount;
                        gVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.L));
                        break;
                    case 94:
                        i11 = indexCount;
                        gVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f11262S));
                        break;
                    case 95:
                        i11 = indexCount;
                        g(gVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i11 = indexCount;
                        g(gVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i11 = indexCount;
                        gVar.b(97, typedArrayObtainStyledAttributes.getInt(index, iVar.f11298o0));
                        break;
                    case 98:
                        i11 = indexCount;
                        int i15 = S0.a.f10834s;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            hVar.f11238a = typedArrayObtainStyledAttributes.getResourceId(index, hVar.f11238a);
                        }
                        break;
                    case 99:
                        i11 = indexCount;
                        gVar.d(99, typedArrayObtainStyledAttributes.getBoolean(index, iVar.f11282g));
                        break;
                }
                i12 = i13 + 1;
            }
        } else {
            String str4 = "CURRENTLY UNSUPPORTED";
            int i16 = 1;
            int i17 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i17 < indexCount2; indexCount2 = i5) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i17);
                if (index2 != i16 && 23 != index2) {
                    if (24 != index2) {
                        jVar.getClass();
                        iVar.getClass();
                        lVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11299p = f(typedArrayObtainStyledAttributes, index2, iVar.f11299p);
                        i10 = 1;
                        break;
                    case 2:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11253I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f11253I);
                        i10 = 1;
                        break;
                    case 3:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11297o = f(typedArrayObtainStyledAttributes, index2, iVar.f11297o);
                        i10 = 1;
                        break;
                    case 4:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11295n = f(typedArrayObtainStyledAttributes, index2, iVar.f11295n);
                        i10 = 1;
                        break;
                    case 5:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11308y = typedArrayObtainStyledAttributes.getString(index2);
                        i10 = 1;
                        break;
                    case 6:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11247C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, iVar.f11247C);
                        i10 = 1;
                        break;
                    case 7:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11248D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, iVar.f11248D);
                        i10 = 1;
                        break;
                    case 8:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11254J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f11254J);
                        i10 = 1;
                        break;
                    case 9:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11305v = f(typedArrayObtainStyledAttributes, index2, iVar.f11305v);
                        i10 = 1;
                        break;
                    case 10:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11304u = f(typedArrayObtainStyledAttributes, index2, iVar.f11304u);
                        i10 = 1;
                        break;
                    case 11:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11259P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f11259P);
                        i10 = 1;
                        break;
                    case 12:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11260Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f11260Q);
                        i10 = 1;
                        break;
                    case 13:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11256M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f11256M);
                        i10 = 1;
                        break;
                    case 14:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11258O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f11258O);
                        i10 = 1;
                        break;
                    case 15:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11261R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f11261R);
                        i10 = 1;
                        break;
                    case 16:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11257N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f11257N);
                        i10 = 1;
                        break;
                    case 17:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11276d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, iVar.f11276d);
                        i10 = 1;
                        break;
                    case 18:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11278e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, iVar.f11278e);
                        i10 = 1;
                        break;
                    case 19:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11280f = typedArrayObtainStyledAttributes.getFloat(index2, iVar.f11280f);
                        i10 = 1;
                        break;
                    case 20:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11306w = typedArrayObtainStyledAttributes.getFloat(index2, iVar.f11306w);
                        i10 = 1;
                        break;
                    case 21:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11274c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, iVar.f11274c);
                        i10 = 1;
                        break;
                    case 22:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        int i18 = typedArrayObtainStyledAttributes.getInt(index2, kVar.f11320a);
                        kVar.f11320a = i18;
                        kVar.f11320a = iArr[i18];
                        i10 = 1;
                        break;
                    case 23:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11272b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, iVar.f11272b);
                        i10 = 1;
                        break;
                    case 24:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11250F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f11250F);
                        i10 = 1;
                        break;
                    case 25:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11284h = f(typedArrayObtainStyledAttributes, index2, iVar.f11284h);
                        i10 = 1;
                        break;
                    case 26:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11286i = f(typedArrayObtainStyledAttributes, index2, iVar.f11286i);
                        i10 = 1;
                        break;
                    case 27:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11249E = typedArrayObtainStyledAttributes.getInt(index2, iVar.f11249E);
                        i10 = 1;
                        break;
                    case 28:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11251G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f11251G);
                        i10 = 1;
                        break;
                    case 29:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11288j = f(typedArrayObtainStyledAttributes, index2, iVar.f11288j);
                        i10 = 1;
                        break;
                    case 30:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.k = f(typedArrayObtainStyledAttributes, index2, iVar.k);
                        i10 = 1;
                        break;
                    case 31:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11255K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f11255K);
                        i10 = 1;
                        break;
                    case 32:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11302s = f(typedArrayObtainStyledAttributes, index2, iVar.f11302s);
                        i10 = 1;
                        break;
                    case 33:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11303t = f(typedArrayObtainStyledAttributes, index2, iVar.f11303t);
                        i10 = 1;
                        break;
                    case 34:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11252H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f11252H);
                        i10 = 1;
                        break;
                    case 35:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11293m = f(typedArrayObtainStyledAttributes, index2, iVar.f11293m);
                        i10 = 1;
                        break;
                    case 36:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11291l = f(typedArrayObtainStyledAttributes, index2, iVar.f11291l);
                        i10 = 1;
                        break;
                    case 37:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11307x = typedArrayObtainStyledAttributes.getFloat(index2, iVar.f11307x);
                        i10 = 1;
                        break;
                    case 38:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        hVar.f11238a = typedArrayObtainStyledAttributes.getResourceId(index2, hVar.f11238a);
                        i10 = 1;
                        break;
                    case 39:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11264U = typedArrayObtainStyledAttributes.getFloat(index2, iVar.f11264U);
                        i10 = 1;
                        break;
                    case 40:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11263T = typedArrayObtainStyledAttributes.getFloat(index2, iVar.f11263T);
                        i10 = 1;
                        break;
                    case 41:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11265V = typedArrayObtainStyledAttributes.getInt(index2, iVar.f11265V);
                        i10 = 1;
                        break;
                    case 42:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11266W = typedArrayObtainStyledAttributes.getInt(index2, iVar.f11266W);
                        i10 = 1;
                        break;
                    case 43:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        kVar.f11322c = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f11322c);
                        i10 = 1;
                        break;
                    case 44:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f11335l = true;
                        lVar.f11336m = typedArrayObtainStyledAttributes.getDimension(index2, lVar.f11336m);
                        i10 = 1;
                        break;
                    case 45:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f11326b = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f11326b);
                        i10 = 1;
                        break;
                    case 46:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f11327c = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f11327c);
                        i10 = 1;
                        break;
                    case 47:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f11328d = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f11328d);
                        i10 = 1;
                        break;
                    case 48:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f11329e = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f11329e);
                        i10 = 1;
                        break;
                    case 49:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f11330f = typedArrayObtainStyledAttributes.getDimension(index2, lVar.f11330f);
                        i10 = 1;
                        break;
                    case 50:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f11331g = typedArrayObtainStyledAttributes.getDimension(index2, lVar.f11331g);
                        i10 = 1;
                        break;
                    case 51:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f11333i = typedArrayObtainStyledAttributes.getDimension(index2, lVar.f11333i);
                        i10 = 1;
                        break;
                    case 52:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f11334j = typedArrayObtainStyledAttributes.getDimension(index2, lVar.f11334j);
                        i10 = 1;
                        break;
                    case 53:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.k = typedArrayObtainStyledAttributes.getDimension(index2, lVar.k);
                        i10 = 1;
                        break;
                    case 54:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11267X = typedArrayObtainStyledAttributes.getInt(index2, iVar.f11267X);
                        i10 = 1;
                        break;
                    case 55:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11268Y = typedArrayObtainStyledAttributes.getInt(index2, iVar.f11268Y);
                        i10 = 1;
                        break;
                    case 56:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11269Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f11269Z);
                        i10 = 1;
                        break;
                    case 57:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11271a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f11271a0);
                        i10 = 1;
                        break;
                    case 58:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11273b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f11273b0);
                        i10 = 1;
                        break;
                    case 59:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11275c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f11275c0);
                        i10 = 1;
                        break;
                    case 60:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f11325a = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f11325a);
                        i10 = 1;
                        break;
                    case 61:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11309z = f(typedArrayObtainStyledAttributes, index2, iVar.f11309z);
                        i10 = 1;
                        break;
                    case 62:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11245A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f11245A);
                        i10 = 1;
                        break;
                    case 63:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f11246B = typedArrayObtainStyledAttributes.getFloat(index2, iVar.f11246B);
                        i10 = 1;
                        break;
                    case 64:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f11311a = f(typedArrayObtainStyledAttributes, index2, jVar.f11311a);
                        i10 = 1;
                        break;
                    case 65:
                        i5 = indexCount2;
                        str = str4;
                        str2 = str3;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            jVar.getClass();
                            i10 = 1;
                            break;
                        } else {
                            String str5 = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            jVar.getClass();
                            i10 = 1;
                        }
                    case 66:
                        i5 = indexCount2;
                        str = str4;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        jVar.getClass();
                        str2 = str3;
                        i10 = 1;
                        break;
                    case 67:
                        i5 = indexCount2;
                        str = str4;
                        jVar.f11315e = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f11315e);
                        str2 = str3;
                        i10 = 1;
                        break;
                    case 68:
                        i5 = indexCount2;
                        str = str4;
                        kVar.f11323d = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f11323d);
                        str2 = str3;
                        i10 = 1;
                        break;
                    case 69:
                        i5 = indexCount2;
                        str = str4;
                        iVar.f11277d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        str2 = str3;
                        i10 = 1;
                        break;
                    case 70:
                        i5 = indexCount2;
                        str = str4;
                        iVar.f11279e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        str2 = str3;
                        i10 = 1;
                        break;
                    case 71:
                        i5 = indexCount2;
                        str = str4;
                        Log.e(str3, str);
                        str2 = str3;
                        i10 = 1;
                        break;
                    case 72:
                        i5 = indexCount2;
                        iVar.f11281f0 = typedArrayObtainStyledAttributes.getInt(index2, iVar.f11281f0);
                        str = str4;
                        i10 = 1;
                        str2 = str3;
                        break;
                    case 73:
                        i5 = indexCount2;
                        iVar.f11283g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f11283g0);
                        str = str4;
                        i10 = 1;
                        str2 = str3;
                        break;
                    case 74:
                        i5 = indexCount2;
                        iVar.f11289j0 = typedArrayObtainStyledAttributes.getString(index2);
                        str = str4;
                        i10 = 1;
                        str2 = str3;
                        break;
                    case 75:
                        i5 = indexCount2;
                        iVar.f11296n0 = typedArrayObtainStyledAttributes.getBoolean(index2, iVar.f11296n0);
                        str = str4;
                        i10 = 1;
                        str2 = str3;
                        break;
                    case 76:
                        i5 = indexCount2;
                        jVar.f11313c = typedArrayObtainStyledAttributes.getInt(index2, jVar.f11313c);
                        str = str4;
                        i10 = 1;
                        str2 = str3;
                        break;
                    case 77:
                        i5 = indexCount2;
                        iVar.f11290k0 = typedArrayObtainStyledAttributes.getString(index2);
                        str = str4;
                        i10 = 1;
                        str2 = str3;
                        break;
                    case 78:
                        i5 = indexCount2;
                        kVar.f11321b = typedArrayObtainStyledAttributes.getInt(index2, kVar.f11321b);
                        str = str4;
                        i10 = 1;
                        str2 = str3;
                        break;
                    case 79:
                        i5 = indexCount2;
                        jVar.f11314d = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f11314d);
                        str = str4;
                        i10 = 1;
                        str2 = str3;
                        break;
                    case 80:
                        i5 = indexCount2;
                        iVar.f11292l0 = typedArrayObtainStyledAttributes.getBoolean(index2, iVar.f11292l0);
                        str = str4;
                        i10 = 1;
                        str2 = str3;
                        break;
                    case 81:
                        i5 = indexCount2;
                        iVar.f11294m0 = typedArrayObtainStyledAttributes.getBoolean(index2, iVar.f11294m0);
                        str = str4;
                        i10 = 1;
                        str2 = str3;
                        break;
                    case 82:
                        i5 = indexCount2;
                        jVar.f11312b = typedArrayObtainStyledAttributes.getInteger(index2, jVar.f11312b);
                        str = str4;
                        i10 = 1;
                        str2 = str3;
                        break;
                    case 83:
                        i5 = indexCount2;
                        lVar.f11332h = f(typedArrayObtainStyledAttributes, index2, lVar.f11332h);
                        str = str4;
                        i10 = 1;
                        str2 = str3;
                        break;
                    case 84:
                        i5 = indexCount2;
                        jVar.f11317g = typedArrayObtainStyledAttributes.getInteger(index2, jVar.f11317g);
                        str = str4;
                        i10 = 1;
                        str2 = str3;
                        break;
                    case 85:
                        i5 = indexCount2;
                        jVar.f11316f = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f11316f);
                        str = str4;
                        i10 = 1;
                        str2 = str3;
                        break;
                    case 86:
                        i5 = indexCount2;
                        int i19 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i19 == 1) {
                            jVar.f11319i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i19 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            jVar.f11318h = string2;
                            if (string2.indexOf("/") > 0) {
                                jVar.f11319i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, jVar.f11319i);
                        }
                        str = str4;
                        i10 = 1;
                        str2 = str3;
                        break;
                    case 87:
                        i5 = indexCount2;
                        Log.w(str3, "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        str = str4;
                        i10 = 1;
                        str2 = str3;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb3 = new StringBuilder("Unknown attribute 0x");
                        i5 = indexCount2;
                        sb3.append(Integer.toHexString(index2));
                        sb3.append("   ");
                        sb3.append(sparseIntArray.get(index2));
                        Log.w(str3, sb3.toString());
                        str = str4;
                        i10 = 1;
                        str2 = str3;
                        break;
                    case 91:
                        i5 = indexCount2;
                        iVar.f11300q = f(typedArrayObtainStyledAttributes, index2, iVar.f11300q);
                        str = str4;
                        i10 = 1;
                        str2 = str3;
                        break;
                    case 92:
                        i5 = indexCount2;
                        iVar.f11301r = f(typedArrayObtainStyledAttributes, index2, iVar.f11301r);
                        str = str4;
                        i10 = 1;
                        str2 = str3;
                        break;
                    case 93:
                        i5 = indexCount2;
                        iVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.L);
                        str = str4;
                        i10 = 1;
                        str2 = str3;
                        break;
                    case 94:
                        i5 = indexCount2;
                        iVar.f11262S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f11262S);
                        str = str4;
                        i10 = 1;
                        str2 = str3;
                        break;
                    case 95:
                        i5 = indexCount2;
                        g(iVar, typedArrayObtainStyledAttributes, index2, 0);
                        str = str4;
                        i10 = 1;
                        str2 = str3;
                        break;
                    case 96:
                        i5 = indexCount2;
                        g(iVar, typedArrayObtainStyledAttributes, index2, 1);
                        i10 = 1;
                        str = str4;
                        str2 = str3;
                        break;
                    case 97:
                        i5 = indexCount2;
                        iVar.f11298o0 = typedArrayObtainStyledAttributes.getInt(index2, iVar.f11298o0);
                        str = str4;
                        i10 = 1;
                        str2 = str3;
                        break;
                }
                i17++;
                i16 = i10;
                str3 = str2;
                str4 = str;
            }
            if (iVar.f11289j0 != null) {
                iVar.f11287i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return hVar;
    }

    public static int f(TypedArray typedArray, int i5, int i10) {
        int resourceId = typedArray.getResourceId(i5, i10);
        return resourceId == -1 ? typedArray.getInt(i5, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.m.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(d dVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i5 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i5 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            if (i5 == 1) {
                                Math.abs(f11 / f10);
                            } else {
                                Math.abs(f10 / f11);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        dVar.f11154G = str;
    }

    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i5;
        int i10;
        String resourceEntryName;
        m mVar = this;
        int i11 = 1;
        int childCount = constraintLayout.getChildCount();
        HashMap map = mVar.f11342c;
        HashSet hashSet2 = new HashSet(map.keySet());
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = constraintLayout.getChildAt(i12);
            int id2 = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id2))) {
                StringBuilder sb2 = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb2.append(resourceEntryName);
                Log.w("ConstraintSet", sb2.toString());
            } else {
                if (mVar.f11341b && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (map.containsKey(Integer.valueOf(id2))) {
                        hashSet2.remove(Integer.valueOf(id2));
                        h hVar = (h) map.get(Integer.valueOf(id2));
                        if (hVar != null) {
                            if (childAt instanceof Barrier) {
                                i iVar = hVar.f11241d;
                                iVar.f11285h0 = i11;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(iVar.f11281f0);
                                barrier.setMargin(iVar.f11283g0);
                                barrier.setAllowsGoneWidget(iVar.f11296n0);
                                int[] iArr = iVar.f11287i0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = iVar.f11289j0;
                                    if (str != null) {
                                        int[] iArrC = c(barrier, str);
                                        iVar.f11287i0 = iArrC;
                                        barrier.setReferencedIds(iArrC);
                                    }
                                }
                            }
                            d dVar = (d) childAt.getLayoutParams();
                            dVar.a();
                            hVar.a(dVar);
                            HashMap map2 = hVar.f11243f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map2.keySet()) {
                                a aVar = (a) map2.get(str2);
                                String strF = !aVar.f11133a ? v.f("set", str2) : str2;
                                HashSet hashSet3 = hashSet2;
                                try {
                                    int iF = AbstractC0213f.f(aVar.f11134b);
                                    Class<?> cls2 = Float.TYPE;
                                    Class<?> cls3 = Integer.TYPE;
                                    switch (iF) {
                                        case 0:
                                            i10 = i12;
                                            cls.getMethod(strF, cls3).invoke(childAt, Integer.valueOf(aVar.f11135c));
                                            break;
                                        case 1:
                                            i10 = i12;
                                            cls.getMethod(strF, cls2).invoke(childAt, Float.valueOf(aVar.f11136d));
                                            break;
                                        case 2:
                                            i10 = i12;
                                            cls.getMethod(strF, cls3).invoke(childAt, Integer.valueOf(aVar.f11139g));
                                            break;
                                        case 3:
                                            i10 = i12;
                                            Method method = cls.getMethod(strF, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(aVar.f11139g);
                                            method.invoke(childAt, colorDrawable);
                                            break;
                                        case 4:
                                            i10 = i12;
                                            cls.getMethod(strF, CharSequence.class).invoke(childAt, aVar.f11137e);
                                            break;
                                        case 5:
                                            i10 = i12;
                                            cls.getMethod(strF, Boolean.TYPE).invoke(childAt, Boolean.valueOf(aVar.f11138f));
                                            break;
                                        case 6:
                                            i10 = i12;
                                            cls.getMethod(strF, cls2).invoke(childAt, Float.valueOf(aVar.f11136d));
                                            break;
                                        case 7:
                                            i10 = i12;
                                            try {
                                                cls.getMethod(strF, cls3).invoke(childAt, Integer.valueOf(aVar.f11135c));
                                            } catch (IllegalAccessException e7) {
                                                e = e7;
                                                StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w(" Custom Attribute \"", str2, "\" not found on ");
                                                sbW.append(cls.getName());
                                                Log.e("TransitionLayout", sbW.toString());
                                                e.printStackTrace();
                                                hashSet2 = hashSet3;
                                                i12 = i10;
                                            } catch (NoSuchMethodException e10) {
                                                e = e10;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strF);
                                                hashSet2 = hashSet3;
                                                i12 = i10;
                                            } catch (InvocationTargetException e11) {
                                                e = e11;
                                                StringBuilder sbW2 = com.google.android.gms.internal.consent_sdk.a.w(" Custom Attribute \"", str2, "\" not found on ");
                                                sbW2.append(cls.getName());
                                                Log.e("TransitionLayout", sbW2.toString());
                                                e.printStackTrace();
                                                hashSet2 = hashSet3;
                                                i12 = i10;
                                            }
                                        default:
                                            i10 = i12;
                                            break;
                                    }
                                } catch (IllegalAccessException e12) {
                                    e = e12;
                                    i10 = i12;
                                } catch (NoSuchMethodException e13) {
                                    e = e13;
                                    i10 = i12;
                                } catch (InvocationTargetException e14) {
                                    e = e14;
                                    i10 = i12;
                                }
                                hashSet2 = hashSet3;
                                i12 = i10;
                            }
                            hashSet = hashSet2;
                            i5 = i12;
                            childAt.setLayoutParams(dVar);
                            k kVar = hVar.f11239b;
                            if (kVar.f11321b == 0) {
                                childAt.setVisibility(kVar.f11320a);
                            }
                            childAt.setAlpha(kVar.f11322c);
                            l lVar = hVar.f11242e;
                            childAt.setRotation(lVar.f11325a);
                            childAt.setRotationX(lVar.f11326b);
                            childAt.setRotationY(lVar.f11327c);
                            childAt.setScaleX(lVar.f11328d);
                            childAt.setScaleY(lVar.f11329e);
                            if (lVar.f11332h != -1) {
                                if (((View) childAt.getParent()).findViewById(lVar.f11332h) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(lVar.f11330f)) {
                                    childAt.setPivotX(lVar.f11330f);
                                }
                                if (!Float.isNaN(lVar.f11331g)) {
                                    childAt.setPivotY(lVar.f11331g);
                                }
                            }
                            childAt.setTranslationX(lVar.f11333i);
                            childAt.setTranslationY(lVar.f11334j);
                            childAt.setTranslationZ(lVar.k);
                            if (lVar.f11335l) {
                                childAt.setElevation(lVar.f11336m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i5 = i12;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
                i12 = i5 + 1;
                mVar = this;
                hashSet2 = hashSet;
                i11 = 1;
            }
            hashSet = hashSet2;
            i5 = i12;
            i12 = i5 + 1;
            mVar = this;
            hashSet2 = hashSet;
            i11 = 1;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            h hVar2 = (h) map.get(num);
            if (hVar2 != null) {
                i iVar2 = hVar2.f11241d;
                if (iVar2.f11285h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = iVar2.f11287i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str3 = iVar2.f11289j0;
                        if (str3 != null) {
                            int[] iArrC2 = c(barrier2, str3);
                            iVar2.f11287i0 = iArrC2;
                            barrier2.setReferencedIds(iArrC2);
                        }
                    }
                    barrier2.setType(iVar2.f11281f0);
                    barrier2.setMargin(iVar2.f11283g0);
                    d dVarG = ConstraintLayout.g();
                    barrier2.i();
                    hVar2.a(dVarG);
                    constraintLayout.addView(barrier2, dVarG);
                }
                if (iVar2.f11270a) {
                    View oVar = new o(constraintLayout.getContext());
                    oVar.setId(num.intValue());
                    d dVarG2 = ConstraintLayout.g();
                    hVar2.a(dVarG2);
                    constraintLayout.addView(oVar, dVarG2);
                }
            }
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = constraintLayout.getChildAt(i13);
            if (childAt2 instanceof b) {
                ((b) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i5;
        int i10;
        m mVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = mVar.f11342c;
        map.clear();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = constraintLayout.getChildAt(i11);
            d dVar = (d) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (mVar.f11341b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id2))) {
                map.put(Integer.valueOf(id2), new h());
            }
            h hVar = (h) map.get(Integer.valueOf(id2));
            if (hVar == null) {
                i5 = childCount;
            } else {
                HashMap map2 = mVar.f11340a;
                HashMap map3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map2.keySet()) {
                    a aVar = (a) map2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            i10 = childCount;
                        } else {
                            i10 = childCount;
                            try {
                                map3.put(str, new a(aVar, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e7) {
                                e = e7;
                                e.printStackTrace();
                                childCount = i10;
                            } catch (NoSuchMethodException e10) {
                                e = e10;
                                e.printStackTrace();
                                childCount = i10;
                            } catch (InvocationTargetException e11) {
                                e = e11;
                                e.printStackTrace();
                                childCount = i10;
                            }
                        }
                    } catch (IllegalAccessException e12) {
                        e = e12;
                        i10 = childCount;
                    } catch (NoSuchMethodException e13) {
                        e = e13;
                        i10 = childCount;
                    } catch (InvocationTargetException e14) {
                        e = e14;
                        i10 = childCount;
                    }
                    childCount = i10;
                }
                i5 = childCount;
                hVar.f11243f = map3;
                hVar.f11238a = id2;
                int i12 = dVar.f11181e;
                i iVar = hVar.f11241d;
                iVar.f11284h = i12;
                iVar.f11286i = dVar.f11183f;
                iVar.f11288j = dVar.f11185g;
                iVar.k = dVar.f11187h;
                iVar.f11291l = dVar.f11189i;
                iVar.f11293m = dVar.f11191j;
                iVar.f11295n = dVar.k;
                iVar.f11297o = dVar.f11194l;
                iVar.f11299p = dVar.f11196m;
                iVar.f11300q = dVar.f11198n;
                iVar.f11301r = dVar.f11200o;
                iVar.f11302s = dVar.f11206s;
                iVar.f11303t = dVar.f11207t;
                iVar.f11304u = dVar.f11208u;
                iVar.f11305v = dVar.f11209v;
                iVar.f11306w = dVar.f11152E;
                iVar.f11307x = dVar.f11153F;
                iVar.f11308y = dVar.f11154G;
                iVar.f11309z = dVar.f11202p;
                iVar.f11245A = dVar.f11204q;
                iVar.f11246B = dVar.f11205r;
                iVar.f11247C = dVar.f11166T;
                iVar.f11248D = dVar.f11167U;
                iVar.f11249E = dVar.f11168V;
                iVar.f11280f = dVar.f11177c;
                iVar.f11276d = dVar.f11173a;
                iVar.f11278e = dVar.f11175b;
                iVar.f11272b = ((ViewGroup.MarginLayoutParams) dVar).width;
                iVar.f11274c = ((ViewGroup.MarginLayoutParams) dVar).height;
                iVar.f11250F = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                iVar.f11251G = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
                iVar.f11252H = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                iVar.f11253I = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
                iVar.L = dVar.f11151D;
                iVar.f11263T = dVar.f11156I;
                iVar.f11264U = dVar.f11155H;
                iVar.f11266W = dVar.f11158K;
                iVar.f11265V = dVar.f11157J;
                iVar.f11292l0 = dVar.f11169W;
                iVar.f11294m0 = dVar.f11170X;
                iVar.f11267X = dVar.L;
                iVar.f11268Y = dVar.f11159M;
                iVar.f11269Z = dVar.f11162P;
                iVar.f11271a0 = dVar.f11163Q;
                iVar.f11273b0 = dVar.f11160N;
                iVar.f11275c0 = dVar.f11161O;
                iVar.f11277d0 = dVar.f11164R;
                iVar.f11279e0 = dVar.f11165S;
                iVar.f11290k0 = dVar.f11171Y;
                iVar.f11257N = dVar.f11211x;
                iVar.f11259P = dVar.f11213z;
                iVar.f11256M = dVar.f11210w;
                iVar.f11258O = dVar.f11212y;
                iVar.f11261R = dVar.f11148A;
                iVar.f11260Q = dVar.f11149B;
                iVar.f11262S = dVar.f11150C;
                iVar.f11298o0 = dVar.f11172Z;
                iVar.f11254J = dVar.getMarginEnd();
                iVar.f11255K = dVar.getMarginStart();
                int visibility = childAt.getVisibility();
                k kVar = hVar.f11239b;
                kVar.f11320a = visibility;
                kVar.f11322c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                l lVar = hVar.f11242e;
                lVar.f11325a = rotation;
                lVar.f11326b = childAt.getRotationX();
                lVar.f11327c = childAt.getRotationY();
                lVar.f11328d = childAt.getScaleX();
                lVar.f11329e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    lVar.f11330f = pivotX;
                    lVar.f11331g = pivotY;
                }
                lVar.f11333i = childAt.getTranslationX();
                lVar.f11334j = childAt.getTranslationY();
                lVar.k = childAt.getTranslationZ();
                if (lVar.f11335l) {
                    lVar.f11336m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    iVar.f11296n0 = barrier.getAllowsGoneWidget();
                    iVar.f11287i0 = barrier.getReferencedIds();
                    iVar.f11281f0 = barrier.getType();
                    iVar.f11283g0 = barrier.getMargin();
                }
            }
            i11++;
            mVar = this;
            childCount = i5;
        }
    }

    public final void e(Context context, int i5) {
        XmlResourceParser xml = context.getResources().getXml(i5);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    h hVarD = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        hVarD.f11241d.f11270a = true;
                    }
                    this.f11342c.put(Integer.valueOf(hVarD.f11238a), hVarD);
                }
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
        }
    }
}
