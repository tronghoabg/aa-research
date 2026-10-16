package Td;

import java.nio.charset.MalformedInputException;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class a extends MalformedInputException {

    /* renamed from: a, reason: collision with root package name */
    public final String f11832a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String message) {
        super(0);
        AbstractC3340k.e(message, "message");
        this.f11832a = message;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    public final String getMessage() {
        return this.f11832a;
    }
}
