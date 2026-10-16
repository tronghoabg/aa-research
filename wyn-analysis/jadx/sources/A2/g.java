package a2;

import java.util.List;
import l2.AbstractC3377b;

/* loaded from: classes.dex */
public final class g extends AbstractC3377b {

    /* renamed from: d, reason: collision with root package name */
    public final List f17163d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17164e;

    public g(long j8, List list) {
        super(0L, list.size() - 1);
        this.f17164e = j8;
        this.f17163d = list;
    }

    @Override // l2.m
    public final long f() {
        a();
        return this.f17164e + ((b2.g) this.f17163d.get((int) this.f39872c)).f19182e;
    }

    @Override // l2.m
    public final long h() {
        a();
        b2.g gVar = (b2.g) this.f17163d.get((int) this.f39872c);
        return this.f17164e + gVar.f19182e + gVar.f19180c;
    }
}
