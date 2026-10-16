package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class ahgc {
    public static Object a(Object obj) throws CloneNotSupportedException {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Cloneable)) {
            throw new CloneNotSupportedException();
        }
        try {
            try {
                return obj.getClass().getMethod("clone", null).invoke(obj, null);
            } catch (IllegalAccessException e) {
                throw new IllegalAccessError(e.getMessage());
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof CloneNotSupportedException) {
                    throw ((CloneNotSupportedException) cause);
                }
                throw new Error("Unexpected exception", cause);
            }
        } catch (NoSuchMethodException e3) {
            throw new NoSuchMethodError(e3.getMessage());
        }
    }

    public static final ajrt b(String str, Charset charset, ajpt ajptVar, URI uri, akal akalVar, ajpb ajpbVar, List list) {
        ajrm ajrvVar;
        if (uri == null) {
            uri = URI.create("/");
        }
        if (list != null && !list.isEmpty()) {
            if (ajpbVar == null && ("POST".equalsIgnoreCase(str) || "PUT".equalsIgnoreCase(str))) {
                if (charset == null) {
                    charset = akaz.a;
                }
                ajpbVar = new ajvb(ajsj.e(list, charset != null ? charset : akaz.a), ajuz.a("application/x-www-form-urlencoded", charset));
            } else {
                try {
                    ajsg ajsgVar = new ajsg(uri);
                    ajsgVar.k = charset;
                    if (ajsgVar.j == null) {
                        ajsgVar.j = new ArrayList();
                    }
                    ajsgVar.j.addAll(list);
                    ajsgVar.i = null;
                    ajsgVar.b = null;
                    uri = ajsgVar.a();
                } catch (URISyntaxException unused) {
                }
            }
        }
        if (ajpbVar == null) {
            ajrvVar = new ajrv(str);
        } else {
            ajru ajruVar = new ajru(str);
            ((ajrp) ajruVar).c = ajpbVar;
            ajrvVar = ajruVar;
        }
        ajrvVar.a = ajptVar;
        ajrvVar.b = uri;
        ajrvVar.i(akalVar.d());
        return ajrvVar;
    }
}
