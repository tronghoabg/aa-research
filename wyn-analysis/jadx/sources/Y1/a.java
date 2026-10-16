package Y1;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f16300a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16301b;

    /* renamed from: c, reason: collision with root package name */
    public final List f16302c;

    /* renamed from: d, reason: collision with root package name */
    public final List f16303d;

    /* renamed from: e, reason: collision with root package name */
    public final List f16304e;

    /* renamed from: f, reason: collision with root package name */
    public final List f16305f;

    public a(long j8, int i5, ArrayList arrayList, List list, List list2, List list3) {
        this.f16300a = j8;
        this.f16301b = i5;
        this.f16302c = DesugarCollections.unmodifiableList(arrayList);
        this.f16303d = DesugarCollections.unmodifiableList(list);
        this.f16304e = DesugarCollections.unmodifiableList(list2);
        this.f16305f = DesugarCollections.unmodifiableList(list3);
    }
}
