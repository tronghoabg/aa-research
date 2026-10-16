package com.waze.jni.protos;

import com.waze.jni.protos.EtaLabelData;
import com.waze.jni.protos.common.SkinState;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EtaLabelDataKt {
    public static final EtaLabelDataKt INSTANCE = new EtaLabelDataKt();

    private EtaLabelDataKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final EtaLabelData.Builder _builder;

        private Dsl(EtaLabelData.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ EtaLabelData _build() {
            EtaLabelData etaLabelDataBuild = this._builder.build();
            x.e(etaLabelDataBuild, "build(...)");
            return etaLabelDataBuild;
        }

        public final void clearBackgroundColor() {
            this._builder.clearBackgroundColor();
        }

        public final void clearDpi() {
            this._builder.clearDpi();
        }

        public final void clearImage() {
            this._builder.clearImage();
        }

        public final void clearImageType() {
            this._builder.clearImageType();
        }

        public final void clearSkinState() {
            this._builder.clearSkinState();
        }

        public final void clearSubTitle() {
            this._builder.clearSubTitle();
        }

        public final void clearSubtitleColor() {
            this._builder.clearSubtitleColor();
        }

        public final void clearTitle() {
            this._builder.clearTitle();
        }

        public final void clearTitleColor() {
            this._builder.clearTitleColor();
        }

        public final int getBackgroundColor() {
            return this._builder.getBackgroundColor();
        }

        public final int getDpi() {
            return this._builder.getDpi();
        }

        public final String getImage() {
            String image = this._builder.getImage();
            x.e(image, "getImage(...)");
            return image;
        }

        public final int getImageType() {
            return this._builder.getImageType();
        }

        public final SkinState getSkinState() {
            SkinState skinState = this._builder.getSkinState();
            x.e(skinState, "getSkinState(...)");
            return skinState;
        }

        public final int getSkinStateValue() {
            return this._builder.getSkinStateValue();
        }

        public final String getSubTitle() {
            String subTitle = this._builder.getSubTitle();
            x.e(subTitle, "getSubTitle(...)");
            return subTitle;
        }

        public final int getSubtitleColor() {
            return this._builder.getSubtitleColor();
        }

        public final String getTitle() {
            String title = this._builder.getTitle();
            x.e(title, "getTitle(...)");
            return title;
        }

        public final int getTitleColor() {
            return this._builder.getTitleColor();
        }

        public final boolean hasImage() {
            return this._builder.hasImage();
        }

        public final boolean hasImageType() {
            return this._builder.hasImageType();
        }

        public final boolean hasSubTitle() {
            return this._builder.hasSubTitle();
        }

        public final boolean hasSubtitleColor() {
            return this._builder.hasSubtitleColor();
        }

        public final void setBackgroundColor(int i2) {
            this._builder.setBackgroundColor(i2);
        }

        public final void setDpi(int i2) {
            this._builder.setDpi(i2);
        }

        public final void setImage(String str) {
            x.f(str, "value");
            this._builder.setImage(str);
        }

        public final void setImageType(int i2) {
            this._builder.setImageType(i2);
        }

        public final void setSkinState(SkinState skinState) {
            x.f(skinState, "value");
            this._builder.setSkinState(skinState);
        }

        public final void setSkinStateValue(int i2) {
            this._builder.setSkinStateValue(i2);
        }

        public final void setSubTitle(String str) {
            x.f(str, "value");
            this._builder.setSubTitle(str);
        }

        public final void setSubtitleColor(int i2) {
            this._builder.setSubtitleColor(i2);
        }

        public final void setTitle(String str) {
            x.f(str, "value");
            this._builder.setTitle(str);
        }

        public final void setTitleColor(int i2) {
            this._builder.setTitleColor(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(EtaLabelData.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(EtaLabelData.Builder builder, o oVar) {
            this(builder);
        }
    }
}
