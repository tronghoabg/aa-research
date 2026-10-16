package com.waze.uid.state_impl.a;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import com.waze.shared_infra.q.i;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final MutableLiveData f44572a;

    /* renamed from: b, reason: collision with root package name */
    private final LiveData f44573b;

    /* renamed from: c, reason: collision with root package name */
    private final LiveData f44574c;

    /* renamed from: d, reason: collision with root package name */
    private final LiveData f44575d;

    public f() {
        MutableLiveData mutableLiveData = new MutableLiveData(null);
        this.f44572a = mutableLiveData;
        this.f44573b = Transformations.map(mutableLiveData, new com.waze.ui.x.a(13));
        this.f44574c = Transformations.map(mutableLiveData, new com.waze.ui.x.a(14));
        this.f44575d = Transformations.map(mutableLiveData, new com.waze.ui.x.a(15));
    }

    public final LiveData a() {
        return this.f44574c;
    }

    public final LiveData b() {
        return this.f44573b;
    }

    public final LiveData c() {
        return this.f44575d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i d() {
        return (i) this.f44572a.getValue();
    }

    public final void e(long j2) {
        this.f44572a.setValue(new i(j2));
    }
}
