package com.moloco.sdk;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public final class E0 implements Internal.ListAdapter.Converter {
    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public final Object convert(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        J0 j02 = iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? null : J0.LEVEL_PLAY : J0.MAX : J0.UNKNOWN;
        return j02 == null ? J0.UNRECOGNIZED : j02;
    }
}
