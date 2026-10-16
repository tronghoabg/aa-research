package defpackage;

import android.content.Context;
import com.google.android.gms.carsetup.CarInfoInternal;
import j$.util.Optional;

/* loaded from: classes2.dex */
public final class phk implements paj {
    private final Context a;

    static {
        yph.c("GH.WirelessStorage");
    }

    public phk(Context context) {
        this.a = context;
    }

    @Override // defpackage.paj
    public final Optional a(String str) {
        jlo jloVarB = b();
        try {
            Optional optionalOfNullable = Optional.ofNullable((CarInfoInternal) jloVarB.c(str, false).e());
            jloVarB.close();
            return optionalOfNullable;
        } catch (Throwable th) {
            try {
                jloVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final jlo b() {
        return new jlo(this.a);
    }
}
