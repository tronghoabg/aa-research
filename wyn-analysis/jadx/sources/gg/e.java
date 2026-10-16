package gg;

import java.io.IOException;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class e extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f35918b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Serializable f35919a;

    public e(IOException iOException, Serializable serializable) {
        super(iOException.getMessage(), iOException);
        this.f35919a = serializable;
    }

    @Override // java.lang.Throwable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized IOException getCause() {
        return (IOException) super.getCause();
    }
}
