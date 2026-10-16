package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class teo implements java.lang.AutoCloseable {
    public final java.io.FileDescriptor a;

    public teo() {
        java.io.FileDescriptor fileDescriptorM = bgp$.ExternalSyntheticApiModelOutline0.m("temp.arsc", 0);
        fileDescriptorM.getClass();
        this.a = fileDescriptorM;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws android.system.ErrnoException {
        android.system.Os.close(this.a);
    }
}
