package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class mox implements android.hardware.display.DisplayManager.DisplayListener {
    final /* synthetic */ defpackage.moy a;

    public mox(defpackage.moy moyVar) {
        this.a = moyVar;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        android.view.Display display = this.a.b.getDisplay(i);
        if (display != null) {
            display.getName();
            display.getFlags();
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        int state;
        defpackage.moy moyVar = this.a;
        android.view.Display display = moyVar.b.getDisplay(i);
        if (display != null) {
            display.getName();
            display.getFlags();
            if (i != moyVar.c.getDisplayId() || (state = moyVar.c.getState()) == moyVar.d) {
                return;
            }
            moyVar.a(state);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        defpackage.yqm yqmVar = defpackage.moy.a;
    }
}
