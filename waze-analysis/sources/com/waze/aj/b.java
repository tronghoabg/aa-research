package com.waze.aj;

import com.waze.google_assistant.al;
import com.waze.modules.c.de;
import com.waze.native_managers.WazeNativeLooperDispatcher;
import com.waze.native_managers.d;
import com.waze.shared_infra.i.e;
import e.b.c;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import h.i;
import h.m;
import h.n.o;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;
import l.a.aad;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class b {
    public /* synthetic */ b(byte[] bArr) {
    }

    public static k a(Object obj, Object obj2, e eVar, p pVar) {
        x.f(eVar, "logger");
        x.f(pVar, "grpcCall");
        if (obj2 != null) {
            return ai.E(new a(pVar, obj2, obj, eVar, null));
        }
        IllegalStateException illegalStateException = new IllegalStateException("gRPC stub is not available.");
        eVar.c("grpc initiation error", illegalStateException);
        return ai.G(m.d(c.a(illegalStateException)));
    }

    public static /* synthetic */ aad b(al alVar) {
        int iOrdinal = alVar.ordinal();
        if (iOrdinal == 0) {
            return aad.GOOGLE_ASSISTANT_ONBOARDING_TRIGGERING_FLOW_STARTUP;
        }
        if (iOrdinal == 1) {
            return aad.GOOGLE_ASSISTANT_ONBOARDING_TRIGGERING_FLOW_SETTINGS;
        }
        if (iOrdinal == 2) {
            return aad.GOOGLE_ASSISTANT_ONBOARDING_TRIGGERING_FLOW_MIC;
        }
        throw new i();
    }

    public static void c(WazeNativeLooperDispatcher wazeNativeLooperDispatcher, h.g.a.a aVar, l lVar) {
        x.f(wazeNativeLooperDispatcher, "<this>");
        x.f(aVar, "invocation");
        WazeNativeLooperDispatcher.f(wazeNativeLooperDispatcher, new com.google.firebase.appcheck.debug.a.a(aVar, lVar, 5, null), null, 6);
    }

    public static int d(d dVar) {
        x.f(dVar, "<this>");
        return dVar.a();
    }

    public static de e(String str) {
        de deVar;
        de[] deVarArrValues = de.values();
        int length = deVarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                deVar = null;
                break;
            }
            deVar = deVarArrValues[i2];
            if (o.m(deVar.a(), str, true)) {
                break;
            }
            i2++;
        }
        return deVar == null ? de.f30053a : deVar;
    }

    private b() {
        throw null;
    }

    public /* synthetic */ b(byte[] bArr, byte[] bArr2) {
    }
}
