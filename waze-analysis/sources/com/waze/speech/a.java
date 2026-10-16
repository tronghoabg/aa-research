package com.waze.speech;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.nio.channels.FileChannel;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.h.c.a f40428a;

    /* renamed from: b, reason: collision with root package name */
    private final ParcelFileDescriptor f40429b;

    /* renamed from: c, reason: collision with root package name */
    private final FileChannel f40430c;

    public /* synthetic */ a(com.waze.h.c.a aVar, ParcelFileDescriptor parcelFileDescriptor, FileChannel fileChannel) {
        this.f40428a = aVar;
        this.f40429b = parcelFileDescriptor;
        this.f40430c = fileChannel;
    }

    public final ParcelFileDescriptor a() {
        return this.f40429b;
    }

    public final com.waze.h.c.a b() {
        return this.f40428a;
    }

    public final FileChannel c() {
        return this.f40430c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            a aVar = this;
            this.f40429b.close();
        } catch (Throwable th) {
            e.b.c.a(th);
        }
        try {
            a aVar2 = this;
            this.f40430c.close();
        } catch (Throwable th2) {
            e.b.c.a(th2);
        }
    }
}
