package defpackage;

import android.graphics.RectF;
import com.google.android.apps.auto.components.coolwalk.button.CoolwalkButton;

/* loaded from: classes2.dex */
public final class omq extends emn {
    public static final omq a = new omq();

    public static final void c(CoolwalkButton coolwalkButton, float f) {
        coolwalkButton.getClass();
        coolwalkButton.d(coolwalkButton.fD().c(f));
    }

    @Override // defpackage.emn
    public final /* bridge */ /* synthetic */ float a(Object obj) {
        CoolwalkButton coolwalkButton = (CoolwalkButton) obj;
        coolwalkButton.getClass();
        wtz wtzVar = coolwalkButton.fD().e;
        wtzVar.getClass();
        return wtzVar instanceof wtw ? ((wtw) wtzVar).a : wtzVar.a(new RectF(coolwalkButton.getLeft(), coolwalkButton.getTop(), coolwalkButton.getRight(), coolwalkButton.getBottom()));
    }

    @Override // defpackage.emn
    public final /* bridge */ /* synthetic */ void b(Object obj, float f) {
        c((CoolwalkButton) obj, f);
    }
}
