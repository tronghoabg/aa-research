package androidx.fragment.app;

import X0.InterfaceC1273a;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1459x;
import androidx.lifecycle.EnumC1449m;
import androidx.lifecycle.EnumC1450n;
import f.InterfaceC2544b;
import j1.InterfaceC3073a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements InterfaceC1273a {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final C1459x mFragmentLifecycleRegistry;
    final N mFragments;
    boolean mResumed;
    boolean mStopped;

    public FragmentActivity() {
        this.mFragments = new N(new J(this));
        this.mFragmentLifecycleRegistry = new C1459x(this);
        this.mStopped = true;
        u();
    }

    public static boolean B(e0 e0Var) {
        boolean zB = false;
        for (F f10 : e0Var.f18410c.f()) {
            if (f10 != null) {
                if (f10.getHost() != null) {
                    zB |= B(f10.getChildFragmentManager());
                }
                w0 w0Var = f10.mViewLifecycleOwner;
                EnumC1450n enumC1450n = EnumC1450n.f18679d;
                if (w0Var != null) {
                    w0Var.b();
                    if (w0Var.f18561d.f18692d.compareTo(enumC1450n) >= 0) {
                        f10.mViewLifecycleOwner.f18561d.h();
                        zB = true;
                    }
                }
                if (f10.mLifecycleRegistry.f18692d.compareTo(enumC1450n) >= 0) {
                    f10.mLifecycleRegistry.h();
                    zB = true;
                }
            }
        }
        return zB;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f18331a.f18335d.f18413f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                J1.a.a(this).b(str2, printWriter);
            }
            this.mFragments.f18331a.f18335d.v(str, fileDescriptor, printWriter, strArr);
        }
    }

    public e0 getSupportFragmentManager() {
        return this.mFragments.f18331a.f18335d;
    }

    @Deprecated
    public J1.a getSupportLoaderManager() {
        return J1.a.a(this);
    }

    public void markFragmentsCreated() {
        while (B(getSupportFragmentManager())) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i5, int i10, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i5, i10, intent);
    }

    @Deprecated
    public void onAttachFragment(F f10) {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.f(EnumC1449m.ON_CREATE);
        f0 f0Var = this.mFragments.f18331a.f18335d;
        f0Var.f18400G = false;
        f0Var.f18401H = false;
        f0Var.f18406N.f18457g = false;
        f0Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f18331a.f18335d.l();
        this.mFragmentLifecycleRegistry.f(EnumC1449m.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i5, MenuItem menuItem) {
        if (super.onMenuItemSelected(i5, menuItem)) {
            return true;
        }
        if (i5 == 6) {
            return this.mFragments.f18331a.f18335d.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f18331a.f18335d.u(5);
        this.mFragmentLifecycleRegistry.f(EnumC1449m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i5, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f18331a.f18335d.z(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.f(EnumC1449m.ON_RESUME);
        f0 f0Var = this.mFragments.f18331a.f18335d;
        f0Var.f18400G = false;
        f0Var.f18401H = false;
        f0Var.f18406N.f18457g = false;
        f0Var.u(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            f0 f0Var = this.mFragments.f18331a.f18335d;
            f0Var.f18400G = false;
            f0Var.f18401H = false;
            f0Var.f18406N.f18457g = false;
            f0Var.u(4);
        }
        this.mFragments.f18331a.f18335d.z(true);
        this.mFragmentLifecycleRegistry.f(EnumC1449m.ON_START);
        f0 f0Var2 = this.mFragments.f18331a.f18335d;
        f0Var2.f18400G = false;
        f0Var2.f18401H = false;
        f0Var2.f18406N.f18457g = false;
        f0Var2.u(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        f0 f0Var = this.mFragments.f18331a.f18335d;
        f0Var.f18401H = true;
        f0Var.f18406N.f18457g = true;
        f0Var.u(4);
        this.mFragmentLifecycleRegistry.f(EnumC1449m.ON_STOP);
    }

    public void setEnterSharedElementCallback(X0.U u10) {
        setEnterSharedElementCallback((SharedElementCallback) null);
    }

    public void setExitSharedElementCallback(X0.U u10) {
        setExitSharedElementCallback((SharedElementCallback) null);
    }

    public void startActivityFromFragment(F f10, Intent intent, int i5, Bundle bundle) {
        if (i5 == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            f10.startActivityForResult(intent, i5, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(F f10, IntentSender intentSender, int i5, Intent intent, int i10, int i11, int i12, Bundle bundle) throws IntentSender.SendIntentException {
        if (i5 == -1) {
            startIntentSenderForResult(intentSender, i5, intent, i10, i11, i12, bundle);
        } else {
            f10.startIntentSenderForResult(intentSender, i5, intent, i10, i11, i12, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    public final void u() {
        getSavedStateRegistry().c("android:support:lifecycle", new G(this, 0));
        final int i5 = 0;
        addOnConfigurationChangedListener(new InterfaceC3073a(this) { // from class: androidx.fragment.app.H

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentActivity f18321b;

            {
                this.f18321b = this;
            }

            @Override // j1.InterfaceC3073a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        this.f18321b.mFragments.a();
                        break;
                    default:
                        this.f18321b.mFragments.a();
                        break;
                }
            }
        });
        final int i10 = 1;
        addOnNewIntentListener(new InterfaceC3073a(this) { // from class: androidx.fragment.app.H

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentActivity f18321b;

            {
                this.f18321b = this;
            }

            @Override // j1.InterfaceC3073a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.f18321b.mFragments.a();
                        break;
                    default:
                        this.f18321b.mFragments.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new InterfaceC2544b() { // from class: androidx.fragment.app.I
            @Override // f.InterfaceC2544b
            public final void a(ComponentActivity componentActivity) {
                J j8 = this.f18322a.mFragments.f18331a;
                j8.f18335d.b(j8, j8, null);
            }
        });
    }

    @Override // X0.InterfaceC1273a
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i5) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(F f10, Intent intent, int i5) {
        startActivityFromFragment(f10, intent, i5, (Bundle) null);
    }

    public FragmentActivity(int i5) {
        super(i5);
        this.mFragments = new N(new J(this));
        this.mFragmentLifecycleRegistry = new C1459x(this);
        this.mStopped = true;
        u();
    }
}
