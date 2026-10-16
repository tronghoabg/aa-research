package com.android.car.libraries.apphost.internal.model;

import androidx.car.app.model.Action;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.SectionedItemList;
import defpackage.afbe;
import defpackage.afeu;
import defpackage.affa;
import defpackage.gmm;
import defpackage.gmn;
import defpackage.rb;
import defpackage.wb;
import defpackage.yfq;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 )B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003BK\b\u0016\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0002\u0010\u000fJ\n\u0010\u001d\u001a\u00020\u001eH\u0096\u0080\u0004J\u0014\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0082\u0004JH\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eJ\n\u0010#\u001a\u00020$H\u0096\u0080\u0004J\b\u0010%\u001a\u00020&H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0014R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0086$¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\t8FX\u0086\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lcom/android/car/libraries/apphost/internal/model/GoogleListTemplate;", "Landroidx/car/app/model/Template;", "<init>", "()V", "isLoading", "", "singleList", "Landroidx/car/app/model/ItemList;", "mSectionedLists", "", "Landroidx/car/app/model/SectionedItemList;", "actions", "Landroidx/car/app/model/Action;", "header", "Landroidx/car/app/model/Header;", "(ZLandroidx/car/app/model/ItemList;Ljava/util/List;Ljava/util/List;Landroidx/car/app/model/Header;)V", "builder", "Lcom/android/car/libraries/apphost/internal/model/GoogleListTemplate$Builder;", "(Lcom/android/car/libraries/apphost/internal/model/GoogleListTemplate$Builder;)V", "value", "()Z", "getSingleList", "()Landroidx/car/app/model/ItemList;", "getActions", "()Ljava/util/List;", "sectionedLists", "getSectionedLists", "getHeader", "()Landroidx/car/app/model/Header;", "hashCode", "", "equals", "other", "", "copy", "toString", "", "validate", "", "toBuilder", "Builder", "Companion", "third_party.java_src.android_libs.car.apphost.main.com.android.car.libraries.apphost.internal.model_model"}, k = 1, mv = {2, 3, 0}, xi = 48)
@rb
/* loaded from: classes2.dex */
public final class GoogleListTemplate implements wb {
    public static final gmn Companion = new gmn();
    private List<Action> actions;
    private Header header;
    private boolean isLoading;
    private List<SectionedItemList> mSectionedLists;
    private ItemList singleList;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GoogleListTemplate(boolean z, ItemList itemList, List list, List list2, Header header, int i, afeu afeuVar) {
        List list3 = (i & 4) != 0 ? afbe.a : list;
        List list4 = (i & 8) != 0 ? afbe.a : list2;
        int i2 = i & 1;
        ItemList itemList2 = (i & 2) != 0 ? null : itemList;
        int i3 = (z ? 1 : 0) & (i2 ^ 1);
        this(1 == i3, itemList2, list3, list4, (i & 16) != 0 ? null : header);
    }

    public static /* synthetic */ GoogleListTemplate copy$default(GoogleListTemplate googleListTemplate, boolean z, ItemList itemList, List list, List list2, Header header, int i, Object obj) {
        if ((i & 1) != 0) {
            z = googleListTemplate.isLoading;
        }
        if ((i & 2) != 0) {
            itemList = googleListTemplate.singleList;
        }
        if ((i & 4) != 0 && (list = googleListTemplate.mSectionedLists) == null) {
            affa.d("mSectionedLists");
            list = null;
        }
        if ((i & 8) != 0) {
            list2 = googleListTemplate.getActions();
        }
        if ((i & 16) != 0) {
            header = googleListTemplate.header;
        }
        Header header2 = header;
        return googleListTemplate.copy(z, itemList, list, list2, header2);
    }

    public static final GoogleListTemplate fromExternalTemplate(ListTemplate listTemplate) {
        listTemplate.getClass();
        boolean zIsLoading = listTemplate.isLoading();
        ItemList singleList = listTemplate.getSingleList();
        List<SectionedItemList> sectionedLists = listTemplate.getSectionedLists();
        sectionedLists.getClass();
        List<Action> actions = listTemplate.getActions();
        actions.getClass();
        return new GoogleListTemplate(zIsLoading, singleList, sectionedLists, actions, listTemplate.getHeader());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void validate() {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.car.libraries.apphost.internal.model.GoogleListTemplate.validate():void");
    }

    public final GoogleListTemplate copy(boolean isLoading, ItemList singleList, List<SectionedItemList> mSectionedLists, List<Action> actions, Header header) {
        mSectionedLists.getClass();
        actions.getClass();
        return new GoogleListTemplate(isLoading, singleList, mSectionedLists, actions, header);
    }

    public boolean equals(Object other) {
        if (!(other instanceof GoogleListTemplate)) {
            return false;
        }
        GoogleListTemplate googleListTemplate = (GoogleListTemplate) other;
        if (googleListTemplate.isLoading != this.isLoading || !affa.f(googleListTemplate.singleList, this.singleList)) {
            return false;
        }
        List<SectionedItemList> list = googleListTemplate.mSectionedLists;
        List<SectionedItemList> list2 = null;
        if (list == null) {
            affa.d("mSectionedLists");
            list = null;
        }
        List<SectionedItemList> list3 = this.mSectionedLists;
        if (list3 == null) {
            affa.d("mSectionedLists");
        } else {
            list2 = list3;
        }
        return affa.f(list, list2) && affa.f(googleListTemplate.getActions(), getActions()) && affa.f(googleListTemplate.header, this.header);
    }

    public final List<Action> getActions() {
        List<Action> list = this.actions;
        if (list != null) {
            return list;
        }
        affa.d("actions");
        return null;
    }

    public final Header getHeader() {
        return this.header;
    }

    public final List<SectionedItemList> getSectionedLists() {
        List<SectionedItemList> list = this.mSectionedLists;
        if (list == null) {
            affa.d("mSectionedLists");
            list = null;
        }
        return list.isEmpty() ? new ArrayList() : list;
    }

    public final ItemList getSingleList() {
        return this.singleList;
    }

    public int hashCode() {
        Boolean boolValueOf = Boolean.valueOf(this.isLoading);
        ItemList itemList = this.singleList;
        List<SectionedItemList> list = this.mSectionedLists;
        if (list == null) {
            affa.d("mSectionedLists");
            list = null;
        }
        return Objects.hash(boolValueOf, itemList, list, getActions(), this.header);
    }

    /* renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final gmm toBuilder() {
        return new gmm(this);
    }

    public String toString() {
        return "ListTemplate";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GoogleListTemplate(gmm gmmVar) {
        gmmVar.getClass();
        boolean z = gmmVar.a;
        ItemList itemList = gmmVar.b;
        yfq yfqVarO = yfq.o(gmmVar.c);
        yfqVarO.getClass();
        yfq yfqVarO2 = yfq.o(gmmVar.d);
        yfqVarO2.getClass();
        this(z, itemList, yfqVarO, yfqVarO2, gmmVar.e);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleListTemplate(boolean z, ItemList itemList, List<SectionedItemList> list, List<Action> list2, Header header) {
        this();
        list.getClass();
        list2.getClass();
        this.isLoading = z;
        this.singleList = itemList;
        this.mSectionedLists = list;
        this.actions = list2;
        this.header = header;
        validate();
    }

    private GoogleListTemplate() {
    }
}
