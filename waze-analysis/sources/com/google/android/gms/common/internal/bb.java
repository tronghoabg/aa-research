package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.core.internal.view.SupportMenu;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bb {
    public static double A(Parcel parcel, int i2) {
        ad(parcel, i2, 8);
        return parcel.readDouble();
    }

    public static float B(Parcel parcel, int i2) {
        ad(parcel, i2, 4);
        return parcel.readFloat();
    }

    public static int C(int i2) {
        return (char) i2;
    }

    public static int D(Parcel parcel, int i2) {
        ad(parcel, i2, 4);
        return parcel.readInt();
    }

    public static int E(Parcel parcel, int i2) {
        int i3 = (i2 & SupportMenu.CATEGORY_MASK) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
        if (i3 >= 0 && parcel.dataPosition() + i3 <= parcel.dataSize()) {
            return i3;
        }
        throw new com.google.android.gms.common.internal.a.b("Invalid field size: " + i3, parcel);
    }

    public static int F(Parcel parcel) {
        int i2 = parcel.readInt();
        int iE = E(parcel, i2);
        int iC = C(i2);
        int iDataPosition = parcel.dataPosition();
        if (iC != 20293) {
            throw new com.google.android.gms.common.internal.a.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i2))), parcel);
        }
        int i3 = iE + iDataPosition;
        if (i3 >= iDataPosition && i3 <= parcel.dataSize()) {
            return i3;
        }
        throw new com.google.android.gms.common.internal.a.b("Size read is invalid start=" + iDataPosition + " end=" + i3, parcel);
    }

    public static long G(Parcel parcel, int i2) {
        ad(parcel, i2, 8);
        return parcel.readLong();
    }

    public static Bundle H(Parcel parcel, int i2) {
        int iE = E(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iE == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iE);
        return bundle;
    }

    public static IBinder I(Parcel parcel, int i2) {
        int iE = E(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iE == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iE);
        return strongBinder;
    }

    public static Parcelable J(Parcel parcel, int i2, Parcelable.Creator creator) {
        int iE = E(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iE == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iE);
        return parcelable;
    }

    public static Boolean K(Parcel parcel, int i2) {
        int iE = E(parcel, i2);
        if (iE == 0) {
            return null;
        }
        ae(parcel, iE, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Double L(Parcel parcel, int i2) {
        int iE = E(parcel, i2);
        if (iE == 0) {
            return null;
        }
        ae(parcel, iE, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static Integer M(Parcel parcel, int i2) {
        int iE = E(parcel, i2);
        if (iE == 0) {
            return null;
        }
        ae(parcel, iE, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static String N(Parcel parcel, int i2) {
        int iE = E(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iE == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iE);
        return string;
    }

    public static ArrayList O(Parcel parcel, int i2) {
        int iE = E(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iE == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iE);
        return arrayListCreateStringArrayList;
    }

    public static ArrayList P(Parcel parcel, int i2, Parcelable.Creator creator) {
        int iE = E(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iE == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iE);
        return arrayListCreateTypedArrayList;
    }

    public static short Q(Parcel parcel, int i2) {
        ad(parcel, i2, 4);
        return (short) parcel.readInt();
    }

    public static void R(Parcel parcel, int i2) {
        if (parcel.dataPosition() == i2) {
            return;
        }
        throw new com.google.android.gms.common.internal.a.b("Overread allowed size end=" + i2, parcel);
    }

    public static void S(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + E(parcel, i2));
    }

    public static boolean T(Parcel parcel, int i2) {
        ad(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static byte[] U(Parcel parcel, int i2) {
        int iE = E(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iE == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iE);
        return bArrCreateByteArray;
    }

    public static int[] V(Parcel parcel, int i2) {
        int iE = E(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iE == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iE);
        return iArrCreateIntArray;
    }

    public static Object[] W(Parcel parcel, int i2, Parcelable.Creator creator) {
        int iE = E(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iE == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iE);
        return objArrCreateTypedArray;
    }

    public static String[] X(Parcel parcel, int i2) {
        int iE = E(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iE == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iE);
        return strArrCreateStringArray;
    }

    public static byte[][] Y(Parcel parcel, int i2) {
        int iE = E(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iE == 0) {
            return null;
        }
        int i3 = parcel.readInt();
        byte[][] bArr = new byte[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i4] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iE);
        return bArr;
    }

    private static int Z(Parcel parcel, int i2) {
        parcel.writeInt(i2 | SupportMenu.CATEGORY_MASK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void a(com.google.android.gms.common.api.v vVar) {
        vVar.c(new ba(vVar, new com.google.android.gms.o.w()));
    }

    private static void aa(Parcel parcel, int i2) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(iDataPosition - i2);
        parcel.setDataPosition(iDataPosition);
    }

    private static void ab(Parcel parcel, int i2, int i3) {
        parcel.writeInt(i2 | (i3 << 16));
    }

    private static void ac(Parcel parcel, Parcelable parcelable, int i2) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i2);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    private static void ad(Parcel parcel, int i2, int i3) {
        int iE = E(parcel, i2);
        if (iE == i3) {
            return;
        }
        throw new com.google.android.gms.common.internal.a.b("Expected size " + i3 + " got " + iE + " (0x" + Integer.toHexString(iE) + ")", parcel);
    }

    private static void ae(Parcel parcel, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        throw new com.google.android.gms.common.internal.a.b("Expected size " + i3 + " got " + i2 + " (0x" + Integer.toHexString(i2) + ")", parcel);
    }

    public static final String b(List list, Object obj) {
        StringBuilder sb = new StringBuilder(100);
        sb.append(obj.getClass().getSimpleName());
        sb.append('{');
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append((String) list.get(i2));
            if (i2 < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static final void c(String str, Object obj, List list) {
        list.add(str + "=" + String.valueOf(obj));
    }

    public static int d(Parcel parcel) {
        return Z(parcel, 20293);
    }

    public static void e(Parcel parcel, int i2) {
        aa(parcel, i2);
    }

    public static void f(Parcel parcel, int i2, boolean z) {
        ab(parcel, i2, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void g(Parcel parcel, int i2, int i3) {
        ab(parcel, i2, 4);
        parcel.writeInt(i3);
    }

    public static void h(Parcel parcel, int i2, long j2) {
        ab(parcel, i2, 8);
        parcel.writeLong(j2);
    }

    public static void i(Parcel parcel, int i2, short s) {
        ab(parcel, i2, 4);
        parcel.writeInt(s);
    }

    public static void j(Parcel parcel, Boolean bool) {
        if (bool == null) {
            return;
        }
        ab(parcel, 3, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void k(Parcel parcel, int i2, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iZ = Z(parcel, i2);
        parcel.writeBundle(bundle);
        aa(parcel, iZ);
    }

    public static void l(Parcel parcel, int i2, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iZ = Z(parcel, i2);
        parcel.writeByteArray(bArr);
        aa(parcel, iZ);
    }

    public static void m(Parcel parcel, int i2, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int iZ = Z(parcel, i2);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        aa(parcel, iZ);
    }

    public static void n(Parcel parcel, double d2) {
        ab(parcel, 5, 8);
        parcel.writeDouble(d2);
    }

    public static void o(Parcel parcel, Double d2) {
        if (d2 == null) {
            return;
        }
        ab(parcel, 6, 8);
        parcel.writeDouble(d2.doubleValue());
    }

    public static void p(Parcel parcel, float f2) {
        ab(parcel, 7, 4);
        parcel.writeFloat(f2);
    }

    public static void q(Parcel parcel, int i2, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iZ = Z(parcel, i2);
        parcel.writeStrongBinder(iBinder);
        aa(parcel, iZ);
    }

    public static void r(Parcel parcel, int i2, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iZ = Z(parcel, i2);
        parcel.writeIntArray(iArr);
        aa(parcel, iZ);
    }

    public static void s(Parcel parcel, int i2, Integer num) {
        if (num == null) {
            return;
        }
        ab(parcel, i2, 4);
        parcel.writeInt(num.intValue());
    }

    public static void t(Parcel parcel, int i2, Parcelable parcelable, int i3) {
        if (parcelable == null) {
            return;
        }
        int iZ = Z(parcel, i2);
        parcelable.writeToParcel(parcel, i3);
        aa(parcel, iZ);
    }

    public static void u(Parcel parcel, int i2, String str) {
        if (str == null) {
            return;
        }
        int iZ = Z(parcel, i2);
        parcel.writeString(str);
        aa(parcel, iZ);
    }

    public static void v(Parcel parcel, int i2, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iZ = Z(parcel, i2);
        parcel.writeStringArray(strArr);
        aa(parcel, iZ);
    }

    public static void w(Parcel parcel, int i2, List list) {
        if (list == null) {
            return;
        }
        int iZ = Z(parcel, i2);
        parcel.writeStringList(list);
        aa(parcel, iZ);
    }

    public static void x(Parcel parcel, int i2, Parcelable[] parcelableArr, int i3) {
        if (parcelableArr == null) {
            return;
        }
        int iZ = Z(parcel, i2);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                ac(parcel, parcelable, i3);
            }
        }
        aa(parcel, iZ);
    }

    public static void y(Parcel parcel, int i2, List list) {
        if (list == null) {
            return;
        }
        int iZ = Z(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            Parcelable parcelable = (Parcelable) list.get(i3);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                ac(parcel, parcelable, 0);
            }
        }
        aa(parcel, iZ);
    }

    public static void z(Parcel parcel, SparseArray sparseArray) {
        if (sparseArray == null) {
            return;
        }
        int iZ = Z(parcel, 1);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            Parcelable parcelable = (Parcelable) sparseArray.valueAt(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                ac(parcel, parcelable, 0);
            }
        }
        aa(parcel, iZ);
    }
}
