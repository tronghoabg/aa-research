package com.google.d.d;

import j$.util.Objects;
import java.util.ListIterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class r extends p implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ s f7655d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(s sVar, int i2) {
        super(sVar, sVar.d().listIterator(i2));
        Objects.requireNonNull(sVar);
        this.f7655d = sVar;
    }

    private final ListIterator b() {
        a();
        return (ListIterator) this.f7647a;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        s sVar = this.f7655d;
        boolean zIsEmpty = sVar.isEmpty();
        b().add(obj);
        sVar.f7656f.f7658b++;
        if (zIsEmpty) {
            sVar.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(s sVar) {
        super(sVar);
        Objects.requireNonNull(sVar);
        this.f7655d = sVar;
    }
}
