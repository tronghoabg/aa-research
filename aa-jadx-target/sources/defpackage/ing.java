package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ing extends java.util.Stack {
    @Override // java.util.Vector
    public final synchronized void addElement(java.lang.Object obj) {
        remove(obj);
        super.addElement(obj);
    }
}
