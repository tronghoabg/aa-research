package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ing extends java.util.Stack {
    @Override // java.util.Vector
    public final synchronized void addElement(java.lang.Object obj) {
        remove(obj);
        super.addElement(obj);
    }
}
