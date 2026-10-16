package androidx.car.app.messaging.model;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import defpackage.duj;
import defpackage.duk;
import defpackage.ebe;
import defpackage.rb;
import defpackage.sr;
import defpackage.su;
import defpackage.sv;
import defpackage.ti;
import defpackage.tl;
import defpackage.uf;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@rb
/* loaded from: classes2.dex */
public class ConversationItem implements uf {
    private final List<Action> mActions;
    private final sr mConversationCallbackDelegate;
    private final CarIcon mIcon;
    private final String mId;
    private final boolean mIndexable;
    private final boolean mIsGroupConversation;
    private final List<CarMessage> mMessages;
    private final duk mSelf;
    private final CarText mTitle;

    public ConversationItem(sv svVar) {
        String str = svVar.a;
        str.getClass();
        this.mId = str;
        CarText carText = svVar.b;
        carText.getClass();
        this.mTitle = carText;
        duk dukVar = svVar.c;
        validateSender(dukVar);
        this.mSelf = dukVar;
        this.mIcon = svVar.d;
        this.mIsGroupConversation = svVar.e;
        List<CarMessage> listB = tl.b(svVar.f);
        listB.getClass();
        this.mMessages = listB;
        ebe.k(!listB.isEmpty(), "Message list cannot be empty.");
        Iterator<CarMessage> it = listB.iterator();
        while (it.hasNext()) {
            ebe.k(it.next() != null, "Message list cannot contain null messages");
        }
        sr srVar = svVar.g;
        srVar.getClass();
        this.mConversationCallbackDelegate = srVar;
        this.mActions = tl.b(svVar.h);
        boolean z = svVar.i;
        this.mIndexable = true;
    }

    static duk validateSender(duk dukVar) {
        dukVar.getClass();
        dukVar.a.getClass();
        dukVar.d.getClass();
        return dukVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationItem)) {
            return false;
        }
        ConversationItem conversationItem = (ConversationItem) obj;
        return Objects.equals(this.mId, conversationItem.mId) && Objects.equals(this.mTitle, conversationItem.mTitle) && Objects.equals(this.mIcon, conversationItem.mIcon) && ti.b(getSelf(), conversationItem.getSelf()) && this.mIsGroupConversation == conversationItem.mIsGroupConversation && Objects.equals(this.mMessages, conversationItem.mMessages) && Objects.equals(this.mActions, conversationItem.mActions) && this.mIndexable == conversationItem.mIndexable;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public sr getConversationCallbackDelegate() {
        return this.mConversationCallbackDelegate;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public String getId() {
        return this.mId;
    }

    public List<CarMessage> getMessages() {
        return this.mMessages;
    }

    public duk getSelf() {
        return this.mSelf;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(ti.a(getSelf())), this.mId, this.mTitle, this.mIcon, Boolean.valueOf(this.mIsGroupConversation), this.mMessages, this.mActions, Boolean.valueOf(this.mIndexable));
    }

    public boolean isGroupConversation() {
        return this.mIsGroupConversation;
    }

    public boolean isIndexable() {
        return this.mIndexable;
    }

    private ConversationItem() {
        this.mId = "";
        this.mTitle = new CarText.Builder("").build();
        duj dujVar = new duj();
        dujVar.a = "";
        this.mSelf = new duk(dujVar);
        this.mIcon = null;
        this.mIsGroupConversation = false;
        this.mMessages = new ArrayList();
        this.mConversationCallbackDelegate = new ConversationCallbackDelegateImpl(new su());
        this.mActions = Collections.EMPTY_LIST;
        this.mIndexable = true;
    }
}
