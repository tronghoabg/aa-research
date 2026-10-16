package y1;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import j$.util.stream.IntStream;
import java.util.stream.IntStream;

/* renamed from: y1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4538s implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f47958a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f47959b;

    public C4538s(Spannable spannable) {
        this.f47959b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f47959b;
        if (!this.f47958a) {
            if ((Build.VERSION.SDK_INT < 28 ? new ae.b() : new C4537r()).d(spannable)) {
                this.f47959b = new SpannableString(spannable);
            }
        }
        this.f47958a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i5) {
        return this.f47959b.charAt(i5);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return IntStream.Wrapper.convert(IntStream.VivifiedWrapper.convert(this.f47959b.chars()));
    }

    @Override // java.lang.CharSequence
    public final java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(IntStream.VivifiedWrapper.convert(this.f47959b.codePoints()));
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f47959b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f47959b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f47959b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i5, int i10, Class cls) {
        return this.f47959b.getSpans(i5, i10, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f47959b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i5, int i10, Class cls) {
        return this.f47959b.nextSpanTransition(i5, i10, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f47959b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i5, int i10, int i11) {
        a();
        this.f47959b.setSpan(obj, i5, i10, i11);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i5, int i10) {
        return this.f47959b.subSequence(i5, i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f47959b.toString();
    }

    public C4538s(CharSequence charSequence) {
        this.f47959b = new SpannableString(charSequence);
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream chars() {
        return IntStream.VivifiedWrapper.convert(this.f47959b.chars());
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream codePoints() {
        return IntStream.VivifiedWrapper.convert(this.f47959b.codePoints());
    }
}
