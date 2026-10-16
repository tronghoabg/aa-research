package defpackage;

import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.car.senderprotocol.ChannelMessage;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class rtj extends rvi {
    public static final ypf a = ols.R("CAR.GAL.GAL");
    public final ArrayList b;
    private Handler c;

    public rtj(rts rtsVar, wyd wydVar, Bundle bundle) {
        super(rtsVar, wydVar);
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        if (bundle.containsKey("writer_message_queue_state")) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("writer_message_queue_state");
            parcelableArrayList.getClass();
            arrayList.addAll(parcelableArrayList);
        }
    }

    @Override // defpackage.rvi
    public final void a(Bundle bundle) {
        bundle.putParcelableArrayList("writer_message_queue_state", new ArrayList<>(this.b));
    }

    @Override // defpackage.rvi
    public final void b(ChannelMessage channelMessage) {
        if (this.c == null) {
            this.c = new rti(this, getLooper());
            if (!this.b.isEmpty()) {
                this.c.sendEmptyMessage(2);
            }
        }
        Handler handler = this.c;
        if (handler.sendMessage(handler.obtainMessage(1, channelMessage))) {
            return;
        }
        a.h().p(new Exception("Late message")).ai(8284).u("Message received after stopping");
    }
}
