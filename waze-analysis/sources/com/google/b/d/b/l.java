package com.google.b.d.b;

import com.google.d.d.ci;
import j$.lang.Iterable$EL;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class l extends a implements d {

    /* renamed from: a, reason: collision with root package name */
    static final b f7101a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f7102b = 0;

    /* renamed from: c, reason: collision with root package name */
    private final Exception f7103c;

    private l(UUID uuid, String str, Exception exc, w wVar) {
        super("<missing root>", uuid, str, wVar);
        this.f7103c = exc;
    }

    public static l i(w wVar) {
        UUID uuidC = k.b().c();
        String strBo = a.bo(uuidC);
        ci ciVarD = j.d();
        if (!ciVarD.isEmpty()) {
            Iterable$EL.forEach(ciVarD, new m(1));
        }
        return new l(uuidC, strBo, f7101a, wVar);
    }

    @Override // com.google.b.d.b.d
    public final x b(String str, r rVar, boolean z, w wVar) {
        if (z) {
            int i2 = j.f7093a;
        }
        return new n(str, this, rVar, z, wVar);
    }

    @Override // com.google.b.d.b.d
    public final Exception g() {
        return this.f7103c;
    }

    @Override // com.google.b.d.b.x
    public final r h() {
        return q.f7113a;
    }

    @Override // com.google.b.d.b.x
    public final r j() {
        throw null;
    }

    @Override // com.google.b.d.b.x
    public final x k(String str, r rVar, w wVar) {
        int i2 = j.f7093a;
        return b(str, rVar, true, wVar);
    }

    @Override // com.google.b.d.b.x
    public final void l() {
    }
}
