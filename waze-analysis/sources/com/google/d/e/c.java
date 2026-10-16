package com.google.d.e;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f7665a = new b();

    static char[] a() {
        return (char[]) Objects.requireNonNull((char[]) f7665a.get());
    }
}
