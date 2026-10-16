package defpackage;

import java.util.Stack;

/* loaded from: classes.dex */
public final class imz extends Stack {
    @Override // java.util.Vector
    public final synchronized void addElement(Object obj) {
        remove(obj);
        super.addElement(obj);
    }
}
