package defpackage;

/* loaded from: classes3.dex */
enum vko {
    PROD("navigationsdkusage.googleapis.com"),
    STAGING("staging-navigationsdkusage.sandbox.googleapis.com"),
    AUTOPUSH("autopush-navigationsdkusage.sandbox.googleapis.com"),
    EMPTY("");

    final String e;
    final String f;

    vko(String str) {
        this.e = str;
        this.f = !str.isEmpty() ? a.bq(str, "https://", "/v1:reportUsage") : "";
    }
}
