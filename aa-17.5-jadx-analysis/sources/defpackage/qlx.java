package defpackage;

import android.text.TextUtils;
import android.util.Log;
import androidx.car.app.model.Alert;
import java.util.HashMap;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class qlx extends qle {
    public int a;

    public qlx() {
        UUID uuidRandomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (uuidRandomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits == 0 && (leastSignificantBits = (int) (uuidRandomUUID.getMostSignificantBits() & 2147483647L)) == 0) {
            Log.e("GAv4", "UUID.randomUUID() returned 0.");
            leastSignificantBits = Alert.DURATION_SHOW_INDEFINITELY;
        }
        this.a = leastSignificantBits;
    }

    @Override // defpackage.qle
    public final /* bridge */ /* synthetic */ void b(qle qleVar) {
        qlx qlxVar = (qlx) qleVar;
        TextUtils.isEmpty(null);
        int i = this.a;
        if (i != 0) {
            qlxVar.a = i;
        }
        TextUtils.isEmpty(null);
        if (TextUtils.isEmpty(null)) {
            return;
        }
        TextUtils.isEmpty(null);
    }

    public final String toString() {
        HashMap map = new HashMap();
        map.put("screenName", null);
        map.put("interstitial", false);
        map.put("automatic", false);
        map.put("screenId", Integer.valueOf(this.a));
        map.put("referrerScreenId", 0);
        map.put("referrerScreenName", null);
        map.put("referrerUri", null);
        return qle.a(map, 0);
    }
}
