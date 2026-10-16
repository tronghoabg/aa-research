package com.waze.map.main;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class bq implements com.waze.jni.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f29405a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f29406b;

    public /* synthetic */ bq(h.g.a.l lVar, int i2) {
        this.f29406b = i2;
        this.f29405a = lVar;
    }

    @Override // com.waze.jni.a
    public final void a(Object obj) {
        int i2 = this.f29406b;
        if (i2 == 0) {
            bt.fetchMyLocationPopupInfo$lambda$1(this.f29405a, (byte[]) obj);
            return;
        }
        if (i2 == 1) {
            bt.fetchParkingSuggestionPopupInfo$lambda$1(this.f29405a, (byte[]) obj);
        } else if (i2 == 2) {
            bt.fetchParkingSuggestionPopupInfoWithEta$lambda$1(this.f29405a, (byte[]) obj);
        } else if (i2 != 3) {
            bt.fetchDetailsPopupInfo$lambda$1(this.f29405a, (byte[]) obj);
        } else {
            bt.fetchWazerPopupInfo$lambda$1(this.f29405a, (byte[]) obj);
        }
    }
}
