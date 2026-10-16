package defpackage;

/* loaded from: classes3.dex */
final class aeaw implements adrg {
    final /* synthetic */ aeay a;

    public aeaw(aeay aeayVar) {
        this.a = aeayVar;
    }

    @Override // defpackage.adrg
    public final void a(adnq adnqVar) {
        int i = aeeb.a;
        aeax aeaxVar = this.a.f;
        int i2 = aeax.z;
        synchronized (aeaxVar.a) {
            aeaxVar.q(adnqVar, true, null);
        }
    }

    @Override // defpackage.adrg
    public final void b(aeag aeagVar, boolean z, boolean z2, int i) {
        ajmy ajmyVar;
        int i2 = aeeb.a;
        if (aeagVar == null) {
            ajmyVar = aeay.a;
        } else {
            ajmyVar = ((aebl) aeagVar).a;
            int i3 = (int) ajmyVar.b;
            if (i3 > 0) {
                this.a.w(i3);
            }
        }
        aeay aeayVar = this.a;
        aeax aeaxVar = aeayVar.f;
        int i4 = aeax.z;
        synchronized (aeaxVar.a) {
            if (!aeaxVar.f) {
                if (aeaxVar.u) {
                    aeaxVar.c.a(ajmyVar, (int) ajmyVar.b);
                    aeaxVar.d |= z;
                    aeaxVar.e |= z2;
                } else {
                    woy.aa(aeaxVar.x != -1, "streamId should be set");
                    aeaxVar.h.a(z, aeaxVar.w, ajmyVar, z2);
                }
            }
            aeac aeacVar = aeayVar.t;
            if (i != 0) {
                aeacVar.f += i;
                aeacVar.a.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0154 A[Catch: all -> 0x016c, TryCatch #0 {, blocks: (B:4:0x0015, B:6:0x0043, B:8:0x004e, B:9:0x0081, B:11:0x0084, B:13:0x0092, B:15:0x009a, B:16:0x00aa, B:17:0x00ad, B:19:0x00b4, B:50:0x016a, B:20:0x00c2, B:22:0x00c8, B:24:0x00d0, B:26:0x00d8, B:41:0x013d, B:43:0x0143, B:45:0x0147, B:27:0x00df, B:29:0x00ef, B:31:0x0102, B:33:0x0108, B:35:0x010c, B:36:0x0121, B:38:0x0127, B:40:0x0139, B:30:0x00f2, B:46:0x0154, B:48:0x015e, B:49:0x0167, B:7:0x0049), top: B:55:0x0015 }] */
    @Override // defpackage.adrg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.admc r12) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeaw.c(admc):void");
    }
}
