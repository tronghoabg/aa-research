package com.google.firebase.analytics.connector.internal;

import L8.a;
import L8.b;
import L8.c;
import L8.l;
import L8.n;
import T3.o;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.fragment.app.X;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zzdy;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import l9.InterfaceC3448d;
import s8.g;
import w8.d;
import w8.e;
import w8.f;

@Keep
/* loaded from: classes4.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static d lambda$getComponents$0(c cVar) {
        g gVar = (g) cVar.a(g.class);
        Context context = (Context) cVar.a(Context.class);
        InterfaceC3448d interfaceC3448d = (InterfaceC3448d) cVar.a(InterfaceC3448d.class);
        AbstractC1732v.i(gVar);
        AbstractC1732v.i(context);
        AbstractC1732v.i(interfaceC3448d);
        AbstractC1732v.i(context.getApplicationContext());
        if (e.f47406c == null) {
            synchronized (e.class) {
                try {
                    if (e.f47406c == null) {
                        Bundle bundle = new Bundle(1);
                        gVar.a();
                        if ("[DEFAULT]".equals(gVar.f45329b)) {
                            ((n) interfaceC3448d).c(new o(3), new f());
                            bundle.putBoolean("dataCollectionDefaultEnabled", gVar.k());
                        }
                        e.f47406c = new e(zzdy.zza(context, (String) null, (String) null, (String) null, bundle).zzb());
                    }
                } finally {
                }
            }
        }
        return e.f47406c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<b> getComponents() {
        a aVarB = b.b(d.class);
        aVarB.c(l.d(g.class));
        aVarB.c(l.d(Context.class));
        aVarB.c(l.d(InterfaceC3448d.class));
        aVarB.f6989g = new X(15);
        aVarB.f(2);
        return Arrays.asList(aVarB.d(), ic.d.m("fire-analytics", "22.1.2"));
    }
}
