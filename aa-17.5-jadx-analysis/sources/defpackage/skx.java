package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class skx extends Exception {
    private final yw a;

    public skx(yw ywVar) {
        this.a = ywVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Throwable
    public final String getMessage() {
        ArrayList arrayList = new ArrayList();
        yw ywVar = this.a;
        boolean z = true;
        for (slr slrVar : ywVar.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) ywVar.get(slrVar);
            spu.aw(connectionResult);
            z &= !connectionResult.c();
            arrayList.add(slrVar.a() + ": " + connectionResult.toString());
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }
}
