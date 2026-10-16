package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes3.dex */
final class zzick extends Writer {
    private final Appendable zza;
    private final zzicj zzb = new zzicj(null);

    public zzick(Appendable appendable) {
        this.zza = appendable;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) throws IOException {
        this.zza.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
    }

    @Override // java.io.Writer
    public final void write(int i5) throws IOException {
        this.zza.append((char) i5);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i5, int i10) throws IOException {
        Objects.requireNonNull(str);
        this.zza.append(str, i5, i10 + i5);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i5, int i10) throws IOException {
        this.zza.append(charSequence, i5, i10);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i5, int i10) throws IOException {
        append(charSequence, i5, i10);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i5, int i10) throws IOException {
        zzicj zzicjVar = this.zzb;
        zzicjVar.zza(cArr);
        this.zza.append(zzicjVar, i5, i10 + i5);
    }
}
