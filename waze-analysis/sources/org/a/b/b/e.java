package org.a.b.b;

import androidx.lifecycle.ViewModel;
import com.waze.places.o;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class e extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private org.a.d.k.b f56359a;

    public final org.a.d.k.b a() {
        return this.f56359a;
    }

    public final void b(org.a.d.k.b bVar) {
        this.f56359a = bVar;
    }

    @Override // androidx.lifecycle.ViewModel
    protected final void onCleared() {
        org.a.d.k.b bVar = this.f56359a;
        if (bVar != null && bVar.k()) {
            o oVarN = bVar.n();
            Objects.toString(bVar);
            oVarN.c("Closing scope ".concat(bVar.toString()));
            bVar.h();
        }
        this.f56359a = null;
    }
}
