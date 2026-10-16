package com.waze.authentication;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class av implements com.google.android.gms.o.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aw f15746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15747b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f15748c;

    public /* synthetic */ av(aw awVar, Object obj, int i2) {
        this.f15748c = i2;
        this.f15746a = awVar;
        this.f15747b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map$Entry, kotlinx.coroutines.CompletableDeferred] */
    @Override // com.google.android.gms.o.m
    public final void onFailure(Exception exc) {
        int i2 = this.f15748c;
        ?? r1 = this.f15747b;
        aw awVar = this.f15746a;
        if (i2 != 0) {
            aw.h(awVar, r1, exc);
        } else {
            aw.g(awVar, r1, exc);
        }
    }
}
