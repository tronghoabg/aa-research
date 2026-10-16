package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public class bc extends ob {
    final eqc a;
    boolean b;
    boolean c;
    boolean d;
    public final kwp e;

    public bc(byte[] bArr) {
        this.h = R.layout.main_activity_layout;
        this.e = new kwp(new bb(this));
        this.a = new eqc(this, true);
        this.d = true;
        o();
    }

    private final void o() {
        int i = 1;
        getSavedStateRegistry().c("android:support:lifecycle", new bi((Object) this, i));
        gB(new ba(this, i));
        this.k.add(new ba(this, 0));
        u(new eo((ob) this, i));
    }

    private static boolean p(bt btVar, eps epsVar) {
        boolean zP = false;
        for (Fragment fragment : btVar.l()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zP |= p(fragment.getChildFragmentManager(), epsVar);
                }
                cl clVar = fragment.mViewLifecycleOwner;
                if (clVar != null && ((eqc) clVar.getLifecycle()).e.a(eps.d)) {
                    fragment.mViewLifecycleOwner.a.f(epsVar);
                    zP = true;
                }
                if (fragment.mLifecycleRegistry.e.a(eps.d)) {
                    fragment.mLifecycleRegistry.f(epsVar);
                    zP = true;
                }
            }
        }
        return zP;
    }

    public final bt a() {
        return this.e.A();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
        /*
            r2 = this;
            super.dump(r3, r4, r5, r6)
            if (r6 == 0) goto L54
            int r0 = r6.length
            if (r0 != 0) goto L9
            goto L54
        L9:
            r0 = 0
            r0 = r6[r0]
            int r1 = r0.hashCode()
            switch(r1) {
                case -645125871: goto L45;
                case 100470631: goto L35;
                case 472614934: goto L2c;
                case 1159329357: goto L1d;
                case 1455016274: goto L14;
                default: goto L13;
            }
        L13:
            goto L54
        L14:
            java.lang.String r1 = "--autofill"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L53
            goto L54
        L1d:
            java.lang.String r1 = "--contentcapture"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L54
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L54
            goto L53
        L2c:
            java.lang.String r1 = "--list-dumpables"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L54
            goto L3e
        L35:
            java.lang.String r1 = "--dump-dumpable"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3e
            goto L54
        L3e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L54
            goto L53
        L45:
            java.lang.String r1 = "--translation"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L54
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L54
        L53:
            return
        L54:
            r5.print(r3)
            java.lang.String r0 = "Local FragmentActivity "
            r5.print(r0)
            int r0 = java.lang.System.identityHashCode(r2)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " State:"
            r5.println(r0)
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "  "
            java.lang.String r0 = r0.concat(r1)
            r5.print(r0)
            java.lang.String r1 = "mCreated="
            r5.print(r1)
            boolean r1 = r2.b
            r5.print(r1)
            java.lang.String r1 = " mResumed="
            r5.print(r1)
            boolean r1 = r2.c
            r5.print(r1)
            java.lang.String r1 = " mStopped="
            r5.print(r1)
            boolean r1 = r2.d
            r5.print(r1)
            android.app.Application r1 = r2.getApplication()
            if (r1 == 0) goto La4
            esm r1 = defpackage.esm.a(r2)
            r1.c(r0, r4, r5, r6)
        La4:
            kwp r2 = r2.e
            bt r2 = r2.A()
            r2.H(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bc.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    final View gx(View view, String str, Context context, AttributeSet attributeSet) {
        return this.e.B(view, str, context, attributeSet);
    }

    final void gy() {
        while (p(a(), eps.c)) {
        }
    }

    protected void gz() {
        this.a.e(epr.ON_RESUME);
        this.e.G();
    }

    @Override // defpackage.ob, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.e.J();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.ob, defpackage.cs, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.e(epr.ON_CREATE);
        this.e.D();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewGx = gx(null, str, context, attributeSet);
        return viewGx == null ? super.onCreateView(str, context, attributeSet) : viewGx;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.e.E();
        this.a.e(epr.ON_DESTROY);
    }

    @Override // defpackage.ob, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((bg) this.e.a).e.Y(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.c = false;
        this.e.F();
        this.a.e(epr.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        gz();
    }

    @Override // defpackage.ob, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.e.J();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        kwp kwpVar = this.e;
        kwpVar.J();
        super.onResume();
        this.c = true;
        kwpVar.L();
    }

    @Override // android.app.Activity
    protected void onStart() {
        kwp kwpVar = this.e;
        kwpVar.J();
        super.onStart();
        this.d = false;
        if (!this.b) {
            this.b = true;
            kwpVar.C();
        }
        kwpVar.L();
        this.a.e(epr.ON_START);
        kwpVar.H();
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.e.J();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.d = true;
        gy();
        this.e.I();
        this.a.e(epr.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewGx = gx(view, str, context, attributeSet);
        return viewGx == null ? super.onCreateView(view, str, context, attributeSet) : viewGx;
    }

    public bc() {
        this.e = new kwp(new bb(this));
        this.a = new eqc(this, true);
        this.d = true;
        o();
    }
}
