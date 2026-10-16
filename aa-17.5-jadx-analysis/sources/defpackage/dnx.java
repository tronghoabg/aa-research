package defpackage;

/* loaded from: classes2.dex */
final class dnx extends Throwable {
    public dnx(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
