package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes2.dex */
final class psh extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return new ArrayDeque();
    }
}
