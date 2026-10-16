package com.google.e.a.i.a;

import com.google.e.a.z;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d implements z {

    /* renamed from: a, reason: collision with root package name */
    private final List f8601a;

    /* renamed from: b, reason: collision with root package name */
    private final z f8602b;

    public d(List list, z zVar) {
        this.f8601a = list;
        this.f8602b = zVar;
    }

    @Override // com.google.e.a.z
    public final InputStream a(InputStream inputStream, byte[] bArr) {
        return new c(this.f8601a, inputStream, bArr);
    }

    @Override // com.google.e.a.z
    public final OutputStream b(OutputStream outputStream, byte[] bArr) {
        return this.f8602b.b(outputStream, bArr);
    }
}
