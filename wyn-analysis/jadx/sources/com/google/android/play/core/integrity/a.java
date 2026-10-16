package com.google.android.play.core.integrity;

/* loaded from: classes4.dex */
final class a extends ap {

    /* renamed from: a, reason: collision with root package name */
    private String f27128a;

    /* renamed from: b, reason: collision with root package name */
    private y f27129b;

    @Override // com.google.android.play.core.integrity.ap
    public final ap a(y yVar) {
        this.f27129b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final ap b(String str) {
        this.f27128a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final aq c() {
        y yVar;
        String str = this.f27128a;
        if (str != null && (yVar = this.f27129b) != null) {
            return new aq(str, yVar);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f27128a == null) {
            sb2.append(" token");
        }
        if (this.f27129b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
