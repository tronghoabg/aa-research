package Qc;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public String f9951a;

    /* renamed from: b, reason: collision with root package name */
    public String f9952b;

    /* renamed from: c, reason: collision with root package name */
    public String f9953c;

    /* renamed from: d, reason: collision with root package name */
    public String f9954d;

    /* renamed from: e, reason: collision with root package name */
    public String f9955e;

    /* renamed from: f, reason: collision with root package name */
    public String f9956f;

    /* renamed from: g, reason: collision with root package name */
    public String f9957g;

    /* renamed from: h, reason: collision with root package name */
    public String f9958h;

    /* renamed from: i, reason: collision with root package name */
    public String f9959i;

    /* renamed from: j, reason: collision with root package name */
    public String f9960j;
    public String k;

    /* renamed from: l, reason: collision with root package name */
    public String f9961l;

    /* renamed from: m, reason: collision with root package name */
    public String f9962m;

    /* renamed from: n, reason: collision with root package name */
    public String f9963n;

    public static f a(ArrayList arrayList) {
        f fVar = new f();
        String str = (String) arrayList.get(0);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
        }
        fVar.f9951a = str;
        String str2 = (String) arrayList.get(1);
        if (str2 == null) {
            throw new IllegalStateException("Nonnull field \"appId\" is null.");
        }
        fVar.f9952b = str2;
        String str3 = (String) arrayList.get(2);
        if (str3 == null) {
            throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
        }
        fVar.f9953c = str3;
        String str4 = (String) arrayList.get(3);
        if (str4 == null) {
            throw new IllegalStateException("Nonnull field \"projectId\" is null.");
        }
        fVar.f9954d = str4;
        fVar.f9955e = (String) arrayList.get(4);
        fVar.f9956f = (String) arrayList.get(5);
        fVar.f9957g = (String) arrayList.get(6);
        fVar.f9958h = (String) arrayList.get(7);
        fVar.f9959i = (String) arrayList.get(8);
        fVar.f9960j = (String) arrayList.get(9);
        fVar.k = (String) arrayList.get(10);
        fVar.f9961l = (String) arrayList.get(11);
        fVar.f9962m = (String) arrayList.get(12);
        fVar.f9963n = (String) arrayList.get(13);
        return fVar;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(14);
        arrayList.add(this.f9951a);
        arrayList.add(this.f9952b);
        arrayList.add(this.f9953c);
        arrayList.add(this.f9954d);
        arrayList.add(this.f9955e);
        arrayList.add(this.f9956f);
        arrayList.add(this.f9957g);
        arrayList.add(this.f9958h);
        arrayList.add(this.f9959i);
        arrayList.add(this.f9960j);
        arrayList.add(this.k);
        arrayList.add(this.f9961l);
        arrayList.add(this.f9962m);
        arrayList.add(this.f9963n);
        return arrayList;
    }
}
