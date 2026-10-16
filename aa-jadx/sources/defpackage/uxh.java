package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uxh {
    public float a;
    public float b;
    private final java.util.List c;

    public uxh(defpackage.uxh uxhVar) {
        this.a = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.b = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        if (uxhVar == null) {
            this.c = new java.util.ArrayList(0);
            this.a = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            this.b = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            return;
        }
        this.c = new java.util.ArrayList(uxhVar.c.size());
        int size = uxhVar.c.size();
        for (int i = 0; i < size; i++) {
            defpackage.uxf uxfVar = (defpackage.uxf) uxhVar.c.get(i);
            if (uxfVar == null) {
                this.c.add(null);
            } else if (uxfVar.i.g(uxfVar.a) == null) {
                this.c.add(null);
            } else {
                this.a = java.lang.Math.max(this.a, uxfVar.b());
                this.b = java.lang.Math.max(this.b, uxfVar.a());
                this.c.add(uxfVar);
            }
        }
    }

    public final int a() {
        return this.c.size();
    }

    public final defpackage.uxf b(int i) {
        if (i < 0) {
            return null;
        }
        java.util.List list = this.c;
        if (i < list.size()) {
            return (defpackage.uxf) list.get(i);
        }
        return null;
    }

    public final void c() {
        java.util.List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) != null) {
                ((defpackage.uxf) list.get(i)).c();
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.uxh)) {
            java.util.List list = this.c;
            java.util.List list2 = ((defpackage.uxh) obj).c;
            if (list.size() == list2.size()) {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) != list2.get(i)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.c.toArray());
    }

    public uxh(defpackage.uxf uxfVar) {
        this.a = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.b = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.c = java.util.Collections.singletonList(uxfVar);
        if (uxfVar != null) {
            this.a = java.lang.Math.max(this.a, uxfVar.b());
            this.b = java.lang.Math.max(this.b, uxfVar.a());
        }
    }

    public uxh(java.util.List list) {
        this.a = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.b = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.c = list;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.uxf uxfVar = (defpackage.uxf) it.next();
            if (uxfVar != null) {
                this.a = java.lang.Math.max(this.a, uxfVar.b());
                this.b = java.lang.Math.max(this.b, uxfVar.a());
            }
        }
    }
}
