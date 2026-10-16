package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class CarText {
    private final java.util.List<androidx.car.app.model.CarText.SpanWrapper> mSpans;
    private final java.util.List<java.util.List<androidx.car.app.model.CarText.SpanWrapper>> mSpansForVariants;
    private final java.lang.String mText;
    private final java.util.List<java.lang.String> mTextVariants;

    @defpackage.rg
    public static final class Builder {
        java.lang.CharSequence mText;
        java.util.List<java.lang.CharSequence> mTextVariants = new java.util.ArrayList();

        public Builder(java.lang.CharSequence charSequence) {
            charSequence.getClass();
            this.mText = charSequence;
        }

        public androidx.car.app.model.CarText.Builder addVariant(java.lang.CharSequence charSequence) {
            java.util.List<java.lang.CharSequence> list = this.mTextVariants;
            charSequence.getClass();
            list.add(charSequence);
            return this;
        }

        public androidx.car.app.model.CarText build() {
            return new androidx.car.app.model.CarText(this);
        }
    }

    public CarText(androidx.car.app.model.CarText.Builder builder) {
        this.mText = builder.mText.toString();
        this.mSpans = getSpans(builder.mText);
        java.util.List<java.lang.CharSequence> list = builder.mTextVariants;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            java.lang.CharSequence charSequence = list.get(i);
            arrayList.add(charSequence.toString());
            arrayList2.add(getSpans(charSequence));
        }
        this.mTextVariants = defpackage.tq.b(arrayList);
        this.mSpansForVariants = defpackage.tq.b(arrayList2);
    }

    public static androidx.car.app.model.CarText create(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        return new androidx.car.app.model.CarText(charSequence);
    }

    private static java.lang.CharSequence getCharSequence(java.lang.String str, java.util.List<androidx.car.app.model.CarText.SpanWrapper> list) {
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        for (androidx.car.app.model.CarText.SpanWrapper spanWrapper : defpackage.tq.a(list)) {
            spannableString.setSpan(spanWrapper.getCarSpan(), spanWrapper.getStart(), spanWrapper.getEnd(), spanWrapper.getFlags());
        }
        return spannableString;
    }

    private static java.util.List<androidx.car.app.model.CarText.SpanWrapper> getSpans(java.lang.CharSequence charSequence) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (charSequence instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence;
            for (java.lang.Object obj : spanned.getSpans(0, charSequence.length(), java.lang.Object.class)) {
                if (obj instanceof androidx.car.app.model.CarSpan) {
                    arrayList.add(new androidx.car.app.model.CarText.SpanWrapper(spanned, (androidx.car.app.model.CarSpan) obj));
                }
            }
        }
        return defpackage.tq.b(arrayList);
    }

    public static boolean isNullOrEmpty(androidx.car.app.model.CarText carText) {
        return carText == null || carText.isEmpty();
    }

    public static java.lang.String toShortString(androidx.car.app.model.CarText carText) {
        if (carText == null) {
            return null;
        }
        java.lang.String string = carText.toString();
        if (string.length() <= 16) {
            return string;
        }
        return string.substring(0, 8) + "~" + string.substring(string.length() - 8);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.CarText)) {
            return false;
        }
        androidx.car.app.model.CarText carText = (androidx.car.app.model.CarText) obj;
        return j$.util.Objects.equals(this.mText, carText.mText) && j$.util.Objects.equals(this.mSpans, carText.mSpans) && j$.util.Objects.equals(this.mTextVariants, carText.mTextVariants) && j$.util.Objects.equals(this.mSpansForVariants, carText.mSpansForVariants);
    }

    public java.util.List<java.util.List<androidx.car.app.model.CarText.SpanWrapper>> getSpansForVariants() {
        return this.mSpansForVariants;
    }

    public java.util.List<java.lang.CharSequence> getVariants() {
        if (this.mTextVariants.isEmpty()) {
            return java.util.Collections.EMPTY_LIST;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < this.mTextVariants.size(); i++) {
            arrayList.add(getCharSequence(this.mTextVariants.get(i), this.mSpansForVariants.get(i)));
        }
        return j$.util.DesugarCollections.unmodifiableList(arrayList);
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mText, this.mSpans, this.mTextVariants, this.mSpansForVariants);
    }

    public boolean isEmpty() {
        return this.mText.isEmpty();
    }

    public java.lang.CharSequence toCharSequence() {
        return getCharSequence(this.mText, this.mSpans);
    }

    public java.lang.String toString() {
        return this.mText;
    }

    @defpackage.rg
    public static class SpanWrapper {
        private final androidx.car.app.model.CarSpan mCarSpan;
        private final int mEnd;
        private final int mFlags;
        private final int mStart;

        public SpanWrapper(android.text.Spanned spanned, androidx.car.app.model.CarSpan carSpan) {
            this.mStart = spanned.getSpanStart(carSpan);
            this.mEnd = spanned.getSpanEnd(carSpan);
            this.mFlags = spanned.getSpanFlags(carSpan);
            this.mCarSpan = carSpan;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.car.app.model.CarText.SpanWrapper)) {
                return false;
            }
            androidx.car.app.model.CarText.SpanWrapper spanWrapper = (androidx.car.app.model.CarText.SpanWrapper) obj;
            return this.mStart == spanWrapper.mStart && this.mEnd == spanWrapper.mEnd && this.mFlags == spanWrapper.mFlags && j$.util.Objects.equals(this.mCarSpan, spanWrapper.mCarSpan);
        }

        public androidx.car.app.model.CarSpan getCarSpan() {
            return this.mCarSpan;
        }

        public int getEnd() {
            return this.mEnd;
        }

        public int getFlags() {
            return this.mFlags;
        }

        public int getStart() {
            return this.mStart;
        }

        public int hashCode() {
            return j$.util.Objects.hash(java.lang.Integer.valueOf(this.mStart), java.lang.Integer.valueOf(this.mEnd), java.lang.Integer.valueOf(this.mFlags), this.mCarSpan);
        }

        public java.lang.String toString() {
            return "[" + this.mCarSpan + ": " + this.mStart + ", " + this.mEnd + ", flags: " + this.mFlags + "]";
        }

        SpanWrapper() {
            this.mStart = 0;
            this.mEnd = 0;
            this.mFlags = 0;
            this.mCarSpan = new androidx.car.app.model.CarSpan();
        }
    }

    public java.util.List<androidx.car.app.model.CarText.SpanWrapper> getSpans() {
        return this.mSpans;
    }

    private CarText() {
        this.mText = "";
        this.mSpans = java.util.Collections.EMPTY_LIST;
        this.mTextVariants = java.util.Collections.EMPTY_LIST;
        this.mSpansForVariants = java.util.Collections.EMPTY_LIST;
    }

    public CarText(java.lang.CharSequence charSequence) {
        this.mText = charSequence.toString();
        this.mSpans = getSpans(charSequence);
        this.mTextVariants = java.util.Collections.EMPTY_LIST;
        this.mSpansForVariants = java.util.Collections.EMPTY_LIST;
    }
}
