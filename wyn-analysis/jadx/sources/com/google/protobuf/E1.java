package com.google.protobuf;

import com.google.protobuf.Internal;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public abstract class E1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f27550a;

    /* renamed from: b, reason: collision with root package name */
    public static final X1 f27551b;

    /* renamed from: c, reason: collision with root package name */
    public static final Y1 f27552c;

    static {
        Class<?> cls;
        Class<?> cls2;
        X1 x12 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f27550a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                x12 = (X1) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        f27551b = x12;
        f27552c = new Y1();
    }

    public static void A(int i5, List list, q2 q2Var, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((L) q2Var).f27587a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                codedOutputStream.writeSFixed64(i5, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        codedOutputStream.writeTag(i5, 2);
        int iComputeSFixed64SizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeSFixed64SizeNoTag += CodedOutputStream.computeSFixed64SizeNoTag(((Long) list.get(i11)).longValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeSFixed64SizeNoTag);
        while (i10 < list.size()) {
            codedOutputStream.writeSFixed64NoTag(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void B(int i5, List list, q2 q2Var, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((L) q2Var).f27587a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                codedOutputStream.writeSInt32(i5, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        codedOutputStream.writeTag(i5, 2);
        int iComputeSInt32SizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(((Integer) list.get(i11)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeSInt32SizeNoTag);
        while (i10 < list.size()) {
            codedOutputStream.writeSInt32NoTag(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void C(int i5, List list, q2 q2Var, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((L) q2Var).f27587a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                codedOutputStream.writeSInt64(i5, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        codedOutputStream.writeTag(i5, 2);
        int iComputeSInt64SizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(((Long) list.get(i11)).longValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeSInt64SizeNoTag);
        while (i10 < list.size()) {
            codedOutputStream.writeSInt64NoTag(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void D(int i5, List list, q2 q2Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        L l10 = (L) q2Var;
        l10.getClass();
        boolean z2 = list instanceof LazyStringList;
        CodedOutputStream codedOutputStream = l10.f27587a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                codedOutputStream.writeString(i5, (String) list.get(i10));
                i10++;
            }
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        while (i10 < list.size()) {
            Object raw = lazyStringList.getRaw(i10);
            if (raw instanceof String) {
                codedOutputStream.writeString(i5, (String) raw);
            } else {
                codedOutputStream.writeBytes(i5, (ByteString) raw);
            }
            i10++;
        }
    }

    public static void E(int i5, List list, q2 q2Var, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((L) q2Var).f27587a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                codedOutputStream.writeUInt32(i5, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        codedOutputStream.writeTag(i5, 2);
        int iComputeUInt32SizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(((Integer) list.get(i11)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeUInt32SizeNoTag);
        while (i10 < list.size()) {
            codedOutputStream.writeUInt32NoTag(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void F(int i5, List list, q2 q2Var, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((L) q2Var).f27587a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                codedOutputStream.writeUInt64(i5, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        codedOutputStream.writeTag(i5, 2);
        int iComputeUInt64SizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(((Long) list.get(i11)).longValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeUInt64SizeNoTag);
        while (i10 < list.size()) {
            codedOutputStream.writeUInt64NoTag(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static int a(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof G0)) {
            int iComputeEnumSizeNoTag = 0;
            while (i5 < size) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return iComputeEnumSizeNoTag;
        }
        G0 g02 = (G0) list;
        int iComputeEnumSizeNoTag2 = 0;
        while (i5 < size) {
            iComputeEnumSizeNoTag2 += CodedOutputStream.computeEnumSizeNoTag(g02.getInt(i5));
            i5++;
        }
        return iComputeEnumSizeNoTag2;
    }

    public static int b(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.computeFixed32Size(i5, 0) * size;
    }

    public static int c(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.computeFixed64Size(i5, 0L) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof G0)) {
            int iComputeInt32SizeNoTag = 0;
            while (i5 < size) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return iComputeInt32SizeNoTag;
        }
        G0 g02 = (G0) list;
        int iComputeInt32SizeNoTag2 = 0;
        while (i5 < size) {
            iComputeInt32SizeNoTag2 += CodedOutputStream.computeInt32SizeNoTag(g02.getInt(i5));
            i5++;
        }
        return iComputeInt32SizeNoTag2;
    }

    public static int e(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof Y0)) {
            int iComputeInt64SizeNoTag = 0;
            while (i5 < size) {
                iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(((Long) list.get(i5)).longValue());
                i5++;
            }
            return iComputeInt64SizeNoTag;
        }
        Y0 y02 = (Y0) list;
        int iComputeInt64SizeNoTag2 = 0;
        while (i5 < size) {
            iComputeInt64SizeNoTag2 += CodedOutputStream.computeInt64SizeNoTag(y02.getLong(i5));
            i5++;
        }
        return iComputeInt64SizeNoTag2;
    }

    public static int f(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof G0)) {
            int iComputeSInt32SizeNoTag = 0;
            while (i5 < size) {
                iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return iComputeSInt32SizeNoTag;
        }
        G0 g02 = (G0) list;
        int iComputeSInt32SizeNoTag2 = 0;
        while (i5 < size) {
            iComputeSInt32SizeNoTag2 += CodedOutputStream.computeSInt32SizeNoTag(g02.getInt(i5));
            i5++;
        }
        return iComputeSInt32SizeNoTag2;
    }

    public static int g(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof Y0)) {
            int iComputeSInt64SizeNoTag = 0;
            while (i5 < size) {
                iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(((Long) list.get(i5)).longValue());
                i5++;
            }
            return iComputeSInt64SizeNoTag;
        }
        Y0 y02 = (Y0) list;
        int iComputeSInt64SizeNoTag2 = 0;
        while (i5 < size) {
            iComputeSInt64SizeNoTag2 += CodedOutputStream.computeSInt64SizeNoTag(y02.getLong(i5));
            i5++;
        }
        return iComputeSInt64SizeNoTag2;
    }

    public static int h(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof G0)) {
            int iComputeUInt32SizeNoTag = 0;
            while (i5 < size) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return iComputeUInt32SizeNoTag;
        }
        G0 g02 = (G0) list;
        int iComputeUInt32SizeNoTag2 = 0;
        while (i5 < size) {
            iComputeUInt32SizeNoTag2 += CodedOutputStream.computeUInt32SizeNoTag(g02.getInt(i5));
            i5++;
        }
        return iComputeUInt32SizeNoTag2;
    }

    public static int i(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof Y0)) {
            int iComputeUInt64SizeNoTag = 0;
            while (i5 < size) {
                iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(((Long) list.get(i5)).longValue());
                i5++;
            }
            return iComputeUInt64SizeNoTag;
        }
        Y0 y02 = (Y0) list;
        int iComputeUInt64SizeNoTag2 = 0;
        while (i5 < size) {
            iComputeUInt64SizeNoTag2 += CodedOutputStream.computeUInt64SizeNoTag(y02.getLong(i5));
            i5++;
        }
        return iComputeUInt64SizeNoTag2;
    }

    public static Object j(Object obj, int i5, AbstractList abstractList, Internal.EnumLiteMap enumLiteMap, Object obj2, X1 x12) {
        if (enumLiteMap == null) {
            return obj2;
        }
        int size = abstractList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Integer num = (Integer) abstractList.get(i11);
            int iIntValue = num.intValue();
            if (enumLiteMap.findValueByNumber(iIntValue) != null) {
                if (i11 != i10) {
                    abstractList.set(i10, num);
                }
                i10++;
            } else {
                obj2 = n(obj, i5, iIntValue, obj2, x12);
            }
        }
        if (i10 != size) {
            abstractList.subList(i10, size).clear();
        }
        return obj2;
    }

    public static Object k(Object obj, int i5, List list, Internal.EnumVerifier enumVerifier, Object obj2, X1 x12) {
        if (enumVerifier == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!enumVerifier.isInRange(iIntValue)) {
                    obj2 = n(obj, i5, iIntValue, obj2, x12);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Integer num = (Integer) list.get(i11);
            int iIntValue2 = num.intValue();
            if (enumVerifier.isInRange(iIntValue2)) {
                if (i11 != i10) {
                    list.set(i10, num);
                }
                i10++;
            } else {
                obj2 = n(obj, i5, iIntValue2, obj2, x12);
            }
        }
        if (i10 != size) {
            list.subList(i10, size).clear();
        }
        return obj2;
    }

    public static void l(X1 x12, Object obj, Object obj2) {
        ((Y1) x12).getClass();
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLiteMutableCopyOf = generatedMessageLite.unknownFields;
        UnknownFieldSetLite unknownFieldSetLite = ((GeneratedMessageLite) obj2).unknownFields;
        if (!UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite)) {
            unknownFieldSetLiteMutableCopyOf = UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLiteMutableCopyOf) ? UnknownFieldSetLite.mutableCopyOf(unknownFieldSetLiteMutableCopyOf, unknownFieldSetLite) : unknownFieldSetLiteMutableCopyOf.mergeFrom(unknownFieldSetLite);
        }
        generatedMessageLite.unknownFields = unknownFieldSetLiteMutableCopyOf;
    }

    public static boolean m(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object n(Object obj, int i5, int i10, Object obj2, X1 x12) {
        if (obj2 == null) {
            obj2 = x12.a(obj);
        }
        ((Y1) x12).getClass();
        ((UnknownFieldSetLite) obj2).storeField(WireFormat.makeTag(i5, 0), Long.valueOf(i10));
        return obj2;
    }

    public static void o(int i5, List list, q2 q2Var, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((L) q2Var).f27587a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                codedOutputStream.writeBool(i5, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        codedOutputStream.writeTag(i5, 2);
        int iComputeBoolSizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeBoolSizeNoTag += CodedOutputStream.computeBoolSizeNoTag(((Boolean) list.get(i11)).booleanValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeBoolSizeNoTag);
        while (i10 < list.size()) {
            codedOutputStream.writeBoolNoTag(((Boolean) list.get(i10)).booleanValue());
            i10++;
        }
    }

    public static void p(int i5, List list, q2 q2Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        L l10 = (L) q2Var;
        l10.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            l10.f27587a.writeBytes(i5, (ByteString) list.get(i10));
        }
    }

    public static void q(int i5, List list, q2 q2Var, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((L) q2Var).f27587a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                codedOutputStream.writeDouble(i5, ((Double) list.get(i10)).doubleValue());
                i10++;
            }
            return;
        }
        codedOutputStream.writeTag(i5, 2);
        int iComputeDoubleSizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeDoubleSizeNoTag += CodedOutputStream.computeDoubleSizeNoTag(((Double) list.get(i11)).doubleValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeDoubleSizeNoTag);
        while (i10 < list.size()) {
            codedOutputStream.writeDoubleNoTag(((Double) list.get(i10)).doubleValue());
            i10++;
        }
    }

    public static void r(int i5, List list, q2 q2Var, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((L) q2Var).f27587a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                codedOutputStream.writeEnum(i5, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        codedOutputStream.writeTag(i5, 2);
        int iComputeEnumSizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(((Integer) list.get(i11)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeEnumSizeNoTag);
        while (i10 < list.size()) {
            codedOutputStream.writeEnumNoTag(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void s(int i5, List list, q2 q2Var, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((L) q2Var).f27587a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                codedOutputStream.writeFixed32(i5, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        codedOutputStream.writeTag(i5, 2);
        int iComputeFixed32SizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeFixed32SizeNoTag += CodedOutputStream.computeFixed32SizeNoTag(((Integer) list.get(i11)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeFixed32SizeNoTag);
        while (i10 < list.size()) {
            codedOutputStream.writeFixed32NoTag(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void t(int i5, List list, q2 q2Var, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((L) q2Var).f27587a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                codedOutputStream.writeFixed64(i5, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        codedOutputStream.writeTag(i5, 2);
        int iComputeFixed64SizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeFixed64SizeNoTag += CodedOutputStream.computeFixed64SizeNoTag(((Long) list.get(i11)).longValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeFixed64SizeNoTag);
        while (i10 < list.size()) {
            codedOutputStream.writeFixed64NoTag(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void u(int i5, List list, q2 q2Var, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((L) q2Var).f27587a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                codedOutputStream.writeFloat(i5, ((Float) list.get(i10)).floatValue());
                i10++;
            }
            return;
        }
        codedOutputStream.writeTag(i5, 2);
        int iComputeFloatSizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeFloatSizeNoTag += CodedOutputStream.computeFloatSizeNoTag(((Float) list.get(i11)).floatValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeFloatSizeNoTag);
        while (i10 < list.size()) {
            codedOutputStream.writeFloatNoTag(((Float) list.get(i10)).floatValue());
            i10++;
        }
    }

    public static void v(int i5, List list, q2 q2Var, D1 d12) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        L l10 = (L) q2Var;
        l10.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            l10.d(i5, list.get(i10), d12);
        }
    }

    public static void w(int i5, List list, q2 q2Var, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((L) q2Var).f27587a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                codedOutputStream.writeInt32(i5, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        codedOutputStream.writeTag(i5, 2);
        int iComputeInt32SizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(((Integer) list.get(i11)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeInt32SizeNoTag);
        while (i10 < list.size()) {
            codedOutputStream.writeInt32NoTag(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void x(int i5, List list, q2 q2Var, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((L) q2Var).f27587a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                codedOutputStream.writeInt64(i5, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        codedOutputStream.writeTag(i5, 2);
        int iComputeInt64SizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(((Long) list.get(i11)).longValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeInt64SizeNoTag);
        while (i10 < list.size()) {
            codedOutputStream.writeInt64NoTag(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void y(int i5, List list, q2 q2Var, D1 d12) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        L l10 = (L) q2Var;
        l10.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            l10.g(i5, list.get(i10), d12);
        }
    }

    public static void z(int i5, List list, q2 q2Var, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((L) q2Var).f27587a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                codedOutputStream.writeSFixed32(i5, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        codedOutputStream.writeTag(i5, 2);
        int iComputeSFixed32SizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeSFixed32SizeNoTag += CodedOutputStream.computeSFixed32SizeNoTag(((Integer) list.get(i11)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeSFixed32SizeNoTag);
        while (i10 < list.size()) {
            codedOutputStream.writeSFixed32NoTag(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }
}
