package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzauu extends zzimk implements Closeable {
    static {
        zzimr.zzb(zzauu.class);
    }

    public zzauu(zziml zzimlVar, zzaut zzautVar) throws IOException {
        zzd(zzimlVar, zzimlVar.zzb(), zzautVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimk, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzimk
    public final String toString() {
        String string = this.zzc.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 7);
        sb2.append("model(");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }
}
