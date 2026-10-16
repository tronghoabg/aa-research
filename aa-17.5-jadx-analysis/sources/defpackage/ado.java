package defpackage;

import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.time.Duration;

/* loaded from: classes.dex */
public final class ado implements afec {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ado(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v18, types: [cst, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v20, types: [buo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v22, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v25, types: [afec, java.lang.Object] */
    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        adp adpVar;
        long j;
        switch (this.b) {
            case 0:
                int iOrdinal = ((acc) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        adpVar = (adp) this.a;
                        acd acdVar = adpVar.b.b;
                    } else {
                        if (iOrdinal != 2) {
                            throw new aezs();
                        }
                        adpVar = (adp) this.a;
                    }
                    adm admVar = adpVar.c.b.e;
                } else {
                    acd acdVar2 = ((adp) this.a).b.b;
                }
                return new cjv(cjn.i(0));
            case 1:
                aeh aehVar = (aeh) obj;
                float f = aehVar.b;
                float f2 = BitmapDescriptorFactory.HUE_RED;
                if (f < BitmapDescriptorFactory.HUE_RED) {
                    f = 0.0f;
                }
                float f3 = aehVar.c;
                if (f3 < -0.5f) {
                    f3 = -0.5f;
                }
                float f4 = aehVar.d;
                float f5 = f4 >= -0.5f ? f4 : -0.5f;
                float f6 = aehVar.a;
                if (f6 >= BitmapDescriptorFactory.HUE_RED) {
                    f2 = f6;
                }
                float[] fArr = clj.a;
                if (f > 1.0f) {
                    f = 1.0f;
                }
                if (f3 > 0.5f) {
                    f3 = 0.5f;
                }
                if (f5 > 0.5f) {
                    f5 = 0.5f;
                }
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                return new cjv(cjv.e(cjn.j(f, f3, f5, f2, clj.x), (clh) this.a));
            case 2:
                float[] fArr2 = ((cki) obj).a;
                ?? r10 = this.a;
                if (r10.t()) {
                    crt.j(r10).eD(r10, fArr2);
                }
                return afak.a;
            case 3:
                this.a.a();
                return afak.a;
            case 4:
                return this.a.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 5:
                cej cejVar = (cej) obj;
                synchronized (cek.b) {
                    j = cek.d;
                    cek.d = 1 + j;
                }
                return new cea(j, cejVar, this.a);
            case 6:
                ((eqj) this.a).m(obj);
                return afak.a;
            default:
                Duration duration = lto.a;
                int iQ = ((AaPlaybackState) obj).Q();
                return dtx.p((1 & 1) != 0 ? afcp.a : null, (1 & 2) != 0 ? 5000L : 0L, new opz(obj, iQ == 3 || iQ == 4 || iQ == 5, (Duration) this.a, (afck) null, 1));
        }
    }
}
