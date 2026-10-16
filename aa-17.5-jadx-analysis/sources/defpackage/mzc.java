package defpackage;

import android.content.ComponentName;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;

/* loaded from: classes.dex */
public final /* synthetic */ class mzc implements afej {
    private final /* synthetic */ int a;

    @Override // defpackage.afej
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (this.a != 0) {
            ComponentName componentName = (ComponentName) obj;
            lok lokVar = (lok) obj3;
            return ((lol) obj2) == null ? new lre(componentName, lokVar, null, false) : new lre(componentName, lokVar, (AaPlaybackState) obj4, ((Boolean) obj5).booleanValue());
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue4 = ((Boolean) obj4).booleanValue();
        boolean zBooleanValue5 = ((Boolean) obj5).booleanValue();
        yph yphVar = mzf.a;
        return zBooleanValue ? mzb.a : zBooleanValue2 ? mzb.c : (zBooleanValue3 ^ true) | (zBooleanValue4 ^ true) ? mzb.b : zBooleanValue5 ? mzb.e : mzb.d;
    }
}
