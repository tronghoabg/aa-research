package com.unity3d.services.ads.operation.load;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoadOperationState f32717b;

    public /* synthetic */ a(LoadOperationState loadOperationState, int i5) {
        this.f32716a = i5;
        this.f32717b = loadOperationState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32716a) {
            case 0:
                LoadModuleDecoratorTimeout.lambda$onOperationTimeout$0(this.f32717b);
                break;
            default:
                this.f32717b.lambda$onUnityAdsAdLoaded$1();
                break;
        }
    }
}
