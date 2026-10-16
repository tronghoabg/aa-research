package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
final class pry extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return new ArrayList();
    }
}
