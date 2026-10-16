package com.waze.sound.c;

import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import h.g.b.x;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    private final FileDescriptor f39587a;

    public b() throws ErrnoException {
        UUID uuidRandomUUID = UUID.randomUUID();
        Objects.toString(uuidRandomUUID);
        FileDescriptor fileDescriptorMemfd_create = Os.memfd_create("opus_mem_".concat(String.valueOf(uuidRandomUUID)), 0);
        x.e(fileDescriptorMemfd_create, "memfd_create(...)");
        this.f39587a = fileDescriptorMemfd_create;
    }

    @Override // com.waze.sound.c.d
    public final FileDescriptor a() {
        return this.f39587a;
    }

    @Override // com.waze.sound.c.d
    public final byte[] b() throws IOException, ErrnoException {
        int i2 = OsConstants.SEEK_SET;
        FileDescriptor fileDescriptor = this.f39587a;
        Os.lseek(fileDescriptor, 0L, i2);
        FileInputStream fileInputStream = new FileInputStream(fileDescriptor);
        try {
            byte[] bArrAX = h.a.i.aX(fileInputStream);
            h.a.i.aW(fileInputStream, null);
            return bArrAX;
        } finally {
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        try {
            b bVar = this;
            Os.close(this.f39587a);
        } catch (Throwable th) {
            e.b.c.a(th);
        }
    }
}
