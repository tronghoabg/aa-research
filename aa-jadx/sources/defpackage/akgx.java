package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akgx implements defpackage.akgw {
    private static final java.util.Set a = java.util.Collections.singleton("UTC");

    @Override // defpackage.akgw
    public final java.util.Set a() {
        return a;
    }

    @Override // defpackage.akgw
    public final defpackage.akdl b(java.lang.String str) {
        if ("UTC".equalsIgnoreCase(str)) {
            return defpackage.akdl.a;
        }
        return null;
    }
}
