package E4;

import N.C0719d0;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import x.C4412e;

/* loaded from: classes.dex */
public final class C implements h, C4.d {

    /* renamed from: a, reason: collision with root package name */
    public final k f2831a;

    /* renamed from: b, reason: collision with root package name */
    public final i f2832b;

    /* renamed from: c, reason: collision with root package name */
    public int f2833c;

    /* renamed from: d, reason: collision with root package name */
    public int f2834d = -1;

    /* renamed from: e, reason: collision with root package name */
    public B4.d f2835e;

    /* renamed from: f, reason: collision with root package name */
    public List f2836f;

    /* renamed from: g, reason: collision with root package name */
    public int f2837g;

    /* renamed from: h, reason: collision with root package name */
    public volatile I4.o f2838h;

    /* renamed from: i, reason: collision with root package name */
    public File f2839i;

    /* renamed from: j, reason: collision with root package name */
    public D f2840j;

    public C(i iVar, k kVar) {
        this.f2832b = iVar;
        this.f2831a = kVar;
    }

    @Override // C4.d
    public final void c(Exception exc) {
        this.f2831a.b(this.f2840j, exc, this.f2838h.f5355c, 4);
    }

    @Override // E4.h
    public final void cancel() {
        I4.o oVar = this.f2838h;
        if (oVar != null) {
            oVar.f5355c.cancel();
        }
    }

    @Override // E4.h
    public final boolean d() {
        List list;
        ArrayList arrayListA = this.f2832b.a();
        boolean z2 = false;
        if (!arrayListA.isEmpty()) {
            i iVar = this.f2832b;
            com.bumptech.glide.f fVar = iVar.f2881c.f24220b;
            Class<?> cls = iVar.f2882d.getClass();
            Class cls2 = iVar.f2885g;
            Class cls3 = iVar.k;
            S3.s sVar = (S3.s) fVar.f24237h;
            Y4.k kVar = (Y4.k) ((AtomicReference) sVar.f11009b).getAndSet(null);
            if (kVar == null) {
                kVar = new Y4.k(cls, cls2, cls3);
            } else {
                kVar.f16696a = cls;
                kVar.f16697b = cls2;
                kVar.f16698c = cls3;
            }
            synchronized (((C4412e) sVar.f11010c)) {
                list = (List) ((C4412e) sVar.f11010c).get(kVar);
            }
            ((AtomicReference) sVar.f11009b).set(kVar);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((I4.s) fVar.f24230a).a(cls).iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((S3.c) fVar.f24232c).n((Class) it.next(), cls2).iterator();
                    while (it2.hasNext()) {
                        Class cls4 = (Class) it2.next();
                        if (!((C0719d0) fVar.f24235f).d(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                ((S3.s) fVar.f24237h).t(cls, cls2, cls3, DesugarCollections.unmodifiableList(arrayList));
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.f2836f;
                    if (list3 != null && this.f2837g < list3.size()) {
                        this.f2838h = null;
                        while (!z2 && this.f2837g < this.f2836f.size()) {
                            List list4 = this.f2836f;
                            int i5 = this.f2837g;
                            this.f2837g = i5 + 1;
                            I4.p pVar = (I4.p) list4.get(i5);
                            File file = this.f2839i;
                            i iVar2 = this.f2832b;
                            this.f2838h = pVar.b(file, iVar2.f2883e, iVar2.f2884f, iVar2.f2887i);
                            if (this.f2838h != null && this.f2832b.c(this.f2838h.f5355c.b()) != null) {
                                this.f2838h.f5355c.e(this.f2832b.f2892o, this);
                                z2 = true;
                            }
                        }
                        return z2;
                    }
                    int i10 = this.f2834d + 1;
                    this.f2834d = i10;
                    if (i10 >= list2.size()) {
                        int i11 = this.f2833c + 1;
                        this.f2833c = i11;
                        if (i11 >= arrayListA.size()) {
                            break;
                        }
                        this.f2834d = 0;
                    }
                    B4.d dVar = (B4.d) arrayListA.get(this.f2833c);
                    Class cls5 = (Class) list2.get(this.f2834d);
                    B4.k kVarE = this.f2832b.e(cls5);
                    i iVar3 = this.f2832b;
                    this.f2840j = new D(iVar3.f2881c.f24219a, dVar, iVar3.f2891n, iVar3.f2883e, iVar3.f2884f, kVarE, cls5, iVar3.f2887i);
                    File fileH = iVar3.f2886h.a().h(this.f2840j);
                    this.f2839i = fileH;
                    if (fileH != null) {
                        this.f2835e = dVar;
                        this.f2836f = this.f2832b.f2881c.f24220b.j(fileH);
                        this.f2837g = 0;
                    }
                }
            } else if (!File.class.equals(this.f2832b.k)) {
                throw new IllegalStateException("Failed to find any load path from " + this.f2832b.f2882d.getClass() + " to " + this.f2832b.k);
            }
        }
        return false;
    }

    @Override // C4.d
    public final void i(Object obj) {
        this.f2831a.a(this.f2835e, obj, this.f2838h.f5355c, 4, this.f2840j);
    }
}
