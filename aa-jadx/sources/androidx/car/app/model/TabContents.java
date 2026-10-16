package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public class TabContents {
    public static final java.lang.String CONTENT_ID = "TAB_CONTENTS_CONTENT_ID";
    private final defpackage.wi mTemplate;

    TabContents(defpackage.wd wdVar) {
        java.lang.Object obj = wdVar.a;
        this.mTemplate = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.TabContents) {
            return j$.util.Objects.equals(this.mTemplate, ((androidx.car.app.model.TabContents) obj).mTemplate);
        }
        return false;
    }

    public java.lang.String getContentId() {
        return "TAB_CONTENTS_CONTENT_ID";
    }

    public defpackage.wi getTemplate() {
        defpackage.wi wiVar = this.mTemplate;
        wiVar.getClass();
        return wiVar;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mTemplate);
    }

    public java.lang.String toString() {
        return "[template: " + this.mTemplate + "]";
    }

    private TabContents() {
        this.mTemplate = null;
    }
}
