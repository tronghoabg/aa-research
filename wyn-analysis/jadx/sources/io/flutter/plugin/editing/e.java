package io.flutter.plugin.editing;

import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;
import kc.r;
import tc.l;

/* loaded from: classes5.dex */
public final class e extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    public int f37039a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f37040b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f37041c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f37042d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f37043e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public String f37044f;

    /* renamed from: g, reason: collision with root package name */
    public String f37045g;

    /* renamed from: h, reason: collision with root package name */
    public int f37046h;

    /* renamed from: i, reason: collision with root package name */
    public int f37047i;

    /* renamed from: j, reason: collision with root package name */
    public int f37048j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public final c f37049l;

    public e(l lVar, r rVar) {
        this.f37049l = new c(rVar, this);
        if (lVar != null) {
            f(lVar);
        }
    }

    public final void a(d dVar) {
        if (this.f37040b > 0) {
            Log.e("ListenableEditingState", "adding a listener " + dVar.toString() + " in a listener callback");
        }
        if (this.f37039a <= 0) {
            this.f37041c.add(dVar);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f37042d.add(dVar);
        }
    }

    public final void b() {
        this.f37039a++;
        if (this.f37040b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f37039a != 1 || this.f37041c.isEmpty()) {
            return;
        }
        this.f37045g = toString();
        this.f37046h = Selection.getSelectionStart(this);
        this.f37047i = Selection.getSelectionEnd(this);
        this.f37048j = BaseInputConnection.getComposingSpanStart(this);
        this.k = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i5 = this.f37039a;
        if (i5 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f37041c;
        ArrayList arrayList2 = this.f37042d;
        if (i5 == 1) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                this.f37040b++;
                dVar.a(true);
                this.f37040b--;
            }
            if (!arrayList.isEmpty()) {
                String.valueOf(arrayList.size());
                d(!toString().equals(this.f37045g), (this.f37046h == Selection.getSelectionStart(this) && this.f37047i == Selection.getSelectionEnd(this)) ? false : true, (this.f37048j == BaseInputConnection.getComposingSpanStart(this) && this.k == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f37039a--;
    }

    public final void d(boolean z2, boolean z10, boolean z11) {
        if (z2 || z10 || z11) {
            Iterator it = this.f37041c.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                this.f37040b++;
                dVar.a(z2);
                this.f37040b--;
            }
        }
    }

    public final void e(d dVar) {
        if (this.f37040b > 0) {
            Log.e("ListenableEditingState", "removing a listener " + dVar.toString() + " in a listener callback");
        }
        this.f37041c.remove(dVar);
        if (this.f37039a > 0) {
            this.f37042d.remove(dVar);
        }
    }

    public final void f(l lVar) {
        int i5;
        b();
        replace(0, length(), (CharSequence) lVar.f46027a);
        int i10 = lVar.f46028b;
        if (i10 >= 0) {
            Selection.setSelection(this, i10, lVar.f46029c);
        } else {
            Selection.removeSelection(this);
        }
        int i11 = lVar.f46030d;
        if (i11 < 0 || i11 >= (i5 = lVar.f46031e)) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f37049l.setComposingRegion(i11, i5);
        }
        this.f37043e.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i5, int i10, int i11) {
        super.setSpan(obj, i5, i10, i11);
        ArrayList arrayList = this.f37043e;
        String string = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        g gVar = new g();
        gVar.f37058e = selectionStart;
        gVar.f37059f = selectionEnd;
        gVar.f37060g = composingSpanStart;
        gVar.f37061h = composingSpanEnd;
        gVar.f37054a = string;
        gVar.f37055b = "";
        gVar.f37056c = -1;
        gVar.f37057d = -1;
        arrayList.add(gVar);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f37044f;
        if (str != null) {
            return str;
        }
        String string = super.toString();
        this.f37044f = string;
        return string;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i5, int i10, CharSequence charSequence, int i11, int i12) {
        if (this.f37040b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String string = toString();
        int i13 = i10 - i5;
        boolean z2 = i13 != i12 - i11;
        for (int i14 = 0; i14 < i13 && !z2; i14++) {
            z2 |= charAt(i5 + i14) != charSequence.charAt(i11 + i14);
        }
        if (z2) {
            this.f37044f = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder spannableStringBuilderReplace = super.replace(i5, i10, charSequence, i11, i12);
        ArrayList arrayList = this.f37043e;
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        g gVar = new g();
        gVar.f37058e = selectionStart2;
        gVar.f37059f = selectionEnd2;
        gVar.f37060g = composingSpanStart2;
        gVar.f37061h = composingSpanEnd2;
        String string2 = charSequence.toString();
        gVar.f37054a = string;
        gVar.f37055b = string2;
        gVar.f37056c = i5;
        gVar.f37057d = i10;
        arrayList.add(gVar);
        if (this.f37039a > 0) {
            return spannableStringBuilderReplace;
        }
        d(z2, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return spannableStringBuilderReplace;
    }
}
