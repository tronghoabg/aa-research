package J9;

import java.util.HashSet;

/* loaded from: classes4.dex */
public final class K implements w8.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f5888c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public HashSet f5889a;

    /* renamed from: b, reason: collision with root package name */
    public volatile w8.a f5890b;

    @Override // w8.a
    public final void c(HashSet hashSet) {
        w8.a aVar = this.f5890b;
        if (aVar == f5888c) {
            return;
        }
        if (aVar != null) {
            aVar.c(hashSet);
        } else {
            synchronized (this) {
                this.f5889a.addAll(hashSet);
            }
        }
    }
}
