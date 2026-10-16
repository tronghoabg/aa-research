package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class y extends h.g.b.u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f36644a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(Object obj, int i2) {
        super(0, obj, com.waze.br.c.o.class, "onClickedOutside", "onClickedOutside()V", 0);
        this.f36644a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f36644a;
        if (i2 == 0) {
            ((com.waze.br.c.o) this.receiver).c();
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            ((com.waze.br.c.o) this.receiver).b();
            return h.ab.f48028a;
        }
        Object obj = this.receiver;
        if (i2 == 2) {
            return Boolean.valueOf(ck.H((ck) obj));
        }
        ((fi) obj).ao();
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(Object obj, int i2, byte[] bArr) {
        super(0, obj, com.waze.br.c.o.class, "onAgentMateClicked", "onAgentMateClicked()V", 0);
        this.f36644a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(Object obj, int i2, char[] cArr) {
        super(0, obj, ck.class, "mapExpanded", "mapExpanded()Z", 0);
        this.f36644a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(Object obj, int i2, short[] sArr) {
        super(0, obj, fi.class, "clearDialog", "clearDialog()V", 0);
        this.f36644a = i2;
    }
}
