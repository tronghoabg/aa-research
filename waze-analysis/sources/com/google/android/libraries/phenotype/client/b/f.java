package com.google.android.libraries.phenotype.client.b;

import com.google.v.z;
import java.io.Closeable;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final Inflater f5972a = new Inflater(true);

    private f() {
    }

    public static f a() {
        return new f();
    }

    public final Object c(z zVar) {
        try {
            return h.d(z.X(new InflaterInputStream(new e(this, zVar), this.f5972a, 4096)));
        } finally {
            this.f5972a.reset();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5972a.end();
    }

    public final Object d(byte[] bArr) {
        this.f5972a.setInput(bArr);
        try {
            return h.d(z.X(new d(this)));
        } finally {
            this.f5972a.reset();
        }
    }
}
