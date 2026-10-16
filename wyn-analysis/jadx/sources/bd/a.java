package Bd;

import java.net.ConnectException;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class a extends ConnectException {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f1668a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String message, Throwable th) {
        super(message);
        AbstractC3340k.e(message, "message");
        this.f1668a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f1668a;
    }
}
