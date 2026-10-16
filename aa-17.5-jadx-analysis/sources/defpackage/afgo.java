package defpackage;

import java.util.Random;

/* loaded from: classes.dex */
public final class afgo extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        return new Random();
    }
}
