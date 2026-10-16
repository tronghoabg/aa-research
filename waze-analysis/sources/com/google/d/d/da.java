package com.google.d.d;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class da implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public static final da f7527a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ da[] f7528b;

    static {
        da daVar = new da();
        f7527a = daVar;
        f7528b = new da[]{daVar};
    }

    private da() {
    }

    public static da[] values() {
        return (da[]) f7528b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        fo.ag(false);
    }
}
