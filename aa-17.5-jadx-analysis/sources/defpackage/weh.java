package defpackage;

import android.content.Context;
import com.google.android.libraries.social.licenses.License;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes3.dex */
final class weh extends ess {
    private List k;

    public weh(Context context) {
        super(context.getApplicationContext());
    }

    @Override // defpackage.ess
    public final /* bridge */ /* synthetic */ Object a() {
        TreeSet treeSet = new TreeSet();
        String[] strArrSplit = vuf.Q(this.d.getApplicationContext(), "third_party_license_metadata", 0L, -1).split("\n");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str : strArrSplit) {
            int iIndexOf = str.indexOf(32);
            String[] strArrSplit2 = str.substring(0, iIndexOf).split(":");
            woy.ad(strArrSplit2.length == 2 && iIndexOf > 0, "Invalid license meta-data line:\n%s", str);
            arrayList.add(new License(str.substring(iIndexOf + 1), Long.parseLong(strArrSplit2[0]), Integer.parseInt(strArrSplit2[1])));
        }
        Collections.sort(arrayList);
        treeSet.addAll(arrayList);
        return DesugarCollections.unmodifiableList(new ArrayList(treeSet));
    }

    @Override // defpackage.esv
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void k(List list) {
        this.k = list;
        super.k(list);
    }

    @Override // defpackage.esv
    public final void m() {
        List list = this.k;
        if (list != null) {
            k(list);
        } else {
            g();
        }
    }

    @Override // defpackage.esv
    public final void n() {
        h();
    }
}
