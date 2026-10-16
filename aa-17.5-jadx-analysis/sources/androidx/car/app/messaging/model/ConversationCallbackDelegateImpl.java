package androidx.car.app.messaging.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.messaging.model.IConversationCallback;
import androidx.car.app.utils.RemoteUtils$1;
import defpackage.qu;
import defpackage.rb;
import defpackage.sq;
import defpackage.sr;
import defpackage.tr;
import defpackage.xr;
import defpackage.xy;

@rb
/* loaded from: classes2.dex */
public class ConversationCallbackDelegateImpl implements sr {
    private final IConversationCallback mConversationCallbackBinder;

    @rb
    public static class ConversationCallbackStub extends IConversationCallback.Stub {
        private final sq mConversationCallback;

        public ConversationCallbackStub(sq sqVar) {
            this.mConversationCallback = sqVar;
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onMarkAsRead$0$androidx-car-app-messaging-model-ConversationCallbackDelegateImpl$ConversationCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m142xf996ad9e() throws xr {
            this.mConversationCallback.a();
            return null;
        }

        /* renamed from: lambda$onTextReply$1$androidx-car-app-messaging-model-ConversationCallbackDelegateImpl$ConversationCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m143xc3f6a0cd(String str) throws xr {
            this.mConversationCallback.b(str);
            return null;
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onMarkAsRead(IOnDoneCallback iOnDoneCallback) {
            tr.b(iOnDoneCallback, "onMarkAsRead", new xy() { // from class: st
                @Override // defpackage.xy
                public final Object a() {
                    return this.a.m142xf996ad9e();
                }
            });
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onTextReply(IOnDoneCallback iOnDoneCallback, final String str) {
            tr.b(iOnDoneCallback, "onReply", new xy() { // from class: ss
                @Override // defpackage.xy
                public final Object a() {
                    return this.a.m143xc3f6a0cd(str);
                }
            });
        }
    }

    public ConversationCallbackDelegateImpl(sq sqVar) {
        this.mConversationCallbackBinder = new ConversationCallbackStub(sqVar);
    }

    @Override // defpackage.sr
    public void sendMarkAsRead(qu quVar) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            iConversationCallback.getClass();
            iConversationCallback.onMarkAsRead(new RemoteUtils$1(quVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.sr
    public void sendTextReply(String str, qu quVar) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            iConversationCallback.getClass();
            iConversationCallback.onTextReply(new RemoteUtils$1(quVar), str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private ConversationCallbackDelegateImpl() {
        this.mConversationCallbackBinder = null;
    }
}
