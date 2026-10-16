package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ki implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f40375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f40376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f40377c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f40378d;

    public /* synthetic */ ki(Object obj, String str, boolean z, int i2) {
        this.f40378d = i2;
        this.f40377c = obj;
        this.f40375a = str;
        this.f40376b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f40378d;
        boolean z = this.f40376b;
        if (i2 != 0) {
            hs.playJNI$lambda$0((hs) this.f40377c, this.f40375a, z);
        } else {
            kj.onDownloadDoneJNI$lambda$0((kj) this.f40377c, this.f40375a, z);
        }
    }
}
