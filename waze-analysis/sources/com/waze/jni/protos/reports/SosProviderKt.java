package com.waze.jni.protos.reports;

import com.waze.jni.protos.reports.SosProvider;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class SosProviderKt {
    public static final SosProviderKt INSTANCE = new SosProviderKt();

    private SosProviderKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final SosProvider.Builder _builder;

        private Dsl(SosProvider.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ SosProvider _build() {
            SosProvider sosProviderBuild = this._builder.build();
            x.e(sosProviderBuild, "build(...)");
            return sosProviderBuild;
        }

        public final void clearEmail() {
            this._builder.clearEmail();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearPhoneCall() {
            this._builder.clearPhoneCall();
        }

        public final void clearPhoneSend() {
            this._builder.clearPhoneSend();
        }

        public final void clearSubtype() {
            this._builder.clearSubtype();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final void clearUrl() {
            this._builder.clearUrl();
        }

        public final String getEmail() {
            String email = this._builder.getEmail();
            x.e(email, "getEmail(...)");
            return email;
        }

        public final String getName() {
            String name = this._builder.getName();
            x.e(name, "getName(...)");
            return name;
        }

        public final String getPhoneCall() {
            String phoneCall = this._builder.getPhoneCall();
            x.e(phoneCall, "getPhoneCall(...)");
            return phoneCall;
        }

        public final String getPhoneSend() {
            String phoneSend = this._builder.getPhoneSend();
            x.e(phoneSend, "getPhoneSend(...)");
            return phoneSend;
        }

        public final SosProvider.ProviderSubType getSubtype() {
            SosProvider.ProviderSubType subtype = this._builder.getSubtype();
            x.e(subtype, "getSubtype(...)");
            return subtype;
        }

        public final int getSubtypeValue() {
            return this._builder.getSubtypeValue();
        }

        public final SosProvider.ProviderType getType() {
            SosProvider.ProviderType type = this._builder.getType();
            x.e(type, "getType(...)");
            return type;
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final String getUrl() {
            String url = this._builder.getUrl();
            x.e(url, "getUrl(...)");
            return url;
        }

        public final boolean hasEmail() {
            return this._builder.hasEmail();
        }

        public final boolean hasName() {
            return this._builder.hasName();
        }

        public final boolean hasPhoneCall() {
            return this._builder.hasPhoneCall();
        }

        public final boolean hasPhoneSend() {
            return this._builder.hasPhoneSend();
        }

        public final boolean hasSubtype() {
            return this._builder.hasSubtype();
        }

        public final boolean hasType() {
            return this._builder.hasType();
        }

        public final boolean hasUrl() {
            return this._builder.hasUrl();
        }

        public final void setEmail(String str) {
            x.f(str, "value");
            this._builder.setEmail(str);
        }

        public final void setName(String str) {
            x.f(str, "value");
            this._builder.setName(str);
        }

        public final void setPhoneCall(String str) {
            x.f(str, "value");
            this._builder.setPhoneCall(str);
        }

        public final void setPhoneSend(String str) {
            x.f(str, "value");
            this._builder.setPhoneSend(str);
        }

        public final void setSubtype(SosProvider.ProviderSubType providerSubType) {
            x.f(providerSubType, "value");
            this._builder.setSubtype(providerSubType);
        }

        public final void setSubtypeValue(int i2) {
            this._builder.setSubtypeValue(i2);
        }

        public final void setType(SosProvider.ProviderType providerType) {
            x.f(providerType, "value");
            this._builder.setType(providerType);
        }

        public final void setTypeValue(int i2) {
            this._builder.setTypeValue(i2);
        }

        public final void setUrl(String str) {
            x.f(str, "value");
            this._builder.setUrl(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(SosProvider.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(SosProvider.Builder builder, o oVar) {
            this(builder);
        }
    }
}
