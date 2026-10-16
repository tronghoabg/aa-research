package com.google.d.d;

import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aq extends as {
    static final as g(int i2) {
        return i2 < 0 ? as.f7437b : i2 > 0 ? as.f7438c : as.f7436a;
    }

    @Override // com.google.d.d.as
    public final int a() {
        return 0;
    }

    @Override // com.google.d.d.as
    public final as b(int i2, int i3) {
        return g(Integer.compare(i2, i3));
    }

    @Override // com.google.d.d.as
    public final as c(long j2, long j3) {
        return g(Long.compare(j2, j3));
    }

    @Override // com.google.d.d.as
    public final as d(Object obj, Object obj2, Comparator comparator) {
        return g(comparator.compare(obj, obj2));
    }

    @Override // com.google.d.d.as
    public final as e(boolean z, boolean z2) {
        return g(Boolean.compare(z, z2));
    }

    @Override // com.google.d.d.as
    public final as f(boolean z, boolean z2) {
        return g(Boolean.compare(z2, z));
    }
}
