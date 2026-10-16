package androidx.navigation;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import h.g.b.x;
import h.m.k;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class LongNavType extends NavType<Long> {
    public LongNavType() {
        super(false);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.NavType
    public Long get(Bundle bundle, String str) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        SavedStateReader.m13269constructorimpl(bundle);
        return Long.valueOf(SavedStateReader.m13310getLongimpl(bundle, str));
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return "long";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.NavType
    public Long parseValue(String str) throws NumberFormatException {
        String strSubstring;
        long j2;
        x.f(str, "value");
        if (o.l(str, "L", false)) {
            strSubstring = str.substring(0, str.length() - 1);
            x.e(strSubstring, "substring(...)");
        } else {
            strSubstring = str;
        }
        if (o.ah(str, "0x")) {
            String strSubstring2 = strSubstring.substring(2);
            x.e(strSubstring2, "substring(...)");
            k.y(16);
            j2 = Long.parseLong(strSubstring2, 16);
        } else {
            j2 = Long.parseLong(strSubstring);
        }
        return Long.valueOf(j2);
    }

    public void put(Bundle bundle, String str, long j2) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        SavedStateWriter.m13355constructorimpl(bundle);
        SavedStateWriter.m13376putLongimpl(bundle, str, j2);
    }

    @Override // androidx.navigation.NavType
    public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Long l2) {
        put(bundle, str, l2.longValue());
    }
}
