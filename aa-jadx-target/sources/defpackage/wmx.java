package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wmx {
    public int a;
    public boolean b;
    public final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior c;
    private final java.lang.Runnable d = new defpackage.wdg(this, 13, null);

    public wmx(com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior) {
        this.c = bottomSheetBehavior;
    }

    public final void a(int i) {
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.c;
        java.lang.ref.WeakReference weakReference = bottomSheetBehavior.C;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.a = i;
        if (this.b) {
            return;
        }
        ((android.view.View) bottomSheetBehavior.C.get()).postOnAnimation(this.d);
        this.b = true;
    }
}
