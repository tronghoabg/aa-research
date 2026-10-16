package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes2.dex */
public abstract class ajwf implements Closeable, ajqy {
    private final Log log = LogFactory.getLog(getClass());

    private static ajpe determineTarget(ajrt ajrtVar) throws ajqu {
        URI uriT = ajrtVar.t();
        if (!uriT.isAbsolute()) {
            return null;
        }
        ajpe ajpeVarE = ajsi.e(uriT);
        if (ajpeVarE != null) {
            return ajpeVarE;
        }
        throw new ajqu("URI does not specify a valid host name: ".concat(String.valueOf(String.valueOf(uriT))));
    }

    protected abstract ajrn doExecute(ajpe ajpeVar, ajph ajphVar, akba akbaVar) throws IOException;

    public <T> T execute(ajpe ajpeVar, ajph ajphVar, ajrg<? extends T> ajrgVar, akba akbaVar) throws IOException {
        ahgm.e(ajrgVar, "Response handler");
        ajrn ajrnVarExecute = execute(ajpeVar, ajphVar, akbaVar);
        try {
            try {
                T t = (T) ajrgVar.a();
                ahkt.a(ajrnVarExecute.a());
                return t;
            } catch (ajqu e) {
                try {
                    ahkt.a(ajrnVarExecute.a());
                } catch (Exception e2) {
                    this.log.warn("Error consuming content after an exception.", e2);
                }
                throw e;
            }
        } finally {
            ajrnVarExecute.close();
        }
    }

    public ajrn execute(ajpe ajpeVar, ajph ajphVar) throws IOException {
        return doExecute(ajpeVar, ajphVar, null);
    }

    public <T> T execute(ajpe ajpeVar, ajph ajphVar, ajrg<? extends T> ajrgVar) throws IOException {
        return (T) execute(ajpeVar, ajphVar, ajrgVar, null);
    }

    public ajrn execute(ajpe ajpeVar, ajph ajphVar, akba akbaVar) throws IOException {
        return doExecute(ajpeVar, ajphVar, akbaVar);
    }

    @Override // defpackage.ajqy
    public ajrn execute(ajrt ajrtVar) throws IOException {
        return execute(ajrtVar, (akba) null);
    }

    public <T> T execute(ajrt ajrtVar, ajrg<? extends T> ajrgVar) throws IOException {
        return (T) execute(ajrtVar, ajrgVar, (akba) null);
    }

    public <T> T execute(ajrt ajrtVar, ajrg<? extends T> ajrgVar, akba akbaVar) throws IOException {
        return (T) execute(determineTarget(ajrtVar), ajrtVar, ajrgVar, akbaVar);
    }

    public ajrn execute(ajrt ajrtVar, akba akbaVar) throws IOException {
        ahgm.e(ajrtVar, "HTTP request");
        return doExecute(determineTarget(ajrtVar), ajrtVar, akbaVar);
    }
}
