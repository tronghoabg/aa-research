package com.google.android.datatransport.runtime.backends;

import com.google.d.d.fo;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private Object f4158a;

    /* renamed from: b, reason: collision with root package name */
    private Object f4159b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    public final d a() {
        ?? r0 = this.f4158a;
        if (r0 != 0) {
            return new d(r0, (byte[]) this.f4159b);
        }
        throw new IllegalStateException("Missing required properties: events");
    }

    public final void b(Iterable iterable) {
        this.f4158a = iterable;
    }

    public final void c(byte[] bArr) {
        this.f4159b = bArr;
    }

    public final void d(List list) {
        OutputStream outputStream = (OutputStream) fo.Q(list);
        if (outputStream instanceof com.google.android.libraries.e.a.b.a.b) {
            this.f4158a = (com.google.android.libraries.e.a.b.a.b) outputStream;
            this.f4159b = (OutputStream) list.get(0);
        }
    }

    public final void e() throws IOException {
        if (this.f4158a == null) {
            throw new com.google.android.libraries.e.a.b.e("Cannot sync underlying stream");
        }
        ((OutputStream) this.f4159b).flush();
        ((com.google.android.libraries.e.a.b.a.b) this.f4158a).b();
    }
}
