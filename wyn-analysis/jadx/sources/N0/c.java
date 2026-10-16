package N0;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class c extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7995a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i5) {
        super(str);
        this.f7995a = i5;
    }

    private final synchronized Throwable a() {
        return this;
    }

    private final synchronized Throwable b() {
        return this;
    }

    private final synchronized Throwable c() {
        return this;
    }

    private final synchronized Throwable d() {
        return this;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f7995a) {
            case 0:
                a();
                return this;
            case 1:
                b();
                return this;
            case 2:
            default:
                return super.fillInStackTrace();
            case 3:
                c();
                return this;
            case 4:
                d();
                return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String message) {
        super(message);
        this.f7995a = 2;
        AbstractC3340k.e(message, "message");
    }
}
