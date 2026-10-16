package J9;

import android.app.Application;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final Application f5885a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5886b;

    public I(Application application, String str) {
        this.f5885a = application;
        this.f5886b = str;
    }

    public final Se.k a(Parser parser) {
        return new Se.k(new B8.c(4, this, parser));
    }
}
