package com.waze.sound.c;

import h.g.b.x;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final File f39585a;

    /* renamed from: b, reason: collision with root package name */
    private final RandomAccessFile f39586b;

    public a(File file) throws Exception {
        x.f(file, "cacheDir");
        File fileCreateTempFile = File.createTempFile("opus_temp", ".ogg", file);
        x.e(fileCreateTempFile, "createTempFile(...)");
        this.f39585a = fileCreateTempFile;
        try {
            this.f39586b = new RandomAccessFile(fileCreateTempFile, "rw");
        } catch (Exception e2) {
            this.f39585a.delete();
            throw e2;
        }
    }

    @Override // com.waze.sound.c.d
    public final FileDescriptor a() throws IOException {
        FileDescriptor fd = this.f39586b.getFD();
        x.e(fd, "getFD(...)");
        return fd;
    }

    @Override // com.waze.sound.c.d
    public final byte[] b() throws IOException {
        RandomAccessFile randomAccessFile = this.f39586b;
        randomAccessFile.seek(0L);
        byte[] bArr = new byte[(int) randomAccessFile.length()];
        randomAccessFile.readFully(bArr);
        return bArr;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        try {
            a aVar = this;
            this.f39586b.close();
        } catch (Throwable th) {
            e.b.c.a(th);
        }
        try {
            a aVar2 = this;
            this.f39585a.delete();
        } catch (Throwable th2) {
            e.b.c.a(th2);
        }
    }
}
