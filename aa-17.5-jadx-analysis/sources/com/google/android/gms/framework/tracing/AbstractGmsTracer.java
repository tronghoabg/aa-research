package com.google.android.gms.framework.tracing;

import com.google.android.gms.framework.tracing.AbstractGmsTracer;
import defpackage.abnj;
import defpackage.abnv;
import defpackage.abon;
import defpackage.rju;
import defpackage.spn;
import defpackage.srl;
import defpackage.srn;
import defpackage.srp;
import defpackage.woy;
import defpackage.xtm;
import defpackage.xts;
import defpackage.xty;
import defpackage.xue;
import defpackage.xuj;
import defpackage.xul;
import defpackage.xyf;
import defpackage.ype;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class AbstractGmsTracer {
    public static final /* synthetic */ int a = 0;
    private static final spn b = spn.c("AbstractGmsTracer");

    static {
        new AtomicBoolean(true);
        new AtomicBoolean(true);
        new ConcurrentHashMap(10);
    }

    public static Closeable beginTraceInternalUsingReflection(String str, byte[] bArr, boolean z, Class<?> cls) {
        srl srlVar;
        if (bArr != null) {
            try {
                srlVar = (srl) abnv.B(srl.a, bArr, abnj.a());
            } catch (abon e) {
                ((ype) ((ype) ((ype) b.g()).p(e)).ai((char) 8980)).u("Invalid GCoreClientInfo bytes.");
            }
        } else {
            srlVar = null;
        }
        boolean z2 = false;
        boolean z3 = cls != null && srn.class.isAssignableFrom(cls);
        boolean zD = xts.d();
        if (zD && (xts.b() instanceof xtm)) {
            z2 = true;
        }
        if (zD && !z2) {
            return woy.aw(str, srp.a(srlVar, z3), true);
        }
        xue xueVarA = srp.a(srlVar, z3);
        rju rjuVar = (rju) ((xyf) srp.a).a;
        if (!z2) {
            return rjuVar.q(str, xueVarA);
        }
        final xty xtyVarA = xts.a(null);
        final xuj xujVarQ = rjuVar.q(str, xueVarA);
        return new xul() { // from class: srm
            @Override // defpackage.xul, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                int i = AbstractGmsTracer.a;
                xujVarQ.close();
                xts.a(xtyVarA);
            }
        };
    }

    private static Closeable beginTraceInternalUsingReflection(String str, byte[] bArr, boolean z) {
        return beginTraceInternalUsingReflection(str, bArr, z, null);
    }
}
