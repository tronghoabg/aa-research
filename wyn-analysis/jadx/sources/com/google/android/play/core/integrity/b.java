package com.google.android.play.core.integrity;

/* loaded from: classes4.dex */
final class b extends bq {

    /* renamed from: a, reason: collision with root package name */
    private String f27181a;

    /* renamed from: b, reason: collision with root package name */
    private y f27182b;

    @Override // com.google.android.play.core.integrity.bq
    public final bq a(y yVar) {
        this.f27182b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final bq b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f27181a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final br c() {
        y yVar;
        String str = this.f27181a;
        if (str != null && (yVar = this.f27182b) != null) {
            return new br(str, yVar);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f27181a == null) {
            sb2.append(" token");
        }
        if (this.f27182b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
