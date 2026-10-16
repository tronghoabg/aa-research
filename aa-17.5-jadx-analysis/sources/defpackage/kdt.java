package defpackage;

import android.content.ComponentName;
import androidx.car.app.messaging.model.ConversationItem;
import com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.RowView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class kdt implements us {
    public final /* synthetic */ geu a;
    public final /* synthetic */ ConversationItem b;
    public final /* synthetic */ lwr c;
    public final /* synthetic */ whg d;
    private final /* synthetic */ int e;

    public /* synthetic */ kdt(geu geuVar, ConversationItem conversationItem, lwr lwrVar, whg whgVar, int i) {
        this.e = i;
        this.a = geuVar;
        this.b = conversationItem;
        this.c = lwrVar;
        this.d = whgVar;
    }

    @Override // defpackage.us
    public final void onClick() {
        int i = this.e;
        if (i == 0) {
            lwr lwrVar = this.c;
            ConversationItem conversationItem = this.b;
            geu geuVar = this.a;
            MaterialRowView.c(geuVar, conversationItem, lwrVar.b);
            MaterialRowView.e(geuVar, R.string.smart_reply_sent_text);
            yzy yzyVar = yzy.KI;
            whg whgVar = this.d;
            MaterialRowView.p(yzyVar, whgVar);
            MaterialRowView.n(conversationItem, ((ComponentName) whgVar.b).getPackageName());
            return;
        }
        lwr lwrVar2 = this.c;
        if (i != 1) {
            ConversationItem conversationItem2 = this.b;
            geu geuVar2 = this.a;
            RowView.d(geuVar2, conversationItem2, lwrVar2.b);
            RowView.f(geuVar2, R.string.smart_reply_sent_text);
            yzy yzyVar2 = yzy.KI;
            whg whgVar2 = this.d;
            RowView.m(yzyVar2, whgVar2);
            RowView.l(conversationItem2, ((ComponentName) whgVar2.b).getPackageName());
            return;
        }
        ConversationItem conversationItem3 = this.b;
        geu geuVar3 = this.a;
        jxv.d(geuVar3, conversationItem3, lwrVar2.b);
        jxv.e(geuVar3, R.string.smart_reply_sent_text);
        yzy yzyVar3 = yzy.KI;
        whg whgVar3 = this.d;
        jxv.h(yzyVar3, whgVar3);
        String packageName = ((ComponentName) whgVar3.b).getPackageName();
        packageName.getClass();
        jxv.b(conversationItem3, packageName);
    }
}
