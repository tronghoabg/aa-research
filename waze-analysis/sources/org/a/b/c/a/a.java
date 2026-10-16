package org.a.b.c.a;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.waze.uid.state_impl.email.n;
import h.g.b.x;
import h.l.c;
import org.a.d.k.b;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class a implements ViewModelProvider.Factory {

    /* renamed from: a, reason: collision with root package name */
    private final c f56360a;

    /* renamed from: b, reason: collision with root package name */
    private final b f56361b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f56362c;

    public a(c cVar, b bVar, h.g.a.a aVar) {
        x.f(cVar, "kClass");
        x.f(bVar, "scope");
        this.f56360a = cVar;
        this.f56361b = bVar;
        this.f56362c = aVar;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras) {
        x.f(cls, "modelClass");
        x.f(creationExtras, "extras");
        return (T) this.f56361b.a(this.f56360a, null, new n(new org.a.b.c.b.b(this.f56362c, creationExtras), 19));
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls) {
        return ViewModelProvider.Factory.CC.$default$create(this, cls);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(c cVar, CreationExtras creationExtras) {
        return ViewModelProvider.Factory.CC.$default$create(this, cVar, creationExtras);
    }
}
