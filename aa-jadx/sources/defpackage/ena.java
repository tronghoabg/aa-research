package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ena extends android.text.SpannableStringBuilder {
    private final java.lang.Class a;
    private final java.util.List b;

    public ena(java.lang.Class cls, java.lang.CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.b = new java.util.ArrayList();
        defpackage.ebl.r(cls, "watcherClass cannot be null");
        this.a = cls;
    }

    private final defpackage.emz a(java.lang.Object obj) {
        int i = 0;
        while (true) {
            java.util.List list = this.b;
            if (i >= list.size()) {
                return null;
            }
            defpackage.emz emzVar = (defpackage.emz) list.get(i);
            if (emzVar.a == obj) {
                return emzVar;
            }
            i++;
        }
    }

    private final void b() {
        int i = 0;
        while (true) {
            java.util.List list = this.b;
            if (i >= list.size()) {
                return;
            }
            ((defpackage.emz) list.get(i)).b.incrementAndGet();
            i++;
        }
    }

    private final void c() {
        int i = 0;
        while (true) {
            java.util.List list = this.b;
            if (i >= list.size()) {
                return;
            }
            ((defpackage.emz) list.get(i)).b.decrementAndGet();
            i++;
        }
    }

    private final boolean d(java.lang.Class cls) {
        return this.a == cls;
    }

    private final boolean e(java.lang.Object obj) {
        return obj != null && d(obj.getClass());
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* synthetic */ android.text.Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* synthetic */ android.text.Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(java.lang.Object obj) {
        defpackage.emz emzVarA;
        if (e(obj) && (emzVarA = a(obj)) != null) {
            obj = emzVarA;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(java.lang.Object obj) {
        defpackage.emz emzVarA;
        if (e(obj) && (emzVarA = a(obj)) != null) {
            obj = emzVarA;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(java.lang.Object obj) {
        defpackage.emz emzVarA;
        if (e(obj) && (emzVarA = a(obj)) != null) {
            obj = emzVarA;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final java.lang.Object[] getSpans(int i, int i2, java.lang.Class cls) {
        if (!d(cls)) {
            return super.getSpans(i, i2, cls);
        }
        defpackage.emz[] emzVarArr = (defpackage.emz[]) super.getSpans(i, i2, defpackage.emz.class);
        java.lang.Object[] objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, emzVarArr.length);
        for (int i3 = 0; i3 < emzVarArr.length; i3++) {
            objArr[i3] = emzVarArr[i3].a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* synthetic */ android.text.Editable insert(int i, java.lang.CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, java.lang.Class cls) {
        if (cls == null || d(cls)) {
            cls = defpackage.emz.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(java.lang.Object obj) {
        defpackage.emz emzVarA;
        if (e(obj)) {
            emzVarA = a(obj);
            if (emzVarA != null) {
                obj = emzVarA;
            }
        } else {
            emzVarA = null;
        }
        super.removeSpan(obj);
        if (emzVarA != null) {
            this.b.remove(emzVarA);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder replace(int i, int i2, java.lang.CharSequence charSequence) {
        b();
        super.replace(i, i2, charSequence);
        c();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(java.lang.Object obj, int i, int i2, int i3) {
        if (e(obj)) {
            defpackage.emz emzVar = new defpackage.emz(obj);
            this.b.add(emzVar);
            obj = emzVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int i, int i2) {
        return new defpackage.ena(this.a, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder insert(int i, java.lang.CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* synthetic */ java.lang.Appendable append(char c) throws java.io.IOException {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* synthetic */ android.text.Editable insert(int i, java.lang.CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* synthetic */ android.text.Editable append(java.lang.CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder insert(int i, java.lang.CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.SpannableStringBuilder append(java.lang.CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* synthetic */ java.lang.Appendable append(java.lang.CharSequence charSequence) throws java.io.IOException {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* synthetic */ android.text.Editable append(java.lang.CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.SpannableStringBuilder append(java.lang.CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ android.text.Editable replace(int i, int i2, java.lang.CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* synthetic */ java.lang.Appendable append(java.lang.CharSequence charSequence, int i, int i2) throws java.io.IOException {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ android.text.Editable replace(int i, int i2, java.lang.CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final android.text.SpannableStringBuilder append(java.lang.CharSequence charSequence, java.lang.Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder replace(int i, int i2, java.lang.CharSequence charSequence, int i3, int i4) {
        b();
        super.replace(i, i2, charSequence, i3, i4);
        c();
        return this;
    }

    public ena(java.lang.Class cls, java.lang.CharSequence charSequence) {
        super(charSequence);
        this.b = new java.util.ArrayList();
        this.a = cls;
    }
}
