package com.waze;

import android.content.Intent;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class cp implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f23197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23198b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23199c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23200d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f23201e;

    cp(NativeManager nativeManager, String str, String str2, String str3, int i2) {
        this.f23201e = i2;
        this.f23198b = str;
        this.f23199c = str2;
        this.f23197a = str3;
        Objects.requireNonNull(nativeManager);
        this.f23200d = nativeManager;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.waze.cr, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f23201e == 0) {
            String str = this.f23197a;
            Object obj = this.f23200d;
            cq.b((cq) this.f23198b, this.f23199c, (Intent) obj, str);
            return;
        }
        Object obj2 = this.f23200d;
        Object obj3 = this.f23198b;
        String str2 = (String) obj3;
        NativeManager nativeManager = (NativeManager) obj2;
        nativeManager.SuggsetUserNameRequestNTV(str2, (String) this.f23199c, this.f23197a);
    }

    public /* synthetic */ cp(cq cqVar, cr crVar, Intent intent, String str, int i2) {
        this.f23201e = i2;
        this.f23198b = cqVar;
        this.f23199c = crVar;
        this.f23200d = intent;
        this.f23197a = str;
    }
}
