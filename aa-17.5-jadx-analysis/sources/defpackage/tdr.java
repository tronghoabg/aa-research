package defpackage;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;

/* loaded from: classes.dex */
public final class tdr implements AutoCloseable {
    public final FileDescriptor a;

    public tdr() throws ErrnoException {
        FileDescriptor fileDescriptorMemfd_create = Os.memfd_create("temp.arsc", 0);
        fileDescriptorMemfd_create.getClass();
        this.a = fileDescriptorMemfd_create;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws ErrnoException {
        Os.close(this.a);
    }
}
