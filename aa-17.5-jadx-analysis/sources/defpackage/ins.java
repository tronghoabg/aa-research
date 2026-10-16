package defpackage;

import android.view.inputmethod.EditorInfo;

/* loaded from: classes2.dex */
public final class ins {
    public final rml a;
    public final EditorInfo b;
    public final ing c;

    public ins(rml rmlVar, EditorInfo editorInfo, ing ingVar) {
        if (rmlVar == null) {
            throw new NullPointerException("Null inputConnection");
        }
        this.a = rmlVar;
        if (editorInfo == null) {
            throw new NullPointerException("Null editorInfo");
        }
        this.b = editorInfo;
        this.c = ingVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ins) {
            ins insVar = (ins) obj;
            if (this.a.equals(insVar.a) && this.b.equals(insVar.b) && this.c.equals(insVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        ing ingVar = this.c;
        EditorInfo editorInfo = this.b;
        return "ImeInputInfo{inputConnection=" + this.a.toString() + ", editorInfo=" + editorInfo.toString() + ", activityManager=" + ingVar.toString() + "}";
    }

    protected ins() {
        throw null;
    }
}
