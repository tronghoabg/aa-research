package androidx.navigation;

import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import h.g.b.x;
import h.m.k;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class IntNavType extends NavType<Integer> {
    public IntNavType() {
        super(false);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.NavType
    public Integer get(Bundle bundle, String str) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        SavedStateReader.m13269constructorimpl(bundle);
        return Integer.valueOf(SavedStateReader.m13300getIntimpl(bundle, str));
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return TypedValues.Custom.S_INT;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.NavType
    public Integer parseValue(String str) throws NumberFormatException {
        int i2;
        x.f(str, "value");
        if (o.ah(str, "0x")) {
            String strSubstring = str.substring(2);
            x.e(strSubstring, "substring(...)");
            k.y(16);
            i2 = Integer.parseInt(strSubstring, 16);
        } else {
            i2 = Integer.parseInt(str);
        }
        return Integer.valueOf(i2);
    }

    public void put(Bundle bundle, String str, int i2) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        SavedStateWriter.m13355constructorimpl(bundle);
        SavedStateWriter.m13372putIntimpl(bundle, str, i2);
    }

    @Override // androidx.navigation.NavType
    public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Integer num) {
        put(bundle, str, num.intValue());
    }
}
