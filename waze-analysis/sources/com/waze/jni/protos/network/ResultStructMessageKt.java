package com.waze.jni.protos.network;

import com.waze.jni.protos.network.ResultStructMessage;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ResultStructMessageKt {
    public static final ResultStructMessageKt INSTANCE = new ResultStructMessageKt();

    private ResultStructMessageKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ResultStructMessage.Builder _builder;

        private Dsl(ResultStructMessage.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ ResultStructMessage _build() {
            ResultStructMessage resultStructMessageBuild = this._builder.build();
            x.e(resultStructMessageBuild, "build(...)");
            return resultStructMessageBuild;
        }

        public final void clearAction() {
            this._builder.clearAction();
        }

        public final void clearAnalytics() {
            this._builder.clearAnalytics();
        }

        public final void clearBody() {
            this._builder.clearBody();
        }

        public final void clearCode() {
            this._builder.clearCode();
        }

        public final void clearDeepLink() {
            this._builder.clearDeepLink();
        }

        public final void clearErrorCode() {
            this._builder.clearErrorCode();
        }

        public final void clearHideCloseButton() {
            this._builder.clearHideCloseButton();
        }

        public final void clearShowAsToast() {
            this._builder.clearShowAsToast();
        }

        public final void clearStats() {
            this._builder.clearStats();
        }

        public final void clearTerminal() {
            this._builder.clearTerminal();
        }

        public final void clearTitle() {
            this._builder.clearTitle();
        }

        public final String getAction() {
            String action = this._builder.getAction();
            x.e(action, "getAction(...)");
            return action;
        }

        public final String getAnalytics() {
            String analytics = this._builder.getAnalytics();
            x.e(analytics, "getAnalytics(...)");
            return analytics;
        }

        public final String getBody() {
            String body = this._builder.getBody();
            x.e(body, "getBody(...)");
            return body;
        }

        public final int getCode() {
            return this._builder.getCode();
        }

        public final String getDeepLink() {
            String deepLink = this._builder.getDeepLink();
            x.e(deepLink, "getDeepLink(...)");
            return deepLink;
        }

        public final String getErrorCode() {
            String errorCode = this._builder.getErrorCode();
            x.e(errorCode, "getErrorCode(...)");
            return errorCode;
        }

        public final boolean getHideCloseButton() {
            return this._builder.getHideCloseButton();
        }

        public final boolean getShowAsToast() {
            return this._builder.getShowAsToast();
        }

        public final TransactionStatsMessage getStats() {
            TransactionStatsMessage stats = this._builder.getStats();
            x.e(stats, "getStats(...)");
            return stats;
        }

        public final TransactionStatsMessage getStatsOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return ResultStructMessageKtKt.getStatsOrNull(dsl._builder);
        }

        public final boolean getTerminal() {
            return this._builder.getTerminal();
        }

        public final String getTitle() {
            String title = this._builder.getTitle();
            x.e(title, "getTitle(...)");
            return title;
        }

        public final boolean hasStats() {
            return this._builder.hasStats();
        }

        public final void setAction(String str) {
            x.f(str, "value");
            this._builder.setAction(str);
        }

        public final void setAnalytics(String str) {
            x.f(str, "value");
            this._builder.setAnalytics(str);
        }

        public final void setBody(String str) {
            x.f(str, "value");
            this._builder.setBody(str);
        }

        public final void setCode(int i2) {
            this._builder.setCode(i2);
        }

        public final void setDeepLink(String str) {
            x.f(str, "value");
            this._builder.setDeepLink(str);
        }

        public final void setErrorCode(String str) {
            x.f(str, "value");
            this._builder.setErrorCode(str);
        }

        public final void setHideCloseButton(boolean z) {
            this._builder.setHideCloseButton(z);
        }

        public final void setShowAsToast(boolean z) {
            this._builder.setShowAsToast(z);
        }

        public final void setStats(TransactionStatsMessage transactionStatsMessage) {
            x.f(transactionStatsMessage, "value");
            this._builder.setStats(transactionStatsMessage);
        }

        public final void setTerminal(boolean z) {
            this._builder.setTerminal(z);
        }

        public final void setTitle(String str) {
            x.f(str, "value");
            this._builder.setTitle(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(ResultStructMessage.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(ResultStructMessage.Builder builder, o oVar) {
            this(builder);
        }
    }
}
