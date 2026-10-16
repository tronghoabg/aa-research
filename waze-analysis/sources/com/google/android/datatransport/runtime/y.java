package com.google.android.datatransport.runtime;

import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class y implements com.google.android.datatransport.h {

    /* renamed from: a, reason: collision with root package name */
    private final Set f4370a;

    /* renamed from: b, reason: collision with root package name */
    private final x f4371b;

    /* renamed from: c, reason: collision with root package name */
    private final ab f4372c;

    y(Set set, x xVar, ab abVar) {
        this.f4370a = set;
        this.f4371b = xVar;
        this.f4372c = abVar;
    }

    @Override // com.google.android.datatransport.h
    public final com.google.android.datatransport.g a(String str, com.google.android.datatransport.a aVar, com.google.android.datatransport.f fVar) {
        Set set = this.f4370a;
        if (set.contains(aVar)) {
            return new aa(this.f4371b, str, aVar, fVar, this.f4372c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", aVar, set));
    }
}
