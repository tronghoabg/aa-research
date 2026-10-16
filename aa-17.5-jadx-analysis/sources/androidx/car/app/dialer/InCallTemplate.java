package androidx.car.app.dialer;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import defpackage.rb;
import defpackage.rd;
import defpackage.re;
import defpackage.tl;
import defpackage.wb;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

@rb
/* loaded from: classes2.dex */
public class InCallTemplate implements wb {
    private static final int MAX_TEXTS_SIZE = 2;
    private final List<Action> mActions;
    private final Header mHeader;
    private final CarIcon mIcon;
    private final boolean mIsLoading;
    private final List<CarText> mTexts;
    private final CarText mTitle;

    private InCallTemplate(rd rdVar) {
        Header header = rdVar.c;
        this.mHeader = null;
        CarIcon carIcon = rdVar.d;
        this.mIcon = null;
        CarText carText = rdVar.e;
        this.mTitle = null;
        List list = rdVar.a;
        this.mTexts = null;
        List list2 = rdVar.b;
        this.mActions = tl.b(null);
        boolean z = rdVar.f;
        this.mIsLoading = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InCallTemplate)) {
            return false;
        }
        InCallTemplate inCallTemplate = (InCallTemplate) obj;
        return Objects.equals(this.mHeader, inCallTemplate.mHeader) && Objects.equals(this.mIcon, inCallTemplate.mIcon) && Objects.equals(this.mTitle, inCallTemplate.mTitle) && Objects.equals(this.mTexts, inCallTemplate.mTexts) && Objects.equals(this.mActions, inCallTemplate.mActions) && this.mIsLoading == inCallTemplate.mIsLoading;
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

    /* synthetic */ InCallTemplate(rd rdVar, re reVar) {
        this(rdVar);
    }
}
