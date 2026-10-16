package okhttp3;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import e.a.dx;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ag extends ao {

    /* renamed from: a, reason: collision with root package name */
    public static final ae f55839a;

    /* renamed from: b, reason: collision with root package name */
    public static final ae f55840b;

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f55841c;

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f55842d;

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f55843e;

    /* renamed from: f, reason: collision with root package name */
    private final k.k f55844f;

    /* renamed from: g, reason: collision with root package name */
    private final ae f55845g;

    /* renamed from: h, reason: collision with root package name */
    private final List f55846h;

    /* renamed from: i, reason: collision with root package name */
    private final ae f55847i;

    /* renamed from: j, reason: collision with root package name */
    private long f55848j;

    static {
        int i2 = ae.f55830a;
        f55839a = kotlinx.b.a.b.z("multipart/mixed");
        kotlinx.b.a.b.z("multipart/alternative");
        kotlinx.b.a.b.z("multipart/digest");
        kotlinx.b.a.b.z("multipart/parallel");
        f55840b = kotlinx.b.a.b.z(ShareTarget.ENCODING_TYPE_MULTIPART);
        f55841c = new byte[]{58, StylePropertiesKt.ZIndexId};
        f55842d = new byte[]{StylePropertiesKt.LeftId, 10};
        f55843e = new byte[]{StylePropertiesKt.FontSynthesisId, StylePropertiesKt.FontSynthesisId};
    }

    public ag(k.k kVar, ae aeVar, List list) {
        h.g.b.x.f(kVar, "boundaryByteString");
        h.g.b.x.f(aeVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(list, "parts");
        this.f55844f = kVar;
        this.f55845g = aeVar;
        this.f55846h = list;
        int i2 = ae.f55830a;
        this.f55847i = kotlinx.b.a.b.z(aeVar + "; boundary=" + kVar.i());
        this.f55848j = -1L;
    }

    private final long d(k.i iVar, boolean z) {
        k.h hVar;
        k.h hVar2;
        if (z) {
            hVar = new k.h();
            hVar2 = hVar;
        } else {
            hVar = null;
            hVar2 = iVar;
        }
        List list = this.f55846h;
        int size = list.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            dx dxVar = (dx) list.get(i2);
            z zVarE = dxVar.e();
            ao aoVarF = dxVar.f();
            h.g.b.x.c(hVar2);
            hVar2.C(f55843e);
            hVar2.Z(this.f55844f);
            byte[] bArr = f55842d;
            hVar2.C(bArr);
            int iA = zVarE.a();
            for (int i3 = 0; i3 < iA; i3++) {
                hVar2.E(zVarE.c(i3)).C(f55841c).E(zVarE.d(i3)).C(bArr);
            }
            ae aeVarB = aoVarF.b();
            if (aeVarB != null) {
                hVar2.E("Content-Type: ").E(aeVarB.toString()).C(bArr);
            }
            long jA = aoVarF.a();
            if (jA != -1) {
                hVar2.E("Content-Length: ").D(jA).C(bArr);
            } else if (z) {
                h.g.b.x.c(hVar);
                hVar.N();
                return -1L;
            }
            hVar2.C(bArr);
            if (z) {
                j2 += jA;
            } else {
                aoVarF.c(hVar2);
            }
            hVar2.C(bArr);
        }
        h.g.b.x.c(hVar2);
        byte[] bArr2 = f55843e;
        hVar2.C(bArr2);
        hVar2.Z(this.f55844f);
        hVar2.C(bArr2);
        hVar2.C(f55842d);
        if (!z) {
            return j2;
        }
        h.g.b.x.c(hVar);
        long jQ = j2 + hVar.q();
        hVar.N();
        return jQ;
    }

    @Override // okhttp3.ao
    public final long a() {
        long j2 = this.f55848j;
        if (j2 != -1) {
            return j2;
        }
        long jD = d(null, true);
        this.f55848j = jD;
        return jD;
    }

    @Override // okhttp3.ao
    public final ae b() {
        return this.f55847i;
    }

    @Override // okhttp3.ao
    public final void c(k.i iVar) {
        h.g.b.x.f(iVar, "sink");
        d(iVar, false);
    }
}
