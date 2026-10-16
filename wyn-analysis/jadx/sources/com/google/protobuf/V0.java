package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.List;

/* loaded from: classes4.dex */
public final class V0 extends W0 {
    @Override // com.google.protobuf.W0
    public final void a(long j8, Object obj) {
        ((Internal.ProtobufList) d2.f27664c.k(j8, obj)).makeImmutable();
    }

    @Override // com.google.protobuf.W0
    public final void b(Object obj, long j8, Object obj2) {
        c2 c2Var = d2.f27664c;
        Internal.ProtobufList protobufListMutableCopyWithCapacity = (Internal.ProtobufList) c2Var.k(j8, obj);
        Internal.ProtobufList protobufList = (Internal.ProtobufList) c2Var.k(j8, obj2);
        int size = protobufListMutableCopyWithCapacity.size();
        int size2 = protobufList.size();
        if (size > 0 && size2 > 0) {
            if (!protobufListMutableCopyWithCapacity.isModifiable()) {
                protobufListMutableCopyWithCapacity = protobufListMutableCopyWithCapacity.mutableCopyWithCapacity(size2 + size);
            }
            protobufListMutableCopyWithCapacity.addAll(protobufList);
        }
        if (size > 0) {
            protobufList = protobufListMutableCopyWithCapacity;
        }
        d2.q(obj, j8, protobufList);
    }

    @Override // com.google.protobuf.W0
    public final List c(long j8, Object obj) {
        Internal.ProtobufList protobufList = (Internal.ProtobufList) d2.f27664c.k(j8, obj);
        if (protobufList.isModifiable()) {
            return protobufList;
        }
        int size = protobufList.size();
        Internal.ProtobufList protobufListMutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        d2.q(obj, j8, protobufListMutableCopyWithCapacity);
        return protobufListMutableCopyWithCapacity;
    }
}
