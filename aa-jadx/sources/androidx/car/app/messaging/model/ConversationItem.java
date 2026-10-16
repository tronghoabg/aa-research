package androidx.car.app.messaging.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public class ConversationItem implements defpackage.uk {
    private final java.util.List<androidx.car.app.model.Action> mActions;
    private final defpackage.sw mConversationCallbackDelegate;
    private final androidx.car.app.model.CarIcon mIcon;
    private final java.lang.String mId;
    private final boolean mIndexable;
    private final boolean mIsGroupConversation;
    private final java.util.List<androidx.car.app.messaging.model.CarMessage> mMessages;
    private final defpackage.dur mSelf;
    private final androidx.car.app.model.CarText mTitle;

    public ConversationItem(defpackage.ta taVar) {
        java.lang.String str = taVar.a;
        str.getClass();
        this.mId = str;
        androidx.car.app.model.CarText carText = taVar.b;
        carText.getClass();
        this.mTitle = carText;
        defpackage.dur durVar = taVar.c;
        validateSender(durVar);
        this.mSelf = durVar;
        this.mIcon = taVar.d;
        this.mIsGroupConversation = taVar.e;
        java.util.List<androidx.car.app.messaging.model.CarMessage> listB = defpackage.tq.b(taVar.f);
        listB.getClass();
        this.mMessages = listB;
        defpackage.ebl.o(!listB.isEmpty(), "Message list cannot be empty.");
        java.util.Iterator<androidx.car.app.messaging.model.CarMessage> it = listB.iterator();
        while (it.hasNext()) {
            defpackage.ebl.o(it.next() != null, "Message list cannot contain null messages");
        }
        defpackage.sw swVar = taVar.g;
        swVar.getClass();
        this.mConversationCallbackDelegate = swVar;
        this.mActions = defpackage.tq.b(taVar.h);
        boolean z = taVar.i;
        this.mIndexable = true;
    }

    static defpackage.dur validateSender(defpackage.dur durVar) {
        durVar.getClass();
        durVar.a.getClass();
        durVar.d.getClass();
        return durVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.messaging.model.ConversationItem)) {
            return false;
        }
        androidx.car.app.messaging.model.ConversationItem conversationItem = (androidx.car.app.messaging.model.ConversationItem) obj;
        return j$.util.Objects.equals(this.mId, conversationItem.mId) && j$.util.Objects.equals(this.mTitle, conversationItem.mTitle) && j$.util.Objects.equals(this.mIcon, conversationItem.mIcon) && defpackage.tn.b(getSelf(), conversationItem.getSelf()) && this.mIsGroupConversation == conversationItem.mIsGroupConversation && j$.util.Objects.equals(this.mMessages, conversationItem.mMessages) && j$.util.Objects.equals(this.mActions, conversationItem.mActions) && this.mIndexable == conversationItem.mIndexable;
    }

    public java.util.List<androidx.car.app.model.Action> getActions() {
        return this.mActions;
    }

    public defpackage.sw getConversationCallbackDelegate() {
        return this.mConversationCallbackDelegate;
    }

    public androidx.car.app.model.CarIcon getIcon() {
        return this.mIcon;
    }

    public java.lang.String getId() {
        return this.mId;
    }

    public java.util.List<androidx.car.app.messaging.model.CarMessage> getMessages() {
        return this.mMessages;
    }

    public defpackage.dur getSelf() {
        return this.mSelf;
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(defpackage.tn.a(getSelf())), this.mId, this.mTitle, this.mIcon, java.lang.Boolean.valueOf(this.mIsGroupConversation), this.mMessages, this.mActions, java.lang.Boolean.valueOf(this.mIndexable));
    }

    public boolean isGroupConversation() {
        return this.mIsGroupConversation;
    }

    public boolean isIndexable() {
        return this.mIndexable;
    }

    private ConversationItem() {
        this.mId = "";
        this.mTitle = new androidx.car.app.model.CarText.Builder("").build();
        defpackage.duq duqVar = new defpackage.duq();
        duqVar.a = "";
        this.mSelf = new defpackage.dur(duqVar);
        this.mIcon = null;
        this.mIsGroupConversation = false;
        this.mMessages = new java.util.ArrayList();
        this.mConversationCallbackDelegate = new androidx.car.app.messaging.model.ConversationCallbackDelegateImpl(new defpackage.sz());
        this.mActions = java.util.Collections.EMPTY_LIST;
        this.mIndexable = true;
    }
}
