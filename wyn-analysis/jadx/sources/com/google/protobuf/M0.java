package com.google.protobuf;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public final class M0 implements Internal.MapAdapter.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Internal.EnumLiteMap f27592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Internal.EnumLite f27593b;

    public M0(Internal.EnumLiteMap enumLiteMap, Internal.EnumLite enumLite) {
        this.f27592a = enumLiteMap;
        this.f27593b = enumLite;
    }

    @Override // com.google.protobuf.Internal.MapAdapter.Converter
    public final Object doBackward(Object obj) {
        return Integer.valueOf(((Internal.EnumLite) obj).getNumber());
    }

    @Override // com.google.protobuf.Internal.MapAdapter.Converter
    public final Object doForward(Object obj) {
        Internal.EnumLite enumLiteFindValueByNumber = this.f27592a.findValueByNumber(((Integer) obj).intValue());
        return enumLiteFindValueByNumber == null ? this.f27593b : enumLiteFindValueByNumber;
    }
}
