package Y1;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f16342a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16343b;

    /* renamed from: c, reason: collision with root package name */
    public final List f16344c;

    /* renamed from: d, reason: collision with root package name */
    public final List f16345d;

    public h(String str, long j8, ArrayList arrayList, List list) {
        this.f16342a = str;
        this.f16343b = j8;
        this.f16344c = DesugarCollections.unmodifiableList(arrayList);
        this.f16345d = DesugarCollections.unmodifiableList(list);
    }
}
