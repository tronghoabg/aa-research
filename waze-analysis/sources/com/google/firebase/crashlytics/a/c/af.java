package com.google.firebase.crashlytics.a.c;

import java.io.File;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class af {

    /* renamed from: a, reason: collision with root package name */
    private final String f9103a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.a.f.c f9104b;

    public af(String str, com.google.firebase.crashlytics.a.f.c cVar) {
        this.f9103a = str;
        this.f9104b = cVar;
    }

    private final File d() {
        return this.f9104b.a(this.f9103a);
    }

    public final boolean a() {
        return d().exists();
    }

    public final boolean b() {
        return d().delete();
    }

    public final void c() throws IOException {
        try {
            d().createNewFile();
        } catch (IOException e2) {
            com.google.firebase.crashlytics.a.i.a().e("Error creating marker: ".concat(this.f9103a), e2);
        }
    }
}
