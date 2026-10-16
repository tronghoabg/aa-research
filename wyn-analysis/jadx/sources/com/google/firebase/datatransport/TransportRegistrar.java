package com.google.firebase.datatransport;

import L8.a;
import L8.b;
import L8.c;
import L8.l;
import L8.t;
import android.content.Context;
import androidx.annotation.Keep;
import com.applovin.impl.Z0;
import com.google.firebase.components.ComponentRegistrar;
import d9.InterfaceC2400a;
import d9.InterfaceC2401b;
import ic.d;
import java.util.Arrays;
import java.util.List;
import q5.InterfaceC3872g;
import r5.C3924a;
import t5.C4123r;

@Keep
/* loaded from: classes4.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC3872g lambda$getComponents$0(c cVar) {
        C4123r.b((Context) cVar.a(Context.class));
        return C4123r.a().c(C3924a.f44363f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC3872g lambda$getComponents$1(c cVar) {
        C4123r.b((Context) cVar.a(Context.class));
        return C4123r.a().c(C3924a.f44363f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC3872g lambda$getComponents$2(c cVar) {
        C4123r.b((Context) cVar.a(Context.class));
        return C4123r.a().c(C3924a.f44362e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        a aVarB = b.b(InterfaceC3872g.class);
        aVarB.f6983a = LIBRARY_NAME;
        aVarB.c(l.d(Context.class));
        aVarB.f6989g = new Z0(8);
        b bVarD = aVarB.d();
        a aVarA = b.a(new t(InterfaceC2400a.class, InterfaceC3872g.class));
        aVarA.c(l.d(Context.class));
        aVarA.f6989g = new Z0(9);
        b bVarD2 = aVarA.d();
        a aVarA2 = b.a(new t(InterfaceC2401b.class, InterfaceC3872g.class));
        aVarA2.c(l.d(Context.class));
        aVarA2.f6989g = new Z0(10);
        return Arrays.asList(bVarD, bVarD2, aVarA2.d(), d.m(LIBRARY_NAME, "19.0.0"));
    }
}
