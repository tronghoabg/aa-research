package androidx.autofill.inline.v1;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.support.v7.widget.be$$ExternalSyntheticApiModelOutline0;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.autofill.inline.UiVersions;
import androidx.autofill.inline.common.BundledStyle;
import androidx.autofill.inline.common.ImageViewStyle;
import androidx.autofill.inline.common.SlicedContent;
import androidx.autofill.inline.common.TextViewStyle;
import androidx.autofill.inline.common.ViewStyle;
import com.waze.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class InlineSuggestionUi {
    private static final String TAG = "InlineSuggestionUi";

    /* compiled from: WazeSource */
    public final class Content extends SlicedContent {
        static final String HINT_INLINE_ATTRIBUTION_INTENT = "inline_attribution";
        static final String HINT_INLINE_CONTENT_DESCRIPTION = "inline_content_description";
        static final String HINT_INLINE_END_ICON = "inline_end_icon";
        static final String HINT_INLINE_START_ICON = "inline_start_icon";
        static final String HINT_INLINE_SUBTITLE = "inline_subtitle";
        static final String HINT_INLINE_TITLE = "inline_title";
        private PendingIntent mAttributionIntent;
        private CharSequence mContentDescription;
        private Icon mEndIcon;
        private Icon mStartIcon;
        private CharSequence mSubtitle;
        private CharSequence mTitle;

        /* compiled from: WazeSource */
        public final class Builder extends SlicedContent.Builder<Content> {
            private final PendingIntent mAttributionIntent;
            private CharSequence mContentDescription;
            private Icon mEndIcon;
            private List<String> mHints;
            private Icon mStartIcon;
            private CharSequence mSubtitle;
            private CharSequence mTitle;

            Builder(PendingIntent pendingIntent) {
                super(UiVersions.INLINE_UI_VERSION_1);
                this.mAttributionIntent = pendingIntent;
            }

            @Override // androidx.autofill.inline.common.SlicedContent.Builder
            public Content build() {
                CharSequence charSequence = this.mTitle;
                if (charSequence == null && this.mStartIcon == null && this.mEndIcon == null && this.mSubtitle == null) {
                    throw new IllegalStateException("Title, subtitle, start icon, end icon are all null. Please set value for at least one of them");
                }
                if (charSequence == null && this.mSubtitle != null) {
                    throw new IllegalStateException("Cannot set the subtitle without setting the title.");
                }
                if (this.mAttributionIntent == null) {
                    throw new IllegalStateException("Attribution intent cannot be null.");
                }
                Icon icon = this.mStartIcon;
                if (icon != null) {
                    this.mSliceBuilder.addIcon(icon, null, Collections.singletonList(Content.HINT_INLINE_START_ICON));
                }
                CharSequence charSequence2 = this.mTitle;
                if (charSequence2 != null) {
                    this.mSliceBuilder.addText(charSequence2, null, Collections.singletonList(Content.HINT_INLINE_TITLE));
                }
                CharSequence charSequence3 = this.mSubtitle;
                if (charSequence3 != null) {
                    this.mSliceBuilder.addText(charSequence3, null, Collections.singletonList(Content.HINT_INLINE_SUBTITLE));
                }
                Icon icon2 = this.mEndIcon;
                if (icon2 != null) {
                    this.mSliceBuilder.addIcon(icon2, null, Collections.singletonList(Content.HINT_INLINE_END_ICON));
                }
                PendingIntent pendingIntent = this.mAttributionIntent;
                if (pendingIntent != null) {
                    Slice.Builder builder = this.mSliceBuilder;
                    builder.addAction(pendingIntent, new Slice.Builder(builder).addHints(Collections.singletonList(Content.HINT_INLINE_ATTRIBUTION_INTENT)).build(), null);
                }
                CharSequence charSequence4 = this.mContentDescription;
                if (charSequence4 != null) {
                    this.mSliceBuilder.addText(charSequence4, null, Collections.singletonList(Content.HINT_INLINE_CONTENT_DESCRIPTION));
                }
                List<String> list = this.mHints;
                if (list != null) {
                    this.mSliceBuilder.addHints(list);
                }
                return new Content(this.mSliceBuilder.build());
            }

            public Builder setContentDescription(CharSequence charSequence) {
                this.mContentDescription = charSequence;
                return this;
            }

            public Builder setEndIcon(Icon icon) {
                this.mEndIcon = icon;
                return this;
            }

            public Builder setHints(List<String> list) {
                this.mHints = list;
                return this;
            }

            public Builder setStartIcon(Icon icon) {
                this.mStartIcon = icon;
                return this;
            }

            public Builder setSubtitle(CharSequence charSequence) {
                this.mSubtitle = charSequence;
                return this;
            }

            public Builder setTitle(CharSequence charSequence) {
                this.mTitle = charSequence;
                return this;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        Content(Slice slice) {
            super(slice);
            Iterator it = slice.getItems().iterator();
            while (it.hasNext()) {
                SliceItem sliceItemM94m = be$$ExternalSyntheticApiModelOutline0.m94m(it.next());
                String strItemType = itemType(sliceItemM94m);
                if (strItemType != null) {
                    switch (strItemType.hashCode()) {
                        case -1790855426:
                            if (!strItemType.equals(HINT_INLINE_SUBTITLE)) {
                                break;
                            } else {
                                this.mSubtitle = sliceItemM94m.getText().toString();
                                break;
                            }
                        case -1269099888:
                            if (!strItemType.equals(HINT_INLINE_CONTENT_DESCRIPTION)) {
                                break;
                            } else {
                                this.mContentDescription = sliceItemM94m.getText();
                                break;
                            }
                        case -145102948:
                            if (!strItemType.equals(HINT_INLINE_START_ICON)) {
                                break;
                            } else {
                                this.mStartIcon = sliceItemM94m.getIcon();
                                break;
                            }
                        case 729157938:
                            if (!strItemType.equals(HINT_INLINE_TITLE)) {
                                break;
                            } else {
                                this.mTitle = sliceItemM94m.getText().toString();
                                break;
                            }
                        case 1020097497:
                            if (!strItemType.equals(HINT_INLINE_ATTRIBUTION_INTENT)) {
                                break;
                            } else {
                                this.mAttributionIntent = sliceItemM94m.getAction();
                                break;
                            }
                        case 1994860611:
                            if (!strItemType.equals(HINT_INLINE_END_ICON)) {
                                break;
                            } else {
                                this.mEndIcon = sliceItemM94m.getIcon();
                                break;
                            }
                    }
                }
            }
        }

        private static String itemType(SliceItem sliceItem) {
            String format = sliceItem.getFormat();
            int iHashCode = format.hashCode();
            if (iHashCode == -1422950858) {
                if (format.equals("action") && sliceItem.getAction() != null && sliceItem.getHints().contains(HINT_INLINE_ATTRIBUTION_INTENT)) {
                    return HINT_INLINE_ATTRIBUTION_INTENT;
                }
                return null;
            }
            if (iHashCode != 3556653) {
                if (iHashCode != 100313435 || !format.equals("image") || sliceItem.getIcon() == null) {
                    return null;
                }
                if (sliceItem.getHints().contains(HINT_INLINE_START_ICON)) {
                    return HINT_INLINE_START_ICON;
                }
                if (sliceItem.getHints().contains(HINT_INLINE_END_ICON)) {
                    return HINT_INLINE_END_ICON;
                }
                return null;
            }
            if (!format.equals("text") || TextUtils.isEmpty(sliceItem.getText())) {
                return null;
            }
            if (sliceItem.getHints().contains(HINT_INLINE_TITLE)) {
                return HINT_INLINE_TITLE;
            }
            if (sliceItem.getHints().contains(HINT_INLINE_SUBTITLE)) {
                return HINT_INLINE_SUBTITLE;
            }
            if (sliceItem.getHints().contains(HINT_INLINE_CONTENT_DESCRIPTION)) {
                return HINT_INLINE_CONTENT_DESCRIPTION;
            }
            return null;
        }

        @Override // androidx.autofill.inline.common.SlicedContent
        public PendingIntent getAttributionIntent() {
            return this.mAttributionIntent;
        }

        public CharSequence getContentDescription() {
            return this.mContentDescription;
        }

        public Icon getEndIcon() {
            return this.mEndIcon;
        }

        public Icon getStartIcon() {
            return this.mStartIcon;
        }

        public CharSequence getSubtitle() {
            return this.mSubtitle;
        }

        public CharSequence getTitle() {
            return this.mTitle;
        }

        boolean isSingleIconOnly() {
            return this.mStartIcon != null && this.mTitle == null && this.mSubtitle == null && this.mEndIcon == null;
        }

        @Override // androidx.autofill.inline.common.SlicedContent
        public boolean isValid() {
            return UiVersions.INLINE_UI_VERSION_1.equals(SlicedContent.getVersion(this.mSlice));
        }
    }

    private InlineSuggestionUi() {
    }

    public static Style fromBundle(Bundle bundle) {
        Style style = new Style(bundle);
        if (style.isValid()) {
            return style;
        }
        Log.w(TAG, "Invalid style for androidx.autofill.inline.ui.version:v1");
        return null;
    }

    public static Content fromSlice(Slice slice) {
        Content content = new Content(slice);
        if (content.isValid()) {
            return content;
        }
        Log.w(TAG, "Invalid content for androidx.autofill.inline.ui.version:v1");
        return null;
    }

    public static PendingIntent getAttributionIntent(Content content) {
        return content.getAttributionIntent();
    }

    private static Context getDefaultContextThemeWrapper(Context context) {
        Resources.Theme themeNewTheme = context.getResources().newTheme();
        themeNewTheme.applyStyle(2131952493, true);
        return new ContextThemeWrapper(context, themeNewTheme);
    }

    public static Content.Builder newContentBuilder(PendingIntent pendingIntent) {
        return new Content.Builder(pendingIntent);
    }

    public static Style.Builder newStyleBuilder() {
        return new Style.Builder();
    }

    public static View render(Context context, Content content, Style style) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getDefaultContextThemeWrapper(context));
        boolean zIsValid = style.isValid();
        int i2 = R.layout.autofill_inline_suggestion;
        if (zIsValid && style.getLayoutTruncationPreference() == 1) {
            i2 = R.layout.autofill_inline_suggestion_balancing;
        }
        ViewGroup viewGroup = (ViewGroup) layoutInflaterFrom.inflate(i2, (ViewGroup) null);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.autofill_inline_suggestion_start_icon);
        TextView textView = (TextView) viewGroup.findViewById(R.id.autofill_inline_suggestion_title);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.autofill_inline_suggestion_subtitle);
        ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.autofill_inline_suggestion_end_icon);
        CharSequence title = content.getTitle();
        if (title != null) {
            textView.setText(title);
            textView.setVisibility(0);
        }
        CharSequence subtitle = content.getSubtitle();
        if (subtitle != null) {
            textView2.setText(subtitle);
            textView2.setVisibility(0);
        }
        setImageIcon(imageView, content.getStartIcon());
        setImageIcon(imageView2, content.getEndIcon());
        CharSequence contentDescription = content.getContentDescription();
        if (!TextUtils.isEmpty(contentDescription)) {
            viewGroup.setContentDescription(contentDescription);
        }
        if (style.isValid()) {
            if (content.isSingleIconOnly()) {
                style.applyStyle(viewGroup, imageView);
                return viewGroup;
            }
            style.applyStyle(viewGroup, imageView, textView, textView2, imageView2);
        }
        return viewGroup;
    }

    private static void setImageIcon(ImageView imageView, Icon icon) {
        if (icon == null) {
            return;
        }
        imageView.setImageIcon(icon);
        final Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            imageView.post(new Runnable() { // from class: androidx.autofill.inline.v1.InlineSuggestionUi$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ((Animatable) drawable).start();
                }
            });
        }
        imageView.setVisibility(0);
    }

    /* compiled from: WazeSource */
    public final class Style extends BundledStyle implements UiVersions.Style {
        private static final String KEY_CHIP_STYLE = "chip_style";
        private static final String KEY_END_ICON_STYLE = "end_icon_style";
        private static final String KEY_LAYOUT_DIRECTION = "layout_direction";
        private static final String KEY_LAYOUT_TRUNCATION_PREFERENCE = "layout_truncation_preference";
        private static final String KEY_SINGLE_ICON_CHIP_ICON_STYLE = "single_icon_chip_icon_style";
        private static final String KEY_SINGLE_ICON_CHIP_STYLE = "single_icon_chip_style";
        private static final String KEY_START_ICON_STYLE = "start_icon_style";
        private static final String KEY_STYLE_V1 = "style_v1";
        private static final String KEY_SUBTITLE_STYLE = "subtitle_style";
        private static final String KEY_TITLE_STYLE = "title_style";
        public static final int LAYOUT_TRUNCATION_PREFERENCE_BALANCING_TITLE_SUBTITLE = 1;
        public static final int LAYOUT_TRUNCATION_PREFERENCE_PRIORITIZE_TITLE = 0;

        /* compiled from: WazeSource */
        public final class Builder extends BundledStyle.Builder<Style> {
            Builder() {
                super(Style.KEY_STYLE_V1);
            }

            @Override // androidx.autofill.inline.common.BundledStyle.Builder
            public Style build() {
                return new Style(this.mBundle);
            }

            public Builder setChipStyle(ViewStyle viewStyle) {
                viewStyle.assertIsValid();
                this.mBundle.putBundle(Style.KEY_CHIP_STYLE, viewStyle.getBundle());
                return this;
            }

            public Builder setEndIconStyle(ImageViewStyle imageViewStyle) {
                imageViewStyle.assertIsValid();
                this.mBundle.putBundle(Style.KEY_END_ICON_STYLE, imageViewStyle.getBundle());
                return this;
            }

            public Builder setLayoutDirection(int i2) {
                this.mBundle.putInt(Style.KEY_LAYOUT_DIRECTION, i2);
                return this;
            }

            public Builder setLayoutTruncationPreference(int i2) {
                this.mBundle.putInt(Style.KEY_LAYOUT_TRUNCATION_PREFERENCE, i2);
                return this;
            }

            public Builder setSingleIconChipIconStyle(ImageViewStyle imageViewStyle) {
                imageViewStyle.assertIsValid();
                this.mBundle.putBundle(Style.KEY_SINGLE_ICON_CHIP_ICON_STYLE, imageViewStyle.getBundle());
                return this;
            }

            public Builder setSingleIconChipStyle(ViewStyle viewStyle) {
                viewStyle.assertIsValid();
                this.mBundle.putBundle(Style.KEY_SINGLE_ICON_CHIP_STYLE, viewStyle.getBundle());
                return this;
            }

            public Builder setStartIconStyle(ImageViewStyle imageViewStyle) {
                imageViewStyle.assertIsValid();
                this.mBundle.putBundle(Style.KEY_START_ICON_STYLE, imageViewStyle.getBundle());
                return this;
            }

            public Builder setSubtitleStyle(TextViewStyle textViewStyle) {
                textViewStyle.assertIsValid();
                this.mBundle.putBundle(Style.KEY_SUBTITLE_STYLE, textViewStyle.getBundle());
                return this;
            }

            public Builder setTitleStyle(TextViewStyle textViewStyle) {
                textViewStyle.assertIsValid();
                this.mBundle.putBundle(Style.KEY_TITLE_STYLE, textViewStyle.getBundle());
                return this;
            }
        }

        /* compiled from: WazeSource */
        @Retention(RetentionPolicy.SOURCE)
        public @interface LayoutTruncationPreference {
        }

        Style(Bundle bundle) {
            super(bundle);
        }

        public void applyStyle(View view, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2) {
            ImageViewStyle endIconStyle;
            TextViewStyle subtitleStyle;
            TextViewStyle titleStyle;
            ImageViewStyle startIconStyle;
            if (isValid()) {
                view.setLayoutDirection(getLayoutDirection());
                if (imageView.getVisibility() != 8 && (startIconStyle = getStartIconStyle()) != null) {
                    startIconStyle.applyStyleOnImageViewIfValid(imageView);
                }
                if (textView.getVisibility() != 8 && (titleStyle = getTitleStyle()) != null) {
                    titleStyle.applyStyleOnTextViewIfValid(textView);
                }
                if (textView2.getVisibility() != 8 && (subtitleStyle = getSubtitleStyle()) != null) {
                    subtitleStyle.applyStyleOnTextViewIfValid(textView2);
                }
                if (imageView2.getVisibility() != 8 && (endIconStyle = getEndIconStyle()) != null) {
                    endIconStyle.applyStyleOnImageViewIfValid(imageView2);
                }
                ViewStyle chipStyle = getChipStyle();
                if (chipStyle != null) {
                    chipStyle.applyStyleOnViewIfValid(view);
                }
            }
        }

        public ViewStyle getChipStyle() {
            Bundle bundle = this.mBundle.getBundle(KEY_CHIP_STYLE);
            if (bundle == null) {
                return null;
            }
            return new ViewStyle(bundle);
        }

        public ImageViewStyle getEndIconStyle() {
            Bundle bundle = this.mBundle.getBundle(KEY_END_ICON_STYLE);
            if (bundle == null) {
                return null;
            }
            return new ImageViewStyle(bundle);
        }

        public int getLayoutDirection() {
            int i2 = this.mBundle.getInt(KEY_LAYOUT_DIRECTION, 0);
            if (i2 == 0 || i2 == 1) {
                return i2;
            }
            return 0;
        }

        public int getLayoutTruncationPreference() {
            return this.mBundle.getInt(KEY_LAYOUT_TRUNCATION_PREFERENCE, 0);
        }

        public ImageViewStyle getSingleIconChipIconStyle() {
            Bundle bundle = this.mBundle.getBundle(KEY_SINGLE_ICON_CHIP_ICON_STYLE);
            if (bundle == null) {
                return null;
            }
            return new ImageViewStyle(bundle);
        }

        public ViewStyle getSingleIconChipStyle() {
            Bundle bundle = this.mBundle.getBundle(KEY_SINGLE_ICON_CHIP_STYLE);
            if (bundle == null) {
                return null;
            }
            return new ViewStyle(bundle);
        }

        public ImageViewStyle getStartIconStyle() {
            Bundle bundle = this.mBundle.getBundle(KEY_START_ICON_STYLE);
            if (bundle == null) {
                return null;
            }
            return new ImageViewStyle(bundle);
        }

        @Override // androidx.autofill.inline.common.BundledStyle
        protected String getStyleKey() {
            return KEY_STYLE_V1;
        }

        public TextViewStyle getSubtitleStyle() {
            Bundle bundle = this.mBundle.getBundle(KEY_SUBTITLE_STYLE);
            if (bundle == null) {
                return null;
            }
            return new TextViewStyle(bundle);
        }

        public TextViewStyle getTitleStyle() {
            Bundle bundle = this.mBundle.getBundle(KEY_TITLE_STYLE);
            if (bundle == null) {
                return null;
            }
            return new TextViewStyle(bundle);
        }

        @Override // androidx.autofill.inline.UiVersions.Style
        public String getVersion() {
            return UiVersions.INLINE_UI_VERSION_1;
        }

        public void applyStyle(View view, ImageView imageView) {
            if (isValid()) {
                view.setLayoutDirection(getLayoutDirection());
                if (imageView.getVisibility() != 8) {
                    ImageViewStyle singleIconChipIconStyle = getSingleIconChipIconStyle();
                    if (singleIconChipIconStyle == null) {
                        singleIconChipIconStyle = getStartIconStyle();
                    }
                    if (singleIconChipIconStyle != null) {
                        singleIconChipIconStyle.applyStyleOnImageViewIfValid(imageView);
                    }
                }
                ViewStyle singleIconChipStyle = getSingleIconChipStyle();
                if (singleIconChipStyle == null) {
                    singleIconChipStyle = getChipStyle();
                }
                if (singleIconChipStyle != null) {
                    singleIconChipStyle.applyStyleOnViewIfValid(view);
                }
            }
        }
    }
}
