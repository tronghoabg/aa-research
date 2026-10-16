package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLException;

/* loaded from: classes2.dex */
public final class ajwj implements ajqz {
    private final Set a;

    static {
        new ajwj();
    }

    public ajwj() {
        List listAsList = Arrays.asList(InterruptedIOException.class, UnknownHostException.class, ConnectException.class, NoRouteToHostException.class, SSLException.class);
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        hashSet.addAll(listAsList);
    }

    @Override // defpackage.ajqz
    public final boolean a(IOException iOException, int i, akba akbaVar) {
        Boolean bool;
        ahgm.e(akbaVar, "HTTP context");
        if (i > 3) {
            return false;
        }
        Set set = this.a;
        if (set.contains(iOException.getClass())) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((Class) it.next()).isInstance(iOException)) {
                return false;
            }
        }
        ajrw ajrwVarG = ajrw.g(akbaVar);
        ajph ajphVar = (ajph) ajrwVarG.j("http.request", ajph.class);
        ajph ajphVar2 = ajphVar instanceof ajww ? ((ajww) ajphVar).a : ajphVar;
        if ((ajphVar2 instanceof ajrt) && ((ajrt) ajphVar2).r()) {
            return false;
        }
        return ((ajphVar instanceof ajpc) && (bool = (Boolean) ajrwVarG.j("http.request_sent", Boolean.class)) != null && bool.booleanValue()) ? false : true;
    }
}
