package xd;

import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: xd.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4509a extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public final String f47878a;

    public C4509a(C4511c call) {
        AbstractC3340k.e(call, "call");
        this.f47878a = "Response already received: " + call;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f47878a;
    }
}
