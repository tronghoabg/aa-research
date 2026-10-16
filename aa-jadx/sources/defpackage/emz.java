package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class emz implements android.text.TextWatcher, android.text.SpanWatcher {
    final java.lang.Object a;
    public final java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger(0);

    public emz(java.lang.Object obj) {
        this.a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        ((android.text.TextWatcher) this.a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        ((android.text.TextWatcher) this.a).beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(android.text.Spannable spannable, java.lang.Object obj, int i, int i2) {
        if (this.b.get() <= 0 || !(obj instanceof defpackage.emy)) {
            ((android.text.SpanWatcher) this.a).onSpanAdded(spannable, obj, i, i2);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(android.text.Spannable spannable, java.lang.Object obj, int i, int i2, int i3, int i4) {
        if (this.b.get() <= 0 || !(obj instanceof defpackage.emy)) {
            ((android.text.SpanWatcher) this.a).onSpanChanged(spannable, obj, i, i2, i3, i4);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(android.text.Spannable spannable, java.lang.Object obj, int i, int i2) {
        if (this.b.get() <= 0 || !(obj instanceof defpackage.emy)) {
            ((android.text.SpanWatcher) this.a).onSpanRemoved(spannable, obj, i, i2);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        ((android.text.TextWatcher) this.a).onTextChanged(charSequence, i, i2, i3);
    }
}
