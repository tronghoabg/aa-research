package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class bc extends defpackage.od {
    final defpackage.eqi a;
    boolean b;
    boolean c;
    boolean d;
    public final defpackage.kwv e;

    public bc(byte[] bArr) {
        this.h = 2131624276;
        this.e = new defpackage.kwv(new defpackage.bb(this));
        this.a = new defpackage.eqi(this, true);
        this.d = true;
        o();
    }

    private final void o() {
        int i = 1;
        getSavedStateRegistry().c("android:support:lifecycle", new defpackage.bi((java.lang.Object) this, i));
        fM(new defpackage.ba(this, i));
        this.k.add(new defpackage.ba(this, 0));
        u(new defpackage.eo((defpackage.od) this, i));
    }

    private static boolean p(defpackage.bt btVar, defpackage.epx epxVar) {
        boolean zP = false;
        for (android.support.v4.app.Fragment fragment : btVar.l()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zP |= p(fragment.getChildFragmentManager(), epxVar);
                }
                defpackage.cl clVar = fragment.mViewLifecycleOwner;
                if (clVar != null && ((defpackage.eqi) clVar.getLifecycle()).e.a(defpackage.epx.d)) {
                    fragment.mViewLifecycleOwner.a.f(epxVar);
                    zP = true;
                }
                if (fragment.mLifecycleRegistry.e.a(defpackage.epx.d)) {
                    fragment.mLifecycleRegistry.f(epxVar);
                    zP = true;
                }
            }
        }
        return zP;
    }

    public final defpackage.bt a() {
        return this.e.X();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            java.lang.String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && android.os.Build.VERSION.SDK_INT >= 31) {
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (android.os.Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (android.os.Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && android.os.Build.VERSION.SDK_INT >= 29) {
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill")) {
                    }
                    break;
            }
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        printWriter.println(" State:");
        java.lang.String strConcat = java.lang.String.valueOf(str).concat("  ");
        printWriter.print(strConcat);
        printWriter.print("mCreated=");
        printWriter.print(this.b);
        printWriter.print(" mResumed=");
        printWriter.print(this.c);
        printWriter.print(" mStopped=");
        printWriter.print(this.d);
        if (getApplication() != null) {
            defpackage.ess.a(this).c(strConcat, fileDescriptor, printWriter, strArr);
        }
        this.e.X().H(str, fileDescriptor, printWriter, strArr);
    }

    final android.view.View fI(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return this.e.Y(view, str, context, attributeSet);
    }

    final void fJ() {
        while (p(a(), defpackage.epx.c)) {
        }
    }

    protected void fK() {
        this.a.e(defpackage.epw.ON_RESUME);
        this.e.ad();
    }

    @Override // defpackage.od, android.app.Activity
    protected void onActivityResult(int i, int i2, android.content.Intent intent) {
        this.e.ag();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.od, defpackage.cs, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.a.e(defpackage.epw.ON_CREATE);
        this.e.aa();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View viewFI = fI(null, str, context, attributeSet);
        return viewFI == null ? super.onCreateView(str, context, attributeSet) : viewFI;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.e.ab();
        this.a.e(defpackage.epw.ON_DESTROY);
    }

    @Override // defpackage.od, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((defpackage.bg) this.e.a).e.Y(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.c = false;
        this.e.ac();
        this.a.e(defpackage.epw.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        fK();
    }

    @Override // defpackage.od, android.app.Activity
    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        this.e.ag();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        defpackage.kwv kwvVar = this.e;
        kwvVar.ag();
        super.onResume();
        this.c = true;
        kwvVar.ai();
    }

    @Override // android.app.Activity
    protected void onStart() {
        defpackage.kwv kwvVar = this.e;
        kwvVar.ag();
        super.onStart();
        this.d = false;
        if (!this.b) {
            this.b = true;
            kwvVar.Z();
        }
        kwvVar.ai();
        this.a.e(defpackage.epw.ON_START);
        kwvVar.ae();
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.e.ag();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.d = true;
        fJ();
        this.e.af();
        this.a.e(defpackage.epw.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View viewFI = fI(view, str, context, attributeSet);
        return viewFI == null ? super.onCreateView(view, str, context, attributeSet) : viewFI;
    }

    public bc() {
        this.e = new defpackage.kwv(new defpackage.bb(this));
        this.a = new defpackage.eqi(this, true);
        this.d = true;
        o();
    }
}
