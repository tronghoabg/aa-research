package com.google.protobuf;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class H1 extends androidx.datastore.preferences.protobuf.i0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F1 f27573c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H1(F1 f1) {
        super(1, f1);
        this.f27573c = f1;
    }

    @Override // androidx.datastore.preferences.protobuf.i0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new G1(this.f27573c);
    }
}
