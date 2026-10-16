package defpackage;

import android.view.View;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class k implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ float b;

    public k(View view, float f) {
        this.a = view;
        this.b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.animate().translationX(this.b).setDuration(120L).withEndAction(new f(this, 2)).start();
    }
}
