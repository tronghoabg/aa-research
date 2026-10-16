package com.waze.jni.protos;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.QuestionProto;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class QuestionProtoKt {
    public static final QuestionProtoKt INSTANCE = new QuestionProtoKt();

    private QuestionProtoKt() {
    }

    /* renamed from: -initializecallToAction, reason: not valid java name */
    public final QuestionProto.CallToAction m25545initializecallToAction(l<? super CallToActionKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        CallToActionKt.Dsl.Companion companion = CallToActionKt.Dsl.Companion;
        QuestionProto.CallToAction.Builder builderNewBuilder = QuestionProto.CallToAction.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        CallToActionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializelink, reason: not valid java name */
    public final QuestionProto.Link m25546initializelink(l<? super LinkKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        LinkKt.Dsl.Companion companion = LinkKt.Dsl.Companion;
        QuestionProto.Link.Builder builderNewBuilder = QuestionProto.Link.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        LinkKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WazeSource */
    public final class CallToActionKt {
        public static final CallToActionKt INSTANCE = new CallToActionKt();

        private CallToActionKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final QuestionProto.CallToAction.Builder _builder;

            private Dsl(QuestionProto.CallToAction.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ QuestionProto.CallToAction _build() {
                QuestionProto.CallToAction callToActionBuild = this._builder.build();
                x.e(callToActionBuild, "build(...)");
                return callToActionBuild;
            }

            public final void clearBgColor() {
                this._builder.clearBgColor();
            }

            public final void clearIcon() {
                this._builder.clearIcon();
            }

            public final void clearId() {
                this._builder.clearId();
            }

            public final void clearText() {
                this._builder.clearText();
            }

            public final void clearTextColor() {
                this._builder.clearTextColor();
            }

            public final void clearUrl() {
                this._builder.clearUrl();
            }

            public final void clearWidthRatio() {
                this._builder.clearWidthRatio();
            }

            public final int getBgColor() {
                return this._builder.getBgColor();
            }

            public final String getIcon() {
                String icon = this._builder.getIcon();
                x.e(icon, "getIcon(...)");
                return icon;
            }

            public final String getId() {
                String id = this._builder.getId();
                x.e(id, "getId(...)");
                return id;
            }

            public final String getText() {
                String text = this._builder.getText();
                x.e(text, "getText(...)");
                return text;
            }

            public final int getTextColor() {
                return this._builder.getTextColor();
            }

            public final String getUrl() {
                String url = this._builder.getUrl();
                x.e(url, "getUrl(...)");
                return url;
            }

            public final float getWidthRatio() {
                return this._builder.getWidthRatio();
            }

            public final boolean hasIcon() {
                return this._builder.hasIcon();
            }

            public final boolean hasId() {
                return this._builder.hasId();
            }

            public final boolean hasText() {
                return this._builder.hasText();
            }

            public final boolean hasUrl() {
                return this._builder.hasUrl();
            }

            public final void setBgColor(int i2) {
                this._builder.setBgColor(i2);
            }

            public final void setIcon(String str) {
                x.f(str, "value");
                this._builder.setIcon(str);
            }

            public final void setId(String str) {
                x.f(str, "value");
                this._builder.setId(str);
            }

            public final void setText(String str) {
                x.f(str, "value");
                this._builder.setText(str);
            }

            public final void setTextColor(int i2) {
                this._builder.setTextColor(i2);
            }

            public final void setUrl(String str) {
                x.f(str, "value");
                this._builder.setUrl(str);
            }

            public final void setWidthRatio(float f2) {
                this._builder.setWidthRatio(f2);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(QuestionProto.CallToAction.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(QuestionProto.CallToAction.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class LinkKt {
        public static final LinkKt INSTANCE = new LinkKt();

        private LinkKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final QuestionProto.Link.Builder _builder;

            private Dsl(QuestionProto.Link.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ QuestionProto.Link _build() {
                QuestionProto.Link linkBuild = this._builder.build();
                x.e(linkBuild, "build(...)");
                return linkBuild;
            }

            public final void clearCaption() {
                this._builder.clearCaption();
            }

            public final void clearTitle() {
                this._builder.clearTitle();
            }

            public final void clearUrl() {
                this._builder.clearUrl();
            }

            public final String getCaption() {
                String caption = this._builder.getCaption();
                x.e(caption, "getCaption(...)");
                return caption;
            }

            public final String getTitle() {
                String title = this._builder.getTitle();
                x.e(title, "getTitle(...)");
                return title;
            }

            public final String getUrl() {
                String url = this._builder.getUrl();
                x.e(url, "getUrl(...)");
                return url;
            }

            public final boolean hasCaption() {
                return this._builder.hasCaption();
            }

            public final boolean hasTitle() {
                return this._builder.hasTitle();
            }

            public final boolean hasUrl() {
                return this._builder.hasUrl();
            }

            public final void setCaption(String str) {
                x.f(str, "value");
                this._builder.setCaption(str);
            }

            public final void setTitle(String str) {
                x.f(str, "value");
                this._builder.setTitle(str);
            }

            public final void setUrl(String str) {
                x.f(str, "value");
                this._builder.setUrl(str);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(QuestionProto.Link.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(QuestionProto.Link.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final QuestionProto.Builder _builder;

        /* compiled from: WazeSource */
        public final class CtasProxy extends c {
            private CtasProxy() {
            }
        }

        /* compiled from: WazeSource */
        public final class LinksProxy extends c {
            private LinksProxy() {
            }
        }

        private Dsl(QuestionProto.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ QuestionProto _build() {
            QuestionProto questionProtoBuild = this._builder.build();
            x.e(questionProtoBuild, "build(...)");
            return questionProtoBuild;
        }

        public final /* synthetic */ void addAllCtas(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllCtas(iterable);
        }

        public final /* synthetic */ void addAllLinks(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllLinks(iterable);
        }

        public final /* synthetic */ void addCtas(a aVar, QuestionProto.CallToAction callToAction) {
            x.f(aVar, "<this>");
            x.f(callToAction, "value");
            this._builder.addCtas(callToAction);
        }

        public final /* synthetic */ void addLinks(a aVar, QuestionProto.Link link) {
            x.f(aVar, "<this>");
            x.f(link, "value");
            this._builder.addLinks(link);
        }

        public final void clearAlwaysShow() {
            this._builder.clearAlwaysShow();
        }

        public final void clearButtonOrientation() {
            this._builder.clearButtonOrientation();
        }

        public final /* synthetic */ void clearCtas(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearCtas();
        }

        public final void clearDismissible() {
            this._builder.clearDismissible();
        }

        public final void clearDisplayTimeSec() {
            this._builder.clearDisplayTimeSec();
        }

        public final void clearEncTemplate() {
            this._builder.clearEncTemplate();
        }

        public final void clearImageUrl() {
            this._builder.clearImageUrl();
        }

        public final void clearKey() {
            this._builder.clearKey();
        }

        public final /* synthetic */ void clearLinks(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearLinks();
        }

        public final void clearQuestionId() {
            this._builder.clearQuestionId();
        }

        public final void clearSubtitle() {
            this._builder.clearSubtitle();
        }

        public final void clearText() {
            this._builder.clearText();
        }

        public final boolean getAlwaysShow() {
            return this._builder.getAlwaysShow();
        }

        public final int getButtonOrientation() {
            return this._builder.getButtonOrientation();
        }

        public final /* synthetic */ a getCtas() {
            List<QuestionProto.CallToAction> ctasList = this._builder.getCtasList();
            x.e(ctasList, "getCtasList(...)");
            return new a(ctasList);
        }

        public final boolean getDismissible() {
            return this._builder.getDismissible();
        }

        public final int getDisplayTimeSec() {
            return this._builder.getDisplayTimeSec();
        }

        public final QuestionProto.EncTemplate getEncTemplate() {
            QuestionProto.EncTemplate encTemplate = this._builder.getEncTemplate();
            x.e(encTemplate, "getEncTemplate(...)");
            return encTemplate;
        }

        public final int getEncTemplateValue() {
            return this._builder.getEncTemplateValue();
        }

        public final String getImageUrl() {
            String imageUrl = this._builder.getImageUrl();
            x.e(imageUrl, "getImageUrl(...)");
            return imageUrl;
        }

        public final String getKey() {
            String key = this._builder.getKey();
            x.e(key, "getKey(...)");
            return key;
        }

        public final /* synthetic */ a getLinks() {
            List<QuestionProto.Link> linksList = this._builder.getLinksList();
            x.e(linksList, "getLinksList(...)");
            return new a(linksList);
        }

        public final String getQuestionId() {
            String questionId = this._builder.getQuestionId();
            x.e(questionId, "getQuestionId(...)");
            return questionId;
        }

        public final String getSubtitle() {
            String subtitle = this._builder.getSubtitle();
            x.e(subtitle, "getSubtitle(...)");
            return subtitle;
        }

        public final String getText() {
            String text = this._builder.getText();
            x.e(text, "getText(...)");
            return text;
        }

        public final boolean hasImageUrl() {
            return this._builder.hasImageUrl();
        }

        public final boolean hasKey() {
            return this._builder.hasKey();
        }

        public final boolean hasQuestionId() {
            return this._builder.hasQuestionId();
        }

        public final boolean hasSubtitle() {
            return this._builder.hasSubtitle();
        }

        public final boolean hasText() {
            return this._builder.hasText();
        }

        public final /* synthetic */ void plusAssignAllCtas(a<QuestionProto.CallToAction, CtasProxy> aVar, Iterable<QuestionProto.CallToAction> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllCtas(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignAllLinks(a<QuestionProto.Link, LinksProxy> aVar, Iterable<QuestionProto.Link> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllLinks(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignCtas(a<QuestionProto.CallToAction, CtasProxy> aVar, QuestionProto.CallToAction callToAction) {
            x.f(aVar, "<this>");
            x.f(callToAction, "value");
            addCtas(aVar, callToAction);
        }

        public final /* synthetic */ void plusAssignLinks(a<QuestionProto.Link, LinksProxy> aVar, QuestionProto.Link link) {
            x.f(aVar, "<this>");
            x.f(link, "value");
            addLinks(aVar, link);
        }

        public final void setAlwaysShow(boolean z) {
            this._builder.setAlwaysShow(z);
        }

        public final void setButtonOrientation(int i2) {
            this._builder.setButtonOrientation(i2);
        }

        public final /* synthetic */ void setCtas(a aVar, int i2, QuestionProto.CallToAction callToAction) {
            x.f(aVar, "<this>");
            x.f(callToAction, "value");
            this._builder.setCtas(i2, callToAction);
        }

        public final void setDismissible(boolean z) {
            this._builder.setDismissible(z);
        }

        public final void setDisplayTimeSec(int i2) {
            this._builder.setDisplayTimeSec(i2);
        }

        public final void setEncTemplate(QuestionProto.EncTemplate encTemplate) {
            x.f(encTemplate, "value");
            this._builder.setEncTemplate(encTemplate);
        }

        public final void setEncTemplateValue(int i2) {
            this._builder.setEncTemplateValue(i2);
        }

        public final void setImageUrl(String str) {
            x.f(str, "value");
            this._builder.setImageUrl(str);
        }

        public final void setKey(String str) {
            x.f(str, "value");
            this._builder.setKey(str);
        }

        public final /* synthetic */ void setLinks(a aVar, int i2, QuestionProto.Link link) {
            x.f(aVar, "<this>");
            x.f(link, "value");
            this._builder.setLinks(i2, link);
        }

        public final void setQuestionId(String str) {
            x.f(str, "value");
            this._builder.setQuestionId(str);
        }

        public final void setSubtitle(String str) {
            x.f(str, "value");
            this._builder.setSubtitle(str);
        }

        public final void setText(String str) {
            x.f(str, "value");
            this._builder.setText(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(QuestionProto.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(QuestionProto.Builder builder, o oVar) {
            this(builder);
        }
    }
}
