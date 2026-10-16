package defpackage;

import android.os.Build;
import android.os.DeadObjectException;
import android.view.SoundEffectConstants;
import android.view.View;

/* loaded from: classes.dex */
public final class czm implements afeg {
    private final View a;

    public czm(View view) {
        this.a = view;
    }

    public final void a(int i, boolean z) {
        Integer numD = chw.d(i);
        if (numD != null) {
            int iIntValue = numD.intValue();
            try {
                this.a.playSoundEffect(Build.VERSION.SDK_INT >= 31 ? das.a(iIntValue, z) : SoundEffectConstants.getContantForFocusDirection(iIntValue));
            } catch (DeadObjectException unused) {
            }
        }
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        a(((chr) obj).a, ((Boolean) obj2).booleanValue());
        return afak.a;
    }
}
