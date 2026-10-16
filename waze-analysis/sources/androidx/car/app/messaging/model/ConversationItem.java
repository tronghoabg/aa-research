package androidx.car.app.messaging.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Item;
import androidx.car.app.model.constraints.ActionsConstraints;
import androidx.car.app.utils.CollectionUtils;
import androidx.core.app.Person;
import androidx.core.util.Preconditions;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(7)
/* loaded from: classes2.dex */
public class ConversationItem implements Item {
    private final List<Action> mActions;
    private final ConversationCallbackDelegate mConversationCallbackDelegate;
    private final CarIcon mIcon;
    private final String mId;
    private final boolean mIndexable;
    private final boolean mIsGroupConversation;
    private final List<CarMessage> mMessages;
    private final Person mSelf;
    private final CarText mTitle;

    ConversationItem(Builder builder) {
        this.mId = (String) Objects.requireNonNull(builder.mId);
        this.mTitle = (CarText) Objects.requireNonNull(builder.mTitle);
        Person person = builder.mSelf;
        validateSender(person);
        this.mSelf = person;
        this.mIcon = builder.mIcon;
        this.mIsGroupConversation = builder.mIsGroupConversation;
        List<CarMessage> list = (List) Objects.requireNonNull(CollectionUtils.unmodifiableCopy(builder.mMessages));
        this.mMessages = list;
        Preconditions.checkState(!list.isEmpty(), "Message list cannot be empty.");
        Iterator<CarMessage> it = list.iterator();
        while (it.hasNext()) {
            Preconditions.checkState(it.next() != null, "Message list cannot contain null messages");
        }
        this.mConversationCallbackDelegate = (ConversationCallbackDelegate) Objects.requireNonNull(builder.mConversationCallbackDelegate);
        this.mActions = CollectionUtils.unmodifiableCopy(builder.mActions);
        this.mIndexable = builder.mIndexable;
    }

    static Person validateSender(Person person) {
        Objects.requireNonNull(person);
        Objects.requireNonNull(person.getName());
        Objects.requireNonNull(person.getKey());
        return person;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationItem)) {
            return false;
        }
        ConversationItem conversationItem = (ConversationItem) obj;
        return Objects.equals(this.mId, conversationItem.mId) && Objects.equals(this.mTitle, conversationItem.mTitle) && Objects.equals(this.mIcon, conversationItem.mIcon) && PersonsEqualityHelper.arePersonsEqual(getSelf(), conversationItem.getSelf()) && this.mIsGroupConversation == conversationItem.mIsGroupConversation && Objects.equals(this.mMessages, conversationItem.mMessages) && Objects.equals(this.mActions, conversationItem.mActions) && this.mIndexable == conversationItem.mIndexable;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public ConversationCallbackDelegate getConversationCallbackDelegate() {
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

    public Person getSelf() {
        return this.mSelf;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(PersonsEqualityHelper.getPersonHashCode(getSelf())), this.mId, this.mTitle, this.mIcon, Boolean.valueOf(this.mIsGroupConversation), this.mMessages, this.mActions, Boolean.valueOf(this.mIndexable));
    }

    public boolean isGroupConversation() {
        return this.mIsGroupConversation;
    }

    @RequiresCarApi(8)
    public boolean isIndexable() {
        return this.mIndexable;
    }

    /* compiled from: WazeSource */
    public final class Builder {
        final List<Action> mActions;
        ConversationCallbackDelegate mConversationCallbackDelegate;
        CarIcon mIcon;
        String mId;
        boolean mIndexable;
        boolean mIsGroupConversation;
        List<CarMessage> mMessages;
        Person mSelf;
        CarText mTitle;

        public Builder(ConversationItem conversationItem) {
            this.mIndexable = true;
            this.mId = conversationItem.getId();
            this.mTitle = conversationItem.getTitle();
            this.mSelf = conversationItem.getSelf();
            this.mIcon = conversationItem.getIcon();
            this.mIsGroupConversation = conversationItem.isGroupConversation();
            this.mConversationCallbackDelegate = conversationItem.getConversationCallbackDelegate();
            this.mMessages = conversationItem.getMessages();
            this.mActions = new ArrayList(conversationItem.getActions());
        }

        public Builder addAction(Action action) {
            ArrayList arrayList = new ArrayList(this.mActions);
            arrayList.add((Action) Objects.requireNonNull(action));
            ActionsConstraints.ACTIONS_CONSTRAINTS_CONVERSATION_ITEM.validateOrThrow(arrayList);
            this.mActions.add(action);
            return this;
        }

        public ConversationItem build() {
            return new ConversationItem(this);
        }

        public Builder setConversationCallback(ConversationCallback conversationCallback) {
            this.mConversationCallbackDelegate = new ConversationCallbackDelegateImpl((ConversationCallback) Objects.requireNonNull(conversationCallback));
            return this;
        }

        public Builder setGroupConversation(boolean z) {
            this.mIsGroupConversation = z;
            return this;
        }

        public Builder setIcon(CarIcon carIcon) {
            this.mIcon = carIcon;
            return this;
        }

        public Builder setId(String str) {
            this.mId = str;
            return this;
        }

        @RequiresCarApi(8)
        public Builder setIndexable(boolean z) {
            this.mIndexable = z;
            return this;
        }

        public Builder setMessages(List<CarMessage> list) {
            this.mMessages = list;
            return this;
        }

        public Builder setSelf(Person person) {
            this.mSelf = person;
            return this;
        }

        public Builder setTitle(CarText carText) {
            this.mTitle = carText;
            return this;
        }

        @Deprecated
        public Builder() {
            this.mIndexable = true;
            this.mActions = new ArrayList();
        }

        public Builder(String str, CarText carText, Person person, List<CarMessage> list, ConversationCallback conversationCallback) {
            this.mIndexable = true;
            this.mId = str;
            this.mTitle = carText;
            this.mSelf = person;
            this.mMessages = list;
            this.mConversationCallbackDelegate = new ConversationCallbackDelegateImpl((ConversationCallback) Objects.requireNonNull(conversationCallback));
            this.mActions = new ArrayList();
        }
    }

    private ConversationItem() {
        this.mId = "";
        this.mTitle = new CarText.Builder("").build();
        Person.Builder builder = new Person.Builder();
        builder.setName("");
        this.mSelf = builder.build();
        this.mIcon = null;
        this.mIsGroupConversation = false;
        this.mMessages = new ArrayList();
        this.mConversationCallbackDelegate = new ConversationCallbackDelegateImpl(new ConversationCallback() { // from class: androidx.car.app.messaging.model.ConversationItem.1
            @Override // androidx.car.app.messaging.model.ConversationCallback
            public void onMarkAsRead() {
            }

            @Override // androidx.car.app.messaging.model.ConversationCallback
            public void onTextReply(String str) {
            }
        });
        this.mActions = Collections.EMPTY_LIST;
        this.mIndexable = true;
    }
}
