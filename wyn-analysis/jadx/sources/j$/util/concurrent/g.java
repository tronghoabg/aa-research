package j$.util.concurrent;

import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class g extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    l[] f37817a;

    /* renamed from: b, reason: collision with root package name */
    l f37818b;

    /* renamed from: c, reason: collision with root package name */
    o f37819c;

    /* renamed from: d, reason: collision with root package name */
    o f37820d;

    /* renamed from: e, reason: collision with root package name */
    int f37821e;

    /* renamed from: f, reason: collision with root package name */
    int f37822f;

    /* renamed from: g, reason: collision with root package name */
    int f37823g;

    /* renamed from: h, reason: collision with root package name */
    final int f37824h;

    /* renamed from: i, reason: collision with root package name */
    int f37825i;

    /* renamed from: j, reason: collision with root package name */
    final Consumer f37826j;

    g(g gVar, int i5, int i10, int i11, l[] lVarArr, Consumer consumer) {
        super(gVar);
        this.f37825i = i5;
        this.f37822f = i10;
        this.f37821e = i10;
        this.f37817a = lVarArr;
        if (lVarArr == null) {
            this.f37823g = 0;
            this.f37824h = 0;
        } else if (gVar == null) {
            int length = lVarArr.length;
            this.f37823g = length;
            this.f37824h = length;
        } else {
            this.f37823g = i11;
            this.f37824h = gVar.f37824h;
        }
        this.f37826j = consumer;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x008d A[SYNTHETIC] */
    @Override // java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void compute() {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.g.compute():void");
    }
}
