package com.google.firebase.datatransport;

import android.content.Context;
import com.google.android.datatransport.h;
import com.google.android.datatransport.runtime.ac;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ae;
import com.google.firebase.components.d;
import com.google.firebase.components.g;
import com.google.firebase.components.r;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    static /* synthetic */ h lambda$getComponents$0(d dVar) {
        ac.d((Context) dVar.f(Context.class));
        return ac.c().b(com.google.android.datatransport.cct.a.f3912d);
    }

    static /* synthetic */ h lambda$getComponents$1(d dVar) {
        ac.d((Context) dVar.f(Context.class));
        return ac.c().b(com.google.android.datatransport.cct.a.f3912d);
    }

    static /* synthetic */ h lambda$getComponents$2(d dVar) {
        ac.d((Context) dVar.f(Context.class));
        return ac.c().b(com.google.android.datatransport.cct.a.f3911c);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.c<?>> getComponents() {
        com.google.firebase.components.b bVarB = com.google.firebase.components.c.b(h.class);
        bVarB.d(LIBRARY_NAME);
        bVarB.b(r.f(Context.class));
        final int i2 = 1;
        bVarB.c(new g() { // from class: com.google.firebase.datatransport.c
            @Override // com.google.firebase.components.g
            public final Object a(d dVar) {
                int i3 = i2;
                return i3 != 0 ? i3 != 1 ? TransportRegistrar.lambda$getComponents$2(dVar) : TransportRegistrar.lambda$getComponents$0(dVar) : TransportRegistrar.lambda$getComponents$1(dVar);
            }
        });
        final int i3 = 0;
        com.google.firebase.components.b bVarA = com.google.firebase.components.c.a(new ae(a.class, h.class));
        bVarA.b(r.f(Context.class));
        bVarA.c(new g() { // from class: com.google.firebase.datatransport.c
            @Override // com.google.firebase.components.g
            public final Object a(d dVar) {
                int i32 = i3;
                return i32 != 0 ? i32 != 1 ? TransportRegistrar.lambda$getComponents$2(dVar) : TransportRegistrar.lambda$getComponents$0(dVar) : TransportRegistrar.lambda$getComponents$1(dVar);
            }
        });
        com.google.firebase.components.b bVarA2 = com.google.firebase.components.c.a(new ae(b.class, h.class));
        bVarA2.b(r.f(Context.class));
        final int i4 = 2;
        bVarA2.c(new g() { // from class: com.google.firebase.datatransport.c
            @Override // com.google.firebase.components.g
            public final Object a(d dVar) {
                int i32 = i4;
                return i32 != 0 ? i32 != 1 ? TransportRegistrar.lambda$getComponents$2(dVar) : TransportRegistrar.lambda$getComponents$0(dVar) : TransportRegistrar.lambda$getComponents$1(dVar);
            }
        });
        return Arrays.asList(bVarB.a(), bVarA.a(), bVarA2.a(), com.google.firebase.h.g.a(LIBRARY_NAME, "19.0.0_1p"));
    }
}
