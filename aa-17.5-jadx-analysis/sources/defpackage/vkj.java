package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* loaded from: classes3.dex */
public final class vkj implements pxc {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;
    private final Object d;

    public vkj(CronetEngine cronetEngine, tmb tmbVar, Executor executor, int i) {
        this.a = i;
        this.b = cronetEngine;
        this.c = tmbVar;
        this.d = executor;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, tmb] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, tmb] */
    @Override // defpackage.pxc
    public final pxb a(abow abowVar, pwh pwhVar, pwp pwpVar) {
        if (this.a != 0) {
            return new puj((pug) this.c, abowVar, pwhVar, pwpVar, new pvn(this.d));
        }
        if (!uzt.MAPS_MOBILE_SDKS.equals(pwpVar.j)) {
            return new vkg();
        }
        return new vki(this.c, (CronetEngine) this.b, this.d, pwhVar);
    }

    public vkj(pug pugVar, ackk ackkVar, tmb tmbVar, int i) {
        this.a = i;
        this.c = pugVar;
        this.b = ackkVar;
        this.d = tmbVar;
    }

    @Override // defpackage.pxc
    public final /* synthetic */ void b() {
    }
}
