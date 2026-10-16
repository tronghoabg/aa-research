package com.android.billingclient.api;

import j$.util.DesugarCollections;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class InAppMessageParams {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f20012a;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final HashSet f20013a = new HashSet();

        public Builder addAllInAppMessageCategoriesToShow() {
            this.f20013a.add(2);
            return this;
        }

        public Builder addInAppMessageCategoryToShow(int i5) {
            this.f20013a.add(Integer.valueOf(i5));
            return this;
        }

        public InAppMessageParams build() {
            return new InAppMessageParams(this.f20013a);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface InAppMessageCategoryId {
        public static final int TRANSACTIONAL = 2;
        public static final int UNKNOWN_IN_APP_MESSAGE_CATEGORY_ID = 0;
    }

    public /* synthetic */ InAppMessageParams(HashSet hashSet) {
        this.f20012a = new ArrayList(DesugarCollections.unmodifiableList(new ArrayList(hashSet)));
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
