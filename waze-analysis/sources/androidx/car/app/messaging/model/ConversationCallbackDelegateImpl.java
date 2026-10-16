package androidx.car.app.messaging.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.messaging.model.IConversationCallback;
import androidx.car.app.utils.RemoteUtils;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(7)
/* loaded from: classes2.dex */
class ConversationCallbackDelegateImpl implements ConversationCallbackDelegate {
    private final IConversationCallback mConversationCallbackBinder;

    /* compiled from: WazeSource */
    @CarProtocol
    class ConversationCallbackStub extends IConversationCallback.Stub {
        private final ConversationCallback mConversationCallback;

        ConversationCallbackStub(ConversationCallback conversationCallback) {
            this.mConversationCallback = conversationCallback;
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onMarkAsRead$0$androidx-car-app-messaging-model-ConversationCallbackDelegateImpl$ConversationCallbackStub, reason: not valid java name */
        /* synthetic */ Object m1623xf996ad9e() {
            this.mConversationCallback.onMarkAsRead();
            return null;
        }

        /* renamed from: lambda$onTextReply$1$androidx-car-app-messaging-model-ConversationCallbackDelegateImpl$ConversationCallbackStub, reason: not valid java name */
        /* synthetic */ Object m1624xc3f6a0cd(String str) {
            this.mConversationCallback.onTextReply(str);
            return null;
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onMarkAsRead(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onMarkAsRead", new RemoteUtils.HostCall() { // from class: androidx.car.app.messaging.model.ConversationCallbackDelegateImpl$ConversationCallbackStub$$ExternalSyntheticLambda1
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1623xf996ad9e();
                }
            });
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onTextReply(IOnDoneCallback iOnDoneCallback, final String str) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onReply", new RemoteUtils.HostCall() { // from class: androidx.car.app.messaging.model.ConversationCallbackDelegateImpl$ConversationCallbackStub$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1624xc3f6a0cd(str);
                }
            });
        }
    }

    ConversationCallbackDelegateImpl(ConversationCallback conversationCallback) {
        this.mConversationCallbackBinder = new ConversationCallbackStub(conversationCallback);
    }

    @Override // androidx.car.app.messaging.model.ConversationCallbackDelegate
    public void sendMarkAsRead(OnDoneCallback onDoneCallback) {
        try {
            ((IConversationCallback) Objects.requireNonNull(this.mConversationCallbackBinder)).onMarkAsRead(RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // androidx.car.app.messaging.model.ConversationCallbackDelegate
    public void sendTextReply(String str, OnDoneCallback onDoneCallback) {
        try {
            ((IConversationCallback) Objects.requireNonNull(this.mConversationCallbackBinder)).onTextReply(RemoteUtils.createOnDoneCallbackStub(onDoneCallback), str);
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    private ConversationCallbackDelegateImpl() {
        this.mConversationCallbackBinder = null;
    }
}
