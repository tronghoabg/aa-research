package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.k1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1811k1 implements D1 {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f27698q = new int[0];

    /* renamed from: r, reason: collision with root package name */
    public static final Unsafe f27699r = d2.j();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f27700a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f27701b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27702c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27703d;

    /* renamed from: e, reason: collision with root package name */
    public final MessageLite f27704e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27705f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27706g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f27707h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f27708i;

    /* renamed from: j, reason: collision with root package name */
    public final int f27709j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final C1823o1 f27710l;

    /* renamed from: m, reason: collision with root package name */
    public final W0 f27711m;

    /* renamed from: n, reason: collision with root package name */
    public final X1 f27712n;

    /* renamed from: o, reason: collision with root package name */
    public final AbstractC1807j0 f27713o;

    /* renamed from: p, reason: collision with root package name */
    public final C1793e1 f27714p;

    public C1811k1(int[] iArr, Object[] objArr, int i5, int i10, MessageLite messageLite, boolean z2, int[] iArr2, int i11, int i12, C1823o1 c1823o1, W0 w02, X1 x12, AbstractC1807j0 abstractC1807j0, C1793e1 c1793e1) {
        this.f27700a = iArr;
        this.f27701b = objArr;
        this.f27702c = i5;
        this.f27703d = i10;
        this.f27706g = messageLite instanceof GeneratedMessageLite;
        this.f27705f = abstractC1807j0 != null && (messageLite instanceof GeneratedMessageLite.ExtendableMessage);
        this.f27707h = z2;
        this.f27708i = iArr2;
        this.f27709j = i11;
        this.k = i12;
        this.f27710l = c1823o1;
        this.f27711m = w02;
        this.f27712n = x12;
        this.f27713o = abstractC1807j0;
        this.f27704e = messageLite;
        this.f27714p = c1793e1;
    }

    public static C1811k1 B(InterfaceC1799g1 interfaceC1799g1, C1823o1 c1823o1, W0 w02, X1 x12, AbstractC1807j0 abstractC1807j0, C1793e1 c1793e1) {
        int i5;
        int i10;
        int i11;
        int[] iArr;
        int[] iArr2;
        int iL;
        int iNumberOfTrailingZeros;
        boolean z2;
        char c10;
        if (interfaceC1799g1 instanceof C1852y1) {
            return C((C1852y1) interfaceC1799g1, c1823o1, w02, x12, abstractC1807j0, c1793e1);
        }
        Q1 q12 = (Q1) interfaceC1799g1;
        C1836t0[] c1836t0Arr = q12.f27618d;
        if (c1836t0Arr.length == 0) {
            i5 = 0;
            i10 = 0;
        } else {
            i5 = c1836t0Arr[0].f27744c;
            i10 = c1836t0Arr[c1836t0Arr.length - 1].f27744c;
        }
        int length = c1836t0Arr.length;
        int[] iArr3 = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i12 = 0;
        int i13 = 0;
        for (C1836t0 c1836t0 : c1836t0Arr) {
            FieldType fieldType = c1836t0.f27743b;
            if (fieldType == FieldType.MAP) {
                i12++;
            } else if (fieldType.id() >= 18 && c1836t0.f27743b.id() <= 49) {
                i13++;
            }
        }
        int[] iArr4 = i12 > 0 ? new int[i12] : null;
        int[] iArr5 = i13 > 0 ? new int[i13] : null;
        int[] iArr6 = f27698q;
        int[] iArr7 = q12.f27617c;
        if (iArr7 == null) {
            iArr7 = iArr6;
        }
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i15 < c1836t0Arr.length) {
            C1836t0 c1836t02 = c1836t0Arr[i15];
            int i19 = c1836t02.f27744c;
            c2 c2Var = d2.f27664c;
            C1836t0[] c1836t0Arr2 = c1836t0Arr;
            java.lang.reflect.Field field = c1836t02.f27742a;
            int i20 = i10;
            Object[] objArr2 = objArr;
            int iL2 = (int) c2Var.l(field);
            FieldType fieldType2 = c1836t02.f27743b;
            int iId = fieldType2.id();
            if (fieldType2.isList() || fieldType2.isMap()) {
                i11 = i5;
                iArr = iArr3;
                iArr2 = iArr4;
                java.lang.reflect.Field field2 = c1836t02.f27749h;
                iL = field2 == null ? 0 : (int) c2Var.l(field2);
                iNumberOfTrailingZeros = 0;
            } else {
                i11 = i5;
                java.lang.reflect.Field field3 = c1836t02.f27745d;
                if (field3 == null) {
                    iL = 1048575;
                    iArr = iArr3;
                    iArr2 = iArr4;
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    iL = (int) c2Var.l(field3);
                }
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(c1836t02.f27746e);
            }
            iArr[i16] = c1836t02.f27744c;
            int i21 = iL;
            iArr[i16 + 1] = (c1836t02.f27748g ? 536870912 : 0) | (c1836t02.f27747f ? 268435456 : 0) | (iId << 20) | iL2;
            iArr[i16 + 2] = (iNumberOfTrailingZeros << 20) | i21;
            int i22 = AbstractC1833s0.f27740a[fieldType2.ordinal()];
            Class<?> type = ((i22 == 1 || i22 == 2) && field != null) ? field.getType() : null;
            Internal.EnumVerifier enumVerifier = c1836t02.f27751j;
            Object obj = c1836t02.f27750i;
            if (obj != null) {
                int i23 = (i16 / 3) * 2;
                objArr2[i23] = obj;
                if (type != null) {
                    objArr2[i23 + 1] = type;
                } else if (enumVerifier != null) {
                    objArr2[i23 + 1] = enumVerifier;
                }
                z2 = true;
            } else if (type != null) {
                z2 = true;
                objArr2[((i16 / 3) * 2) + 1] = type;
            } else {
                z2 = true;
                if (enumVerifier != null) {
                    objArr2[((i16 / 3) * 2) + 1] = enumVerifier;
                }
            }
            if (i14 < iArr7.length && iArr7[i14] == i19) {
                iArr7[i14] = i16;
                i14++;
            }
            if (fieldType2 == FieldType.MAP) {
                iArr2[i17] = i16;
                i17++;
                c10 = 18;
            } else {
                c10 = 18;
                if (fieldType2.id() >= 18) {
                    if (fieldType2.id() <= 49) {
                        iArr5[i18] = (int) c2Var.l(field);
                        i18++;
                    }
                }
                i15++;
                i16 += 3;
                c1836t0Arr = c1836t0Arr2;
                i10 = i20;
                objArr = objArr2;
                i5 = i11;
                iArr3 = iArr;
                iArr4 = iArr2;
            }
            i15++;
            i16 += 3;
            c1836t0Arr = c1836t0Arr2;
            i10 = i20;
            objArr = objArr2;
            i5 = i11;
            iArr3 = iArr;
            iArr4 = iArr2;
        }
        int i24 = i5;
        int i25 = i10;
        Object[] objArr3 = objArr;
        int[] iArr8 = iArr3;
        int[] iArr9 = iArr4;
        int[] iArr10 = iArr9 == null ? iArr6 : iArr9;
        if (iArr5 == null) {
            iArr5 = iArr6;
        }
        int[] iArr11 = new int[iArr7.length + iArr10.length + iArr5.length];
        System.arraycopy(iArr7, 0, iArr11, 0, iArr7.length);
        System.arraycopy(iArr10, 0, iArr11, iArr7.length, iArr10.length);
        System.arraycopy(iArr5, 0, iArr11, iArr7.length + iArr10.length, iArr5.length);
        return new C1811k1(iArr8, objArr3, i24, i25, q12.f27619e, true, iArr11, iArr7.length, iArr7.length + iArr10.length, c1823o1, w02, x12, abstractC1807j0, c1793e1);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.protobuf.C1811k1 C(com.google.protobuf.C1852y1 r34, com.google.protobuf.C1823o1 r35, com.google.protobuf.W0 r36, com.google.protobuf.X1 r37, com.google.protobuf.AbstractC1807j0 r38, com.google.protobuf.C1793e1 r39) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1811k1.C(com.google.protobuf.y1, com.google.protobuf.o1, com.google.protobuf.W0, com.google.protobuf.X1, com.google.protobuf.j0, com.google.protobuf.e1):com.google.protobuf.k1");
    }

    public static long D(int i5) {
        return i5 & 1048575;
    }

    public static int E(MessageLite messageLite, long j8) {
        return ((Integer) d2.f27664c.k(j8, messageLite)).intValue();
    }

    public static long F(MessageLite messageLite, long j8) {
        return ((Long) d2.f27664c.k(j8, messageLite)).longValue();
    }

    public static java.lang.reflect.Field O(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Field ", str, " for ");
            sbW.append(cls.getName());
            sbW.append(" not found. Known fields are ");
            sbW.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbW.toString());
        }
    }

    public static int U(int i5) {
        return (i5 & 267386880) >>> 20;
    }

    public static void Y(int i5, Object obj, q2 q2Var) throws IOException {
        if (obj instanceof String) {
            ((L) q2Var).f27587a.writeString(i5, (String) obj);
        } else {
            ((L) q2Var).a(i5, (ByteString) obj);
        }
    }

    public static void k(Object obj) {
        if (t(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static int l(byte[] bArr, int i5, int i10, WireFormat.FieldType fieldType, Class cls, C1797g c1797g) throws InvalidProtocolBufferException {
        switch (AbstractC1808j1.f27693a[fieldType.ordinal()]) {
            case 1:
                int iT = AbstractC1800h.t(bArr, i5, c1797g);
                c1797g.f27679c = Boolean.valueOf(c1797g.f27678b != 0);
                return iT;
            case 2:
                return AbstractC1800h.a(bArr, i5, c1797g);
            case 3:
                c1797g.f27679c = Double.valueOf(Double.longBitsToDouble(AbstractC1800h.c(i5, bArr)));
                return i5 + 8;
            case 4:
            case 5:
                c1797g.f27679c = Integer.valueOf(AbstractC1800h.b(i5, bArr));
                return i5 + 4;
            case 6:
            case 7:
                c1797g.f27679c = Long.valueOf(AbstractC1800h.c(i5, bArr));
                return i5 + 8;
            case 8:
                c1797g.f27679c = Float.valueOf(Float.intBitsToFloat(AbstractC1800h.b(i5, bArr)));
                return i5 + 4;
            case 9:
            case 10:
            case 11:
                int iR = AbstractC1800h.r(bArr, i5, c1797g);
                c1797g.f27679c = Integer.valueOf(c1797g.f27677a);
                return iR;
            case 12:
            case 13:
                int iT2 = AbstractC1800h.t(bArr, i5, c1797g);
                c1797g.f27679c = Long.valueOf(c1797g.f27678b);
                return iT2;
            case 14:
                return AbstractC1800h.e(C1846w1.f27770c.a(cls), bArr, i5, i10, c1797g);
            case 15:
                int iR2 = AbstractC1800h.r(bArr, i5, c1797g);
                c1797g.f27679c = Integer.valueOf(CodedInputStream.decodeZigZag32(c1797g.f27677a));
                return iR2;
            case 16:
                int iT3 = AbstractC1800h.t(bArr, i5, c1797g);
                c1797g.f27679c = Long.valueOf(CodedInputStream.decodeZigZag64(c1797g.f27678b));
                return iT3;
            case 17:
                int iR3 = AbstractC1800h.r(bArr, i5, c1797g);
                int i11 = c1797g.f27677a;
                if (i11 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                if (i11 == 0) {
                    c1797g.f27679c = "";
                    return iR3;
                }
                c1797g.f27679c = f2.f27676a.b(iR3, i11, bArr);
                return iR3 + i11;
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public static UnknownFieldSetLite q(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        return unknownFieldSetLiteNewInstance;
    }

    public static boolean t(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    public final Object A(int i5, int i10, Object obj) {
        D1 d1P = p(i10);
        if (!u(i5, i10, obj)) {
            return d1P.newInstance();
        }
        Object object = f27699r.getObject(obj, V(i10) & 1048575);
        if (t(object)) {
            return object;
        }
        Object objNewInstance = d1P.newInstance();
        if (object != null) {
            d1P.c(objNewInstance, object);
        }
        return objNewInstance;
    }

    public final int G(Object obj, byte[] bArr, int i5, int i10, int i11, long j8, C1797g c1797g) throws InvalidProtocolBufferException {
        int iL;
        Unsafe unsafe = f27699r;
        Object objO = o(i11);
        Object object = unsafe.getObject(obj, j8);
        this.f27714p.getClass();
        if (!((MapFieldLite) object).isMutable()) {
            MapFieldLite mapFieldLiteMutableCopy = MapFieldLite.emptyMapField().mutableCopy();
            C1793e1.a(mapFieldLiteMutableCopy, object);
            unsafe.putObject(obj, j8, mapFieldLiteMutableCopy);
            object = mapFieldLiteMutableCopy;
        }
        C1790d1 metadata = ((MapEntryLite) objO).getMetadata();
        MapFieldLite mapFieldLite = (MapFieldLite) object;
        int iR = AbstractC1800h.r(bArr, i5, c1797g);
        int i12 = c1797g.f27677a;
        if (i12 < 0 || i12 > i10 - iR) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i13 = iR + i12;
        Object obj2 = metadata.f27659b;
        Object obj3 = metadata.f27661d;
        Object obj4 = obj2;
        Object obj5 = obj3;
        while (iR < i13) {
            int iQ = iR + 1;
            int i14 = bArr[iR];
            if (i14 < 0) {
                iQ = AbstractC1800h.q(i14, bArr, iQ, c1797g);
                i14 = c1797g.f27677a;
            }
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i15 != 1) {
                if (i15 == 2 && i16 == metadata.f27660c.getWireType()) {
                    iL = l(bArr, iQ, i10, metadata.f27660c, obj3.getClass(), c1797g);
                    obj5 = c1797g.f27679c;
                    iR = iL;
                } else {
                    iR = AbstractC1800h.w(i14, bArr, iQ, i10, c1797g);
                }
            } else if (i16 == metadata.f27658a.getWireType()) {
                iL = l(bArr, iQ, i10, metadata.f27658a, null, c1797g);
                obj4 = c1797g.f27679c;
                iR = iL;
            } else {
                iR = AbstractC1800h.w(i14, bArr, iQ, i10, c1797g);
            }
        }
        if (iR != i13) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        mapFieldLite.put(obj4, obj5);
        return i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x04b3, code lost:
    
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x07eb, code lost:
    
        if (r0 == 1048575) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x07ed, code lost:
    
        r25.putInt(r10, r0, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x07f3, code lost:
    
        r3 = null;
        r9 = r8.f27709j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x07fa, code lost:
    
        if (r9 >= r8.k) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x07fc, code lost:
    
        r3 = (com.google.protobuf.UnknownFieldSetLite) r8.m(r10, r8.f27708i[r9], r3, r8.f27712n, r34);
        r9 = r9 + 1;
        r10 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0812, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0813, code lost:
    
        if (r3 == null) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0815, code lost:
    
        ((com.google.protobuf.Y1) r0.f27712n).getClass();
        ((com.google.protobuf.GeneratedMessageLite) r34).unknownFields = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0822, code lost:
    
        if (r38 != 0) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0824, code lost:
    
        if (r7 != r6) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x082b, code lost:
    
        throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x082c, code lost:
    
        if (r7 > r6) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x082e, code lost:
    
        if (r14 != r38) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0830, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0835, code lost:
    
        throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x07b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int H(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.protobuf.C1797g r39) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instructions count: 2214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1811k1.H(java.lang.Object, byte[], int, int, int, com.google.protobuf.g):int");
    }

    public final int I(Object obj, byte[] bArr, int i5, int i10, int i11, int i12, int i13, int i14, int i15, long j8, int i16, C1797g c1797g) throws InvalidProtocolBufferException {
        Unsafe unsafe = f27699r;
        long j10 = this.f27700a[i16 + 2] & 1048575;
        switch (i15) {
            case 51:
                if (i13 != 1) {
                    return i5;
                }
                unsafe.putObject(obj, j8, Double.valueOf(Double.longBitsToDouble(AbstractC1800h.c(i5, bArr))));
                int i17 = i5 + 8;
                unsafe.putInt(obj, j10, i12);
                return i17;
            case 52:
                if (i13 != 5) {
                    return i5;
                }
                unsafe.putObject(obj, j8, Float.valueOf(Float.intBitsToFloat(AbstractC1800h.b(i5, bArr))));
                int i18 = i5 + 4;
                unsafe.putInt(obj, j10, i12);
                return i18;
            case 53:
            case 54:
                if (i13 != 0) {
                    return i5;
                }
                int iT = AbstractC1800h.t(bArr, i5, c1797g);
                unsafe.putObject(obj, j8, Long.valueOf(c1797g.f27678b));
                unsafe.putInt(obj, j10, i12);
                return iT;
            case 55:
            case 62:
                if (i13 != 0) {
                    return i5;
                }
                int iR = AbstractC1800h.r(bArr, i5, c1797g);
                unsafe.putObject(obj, j8, Integer.valueOf(c1797g.f27677a));
                unsafe.putInt(obj, j10, i12);
                return iR;
            case 56:
            case 65:
                if (i13 != 1) {
                    return i5;
                }
                unsafe.putObject(obj, j8, Long.valueOf(AbstractC1800h.c(i5, bArr)));
                int i19 = i5 + 8;
                unsafe.putInt(obj, j10, i12);
                return i19;
            case 57:
            case 64:
                if (i13 != 5) {
                    return i5;
                }
                unsafe.putObject(obj, j8, Integer.valueOf(AbstractC1800h.b(i5, bArr)));
                int i20 = i5 + 4;
                unsafe.putInt(obj, j10, i12);
                return i20;
            case 58:
                if (i13 != 0) {
                    return i5;
                }
                int iT2 = AbstractC1800h.t(bArr, i5, c1797g);
                unsafe.putObject(obj, j8, Boolean.valueOf(c1797g.f27678b != 0));
                unsafe.putInt(obj, j10, i12);
                return iT2;
            case 59:
                if (i13 != 2) {
                    return i5;
                }
                int iR2 = AbstractC1800h.r(bArr, i5, c1797g);
                int i21 = c1797g.f27677a;
                if (i21 == 0) {
                    unsafe.putObject(obj, j8, "");
                } else {
                    if ((i14 & 536870912) != 0) {
                        if (!f2.f27676a.e(bArr, iR2, iR2 + i21)) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    }
                    unsafe.putObject(obj, j8, new String(bArr, iR2, i21, Internal.UTF_8));
                    iR2 += i21;
                }
                unsafe.putInt(obj, j10, i12);
                return iR2;
            case 60:
                if (i13 != 2) {
                    return i5;
                }
                Object objA = A(i12, i16, obj);
                int iV = AbstractC1800h.v(objA, p(i16), bArr, i5, i10, c1797g);
                T(obj, i12, i16, objA);
                return iV;
            case 61:
                if (i13 != 2) {
                    return i5;
                }
                int iA = AbstractC1800h.a(bArr, i5, c1797g);
                unsafe.putObject(obj, j8, c1797g.f27679c);
                unsafe.putInt(obj, j10, i12);
                return iA;
            case 63:
                if (i13 != 0) {
                    return i5;
                }
                int iR3 = AbstractC1800h.r(bArr, i5, c1797g);
                int i22 = c1797g.f27677a;
                Internal.EnumVerifier enumVerifierN = n(i16);
                if (enumVerifierN != null && !enumVerifierN.isInRange(i22)) {
                    q(obj).storeField(i11, Long.valueOf(i22));
                    return iR3;
                }
                unsafe.putObject(obj, j8, Integer.valueOf(i22));
                unsafe.putInt(obj, j10, i12);
                return iR3;
            case 66:
                if (i13 != 0) {
                    return i5;
                }
                int iR4 = AbstractC1800h.r(bArr, i5, c1797g);
                unsafe.putObject(obj, j8, Integer.valueOf(CodedInputStream.decodeZigZag32(c1797g.f27677a)));
                unsafe.putInt(obj, j10, i12);
                return iR4;
            case 67:
                if (i13 != 0) {
                    return i5;
                }
                int iT3 = AbstractC1800h.t(bArr, i5, c1797g);
                unsafe.putObject(obj, j8, Long.valueOf(CodedInputStream.decodeZigZag64(c1797g.f27678b)));
                unsafe.putInt(obj, j10, i12);
                return iT3;
            case 68:
                if (i13 == 3) {
                    Object objA2 = A(i12, i16, obj);
                    int iU = AbstractC1800h.u(objA2, p(i16), bArr, i5, i10, (i11 & (-8)) | 4, c1797g);
                    T(obj, i12, i16, objA2);
                    return iU;
                }
                break;
        }
        return i5;
    }

    public final int J(Object obj, byte[] bArr, int i5, int i10, int i11, int i12, int i13, int i14, long j8, int i15, long j10, C1797g c1797g) throws InvalidProtocolBufferException {
        int i16;
        int iS;
        Unsafe unsafe = f27699r;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe.getObject(obj, j10);
        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
            int size = protobufListMutableCopyWithCapacity2.size();
            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j10, protobufListMutableCopyWithCapacity2);
        }
        Internal.ProtobufList protobufList = protobufListMutableCopyWithCapacity2;
        switch (i15) {
            case 18:
            case 35:
                if (i13 == 2) {
                    return AbstractC1800h.h(bArr, i5, protobufList, c1797g);
                }
                if (i13 != 1) {
                    return i5;
                }
                C1780a0 c1780a0 = (C1780a0) protobufList;
                c1780a0.addDouble(Double.longBitsToDouble(AbstractC1800h.c(i5, bArr)));
                int i17 = i5 + 8;
                while (i17 < i10) {
                    int iR = AbstractC1800h.r(bArr, i17, c1797g);
                    if (i11 != c1797g.f27677a) {
                        return i17;
                    }
                    c1780a0.addDouble(Double.longBitsToDouble(AbstractC1800h.c(iR, bArr)));
                    i17 = iR + 8;
                }
                return i17;
            case 19:
            case 36:
                if (i13 == 2) {
                    return AbstractC1800h.k(bArr, i5, protobufList, c1797g);
                }
                if (i13 != 5) {
                    return i5;
                }
                C1854z0 c1854z0 = (C1854z0) protobufList;
                c1854z0.addFloat(Float.intBitsToFloat(AbstractC1800h.b(i5, bArr)));
                int i18 = i5 + 4;
                while (i18 < i10) {
                    int iR2 = AbstractC1800h.r(bArr, i18, c1797g);
                    if (i11 != c1797g.f27677a) {
                        return i18;
                    }
                    c1854z0.addFloat(Float.intBitsToFloat(AbstractC1800h.b(iR2, bArr)));
                    i18 = iR2 + 4;
                }
                return i18;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i13 == 2) {
                    Y0 y02 = (Y0) protobufList;
                    int iR3 = AbstractC1800h.r(bArr, i5, c1797g);
                    int i19 = c1797g.f27677a + iR3;
                    while (iR3 < i19) {
                        iR3 = AbstractC1800h.t(bArr, iR3, c1797g);
                        y02.addLong(c1797g.f27678b);
                    }
                    if (iR3 == i19) {
                        return iR3;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i13 != 0) {
                    return i5;
                }
                Y0 y03 = (Y0) protobufList;
                int iT = AbstractC1800h.t(bArr, i5, c1797g);
                y03.addLong(c1797g.f27678b);
                while (iT < i10) {
                    int iR4 = AbstractC1800h.r(bArr, iT, c1797g);
                    if (i11 != c1797g.f27677a) {
                        return iT;
                    }
                    iT = AbstractC1800h.t(bArr, iR4, c1797g);
                    y03.addLong(c1797g.f27678b);
                }
                return iT;
            case 22:
            case 29:
            case 39:
            case 43:
                return i13 == 2 ? AbstractC1800h.n(bArr, i5, protobufList, c1797g) : i13 == 0 ? AbstractC1800h.s(i11, bArr, i5, i10, protobufList, c1797g) : i5;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i13 == 2) {
                    return AbstractC1800h.j(bArr, i5, protobufList, c1797g);
                }
                if (i13 != 1) {
                    return i5;
                }
                Y0 y04 = (Y0) protobufList;
                y04.addLong(AbstractC1800h.c(i5, bArr));
                int i20 = i5 + 8;
                while (i20 < i10) {
                    int iR5 = AbstractC1800h.r(bArr, i20, c1797g);
                    if (i11 != c1797g.f27677a) {
                        return i20;
                    }
                    y04.addLong(AbstractC1800h.c(iR5, bArr));
                    i20 = iR5 + 8;
                }
                return i20;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i13 == 2) {
                    return AbstractC1800h.i(bArr, i5, protobufList, c1797g);
                }
                if (i13 != 5) {
                    return i5;
                }
                G0 g02 = (G0) protobufList;
                g02.addInt(AbstractC1800h.b(i5, bArr));
                int i21 = i5 + 4;
                while (i21 < i10) {
                    int iR6 = AbstractC1800h.r(bArr, i21, c1797g);
                    if (i11 != c1797g.f27677a) {
                        return i21;
                    }
                    g02.addInt(AbstractC1800h.b(iR6, bArr));
                    i21 = iR6 + 4;
                }
                return i21;
            case 25:
            case 42:
                if (i13 == 2) {
                    return AbstractC1800h.g(bArr, i5, protobufList, c1797g);
                }
                if (i13 != 0) {
                    return i5;
                }
                C1806j c1806j = (C1806j) protobufList;
                int iT2 = AbstractC1800h.t(bArr, i5, c1797g);
                c1806j.addBoolean(c1797g.f27678b != 0);
                while (iT2 < i10) {
                    int iR7 = AbstractC1800h.r(bArr, iT2, c1797g);
                    if (i11 != c1797g.f27677a) {
                        return iT2;
                    }
                    iT2 = AbstractC1800h.t(bArr, iR7, c1797g);
                    c1806j.addBoolean(c1797g.f27678b != 0);
                }
                return iT2;
            case 26:
                if (i13 != 2) {
                    return i5;
                }
                if ((j8 & 536870912) == 0) {
                    int iR8 = AbstractC1800h.r(bArr, i5, c1797g);
                    int i22 = c1797g.f27677a;
                    if (i22 < 0) {
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                    if (i22 == 0) {
                        protobufList.add("");
                    } else {
                        protobufList.add(new String(bArr, iR8, i22, Internal.UTF_8));
                        iR8 += i22;
                    }
                    while (iR8 < i10) {
                        int iR9 = AbstractC1800h.r(bArr, iR8, c1797g);
                        if (i11 != c1797g.f27677a) {
                            return iR8;
                        }
                        iR8 = AbstractC1800h.r(bArr, iR9, c1797g);
                        int i23 = c1797g.f27677a;
                        if (i23 < 0) {
                            throw InvalidProtocolBufferException.negativeSize();
                        }
                        if (i23 == 0) {
                            protobufList.add("");
                        } else {
                            protobufList.add(new String(bArr, iR8, i23, Internal.UTF_8));
                            iR8 += i23;
                        }
                    }
                    return iR8;
                }
                int iR10 = AbstractC1800h.r(bArr, i5, c1797g);
                int i24 = c1797g.f27677a;
                if (i24 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                if (i24 == 0) {
                    protobufList.add("");
                } else {
                    int i25 = iR10 + i24;
                    if (!f2.f27676a.e(bArr, iR10, i25)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    protobufList.add(new String(bArr, iR10, i24, Internal.UTF_8));
                    iR10 = i25;
                }
                while (iR10 < i10) {
                    int iR11 = AbstractC1800h.r(bArr, iR10, c1797g);
                    if (i11 != c1797g.f27677a) {
                        return iR10;
                    }
                    iR10 = AbstractC1800h.r(bArr, iR11, c1797g);
                    int i26 = c1797g.f27677a;
                    if (i26 < 0) {
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                    if (i26 == 0) {
                        protobufList.add("");
                    } else {
                        int i27 = iR10 + i26;
                        if (!f2.f27676a.e(bArr, iR10, i27)) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        protobufList.add(new String(bArr, iR10, i26, Internal.UTF_8));
                        iR10 = i27;
                    }
                }
                return iR10;
            case 27:
                i16 = i5;
                if (i13 == 2) {
                    return AbstractC1800h.f(p(i14), i11, bArr, i16, i10, protobufList, c1797g);
                }
                break;
            case 28:
                i16 = i5;
                if (i13 == 2) {
                    int iR12 = AbstractC1800h.r(bArr, i16, c1797g);
                    int i28 = c1797g.f27677a;
                    if (i28 < 0) {
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                    if (i28 > bArr.length - iR12) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    if (i28 == 0) {
                        protobufList.add(ByteString.EMPTY);
                    } else {
                        protobufList.add(ByteString.copyFrom(bArr, iR12, i28));
                        iR12 += i28;
                    }
                    while (iR12 < i10) {
                        int iR13 = AbstractC1800h.r(bArr, iR12, c1797g);
                        if (i11 != c1797g.f27677a) {
                            return iR12;
                        }
                        iR12 = AbstractC1800h.r(bArr, iR13, c1797g);
                        int i29 = c1797g.f27677a;
                        if (i29 < 0) {
                            throw InvalidProtocolBufferException.negativeSize();
                        }
                        if (i29 > bArr.length - iR12) {
                            throw InvalidProtocolBufferException.truncatedMessage();
                        }
                        if (i29 == 0) {
                            protobufList.add(ByteString.EMPTY);
                        } else {
                            protobufList.add(ByteString.copyFrom(bArr, iR12, i29));
                            iR12 += i29;
                        }
                    }
                    return iR12;
                }
                break;
            case 30:
            case 44:
                if (i13 == 2) {
                    iS = AbstractC1800h.n(bArr, i5, protobufList, c1797g);
                } else {
                    if (i13 != 0) {
                        return i5;
                    }
                    iS = AbstractC1800h.s(i11, bArr, i5, i10, protobufList, c1797g);
                }
                E1.k(obj, i12, protobufList, n(i14), null, this.f27712n);
                return iS;
            case 33:
            case 47:
                if (i13 == 2) {
                    return AbstractC1800h.l(bArr, i5, protobufList, c1797g);
                }
                if (i13 != 0) {
                    return i5;
                }
                G0 g03 = (G0) protobufList;
                int iR14 = AbstractC1800h.r(bArr, i5, c1797g);
                g03.addInt(CodedInputStream.decodeZigZag32(c1797g.f27677a));
                while (iR14 < i10) {
                    int iR15 = AbstractC1800h.r(bArr, iR14, c1797g);
                    if (i11 != c1797g.f27677a) {
                        return iR14;
                    }
                    iR14 = AbstractC1800h.r(bArr, iR15, c1797g);
                    g03.addInt(CodedInputStream.decodeZigZag32(c1797g.f27677a));
                }
                return iR14;
            case 34:
            case 48:
                if (i13 == 2) {
                    return AbstractC1800h.m(bArr, i5, protobufList, c1797g);
                }
                if (i13 != 0) {
                    return i5;
                }
                Y0 y05 = (Y0) protobufList;
                int iT3 = AbstractC1800h.t(bArr, i5, c1797g);
                y05.addLong(CodedInputStream.decodeZigZag64(c1797g.f27678b));
                while (iT3 < i10) {
                    int iR16 = AbstractC1800h.r(bArr, iT3, c1797g);
                    if (i11 != c1797g.f27677a) {
                        return iT3;
                    }
                    iT3 = AbstractC1800h.t(bArr, iR16, c1797g);
                    y05.addLong(CodedInputStream.decodeZigZag64(c1797g.f27678b));
                }
                return iT3;
            case 49:
                if (i13 == 3) {
                    D1 d1P = p(i14);
                    int i30 = (i11 & (-8)) | 4;
                    int iD = AbstractC1800h.d(d1P, bArr, i5, i10, i30, c1797g);
                    D1 d12 = d1P;
                    byte[] bArr2 = bArr;
                    protobufList.add(c1797g.f27679c);
                    while (iD < i10) {
                        int iR17 = AbstractC1800h.r(bArr2, iD, c1797g);
                        if (i11 != c1797g.f27677a) {
                            return iD;
                        }
                        byte[] bArr3 = bArr2;
                        D1 d13 = d12;
                        iD = AbstractC1800h.d(d13, bArr3, iR17, i10, i30, c1797g);
                        protobufList.add(c1797g.f27679c);
                        d12 = d13;
                        bArr2 = bArr3;
                    }
                    return iD;
                }
            default:
                return i5;
        }
        return i16;
    }

    public final void K(Object obj, long j8, B b5, D1 d12, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int tag;
        List listC = this.f27711m.c(j8, obj);
        if (WireFormat.getTagWireType(b5.f27517b) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i5 = b5.f27517b;
        do {
            Object objNewInstance = d12.newInstance();
            b5.b(objNewInstance, d12, extensionRegistryLite);
            d12.a(objNewInstance);
            listC.add(objNewInstance);
            CodedInputStream codedInputStream = b5.f27516a;
            if (codedInputStream.isAtEnd() || b5.f27519d != 0) {
                return;
            } else {
                tag = codedInputStream.readTag();
            }
        } while (tag == i5);
        b5.f27519d = tag;
    }

    public final void L(Object obj, int i5, B b5, D1 d12, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int tag;
        List listC = this.f27711m.c(i5 & 1048575, obj);
        if (WireFormat.getTagWireType(b5.f27517b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i10 = b5.f27517b;
        do {
            Object objNewInstance = d12.newInstance();
            b5.c(objNewInstance, d12, extensionRegistryLite);
            d12.a(objNewInstance);
            listC.add(objNewInstance);
            CodedInputStream codedInputStream = b5.f27516a;
            if (codedInputStream.isAtEnd() || b5.f27519d != 0) {
                return;
            } else {
                tag = codedInputStream.readTag();
            }
        } while (tag == i10);
        b5.f27519d = tag;
    }

    public final void M(int i5, B b5, Object obj) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((536870912 & i5) != 0) {
            b5.x(2);
            d2.q(obj, i5 & 1048575, b5.f27516a.readStringRequireUtf8());
        } else if (!this.f27706g) {
            d2.q(obj, i5 & 1048575, b5.e());
        } else {
            b5.x(2);
            d2.q(obj, i5 & 1048575, b5.f27516a.readString());
        }
    }

    public final void N(int i5, B b5, Object obj) throws IOException {
        boolean z2 = (536870912 & i5) != 0;
        W0 w02 = this.f27711m;
        if (z2) {
            b5.t(w02.c(i5 & 1048575, obj), true);
        } else {
            b5.t(w02.c(i5 & 1048575, obj), false);
        }
    }

    public final void P(int i5, Object obj) {
        int i10 = this.f27700a[i5 + 2];
        long j8 = 1048575 & i10;
        if (j8 == 1048575) {
            return;
        }
        d2.o(j8, obj, (1 << (i10 >>> 20)) | d2.f27664c.i(j8, obj));
    }

    public final void Q(int i5, int i10, Object obj) {
        d2.o(this.f27700a[i10 + 2] & 1048575, obj, i5);
    }

    public final int R(int i5, int i10) {
        int[] iArr = this.f27700a;
        int length = (iArr.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = iArr[i12];
            if (i5 == i13) {
                return i12;
            }
            if (i5 < i13) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    public final void S(int i5, Object obj, Object obj2) {
        f27699r.putObject(obj, V(i5) & 1048575, obj2);
        P(i5, obj);
    }

    public final void T(Object obj, int i5, int i10, Object obj2) {
        f27699r.putObject(obj, V(i10) & 1048575, obj2);
        Q(i5, i10, obj);
    }

    public final int V(int i5) {
        return this.f27700a[i5 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(com.google.protobuf.MessageLite r22, com.google.protobuf.q2 r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1811k1.W(com.google.protobuf.MessageLite, com.google.protobuf.q2):void");
    }

    public final void X(q2 q2Var, int i5, Object obj, int i10) throws IOException {
        if (obj != null) {
            Object objO = o(i10);
            this.f27714p.getClass();
            C1790d1 metadata = ((MapEntryLite) objO).getMetadata();
            MapFieldLite mapFieldLite = (MapFieldLite) obj;
            L l10 = (L) q2Var;
            CodedOutputStream codedOutputStream = l10.f27587a;
            if (!codedOutputStream.isSerializationDeterministic()) {
                Iterator it = mapFieldLite.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    codedOutputStream.writeTag(i5, 2);
                    codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, entry.getKey(), entry.getValue()));
                    MapEntryLite.writeTo(codedOutputStream, metadata, entry.getKey(), entry.getValue());
                }
                return;
            }
            int i11 = 0;
            switch (K.f27584a[metadata.f27658a.ordinal()]) {
                case 1:
                    Boolean bool = Boolean.FALSE;
                    V v2 = mapFieldLite.get(bool);
                    CodedOutputStream codedOutputStream2 = l10.f27587a;
                    if (v2 != 0) {
                        codedOutputStream2.writeTag(i5, 2);
                        codedOutputStream2.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, bool, v2));
                        MapEntryLite.writeTo(codedOutputStream2, metadata, bool, v2);
                    }
                    Boolean bool2 = Boolean.TRUE;
                    V v10 = mapFieldLite.get(bool2);
                    if (v10 != 0) {
                        codedOutputStream2.writeTag(i5, 2);
                        codedOutputStream2.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, bool2, v10));
                        MapEntryLite.writeTo(codedOutputStream2, metadata, bool2, v10);
                        return;
                    }
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    int size = mapFieldLite.size();
                    int[] iArr = new int[size];
                    Iterator it2 = mapFieldLite.keySet().iterator();
                    int i12 = 0;
                    while (it2.hasNext()) {
                        iArr[i12] = ((Integer) it2.next()).intValue();
                        i12++;
                    }
                    Arrays.sort(iArr);
                    while (i11 < size) {
                        int i13 = iArr[i11];
                        V v11 = mapFieldLite.get(Integer.valueOf(i13));
                        codedOutputStream.writeTag(i5, 2);
                        codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Integer.valueOf(i13), v11));
                        MapEntryLite.writeTo(codedOutputStream, metadata, Integer.valueOf(i13), v11);
                        i11++;
                    }
                    return;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    int size2 = mapFieldLite.size();
                    long[] jArr = new long[size2];
                    Iterator it3 = mapFieldLite.keySet().iterator();
                    int i14 = 0;
                    while (it3.hasNext()) {
                        jArr[i14] = ((Long) it3.next()).longValue();
                        i14++;
                    }
                    Arrays.sort(jArr);
                    while (i11 < size2) {
                        long j8 = jArr[i11];
                        V v12 = mapFieldLite.get(Long.valueOf(j8));
                        codedOutputStream.writeTag(i5, 2);
                        codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Long.valueOf(j8), v12));
                        MapEntryLite.writeTo(codedOutputStream, metadata, Long.valueOf(j8), v12);
                        i11++;
                    }
                    return;
                case 12:
                    int size3 = mapFieldLite.size();
                    String[] strArr = new String[size3];
                    Iterator it4 = mapFieldLite.keySet().iterator();
                    int i15 = 0;
                    while (it4.hasNext()) {
                        strArr[i15] = (String) it4.next();
                        i15++;
                    }
                    Arrays.sort(strArr);
                    while (i11 < size3) {
                        String str = strArr[i11];
                        V v13 = mapFieldLite.get(str);
                        codedOutputStream.writeTag(i5, 2);
                        codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, str, v13));
                        MapEntryLite.writeTo(codedOutputStream, metadata, str, v13);
                        i11++;
                    }
                    return;
                default:
                    throw new IllegalArgumentException("does not support key type: " + metadata.f27658a);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    @Override // com.google.protobuf.D1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = t(r9)
            if (r0 != 0) goto L8
            goto La5
        L8:
            boolean r0 = r9 instanceof com.google.protobuf.GeneratedMessageLite
            if (r0 == 0) goto L18
            r0 = r9
            com.google.protobuf.GeneratedMessageLite r0 = (com.google.protobuf.GeneratedMessageLite) r0
            r0.clearMemoizedSerializedSize()
            r0.clearMemoizedHashCode()
            r0.markImmutable()
        L18:
            int[] r0 = r8.f27700a
            int r1 = r0.length
            r2 = 0
        L1c:
            if (r2 >= r1) goto L84
            int r3 = r8.V(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r4 = (long) r4
            int r3 = U(r3)
            r6 = 9
            if (r3 == r6) goto L6e
            r6 = 60
            if (r3 == r6) goto L58
            r6 = 68
            if (r3 == r6) goto L58
            switch(r3) {
                case 17: goto L6e;
                case 18: goto L52;
                case 19: goto L52;
                case 20: goto L52;
                case 21: goto L52;
                case 22: goto L52;
                case 23: goto L52;
                case 24: goto L52;
                case 25: goto L52;
                case 26: goto L52;
                case 27: goto L52;
                case 28: goto L52;
                case 29: goto L52;
                case 30: goto L52;
                case 31: goto L52;
                case 32: goto L52;
                case 33: goto L52;
                case 34: goto L52;
                case 35: goto L52;
                case 36: goto L52;
                case 37: goto L52;
                case 38: goto L52;
                case 39: goto L52;
                case 40: goto L52;
                case 41: goto L52;
                case 42: goto L52;
                case 43: goto L52;
                case 44: goto L52;
                case 45: goto L52;
                case 46: goto L52;
                case 47: goto L52;
                case 48: goto L52;
                case 49: goto L52;
                case 50: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto L81
        L3b:
            sun.misc.Unsafe r3 = com.google.protobuf.C1811k1.f27699r
            java.lang.Object r6 = r3.getObject(r9, r4)
            if (r6 == 0) goto L81
            com.google.protobuf.e1 r7 = r8.f27714p
            r7.getClass()
            r7 = r6
            com.google.protobuf.MapFieldLite r7 = (com.google.protobuf.MapFieldLite) r7
            r7.makeImmutable()
            r3.putObject(r9, r4, r6)
            goto L81
        L52:
            com.google.protobuf.W0 r3 = r8.f27711m
            r3.a(r4, r9)
            goto L81
        L58:
            r3 = r0[r2]
            boolean r3 = r8.u(r3, r2, r9)
            if (r3 == 0) goto L81
            com.google.protobuf.D1 r3 = r8.p(r2)
            sun.misc.Unsafe r6 = com.google.protobuf.C1811k1.f27699r
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.a(r4)
            goto L81
        L6e:
            boolean r3 = r8.r(r2, r9)
            if (r3 == 0) goto L81
            com.google.protobuf.D1 r3 = r8.p(r2)
            sun.misc.Unsafe r6 = com.google.protobuf.C1811k1.f27699r
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.a(r4)
        L81:
            int r2 = r2 + 3
            goto L1c
        L84:
            com.google.protobuf.X1 r0 = r8.f27712n
            com.google.protobuf.Y1 r0 = (com.google.protobuf.Y1) r0
            r0.getClass()
            r0 = r9
            com.google.protobuf.GeneratedMessageLite r0 = (com.google.protobuf.GeneratedMessageLite) r0
            com.google.protobuf.UnknownFieldSetLite r0 = r0.unknownFields
            r0.makeImmutable()
            boolean r0 = r8.f27705f
            if (r0 == 0) goto La5
            com.google.protobuf.j0 r0 = r8.f27713o
            com.google.protobuf.l0 r0 = (com.google.protobuf.C1813l0) r0
            r0.getClass()
            com.google.protobuf.GeneratedMessageLite$ExtendableMessage r9 = (com.google.protobuf.GeneratedMessageLite.ExtendableMessage) r9
            com.google.protobuf.w0 r9 = r9.extensions
            r9.m()
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1811k1.a(java.lang.Object):void");
    }

    @Override // com.google.protobuf.D1
    public final boolean b(Object obj) {
        int i5;
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        loop0: while (true) {
            if (i14 >= this.f27709j) {
                if (this.f27705f) {
                    ((C1813l0) this.f27713o).getClass();
                    if (!((GeneratedMessageLite.ExtendableMessage) obj).extensions.j()) {
                        break;
                    }
                }
                return true;
            }
            int i15 = this.f27708i[i14];
            int[] iArr = this.f27700a;
            int i16 = iArr[i15];
            int iV = V(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f27699r.getInt(obj, i18);
                }
                i10 = i15;
                i11 = i13;
                i5 = i18;
            } else {
                int i20 = i13;
                i5 = i12;
                i10 = i15;
                i11 = i20;
            }
            if ((268435456 & iV) != 0 && !s(obj, i10, i5, i11, i19)) {
                break;
            }
            int iU = U(iV);
            if (iU == 9 || iU == 17) {
                if (s(obj, i10, i5, i11, i19)) {
                    if (!p(i10).b(d2.f27664c.k(iV & 1048575, obj))) {
                        break;
                    }
                } else {
                    continue;
                }
                i14++;
                i12 = i5;
                i13 = i11;
            } else {
                if (iU != 27) {
                    if (iU == 60 || iU == 68) {
                        if (u(i16, i10, obj)) {
                            if (!p(i10).b(d2.f27664c.k(iV & 1048575, obj))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                        i14++;
                        i12 = i5;
                        i13 = i11;
                    } else if (iU != 49) {
                        if (iU != 50) {
                            continue;
                        } else {
                            Object objK = d2.f27664c.k(iV & 1048575, obj);
                            this.f27714p.getClass();
                            MapFieldLite mapFieldLite = (MapFieldLite) objK;
                            if (!mapFieldLite.isEmpty() && ((MapEntryLite) o(i10)).getMetadata().f27660c.getJavaType() == WireFormat.JavaType.MESSAGE) {
                                D1 d1A = null;
                                for (Object obj2 : mapFieldLite.values()) {
                                    if (d1A == null) {
                                        d1A = C1846w1.f27770c.a(obj2.getClass());
                                    }
                                    if (!d1A.b(obj2)) {
                                        break loop0;
                                    }
                                }
                            }
                        }
                        i14++;
                        i12 = i5;
                        i13 = i11;
                    }
                }
                List list = (List) d2.f27664c.k(iV & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    D1 d1P = p(i10);
                    for (int i21 = 0; i21 < list.size(); i21++) {
                        if (!d1P.b(list.get(i21))) {
                            break loop0;
                        }
                    }
                }
                i14++;
                i12 = i5;
                i13 = i11;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.google.protobuf.D1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1811k1.c(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e7  */
    @Override // com.google.protobuf.D1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.google.protobuf.MessageLite r14, com.google.protobuf.q2 r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1811k1.d(com.google.protobuf.MessageLite, com.google.protobuf.q2):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01cc A[PHI: r12
  0x01cc: PHI (r12v60 sun.misc.Unsafe) = 
  (r12v27 sun.misc.Unsafe)
  (r12v28 sun.misc.Unsafe)
  (r12v29 sun.misc.Unsafe)
  (r12v33 sun.misc.Unsafe)
  (r12v35 sun.misc.Unsafe)
  (r12v36 sun.misc.Unsafe)
  (r12v37 sun.misc.Unsafe)
  (r12v40 sun.misc.Unsafe)
  (r12v42 sun.misc.Unsafe)
  (r12v61 sun.misc.Unsafe)
 binds: [B:248:0x05ab, B:244:0x058f, B:240:0x0573, B:212:0x04e2, B:193:0x0479, B:189:0x045e, B:185:0x0443, B:179:0x040c, B:174:0x03ee, B:88:0x01ca] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.D1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(com.google.protobuf.AbstractMessageLite r19) {
        /*
            Method dump skipped, instructions count: 2050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1811k1.e(com.google.protobuf.AbstractMessageLite):int");
    }

    @Override // com.google.protobuf.D1
    public final void f(Object obj, B b5, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        extensionRegistryLite.getClass();
        k(obj);
        v(this.f27712n, this.f27713o, obj, b5, extensionRegistryLite);
    }

    @Override // com.google.protobuf.D1
    public final void g(Object obj, byte[] bArr, int i5, int i10, C1797g c1797g) throws InvalidProtocolBufferException {
        H(obj, bArr, i5, i10, 0, c1797g);
    }

    @Override // com.google.protobuf.D1
    public final int h(GeneratedMessageLite generatedMessageLite) {
        int i5;
        int iHashLong;
        int[] iArr = this.f27700a;
        int length = iArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int iV = V(i11);
            int i12 = iArr[i11];
            long j8 = 1048575 & iV;
            int iHashCode = 37;
            switch (U(iV)) {
                case 0:
                    i5 = i10 * 53;
                    iHashLong = Internal.hashLong(Double.doubleToLongBits(d2.f27664c.g(j8, generatedMessageLite)));
                    i10 = iHashLong + i5;
                    break;
                case 1:
                    i5 = i10 * 53;
                    iHashLong = Float.floatToIntBits(d2.f27664c.h(j8, generatedMessageLite));
                    i10 = iHashLong + i5;
                    break;
                case 2:
                    i5 = i10 * 53;
                    iHashLong = Internal.hashLong(d2.f27664c.j(j8, generatedMessageLite));
                    i10 = iHashLong + i5;
                    break;
                case 3:
                    i5 = i10 * 53;
                    iHashLong = Internal.hashLong(d2.f27664c.j(j8, generatedMessageLite));
                    i10 = iHashLong + i5;
                    break;
                case 4:
                    i5 = i10 * 53;
                    iHashLong = d2.f27664c.i(j8, generatedMessageLite);
                    i10 = iHashLong + i5;
                    break;
                case 5:
                    i5 = i10 * 53;
                    iHashLong = Internal.hashLong(d2.f27664c.j(j8, generatedMessageLite));
                    i10 = iHashLong + i5;
                    break;
                case 6:
                    i5 = i10 * 53;
                    iHashLong = d2.f27664c.i(j8, generatedMessageLite);
                    i10 = iHashLong + i5;
                    break;
                case 7:
                    i5 = i10 * 53;
                    iHashLong = Internal.hashBoolean(d2.f27664c.e(j8, generatedMessageLite));
                    i10 = iHashLong + i5;
                    break;
                case 8:
                    i5 = i10 * 53;
                    iHashLong = ((String) d2.f27664c.k(j8, generatedMessageLite)).hashCode();
                    i10 = iHashLong + i5;
                    break;
                case 9:
                    Object objK = d2.f27664c.k(j8, generatedMessageLite);
                    if (objK != null) {
                        iHashCode = objK.hashCode();
                    }
                    i10 = (i10 * 53) + iHashCode;
                    break;
                case 10:
                    i5 = i10 * 53;
                    iHashLong = d2.f27664c.k(j8, generatedMessageLite).hashCode();
                    i10 = iHashLong + i5;
                    break;
                case 11:
                    i5 = i10 * 53;
                    iHashLong = d2.f27664c.i(j8, generatedMessageLite);
                    i10 = iHashLong + i5;
                    break;
                case 12:
                    i5 = i10 * 53;
                    iHashLong = d2.f27664c.i(j8, generatedMessageLite);
                    i10 = iHashLong + i5;
                    break;
                case 13:
                    i5 = i10 * 53;
                    iHashLong = d2.f27664c.i(j8, generatedMessageLite);
                    i10 = iHashLong + i5;
                    break;
                case 14:
                    i5 = i10 * 53;
                    iHashLong = Internal.hashLong(d2.f27664c.j(j8, generatedMessageLite));
                    i10 = iHashLong + i5;
                    break;
                case 15:
                    i5 = i10 * 53;
                    iHashLong = d2.f27664c.i(j8, generatedMessageLite);
                    i10 = iHashLong + i5;
                    break;
                case 16:
                    i5 = i10 * 53;
                    iHashLong = Internal.hashLong(d2.f27664c.j(j8, generatedMessageLite));
                    i10 = iHashLong + i5;
                    break;
                case 17:
                    Object objK2 = d2.f27664c.k(j8, generatedMessageLite);
                    if (objK2 != null) {
                        iHashCode = objK2.hashCode();
                    }
                    i10 = (i10 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i5 = i10 * 53;
                    iHashLong = d2.f27664c.k(j8, generatedMessageLite).hashCode();
                    i10 = iHashLong + i5;
                    break;
                case 50:
                    i5 = i10 * 53;
                    iHashLong = d2.f27664c.k(j8, generatedMessageLite).hashCode();
                    i10 = iHashLong + i5;
                    break;
                case 51:
                    if (u(i12, i11, generatedMessageLite)) {
                        i5 = i10 * 53;
                        iHashLong = Internal.hashLong(Double.doubleToLongBits(((Double) d2.f27664c.k(j8, generatedMessageLite)).doubleValue()));
                        i10 = iHashLong + i5;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (u(i12, i11, generatedMessageLite)) {
                        i5 = i10 * 53;
                        iHashLong = Float.floatToIntBits(((Float) d2.f27664c.k(j8, generatedMessageLite)).floatValue());
                        i10 = iHashLong + i5;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (u(i12, i11, generatedMessageLite)) {
                        i5 = i10 * 53;
                        iHashLong = Internal.hashLong(F(generatedMessageLite, j8));
                        i10 = iHashLong + i5;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (u(i12, i11, generatedMessageLite)) {
                        i5 = i10 * 53;
                        iHashLong = Internal.hashLong(F(generatedMessageLite, j8));
                        i10 = iHashLong + i5;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (u(i12, i11, generatedMessageLite)) {
                        i5 = i10 * 53;
                        iHashLong = E(generatedMessageLite, j8);
                        i10 = iHashLong + i5;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (u(i12, i11, generatedMessageLite)) {
                        i5 = i10 * 53;
                        iHashLong = Internal.hashLong(F(generatedMessageLite, j8));
                        i10 = iHashLong + i5;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (u(i12, i11, generatedMessageLite)) {
                        i5 = i10 * 53;
                        iHashLong = E(generatedMessageLite, j8);
                        i10 = iHashLong + i5;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (u(i12, i11, generatedMessageLite)) {
                        i5 = i10 * 53;
                        iHashLong = Internal.hashBoolean(((Boolean) d2.f27664c.k(j8, generatedMessageLite)).booleanValue());
                        i10 = iHashLong + i5;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (u(i12, i11, generatedMessageLite)) {
                        i5 = i10 * 53;
                        iHashLong = ((String) d2.f27664c.k(j8, generatedMessageLite)).hashCode();
                        i10 = iHashLong + i5;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (u(i12, i11, generatedMessageLite)) {
                        i5 = i10 * 53;
                        iHashLong = d2.f27664c.k(j8, generatedMessageLite).hashCode();
                        i10 = iHashLong + i5;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (u(i12, i11, generatedMessageLite)) {
                        i5 = i10 * 53;
                        iHashLong = d2.f27664c.k(j8, generatedMessageLite).hashCode();
                        i10 = iHashLong + i5;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (u(i12, i11, generatedMessageLite)) {
                        i5 = i10 * 53;
                        iHashLong = E(generatedMessageLite, j8);
                        i10 = iHashLong + i5;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (u(i12, i11, generatedMessageLite)) {
                        i5 = i10 * 53;
                        iHashLong = E(generatedMessageLite, j8);
                        i10 = iHashLong + i5;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (u(i12, i11, generatedMessageLite)) {
                        i5 = i10 * 53;
                        iHashLong = E(generatedMessageLite, j8);
                        i10 = iHashLong + i5;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (u(i12, i11, generatedMessageLite)) {
                        i5 = i10 * 53;
                        iHashLong = Internal.hashLong(F(generatedMessageLite, j8));
                        i10 = iHashLong + i5;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (u(i12, i11, generatedMessageLite)) {
                        i5 = i10 * 53;
                        iHashLong = E(generatedMessageLite, j8);
                        i10 = iHashLong + i5;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (u(i12, i11, generatedMessageLite)) {
                        i5 = i10 * 53;
                        iHashLong = Internal.hashLong(F(generatedMessageLite, j8));
                        i10 = iHashLong + i5;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (u(i12, i11, generatedMessageLite)) {
                        i5 = i10 * 53;
                        iHashLong = d2.f27664c.k(j8, generatedMessageLite).hashCode();
                        i10 = iHashLong + i5;
                        break;
                    } else {
                        break;
                    }
            }
        }
        ((Y1) this.f27712n).getClass();
        int iHashCode2 = generatedMessageLite.unknownFields.hashCode() + (i10 * 53);
        if (!this.f27705f) {
            return iHashCode2;
        }
        ((C1813l0) this.f27713o).getClass();
        return ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.f27767a.hashCode() + (iHashCode2 * 53);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // com.google.protobuf.D1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(com.google.protobuf.GeneratedMessageLite r12, com.google.protobuf.GeneratedMessageLite r13) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1811k1.i(com.google.protobuf.GeneratedMessageLite, com.google.protobuf.GeneratedMessageLite):boolean");
    }

    public final boolean j(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i5) {
        return r(i5, generatedMessageLite) == r(i5, generatedMessageLite2);
    }

    public final Object m(Object obj, int i5, Object obj2, X1 x12, Object obj3) {
        Internal.EnumVerifier enumVerifierN;
        int i10 = this.f27700a[i5];
        Object objK = d2.f27664c.k(V(i5) & 1048575, obj);
        if (objK == null || (enumVerifierN = n(i5)) == null) {
            return obj2;
        }
        this.f27714p.getClass();
        C1790d1 metadata = ((MapEntryLite) o(i5)).getMetadata();
        Iterator it = ((MapFieldLite) objK).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!enumVerifierN.isInRange(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = x12.a(obj3);
                }
                C1827q c1827qNewCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(metadata, entry.getKey(), entry.getValue()));
                try {
                    MapEntryLite.writeTo(c1827qNewCodedBuilder.f27735a, metadata, entry.getKey(), entry.getValue());
                    c1827qNewCodedBuilder.f27735a.checkNoSpaceLeft();
                    C1832s c1832s = new C1832s(c1827qNewCodedBuilder.f27736b);
                    ((Y1) x12).getClass();
                    ((UnknownFieldSetLite) obj2).storeField(WireFormat.makeTag(i10, 2), c1832s);
                    it.remove();
                } catch (IOException e7) {
                    throw new RuntimeException(e7);
                }
            }
        }
        return obj2;
    }

    public final Internal.EnumVerifier n(int i5) {
        return (Internal.EnumVerifier) this.f27701b[((i5 / 3) * 2) + 1];
    }

    @Override // com.google.protobuf.D1
    public final Object newInstance() {
        this.f27710l.getClass();
        return ((GeneratedMessageLite) this.f27704e).newMutableInstance();
    }

    public final Object o(int i5) {
        return this.f27701b[(i5 / 3) * 2];
    }

    public final D1 p(int i5) {
        int i10 = (i5 / 3) * 2;
        Object[] objArr = this.f27701b;
        D1 d12 = (D1) objArr[i10];
        if (d12 != null) {
            return d12;
        }
        D1 d1A = C1846w1.f27770c.a((Class) objArr[i10 + 1]);
        objArr[i10] = d1A;
        return d1A;
    }

    public final boolean r(int i5, Object obj) {
        int i10 = this.f27700a[i5 + 2];
        long j8 = i10 & 1048575;
        if (j8 == 1048575) {
            int iV = V(i5);
            long j10 = iV & 1048575;
            switch (U(iV)) {
                case 0:
                    if (Double.doubleToRawLongBits(d2.f27664c.g(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(d2.f27664c.h(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (d2.f27664c.j(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (d2.f27664c.j(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (d2.f27664c.i(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (d2.f27664c.j(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (d2.f27664c.i(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return d2.f27664c.e(j10, obj);
                case 8:
                    Object objK = d2.f27664c.k(j10, obj);
                    if (objK instanceof String) {
                        return !((String) objK).isEmpty();
                    }
                    if (objK instanceof ByteString) {
                        return !ByteString.EMPTY.equals(objK);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (d2.f27664c.k(j10, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !ByteString.EMPTY.equals(d2.f27664c.k(j10, obj));
                case 11:
                    if (d2.f27664c.i(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (d2.f27664c.i(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (d2.f27664c.i(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (d2.f27664c.j(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (d2.f27664c.i(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (d2.f27664c.j(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (d2.f27664c.k(j10, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & d2.f27664c.i(j8, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean s(Object obj, int i5, int i10, int i11, int i12) {
        return i10 == 1048575 ? r(i5, obj) : (i11 & i12) != 0;
    }

    public final boolean u(int i5, int i10, Object obj) {
        return d2.f27664c.i((long) (this.f27700a[i10 + 2] & 1048575), obj) == i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:269:0x0898 A[Catch: all -> 0x089f, TryCatch #43 {all -> 0x089f, blocks: (B:267:0x0893, B:269:0x0898, B:273:0x08a2), top: B:331:0x0893 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x08d7 A[LOOP:2: B:288:0x08d5->B:289:0x08d7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x08ea  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x08a8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(com.google.protobuf.X1 r20, com.google.protobuf.AbstractC1807j0 r21, java.lang.Object r22, com.google.protobuf.B r23, com.google.protobuf.ExtensionRegistryLite r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1811k1.v(com.google.protobuf.X1, com.google.protobuf.j0, java.lang.Object, com.google.protobuf.B, com.google.protobuf.ExtensionRegistryLite):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
    
        r10.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
    
        r0.popLimit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(java.lang.Object r9, int r10, java.lang.Object r11, com.google.protobuf.ExtensionRegistryLite r12, com.google.protobuf.B r13) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            r8 = this;
            int r10 = r8.V(r10)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            com.google.protobuf.c2 r10 = com.google.protobuf.d2.f27664c
            java.lang.Object r10 = r10.k(r0, r9)
            com.google.protobuf.e1 r2 = r8.f27714p
            if (r10 != 0) goto L22
            r2.getClass()
            com.google.protobuf.MapFieldLite r10 = com.google.protobuf.MapFieldLite.emptyMapField()
            com.google.protobuf.MapFieldLite r10 = r10.mutableCopy()
            com.google.protobuf.d2.q(r9, r0, r10)
            goto L3d
        L22:
            r2.getClass()
            r3 = r10
            com.google.protobuf.MapFieldLite r3 = (com.google.protobuf.MapFieldLite) r3
            boolean r3 = r3.isMutable()
            if (r3 != 0) goto L3d
            com.google.protobuf.MapFieldLite r3 = com.google.protobuf.MapFieldLite.emptyMapField()
            com.google.protobuf.MapFieldLite r3 = r3.mutableCopy()
            com.google.protobuf.C1793e1.a(r3, r10)
            com.google.protobuf.d2.q(r9, r0, r3)
            r10 = r3
        L3d:
            r2.getClass()
            com.google.protobuf.MapFieldLite r10 = (com.google.protobuf.MapFieldLite) r10
            com.google.protobuf.MapEntryLite r11 = (com.google.protobuf.MapEntryLite) r11
            com.google.protobuf.d1 r9 = r11.getMetadata()
            r11 = 2
            r13.x(r11)
            com.google.protobuf.CodedInputStream r0 = r13.f27516a
            int r1 = r0.readUInt32()
            int r1 = r0.pushLimit(r1)
            java.lang.Object r2 = r9.f27659b
            java.lang.Object r3 = r9.f27661d
            r4 = r3
        L5b:
            int r5 = r13.a()     // Catch: java.lang.Throwable -> L7f
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto La1
            boolean r6 = r0.isAtEnd()     // Catch: java.lang.Throwable -> L7f
            if (r6 == 0) goto L6b
            goto La1
        L6b:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L8c
            if (r5 == r11) goto L81
            boolean r5 = r13.y()     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
            if (r5 == 0) goto L79
            goto L5b
        L79:
            com.google.protobuf.InvalidProtocolBufferException r5 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
            throw r5     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
        L7f:
            r9 = move-exception
            goto La8
        L81:
            com.google.protobuf.WireFormat$FieldType r5 = r9.f27660c     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
            java.lang.Class r6 = r3.getClass()     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
            java.lang.Object r4 = r13.i(r5, r6, r12)     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
            goto L5b
        L8c:
            com.google.protobuf.WireFormat$FieldType r5 = r9.f27658a     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
            r6 = 0
            java.lang.Object r2 = r13.i(r5, r6, r6)     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
            goto L5b
        L94:
            boolean r5 = r13.y()     // Catch: java.lang.Throwable -> L7f
            if (r5 == 0) goto L9b
            goto L5b
        L9b:
            com.google.protobuf.InvalidProtocolBufferException r9 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L7f
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L7f
            throw r9     // Catch: java.lang.Throwable -> L7f
        La1:
            r10.put(r2, r4)     // Catch: java.lang.Throwable -> L7f
            r0.popLimit(r1)
            return
        La8:
            r0.popLimit(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1811k1.w(java.lang.Object, int, java.lang.Object, com.google.protobuf.ExtensionRegistryLite, com.google.protobuf.B):void");
    }

    public final void x(int i5, Object obj, Object obj2) {
        if (r(i5, obj2)) {
            long jV = V(i5) & 1048575;
            Unsafe unsafe = f27699r;
            Object object = unsafe.getObject(obj2, jV);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f27700a[i5] + " is present but null: " + obj2);
            }
            D1 d1P = p(i5);
            if (!r(i5, obj)) {
                if (t(object)) {
                    Object objNewInstance = d1P.newInstance();
                    d1P.c(objNewInstance, object);
                    unsafe.putObject(obj, jV, objNewInstance);
                } else {
                    unsafe.putObject(obj, jV, object);
                }
                P(i5, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jV);
            if (!t(object2)) {
                Object objNewInstance2 = d1P.newInstance();
                d1P.c(objNewInstance2, object2);
                unsafe.putObject(obj, jV, objNewInstance2);
                object2 = objNewInstance2;
            }
            d1P.c(object2, object);
        }
    }

    public final void y(int i5, Object obj, Object obj2) {
        int[] iArr = this.f27700a;
        int i10 = iArr[i5];
        if (u(i10, i5, obj2)) {
            long jV = V(i5) & 1048575;
            Unsafe unsafe = f27699r;
            Object object = unsafe.getObject(obj2, jV);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i5] + " is present but null: " + obj2);
            }
            D1 d1P = p(i5);
            if (!u(i10, i5, obj)) {
                if (t(object)) {
                    Object objNewInstance = d1P.newInstance();
                    d1P.c(objNewInstance, object);
                    unsafe.putObject(obj, jV, objNewInstance);
                } else {
                    unsafe.putObject(obj, jV, object);
                }
                Q(i10, i5, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jV);
            if (!t(object2)) {
                Object objNewInstance2 = d1P.newInstance();
                d1P.c(objNewInstance2, object2);
                unsafe.putObject(obj, jV, objNewInstance2);
                object2 = objNewInstance2;
            }
            d1P.c(object2, object);
        }
    }

    public final Object z(int i5, Object obj) {
        D1 d1P = p(i5);
        long jV = V(i5) & 1048575;
        if (!r(i5, obj)) {
            return d1P.newInstance();
        }
        Object object = f27699r.getObject(obj, jV);
        if (t(object)) {
            return object;
        }
        Object objNewInstance = d1P.newInstance();
        if (object != null) {
            d1P.c(objNewInstance, object);
        }
        return objNewInstance;
    }
}
