package defpackage;

/* loaded from: classes.dex */
public final class h4 extends IllegalStateException {
    public final /* synthetic */ int a;
    public Exception b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4(String str, int i) {
        super(str);
        this.a = i;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        switch (this.a) {
        }
        return this.b;
    }
}
