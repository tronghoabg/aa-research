package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class eil<MessageType extends defpackage.eim<MessageType, BuilderType>, BuilderType extends defpackage.eil<MessageType, BuilderType>> implements defpackage.ekl {
    public static void b(java.util.List list, int i) {
        java.lang.String str = "Element at index " + (list.size() - i) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new java.lang.NullPointerException(str);
            }
            list.remove(size);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract defpackage.eil clone();
}
