package com.waze.jni.protos.nav_connect;

import com.google.v.v;
import com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfo;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavConnectPartnerAppInfoKt {
    public static final NavConnectPartnerAppInfoKt INSTANCE = new NavConnectPartnerAppInfoKt();

    private NavConnectPartnerAppInfoKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NavConnectPartnerAppInfo.Builder _builder;

        private Dsl(NavConnectPartnerAppInfo.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NavConnectPartnerAppInfo _build() {
            NavConnectPartnerAppInfo navConnectPartnerAppInfoBuild = this._builder.build();
            x.e(navConnectPartnerAppInfoBuild, "build(...)");
            return navConnectPartnerAppInfoBuild;
        }

        public final void clearIconData() {
            this._builder.clearIconData();
        }

        public final void clearIsvBusinessName() {
            this._builder.clearIsvBusinessName();
        }

        public final void clearIsvPrivacyPolicyUrl() {
            this._builder.clearIsvPrivacyPolicyUrl();
        }

        public final void clearPartnerAppId() {
            this._builder.clearPartnerAppId();
        }

        public final void clearPrivacyPolicyUrl() {
            this._builder.clearPrivacyPolicyUrl();
        }

        public final void clearTitle() {
            this._builder.clearTitle();
        }

        public final v getIconData() {
            v iconData = this._builder.getIconData();
            x.e(iconData, "getIconData(...)");
            return iconData;
        }

        public final String getIsvBusinessName() {
            String isvBusinessName = this._builder.getIsvBusinessName();
            x.e(isvBusinessName, "getIsvBusinessName(...)");
            return isvBusinessName;
        }

        public final String getIsvPrivacyPolicyUrl() {
            String isvPrivacyPolicyUrl = this._builder.getIsvPrivacyPolicyUrl();
            x.e(isvPrivacyPolicyUrl, "getIsvPrivacyPolicyUrl(...)");
            return isvPrivacyPolicyUrl;
        }

        public final String getPartnerAppId() {
            String partnerAppId = this._builder.getPartnerAppId();
            x.e(partnerAppId, "getPartnerAppId(...)");
            return partnerAppId;
        }

        public final String getPrivacyPolicyUrl() {
            String privacyPolicyUrl = this._builder.getPrivacyPolicyUrl();
            x.e(privacyPolicyUrl, "getPrivacyPolicyUrl(...)");
            return privacyPolicyUrl;
        }

        public final String getTitle() {
            String title = this._builder.getTitle();
            x.e(title, "getTitle(...)");
            return title;
        }

        public final void setIconData(v vVar) {
            x.f(vVar, "value");
            this._builder.setIconData(vVar);
        }

        public final void setIsvBusinessName(String str) {
            x.f(str, "value");
            this._builder.setIsvBusinessName(str);
        }

        public final void setIsvPrivacyPolicyUrl(String str) {
            x.f(str, "value");
            this._builder.setIsvPrivacyPolicyUrl(str);
        }

        public final void setPartnerAppId(String str) {
            x.f(str, "value");
            this._builder.setPartnerAppId(str);
        }

        public final void setPrivacyPolicyUrl(String str) {
            x.f(str, "value");
            this._builder.setPrivacyPolicyUrl(str);
        }

        public final void setTitle(String str) {
            x.f(str, "value");
            this._builder.setTitle(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NavConnectPartnerAppInfo.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NavConnectPartnerAppInfo.Builder builder, o oVar) {
            this(builder);
        }
    }
}
