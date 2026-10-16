package com.google.firebase.d.b;

import j$.util.Objects;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b implements com.google.firebase.d.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f9821a;

    b(d dVar) {
        Objects.requireNonNull(dVar);
        this.f9821a = dVar;
    }

    @Override // com.google.firebase.d.a
    public final String a(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            b(obj, stringWriter);
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // com.google.firebase.d.a
    public final void b(Object obj, Writer writer) throws IOException {
        d dVar = this.f9821a;
        e eVar = new e(writer, dVar.f9828f, dVar.f9829g, dVar.f9830h, dVar.f9831i);
        eVar.o(obj);
        eVar.h();
    }
}
