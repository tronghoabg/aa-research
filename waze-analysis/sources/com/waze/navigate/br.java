package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class br implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bt f31138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f31139b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f31140c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f31141d;

    public /* synthetic */ br(bt btVar, String str, boolean z, int i2) {
        this.f31141d = i2;
        this.f31138a = btVar;
        this.f31139b = str;
        this.f31140c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f31141d;
        boolean z = this.f31140c;
        if (i2 != 0) {
            bt.openSearchActivityJNI$lambda$0(this.f31138a, this.f31139b, z);
        } else {
            bt.setCurrentStreetNameJNI$lambda$0(this.f31138a, this.f31139b, z);
        }
    }
}
