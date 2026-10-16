package A;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final S3.e f53a;

    /* renamed from: b, reason: collision with root package name */
    public final String f54b;

    /* renamed from: c, reason: collision with root package name */
    public S3.i f55c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ U f56d;

    public M(U u10, S3.e typeConverter, String label) {
        AbstractC3340k.e(typeConverter, "typeConverter");
        AbstractC3340k.e(label, "label");
        this.f56d = u10;
        this.f53a = typeConverter;
        this.f54b = label;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final S3.i a(tf.l lVar, tf.l lVar2) {
        S3.i iVar = this.f55c;
        U u10 = this.f56d;
        if (iVar == null) {
            O o7 = new O(u10, lVar2.invoke(u10.b()), AbstractC0226t.f(this.f53a, lVar2.invoke(u10.b())), this.f53a, this.f54b);
            iVar = new S3.i(this, o7, lVar, lVar2);
            this.f55c = iVar;
            u10.f86h.add(o7);
        }
        iVar.f10963c = (AbstractC3343n) lVar2;
        iVar.f10962b = (AbstractC3343n) lVar;
        iVar.i(u10.c());
        return iVar;
    }
}
