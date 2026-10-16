package com.android.car.libraries.apphost.external.model;

import defpackage.gjv;
import defpackage.rb;
import defpackage.wb;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public class GoogleTabContents {
    public static final String CONTENT_ID = "TAB_CONTENTS_CONTENT_ID";
    private final wb mTemplate;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, wb] */
    public GoogleTabContents(gjv gjvVar) {
        this.mTemplate = gjvVar.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GoogleTabContents) {
            return Objects.equals(this.mTemplate, ((GoogleTabContents) obj).mTemplate);
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
        return "[template: " + String.valueOf(this.mTemplate) + "]";
    }

    private GoogleTabContents() {
        this.mTemplate = null;
    }
}
