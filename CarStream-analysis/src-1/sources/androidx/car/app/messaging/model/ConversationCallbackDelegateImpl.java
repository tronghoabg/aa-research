package androidx.car.app.messaging.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.messaging.model.IConversationCallback;
import androidx.car.app.utils.RemoteUtils;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@RequiresCarApi(7)
/* loaded from: classes.dex */
class ConversationCallbackDelegateImpl implements ConversationCallbackDelegate {
    private final IConversationCallback mConversationCallbackBinder;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @CarProtocol
    public static class ConversationCallbackStub extends IConversationCallback.Stub {
        private final ConversationCallback mConversationCallback;

        public ConversationCallbackStub(ConversationCallback conversationCallback) {
            this.mConversationCallback = conversationCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onMarkAsRead$0() {
            this.mConversationCallback.onMarkAsRead();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onTextReply$1(String str) {
            this.mConversationCallback.onTextReply(str);
            return null;
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onMarkAsRead(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onMarkAsRead", new RemoteUtils.HostCall() { // from class: androidx.car.app.messaging.model.b
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.a.lambda$onMarkAsRead$0();
                }
            });
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onTextReply(IOnDoneCallback iOnDoneCallback, final String str) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onReply", new RemoteUtils.HostCall() { // from class: androidx.car.app.messaging.model.a
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.a.lambda$onTextReply$1(str);
                }
            });
        }
    }

    public ConversationCallbackDelegateImpl(ConversationCallback conversationCallback) {
        this.mConversationCallbackBinder = new ConversationCallbackStub(conversationCallback);
    }

    @Override // androidx.car.app.messaging.model.ConversationCallbackDelegate
    public void sendMarkAsRead(OnDoneCallback onDoneCallback) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            Objects.requireNonNull(iConversationCallback);
            iConversationCallback.onMarkAsRead(RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.car.app.messaging.model.ConversationCallbackDelegate
    public void sendTextReply(String str, OnDoneCallback onDoneCallback) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            Objects.requireNonNull(iConversationCallback);
            iConversationCallback.onTextReply(RemoteUtils.createOnDoneCallbackStub(onDoneCallback), str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private ConversationCallbackDelegateImpl() {
        this.mConversationCallbackBinder = null;
    }
}
