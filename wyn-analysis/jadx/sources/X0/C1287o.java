package X0;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1287o extends E {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15863e;

    /* renamed from: f, reason: collision with root package name */
    public Object f15864f;

    public C1287o(int i5) {
        this.f15863e = i5;
        switch (i5) {
            case 1:
                this.f15864f = new ArrayList();
                break;
        }
    }

    @Override // X0.E
    public final void b(N2.j jVar) {
        switch (this.f15863e) {
            case 0:
                Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle((Notification.Builder) jVar.f8381d).setBigContentTitle((CharSequence) this.f15789c).bigText((CharSequence) this.f15864f);
                if (this.f15787a) {
                    bigTextStyleBigText.setSummaryText((CharSequence) this.f15790d);
                    break;
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) jVar.f8381d).setBigContentTitle((CharSequence) this.f15789c);
                if (this.f15787a) {
                    bigContentTitle.setSummaryText((CharSequence) this.f15790d);
                }
                Iterator it = ((ArrayList) this.f15864f).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
                break;
        }
    }

    @Override // X0.E
    public final String c() {
        switch (this.f15863e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    @Override // X0.E
    public final void i(Bundle bundle) {
        switch (this.f15863e) {
            case 0:
                super.i(bundle);
                this.f15864f = bundle.getCharSequence("android.bigText");
                break;
            default:
                super.i(bundle);
                ArrayList arrayList = (ArrayList) this.f15864f;
                arrayList.clear();
                if (bundle.containsKey("android.textLines")) {
                    Collections.addAll(arrayList, bundle.getCharSequenceArray("android.textLines"));
                    break;
                }
                break;
        }
    }
}
