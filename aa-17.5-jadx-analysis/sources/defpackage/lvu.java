package defpackage;

import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class lvu implements Consumer {
    public final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ lvu(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.b;
        if (i == 0) {
            lvg lvgVar = (lvg) obj;
            lvgVar.j(this.a);
            lvl.a(lvgVar);
        } else {
            if (i == 1) {
                lvg.k((Bundle) obj, this.a);
                return;
            }
            if (i == 2) {
                lxb.t((Bundle) obj, this.a);
                return;
            }
            Preference preference = (Preference) obj;
            yph yphVar = xbo.f;
            preference.E(true);
            ((SwitchPreferenceCompat) preference).k(this.a);
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}
