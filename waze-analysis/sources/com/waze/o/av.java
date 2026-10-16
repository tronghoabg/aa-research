package com.waze.o;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class av extends dm<aw, av> implements fj {
    /* synthetic */ av(byte[] bArr) {
        super(aw.DEFAULT_INSTANCE);
    }

    public final void a(u uVar) {
        copyOnWrite();
        ((aw) this.instance).setChatContext(uVar);
    }

    public final void b(bx bxVar) {
        copyOnWrite();
        ((aw) this.instance).setTrigger(bxVar);
    }

    public final void c(String str) {
        copyOnWrite();
        ((aw) this.instance).setUserFirstName(str);
    }

    private av() {
        throw null;
    }
}
