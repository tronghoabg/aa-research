package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class ii implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f24608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24609b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f24610c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24611d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f24612e;

    public /* synthetic */ ii(Object obj, String str, String str2, long j2, int i2) {
        this.f24612e = i2;
        this.f24611d = obj;
        this.f24608a = str;
        this.f24609b = str2;
        this.f24610c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f24612e;
        long j2 = this.f24610c;
        if (i2 != 0) {
            String str = this.f24609b;
            gb.ShowCallbackTechCodePopupJNI$lambda$0((gb) this.f24611d, this.f24608a, str, j2);
        } else {
            String str2 = this.f24609b;
            iu.openInternalBrowserFromJniJNI$lambda$0((iu) this.f24611d, this.f24608a, str2, j2);
        }
    }
}
