package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class qlb implements qlm {
    private static final Uri a;
    private final LogPrinter b = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        a = builder.build();
    }

    @Override // defpackage.qlm
    public final Uri b() {
        return a;
    }

    @Override // defpackage.qlm
    public final void e(qlc qlcVar) {
        ArrayList arrayList = new ArrayList(qlcVar.g.values());
        Collections.sort(arrayList, new civ(9));
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String string = ((qle) arrayList.get(i)).toString();
            if (!TextUtils.isEmpty(string)) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(string);
            }
        }
        this.b.println(sb.toString());
    }
}
