package com.google.d.l;

import j$.util.Objects;
import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    static final String f7973a;

    /* renamed from: b, reason: collision with root package name */
    static final Comparator f7974b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        h hVar;
        String strConcat = String.valueOf(i.class.getName()).concat("$UnsafeComparator");
        f7973a = strConcat;
        try {
            g gVar = ((g[]) Objects.requireNonNull((g[]) Class.forName(strConcat).asSubclass(g.class).getEnumConstants()))[0];
            boolean zA = gVar.a();
            hVar = gVar;
            if (!zA) {
                hVar = h.f7971a;
            }
        } catch (Throwable unused) {
            hVar = h.f7971a;
        }
        f7974b = hVar;
    }

    private i() {
    }
}
