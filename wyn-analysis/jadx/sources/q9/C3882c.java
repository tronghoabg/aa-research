package q9;

import A.AbstractC0213f;
import com.applovin.shadow.okio.Segment;
import vf.AbstractC4345a;

/* renamed from: q9.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3882c {

    /* renamed from: a, reason: collision with root package name */
    public final e f44176a;

    /* renamed from: b, reason: collision with root package name */
    public final C3881b f44177b;

    /* renamed from: c, reason: collision with root package name */
    public final C3881b f44178c;

    public C3882c() {
        e eVar = new e();
        eVar.f44182b = 0;
        eVar.f44181a = new byte[Segment.SHARE_MINIMUM];
        this.f44176a = eVar;
        this.f44177b = new C3881b(this, 0);
        this.f44178c = new C3881b(this, 1);
    }

    public final AbstractC4345a a(int i5) {
        return AbstractC0213f.b(i5, 2) ? this.f44178c : this.f44177b;
    }
}
