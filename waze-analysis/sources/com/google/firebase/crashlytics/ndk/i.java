package com.google.firebase.crashlytics.ndk;

import com.google.firebase.crashlytics.a.e.be;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class i implements com.google.firebase.crashlytics.a.j {

    /* renamed from: a, reason: collision with root package name */
    private final h f9817a;

    i(h hVar) {
        this.f9817a = hVar;
    }

    @Override // com.google.firebase.crashlytics.a.j
    public final be a() {
        g gVar = this.f9817a.f9811a;
        if (gVar != null) {
            return gVar.f9810b;
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.a.j
    public final File b() {
        return this.f9817a.f9814d;
    }

    @Override // com.google.firebase.crashlytics.a.j
    public final File c() {
        return this.f9817a.f9815e;
    }

    @Override // com.google.firebase.crashlytics.a.j
    public final File d() {
        return this.f9817a.f9812b;
    }

    @Override // com.google.firebase.crashlytics.a.j
    public final File e() {
        return this.f9817a.f9811a.f9809a;
    }

    @Override // com.google.firebase.crashlytics.a.j
    public final File f() {
        return this.f9817a.f9816f;
    }

    @Override // com.google.firebase.crashlytics.a.j
    public final File g() {
        return this.f9817a.f9813c;
    }
}
