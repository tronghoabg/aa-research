package com.google.protobuf;

import com.google.protobuf.Internal;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class U0 extends W0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f27628c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(long j8, Object obj, int i5) {
        List list = (List) d2.f27664c.k(j8, obj);
        if (list.isEmpty()) {
            List lazyStringArrayList = list instanceof LazyStringList ? new LazyStringArrayList(i5) : ((list instanceof InterfaceC1843v1) && (list instanceof Internal.ProtobufList)) ? ((Internal.ProtobufList) list).mutableCopyWithCapacity(i5) : new ArrayList(i5);
            d2.q(obj, j8, lazyStringArrayList);
            return lazyStringArrayList;
        }
        if (f27628c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i5);
            arrayList.addAll(list);
            d2.q(obj, j8, arrayList);
            return arrayList;
        }
        if (list instanceof UnmodifiableLazyStringList) {
            LazyStringArrayList lazyStringArrayList2 = new LazyStringArrayList(list.size() + i5);
            lazyStringArrayList2.addAll((UnmodifiableLazyStringList) list);
            d2.q(obj, j8, lazyStringArrayList2);
            return lazyStringArrayList2;
        }
        if ((list instanceof InterfaceC1843v1) && (list instanceof Internal.ProtobufList)) {
            Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
            if (!protobufList.isModifiable()) {
                Internal.ProtobufList protobufListMutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(list.size() + i5);
                d2.q(obj, j8, protobufListMutableCopyWithCapacity);
                return protobufListMutableCopyWithCapacity;
            }
        }
        return list;
    }

    @Override // com.google.protobuf.W0
    public final void a(long j8, Object obj) {
        Object objUnmodifiableList;
        List list = (List) d2.f27664c.k(j8, obj);
        if (list instanceof LazyStringList) {
            objUnmodifiableList = ((LazyStringList) list).getUnmodifiableView();
        } else {
            if (f27628c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC1843v1) && (list instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                if (protobufList.isModifiable()) {
                    protobufList.makeImmutable();
                    return;
                }
                return;
            }
            objUnmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        d2.q(obj, j8, objUnmodifiableList);
    }

    @Override // com.google.protobuf.W0
    public final void b(Object obj, long j8, Object obj2) {
        List list = (List) d2.f27664c.k(j8, obj2);
        List listD = d(j8, obj, list.size());
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        d2.q(obj, j8, list);
    }

    @Override // com.google.protobuf.W0
    public final List c(long j8, Object obj) {
        return d(j8, obj, 10);
    }
}
