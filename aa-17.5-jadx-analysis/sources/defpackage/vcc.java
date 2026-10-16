package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class vcc extends vcl {
    private final int[] a;

    public vcc() {
        super("MOLECULE_APPEAR");
        this.a = new int[]{0, 2, 3, 1};
    }

    @Override // defpackage.vcl
    public final void a(vcr vcrVar) {
        vcl.d(vcrVar);
        vcrVar.b(BitmapDescriptorFactory.HUE_RED);
        Iterator<vcq> it = vcrVar.iterator();
        while (it.hasNext()) {
            vcq next = it.next();
            next.c(vcl.b[vcrVar.a(next)] + 10.0f);
        }
        Iterator<vcq> it2 = vcrVar.iterator();
        while (it2.hasNext()) {
            vcq next2 = it2.next();
            vcp vcpVar = next2.g;
            vcpVar.d(vcpVar.b);
            vco vcoVar = next2.a;
            vcoVar.d(vcoVar.b);
            vcp vcpVar2 = next2.h;
            vcpVar2.d(vcpVar2.b);
            vcp vcpVar3 = next2.i;
            vcpVar3.d(vcpVar3.b);
            vcp vcpVar4 = next2.j;
            vcpVar4.d(vcpVar4.b);
            vcp vcpVar5 = next2.b;
            vcpVar5.d(vcpVar5.b);
            vcp vcpVar6 = next2.d;
            vcpVar6.d(vcpVar6.b);
            vcp vcpVar7 = next2.e;
            vcpVar7.d(vcpVar7.b);
            vcp vcpVar8 = next2.c;
            vcpVar8.d(vcpVar8.b);
        }
        aacq aacqVar = vcrVar.l;
        vcp vcpVar9 = (vcp) aacqVar.a;
        vcpVar9.d(vcpVar9.b);
        vcp vcpVar10 = (vcp) aacqVar.b;
        vcpVar10.d(vcpVar10.b);
        vcp vcpVar11 = vcrVar.h;
        vcpVar11.d(vcpVar11.b);
    }

    @Override // defpackage.vcl
    public final void b(vcr vcrVar) {
        Iterator<vcq> it = vcrVar.iterator();
        while (it.hasNext()) {
            vcq next = it.next();
            next.c(vcl.b[vcrVar.a(next)]);
        }
    }

    @Override // defpackage.vcl
    public final boolean c(long j, long j2, vcr vcrVar) {
        float fE;
        Iterator<vcq> it = vcrVar.iterator();
        while (true) {
            fE = vcl.e(j, j2);
            if (!it.hasNext()) {
                break;
            }
            vcq next = it.next();
            int iA = vcrVar.a(next);
            float f = fE - (this.a[iA] * 0.01f);
            if (f > BitmapDescriptorFactory.HUE_RED && f < 0.5f) {
                next.c(vcl.b[iA] - 32.0f);
            } else if (f > 0.5f && f < 1.0f) {
                next.c(vcl.b[iA]);
            }
        }
        vcrVar.b(fE);
        return fE < 1.0f;
    }
}
