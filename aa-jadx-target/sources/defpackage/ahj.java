package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ahj extends java.util.concurrent.CancellationException {
    public ahj() {
        super("Mutation interrupted");
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(defpackage.ahk.a);
        return this;
    }
}
