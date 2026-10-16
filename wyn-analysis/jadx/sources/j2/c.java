package j2;

import N1.C0765n;
import N1.J;
import f2.InterfaceC2551a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements InterfaceC2551a {

    /* renamed from: a, reason: collision with root package name */
    public final int f38595a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38596b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38597c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f38598d;

    /* renamed from: e, reason: collision with root package name */
    public final C3077a f38599e;

    /* renamed from: f, reason: collision with root package name */
    public final b[] f38600f;

    /* renamed from: g, reason: collision with root package name */
    public final long f38601g;

    /* renamed from: h, reason: collision with root package name */
    public final long f38602h;

    public c(int i5, int i10, long j8, long j10, int i11, boolean z2, C3077a c3077a, b[] bVarArr) {
        this.f38595a = i5;
        this.f38596b = i10;
        this.f38601g = j8;
        this.f38602h = j10;
        this.f38597c = i11;
        this.f38598d = z2;
        this.f38599e = c3077a;
        this.f38600f = bVarArr;
    }

    @Override // f2.InterfaceC2551a
    public final Object a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            J j8 = (J) arrayList.get(i5);
            b bVar2 = this.f38600f[j8.f8046b];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.a((C0765n[]) arrayList3.toArray(new C0765n[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f38589j[j8.f8047c]);
            i5++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.a((C0765n[]) arrayList3.toArray(new C0765n[0])));
        }
        return new c(this.f38595a, this.f38596b, this.f38601g, this.f38602h, this.f38597c, this.f38598d, this.f38599e, (b[]) arrayList2.toArray(new b[0]));
    }
}
