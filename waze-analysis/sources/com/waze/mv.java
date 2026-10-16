package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class mv extends h.g.b.a implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public static final mv f30523a = new mv();

    mv() {
        super(1, NativeManager.class, "runOnNativeManagerReady", "runOnNativeManagerReady(Ljava/lang/Runnable;)Z", 8);
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        NativeManager.runOnNativeManagerReady((Runnable) obj);
        return h.ab.f48028a;
    }
}
