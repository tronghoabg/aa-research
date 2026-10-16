package com.google.l.b;

import j$.util.Objects;
import java.io.IOException;
import java.io.Writer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ab extends Writer {

    /* renamed from: a, reason: collision with root package name */
    private final Appendable f12332a;

    /* renamed from: b, reason: collision with root package name */
    private final aa f12333b = new aa();

    ab(Appendable appendable) {
        this.f12332a = appendable;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) throws IOException {
        this.f12332a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i2, int i3) throws IOException {
        aa aaVar = this.f12333b;
        aaVar.a(cArr);
        this.f12332a.append(aaVar, i2, i3 + i2);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i2, int i3) throws IOException {
        this.f12332a.append(charSequence, i2, i3);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i2, int i3) throws IOException {
        append(charSequence, i2, i3);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i2, int i3) throws IOException {
        Objects.requireNonNull(str);
        this.f12332a.append(str, i2, i3 + i2);
    }

    @Override // java.io.Writer
    public final void write(int i2) throws IOException {
        this.f12332a.append((char) i2);
    }
}
