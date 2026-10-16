package z9;

import J9.C0650i;
import J9.C0651j;
import J9.C0652k;
import J9.C0663w;
import Re.C0813h;
import Re.C0818m;
import Re.C0821p;
import java.util.concurrent.Executor;
import o1.C3641c;
import za.C4658a;

/* renamed from: z9.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4623B {

    /* renamed from: a, reason: collision with root package name */
    public final C0650i f48414a;

    /* renamed from: b, reason: collision with root package name */
    public final C0652k f48415b;

    /* renamed from: c, reason: collision with root package name */
    public final C0651j f48416c;

    /* renamed from: d, reason: collision with root package name */
    public final J9.H f48417d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f48418e = false;

    /* renamed from: f, reason: collision with root package name */
    public A5.h f48419f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f48420g;

    /* JADX WARN: Multi-variable type inference failed */
    public C4623B(J9.C c10, J9.H h10, C0650i c0650i, P9.d dVar, C0652k c0652k, C0651j c0651j, Executor executor) throws Exception {
        He.c c0813h;
        He.c c0813h2;
        this.f48417d = h10;
        this.f48414a = c0650i;
        this.f48415b = c0652k;
        this.f48416c = c0651j;
        this.f48420g = executor;
        ((P9.c) dVar).d().addOnSuccessListener(executor, new m9.B(29));
        Re.Q q4 = c10.f5852j.f5916b;
        int i5 = He.c.f5007a;
        Re.Q q10 = c10.f5843a;
        Ne.b.a(q10, "source1 is null");
        Ne.b.a(q4, "source2 is null");
        Re.Q q11 = c10.f5844b;
        Ne.b.a(q11, "source3 is null");
        C0818m c0818m = new C0818m(new ug.a[]{q10, q4, q11}, 1);
        C4658a c4658a = Ne.b.f8671a;
        Ne.b.b(3, "maxConcurrency");
        int i10 = He.c.f5007a;
        Ne.b.b(i10, "bufferSize");
        if (c0818m instanceof Oe.f) {
            Object objCall = ((Oe.f) c0818m).call();
            c0813h = objCall == null ? Re.u.f10764b : new Re.S(objCall, c4658a);
        } else {
            c0813h = new C0813h(c0818m, i10);
        }
        C0821p c0821p = new C0821p(c0813h, new F5.d(19));
        J9.X x5 = c10.f5848f;
        He.m mVar = x5.f5906a;
        Ne.b.a(mVar, "scheduler is null");
        Ne.b.b(i10, "bufferSize");
        Re.B b5 = new Re.B(c0821p, mVar, i10);
        C0663w c0663w = new C0663w(c10, 1);
        Ne.b.b(2, "prefetch");
        if (b5 instanceof Oe.f) {
            Object objCall2 = ((Oe.f) b5).call();
            c0813h2 = objCall2 == null ? Re.u.f10764b : new Re.S(objCall2, c0663w);
        } else {
            c0813h2 = new C0813h(b5, c0663w);
        }
        He.m mVar2 = x5.f5907b;
        Ne.b.a(mVar2, "scheduler is null");
        Ne.b.b(i10, "bufferSize");
        new Re.B(c0813h2, mVar2, i10).d(new Xe.c(new C3641c(this, 26)));
    }
}
