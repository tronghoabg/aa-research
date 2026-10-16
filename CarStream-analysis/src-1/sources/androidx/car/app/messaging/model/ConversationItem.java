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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@RequiresCarApi(7)
/* loaded from: classes.dex */
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

    public ConversationItem(Builder builder) {
        String str = builder.mId;
        Objects.requireNonNull(str);
        this.mId = str;
        CarText carText = builder.mTitle;
        Objects.requireNonNull(carText);
        this.mTitle = carText;
        this.mSelf = validateSender(builder.mSelf);
        this.mIcon = builder.mIcon;
        this.mIsGroupConversation = builder.mIsGroupConversation;
        List<CarMessage> listUnmodifiableCopy = CollectionUtils.unmodifiableCopy(builder.mMessages);
        Objects.requireNonNull(listUnmodifiableCopy);
        List<CarMessage> list = listUnmodifiableCopy;
        this.mMessages = list;
        Preconditions.checkState(!list.isEmpty(), "Message list cannot be empty.");
        Iterator<CarMessage> it = list.iterator();
        while (it.hasNext()) {
            Preconditions.checkState(it.next() != null, "Message list cannot contain null messages");
        }
        ConversationCallbackDelegate conversationCallbackDelegate = builder.mConversationCallbackDelegate;
        Objects.requireNonNull(conversationCallbackDelegate);
        this.mConversationCallbackDelegate = conversationCallbackDelegate;
        this.mActions = CollectionUtils.unmodifiableCopy(builder.mActions);
        this.mIndexable = builder.mIndexable;
    }

    public static Person validateSender(Person person) {
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

    public boolean isIndexable() {
        return this.mIndexable;
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        final List<Action> mActions;
        ConversationCallbackDelegate mConversationCallbackDelegate;
        CarIcon mIcon;
        String mId;
        boolean mIndexable;
        boolean mIsGroupConversation;
        List<CarMessage> mMessages;
        Person mSelf;
        CarText mTitle;

        @Deprecated
        public Builder() {
            this.mIndexable = true;
            this.mActions = new ArrayList();
        }

        public Builder addAction(Action action) {
            ArrayList arrayList = new ArrayList(this.mActions);
            Objects.requireNonNull(action);
            arrayList.add(action);
            ActionsConstraints.ACTIONS_CONSTRAINTS_CONVERSATION_ITEM.validateOrThrow(arrayList);
            this.mActions.add(action);
            return this;
        }

        public ConversationItem build() {
            return new ConversationItem(this);
        }

        public Builder setConversationCallback(ConversationCallback conversationCallback) {
            Objects.requireNonNull(conversationCallback);
            this.mConversationCallbackDelegate = new ConversationCallbackDelegateImpl(conversationCallback);
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

        public Builder(String str, CarText carText, Person person, List<CarMessage> list, ConversationCallback conversationCallback) {
            this.mIndexable = true;
            this.mId = str;
            this.mTitle = carText;
            this.mSelf = person;
            this.mMessages = list;
            Objects.requireNonNull(conversationCallback);
            this.mConversationCallbackDelegate = new ConversationCallbackDelegateImpl(conversationCallback);
            this.mActions = new ArrayList();
        }

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
    }

    private ConversationItem() {
        this.mId = "";
        this.mTitle = new CarText.Builder("").build();
        this.mSelf = new Person.Builder().setName("").build();
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
