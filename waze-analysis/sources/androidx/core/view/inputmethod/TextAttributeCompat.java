package androidx.core.view.inputmethod;

import android.os.Build;
import android.os.PersistableBundle;
import android.view.inputmethod.TextAttribute;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class TextAttributeCompat {
    private final TextAttributeCompatImpl mImpl;

    /* compiled from: WazeSource */
    public final class Builder {
        private List<String> mTextConversionSuggestions = new ArrayList();
        private PersistableBundle mExtras = new PersistableBundle();
        private boolean mTextSuggestionSelected = false;

        public TextAttributeCompat build() {
            return new TextAttributeCompat(this.mTextConversionSuggestions, this.mExtras, this.mTextSuggestionSelected);
        }

        public Builder setExtras(PersistableBundle persistableBundle) {
            this.mExtras = persistableBundle;
            return this;
        }

        public Builder setTextConversionSuggestions(List<String> list) {
            this.mTextConversionSuggestions = list;
            return this;
        }

        public Builder setTextSuggestionSelected(boolean z) {
            this.mTextSuggestionSelected = z;
            return this;
        }
    }

    /* compiled from: WazeSource */
    final class TextAttributeCompatBaseImpl implements TextAttributeCompatImpl {
        private final PersistableBundle mExtras;
        private final List<String> mTextConversionSuggestions;
        private final boolean mTextSuggestionSelected;

        TextAttributeCompatBaseImpl(List<String> list, PersistableBundle persistableBundle, boolean z) {
            this.mTextConversionSuggestions = DesugarCollections.unmodifiableList(list);
            this.mExtras = persistableBundle;
            this.mTextSuggestionSelected = z;
        }

        @Override // androidx.core.view.inputmethod.TextAttributeCompat.TextAttributeCompatImpl
        public PersistableBundle getExtras() {
            return this.mExtras;
        }

        @Override // androidx.core.view.inputmethod.TextAttributeCompat.TextAttributeCompatImpl
        public Object getTextAttribute() {
            return null;
        }

        @Override // androidx.core.view.inputmethod.TextAttributeCompat.TextAttributeCompatImpl
        public List<String> getTextConversionSuggestions() {
            return this.mTextConversionSuggestions;
        }

        @Override // androidx.core.view.inputmethod.TextAttributeCompat.TextAttributeCompatImpl
        public boolean isTextSuggestionSelected() {
            return this.mTextSuggestionSelected;
        }
    }

    /* compiled from: WazeSource */
    interface TextAttributeCompatImpl {
        PersistableBundle getExtras();

        Object getTextAttribute();

        List<String> getTextConversionSuggestions();

        boolean isTextSuggestionSelected();
    }

    private TextAttributeCompat(List<String> list, PersistableBundle persistableBundle, boolean z) {
        if (Build.VERSION.SDK_INT >= 37) {
            this.mImpl = new TextAttributeCompatApi37Impl(list, persistableBundle, z);
        } else if (Build.VERSION.SDK_INT >= 33) {
            this.mImpl = new TextAttributeCompatApi33Impl(list, persistableBundle, z);
        } else {
            this.mImpl = new TextAttributeCompatBaseImpl(list, persistableBundle, z);
        }
    }

    public static TextAttributeCompat wrap(Object obj) {
        if (obj == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 37) {
            return new TextAttributeCompat(new TextAttributeCompatApi37Impl(obj));
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return new TextAttributeCompat(new TextAttributeCompatApi33Impl(obj));
        }
        return null;
    }

    public PersistableBundle getExtras() {
        return this.mImpl.getExtras();
    }

    public List<String> getTextConversionSuggestions() {
        return this.mImpl.getTextConversionSuggestions();
    }

    public boolean isTextSuggestionSelected() {
        return this.mImpl.isTextSuggestionSelected();
    }

    public Object unwrap() {
        return this.mImpl.getTextAttribute();
    }

    /* compiled from: WazeSource */
    final class TextAttributeCompatApi33Impl implements TextAttributeCompatImpl {
        final TextAttribute mObject;
        private final boolean mTextSuggestionSelected;

        TextAttributeCompatApi33Impl(List<String> list, PersistableBundle persistableBundle, boolean z) {
            this.mObject = new TextAttribute.Builder().setTextConversionSuggestions(list).setExtras(persistableBundle).build();
            this.mTextSuggestionSelected = z;
        }

        @Override // androidx.core.view.inputmethod.TextAttributeCompat.TextAttributeCompatImpl
        public PersistableBundle getExtras() {
            return this.mObject.getExtras();
        }

        @Override // androidx.core.view.inputmethod.TextAttributeCompat.TextAttributeCompatImpl
        public Object getTextAttribute() {
            return this.mObject;
        }

        @Override // androidx.core.view.inputmethod.TextAttributeCompat.TextAttributeCompatImpl
        public List<String> getTextConversionSuggestions() {
            return this.mObject.getTextConversionSuggestions();
        }

        @Override // androidx.core.view.inputmethod.TextAttributeCompat.TextAttributeCompatImpl
        public boolean isTextSuggestionSelected() {
            return this.mTextSuggestionSelected;
        }

        TextAttributeCompatApi33Impl(Object obj) {
            this.mObject = (TextAttribute) obj;
            this.mTextSuggestionSelected = false;
        }
    }

    /* compiled from: WazeSource */
    final class TextAttributeCompatApi37Impl implements TextAttributeCompatImpl {
        final TextAttribute mObject;

        TextAttributeCompatApi37Impl(List<String> list, PersistableBundle persistableBundle, boolean z) {
            this.mObject = new TextAttribute.Builder().setTextConversionSuggestions(list).setExtras(persistableBundle).setTextSuggestionSelected(z).build();
        }

        @Override // androidx.core.view.inputmethod.TextAttributeCompat.TextAttributeCompatImpl
        public PersistableBundle getExtras() {
            return this.mObject.getExtras();
        }

        @Override // androidx.core.view.inputmethod.TextAttributeCompat.TextAttributeCompatImpl
        public Object getTextAttribute() {
            return this.mObject;
        }

        @Override // androidx.core.view.inputmethod.TextAttributeCompat.TextAttributeCompatImpl
        public List<String> getTextConversionSuggestions() {
            return this.mObject.getTextConversionSuggestions();
        }

        @Override // androidx.core.view.inputmethod.TextAttributeCompat.TextAttributeCompatImpl
        public boolean isTextSuggestionSelected() {
            return this.mObject.isTextSuggestionSelected();
        }

        TextAttributeCompatApi37Impl(Object obj) {
            this.mObject = (TextAttribute) obj;
        }
    }

    private TextAttributeCompat(TextAttributeCompatImpl textAttributeCompatImpl) {
        this.mImpl = textAttributeCompatImpl;
    }
}
