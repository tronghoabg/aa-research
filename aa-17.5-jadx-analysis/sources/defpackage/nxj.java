package defpackage;

import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class nxj implements afec {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public nxj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v13, types: [afck, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [afck, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.a.get(((Number) obj).intValue());
                return null;
            case 1:
                KeyEvent keyEvent = ((cpo) obj).a;
                keyEvent.getClass();
                boolean z = true;
                if (a.Y(rl.e(keyEvent), 1) && a.j(rl.f(keyEvent), ti.g(4))) {
                    nxm.a.l().u("Closing due to KEYCODE_BACK.");
                    this.a.invoke();
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                cks cksVar = (cks) obj;
                cksVar.getClass();
                ?? r7 = this.a;
                cksVar.z(((Number) r7.a()).floatValue());
                cksVar.A(((Number) r7.a()).floatValue());
                return afak.a;
            case 3:
                this.a.get(((Number) obj).intValue());
                return null;
            case 4:
                this.a.get(((Number) obj).intValue());
                return null;
            case 5:
                this.a.get(((Number) obj).intValue());
                return null;
            case 6:
                ((emm) this.a).b();
                return afak.a;
            case 7:
                ((View) obj).getClass();
                ?? r72 = this.a;
                afak afakVar = afak.a;
                r72.w(afakVar);
                return afakVar;
            default:
                ?? r73 = this.a;
                afak afakVar2 = afak.a;
                r73.w(afakVar2);
                return afakVar2;
        }
    }
}
