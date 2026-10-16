package la;

import com.google.gson.internal.bind.C1760f;
import com.google.gson.internal.bind.Y;
import java.io.IOException;
import java.io.StringWriter;
import ra.C3963b;

/* loaded from: classes4.dex */
public abstract class o {
    public boolean a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final r b() {
        if (this instanceof r) {
            return (r) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public String c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C3963b c3963b = new C3963b(stringWriter);
            c3963b.f44708h = 1;
            Y.f27443z.getClass();
            C1760f.e(c3963b, this);
            return stringWriter.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }
}
