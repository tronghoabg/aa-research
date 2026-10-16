package defpackage;

import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class jxu implements gsc {
    public final geu a;

    public jxu(geu geuVar) {
        this.a = geuVar;
    }

    @Override // defpackage.gsc
    public final Action a(ConversationItem conversationItem) {
        geu geuVar = this.a;
        tj tjVar = new tj(IconCompat.m(geuVar, R.drawable.gs_reply_vd_24));
        sw swVar = new sw();
        swVar.c(new CarIcon(tjVar));
        swVar.e(geuVar.getString(R.string.direct_reply_message));
        swVar.d(new jsu(this, conversationItem, 3));
        return swVar.a();
    }

    @Override // defpackage.gsc
    public final Action b(ConversationItem conversationItem) {
        geu geuVar = this.a;
        tj tjVar = new tj(IconCompat.m(geuVar, R.drawable.gs_play_arrow_vd_24));
        sw swVar = new sw();
        swVar.c(new CarIcon(tjVar));
        swVar.e(actj.y() ? geuVar.getString(R.string.play_message) : geuVar.getString(R.string.play_aloud_message));
        swVar.d(new jsu(this, conversationItem, 4));
        return swVar.a();
    }

    @Override // defpackage.gsc
    public final us c(ConversationItem conversationItem) {
        return new jsu(this, conversationItem, 4);
    }
}
