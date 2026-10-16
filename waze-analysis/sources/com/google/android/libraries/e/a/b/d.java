package com.google.android.libraries.e.a.b;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final Closeable f5832a;

    private d(Closeable closeable) {
        this.f5832a = closeable;
    }

    public static d a(Closeable closeable) {
        return new d(closeable);
    }

    public final Closeable b() {
        return this.f5832a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Closeable closeable = this.f5832a;
        if (closeable != null) {
            closeable.close();
        }
    }
}
