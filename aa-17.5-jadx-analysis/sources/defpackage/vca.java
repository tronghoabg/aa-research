package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class vca extends vcl {
    private final int[] a;

    public vca() {
        super("MOLECULE_DISAPPEAR");
        this.a = new int[]{0, 2, 3, 1};
    }

    @Override // defpackage.vcl
    public final void a(vcr vcrVar) {
        vcl.d(vcrVar);
    }

    @Override // defpackage.vcl
    public final void b(vcr vcrVar) {
        vcrVar.b(BitmapDescriptorFactory.HUE_RED);
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
                next.c(vcl.b[iA] - 25.0f);
            } else if (f > 0.5f && f < 1.0f) {
                next.c(vcl.b[iA] + 10.0f);
            }
        }
        if (fE > 0.8f) {
            vcrVar.b(BitmapDescriptorFactory.HUE_RED);
        }
        return fE < 1.0f;
    }
}
