package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class uwk {
    public float a;
    public float b;
    private final List c;

    public uwk(uwk uwkVar) {
        this.a = BitmapDescriptorFactory.HUE_RED;
        this.b = BitmapDescriptorFactory.HUE_RED;
        if (uwkVar == null) {
            this.c = new ArrayList(0);
            this.a = BitmapDescriptorFactory.HUE_RED;
            this.b = BitmapDescriptorFactory.HUE_RED;
            return;
        }
        this.c = new ArrayList(uwkVar.c.size());
        int size = uwkVar.c.size();
        for (int i = 0; i < size; i++) {
            uwi uwiVar = (uwi) uwkVar.c.get(i);
            if (uwiVar == null) {
                this.c.add(null);
            } else if (uwiVar.i.g(uwiVar.a) == null) {
                this.c.add(null);
            } else {
                this.a = Math.max(this.a, uwiVar.b());
                this.b = Math.max(this.b, uwiVar.a());
                this.c.add(uwiVar);
            }
        }
    }

    public final int a() {
        return this.c.size();
    }

    public final uwi b(int i) {
        if (i < 0) {
            return null;
        }
        List list = this.c;
        if (i < list.size()) {
            return (uwi) list.get(i);
        }
        return null;
    }

    public final void c() {
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) != null) {
                ((uwi) list.get(i)).c();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof uwk)) {
            List list = this.c;
            List list2 = ((uwk) obj).c;
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
        return Arrays.hashCode(this.c.toArray());
    }

    public uwk(uwi uwiVar) {
        this.a = BitmapDescriptorFactory.HUE_RED;
        this.b = BitmapDescriptorFactory.HUE_RED;
        this.c = Collections.singletonList(uwiVar);
        if (uwiVar != null) {
            this.a = Math.max(this.a, uwiVar.b());
            this.b = Math.max(this.b, uwiVar.a());
        }
    }

    public uwk(List list) {
        this.a = BitmapDescriptorFactory.HUE_RED;
        this.b = BitmapDescriptorFactory.HUE_RED;
        this.c = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uwi uwiVar = (uwi) it.next();
            if (uwiVar != null) {
                this.a = Math.max(this.a, uwiVar.b());
                this.b = Math.max(this.b, uwiVar.a());
            }
        }
    }
}
