package com.waze.r;

import androidx.lifecycle.MutableLiveData;
import com.waze.sharedui.web.ad;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f implements ad {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MutableLiveData f33503a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f33504b;

    f(MutableLiveData mutableLiveData, h hVar) {
        this.f33503a = mutableLiveData;
        this.f33504b = hVar;
    }

    @Override // com.waze.sharedui.web.ad
    public final void a() {
        this.f33504b.n().j().invoke();
    }

    @Override // com.waze.sharedui.web.ad
    public final void b(boolean z) {
        this.f33503a.setValue(false);
    }

    @Override // com.waze.sharedui.web.ad
    public final void c() {
        this.f33503a.setValue(true);
    }
}
