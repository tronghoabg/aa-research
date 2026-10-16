package xd;

import ff.AbstractC2641B;
import io.ktor.utils.io.N;
import kotlin.jvm.internal.AbstractC3340k;
import p7.AbstractC3772b;
import wd.C4402c;

/* loaded from: classes5.dex */
public final class e extends C4511c {

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f47891f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f47892g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C4402c client, Fd.b bVar, Gd.a aVar, byte[] bArr) {
        super(client);
        AbstractC3340k.e(client, "client");
        this.f47891f = bArr;
        this.f47886b = new f(this, bVar);
        this.f47887c = new Gd.a(this, bArr, aVar);
        AbstractC3772b.j(AbstractC2641B.h(aVar), bArr.length, bVar.h());
        this.f47892g = true;
    }

    @Override // xd.C4511c
    public final boolean c() {
        return this.f47892g;
    }

    @Override // xd.C4511c
    public final Object f() {
        return N.a(this.f47891f);
    }
}
