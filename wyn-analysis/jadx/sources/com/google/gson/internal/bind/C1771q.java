package com.google.gson.internal.bind;

import java.lang.reflect.Field;
import ra.C3962a;

/* renamed from: com.google.gson.internal.bind.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1771q extends AbstractC1770p {

    /* renamed from: b, reason: collision with root package name */
    public final na.m f27486b;

    public C1771q(na.m mVar, r rVar) {
        super(rVar);
        this.f27486b = mVar;
    }

    @Override // com.google.gson.internal.bind.AbstractC1770p
    public final Object d() {
        return this.f27486b.d();
    }

    @Override // com.google.gson.internal.bind.AbstractC1770p
    public final Object e(Object obj) {
        return obj;
    }

    @Override // com.google.gson.internal.bind.AbstractC1770p
    public final void f(Object obj, C3962a c3962a, C1769o c1769o) throws IllegalAccessException, IllegalArgumentException {
        Object objB = c1769o.f27482f.b(c3962a);
        if (objB == null && c1769o.f27483g) {
            return;
        }
        Field field = c1769o.f27478b;
        if (c1769o.f27484h) {
            throw new la.p(R8.v.f("Cannot set value of 'static final' ", pa.c.d(field, false)), 13);
        }
        field.set(obj, objB);
    }
}
