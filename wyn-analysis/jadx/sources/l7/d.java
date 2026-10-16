package l7;

import U8.v0;
import a.AbstractC1304a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import com.google.android.gms.common.internal.AbstractC1732v;
import f4.C2555b;
import f7.C2615b;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import k7.C3190a;
import ka.AbstractC3256n;
import n7.AbstractC3598c;
import n7.AbstractC3599d;

/* loaded from: classes3.dex */
public final class d extends c {
    public static final Parcelable.Creator<d> CREATOR = new C2555b(15);

    /* renamed from: a, reason: collision with root package name */
    public final int f40022a;

    /* renamed from: b, reason: collision with root package name */
    public final Parcel f40023b;

    /* renamed from: c, reason: collision with root package name */
    public final int f40024c;

    /* renamed from: d, reason: collision with root package name */
    public final h f40025d;

    /* renamed from: e, reason: collision with root package name */
    public final String f40026e;

    /* renamed from: f, reason: collision with root package name */
    public int f40027f;

    /* renamed from: g, reason: collision with root package name */
    public int f40028g;

    public d(int i5, Parcel parcel, h hVar) {
        this.f40022a = i5;
        AbstractC1732v.i(parcel);
        this.f40023b = parcel;
        this.f40024c = 2;
        this.f40025d = hVar;
        this.f40026e = hVar == null ? null : hVar.f40037c;
        this.f40027f = 2;
    }

