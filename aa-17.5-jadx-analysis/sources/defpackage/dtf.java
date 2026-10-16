package defpackage;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class dtf extends duc {
    private final ArrayList a = new ArrayList();

    @Override // defpackage.duc
    protected final String a() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }

    @Override // defpackage.duc
    protected final void b(Bundle bundle) {
        super.b(bundle);
        ArrayList arrayList = this.a;
        arrayList.clear();
        if (bundle.containsKey("android.textLines")) {
            Collections.addAll(arrayList, bundle.getCharSequenceArray("android.textLines"));
        }
    }

    @Override // defpackage.duc
    public final void c(mko mkoVar) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) mkoVar.d).setBigContentTitle(this.h);
        if (this.j) {
            bigContentTitle.setSummaryText(this.i);
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bigContentTitle.addLine((CharSequence) arrayList.get(i));
        }
    }
}
