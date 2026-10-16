package android.support.v4.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.loader.app.LoaderManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class av extends ComponentActivity implements ActivityCompat.OnRequestPermissionsResultCallback, ActivityCompat.RequestPermissionsRequestCodeValidator {

    /* renamed from: b, reason: collision with root package name */
    boolean f138b;

    /* renamed from: c, reason: collision with root package name */
    boolean f139c;

    /* renamed from: e, reason: collision with root package name */
    final bd f141e = bd.o(new au(this));

    /* renamed from: a, reason: collision with root package name */
    final LifecycleRegistry f137a = new LifecycleRegistry(this);

    /* renamed from: d, reason: collision with root package name */
    boolean f140d = true;

    public av() {
        int i2 = 1;
        getSavedStateRegistry().registerSavedStateProvider("android:support:lifecycle", new be(this, i2));
        addOnConfigurationChangedListener(new as(this, i2));
        addOnNewIntentListener(new as(this, 0));
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: android.support.v4.app.at
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public final void onContextAvailable(Context context) {
                this.f135a.f141e.l();
            }
        });
    }

    private static boolean d(bv bvVar, Lifecycle.State state) {
        boolean zD = false;
        for (ar arVar : bvVar.x()) {
            if (arVar != null) {
                if (arVar.getHost() != null) {
                    zD |= d(arVar.getChildFragmentManager(), state);
                }
                cr crVar = arVar.mViewLifecycleOwner;
                if (crVar != null && crVar.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    arVar.mViewLifecycleOwner.e(state);
                    zD = true;
                }
                if (arVar.mLifecycleRegistry.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    arVar.mLifecycleRegistry.setCurrentState(state);
                    zD = true;
                }
            }
        }
        return zD;
    }

    public final bv bv() {
        return this.f141e.a();
    }

    final View bw(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f141e.b(view, str, context, attributeSet);
    }

    final void c() {
        while (d(bv(), Lifecycle.State.CREATED)) {
        }
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String strConcat = String.valueOf(str).concat("  ");
            printWriter.print(strConcat);
            printWriter.print("mCreated=");
            printWriter.print(this.f138b);
            printWriter.print(" mResumed=");
            printWriter.print(this.f139c);
            printWriter.print(" mStopped=");
            printWriter.print(this.f140d);
            if (getApplication() != null) {
                LoaderManager.getInstance(this).dump(strConcat, fileDescriptor, printWriter, strArr);
            }
            this.f141e.a().ae(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        this.f141e.j();
        super.onActivityResult(i2, i3, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f137a.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        this.f141e.d();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewBw = bw(null, str, context, attributeSet);
        return viewBw == null ? super.onCreateView(str, context, attributeSet) : viewBw;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f141e.e();
        this.f137a.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 6) {
            return this.f141e.k(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f139c = false;
        this.f141e.f();
        this.f137a.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        this.f137a.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        this.f141e.g();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f141e.j();
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        bd bdVar = this.f141e;
        bdVar.j();
        super.onResume();
        this.f139c = true;
        bdVar.m();
    }

    @Override // android.app.Activity
    protected void onStart() {
        bd bdVar = this.f141e;
        bdVar.j();
        super.onStart();
        this.f140d = false;
        if (!this.f138b) {
            this.f138b = true;
            bdVar.c();
        }
        bdVar.m();
        this.f137a.handleLifecycleEvent(Lifecycle.Event.ON_START);
        bdVar.h();
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f141e.j();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f140d = true;
        c();
        this.f141e.i();
        this.f137a.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewBw = bw(view, str, context, attributeSet);
        return viewBw == null ? super.onCreateView(view, str, context, attributeSet) : viewBw;
    }

    @Override // androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i2) {
    }
}
