package defpackage;

import java.util.Random;

/* loaded from: classes.dex */
final class yoz extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return new Random();
    }
}
