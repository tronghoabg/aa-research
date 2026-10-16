package defpackage;

import android.widget.LinearLayout;
import androidx.car.app.messaging.model.ConversationItem;
import com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.RowView;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class keg implements eqn {
    public final /* synthetic */ geu a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ List c;
    public final /* synthetic */ gsc d;
    public final /* synthetic */ ConversationItem e;
    public final /* synthetic */ LinearLayout f;
    private final /* synthetic */ int g;

    public /* synthetic */ keg(LinearLayout linearLayout, geu geuVar, boolean z, List list, gsc gscVar, ConversationItem conversationItem, int i) {
        this.g = i;
        this.f = linearLayout;
        this.a = geuVar;
        this.b = z;
        this.c = list;
        this.d = gscVar;
        this.e = conversationItem;
    }

    @Override // defpackage.eqn
    public final void eS(Object obj) {
        if (this.g != 0) {
            ConversationItem conversationItem = this.e;
            gsc gscVar = this.d;
            List list = this.c;
            boolean z = this.b;
            geu geuVar = this.a;
            ((MaterialRowView) this.f).f(geuVar, z, list, gscVar, conversationItem, (List) obj);
            return;
        }
        ConversationItem conversationItem2 = this.e;
        gsc gscVar2 = this.d;
        List list2 = this.c;
        boolean z2 = this.b;
        geu geuVar2 = this.a;
        ((RowView) this.f).g(geuVar2, z2, list2, gscVar2, conversationItem2, (List) obj);
    }
}
