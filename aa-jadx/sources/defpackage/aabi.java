package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aabi {
    private java.util.List a = new java.util.ArrayList();
    private final java.util.Set b = new java.util.HashSet();
    private android.graphics.Point c = null;

    public final defpackage.zxy a(java.util.List list, float f, float f2) {
        int iRound = java.lang.Math.round(f);
        int iRound2 = java.lang.Math.round(f2);
        android.graphics.Point point = this.c;
        if (point == null) {
            this.c = new android.graphics.Point(iRound, iRound2);
        } else {
            int i = iRound - point.x;
            int i2 = iRound2 - this.c.y;
            if ((i * i) + (i2 * i2) > 900) {
                this.c.x = iRound;
                this.c.y = iRound2;
            }
        }
        int i3 = this.c.x;
        int i4 = this.c.y;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.aabj aabjVar = (defpackage.aabj) it.next();
            if (aabjVar.a.isVisible()) {
                android.graphics.Rect rectA = aabjVar.a();
                float fExactCenterX = i3 - rectA.exactCenterX();
                float fExactCenterY = i4 - rectA.exactCenterY();
                if ((fExactCenterX * fExactCenterX) + (fExactCenterY * fExactCenterY) < 900.0f) {
                    arrayList.add(aabjVar);
                }
            }
        }
        java.util.List list2 = this.a;
        if (arrayList.size() != list2.size()) {
            this.a = arrayList;
            this.b.clear();
            break;
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            if (!((defpackage.aabj) arrayList.get(i5)).equals(list2.get(i5))) {
                this.a = arrayList;
                this.b.clear();
                break;
            }
        }
        defpackage.aabj aabjVar2 = null;
        if (this.a.isEmpty()) {
            return null;
        }
        float fH = -3.4028235E38f;
        for (defpackage.aabj aabjVar3 : this.a) {
            if (!this.b.contains(aabjVar3) && java.lang.Float.compare(aabjVar3.h(), fH) >= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                fH = aabjVar3.h();
                aabjVar2 = aabjVar3;
            }
        }
        java.util.Set set = this.b;
        if (aabjVar2 == null) {
            set.clear();
            return a(list, iRound, iRound2);
        }
        set.add(aabjVar2);
        return aabjVar2.a;
    }
}
