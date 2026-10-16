package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class csd extends java.util.concurrent.CancellationException {
    public csd(java.lang.String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(defpackage.cse.a);
        return this;
    }
}
