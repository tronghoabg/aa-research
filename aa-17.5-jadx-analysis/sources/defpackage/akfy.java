package defpackage;

import java.security.PrivilegedAction;

/* loaded from: classes2.dex */
final class akfy implements PrivilegedAction {
    final /* synthetic */ String a;
    final /* synthetic */ akfz b;

    public akfy(akfz akfzVar, String str) {
        this.a = str;
        this.b = akfzVar;
    }

    @Override // java.security.PrivilegedAction
    public final /* bridge */ /* synthetic */ Object run() {
        ClassLoader classLoader = this.b.a;
        String str = this.a;
        return classLoader != null ? classLoader.getResourceAsStream(str) : ClassLoader.getSystemResourceAsStream(str);
    }
}
