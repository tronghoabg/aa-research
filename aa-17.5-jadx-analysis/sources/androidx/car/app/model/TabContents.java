package androidx.car.app.model;

import defpackage.rb;
import defpackage.vw;
import defpackage.wb;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public class TabContents {
    public static final String CONTENT_ID = "TAB_CONTENTS_CONTENT_ID";
    private final wb mTemplate;

    TabContents(vw vwVar) {
        Object obj = vwVar.a;
        this.mTemplate = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TabContents) {
            return Objects.equals(this.mTemplate, ((TabContents) obj).mTemplate);
        }
        return false;
    }

    public String getContentId() {
        return "TAB_CONTENTS_CONTENT_ID";
    }

    public wb getTemplate() {
        wb wbVar = this.mTemplate;
        wbVar.getClass();
        return wbVar;
    }

    public int hashCode() {
        return Objects.hash(this.mTemplate);
    }

    public String toString() {
        return "[template: " + this.mTemplate + "]";
    }

    private TabContents() {
        this.mTemplate = null;
    }
}
