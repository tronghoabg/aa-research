package com.waze.realtime_report_feedback;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f33524a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33525b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f33526c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f33527d;

    public /* synthetic */ g(j jVar, int i2, String str, int i3) {
        this.f33527d = i3;
        this.f33524a = jVar;
        this.f33525b = i2;
        this.f33526c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f33527d;
        String str = this.f33526c;
        if (i2 != 0) {
            j.sendThumbsUpJNI$lambda$0(this.f33524a, this.f33525b, str);
        } else {
            j.sendThumbsDownJNI$lambda$0(this.f33524a, this.f33525b, str);
        }
    }
}
