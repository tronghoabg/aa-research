package androidx.lifecycle;

import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ViewModelProviderGetKt {
    public static final /* synthetic */ <VM extends ViewModel> VM get(ViewModelProvider viewModelProvider, String str) {
        x.f(viewModelProvider, "<this>");
        x.f(str, "key");
        x.i();
        int i2 = ar.f48106a;
        return (VM) viewModelProvider.get(str, new m(ViewModel.class));
    }

    public static final /* synthetic */ <VM extends ViewModel> VM get(ViewModelProvider viewModelProvider) {
        x.f(viewModelProvider, "<this>");
        x.i();
        int i2 = ar.f48106a;
        return (VM) viewModelProvider.get(new m(ViewModel.class));
    }
}
