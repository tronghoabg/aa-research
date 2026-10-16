package com.google.firebase.remoteconfig;

import L8.a;
import L8.b;
import L8.c;
import L8.l;
import L8.t;
import P9.d;
import W9.m;
import Z9.k;
import android.content.Context;
import androidx.annotation.Keep;
import ca.InterfaceC1592a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import s8.g;
import u8.C4262a;
import y8.InterfaceC4567b;

@Keep
/* loaded from: classes4.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k lambda$getComponents$0(t tVar, c cVar) {
        return new k((Context) cVar.a(Context.class), (ScheduledExecutorService) cVar.b(tVar), (g) cVar.a(g.class), (d) cVar.a(d.class), ((C4262a) cVar.a(C4262a.class)).a("frc"), cVar.c(w8.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        t tVar = new t(InterfaceC4567b.class, ScheduledExecutorService.class);
        a aVar = new a(k.class, new Class[]{InterfaceC1592a.class});
        aVar.f6983a = LIBRARY_NAME;
        aVar.c(l.d(Context.class));
        aVar.c(new l(tVar, 1, 0));
        aVar.c(l.d(g.class));
        aVar.c(l.d(d.class));
        aVar.c(l.d(C4262a.class));
        aVar.c(l.b(w8.d.class));
        aVar.f6989g = new m(tVar, 1);
        aVar.f(2);
        return Arrays.asList(aVar.d(), ic.d.m(LIBRARY_NAME, "22.0.1"));
    }
}
