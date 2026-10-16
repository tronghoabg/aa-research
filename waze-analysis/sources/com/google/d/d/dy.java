package com.google.d.d;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class dy extends ea {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator f7552a;

    dy(Comparator comparator) {
        this.f7552a = comparator;
    }

    @Override // com.google.d.d.ea
    final Map a() {
        return new TreeMap(this.f7552a);
    }
}
