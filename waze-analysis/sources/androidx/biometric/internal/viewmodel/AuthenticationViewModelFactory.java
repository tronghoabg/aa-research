package androidx.biometric.internal.viewmodel;

import androidx.biometric.internal.data.AuthenticationStateRepository;
import androidx.biometric.internal.data.PromptConfigRepository;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import h.g.b.x;
import h.l.c;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AuthenticationViewModelFactory implements ViewModelProvider.Factory {
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> cls) {
        x.f(cls, "modelClass");
        if (cls.isAssignableFrom(AuthenticationViewModel.class)) {
            return new AuthenticationViewModel(PromptConfigRepository.Companion.getInstance(), AuthenticationStateRepository.Companion.getInstance());
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
        return ViewModelProvider.Factory.CC.$default$create(this, cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(c cVar, CreationExtras creationExtras) {
        return ViewModelProvider.Factory.CC.$default$create(this, cVar, creationExtras);
    }
}
