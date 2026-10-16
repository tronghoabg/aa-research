package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class teo implements java.lang.AutoCloseable {
    public final java.io.FileDescriptor a;

    public teo() throws android.system.ErrnoException {
        java.io.FileDescriptor fileDescriptorMemfd_create = android.system.Os.memfd_create("temp.arsc", 0);
        fileDescriptorMemfd_create.getClass();
        this.a = fileDescriptorMemfd_create;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws android.system.ErrnoException {
        android.system.Os.close(this.a);
    }
}
