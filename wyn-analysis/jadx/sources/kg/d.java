package kg;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.UUID;

/* loaded from: classes5.dex */
public abstract class d extends c {
    private final Serializable tag;

    public d(InputStream inputStream) {
        super(inputStream);
        this.tag = UUID.randomUUID();
    }

    @Override // kg.c
    public void handleIOException(IOException iOException) throws IOException {
        throw new gg.e(iOException, this.tag);
    }

    public boolean isCauseOf(Throwable th) {
        Serializable serializable = this.tag;
        int i5 = gg.e.f35918b;
        return serializable != null && (th instanceof gg.e) && serializable.equals(((gg.e) th).f35919a);
    }

    public void throwIfCauseOf(Throwable th) throws IOException {
        Serializable serializable = this.tag;
        int i5 = gg.e.f35918b;
        if (serializable != null && (th instanceof gg.e) && serializable.equals(((gg.e) th).f35919a)) {
            throw ((gg.e) th).getCause();
        }
    }
}
