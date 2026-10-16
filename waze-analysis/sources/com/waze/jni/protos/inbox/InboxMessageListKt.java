package com.waze.jni.protos.inbox;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.InboxMessage;
import com.waze.jni.protos.inbox.InboxMessageList;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class InboxMessageListKt {
    public static final InboxMessageListKt INSTANCE = new InboxMessageListKt();

    private InboxMessageListKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InboxMessageList.Builder _builder;

        /* compiled from: WazeSource */
        public final class MessagesProxy extends c {
            private MessagesProxy() {
            }
        }

        private Dsl(InboxMessageList.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ InboxMessageList _build() {
            InboxMessageList inboxMessageListBuild = this._builder.build();
            x.e(inboxMessageListBuild, "build(...)");
            return inboxMessageListBuild;
        }

        public final /* synthetic */ void addAllMessages(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllMessages(iterable);
        }

        public final /* synthetic */ void addMessages(a aVar, InboxMessage inboxMessage) {
            x.f(aVar, "<this>");
            x.f(inboxMessage, "value");
            this._builder.addMessages(inboxMessage);
        }

        public final void clearBadge() {
            this._builder.clearBadge();
        }

        public final void clearHasMore() {
            this._builder.clearHasMore();
        }

        public final /* synthetic */ void clearMessages(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearMessages();
        }

        public final void clearUnreadCount() {
            this._builder.clearUnreadCount();
        }

        public final int getBadge() {
            return this._builder.getBadge();
        }

        public final boolean getHasMore() {
            return this._builder.getHasMore();
        }

        public final /* synthetic */ a getMessages() {
            List<InboxMessage> messagesList = this._builder.getMessagesList();
            x.e(messagesList, "getMessagesList(...)");
            return new a(messagesList);
        }

        public final int getUnreadCount() {
            return this._builder.getUnreadCount();
        }

        public final boolean hasBadge() {
            return this._builder.hasBadge();
        }

        public final boolean hasHasMore() {
            return this._builder.hasHasMore();
        }

        public final boolean hasUnreadCount() {
            return this._builder.hasUnreadCount();
        }

        public final /* synthetic */ void plusAssignAllMessages(a<InboxMessage, MessagesProxy> aVar, Iterable<InboxMessage> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllMessages(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignMessages(a<InboxMessage, MessagesProxy> aVar, InboxMessage inboxMessage) {
            x.f(aVar, "<this>");
            x.f(inboxMessage, "value");
            addMessages(aVar, inboxMessage);
        }

        public final void setBadge(int i2) {
            this._builder.setBadge(i2);
        }

        public final void setHasMore(boolean z) {
            this._builder.setHasMore(z);
        }

        public final /* synthetic */ void setMessages(a aVar, int i2, InboxMessage inboxMessage) {
            x.f(aVar, "<this>");
            x.f(inboxMessage, "value");
            this._builder.setMessages(i2, inboxMessage);
        }

        public final void setUnreadCount(int i2) {
            this._builder.setUnreadCount(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(InboxMessageList.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(InboxMessageList.Builder builder, o oVar) {
            this(builder);
        }
    }
}
