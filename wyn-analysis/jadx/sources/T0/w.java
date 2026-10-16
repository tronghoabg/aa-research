package t0;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class w extends AbstractC3343n implements tf.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y f45545i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ X0.E f45546j;
    public final /* synthetic */ C4062j k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f45547l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C4060h f45548m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f45549n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f45550o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, X0.E e7, C4062j c4062j, long j8, C4060h c4060h, boolean z2, boolean z10) {
        super(0);
        this.f45545i = yVar;
        this.f45546j = e7;
        this.k = c4062j;
        this.f45547l = j8;
        this.f45548m = c4060h;
        this.f45549n = z2;
        this.f45550o = z10;
    }

    @Override // tf.a
    public final Object invoke() {
        X0.E e7 = (X0.E) this.f45546j.f15790d;
        boolean z2 = this.f45549n;
        boolean z10 = this.f45550o;
        y yVar = this.f45545i;
        C4062j c4062j = this.k;
        long j8 = this.f45547l;
        C4060h c4060h = this.f45548m;
        if (e7 == null) {
            yVar.Q(c4062j, j8, c4060h, z2, z10);
        } else {
            yVar.getClass();
            Object objB = c4062j.b(e7);
            w wVar = new w(yVar, e7, c4062j, j8, c4060h, z2, z10);
            c4060h.getClass();
            c4060h.c(objB, -1.0f, z10, wVar);
        }
        return C2515C.f34653a;
    }
}
