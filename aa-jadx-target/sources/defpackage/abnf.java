package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class abnf<MessageType extends defpackage.abng<MessageType, BuilderType>, BuilderType extends defpackage.abnf<MessageType, BuilderType>> implements defpackage.abpx {
    private static void b(java.util.List list, int i) {
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

    public static void i(java.lang.Iterable iterable, java.util.List list) {
        iterable.getClass();
        if (!(iterable instanceof defpackage.abps)) {
            if (iterable instanceof defpackage.abqf) {
                list.addAll((java.util.Collection) iterable);
                return;
            }
            if (iterable instanceof java.util.Collection) {
                int size = ((java.util.Collection) iterable).size();
                if (list instanceof java.util.ArrayList) {
                    ((java.util.ArrayList) list).ensureCapacity(list.size() + size);
                } else if (list instanceof defpackage.abqh) {
                    ((defpackage.abqh) list).e(list.size() + size);
                }
            }
            int size2 = list.size();
            if (!(iterable instanceof java.util.List) || !(iterable instanceof java.util.RandomAccess)) {
                for (java.lang.Object obj : iterable) {
                    if (obj == null) {
                        b(list, size2);
                    }
                    list.add(obj);
                }
                return;
            }
            java.util.List list2 = (java.util.List) iterable;
            int size3 = list2.size();
            for (int i = 0; i < size3; i++) {
                java.lang.Object obj2 = list2.get(i);
                if (obj2 == null) {
                    b(list, size2);
                }
                list.add(obj2);
            }
            return;
        }
        java.util.List listA = ((defpackage.abps) iterable).a();
        defpackage.abps abpsVar = (defpackage.abps) list;
        int size4 = list.size();
        for (java.lang.Object obj3 : listA) {
            if (obj3 == null) {
                java.lang.String str = "Element at index " + (abpsVar.size() - size4) + " is null.";
                int size5 = abpsVar.size();
                while (true) {
                    size5--;
                    if (size5 < size4) {
                        throw new java.lang.NullPointerException(str);
                    }
                    abpsVar.remove(size5);
                }
            } else if (obj3 instanceof defpackage.abnv) {
                abpsVar.b();
            } else if (obj3 instanceof byte[]) {
                byte[] bArr = (byte[]) obj3;
                int length = bArr.length;
                defpackage.abnv abnvVar = defpackage.abnv.d;
                try {
                    defpackage.abnv.E(bArr, 0, length);
                    abpsVar.b();
                } catch (defpackage.abpp e) {
                    throw new java.lang.AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                }
            } else {
                abpsVar.add((java.lang.String) obj3);
            }
        }
    }

    @Override // 
    /* JADX INFO: renamed from: a */
    public abstract defpackage.abnf clone();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.abpx
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public abstract defpackage.abnf g(defpackage.abng abngVar);

    @Override // defpackage.abpx
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final defpackage.abnf h(byte[] bArr, defpackage.abol abolVar) throws defpackage.abpp {
        return k(bArr, bArr.length, abolVar);
    }

    @Override // defpackage.abpx
    public /* bridge */ /* synthetic */ void j(defpackage.abny abnyVar, defpackage.abol abolVar) throws java.io.IOException {
        throw null;
    }

    public defpackage.abnf k(byte[] bArr, int i, defpackage.abol abolVar) throws defpackage.abpp {
        throw null;
    }

    @Override // defpackage.abpx
    public /* bridge */ /* synthetic */ void l(byte[] bArr, int i, int i2) throws defpackage.abpp {
        throw null;
    }
}
