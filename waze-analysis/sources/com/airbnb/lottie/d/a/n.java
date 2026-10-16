package com.airbnb.lottie.d.a;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class n implements m {

    /* renamed from: a, reason: collision with root package name */
    final List f2116a;

    n(List list) {
        this.f2116a = list;
    }

    @Override // com.airbnb.lottie.d.a.m
    public final List b() {
        return this.f2116a;
    }

    @Override // com.airbnb.lottie.d.a.m
    public final boolean c() {
        List list = this.f2116a;
        if (list.isEmpty()) {
            return true;
        }
        return list.size() == 1 && ((com.airbnb.lottie.h.a) list.get(0)).j();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.f2116a;
        if (!list.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(list.toArray()));
        }
        return sb.toString();
    }
}
