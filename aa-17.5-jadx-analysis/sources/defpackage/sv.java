package defpackage;

import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class sv {
    public String a;
    public CarText b;
    public duk c;
    public CarIcon d;
    public boolean e;
    public List f;
    public sr g;
    public final List h;
    public final boolean i;

    public sv(ConversationItem conversationItem) {
        this.i = true;
        this.a = conversationItem.getId();
        this.b = conversationItem.getTitle();
        this.c = conversationItem.getSelf();
        this.d = conversationItem.getIcon();
        this.e = conversationItem.isGroupConversation();
        this.g = conversationItem.getConversationCallbackDelegate();
        this.f = conversationItem.getMessages();
        this.h = new ArrayList(conversationItem.getActions());
    }

    @Deprecated
    public sv() {
        this.i = true;
        this.h = new ArrayList();
    }
}
