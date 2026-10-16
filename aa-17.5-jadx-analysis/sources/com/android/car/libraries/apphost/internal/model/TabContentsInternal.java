package com.android.car.libraries.apphost.internal.model;

import defpackage.affa;
import defpackage.gms;
import defpackage.gmt;
import defpackage.rb;
import defpackage.wb;
import j$.util.Objects;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u0016B\t\b\u0012¢\u0006\u0004\b\u0004\u0010\u0006J\b\u0010\f\u001a\u00020\rH\u0016J\n\u0010\u000e\u001a\u00020\rH\u0096\u0080\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0082\u0004¨\u0006\u0017"}, d2 = {"Lcom/android/car/libraries/apphost/internal/model/TabContentsInternal;", "Landroidx/car/app/model/Content;", "builder", "Lcom/android/car/libraries/apphost/internal/model/TabContentsInternal$Builder;", "<init>", "(Lcom/android/car/libraries/apphost/internal/model/TabContentsInternal$Builder;)V", "()V", "value", "Landroidx/car/app/model/Template;", "template", "getTemplate", "()Landroidx/car/app/model/Template;", "getContentId", "", "toString", "hashCode", "", "equals", "", "other", "", "Builder", "Companion", "third_party.java_src.android_libs.car.apphost.main.com.android.car.libraries.apphost.internal.model_model"}, k = 1, mv = {2, 3, 0}, xi = 48)
@rb
/* loaded from: classes2.dex */
public final class TabContentsInternal {
    public static final String CONTENT_ID = "TAB_CONTENTS_CONTENT_ID";
    public static final gmt Companion = new gmt();
    private wb template;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, wb] */
    public TabContentsInternal(gms gmsVar) {
        gmsVar.getClass();
        this.template = gmsVar.a;
    }

    public boolean equals(Object other) {
        return (other instanceof TabContentsInternal) && affa.f(getTemplate(), ((TabContentsInternal) other).getTemplate());
    }

    public String getContentId() {
        return "TAB_CONTENTS_CONTENT_ID";
    }

    public final wb getTemplate() {
        wb wbVar = this.template;
        if (wbVar != null) {
            return wbVar;
        }
        affa.d("template");
        return null;
    }

    public int hashCode() {
        return Objects.hash(getTemplate());
    }

    public String toString() {
        return "[template: " + getTemplate() + "]";
    }

    private TabContentsInternal() {
    }
}
