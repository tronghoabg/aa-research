package com.google.b.d.b;

import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class t {

    /* renamed from: a, reason: collision with root package name */
    int f7123a;

    /* renamed from: b, reason: collision with root package name */
    final int f7124b;

    /* renamed from: c, reason: collision with root package name */
    t f7125c;

    /* renamed from: d, reason: collision with root package name */
    final Map f7126d = new HashMap(0);

    t(int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException();
        }
        this.f7123a = i2;
        this.f7124b = i3;
        this.f7125c = null;
    }

    public final String toString() {
        return "Node" + System.identityHashCode(this);
    }
}
