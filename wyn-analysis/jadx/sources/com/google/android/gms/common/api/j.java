package com.google.android.gms.common.api;

/* loaded from: classes3.dex */
public class j extends Exception {

    @Deprecated
    protected final Status mStatus;

    public j(Status status) {
        int i5 = status.f26429a;
        String str = status.f26430b;
        str = str == null ? "" : str;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 2 + String.valueOf(str).length());
        sb2.append(i5);
        sb2.append(": ");
        sb2.append(str);
        super(sb2.toString());
        this.mStatus = status;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.f26429a;
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.f26430b;
    }
}
