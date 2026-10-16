package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.RoutingPopup;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RoutingPopupKt {
    public static final RoutingPopupKt INSTANCE = new RoutingPopupKt();

    private RoutingPopupKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final RoutingPopup.Builder _builder;

        private Dsl(RoutingPopup.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ RoutingPopup _build() {
            RoutingPopup routingPopupBuild = this._builder.build();
            x.e(routingPopupBuild, "build(...)");
            return routingPopupBuild;
        }

        public final void clearActions() {
            this._builder.clearActions();
        }

        public final void clearCheckboxText() {
            this._builder.clearCheckboxText();
        }

        public final void clearImageUrl() {
            this._builder.clearImageUrl();
        }

        public final void clearInCarActions() {
            this._builder.clearInCarActions();
        }

        public final void clearInCarPrimaryButtonText() {
            this._builder.clearInCarPrimaryButtonText();
        }

        public final void clearInCarSecondaryButtonText() {
            this._builder.clearInCarSecondaryButtonText();
        }

        public final void clearInCarSubtitle() {
            this._builder.clearInCarSubtitle();
        }

        public final void clearInCarTitle() {
            this._builder.clearInCarTitle();
        }

        public final void clearPrimaryButtonText() {
            this._builder.clearPrimaryButtonText();
        }

        public final void clearSecondaryButtonText() {
            this._builder.clearSecondaryButtonText();
        }

        public final void clearSubtitle() {
            this._builder.clearSubtitle();
        }

        public final void clearTitle() {
            this._builder.clearTitle();
        }

        public final RoutingPopupActions getActions() {
            RoutingPopupActions actions = this._builder.getActions();
            x.e(actions, "getActions(...)");
            return actions;
        }

        public final RoutingPopupActions getActionsOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return RoutingPopupKtKt.getActionsOrNull(dsl._builder);
        }

        public final String getCheckboxText() {
            String checkboxText = this._builder.getCheckboxText();
            x.e(checkboxText, "getCheckboxText(...)");
            return checkboxText;
        }

        public final String getImageUrl() {
            String imageUrl = this._builder.getImageUrl();
            x.e(imageUrl, "getImageUrl(...)");
            return imageUrl;
        }

        public final RoutingPopupActions getInCarActions() {
            RoutingPopupActions inCarActions = this._builder.getInCarActions();
            x.e(inCarActions, "getInCarActions(...)");
            return inCarActions;
        }

        public final RoutingPopupActions getInCarActionsOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return RoutingPopupKtKt.getInCarActionsOrNull(dsl._builder);
        }

        public final String getInCarPrimaryButtonText() {
            String inCarPrimaryButtonText = this._builder.getInCarPrimaryButtonText();
            x.e(inCarPrimaryButtonText, "getInCarPrimaryButtonText(...)");
            return inCarPrimaryButtonText;
        }

        public final String getInCarSecondaryButtonText() {
            String inCarSecondaryButtonText = this._builder.getInCarSecondaryButtonText();
            x.e(inCarSecondaryButtonText, "getInCarSecondaryButtonText(...)");
            return inCarSecondaryButtonText;
        }

        public final String getInCarSubtitle() {
            String inCarSubtitle = this._builder.getInCarSubtitle();
            x.e(inCarSubtitle, "getInCarSubtitle(...)");
            return inCarSubtitle;
        }

        public final String getInCarTitle() {
            String inCarTitle = this._builder.getInCarTitle();
            x.e(inCarTitle, "getInCarTitle(...)");
            return inCarTitle;
        }

        public final String getPrimaryButtonText() {
            String primaryButtonText = this._builder.getPrimaryButtonText();
            x.e(primaryButtonText, "getPrimaryButtonText(...)");
            return primaryButtonText;
        }

        public final String getSecondaryButtonText() {
            String secondaryButtonText = this._builder.getSecondaryButtonText();
            x.e(secondaryButtonText, "getSecondaryButtonText(...)");
            return secondaryButtonText;
        }

        public final String getSubtitle() {
            String subtitle = this._builder.getSubtitle();
            x.e(subtitle, "getSubtitle(...)");
            return subtitle;
        }

        public final String getTitle() {
            String title = this._builder.getTitle();
            x.e(title, "getTitle(...)");
            return title;
        }

        public final boolean hasActions() {
            return this._builder.hasActions();
        }

        public final boolean hasCheckboxText() {
            return this._builder.hasCheckboxText();
        }

        public final boolean hasInCarActions() {
            return this._builder.hasInCarActions();
        }

        public final void setActions(RoutingPopupActions routingPopupActions) {
            x.f(routingPopupActions, "value");
            this._builder.setActions(routingPopupActions);
        }

        public final void setCheckboxText(String str) {
            x.f(str, "value");
            this._builder.setCheckboxText(str);
        }

        public final void setImageUrl(String str) {
            x.f(str, "value");
            this._builder.setImageUrl(str);
        }

        public final void setInCarActions(RoutingPopupActions routingPopupActions) {
            x.f(routingPopupActions, "value");
            this._builder.setInCarActions(routingPopupActions);
        }

        public final void setInCarPrimaryButtonText(String str) {
            x.f(str, "value");
            this._builder.setInCarPrimaryButtonText(str);
        }

        public final void setInCarSecondaryButtonText(String str) {
            x.f(str, "value");
            this._builder.setInCarSecondaryButtonText(str);
        }

        public final void setInCarSubtitle(String str) {
            x.f(str, "value");
            this._builder.setInCarSubtitle(str);
        }

        public final void setInCarTitle(String str) {
            x.f(str, "value");
            this._builder.setInCarTitle(str);
        }

        public final void setPrimaryButtonText(String str) {
            x.f(str, "value");
            this._builder.setPrimaryButtonText(str);
        }

        public final void setSecondaryButtonText(String str) {
            x.f(str, "value");
            this._builder.setSecondaryButtonText(str);
        }

        public final void setSubtitle(String str) {
            x.f(str, "value");
            this._builder.setSubtitle(str);
        }

        public final void setTitle(String str) {
            x.f(str, "value");
            this._builder.setTitle(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(RoutingPopup.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(RoutingPopup.Builder builder, o oVar) {
            this(builder);
        }
    }
}
