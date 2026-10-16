package h5;

import U8.v0;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: h5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2777a extends v0 {
    @Override // h5.InterfaceC2781e
    public final void a(HashMap map, String str) {
        t0().a(map, str);
    }

    @Override // h5.InterfaceC2781e
    public final void b(Serializable serializable) {
        t0().b(serializable);
    }

    public abstract InterfaceC2781e t0();
}
