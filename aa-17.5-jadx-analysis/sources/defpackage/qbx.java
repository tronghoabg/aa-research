package defpackage;

import java.net.ProxySelector;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class qbx implements xyc {
    private final /* synthetic */ int a;

    public qbx(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xyc
    public final /* synthetic */ Object gu() {
        int i = this.a;
        if (i == 0) {
            return new san(null, 1);
        }
        if (i != 1) {
            return i != 2 ? ProxySelector.getDefault() : new xya();
        }
        int i2 = pnh.b;
        vaq.d();
        ArrayList arrayList = new ArrayList();
        ynp ynpVarListIterator = yfq.r(acds.CAMERA_2D_NORTH_UP, acds.CAMERA_2D_HEADING_UP).listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            acds acdsVar = (acds) ynpVarListIterator.next();
            pnh.b(arrayList, acdsVar, false, false, 14.5f, 15.0f, 15.75f, 18.5f, 15.75f, 15.75f);
            pnh.b(arrayList, acdsVar, true, false, 15.5f, 16.0f, 16.75f, 16.75f, 15.75f, 16.75f);
            pnh.b(arrayList, acdsVar, false, true, 14.75f, 16.0f, 16.0f, 16.0f, 17.75f, 16.0f);
            pnh.b(arrayList, acdsVar, true, true, 15.5f, 16.25f, 17.5f, 17.5f, 17.75f, 17.5f);
        }
        acds acdsVar2 = acds.CAMERA_3D;
        pnh.b(arrayList, acdsVar2, false, false, 15.0f, 16.25f, 17.25f, 18.5f, 17.25f, 17.25f);
        pnh.b(arrayList, acdsVar2, true, false, 15.0f, 16.5f, 17.75f, 17.75f, 17.25f, 17.75f);
        pnh.b(arrayList, acdsVar2, false, true, 15.0f, 17.75f, 17.75f, 17.75f, 17.75f, 17.75f);
        pnh.b(arrayList, acdsVar2, true, true, 15.0f, 18.0f, 18.0f, 18.0f, 17.75f, 18.0f);
        return arrayList;
    }
}
