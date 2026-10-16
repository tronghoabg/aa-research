package com.google.e.a.a;

import com.google.e.a.h.cu;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class aq implements com.google.e.a.e.y {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f8217a;

    public /* synthetic */ aq(int i2) {
        this.f8217a = i2;
    }

    @Override // com.google.e.a.e.y
    public final com.google.android.libraries.e.a.f a(com.google.d.m.a.a.b bVar) {
        switch (this.f8217a) {
            case 0:
                ap apVar = (ap) bVar;
                return com.google.android.libraries.e.a.f.h("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", au.f(apVar.f()), au.h(apVar).toByteString());
            case 1:
                return ak.b((aj) bVar);
            case 2:
                return com.google.e.a.a.a.a.b((j) bVar);
            case 3:
                return com.google.e.a.a.a.b.b((o) bVar);
            case 4:
                return com.google.e.a.a.a.e.b((t) bVar);
            case 5:
                return com.google.e.a.a.a.g.b((z) bVar);
            case 6:
                return com.google.android.libraries.e.a.f.h("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", com.google.e.a.a.a.i.f(((ad) bVar).f()), com.google.e.a.h.ax.getDefaultInstance().toByteString());
            case 7:
                return com.google.e.a.a.a.u.b((ba) bVar);
            case 8:
                return com.google.android.libraries.e.a.f.h("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", com.google.e.a.a.a.w.f(((be) bVar).f()), cu.getDefaultInstance().toByteString());
            case 9:
                return com.google.e.a.c.a.a.b((com.google.e.a.c.g) bVar);
            case 10:
                return ((com.google.e.a.e.j) bVar).f();
            case 11:
                return com.google.e.a.f.a.a.b((com.google.e.a.f.d) bVar);
            case 12:
                return com.google.e.a.f.a.c.b((com.google.e.a.f.n) bVar);
            case 13:
                return com.google.e.a.i.a.a.b((com.google.e.a.i.e) bVar);
            default:
                return com.google.e.a.i.a.b.b((com.google.e.a.i.j) bVar);
        }
    }
}
