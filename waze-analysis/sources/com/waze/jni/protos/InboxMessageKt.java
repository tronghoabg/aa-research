package com.waze.jni.protos;

import com.waze.jni.protos.InboxMessage;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class InboxMessageKt {
    public static final InboxMessageKt INSTANCE = new InboxMessageKt();

    private InboxMessageKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InboxMessage.Builder _builder;

        private Dsl(InboxMessage.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ InboxMessage _build() {
            InboxMessage inboxMessageBuild = this._builder.build();
            x.e(inboxMessageBuild, "build(...)");
            return inboxMessageBuild;
        }

        public final void clearAdvertisement() {
            this._builder.clearAdvertisement();
        }

        public final void clearId() {
            this._builder.clearId();
        }

        public final void clearMessage() {
            this._builder.clearMessage();
        }

        public final void clearPreview() {
            this._builder.clearPreview();
        }

        public final void clearSentFormattedString() {
            this._builder.clearSentFormattedString();
        }

        public final void clearSentTimeSeconds() {
            this._builder.clearSentTimeSeconds();
        }

        public final void clearTitle() {
            this._builder.clearTitle();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final void clearUnread() {
            this._builder.clearUnread();
        }

        public final Advertisement getAdvertisement() {
            Advertisement advertisement = this._builder.getAdvertisement();
            x.e(advertisement, "getAdvertisement(...)");
            return advertisement;
        }

        public final Advertisement getAdvertisementOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return InboxMessageKtKt.getAdvertisementOrNull(dsl._builder);
        }

        public final String getId() {
            String id = this._builder.getId();
            x.e(id, "getId(...)");
            return id;
        }

        public final String getMessage() {
            String message = this._builder.getMessage();
            x.e(message, "getMessage(...)");
            return message;
        }

        public final String getPreview() {
            String preview = this._builder.getPreview();
            x.e(preview, "getPreview(...)");
            return preview;
        }

        public final String getSentFormattedString() {
            String sentFormattedString = this._builder.getSentFormattedString();
            x.e(sentFormattedString, "getSentFormattedString(...)");
            return sentFormattedString;
        }

        public final long getSentTimeSeconds() {
            return this._builder.getSentTimeSeconds();
        }

        public final String getTitle() {
            String title = this._builder.getTitle();
            x.e(title, "getTitle(...)");
            return title;
        }

        public final InboxMessage.Type getType() {
            InboxMessage.Type type = this._builder.getType();
            x.e(type, "getType(...)");
            return type;
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final boolean getUnread() {
            return this._builder.getUnread();
        }

        public final boolean hasAdvertisement() {
            return this._builder.hasAdvertisement();
        }

        public final boolean hasId() {
            return this._builder.hasId();
        }

        public final boolean hasMessage() {
            return this._builder.hasMessage();
        }

        public final boolean hasPreview() {
            return this._builder.hasPreview();
        }

        public final boolean hasSentFormattedString() {
            return this._builder.hasSentFormattedString();
        }

        public final boolean hasSentTimeSeconds() {
            return this._builder.hasSentTimeSeconds();
        }

        public final boolean hasTitle() {
            return this._builder.hasTitle();
        }

        public final boolean hasType() {
            return this._builder.hasType();
        }

        public final boolean hasUnread() {
            return this._builder.hasUnread();
        }

        public final void setAdvertisement(Advertisement advertisement) {
            x.f(advertisement, "value");
            this._builder.setAdvertisement(advertisement);
        }

        public final void setId(String str) {
            x.f(str, "value");
            this._builder.setId(str);
        }

        public final void setMessage(String str) {
            x.f(str, "value");
            this._builder.setMessage(str);
        }

        public final void setPreview(String str) {
            x.f(str, "value");
            this._builder.setPreview(str);
        }

        public final void setSentFormattedString(String str) {
            x.f(str, "value");
            this._builder.setSentFormattedString(str);
        }

        public final void setSentTimeSeconds(long j2) {
            this._builder.setSentTimeSeconds(j2);
        }

        public final void setTitle(String str) {
            x.f(str, "value");
            this._builder.setTitle(str);
        }

        public final void setType(InboxMessage.Type type) {
            x.f(type, "value");
            this._builder.setType(type);
        }

        public final void setTypeValue(int i2) {
            this._builder.setTypeValue(i2);
        }

        public final void setUnread(boolean z) {
            this._builder.setUnread(z);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(InboxMessage.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(InboxMessage.Builder builder, o oVar) {
            this(builder);
        }
    }
}
