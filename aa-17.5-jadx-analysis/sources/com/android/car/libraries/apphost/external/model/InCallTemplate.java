package com.android.car.libraries.apphost.external.model;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import defpackage.gjz;
import defpackage.gka;
import defpackage.rb;
import defpackage.tl;
import defpackage.wb;
import defpackage.we;
import defpackage.wf;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

@rb
/* loaded from: classes2.dex */
public class InCallTemplate implements wb {
    private static final wf ACTIONS_CONSTRAINT;
    private static final wf HEADER_ACTION_CONSTRAINT;
    private static final int MAX_TEXTS_SIZE = 2;
    private final List<Action> mActions;
    private final Header mHeader;
    private final CarIcon mIcon;
    private final boolean mIsLoading;
    private final List<CarText> mTexts;
    private final CarText mTitle;

    static {
        we weVar = new we(wf.a);
        weVar.a(Action.TYPE_APP_ICON);
        weVar.a(Action.TYPE_BACK);
        weVar.a(1);
        HEADER_ACTION_CONSTRAINT = new wf(weVar);
        we weVar2 = new we();
        weVar2.a(1);
        weVar2.c();
        weVar2.d = 5;
        weVar2.f = 0;
        weVar2.b();
        weVar2.i = true;
        ACTIONS_CONSTRAINT = new wf(weVar2);
    }

    private InCallTemplate(gjz gjzVar) {
        Header header = gjzVar.a;
        this.mHeader = null;
        CarIcon carIcon = gjzVar.b;
        this.mIcon = null;
        CarText carText = gjzVar.c;
        this.mTitle = null;
        List list = gjzVar.d;
        this.mTexts = null;
        List list2 = gjzVar.e;
        this.mActions = tl.b(null);
        boolean z = gjzVar.f;
        this.mIsLoading = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InCallTemplate) {
            InCallTemplate inCallTemplate = (InCallTemplate) obj;
            if (Objects.equals(this.mHeader, inCallTemplate.mHeader) && Objects.equals(this.mIcon, inCallTemplate.mIcon) && Objects.equals(this.mTitle, inCallTemplate.mTitle) && Objects.equals(this.mTexts, inCallTemplate.mTexts) && Objects.equals(this.mActions, inCallTemplate.mActions) && this.mIsLoading == inCallTemplate.mIsLoading) {
                return true;
            }
        }
        return false;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public List<CarText> getTexts() {
        return this.mTexts;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mHeader, this.mIcon, this.mTitle, this.mTexts, this.mActions, Boolean.valueOf(this.mIsLoading));
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "InCallTemplate";
    }

    private InCallTemplate() {
        this.mHeader = null;
        this.mIcon = null;
        this.mTitle = null;
        this.mTexts = Collections.EMPTY_LIST;
        this.mActions = Collections.EMPTY_LIST;
        this.mIsLoading = false;
    }

    /* synthetic */ InCallTemplate(gjz gjzVar, gka gkaVar) {
        this(gjzVar);
    }
}
