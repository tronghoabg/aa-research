package com.android.car.libraries.apphost.external.model;

import androidx.car.app.model.Action;
import androidx.car.app.model.Header;
import defpackage.afbe;
import defpackage.afeu;
import defpackage.affa;
import defpackage.gkh;
import defpackage.rb;
import defpackage.wb;
import j$.util.Objects;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0082\u0004J\n\u0010 \u001a\u00020\u0019H\u0096\u0080\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u0014X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0014X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u0019X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006#"}, d2 = {"Lcom/android/car/libraries/apphost/external/model/MenuTemplate;", "Landroidx/car/app/model/Template;", "<init>", "()V", "builder", "Lcom/android/car/libraries/apphost/external/model/MenuTemplate$Builder;", "(Lcom/android/car/libraries/apphost/external/model/MenuTemplate$Builder;)V", "value", "", "Lcom/android/car/libraries/apphost/external/model/MenuSection;", "sections", "getSections", "()Ljava/util/List;", "Landroidx/car/app/model/Action;", "actions", "getActions", "Landroidx/car/app/model/Header;", "header", "getHeader", "()Landroidx/car/app/model/Header;", "", "isLoading", "()Z", "allowAlphabeticalIndexing", "getAllowAlphabeticalIndexing", "", "scrollStatePersistenceStrategy", "getScrollStatePersistenceStrategy", "()I", "equals", "other", "", "hashCode", "toBuilder", "Builder", "third_party.java_src.android_libs.car.apphost.main.com.android.car.libraries.apphost.external.model_model"}, k = 1, mv = {2, 3, 0}, xi = 48)
@rb
/* loaded from: classes2.dex */
public final class MenuTemplate implements wb {
    private List<Action> actions;
    private boolean allowAlphabeticalIndexing;
    private Header header;
    private boolean isLoading;
    private int scrollStatePersistenceStrategy;
    private List<MenuSection> sections;

    private MenuTemplate(gkh gkhVar) {
        this();
        this.sections = gkhVar.a;
        this.actions = gkhVar.b;
        this.header = gkhVar.c;
        this.isLoading = gkhVar.d;
        this.allowAlphabeticalIndexing = gkhVar.e;
        this.scrollStatePersistenceStrategy = gkhVar.f;
    }

    public boolean equals(Object other) {
        if (!(other instanceof MenuTemplate)) {
            return false;
        }
        MenuTemplate menuTemplate = (MenuTemplate) other;
        return affa.f(this.sections, menuTemplate.sections) && affa.f(this.actions, menuTemplate.actions) && affa.f(this.header, menuTemplate.header) && this.isLoading == menuTemplate.isLoading && this.allowAlphabeticalIndexing == menuTemplate.allowAlphabeticalIndexing && this.scrollStatePersistenceStrategy == menuTemplate.scrollStatePersistenceStrategy;
    }

    public final List<Action> getActions() {
        return this.actions;
    }

    public final boolean getAllowAlphabeticalIndexing() {
        return this.allowAlphabeticalIndexing;
    }

    public final Header getHeader() {
        return this.header;
    }

    public final int getScrollStatePersistenceStrategy() {
        return this.scrollStatePersistenceStrategy;
    }

    public final List<MenuSection> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return Objects.hash(this.sections, this.actions, this.header, Boolean.valueOf(this.isLoading), Integer.valueOf(this.scrollStatePersistenceStrategy));
    }

    /* renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final gkh toBuilder() {
        gkh gkhVar = new gkh();
        gkhVar.b(this.sections);
        gkhVar.a(this.actions);
        gkhVar.c = this.header;
        gkhVar.d = this.isLoading;
        gkhVar.e = this.allowAlphabeticalIndexing;
        gkhVar.f = this.scrollStatePersistenceStrategy;
        return gkhVar;
    }

    public /* synthetic */ MenuTemplate(gkh gkhVar, afeu afeuVar) {
        this(gkhVar);
    }

    private MenuTemplate() {
        afbe afbeVar = afbe.a;
        this.sections = afbeVar;
        this.actions = afbeVar;
    }
}
