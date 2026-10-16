package android.support.v4.app;

import android.content.res.Configuration;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.core.app.ActivityCompat;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.PrintWriter;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class au extends ba implements OnConfigurationChangedProvider, OnTrimMemoryProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, ViewModelStoreOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, SavedStateRegistryOwner, MenuHost, bz {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ av f136a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(av avVar) {
        super(avVar, avVar, new Handler());
        this.f136a = avVar;
        h.g.b.x.f(avVar, "activity");
    }

    @Override // android.support.v4.app.ba, android.support.v4.app.ay
    public final View a(int i2) {
        return this.f136a.findViewById(i2);
    }

    @Override // androidx.core.view.MenuHost
    public final void addMenuProvider(MenuProvider menuProvider) {
        this.f136a.addMenuProvider(menuProvider);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void addOnConfigurationChangedListener(Consumer<Configuration> consumer) {
        this.f136a.addOnConfigurationChangedListener(consumer);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void addOnMultiWindowModeChangedListener(Consumer<MultiWindowModeChangedInfo> consumer) {
        this.f136a.addOnMultiWindowModeChangedListener(consumer);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void addOnPictureInPictureModeChangedListener(Consumer<PictureInPictureModeChangedInfo> consumer) {
        this.f136a.addOnPictureInPictureModeChangedListener(consumer);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void addOnTrimMemoryListener(Consumer<Integer> consumer) {
        this.f136a.addOnTrimMemoryListener(consumer);
    }

    @Override // android.support.v4.app.ba, android.support.v4.app.ay
    public final boolean b() {
        Window window = this.f136a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // android.support.v4.app.ba
    public final LayoutInflater c() {
        av avVar = this.f136a;
        return avVar.getLayoutInflater().cloneInContext(avVar);
    }

    @Override // android.support.v4.app.ba
    public final /* synthetic */ Object d() {
        return this.f136a;
    }

    @Override // android.support.v4.app.ba
    public final void e() {
        this.f136a.invalidateMenu();
    }

    @Override // android.support.v4.app.ba
    public final boolean f(String str) {
        return ActivityCompat.shouldShowRequestPermissionRationale(this.f136a, str);
    }

    @Override // android.support.v4.app.ba
    public final void g(PrintWriter printWriter, String[] strArr) {
        this.f136a.dump("  ", null, printWriter, strArr);
    }

    @Override // androidx.activity.result.ActivityResultRegistryOwner
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.f136a.getActivityResultRegistry();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.f136a.f137a;
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f136a.getOnBackPressedDispatcher();
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.f136a.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return this.f136a.getViewModelStore();
    }

    @Override // androidx.core.view.MenuHost
    public final void invalidateMenu() {
        this.f136a.invalidateMenu();
    }

    @Override // androidx.core.view.MenuHost
    public final void removeMenuProvider(MenuProvider menuProvider) {
        this.f136a.removeMenuProvider(menuProvider);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void removeOnConfigurationChangedListener(Consumer<Configuration> consumer) {
        this.f136a.removeOnConfigurationChangedListener(consumer);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void removeOnMultiWindowModeChangedListener(Consumer<MultiWindowModeChangedInfo> consumer) {
        this.f136a.removeOnMultiWindowModeChangedListener(consumer);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void removeOnPictureInPictureModeChangedListener(Consumer<PictureInPictureModeChangedInfo> consumer) {
        this.f136a.removeOnPictureInPictureModeChangedListener(consumer);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void removeOnTrimMemoryListener(Consumer<Integer> consumer) {
        this.f136a.removeOnTrimMemoryListener(consumer);
    }

    @Override // androidx.core.view.MenuHost
    public final void addMenuProvider(MenuProvider menuProvider, LifecycleOwner lifecycleOwner) {
        this.f136a.addMenuProvider(menuProvider, lifecycleOwner);
    }

    @Override // androidx.core.view.MenuHost
    public final void addMenuProvider(MenuProvider menuProvider, LifecycleOwner lifecycleOwner, Lifecycle.State state) {
        this.f136a.addMenuProvider(menuProvider, lifecycleOwner, state);
    }

    @Override // android.support.v4.app.bz
    public final void onAttachFragment(bv bvVar, ar arVar) {
    }
}
