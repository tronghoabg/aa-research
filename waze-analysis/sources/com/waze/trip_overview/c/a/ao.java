package com.waze.trip_overview.c.a;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.waze.trip_overview.av;
import com.waze.trip_overview.bq;
import com.waze.trip_overview.de;
import com.waze.trip_overview.fh;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ao extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final de f41202a;

    /* renamed from: b, reason: collision with root package name */
    private final ch f41203b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f41204c;

    public ao(de deVar) {
        h.g.b.x.f(deVar, "routesController");
        this.f41202a = deVar;
        kotlinx.coroutines.b.k kVarM = m(new ag((h.c.e) null, 5, (boolean[]) null));
        ao aoVar = this;
        kotlinx.coroutines.af viewModelScope = ViewModelKt.getViewModelScope(aoVar);
        int i2 = bz.f51630a;
        this.f41203b = kotlinx.coroutines.b.ai.V(kVarM, viewModelScope, by.b(), null);
        this.f41204c = kotlinx.coroutines.b.ai.V(m(new ag((h.c.e) null, 6, (float[]) null)), ViewModelKt.getViewModelScope(aoVar), by.b(), null);
    }

    private final kotlinx.coroutines.b.k m(h.g.a.p pVar) {
        return kotlinx.coroutines.b.ai.y(new aj(kotlinx.coroutines.b.ai.D(new an(this.f41202a.p(), 0)), pVar));
    }

    public final kotlinx.coroutines.b.k a() {
        return new an(kotlinx.coroutines.b.ai.y(m(new ag((h.c.e) null, 1, (byte[]) null))), 1);
    }

    public final kotlinx.coroutines.b.k b() {
        return m(new ag(null, 0));
    }

    public final kotlinx.coroutines.b.k c() {
        return m(new ag((h.c.e) null, 2, (char[]) null));
    }

    public final kotlinx.coroutines.b.k d() {
        return m(new ag((h.c.e) null, 3, (short[]) null));
    }

    public final kotlinx.coroutines.b.k e() {
        return m(new ag((h.c.e) null, 4, (int[]) null));
    }

    public final kotlinx.coroutines.b.k f() {
        return kotlinx.coroutines.b.ai.D(m(new ag((h.c.e) null, 7, (byte[][]) null)));
    }

    public final kotlinx.coroutines.b.k g() {
        return m(new ag((h.c.e) null, 8, (char[][]) null));
    }

    public final ch h() {
        return this.f41203b;
    }

    public final ch i() {
        return this.f41204c;
    }

    public final ch j() {
        kotlinx.coroutines.b.k kVarM = m(new ag((h.c.e) null, 9, (short[][]) null));
        kotlinx.coroutines.af viewModelScope = ViewModelKt.getViewModelScope(this);
        int i2 = bz.f51630a;
        return kotlinx.coroutines.b.ai.V(kVarM, viewModelScope, by.c(), av.f41033a);
    }

    public final ch k() {
        kotlinx.coroutines.b.k kVarM = m(new ag((h.c.e) null, 10, (int[][]) null));
        kotlinx.coroutines.af viewModelScope = ViewModelKt.getViewModelScope(this);
        int i2 = bz.f51630a;
        return kotlinx.coroutines.b.ai.V(kVarM, viewModelScope, by.c(), bq.f41111a);
    }

    public final void l(fh fhVar) {
        h.g.b.x.f(fhVar, NotificationCompat.CATEGORY_EVENT);
        this.f41202a.t(fhVar);
    }
}
