package defpackage;

import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

@rb
/* loaded from: classes2.dex */
public final class gmp implements gmw {
    public boolean a;
    public ItemList b;
    public Header c;
    private List d;
    private List e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public gmp(boolean r3, androidx.car.app.model.ItemList r4, java.util.List r5, java.util.List r6, androidx.car.app.model.Header r7) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmp.<init>(boolean, androidx.car.app.model.ItemList, java.util.List, java.util.List, androidx.car.app.model.Header):void");
    }

    public final List a() {
        List list = this.e;
        if (list != null) {
            return list;
        }
        affa.d("actions");
        return null;
    }

    public final List b() {
        List list = this.d;
        if (list == null) {
            affa.d("mSectionedLists");
            list = null;
        }
        return list.isEmpty() ? new ArrayList() : list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gmp)) {
            return false;
        }
        gmp gmpVar = (gmp) obj;
        if (gmpVar.a != this.a || !affa.f(gmpVar.b, this.b)) {
            return false;
        }
        List list = gmpVar.d;
        List list2 = null;
        if (list == null) {
            affa.d("mSectionedLists");
            list = null;
        }
        List list3 = this.d;
        if (list3 == null) {
            affa.d("mSectionedLists");
        } else {
            list2 = list3;
        }
        return affa.f(list, list2) && affa.f(gmpVar.a(), a()) && affa.f(gmpVar.c, this.c);
    }

    public final int hashCode() {
        Boolean boolValueOf = Boolean.valueOf(this.a);
        ItemList itemList = this.b;
        List list = this.d;
        if (list == null) {
            affa.d("mSectionedLists");
            list = null;
        }
        return Objects.hash(boolValueOf, itemList, list, a(), this.c);
    }

    public final String toString() {
        return "ListTemplate";
    }

    private gmp() {
        throw null;
    }
}
