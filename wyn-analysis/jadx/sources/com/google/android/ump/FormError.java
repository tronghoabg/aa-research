package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes4.dex */
public class FormError {

    /* renamed from: a, reason: collision with root package name */
    public final int f27276a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27277b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
        public static final int INTERNAL_ERROR = 1;
        public static final int INTERNET_ERROR = 2;
        public static final int INVALID_OPERATION = 3;
        public static final int TIME_OUT = 4;
    }

    public FormError(int i5, @RecentlyNonNull String str) {
        this.f27276a = i5;
        this.f27277b = str;
    }

    public int getErrorCode() {
        return this.f27276a;
    }

    @RecentlyNonNull
    public String getMessage() {
        return this.f27277b;
    }
}
