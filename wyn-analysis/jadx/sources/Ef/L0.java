package Ef;

import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class L0 extends CancellationException implements InterfaceC0518y {

    /* renamed from: a, reason: collision with root package name */
    public final transient M0 f3685a;

    public L0(String str, M0 m02) {
        super(str);
        this.f3685a = m02;
    }

    @Override // Ef.InterfaceC0518y
    public final Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        L0 l02 = new L0(message, this.f3685a);
        l02.initCause(this);
        return l02;
    }
}
