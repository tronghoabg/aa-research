package com.waze.search;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class al implements com.waze.jni.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f35511a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f35512b;

    public /* synthetic */ al(h.g.a.l lVar, int i2) {
        this.f35512b = i2;
        this.f35511a = lVar;
    }

    @Override // com.waze.jni.a
    public final void a(Object obj) {
        int i2 = this.f35512b;
        if (i2 == 0) {
            an.getCategoryProducts$lambda$1(this.f35511a, (byte[]) obj);
        } else if (i2 != 1) {
            this.f35511a.invoke((Boolean) obj);
        } else {
            this.f35511a.invoke((h.ab) obj);
        }
    }
}
