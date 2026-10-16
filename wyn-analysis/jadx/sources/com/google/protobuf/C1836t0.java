package com.google.protobuf;

import com.google.protobuf.Internal;
import ka.AbstractC3256n;

/* renamed from: com.google.protobuf.t0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1836t0 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Field f27742a;

    /* renamed from: b, reason: collision with root package name */
    public final FieldType f27743b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27744c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Field f27745d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27746e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27747f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27748g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.reflect.Field f27749h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f27750i;

    /* renamed from: j, reason: collision with root package name */
    public final Internal.EnumVerifier f27751j;

    public C1836t0(java.lang.reflect.Field field, int i5, FieldType fieldType, java.lang.reflect.Field field2, int i10, boolean z2, boolean z10, Object obj, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field3) {
        this.f27742a = field;
        this.f27743b = fieldType;
        this.f27744c = i5;
        this.f27745d = field2;
        this.f27746e = i10;
        this.f27747f = z2;
        this.f27748g = z10;
        this.f27750i = obj;
        this.f27751j = enumVerifier;
        this.f27749h = field3;
    }

    public static void a(int i5) {
        if (i5 <= 0) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "fieldNumber must be positive: "));
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f27744c - ((C1836t0) obj).f27744c;
    }
}
