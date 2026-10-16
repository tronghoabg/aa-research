package com.waze.cf;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.a.l;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class a extends u implements l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f22175a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(Object obj, int i2) {
        super(1, obj, com.waze.cf.d.c.class, TtmlNode.START, "start(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.f22175a = i2;
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        if (this.f22175a != 0) {
            return ((com.waze.cf.c.l) this.receiver).l((h.c.e) obj);
        }
        return ((com.waze.cf.d.c) this.receiver).a((h.c.e) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(Object obj, int i2, byte[] bArr) {
        super(1, obj, com.waze.cf.c.l.class, TtmlNode.START, "start(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.f22175a = i2;
    }
}
