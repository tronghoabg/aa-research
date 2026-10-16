package com.waze.config;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class dl implements com.waze.jni.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f22626a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f22627b;

    public /* synthetic */ dl(h.g.a.l lVar, int i2) {
        this.f22627b = i2;
        this.f22626a = lVar;
    }

    @Override // com.waze.jni.a
    public final void a(Object obj) {
        int i2 = this.f22627b;
        if (i2 == 0) {
            dn.getAvailableReportCategories$lambda$1(this.f22626a, (byte[]) obj);
        } else if (i2 == 1) {
            this.f22626a.invoke((h.ab) obj);
        } else if (i2 != 2) {
            dn.getAndroidAutoAvailableReportCategories$lambda$1(this.f22626a, (byte[]) obj);
        } else {
            dn.getWebUrlWhiteList$lambda$1(this.f22626a, (byte[]) obj);
        }
    }
}
