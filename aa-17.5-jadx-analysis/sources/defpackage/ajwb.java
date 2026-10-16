package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes2.dex */
public final class ajwb implements ajqp {
    private final Log a = LogFactory.getLog(getClass());
    private final Map b = new ConcurrentHashMap();

    protected static final ajpe d(ajpe ajpeVar) throws ajta {
        int i;
        if (ajpeVar.c <= 0) {
            try {
                ahgm.e(ajpeVar, "HTTP host");
                String str = ajpeVar.d;
                if (str.equalsIgnoreCase("http")) {
                    i = 80;
                } else {
                    if (!str.equalsIgnoreCase("https")) {
                        throw new ajta(String.valueOf(str).concat(" protocol is not supported"));
                    }
                    i = 443;
                }
                return new ajpe(ajpeVar.a, i, str);
            } catch (ajta unused) {
            }
        }
        return ajpeVar;
    }

    @Override // defpackage.ajqp
    public final ajpy a(ajpe ajpeVar) throws IOException {
        byte[] bArr = (byte[]) this.b.get(d(ajpeVar));
        if (bArr == null) {
            return null;
        }
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
            ajpy ajpyVar = (ajpy) objectInputStream.readObject();
            objectInputStream.close();
            return ajpyVar;
        } catch (IOException e) {
            Log log = this.a;
            if (!log.isWarnEnabled()) {
                return null;
            }
            log.warn("Unexpected I/O error while de-serializing auth scheme", e);
            return null;
        } catch (ClassNotFoundException e2) {
            Log log2 = this.a;
            if (!log2.isWarnEnabled()) {
                return null;
            }
            log2.warn("Unexpected error while de-serializing auth scheme", e2);
            return null;
        }
    }

    @Override // defpackage.ajqp
    public final void b(ajpe ajpeVar, ajpy ajpyVar) throws IOException {
        ahgm.e(ajpeVar, "HTTP host");
        if (!(ajpyVar instanceof Serializable)) {
            Log log = this.a;
            if (log.isDebugEnabled()) {
                log.debug("Auth scheme " + String.valueOf(ajpyVar.getClass()) + " is not serializable");
                return;
            }
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(ajpyVar);
            objectOutputStream.close();
            this.b.put(d(ajpeVar), byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            Log log2 = this.a;
            if (log2.isWarnEnabled()) {
                log2.warn("Unexpected I/O error while serializing auth scheme", e);
            }
        }
    }

    @Override // defpackage.ajqp
    public final void c(ajpe ajpeVar) {
        ahgm.e(ajpeVar, "HTTP host");
        this.b.remove(d(ajpeVar));
    }

    public final String toString() {
        return this.b.toString();
    }
}
