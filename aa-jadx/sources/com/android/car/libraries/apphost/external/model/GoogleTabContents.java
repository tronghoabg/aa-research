package com.android.car.libraries.apphost.external.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public class GoogleTabContents {
    public static final java.lang.String CONTENT_ID = "TAB_CONTENTS_CONTENT_ID";
    private final defpackage.wi mTemplate;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, wi] */
    public GoogleTabContents(defpackage.gkc gkcVar) {
        this.mTemplate = gkcVar.a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.android.car.libraries.apphost.external.model.GoogleTabContents) {
            return j$.util.Objects.equals(this.mTemplate, ((com.android.car.libraries.apphost.external.model.GoogleTabContents) obj).mTemplate);
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
        return "[template: " + java.lang.String.valueOf(this.mTemplate) + "]";
    }

    private GoogleTabContents() {
        this.mTemplate = null;
    }
}
