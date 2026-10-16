package Uc;

import A.AbstractC0213f;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public int f12757a;

    /* renamed from: b, reason: collision with root package name */
    public r f12758b;

    /* renamed from: c, reason: collision with root package name */
    public Long f12759c;

    /* renamed from: d, reason: collision with root package name */
    public Long f12760d;

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList(4);
        int i5 = this.f12757a;
        arrayList.add(i5 == 0 ? null : Integer.valueOf(AbstractC0213f.f(i5)));
        r rVar = this.f12758b;
        arrayList.add(rVar != null ? rVar.b() : null);
        arrayList.add(this.f12759c);
        arrayList.add(this.f12760d);
        return arrayList;
    }
}
