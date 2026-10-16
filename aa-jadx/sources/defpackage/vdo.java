package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vdo implements java.lang.Iterable {
    public final java.util.List a;
    public final defpackage.vdn b;
    public final defpackage.vdn c;
    public final defpackage.vdn d;
    public final defpackage.vdn e;
    public final defpackage.vdn f;
    public final defpackage.vdn g;
    public final defpackage.vdm h;
    public final boolean i;
    public float j;
    public float k;
    public final defpackage.wep l;

    public vdo(defpackage.vdn vdnVar, defpackage.vdn vdnVar2, defpackage.vdn vdnVar3, defpackage.vdn vdnVar4, defpackage.vdn vdnVar5, defpackage.vdn vdnVar6, defpackage.wep wepVar, defpackage.vdm vdmVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList(6);
        this.a = arrayList;
        this.j = 75.0f;
        this.k = 25.0f;
        this.b = vdnVar;
        vdnVar.d(12.0f, 3.1415927f, 1.0f);
        this.c = vdnVar2;
        vdnVar2.d(4.0f, 3.1415927f, 1.0f);
        this.d = vdnVar3;
        vdnVar3.d(4.0f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.e = vdnVar4;
        vdnVar4.d(12.0f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.f = vdnVar5;
        vdnVar5.d(8.0f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        this.g = vdnVar6;
        vdnVar6.d(16.0f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        this.l = wepVar;
        this.h = vdmVar;
        vdmVar.d(1.0f);
        if (arrayList.isEmpty()) {
            arrayList.add(vdnVar4);
            arrayList.add(vdnVar3);
            arrayList.add(vdnVar2);
            arrayList.add(vdnVar);
        }
        this.i = false;
    }

    public final int a(defpackage.vdn vdnVar) {
        if (vdnVar == this.b) {
            return 0;
        }
        if (vdnVar == this.c) {
            return 1;
        }
        if (vdnVar == this.d) {
            return 2;
        }
        if (vdnVar == this.e) {
            return 3;
        }
        throw new java.lang.IllegalArgumentException("Unknown or unexpected dot");
    }

    public final void b(float f) {
        this.h.b(f);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<defpackage.vdn> iterator() {
        return this.a.iterator();
    }
}
