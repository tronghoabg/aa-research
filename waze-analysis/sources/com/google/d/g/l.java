package com.google.d.g;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class l implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    private final String f7885a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7886b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7887c;

    /* synthetic */ l(String str, int i2, String str2) {
        this.f7885a = str;
        this.f7886b = i2;
        this.f7887c = str2;
    }

    private Object readResolve() {
        return new m(this.f7885a, this.f7886b, this.f7887c);
    }
}
