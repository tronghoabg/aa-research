package y1;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import j1.AbstractC3076d;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: y1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4533n extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final Class f47953a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f47954b;

    public C4533n(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f47954b = new ArrayList();
        AbstractC3076d.d(cls, "watcherClass cannot be null");
        this.f47953a = cls;
    }

    public final void a() {
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f47954b;
            if (i5 >= arrayList.size()) {
                return;
            }
            ((C4532m) arrayList.get(i5)).f47952b.incrementAndGet();
            i5++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f47954b;
            if (i5 >= arrayList.size()) {
                return;
            }
            ((C4532m) arrayList.get(i5)).onTextChanged(this, 0, length(), length());
            i5++;
        }
    }

    public final C4532m c(Object obj) {
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f47954b;
            if (i5 >= arrayList.size()) {
                return null;
            }
            C4532m c4532m = (C4532m) arrayList.get(i5);
            if (c4532m.f47951a == obj) {
                return c4532m;
            }
            i5++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f47953a == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i5, int i10) {
        super.delete(i5, i10);
        return this;
    }

    public final void e() {
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f47954b;
            if (i5 >= arrayList.size()) {
                return;
            }
            ((C4532m) arrayList.get(i5)).f47952b.decrementAndGet();
            i5++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C4532m c4532mC;
        if (d(obj) && (c4532mC = c(obj)) != null) {
            obj = c4532mC;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C4532m c4532mC;
        if (d(obj) && (c4532mC = c(obj)) != null) {
            obj = c4532mC;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C4532m c4532mC;
        if (d(obj) && (c4532mC = c(obj)) != null) {
            obj = c4532mC;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i5, int i10, Class cls) {
        if (this.f47953a != cls) {
            return super.getSpans(i5, i10, cls);
        }
        C4532m[] c4532mArr = (C4532m[]) super.getSpans(i5, i10, C4532m.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c4532mArr.length);
        for (int i11 = 0; i11 < c4532mArr.length; i11++) {
            objArr[i11] = c4532mArr[i11].f47951a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i5, CharSequence charSequence) {
        super.insert(i5, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i5, int i10, Class cls) {
        if (cls == null || this.f47953a == cls) {
            cls = C4532m.class;
        }
        return super.nextSpanTransition(i5, i10, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C4532m c4532mC;
        if (d(obj)) {
            c4532mC = c(obj);
            if (c4532mC != null) {
                obj = c4532mC;
            }
        } else {
            c4532mC = null;
        }
        super.removeSpan(obj);
        if (c4532mC != null) {
            this.f47954b.remove(c4532mC);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i5, int i10, CharSequence charSequence) {
        replace(i5, i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i5, int i10, int i11) {
        if (d(obj)) {
            C4532m c4532m = new C4532m(obj);
            this.f47954b.add(c4532m);
            obj = c4532m;
        }
        super.setSpan(obj, i5, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i5, int i10) {
        return new C4533n(this.f47953a, this, i5, i10);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i5, int i10) {
        super.delete(i5, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i5, CharSequence charSequence) {
        super.insert(i5, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i5, int i10, CharSequence charSequence, int i11, int i12) {
        replace(i5, i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i5, CharSequence charSequence, int i10, int i11) {
        super.insert(i5, charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i5, int i10, CharSequence charSequence) {
        a();
        super.replace(i5, i10, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i5, CharSequence charSequence, int i10, int i11) {
        super.insert(i5, charSequence, i10, i11);
        return this;
    }

    public C4533n(Class cls, C4533n c4533n, int i5, int i10) {
        super(c4533n, i5, i10);
        this.f47954b = new ArrayList();
        AbstractC3076d.d(cls, "watcherClass cannot be null");
        this.f47953a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i5, int i10, CharSequence charSequence, int i11, int i12) {
        a();
        super.replace(i5, i10, charSequence, i11, i12);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i5, int i10) {
        super.append(charSequence, i5, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i5, int i10) {
        super.append(charSequence, i5, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i5, int i10) {
        super.append(charSequence, i5, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i5) {
        super.append(charSequence, obj, i5);
        return this;
    }
}
