package W;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class a extends AbstractC3343n implements tf.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f14916i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S3.e f14917j;
    public final /* synthetic */ c k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f14918l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f14919m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object[] f14920n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, S3.e eVar, c cVar, String str, Object obj, Object[] objArr) {
        super(0);
        this.f14916i = bVar;
        this.f14917j = eVar;
        this.k = cVar;
        this.f14918l = str;
        this.f14919m = obj;
        this.f14920n = objArr;
    }

    @Override // tf.a
    public final Object invoke() throws Exception {
        boolean z2;
        b bVar = this.f14916i;
        c cVar = bVar.f14922b;
        c cVar2 = this.k;
        boolean z10 = true;
        if (cVar != cVar2) {
            bVar.f14922b = cVar2;
            z2 = true;
        } else {
            z2 = false;
        }
        String str = bVar.f14923c;
        String str2 = this.f14918l;
        if (AbstractC3340k.a(str, str2)) {
            z10 = z2;
        } else {
            bVar.f14923c = str2;
        }
        bVar.f14921a = this.f14917j;
        bVar.f14924d = this.f14919m;
        bVar.f14925e = this.f14920n;
        G9.e eVar = bVar.f14926f;
        if (eVar != null && z10) {
            eVar.H();
            bVar.f14926f = null;
            bVar.a();
        }
        return C2515C.f34653a;
    }
}
