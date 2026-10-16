package com.android.car.libraries.apphost.tab.model;

import androidx.car.app.model.Action;
import androidx.car.app.model.TabTemplate;
import defpackage.hgx;
import defpackage.hgy;
import defpackage.rb;
import defpackage.wb;

@rb
/* loaded from: classes2.dex */
public class UnrestrictedTabTemplate implements wb {
    private final wb contents;
    private final Action headerAction;
    private final TabTemplate template;

    private UnrestrictedTabTemplate(hgx hgxVar) {
        Action action = hgxVar.b;
        this.headerAction = null;
        TabTemplate tabTemplate = hgxVar.a;
        this.template = null;
        wb wbVar = hgxVar.c;
        this.contents = null;
    }

    public wb getContents() {
        return this.contents;
    }

    public Action getHeaderAction() {
        return this.headerAction;
    }

    public TabTemplate getInnerTabTemplate() {
        TabTemplate tabTemplate = this.template;
        tabTemplate.getClass();
        return tabTemplate;
    }

    /* synthetic */ UnrestrictedTabTemplate(hgx hgxVar, hgy hgyVar) {
        this(hgxVar);
    }

    private UnrestrictedTabTemplate() {
        this.template = null;
        this.headerAction = null;
        this.contents = null;
    }
}
