package defpackage;

import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class admf {
    public final adme a;
    public final String b;
    public final String c;
    public final admd d;
    public final admd e;
    public final boolean f;

    public admf(adme admeVar, String str, admd admdVar, admd admdVar2, boolean z) {
        new AtomicReferenceArray(2);
        admeVar.getClass();
        this.a = admeVar;
        str.getClass();
        this.b = str;
        int iLastIndexOf = str.lastIndexOf(47);
        this.c = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
        admdVar.getClass();
        this.d = admdVar;
        admdVar2.getClass();
        this.e = admdVar2;
        this.f = z;
    }

    public static String b(String str, String str2) {
        str.getClass();
        str2.getClass();
        return str + "/" + str2;
    }

    public static xh c() {
        xh xhVar = new xh();
        xhVar.e = null;
        xhVar.c = null;
        return xhVar;
    }

    public final InputStream a(Object obj) {
        return this.d.a(obj);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("fullMethodName", this.b);
        xxgVarAo.b(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, this.a);
        xxgVarAo.h("idempotent", false);
        xxgVarAo.h("safe", false);
        xxgVarAo.h("sampledToLocalTracing", this.f);
        xxgVarAo.b("requestMarshaller", this.d);
        xxgVarAo.b("responseMarshaller", this.e);
        xxgVarAo.b("schemaDescriptor", null);
        xxgVarAo.c();
        return xxgVarAo.toString();
    }
}
