package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class vcr implements Iterable {
    public final List a;
    public final vcq b;
    public final vcq c;
    public final vcq d;
    public final vcq e;
    public final vcq f;
    public final vcq g;
    public final vcp h;
    public final boolean i;
    public float j;
    public float k;
    public final aacq l;

    public vcr(vcq vcqVar, vcq vcqVar2, vcq vcqVar3, vcq vcqVar4, vcq vcqVar5, vcq vcqVar6, aacq aacqVar, vcp vcpVar) {
        ArrayList arrayList = new ArrayList(6);
        this.a = arrayList;
        this.j = 75.0f;
        this.k = 25.0f;
        this.b = vcqVar;
        vcqVar.d(12.0f, 3.1415927f, 1.0f);
        this.c = vcqVar2;
        vcqVar2.d(4.0f, 3.1415927f, 1.0f);
        this.d = vcqVar3;
        vcqVar3.d(4.0f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.e = vcqVar4;
        vcqVar4.d(12.0f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.f = vcqVar5;
        vcqVar5.d(8.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.g = vcqVar6;
        vcqVar6.d(16.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.l = aacqVar;
        this.h = vcpVar;
        vcpVar.d(1.0f);
        if (arrayList.isEmpty()) {
            arrayList.add(vcqVar4);
            arrayList.add(vcqVar3);
            arrayList.add(vcqVar2);
            arrayList.add(vcqVar);
        }
        this.i = false;
    }

    public final int a(vcq vcqVar) {
        if (vcqVar == this.b) {
            return 0;
        }
        if (vcqVar == this.c) {
            return 1;
        }
        if (vcqVar == this.d) {
            return 2;
        }
        if (vcqVar == this.e) {
            return 3;
        }
        throw new IllegalArgumentException("Unknown or unexpected dot");
    }

    public final void b(float f) {
        this.h.b(f);
    }

    @Override // java.lang.Iterable
    public final Iterator<vcq> iterator() {
        return this.a.iterator();
    }
}
