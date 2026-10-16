package b2;

import N1.C0765n;
import N1.J;
import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: n, reason: collision with root package name */
    public static final l f19220n;

    /* renamed from: d, reason: collision with root package name */
    public final List f19221d;

    /* renamed from: e, reason: collision with root package name */
    public final List f19222e;

    /* renamed from: f, reason: collision with root package name */
    public final List f19223f;

    /* renamed from: g, reason: collision with root package name */
    public final List f19224g;

    /* renamed from: h, reason: collision with root package name */
    public final List f19225h;

    /* renamed from: i, reason: collision with root package name */
    public final List f19226i;

    /* renamed from: j, reason: collision with root package name */
    public final C0765n f19227j;
    public final List k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f19228l;

    /* renamed from: m, reason: collision with root package name */
    public final List f19229m;

    static {
        List list = Collections.EMPTY_LIST;
        f19220n = new l("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public l(String str, List list, List list2, List list3, List list4, List list5, List list6, C0765n c0765n, List list7, boolean z2, Map map, List list8) {
        super(str, list, z2);
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < list2.size(); i5++) {
            Uri uri = ((k) list2.get(i5)).f19214a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        b(list6, arrayList);
        this.f19221d = DesugarCollections.unmodifiableList(arrayList);
        this.f19222e = DesugarCollections.unmodifiableList(list2);
        this.f19223f = DesugarCollections.unmodifiableList(list3);
        this.f19224g = DesugarCollections.unmodifiableList(list4);
        this.f19225h = DesugarCollections.unmodifiableList(list5);
        this.f19226i = DesugarCollections.unmodifiableList(list6);
        this.f19227j = c0765n;
        this.k = list7 != null ? DesugarCollections.unmodifiableList(list7) : null;
        this.f19228l = DesugarCollections.unmodifiableMap(map);
        this.f19229m = DesugarCollections.unmodifiableList(list8);
    }

    public static void b(List list, ArrayList arrayList) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            Uri uri = ((j) list.get(i5)).f19211a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(List list, List list2, int i5) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < list2.size()) {
                    J j8 = (J) list2.get(i11);
                    if (j8.f8046b == i5 && j8.f8047c == i10) {
                        arrayList.add(obj);
                        break;
                    }
                    i11++;
                }
            }
        }
        return arrayList;
    }

    @Override // f2.InterfaceC2551a
    public final Object a(List list) {
        ArrayList arrayListC = c(this.f19222e, list, 0);
        List list2 = Collections.EMPTY_LIST;
        return new l(this.f19230a, this.f19231b, arrayListC, list2, c(this.f19224g, list, 1), c(this.f19225h, list, 2), list2, this.f19227j, this.k, this.f19232c, this.f19228l, this.f19229m);
    }
}