    public static void h(StringBuilder sb2, Map map, Parcel parcel) {
        BigInteger bigInteger;
        Parcel parcelObtain;
        BigInteger[] bigIntegerArr;
        long[] jArrCreateLongArray;
        float[] fArrCreateFloatArray;
        double[] dArrCreateDoubleArray;
        BigDecimal[] bigDecimalArr;
        boolean[] zArrCreateBooleanArray;
        Parcel[] parcelArr;
        BigInteger bigInteger2;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((C3397a) entry.getValue()).f40018g, entry);
        }
        sb2.append('{');
        int iO0 = v0.o0(parcel);
        boolean z2 = false;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) i5);
            if (entry2 != null) {
                if (z2) {
                    sb2.append(",");
                }
                String str = (String) entry2.getKey();
                C3397a c3397a = (C3397a) entry2.getValue();
                N0.a.r(sb2, "\"", str, "\":");
                C3190a c3190a = c3397a.k;
                int i10 = c3397a.f40015d;
                if (c3190a != null) {
                    switch (i10) {
                        case 0:
                            j(sb2, c3397a, AbstractC3398b.zaD(c3397a, Integer.valueOf(v0.f0(i5, parcel))));
                            break;
                        case 1:
                            int iK0 = v0.k0(i5, parcel);
                            int iDataPosition = parcel.dataPosition();
                            if (iK0 == 0) {
                                bigInteger2 = null;
                            } else {
                                byte[] bArrCreateByteArray = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition + iK0);
                                bigInteger2 = new BigInteger(bArrCreateByteArray);
                            }
                            j(sb2, c3397a, AbstractC3398b.zaD(c3397a, bigInteger2));
                            break;
                        case 2:
                            j(sb2, c3397a, AbstractC3398b.zaD(c3397a, Long.valueOf(v0.h0(i5, parcel))));
                            break;
                        case 3:
                            j(sb2, c3397a, AbstractC3398b.zaD(c3397a, Float.valueOf(v0.c0(i5, parcel))));
                            break;
                        case 4:
                            v0.r0(parcel, i5, 8);
                            j(sb2, c3397a, AbstractC3398b.zaD(c3397a, Double.valueOf(parcel.readDouble())));
                            break;
                        case 5:
                            j(sb2, c3397a, AbstractC3398b.zaD(c3397a, v0.p(i5, parcel)));
                            break;
                        case 6:
                            j(sb2, c3397a, AbstractC3398b.zaD(c3397a, Boolean.valueOf(v0.Z(i5, parcel))));
                            break;
                        case 7:
                            j(sb2, c3397a, AbstractC3398b.zaD(c3397a, v0.y(i5, parcel)));
                            break;
                        case 8:
                        case 9:
                            j(sb2, c3397a, AbstractC3398b.zaD(c3397a, v0.r(i5, parcel)));
                            break;
                        case 10:
                            Bundle bundleQ = v0.q(i5, parcel);
                            HashMap map2 = new HashMap();
                            for (String str2 : bundleQ.keySet()) {
                                String string = bundleQ.getString(str2);
                                AbstractC1732v.i(string);
                                map2.put(str2, string);
                            }
                            j(sb2, c3397a, AbstractC3398b.zaD(c3397a, map2));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(AbstractC3256n.g(i10, "Unknown field out type = "));
                    }
                } else {
                    boolean z10 = c3397a.f40016e;
                    String str3 = c3397a.f40020i;
                    if (z10) {
                        sb2.append("[");
                        switch (i10) {
                            case 0:
                                int[] iArrT = v0.t(i5, parcel);
                                int length = iArrT.length;
                                for (int i11 = 0; i11 < length; i11++) {
                                    if (i11 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(iArrT[i11]);
                                }
                                break;
                            case 1:
                                int iK02 = v0.k0(i5, parcel);
                                int iDataPosition2 = parcel.dataPosition();
                                if (iK02 == 0) {
                                    bigIntegerArr = null;
                                } else {
                                    int i12 = parcel.readInt();
                                    bigIntegerArr = new BigInteger[i12];
                                    for (int i13 = 0; i13 < i12; i13++) {
                                        bigIntegerArr[i13] = new BigInteger(parcel.createByteArray());
                                    }
                                    parcel.setDataPosition(iDataPosition2 + iK02);
                                }
                                int length2 = bigIntegerArr.length;
                                for (int i14 = 0; i14 < length2; i14++) {
                                    if (i14 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(bigIntegerArr[i14]);
                                }
                                break;
                            case 2:
                                int iK03 = v0.k0(i5, parcel);
                                int iDataPosition3 = parcel.dataPosition();
                                if (iK03 == 0) {
                                    jArrCreateLongArray = null;
                                } else {
                                    jArrCreateLongArray = parcel.createLongArray();
                                    parcel.setDataPosition(iDataPosition3 + iK03);
                                }
                                int length3 = jArrCreateLongArray.length;
                                for (int i15 = 0; i15 < length3; i15++) {
                                    if (i15 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(jArrCreateLongArray[i15]);
                                }
                                break;
                            case 3:
                                int iK04 = v0.k0(i5, parcel);
                                int iDataPosition4 = parcel.dataPosition();
                                if (iK04 == 0) {
                                    fArrCreateFloatArray = null;
                                } else {
                                    fArrCreateFloatArray = parcel.createFloatArray();
                                    parcel.setDataPosition(iDataPosition4 + iK04);
                                }
                                int length4 = fArrCreateFloatArray.length;
                                for (int i16 = 0; i16 < length4; i16++) {
                                    if (i16 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(fArrCreateFloatArray[i16]);
                                }
                                break;
                            case 4:
                                int iK05 = v0.k0(i5, parcel);
                                int iDataPosition5 = parcel.dataPosition();
                                if (iK05 == 0) {
                                    dArrCreateDoubleArray = null;
                                } else {
                                    dArrCreateDoubleArray = parcel.createDoubleArray();
                                    parcel.setDataPosition(iDataPosition5 + iK05);
                                }
                                int length5 = dArrCreateDoubleArray.length;
                                for (int i17 = 0; i17 < length5; i17++) {
                                    if (i17 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(dArrCreateDoubleArray[i17]);
                                }
                                break;
                            case 5:
                                int iK06 = v0.k0(i5, parcel);
                                int iDataPosition6 = parcel.dataPosition();
                                if (iK06 == 0) {
                                    bigDecimalArr = null;
                                } else {
                                    int i18 = parcel.readInt();
                                    bigDecimalArr = new BigDecimal[i18];
                                    for (int i19 = 0; i19 < i18; i19++) {
                                        bigDecimalArr[i19] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                    }
                                    parcel.setDataPosition(iDataPosition6 + iK06);
                                }
                                int length6 = bigDecimalArr.length;
                                for (int i20 = 0; i20 < length6; i20++) {
                                    if (i20 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(bigDecimalArr[i20]);
                                }
                                break;
                            case 6:
                                int iK07 = v0.k0(i5, parcel);
                                int iDataPosition7 = parcel.dataPosition();
                                if (iK07 == 0) {
                                    zArrCreateBooleanArray = null;
                                } else {
                                    zArrCreateBooleanArray = parcel.createBooleanArray();
                                    parcel.setDataPosition(iDataPosition7 + iK07);
                                }
                                int length7 = zArrCreateBooleanArray.length;
                                for (int i21 = 0; i21 < length7; i21++) {
                                    if (i21 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(zArrCreateBooleanArray[i21]);
                                }
                                break;
                            case 7:
                                String[] strArrZ = v0.z(i5, parcel);
                                int length8 = strArrZ.length;
                                for (int i22 = 0; i22 < length8; i22++) {
                                    if (i22 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append("\"");
                                    sb2.append(strArrZ[i22]);
                                    sb2.append("\"");
                                }
                                break;
                            case 8:
                            case 9:
                            case 10:
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            case 11:
                                int iK08 = v0.k0(i5, parcel);
                                int iDataPosition8 = parcel.dataPosition();
                                if (iK08 == 0) {
                                    parcelArr = null;
                                } else {
                                    int i23 = parcel.readInt();
                                    Parcel[] parcelArr2 = new Parcel[i23];
                                    for (int i24 = 0; i24 < i23; i24++) {
                                        int i25 = parcel.readInt();
                                        if (i25 != 0) {
                                            int iDataPosition9 = parcel.dataPosition();
                                            Parcel parcelObtain2 = Parcel.obtain();
                                            parcelObtain2.appendFrom(parcel, iDataPosition9, i25);
                                            parcelArr2[i24] = parcelObtain2;
                                            parcel.setDataPosition(iDataPosition9 + i25);
                                        } else {
                                            parcelArr2[i24] = null;
                                        }
                                    }
                                    parcel.setDataPosition(iDataPosition8 + iK08);
                                    parcelArr = parcelArr2;
                                }
                                int length9 = parcelArr.length;
                                for (int i26 = 0; i26 < length9; i26++) {
                                    if (i26 > 0) {
                                        sb2.append(",");
                                    }
                                    parcelArr[i26].setDataPosition(0);
                                    AbstractC1732v.i(str3);
                                    AbstractC1732v.i(c3397a.f40021j);
                                    Map map3 = (Map) c3397a.f40021j.f40036b.get(str3);
                                    AbstractC1732v.i(map3);
                                    h(sb2, map3, parcelArr[i26]);
                                }
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out.");
                        }
                        sb2.append("]");
                    } else {
                        switch (i10) {
                            case 0:
                                sb2.append(v0.f0(i5, parcel));
                                break;
                            case 1:
                                int iK09 = v0.k0(i5, parcel);
                                int iDataPosition10 = parcel.dataPosition();
                                if (iK09 == 0) {
                                    bigInteger = null;
                                } else {
                                    byte[] bArrCreateByteArray2 = parcel.createByteArray();
                                    parcel.setDataPosition(iDataPosition10 + iK09);
                                    bigInteger = new BigInteger(bArrCreateByteArray2);
                                }
                                sb2.append(bigInteger);
                                break;
                            case 2:
                                sb2.append(v0.h0(i5, parcel));
                                break;
                            case 3:
                                sb2.append(v0.c0(i5, parcel));
                                break;
                            case 4:
                                v0.r0(parcel, i5, 8);
                                sb2.append(parcel.readDouble());
                                break;
                            case 5:
                                sb2.append(v0.p(i5, parcel));
                                break;
                            case 6:
                                sb2.append(v0.Z(i5, parcel));
                                break;
                            case 7:
                                String strY = v0.y(i5, parcel);
                                sb2.append("\"");
                                sb2.append(AbstractC3599d.a(strY));
                                sb2.append("\"");
                                break;
                            case 8:
                                byte[] bArrR = v0.r(i5, parcel);
                                sb2.append("\"");
                                sb2.append(bArrR == null ? null : Base64.encodeToString(bArrR, 0));
                                sb2.append("\"");
                                break;
                            case 9:
                                byte[] bArrR2 = v0.r(i5, parcel);
                                sb2.append("\"");
                                sb2.append(bArrR2 == null ? null : Base64.encodeToString(bArrR2, 10));
                                sb2.append("\"");
                                break;
                            case 10:
                                Bundle bundleQ2 = v0.q(i5, parcel);
                                Set<String> setKeySet = bundleQ2.keySet();
                                sb2.append("{");
                                boolean z11 = true;
                                for (String str4 : setKeySet) {
                                    if (!z11) {
                                        sb2.append(",");
                                    }
                                    N0.a.r(sb2, "\"", str4, "\":\"");
                                    sb2.append(AbstractC3599d.a(bundleQ2.getString(str4)));
                                    sb2.append("\"");
                                    z11 = false;
                                }
                                sb2.append("}");
                                break;
                            case 11:
                                int iK010 = v0.k0(i5, parcel);
                                int iDataPosition11 = parcel.dataPosition();
                                if (iK010 == 0) {
                                    parcelObtain = null;
                                } else {
                                    parcelObtain = Parcel.obtain();
                                    parcelObtain.appendFrom(parcel, iDataPosition11, iK010);
                                    parcel.setDataPosition(iDataPosition11 + iK010);
                                }
                                parcelObtain.setDataPosition(0);
                                AbstractC1732v.i(str3);
                                AbstractC1732v.i(c3397a.f40021j);
                                Map map4 = (Map) c3397a.f40021j.f40036b.get(str3);
                                AbstractC1732v.i(map4);
                                h(sb2, map4, parcelObtain);
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out");
                        }
                    }
                }
                z2 = true;
            }
        }
        if (parcel.dataPosition() != iO0) {
            throw new C2615b(AbstractC3256n.g(iO0, "Overread allowed size end="), parcel);
        }
        sb2.append('}');
    }

    public static final void i(StringBuilder sb2, int i5, Object obj) {
        switch (i5) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb2.append(obj);
                return;
            case 7:
                sb2.append("\"");
                AbstractC1732v.i(obj);
                sb2.append(AbstractC3599d.a(obj.toString()));
                sb2.append("\"");
                return;
            case 8:
                sb2.append("\"");
                byte[] bArr = (byte[]) obj;
                sb2.append(bArr != null ? Base64.encodeToString(bArr, 0) : null);
                sb2.append("\"");
                return;
            case 9:
                sb2.append("\"");
                byte[] bArr2 = (byte[]) obj;
                sb2.append(bArr2 != null ? Base64.encodeToString(bArr2, 10) : null);
                sb2.append("\"");
                return;
            case 10:
                AbstractC1732v.i(obj);
                AbstractC3598c.o(sb2, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(AbstractC3256n.g(i5, "Unknown type = "));
        }
    }

    public static final void j(StringBuilder sb2, C3397a c3397a, Object obj) {
        boolean z2 = c3397a.f40014c;
        int i5 = c3397a.f40013b;
        if (!z2) {
            i(sb2, i5, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb2.append("[");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            i(sb2, i5, arrayList.get(i10));
        }
        sb2.append("]");
    }

    @Override // l7.AbstractC3398b
    public final void addConcreteTypeArrayInternal(C3397a c3397a, String str, ArrayList arrayList) {
        g(c3397a);
        ArrayList arrayList2 = new ArrayList();
        AbstractC1732v.i(arrayList);
        arrayList.size();
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList2.add(((d) ((AbstractC3398b) arrayList.get(i5))).f());
        }
        int i10 = c3397a.f40018g;
        Parcel parcel = this.f40023b;
        int iL0 = AbstractC1304a.l0(i10, parcel);
        int size2 = arrayList2.size();
        parcel.writeInt(size2);
        for (int i11 = 0; i11 < size2; i11++) {
            Parcel parcel2 = (Parcel) arrayList2.get(i11);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        AbstractC1304a.m0(iL0, parcel);
    }

    @Override // l7.AbstractC3398b
    public final void addConcreteTypeInternal(C3397a c3397a, String str, AbstractC3398b abstractC3398b) {
        g(c3397a);
        Parcel parcelF = ((d) abstractC3398b).f();
        Parcel parcel = this.f40023b;
        int i5 = c3397a.f40018g;
        if (parcelF == null) {
            AbstractC1304a.k0(parcel, i5, 0);
            return;
        }
        int iL0 = AbstractC1304a.l0(i5, parcel);
        parcel.appendFrom(parcelF, 0, parcelF.dataSize());
        AbstractC1304a.m0(iL0, parcel);
    }

    public final Parcel f() {
        int i5 = this.f40027f;
        Parcel parcel = this.f40023b;
        if (i5 != 0) {
            if (i5 != 1) {
                return parcel;
            }
            AbstractC1304a.m0(this.f40028g, parcel);
            this.f40027f = 2;
            return parcel;
        }
        int iL0 = AbstractC1304a.l0(20293, parcel);
        this.f40028g = iL0;
        AbstractC1304a.m0(iL0, parcel);
        this.f40027f = 2;
        return parcel;
    }

    public final void g(C3397a c3397a) {
        if (c3397a.f40018g == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.f40023b;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i5 = this.f40027f;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.f40028g = AbstractC1304a.l0(20293, parcel);
            this.f40027f = 1;
        }
    }

    @Override // l7.AbstractC3398b
    public final Map getFieldMappings() {
        h hVar = this.f40025d;
        if (hVar == null) {
            return null;
        }
        String str = this.f40026e;
        AbstractC1732v.i(str);
        return (Map) hVar.f40036b.get(str);
    }

    @Override // l7.c, l7.AbstractC3398b
    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // l7.c, l7.AbstractC3398b
    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // l7.AbstractC3398b
    public final void setBooleanInternal(C3397a c3397a, String str, boolean z2) {
        g(c3397a);
        Parcel parcel = this.f40023b;
        AbstractC1304a.k0(parcel, c3397a.f40018g, 4);
        parcel.writeInt(z2 ? 1 : 0);
    }

    @Override // l7.AbstractC3398b
    public final void setDecodedBytesInternal(C3397a c3397a, String str, byte[] bArr) {
        g(c3397a);
        AbstractC1304a.T(this.f40023b, c3397a.f40018g, bArr, true);
    }

    @Override // l7.AbstractC3398b
    public final void setIntegerInternal(C3397a c3397a, String str, int i5) {
        g(c3397a);
        Parcel parcel = this.f40023b;
        AbstractC1304a.k0(parcel, c3397a.f40018g, 4);
        parcel.writeInt(i5);
    }

    @Override // l7.AbstractC3398b
    public final void setLongInternal(C3397a c3397a, String str, long j8) {
        g(c3397a);
        Parcel parcel = this.f40023b;
        AbstractC1304a.k0(parcel, c3397a.f40018g, 8);
        parcel.writeLong(j8);
    }

    @Override // l7.AbstractC3398b
    public final void setStringInternal(C3397a c3397a, String str, String str2) {
        g(c3397a);
        AbstractC1304a.a0(this.f40023b, c3397a.f40018g, str2, true);
    }

    @Override // l7.AbstractC3398b
    public final void setStringMapInternal(C3397a c3397a, String str, Map map) {
        g(c3397a);
        Bundle bundle = new Bundle();
        AbstractC1732v.i(map);
        for (String str2 : map.keySet()) {
            bundle.putString(str2, (String) map.get(str2));
        }
        AbstractC1304a.S(this.f40023b, c3397a.f40018g, bundle, true);
    }

    @Override // l7.AbstractC3398b
    public final void setStringsInternal(C3397a c3397a, String str, ArrayList arrayList) {
        g(c3397a);
        AbstractC1732v.i(arrayList);
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i5 = 0; i5 < size; i5++) {
            strArr[i5] = (String) arrayList.get(i5);
        }
        AbstractC1304a.b0(this.f40023b, c3397a.f40018g, strArr, true);
    }

    @Override // l7.AbstractC3398b
    public final String toString() {
        h hVar = this.f40025d;
        AbstractC1732v.j(hVar, "Cannot convert to JSON on client side.");
        Parcel parcelF = f();
        parcelF.setDataPosition(0);
        StringBuilder sb2 = new StringBuilder(100);
        String str = this.f40026e;
        AbstractC1732v.i(str);
        Map map = (Map) hVar.f40036b.get(str);
        AbstractC1732v.i(map);
        h(sb2, map, parcelF);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f40022a);
        Parcel parcelF = f();
        if (parcelF != null) {
            int iL02 = AbstractC1304a.l0(2, parcel);
            parcel.appendFrom(parcelF, 0, parcelF.dataSize());
            AbstractC1304a.m0(iL02, parcel);
        }
        AbstractC1304a.Z(parcel, 3, this.f40024c != 0 ? this.f40025d : null, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }

    @Override // l7.AbstractC3398b
    public final void zab(C3397a c3397a, String str, BigDecimal bigDecimal) {
        g(c3397a);
        Parcel parcel = this.f40023b;
        int i5 = c3397a.f40018g;
        if (bigDecimal == null) {
            AbstractC1304a.k0(parcel, i5, 0);
            return;
        }
        int iL0 = AbstractC1304a.l0(i5, parcel);
        parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
        parcel.writeInt(bigDecimal.scale());
        AbstractC1304a.m0(iL0, parcel);
    }

    @Override // l7.AbstractC3398b
    public final void zad(C3397a c3397a, String str, ArrayList arrayList) {
        g(c3397a);
        AbstractC1732v.i(arrayList);
        int size = arrayList.size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i5 = 0; i5 < size; i5++) {
            bigDecimalArr[i5] = (BigDecimal) arrayList.get(i5);
        }
        int i10 = c3397a.f40018g;
        Parcel parcel = this.f40023b;
        int iL0 = AbstractC1304a.l0(i10, parcel);
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray(bigDecimalArr[i11].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i11].scale());
        }
        AbstractC1304a.m0(iL0, parcel);
    }

    @Override // l7.AbstractC3398b
    public final void zaf(C3397a c3397a, String str, BigInteger bigInteger) {
        g(c3397a);
        Parcel parcel = this.f40023b;
        int i5 = c3397a.f40018g;
        if (bigInteger == null) {
            AbstractC1304a.k0(parcel, i5, 0);
            return;
        }
        int iL0 = AbstractC1304a.l0(i5, parcel);
        parcel.writeByteArray(bigInteger.toByteArray());
        AbstractC1304a.m0(iL0, parcel);
    }

    @Override // l7.AbstractC3398b
    public final void zah(C3397a c3397a, String str, ArrayList arrayList) {
        g(c3397a);
        AbstractC1732v.i(arrayList);
        int size = arrayList.size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i5 = 0; i5 < size; i5++) {
            bigIntegerArr[i5] = (BigInteger) arrayList.get(i5);
        }
        int i10 = c3397a.f40018g;
        Parcel parcel = this.f40023b;
        int iL0 = AbstractC1304a.l0(i10, parcel);
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray(bigIntegerArr[i11].toByteArray());
        }
        AbstractC1304a.m0(iL0, parcel);
    }

    @Override // l7.AbstractC3398b
    public final void zak(C3397a c3397a, String str, ArrayList arrayList) {
        g(c3397a);
        AbstractC1732v.i(arrayList);
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i5 = 0; i5 < size; i5++) {
            zArr[i5] = ((Boolean) arrayList.get(i5)).booleanValue();
        }
        int i10 = c3397a.f40018g;
        Parcel parcel = this.f40023b;
        int iL0 = AbstractC1304a.l0(i10, parcel);
        parcel.writeBooleanArray(zArr);
        AbstractC1304a.m0(iL0, parcel);
    }

    @Override // l7.AbstractC3398b
    public final void zan(C3397a c3397a, String str, double d3) {
        g(c3397a);
        Parcel parcel = this.f40023b;
        AbstractC1304a.k0(parcel, c3397a.f40018g, 8);
        parcel.writeDouble(d3);
    }

    @Override // l7.AbstractC3398b
    public final void zap(C3397a c3397a, String str, ArrayList arrayList) {
        g(c3397a);
        AbstractC1732v.i(arrayList);
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i5 = 0; i5 < size; i5++) {
            dArr[i5] = ((Double) arrayList.get(i5)).doubleValue();
        }
        int i10 = c3397a.f40018g;
        Parcel parcel = this.f40023b;
        int iL0 = AbstractC1304a.l0(i10, parcel);
        parcel.writeDoubleArray(dArr);
        AbstractC1304a.m0(iL0, parcel);
    }

    @Override // l7.AbstractC3398b
    public final void zar(C3397a c3397a, String str, float f10) {
        g(c3397a);
        Parcel parcel = this.f40023b;
        AbstractC1304a.k0(parcel, c3397a.f40018g, 4);
        parcel.writeFloat(f10);
    }

    @Override // l7.AbstractC3398b
    public final void zat(C3397a c3397a, String str, ArrayList arrayList) {
        g(c3397a);
        AbstractC1732v.i(arrayList);
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i5 = 0; i5 < size; i5++) {
            fArr[i5] = ((Float) arrayList.get(i5)).floatValue();
        }
        Parcel parcel = this.f40023b;
        int iL0 = AbstractC1304a.l0(c3397a.f40018g, parcel);
        parcel.writeFloatArray(fArr);
        AbstractC1304a.m0(iL0, parcel);
    }

    @Override // l7.AbstractC3398b
    public final void zaw(C3397a c3397a, String str, ArrayList arrayList) {
        g(c3397a);
        AbstractC1732v.i(arrayList);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = ((Integer) arrayList.get(i5)).intValue();
        }
        AbstractC1304a.W(this.f40023b, c3397a.f40018g, iArr, true);
    }

    @Override // l7.AbstractC3398b
    public final void zaz(C3397a c3397a, String str, ArrayList arrayList) {
        g(c3397a);
        AbstractC1732v.i(arrayList);
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i5 = 0; i5 < size; i5++) {
            jArr[i5] = ((Long) arrayList.get(i5)).longValue();
        }
        int i10 = c3397a.f40018g;
        Parcel parcel = this.f40023b;
        int iL0 = AbstractC1304a.l0(i10, parcel);
        parcel.writeLongArray(jArr);
        AbstractC1304a.m0(iL0, parcel);
    }
}
